package com.edu.abhi.dependencyinjection.setter;

import com.edu.abhi.output.IOutputGenerator;

/**
 * 
 * @author abhishekkhare
 *
 */
public class OutputHelper {
	IOutputGenerator outputGenerator;

	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}

}
