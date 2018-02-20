
import java.util.ArrayList;

public class Path {

	// sorted in ascending order according to number of PathElement in each Path
	ArrayList <PathElement> path;

	PathElement removeMinf () {
		return removeFirst (path);
	}

	
}