

public class CWH21practice {
    public static void main(String[] args) {
        // q1.
        // float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        // float sum = 0;
        // for(float element : marks){
        //     sum = sum + element;
        // }
        // System.out.println("the value of sum is " + sum);




        // q2.
        // float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        // float num = 45.7f;
        // boolean isInArray = false;
        // for(float element : marks){
        //     if(num == element){
        //         isInArray = true;
        //         break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("the value is present in the array");
        // }
        // else{
        //     System.out.println("the value is not present in the array");
        // }




        // q3.
        // int [] marks = {45, 67, 63, 99, 100};
        // float sum = 0;
        // for(float element : marks){
        //     sum = sum + element;
        // } 
        // System.out.println(sum/marks.length);





        // q4.
        // int [][] mat1 = {{1, 2, 3},
        //                  {4, 5, 6}};
        // int [][] mat2 = {{2, 6, 13},
        //                  {3, 7, 1}};
        // int [][] result = {{0, 0, 0},
        //                    {0, 0, 0}};    
        // for(int i=0; i<mat1.length; i++){
        //     for(int j=0; j<mat1[i].length; j++){
        //         System.out.format("setting value foor i=%d and j=%d\n", i, j);
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }
        // for(int i=0; i<mat1.length; i++){
        //     for(int j=0; j<mat1[i].length; j++){
        //         System.out.println(result[i][j] + " ");
        //         result[i][j] = mat1[i][j] + mat2[i][j];   
        //     }   
        //     System.out.println("");                          
        // }






        // q5.
        // int [] arr = {1, 2, 3, 4,5 ,6};
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;
        // for(int i=0; i<n; i++){
        //     temp = arr[i];
        //     arr[i] = arr[l-i-1];
        //     arr[l-i-1] = temp;
        // }
        // for(int element : arr){
        //     System.out.println(element + " ");
        // }





        //q6.
        // int [] arr = {1, 2, 3, 435, 5 ,67};
        // int max = 0;
        // for(int element : arr){
        //     if(element > max){
        //         max = element;
        //     }
        // }
        // System.out.println("the value of maximum element in this array is : " + max);





        
        // q7.
        // int [] arr = {1, 2, 3, 435, 5 ,67};
        // int min = arr[0];
        // for(int element : arr){
        //     if(element < min){
        //         min = element;
        //     }
        // }
        // System.out.println("the value of minimum element in the array is : "+ min);





        // q8.
        // boolean isSorted = true;
        // int [] arr = {1, 2100, 3, 4455, 5, 34, 67};
        // for(int i=0; i<arr.length; i++){
        //     if( arr[i] > arr[i+1]){
        //         isSorted = false;
        //         break;  
        //     }
        // }
        // if(isSorted){
        //     System.out.println("the array is Sorted");
        // }
        // else{
        //     System.out.println("the array is unsorted");
        // }



        // q1.
        // float [] arr = {45.6f, 78.5f, 28.2f, 56.3f, 71.5f   };
        // float sum = 0;
        // for(float element : arr){
        //     sum = sum + element;
        // }
        // System.out.println("the sum of value is " + sum);




        // q2.
        // int [] marks = {23, 56, 78, 90, 45};
        // int num = 45;
        // boolean isInArray = false;
        // for(int element : marks){
        //     if(num == element){
        //         isInArray = true;
        //         break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("the value is present in the array");
        // }
        // else{
        //     System.out.println("the value is not present in the array");
        // }





        // q3.
        // float [] marks  = {78.5f, 67.5f, 38.5f, 64.5f, 89.5f};
        // float sum = 0;
        // for(float element : marks){
        //     sum = sum + element;
        // }
        // System.out.println("the avergae value of all student in physics are : " + sum/marks.length);






        // // q4.
        // int [][] mat1 = {{1, 2, 3},
        //                  {4, 5, 6}};
        // int [][] mat2 = {{2, 6, 13},
        //                  {3, 7, 1}};
        
        // int [][] result = {{0, 0, 0},
        //                    {0, 0, 0}};
        

        // for(int i=0; i<mat1.length; i++){
        //     for(int j=0; j<mat1[i].length; j++){
        //         result[i][j] = mat1[i][j] + mat2[i][j];  
        //     }
        // }                 
                          
        // for(int i=0; i<result.length; i++){
        //     for(int j=0; j<result[i].length; j++){
        //         System.out.print(result[i][j] + " ");

        //     }
        //     System.out.println();
        // }   
        
        






        // q.6
        // int [] arr = {23, 45, 74, 12, 26};
        // int max = 0;
        // for(int element : arr){
        //     if(element > max){
        //         max = element;
        //     }
        // }
        // System.out.println("the maximum value of this array are " + max);
          






        // q7.
        int [] arr = {23, 45, 76, 88, 34, 12};
        int min = arr[0];
        for(int element : arr){
            if(element < min){
                min = element;
            }

        }
        System.out.println("the minimum value of this array are " + min);
    }
}
