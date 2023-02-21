public class SelectionSort {

    public static int[] sort(int[] items){
        for(int i = 0; i < items.length; i++){
            int index = i;
            for(int j = i+1; j < items.length; j++){
                if(items[j] < items[index]){
                    index = j;
                }
            }
            swap(items, index, i);
        }
        return items;
    }

    public static void swap(int[] items, int index, int i){
        int temp = items[i];
        items[i] = items[index];
        items[index] = temp;
    };
}
