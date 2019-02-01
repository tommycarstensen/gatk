package org.broadinstitute.hellbender.cmdline.argumentcollections;

import org.broadinstitute.barclay.argparser.Argument;
import org.broadinstitute.hellbender.cmdline.StandardArgumentDefinitions;
import org.broadinstitute.hellbender.engine.GATKPathSpecifier;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * An argument collection for use with tools that optionally accept a reference file as input.
 */
public final class OptionalReferenceInputArgumentCollection extends ReferenceInputArgumentCollection {
    private static final long serialVersionUID = 1L;

    @Argument(fullName = StandardArgumentDefinitions.REFERENCE_LONG_NAME, shortName = StandardArgumentDefinitions.REFERENCE_SHORT_NAME, doc = "Reference sequence", optional = true)
    private GATKPathSpecifier referenceInput;

    @Override
    public String getReferenceFileName() {
        if (referenceInput != null) {
            final String uriString = referenceInput.getURIString();
            final File tempFile = new File(referenceInput.getURIString());
            final boolean fExist = tempFile.exists();
            Path pPath = Paths.get(referenceInput.getURI());
            //final boolean pExists = pPath.g
            int i = 37;
        }
        return referenceInput != null ? referenceInput.getURIString() : null;
    }
}
