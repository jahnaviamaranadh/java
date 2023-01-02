class one{

    static String org_Name="TCS";
    int esal  = 45000;

    public static void main(String[] args){
       one t1=new one();
       one t2=new one();

       t2.esal = 55000;

       System.out.println(org_Name);
       System.out.println(one.org_Name);
       System.out.println(t1.org_Name);
       System.out.println(t2.org_Name);

       t2.org_Name = "Tata ELXI";

       System.out.println(t1.org_Name);
       System.out.println(t2.org_Name);

    }
}