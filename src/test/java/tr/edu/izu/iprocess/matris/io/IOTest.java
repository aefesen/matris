package tr.edu.izu.iprocess.matris.io;

import junit.framework.TestCase;
import tr.edu.izu.iprocess.matris.impl.IntegerMatris;

public class IOTest extends TestCase {

	private IntegerMatris matris = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		matris = new IntegerMatris(3, 3);
	}

	public void testNothing() {
		assertEquals(matris.getColumnsCount(), 3);
	}

}
