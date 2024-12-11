package org.pk;
public class Main extends K{
    public void m(){
        super.ma();
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.m();
    }
}
class  K{
    protected void ma(){
        System.out.println("hi");
    }
}