import java.sql.SQLOutput;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //Stack is a LIFO data structure, Last in first out. Stores objects into a sort of vertical tower.
        //Push() to add to the top
        //Pop() to remove from the top

        Stack<String> groceryList = new Stack<String>();
        groceryList.push("Apple");
        groceryList.push("Banana");
        groceryList.push("Bread");
        groceryList.push("Butter");
        groceryList.push("Tomato");

        //Shows last item
        System.out.println(groceryList.peek());

        //Full list
        System.out.println(groceryList);

        //Removes last item
        groceryList.pop();
        System.out.println(groceryList);
    }
}
