package ch.uzh.ifi.seal.changedistiller.unittest;
import static org.junit.Assert.assertEquals;

import java.util.List;

import ch.uzh.ifi.seal.changedistiller.model.entities.SourceCodeChange;
import org.junit.Before;
import org.junit.Test;

public class ParameterOrderingChangeTest {
    List<SourceCodeChange> sourceCodeChangeList;


    @Before
    public void setUp() {
        sourceCodeChangeList = FileDistillerUtil.getChangesFromFile("ParameterOrderingChange_Left.java", "ParameterOrderingChange_Right.java");

    }

    @Test
    public void parameterOrderingChangeTest() {
        String expected = "PARAMETER_ORDERING_CHANGE\n";

        StringBuilder stringBuilder = new StringBuilder();
        for(SourceCodeChange change : sourceCodeChangeList) {
            stringBuilder.append(change.getLabel() + "\n");
        }

        assertEquals(stringBuilder.toString(), expected);
    }

}