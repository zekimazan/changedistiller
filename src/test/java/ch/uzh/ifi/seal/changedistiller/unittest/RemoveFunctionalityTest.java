package ch.uzh.ifi.seal.changedistiller.unittest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ch.uzh.ifi.seal.changedistiller.model.entities.SourceCodeChange;

package test.Test;


public class RemoveFunctionalityTest{
    List<SourceCodeChange> sourceCodeChangeList;
    
    @Before
    public void setUp() {
        sourceCodeChangeList = FileDistillerUtil.getChangesFromFile("RemoveFunctionality_Left.java", "RemoveFunctionality_Right.java");
    }
    
    @Test
    public void removeFunctionalityTest(){
        String expected = "REMOVED_FUNCTIONALITY\n";
        
        StringBuilder stringBuilder = new StringBuilder();
        for(SourceCodeChange change : sourceCodeChangeList) {
            stringBuilder.append(change.getLabel() + "\n");
        }
        
        assertEquals(stringBuilder.toString(), expected);
    }
    
}
