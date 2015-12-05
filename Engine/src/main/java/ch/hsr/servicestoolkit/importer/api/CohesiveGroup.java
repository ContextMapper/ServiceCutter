package ch.hsr.servicestoolkit.importer.api;

import java.util.List;

public class CohesiveGroup {

	private List<String> nanoentities;
	private String name;

	// Jackson
	public CohesiveGroup() {

	}

	public CohesiveGroup(final List<String> nanoentities, final String name) {
		super();
		this.nanoentities = nanoentities;
		this.name = name;
	}

	public List<String> getNanoentities() {
		return nanoentities;
	}

	public String getName() {
		return name;
	}

}