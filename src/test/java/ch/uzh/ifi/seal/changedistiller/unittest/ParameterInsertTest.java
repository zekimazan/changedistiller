package ch.uzh.ifi.seal.changedistiller.unittest;
import static org.junit.Assert.assertEquals;

import java.util.List;

import ch.uzh.ifi.seal.changedistiller.model.entities.SourceCodeChange;
import org.junit.Before;
import org.junit.Test;

public class ParameterInsertTest {
    List<SourceCodeChange> sourceCodeChangeList;


    @Before
    public void setUp() {
        sourceCodeChangeList = FileDistillerUtil.getChangesFromFile("ParameterInsert_Left.java", "ParameterInsert_Right.java");

    }

    @Test
    public void parameterInsertTest() {
        String expected = "PARAMETER_INSERT\n";

        StringBuilder stringBuilder = new StringBuilder();
        for(SourceCodeChange change : sourceCodeChangeList) {
            stringBuilder.append(change.getLabel() + "\n");
        }

        assertEquals(stringBuilder.toString(), expected);
    }

}