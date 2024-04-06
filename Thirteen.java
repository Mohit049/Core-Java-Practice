public class Thirteen {
    public static void main(String[] args) throws ClassNotFoundException {
//How to load a class 
// Class.forName("Ok");-- this loads class

        //
        // static variables are shared by all objects

        // please note -- static varables should be called by class name , not by object name ( this gives warning so avoid it )
  
//   we can use static variable inside a non-static method
// by static we are making something a class member not a object member
Ok ss=new Ok();
       ss.show(20);
       Ok.show();
//but we can't use a non static variable inside a static method but indirectly we can do it by passing reference of object
    }
    
}

class Ok{

    int a=50;

public void show(int a){
    System.out.println("1st fn");
}
public static void show(){
    System.out.println("2nd fn");
}

}
