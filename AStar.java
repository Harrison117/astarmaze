
import java.util.ArrayList;
import java.util.HashMap;

public class AStar {

	public Path solve () {
		ArrayList <Path> openList = {/*initial state*/};
		HashMap <Integer, PathElement> closedList = new HashMap <Integer, PathElement> (/*size of board*/);

		while (!openList.isEmpty) {
			Path currPath = openList.removeMinF ();
			PathElement state = currPath.peek ();
			closedList.put (/*hash(state)*/, state);
			// if (GoalTest (state)) return path;
		}
	}
}