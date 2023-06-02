public class Main {
    public static void main(String[] args) {

        Department department = new CseDepartment();
        int departmentSize = department.getDepartmentSize();
        System.out.println("Department Size=" + departmentSize);


        Product product = new Product();
        double productPrice = product.getPrice(5);
        System.out.println("Product Price =" + productPrice);

        // Run Time Runtime Polymorphism
        Animal animal = new LionAnimal();
        animal.display();
    }
}