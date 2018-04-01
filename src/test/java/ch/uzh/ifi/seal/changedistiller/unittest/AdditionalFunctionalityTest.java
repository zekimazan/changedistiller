import static org.junit.Assert.assertEquals;

import java.util.List;

import ch.uzh.ifi.seal.changedistiller.model.entities.SourceCodeChange;
import org.junit.Before;
import org.junit.Test;

public class AdditionalFunctionalityTest {
    List<SourceCodeChange> sourceCodeChangeList;


    @Before
    public void setUp() {
        sourceCodeChangeList = FileDistillerUtil.getChangesFromFile("AdditionalFunctionality_Left.java", "AdditionalFunctionality_Right.java");

    }

    @Test
    public void additionalFunctionalityTest() {
        String expected = "ADDITIONAL_FUNCTIONALITY\n";

        StringBuilder stringBuilder = new StringBuilder();
        for(SourceCodeChange change : sourceCodeChangeList) {
            stringBuilder.append(change.getLabel() + "\n");
        }

        assertEquals(stringBuilder.toString(), expected);
    }

}