package ch.uzh.ifi.seal.changedistiller.unittest;

/*
 * #%L
 * ChangeDistiller
 * %%
 * Copyright (C) 2011 - 2018 Software Architecture and Evolution Lab, Department of Informatics, UZH
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ch.uzh.ifi.seal.changedistiller.model.entities.SourceCodeChange;

public class ReturnTypeChangeTest {
	List<SourceCodeChange> sourceCodeChangeList;
	
	@Before
	public void setUp() {
		sourceCodeChangeList = FileDistillerUtil.getChangesFromFile("ReturnTypeChange_Left.java", "ReturnTypeChange_Right.java");
	}
	
	@Test
	public void returnTypeChangeTest() {
		String expected = "RETURN_TYPE_CHANGE\n";
		
		StringBuilder stringBuilder = new StringBuilder();
		for(SourceCodeChange change : sourceCodeChangeList) {
			stringBuilder.append(change.getLabel() + "\n");
		}
		
		assertEquals(stringBuilder.toString(), expected);
	}
}
