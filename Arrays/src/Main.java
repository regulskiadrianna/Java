public class Main {

    public static void main(String[] args) {

        double[] myList = {1.9, 2.9, 3.4, 3.5, 3.0};

        // Printing array elements
        for(int i = 0; i < myList.length; i++ ){
            System.out.println(myList[i] + " " );
        }

        // Summing all elements
        double total = 0;
        for (int i = 0; i <myList.length; i++ ){
            total += myList[i];
        }
        System.out.println("Total is: " + total);

        //Finding the largest element
        double max = myList[0];
        for(int i = 0; i <myList.length; i++){
            if(myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);

        //For Each loops
        double [] myList1 = {1.9, 2.9, 3.9, 3.5};

        for (double element: myList1){
            System.out.println(element);
        }

    }
}
