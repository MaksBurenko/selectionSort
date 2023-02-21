import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SelectionSortTest {

    @Test
    public void sort() {
        int[] items = {3,1,5,8,3,4,0,1,7};
        SelectionSort.sort(items);
        assertThat(items).isEqualTo(new int[]{0,1,1,3,3,4,5,7,8});
    }
}