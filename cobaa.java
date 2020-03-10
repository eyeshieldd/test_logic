public class Brainly {

   public static void main(String[] args) {


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
    for (int i = 0; i < index.length - 1; i++) {
      for (int j = i + 1; j < index.length; j++) {
        if (index[i] < index[j]) {
          int temp = index[i];
          index[i] = index[j];
          index[j] = temp;
        }
      }
    }
    
    for (int i = 0; i < index.length; i++) {
      System.out.print(index[i]+ " ");
    }
        
       System.out.println( selisih);

   }

}