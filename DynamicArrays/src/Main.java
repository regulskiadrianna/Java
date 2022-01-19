public class Main {

    public static void main(String[] args) {

        DynamicArray groceriesBag = new DynamicArray();
        System.out.println(groceriesBag.capacity);

        groceriesBag.add("A");
        groceriesBag.add("B");
        groceriesBag.add("C");
        System.out.println(groceriesBag);

    }
}
