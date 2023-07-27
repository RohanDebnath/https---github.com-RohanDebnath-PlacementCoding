interface customerRohan {
    int amt = 5; // public + static + final;
    void purchase();// public + abstract
}
class seller implements customerRohan {

    public void purchase() {
        System.out.println("Rohan will buy " + amt + " kg of chocolate");
    }
}
class InterfaceVariables {
    public static void main(String[] args) {
        customerRohan obj = new seller();
        obj.purchase();
        System.out.println(seller.amt); // Directly accessed by class name
        System.out.println(customerRohan.amt); // Directly accessed by interface name
    }
}
