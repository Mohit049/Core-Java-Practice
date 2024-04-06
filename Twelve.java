



public class Twelve {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Karan ");
        System.out.println(sb.capacity());

        sb.append("Dev is a student of Xolke");
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.deleteCharAt(6));
        // String ak="Hello";
        // ak.append("World"); // gives error cause strings are immutable

        StringBuilder sk=new StringBuilder();
        System.out.println(sk.capacity());

       
        System.out.println(sb.insert(0, "Mr. "));
        System.out.println(sb.capacity());

        System.out.println("--------------");
        System.out.println(sb.substring(4,25));
        System.out.println(sb.insert(10,"d"));

        sb.setLength(50);
        System.out.println(sb);
        System.out.println(sb.capacity());



    }
}
