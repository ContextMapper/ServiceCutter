package ch.hsr.servicestoolkit.importer.api;

import java.util.List;

public class Compatibilities {
	private List<Characteristic> volatility;
	private List<Characteristic> changeSimilarity;
	private List<Characteristic> availability;
	private List<Characteristic> consistency;
	private List<Characteristic> storageSimilarity;
	private List<Characteristic> securityCriticality;

	public Compatibilities() {
	}

	public List<Characteristic> getVolatility() {
		return volatility;
	}

	public void setVolatility(final List<Characteristic> volatility) {
		this.volatility = volatility;
	}

	public List<Characteristic> getChangeSimilarity() {
		return changeSimilarity;
	}

	public void setChangeSimilarity(final List<Characteristic> changeSimilarity) {
		this.changeSimilarity = changeSimilarity;
	}

	public List<Characteristic> getAvailability() {
		return availability;
	}

	public void setAvailability(final List<Characteristic> availability) {
		this.availability = availability;
	}

	public List<Characteristic> getConsistency() {
		return consistency;
	}

	public void setConsistency(final List<Characteristic> consistency) {
		this.consistency = consistency;
	}

	public List<Characteristic> getStorageSimilarity() {
		return storageSimilarity;
	}

	public void setStorageSimilarity(final List<Characteristic> storageSimilarity) {
		this.storageSimilarity = storageSimilarity;
	}

	public List<Characteristic> getSecurityCriticality() {
		return securityCriticality;
	}

	public void setSecurityCriticality(final List<Characteristic> securityCriticality) {
		this.securityCriticality = securityCriticality;
	}

}
