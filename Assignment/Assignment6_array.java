public class Assignment6_array {
    public static void main(String[] args) {
      System.out.println("Question 1: write a program to sum of 5 float number from array");
        float [] array={4.5f,5.3f,6.5f,9.5f,8.2f};
        float sum=0;
        for(float element:array){
         sum=sum+element;
        }
        System.out.println("Sum: "+ sum);

        System.out.println();
        System.out.println("Question 2: write a program to find the integer is present or not");
        int [] array1={4,5,6,3,4};
        int num=6;
        boolean isArrray= false;
        for(int element:array1) {
            if (num == element) {
                isArrray = true;
                break;
            }
        }
            if(isArrray){
                System.out.println(num+" is present in the array in index ");
            }
            else{
                System.out.println(num+" is Not present in the array");
            }

        System.out.println();
        System.out.println("Question 3: write a program to find the avg marks ");
        float [] array2={4.0f,5.0f,6.0f,3.0f,4.0f};
        float avg=0;
        for(float n:array2)
        {
            avg +=n;
        }
        System.out.println("avg: "+avg/ array2.length);


        System.out.println();
        System.out.println("Question 4: write a program to reverse an array ");
      int [] array3 = {1,2,3,4,5};
     
      int l= array3.length;
      int n= Math.floorDiv(l,2);
      int temp;
      for(int i=0;i<n;i++){
          temp=array3[i];
          array3[i]=array3[l-1-i];
          array3[l-1-i]=temp;
      }
for(int element:array3){
    System.out.print("\t"+element);
}


        System.out.println();
        System.out.println("Question 5: write a program to find max element from the array ");
        int [] array4 = {1,2,3,4,5};
        int max=0;
        for(int element:array4){
           if(element>max) {
               max = element;
           }
        }
        System.out.println("maximum element from the array is: "+max);

        System.out.println();
        System.out.println("Question 6: write a program to find min element from the array ");
        int[] array5 = {12, 4, 7, 9, 3, 15, 2, 8};
            int min = array5[0];
            for (int i = 1; i < array5.length; i++) {
                if (array5[i] < min) {
                    min = array5[i];
                }
            }
            System.out.println("The minimum element in the array is: " + min);


        System.out.println();
        System.out.println("Question 7: write a program to sort the array ");
        int[] array6 = {12, 4, 7, 9, 3, 15, 2, 8};
        System.out.println("Original array:");
        for (int i = 0; i < array6.length; i++) {
            System.out.print(array6[i] + " ");
        }
        System.out.println();
        int n1 = array6.length;
        for (int i = 0; i < n1 - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n1; j++) {
                if (array6[j] < array6[minIndex]) {
                    minIndex = j;
                }
            }
            int temp1 = array6[minIndex];
            array6[minIndex] = array6[i];
            array6[i] = temp1;
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < array6.length; i++) {
            System.out.print(array6[i] + " ");
        }
        System.out.println();
    }
}