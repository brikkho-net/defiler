package dfs;

import junit.framework.TestCase;

public class BoundedTreeSetTest extends TestCase {
	
	public void testIsBounded() {
		BoundedTreeSet<Integer> bts = new BoundedTreeSet<Integer>(1);
		assertTrue(bts.add(1));
		assertFalse(bts.add(2));
		assertFalse(bts.contains(2));
	}

}
