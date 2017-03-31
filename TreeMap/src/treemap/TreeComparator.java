package treemap;
import java.util.*;
public class TreeComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1.compareTo(o2);
		
	}

}

class PointComparator implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		
		return o1.x.compareTo(o2.x);
		
	}

}
