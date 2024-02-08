/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ahmed
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
int [] t = {2,4,6,7,9};        
        int [] t1= new int [t.length+1];
        for(int i =0;i<t.length;i++){
            t1[i] = t[i]; 
        }
        t=t1; 
                t[5]=7; //assigns missing value

        for(int j=0;j<t1.length;j++){
            System.out.println(t[j]);
        }
    int sum=0;
for(int k=0;k<t1.length;k++){
    sum+=t[k];
}    
System.out.println(sum); //sum of all values in array
    }
    */
   int [] intArray = new int [] {52,45,32,64,12,87,78,98,23,7};
        int temp = 0;

        //print original array
        System.out.println("Original array: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        
        //Sort the array in ascending order using two for loops
        for (int i = 0; i <intArray.length; i++) {
          for (int j = i+1; j <intArray.length; j++) {
              if(intArray[i] > intArray[j]) { //swap elements if not in order
                 temp = intArray[i];
                 intArray[i] = intArray[j];
                 intArray[j] = temp;
               }
            }
        }

        //print sorted array
        System.out.println("\nArray sorted in ascending order: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
}
}