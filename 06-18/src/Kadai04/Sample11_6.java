package Kadai04;

public class Sample11_6 {
    public static void main(String args[])
    {
        Company cmp = new Company();
        Driver dr1 = new Driver(cmp);
        Driver dr2 = new Driver(cmp);
        Driver dr3 = new Driver(cmp);
        Driver dr4 = new Driver(cmp);
        dr1.start();
        dr2.start();
        dr3.start();
        dr4.start();
    }
}
