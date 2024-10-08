public class CWH16break {
    public static void main(String[] args) {



        // break statement    



        // for (int i = 0; i < 5; i++) {
        //     System.out.print(i);
        //     System.out.println(" java is great");
        //     if (i == 2) {
        //         System.out.println("ending the loop");
        //         break;
        //     }
        // }


        // int i = 0;
        // while(i<5){
        //     System.out.print(i);
        //     System.out.println(" java is great");
        //     if(i == 2){
        //         System.out.println("ending the loop");
        //         break;
        //     }
        //     i++;
        // }





        // int i = 0;
        // do{
        //     System.out.print(i);
        //     System.out.println(" java is great");
        //     if(i == 2){
        //         System.out.println("ending the loops");
        //         break;
        //     }
        //     i++;
        // }while(i < 5); 






        // continue statement



        // for(int i=0; i<5; i++){
        //     if(i == 2){
        //         System.out.println("ending the loop");
        //         continue;
        //     }
        //     System.out.print(i);
        //     System.out.println(" java is great");
        // }



        // int i = 0;
        // while(i < 5){
        //     if(i == 2){
        //         System.out.println("ending the loop");
        //         i++;
        //         continue;
        //     }
        //     System.out.print(i);
        //     System.out.println("java is great");
        //     i++;
        // }




        int i = 0;
        do { 
            System.out.print(i);
            System.out.println("java is great");
            if(i == 2){
                System.out.println("ending the loop");
                i++;
                continue;
            }
            i++;
        } while (i < 5);
    }   
}
