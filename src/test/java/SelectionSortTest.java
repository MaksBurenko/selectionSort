import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SelectionSortTest {

    @Test
    public void sortInt() {
        Comparable[] items = {3,1,5,8,3,4,0,1,7};
        SelectionSort.sort(items);
        assertThat(items).isEqualTo(new Comparable[]{0,1,1,3,3,4,5,7,8});
    }

    public void sortString() {
        Comparable[] items = {"asd", "hgo", "gg", "iko"};
        SelectionSort.sort(items);
        assertThat(items).isEqualTo(new Comparable[]{"asd", "iko", "gg", "hgo"});
    }
}