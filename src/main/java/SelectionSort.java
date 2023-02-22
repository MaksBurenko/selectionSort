public class SelectionSort {

    public static <T extends Comparable> void sort(T[] items){
        for(int i = 0; i < items.length; i++){
            int index = i;
            for(int j = i+1; j < items.length; j++){
                if(items[j].compareTo(items[index]) < 0){
                    index = j;
                }
            }
            swap(items, index, i);
        }
    }

    public static <T> void swap(T[] items, int index, int i){
        T temp = items[i];
        items[i] = items[index];
        items[index] = temp;
    };
}
