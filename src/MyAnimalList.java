/**
 * Created by quodnon on 12/8/14.
 */
public class MyAnimalList {
    private int nextIndex = 0;
    private Animal[] animals = new Animal[5];

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added tso " + nextIndex);
            nextIndex++;
        }
    }
}
