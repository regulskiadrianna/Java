public class Main {

    public static void main(String[] args) {

        //Linear search = Iterate through a collection one element at a time
        //Runtime complexity: 0(n)

        int[] arrayExample = {9, 3, 5, 4, 3, 4, 4, 5, 2, 1};
        int index = linearSearch(arrayExample,1);

        if (index != -1){
            System.out.println("Element found at index: " + index);
        } else{
            System.out.println("Element not found.");
        }


    }

    private static int linearSearch(int[] arrayExample, int value){
        for(int i = 0; i < arrayExample.length; i++){
            if(arrayExample[i] == value){
                return i;
            }
        }
        return -1;
    }
}
