import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(2);
        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(90);
        System.out.println(arrayList);
        /* How does it works in the back
        ArrayList capacity expands x2 everytime it reaches the end
        reinitliases new array copies its elements to the new array
        */

        /* We can make ArrayList of Arraylists*/
        ArrayList<ArrayList<Integer>> list_of_list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> demo = new ArrayList<Integer>();
            demo.add(i);
            demo.add(i+1);
            list_of_list.add(demo);
        }
        System.out.println(list_of_list);
    }
}
