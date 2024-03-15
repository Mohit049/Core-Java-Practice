class Fifth{

public static void main(String a[]){
    int x=0;

            while(x<5 ){
                System.out.println("------hey-------");

                int j=0;
                while(j<3){
                    System.out.println("hello");
                    j++;

                }
                x++; 
            }

            do{ //used when you wanna run the code atleast once even if the condition is false

                System.out.println("this is a do while loop "+x);
                x++;

            }while (x<4) ;
                    
                

            //for loop
            for(int i=0;i<5;i++){
                System.out.println("    " + i+1);
            }
            //sometimes print statement treats a number like a string when there are other strings too for ex in above code
           
            

            for(int i=1;i<=7;i++){
                System.out.println("-----Day "+i+"-----");
                
                for(int h=0;h<24;h++){
                    System.out.println(h+" : 00 hr");
                  
               }
            }
            


}




}

//useful vs code keyoard shortcut --


//--- ctrl +shift + l ---  to get multiple cursor at words present multple times

//mouse click + alt and then click wherever you want multiple cursors to be