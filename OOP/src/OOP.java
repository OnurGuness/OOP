//import java.util.ArrayList;
//import java.util.List;



public class OOP {
    public static void main(String[] args) {
     
        Student s = new Student();
        System.out.println(s.get_verified());
        s.set_membership("Gold");
        System.out.println(s.get_membership());

    //    User u = new User();
    //    u.set_name("Caleb");
    /*  User.admins = new ArrayList<User>();
        User.admins.add(new User("Caleb"));
        User.admins.add(new User("You"));
        User.admins.add(new User("Sally"));

        User.print_admin_names();

    */    
    
    
    /*    for(int i = 0; i<User.admins.size();i++){
            System.out.println(User.admins.get(i).get_name());
        }
        for(User u : User.admins){
            System.out.println(u.get_name());
        }
    */
    //System.out.println(users.get(0).get_name());
    //System.out.println(u.equals(u2));
    // System.out.println(u2.get_membership());
    }
}