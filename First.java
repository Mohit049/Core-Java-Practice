// Project is a combination of files and libraries


// Jshell is a command line interface for Java
//  To use it type jshell and to exit the command line type --- /exit

//To clear screen in jshell -- ctrl +l

class  First 
{

//Use Tab for better indentation -- first select that code and then hit tab
            public static void main(String  a[])
            {
                //Declaring a variable
                int num=20;
                // int has different types like -- byte,short,int ,long
                //Note -- in case of long you should have L at the end to specify that it is long
                long loo=52325700000L;

                System.out.println("This is my first Java program ");
                System.out.println("Integer value : "+num);

                System.out.println("Long value : "+loo);
                double dee=5.6; //Takes 8 bytes
                System.out.println("Double : "+dee);
                float fee=5.6f;  // here it is compulsory to write f at the end of a value so that it tells that this thing is float
                System.out.println("Float : "+fee);


                // in java char takes 2 bytes and it follows UNICODE  not ASCII
                char che='d'; //Chracters are written inside single quotes
                System.out.println("Character : "+che);

                //boolean here is written as true or false not 0 or 1 , like in other languages
                boolean bool=true;
                System.out.println("Boolean value : "+bool);
            }
        }


        //0b101 --- is a binary number  (0b is used to specify that it is a binary number)

        //0x7E --- is a hexadecimal number