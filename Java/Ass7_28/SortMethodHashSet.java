import java.util.Comparator;

public class SortMethodHashSet implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		return o1.mark - o2.mark;
	}
	

}
