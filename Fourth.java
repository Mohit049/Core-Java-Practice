public class Fourth {

    public static void main (String a[]){

        int x=4;

      
        if(false)

        System.out.println("You're in if part");

        else
        System.out.println("You're in else part");


        boolean k=(2>3);
        System.out.println(k);


        //ternary operator
 //String  m= (x%2!=0) ? System.out.println("First condtion"):System.out.println("Second condition"); -- this is wrong  
 
 //note--  System.out.println( );  returns void so don't  use it in ternary operators sa above opeation gives error

 boolean m= x>1?true:false;
 System.out.println(m);

 //switch statement

 switch (10) {
    case 3,4 -> System.out.println("number is one");
       
 
        
    default ->System.out.println("idk"); // result will be bit different cause we are not using break here
        
    case 2->System.out.println("number is 2");
        // new type of writing switch using -> 
 }
}
}
