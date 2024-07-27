package JavaStreams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* Demo for map and collect in stream api
    Map user class to userDTO such that password is not send to userDTO

 */
public class StreamMapCollectDemo {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User(1,"secrete","Amar","amar@gmail.com"));
        users.add(new User(2,"secrete","Yash","yash@gmail.com"));
        users.add(new User(3,"secrete","Kunal","kunal@gmail.com"));
        users.add(new User(4,"secrete","Vaishnavi","vaishnavi@gmail.com"));

//        traditional method to convert user to userDTO
        List<UserDTO> usersDTO = new ArrayList<UserDTO>();
        for(User user : users){
            usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
        }

        for(UserDTO userDTO : usersDTO){
            System.out.println(userDTO);
        }
        System.out.println("_______________________________________");
//        using Stream().map() method
        List<UserDTO> userDTOS2 = users.stream().map(new Function<User, UserDTO>() {
            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(),user.getUserName(),user.getEmail());
            }
        }).collect(Collectors.toList());
        System.out.println(userDTOS2);
        System.out.println("_______________________________________"); 

//        using lambda expression for functional interface
        users.stream().map((User user) -> new UserDTO(user.getId(),user.getUserName(),user.getEmail())).forEach((userDTO -> System.out.println(userDTO)));
        System.out.println("_______________________________________");

    }
}

class UserDTO{
    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



class User{
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String password, String userName, String email) {
        this.id = id;
        this.password = password;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
