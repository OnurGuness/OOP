public class Main {
    public static void main(String[] args) {

        CompanyName companyName = CompanyName.APPLE;
        Employee employee1 = new Employee(15, "Mike");
        Employee employee2 = new Employee(4545, "Susan");
        Employee employee3 = new Employee(7878, "John");

        Employee[] employees = {employee1,employee2,employee3};
        Company company = new Company(companyName,employees);
        company.printAllEmployees();
        company.printIdOfAllEmployees();
        //System.out.println(company.getCompanyName());
    }
}