class A 
{
    int i, j;
    
    void showij()
    {
        System.out.println("i and j:" + i +""+j);
    }
}
class B extends A
{
    int k;
    void showk()
    {
        System.out.println("k:" +k);
    }
    void sum(){
        System.out.println("i+j+k"+ (i+j+k));
    }
}
public class InheritanceDemo{
    public static void main(String args[]){
        A superObj= new A();
        B subObj= new B();
        superObj.i=98;
        superObj.j=78;
        superObj.showij();
        subObj.k=67;
        subObj.showk();
        subObj.sum();
        subObj.i=78;
        subObj.j=65;
        subObj.showij();
    }
}