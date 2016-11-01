package com.edu.abhi.dependencyinjection.constructor;

import com.edu.abhi.output.IOutputGenerator;

public class OutputHelper {
	IOutputGenerator outputGenerator;

	OutputHelper(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}
