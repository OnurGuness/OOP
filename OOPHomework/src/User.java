public class User extends Consumer{
    boolean loginStatus = false;
    private String userName;
    private String password;
    public User(int id,String firstName,String lastName,String userName,String password){
        super(id,firstName,lastName);
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean checkPassword(String password) {
        return true;
    }
}
