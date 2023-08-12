class Employee
{
    private int eID;
    public void setID(int id)
    {
        eID=id;
    }
    public int getID()
    {
        return eID;
    }
}
class Company
{
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setID(100);
        System.out.println(obj.getID());
    }
}