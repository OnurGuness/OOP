public class Company {
   private Employee[] employees;
   private CompanyName companyName;

    Company(CompanyName companyName,Employee[] employees)
    {
        this.companyName = companyName;
        this.employees = employees;
    }
    public CompanyName getCompanyName(){
        return companyName;
    }

    public void printAllEmployees(){
        for(Employee e : employees)
            System.out.println(e.getName());
    }

    public void printIdOfAllEmployees(){
        for(Employee e : employees)
            System.out.println(e.getId());
    }
}
