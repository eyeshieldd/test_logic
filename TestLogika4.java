public class logika {

   public static void main(String[] args) {

        // INPUTAN ARRAY
       int nilai[] = {5, 6, 15, 3, 10, 22, 15};

       selisih(nilai);

   }

   static void selisih(int nilai[]) {

       int nilai_max = nilai[0]; 

       int nilai_min = nilai[0]; 

       for(int i = 0; i < nilai.length; i++) {


           if(nilai[i] < nilai_min)

               nilai_min = nilai[i];

          
           if(nilai[i] > nilai_max)

               nilai_max = nilai[i];

       }
       int selisih = nilai_max - nilai_min;
   
        
       System.out.println( selisih);

   }

}