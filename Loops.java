public class Loops {
    public static void main(String[] args) {
        // find max element
        int[] myArray = {23, 45, 21, 1, 567, 7875, 87};
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("The largest number is " + max);

        //fibonacci sequence
              int n0 = 1;
              int n1 = 1;
              int n2;
            System.out.print(n0 + " " + n1 + " ");
             for(int i = 3; i <= 20; i++){
                 n2=n0+n1;
                System.out.print(n2+" ");
                  n0=n1;
                 n1=n2;
          }
         }
}





