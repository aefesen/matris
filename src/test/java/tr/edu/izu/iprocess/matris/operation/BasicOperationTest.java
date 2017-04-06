package tr.edu.izu.iprocess.matris.operation;

import tr.edu.izu.iprocess.matris.impl.IntegerMatris;
import junit.framework.TestCase;

public class BasicOperationTest extends TestCase {

	private IntegerMatris matris = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		matris = new IntegerMatris(3, 3);
	}
	
	private void assertAllValue(IntegerMatris m, Integer value) {
		for (int i = 0; i < m.getRowsCount(); i++)
			for (int j = 0; j < m.getColumnsCount(); j++)
				assertTrue(value == m.getValue(i, j));
	}
	
	public void testMatrisShouldBeFilledWithNonZero() {
		IntegerMatris localMatris = new IntegerMatris(2, 2, 2);
		assertAllValue(localMatris, 2);
	}

	public void testMatrisShouldBeFilledWithZero() {
		assertAllValue(matris, 0);

	}

	public void testMatrisRowCountShouldBeThree() {
		assertEquals(3, matris.getRowsCount());
	}

}
