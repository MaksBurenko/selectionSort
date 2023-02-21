public class SelectionSort {

    public static int[] sort(int[] items){
        for(int i = 0; i<items.length; i++){
            int temp = items[i];
            for(int j = i+1; j<items.length; j++){
                if(items[j] < items[i]){
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
        return items;
    }
}
