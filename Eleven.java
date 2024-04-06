public class Eleven {
    


    public static void main(String[] args) {
        String st=new String("Max");
        System.out.println(st+"-"+st.hashCode());
        System.out.println(st.charAt(1));
        System.out.println(st.concat(" Fury"));
        System.out.println(st.toUpperCase().charAt(2));

        String s1="Hello";
        String s2=new String("hello");
        String s3="hello";
        System.out.println(s1.equals(s2));
        System.out.println(s2==s3);
    }
}


// String constant pool