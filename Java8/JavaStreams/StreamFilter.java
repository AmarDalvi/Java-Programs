package JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {

//        filter product which has price 25k

//        without using stream api
        List<Product> list =  new ArrayList<>();
        for(Product product : getproducts()){
            if(product.getPrice()>25000f){
                list.add(product);
            }
        }
        for(Product product : list){
            System.out.println(product);
        }
        System.out.println("_______________________________________");
//        __________________________________________________________

//        Using stream api
        List<Product> list2 =getproducts().stream().filter((product)->product.getPrice()>25000f).collect(Collectors.toList());
        list2.forEach(System.out::println);

        System.out.println("_______________________________________");
//        if no need of storing
        getproducts().stream().filter((product -> product.getPrice()>25000f)).forEach(System.out::println);

    }

    private static List<Product> getproducts(){
        List<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product(1,"HP",25000f));
        productsList.add(new Product(2,"Dell",30000f));
        productsList.add(new Product(3,"Lenovo",55000f));
        productsList.add(new Product(4,"Sony",40000f));
        productsList.add(new Product(5,"Apple",60000f));
        return productsList;
    }
}

class Product{
    private int id;
    private String name;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
