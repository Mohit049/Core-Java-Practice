public class Ten {

    // ARRAY OF OBJECTS

    public static void main(String[] args) {

        Stu s1=new Stu()
;
        s1.roll=1;
        s1.marks=90;
        s1.name="Vishal";   
        
        Stu s2=new Stu();
        s2.roll=2;
        s2.marks=80;
        s2.name="Rohit";

        Stu s3=new Stu();
        s3.roll=3;
        s3.marks=67;
        s3.name="Akash";


        Stu student[]=new Stu[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        // for(int i=0;i<3;i++){
         

            // System.out.println(student[i].name+" : "+student[i].marks);

            // System.out.println(student[i]);
        // }

        for (Stu ex:student){

            // System.out.println(ex);
            System.out.println(ex.name+" : "+ex.marks);
        }

    }
    
}

class Stu{


int roll;
String name;
int marks;

public String toString(){
    return name+" having marks "+ marks +" and having roll number "+roll;
}

}
