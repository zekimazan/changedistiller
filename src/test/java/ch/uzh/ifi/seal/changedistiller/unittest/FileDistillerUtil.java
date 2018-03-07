package ch.uzh.ifi.seal.changedistiller.unittest;

import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import ch.uzh.ifi.seal.changedistiller.ChangeDistiller;
import ch.uzh.ifi.seal.changedistiller.ChangeDistiller.Language;
import ch.uzh.ifi.seal.changedistiller.distilling.FileDistiller;
import ch.uzh.ifi.seal.changedistiller.model.entities.SourceCodeChange;

public class FileDistillerUtil {
	public static List<SourceCodeChange> getChangesFromFile(String leftFileName, String rightFileName) {
		Path resourceDirectory = Paths.get("resources","testdata","src_changetypes");
		File left = new File(resourceDirectory + "/" + leftFileName);
		File right = new File(resourceDirectory + "/" + rightFileName);
		
		FileDistiller distiller = ChangeDistiller.createFileDistiller(Language.JAVA);
		try {
			distiller.extractClassifiedSourceCodeChanges(left, right);
		} catch (Exception e) {
			System.err.println("Warning: error while change distilling. " + e.getMessage());
		}

		List<SourceCodeChange> changes = distiller.getSourceCodeChanges();
		return changes;
	}
}
