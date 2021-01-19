package project01;

public class CustomerView {

    private CustomerList customers = new CustomerList(10);

    public void enterMainMenu() {

    }

    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------\n");
        System.out.print("姓名：");
        String name = CMUtility.readString(4, "无名");
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone_number = CMUtility.readString(12, "无电话");
        System.out.print("邮箱：");
        String mail = CMUtility.readString(15, "无邮箱");
        System.out.println("---------------------添加完成---------------------");
        Customer customer = new Customer(customers.getAllCustomers().length, name, gender, age, phone_number, mail);
        customers.addCustomer(customer);
    }

    private void modifyCustomer() {
        System.out.println("---------------------添加客户---------------------\n");
        System.out.print("请选择待修改客户编号(-1退出)：");
        int id = CMUtility.readInt(-1);
        Customer customer = customers.getCustomer(id);
        System.out.print("姓名：(" + customer.getName() + ")");
        String name = CMUtility.readString(4, customer.getName());
        System.out.print("性别：(" + customer.getGender() + ")：");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.print("年龄：(" + customer.getAge() + ")：");
        int age = CMUtility.readInt(customer.getAge());
        System.out.print("电话：(" + customer.getPhone() + ")：");
        String phone = CMUtility.readString(12, customer.getPhone());
        System.out.print("邮箱：(" + customer.getEmail() + ")：");
        String mail = CMUtility.readString(12, customer.getEmail());
        System.out.println("---------------------修改完成---------------------");
        customers.replaceCustomer(id, new Customer(id, name, gender, age, phone, mail));
    }

    private void deleteCustomer(){
        System.out.println("---------------------删除客户--------------------- ");
        System.out.println("请选择待删除客户编号(-1退出)：");
        int index=CMUtility.readInt(-1);
        customers.deleteCustomer(index);
    }
}
