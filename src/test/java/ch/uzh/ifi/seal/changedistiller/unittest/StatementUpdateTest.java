package ch.uzh.ifi.seal.changedistiller.unittest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ch.uzh.ifi.seal.changedistiller.model.entities.SourceCodeChange;

public class StatementUpdateTest {
    List<SourceCodeChange> sourceCodeChangeList;
    
    @Before
    public void setUp() {
        sourceCodeChangeList = FileDistillerUtil.getChangesFromFile("StatementUpdate_Left.java", "StatementUpdate_Right.java");
    }
    
    @Test
    public void statementUpdateTest() {
        String expected = "STATEMENT_UPDATE\n";
        
        StringBuilder stringBuilder = new StringBuilder();
        for(SourceCodeChange change : sourceCodeChangeList) {
            stringBuilder.append(change.getLabel() + "\n");
        }
        
        assertEquals(stringBuilder.toString(), expected);
    }
}
