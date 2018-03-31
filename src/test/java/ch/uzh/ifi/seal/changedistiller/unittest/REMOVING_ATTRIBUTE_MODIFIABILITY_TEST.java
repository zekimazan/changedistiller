package ch.uzh.ifi.seal.changedistiller.unittest;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import ch.uzh.ifi.seal.changedistiller.model.entities.SourceCodeChange;

public class REMOVING_ATTRIBUTE_MODIFIABILITY_TEST {
	List<SourceCodeChange> sourceCodeChangeList;
	
	@Before
	public void setUp() {
		sourceCodeChangeList = FileDistillerUtil.getChangesFromFile("REMOVING_ATTRIBUTE_MODIFIABILITY_LEFT.java", "REMOVING_ATTRIBUTE_MODIFIABILITY_RIGHT.java");
	}
	
	@Test
	public void classRenamingTest() {
		String expected = "REMOVING_ATTRIBUTE_MODIFIABILITY\n";
		
		StringBuilder stringBuilder = new StringBuilder();
		for(SourceCodeChange change : sourceCodeChangeList) {
			stringBuilder.append(change.getLabel() + "\n");
		}
		
		assertEquals(stringBuilder.toString(), expected);
	}
}
