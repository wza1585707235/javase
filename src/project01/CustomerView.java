package project01;

public class CustomerView {

    private CustomerList customers = new CustomerList(10);

    public void enterMainMenu() {
        while (true){
            System.out.println("-----------------客户信息管理软件-----------------" +
                    "\n" +
                    "                            1 添 加 客 户\n" +
                    "                            2 修 改 客 户\n" +
                    "                            3 删 除 客 户\n" +
                    "                            4 客 户 列 表\n" +
                    "                            5 退           出\n" +
                    "\n" +
                    "                            请选择(1-5)：_");
            int number=CMUtility.readInt(5);
            switch (number){
                case 1:
                    addNewCustomer();
                    break;
                case 2:
                    modifyCustomer();
                    break;
                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    listAllCustomers();
                    break;
                default:
                    break;
            }
        }
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
        Customer customer = new Customer(name, gender, age, phone_number, mail);
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
        customers.replaceCustomer(id, new Customer(name, gender, age, phone, mail));
    }

    private void deleteCustomer(){
        System.out.println("---------------------删除客户--------------------- ");
        System.out.println("请选择待删除客户编号(-1退出)：");
        int index=CMUtility.readInt(-1);
        System.out.println("确认是否删除(Y/N)：");
        char res=CMUtility.readConfirmSelection();
        if (res=='Y'||res=='y'){
            customers.deleteCustomer(index);
        }
        System.out.println("---------------------删除完成---------------------\n");
    }
    private void listAllCustomers(){
        System.out.println("---------------------------客户列表---------------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
        Customer[] list=customers.getAllCustomers();
        for (Customer customer : list) {
            System.out.println(customer.getId()+"\t\t"+customer.getName()+"\t\t"+customer.getGender()+"\t\t"+customer.getAge()
            +"\t\t"+customer.getPhone()+"\t\t"+customer.getEmail());
        }
        System.out.println("-------------------------客户列表完成-------------------------\n");
    }
}
