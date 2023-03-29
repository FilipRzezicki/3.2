//sam kwadrat
//class Main {
//
  //  public static void main(String[] args) {
    //    int kwadrat = 10;
//
  //      for (int i = 0; i < kwadrat; i++) {
    //        for (int j = 0; j < kwadrat; j++) {
      //          if (i == 0 || i == kwadrat - 1 || j == 0 || j == kwadrat - 1) {
        //            System.out.print("*");
          //      } else {
            //        System.out.print("  ");
              //  }
           // }
           // System.out.println();
       // }
   // }
//}

class Main {
    public static void main(String[] args) {
        int kwadrat = 10;

        for (int i = 0; i < kwadrat; i++) {
            System.out.print("* ");
        }

        System.out.println(); 

        for (int i = 1; i < kwadrat - 1; i++) {
            System.out.print("* "); 

            for (int j = 1; j < kwadrat - 1; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println("*");
        }

        for (int i = 0; i < kwadrat; i++) {
            System.out.print("* ");
        }

        System.out.println(); 
    }
}
