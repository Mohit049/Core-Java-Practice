public class Seventh {


    public void ok(){
        System.out.println("This is seevnth");
        
    }


    public static void main(String[] args) {
       
        //System.out.println();
        Seventh obj=new Habit();
        Seventh ex=new Id();

        obj.ok();
        ex.ok();

    

    }

}

class Habit extends Seventh{

  public void ok(){
    System.out.println("This is habit");

  }
}


class Id extends Seventh{

    public void ok(){
    System.out.println("This is id");
    }
}

