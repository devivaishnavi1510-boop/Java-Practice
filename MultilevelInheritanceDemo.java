
class GrandParent{
    void house(){
        System.out.println("GrandParent has a house");
    }
}
class Parent extends GrandParent{
    void business(){
        System.out.println("Parent has a business");
    }
}
class Child extends Parent{
    void education(){
        System.out.println("computers");
    }
}
class MultilevelInheritanceDemo{
    public static void main(String []args){
        Child c = new Child();
        c.house();
        c.business();
        c.education();
    }
    
}