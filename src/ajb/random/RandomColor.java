package ajb.random;

import java.awt.Color;

public class RandomColor {

	public static Color anyRandomColor() {
		return new Color(RandomInt.anyRandomIntRange(10, 255),
				RandomInt.anyRandomIntRange(10, 255),
				RandomInt.anyRandomIntRange(10, 255));
	}

}
