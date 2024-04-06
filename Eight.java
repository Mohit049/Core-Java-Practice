
//import java.util.*;
public class Eight {

    public static void main(String[] args) {
        // int arr[]={2,3,5,7,0};
        // //int arr[]=new int[4];
        // arr[4]=99;
        // for(int i:arr){

        // System.out.println(arr[i]); ---  this will giive error because here i is not index but it stores the value of elements of array


        int arr[][]=new  int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
            
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("---------------");

        for(int row[]:arr){
            for(int el:row){
                System.out.print( el+" ");
            }
            System.out.println();
        }
    

    }
    }
 

