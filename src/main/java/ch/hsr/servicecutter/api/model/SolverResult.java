package ch.hsr.servicecutter.api.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SolverResult {

	private Set<Service> services;
	private List<ServiceRelation> relations;
	private Map<String, List<String>> useCaseResponsibility;

	public SolverResult() {
		// Jackson
	}

	public SolverResult(final Set<Service> services) {
		this.services = services;
	}

	public Set<Service> getServices() {
		return services;
	}

	public void setUseCaseResponsibility(final Map<String, List<String>> responsibilities) {
		this.useCaseResponsibility = responsibilities;
	}

	public Map<String, List<String>> getUseCaseResponsibility() {
		return useCaseResponsibility;
	}

	public List<ServiceRelation> getRelations() {
		return relations;
	}

	public void setRelations(final List<ServiceRelation> relations) {
		this.relations = relations;
	}
}
