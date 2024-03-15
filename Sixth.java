 public class Sixth {

public static void main(String[] args) {

    // int a=200;
    // byte b=(byte)a;
    
                Demo ok= new Demo();

                String sk=ok.sass(7);
              System.out.println(sk);
              ok.ready();
}


 }

 class  Demo{


public String  sass(int money){
    if(money>=10)
    {
        
    return "You can buy";
       
    }
    else

    return "Sorry give me more money";
}

public void ready(){
    System.out.println("Visit Again");
}

 }