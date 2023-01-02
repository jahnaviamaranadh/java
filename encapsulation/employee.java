public class Employee
{
    private int eid;
    private String ename;

    public int geteid()
    {
        return eid;
    }
    public void seteid(int eid)
    {
        this.eid=eid;
    }
    public String getename()
    {
        return ename;
    }
    public void setename(String ename)
    {
        this.ename=ename;
    }
public static void main(String[] args)
{
        Employee e1=new Employee();
        e1.seteid(101);
        e1.setename("Rahul Gandhi");
        System.out.println(e1.geteid());
        System.out.println(e1.getename());

        Employee e2=new Employee();
        e2.seteid(102);
        e2.setename("Sonia");
        System.out.println(e2.geteid());
        System.out.println(e2.getename());
}
}
