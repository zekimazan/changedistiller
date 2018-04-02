package ch.uzh.ifi.seal.changedistiller.unittest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ch.uzh.ifi.seal.changedistiller.model.entities.SourceCodeChange;

package test.Test;


public class RemovedFunctionalityTest{
    List<SourceCodeChange> sourceCodeChangeList;
    
    @Before
    public void setUp() {
        sourceCodeChangeList = FileDistillerUtil.getChangesFromFile("RemovedFunctionality_Left.java", "RemovedFunctionality_Right.java");
    }
    
    @Test
    public void removedFunctionalityTest(){
        String expected = "REMOVED_FUNCTIONALITY\n";
        
        StringBuilder stringBuilder = new StringBuilder();
        for(SourceCodeChange change : sourceCodeChangeList) {
            stringBuilder.append(change.getLabel() + "\n");
        }
        
        assertEquals(stringBuilder.toString(), expected);
    }
    
}
