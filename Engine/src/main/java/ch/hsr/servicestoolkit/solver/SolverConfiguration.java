package ch.hsr.servicestoolkit.solver;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SolverConfiguration {

	private Map<String, Double> weights = new HashMap<>();
	private Map<String, Double> algorithmParams = new HashMap<>();
	private Map<String, Double> priorities = new HashMap<>();

	private Logger log = LoggerFactory.getLogger(SolverConfiguration.class);

	public void setWeights(final Map<String, Double> weights) {
		if (weights != null) {
			this.weights = weights;
		} else {
			throw new InvalidParameterException("weights should not be null!");
		}
	}

	public void setAlgorithmParams(final Map<String, Double> mclParams) {
		if (mclParams != null) {
			this.algorithmParams = mclParams;
		} else {
			throw new InvalidParameterException("mclParams should not be null!");
		}
	}

	public Map<String, Double> getPriorities() {
		return priorities;
	}

	// needed for jackson deserialization
	public Map<String, Double> getWeights() {
		return weights;
	}

	public Map<String, Double> getAlgorithmParams() {
		return algorithmParams;
	}

	public Double getWeightForVariant(final String variantType) {
		if (!weights.containsKey(variantType)) {
			log.error("no weight defined for variant: " + variantType + ". Use 0");
			return 0d;
		}
		return weights.get(variantType);
	}

	public Double getPriorityForCouplingCriterion(final String criterionType) {
		if (!priorities.containsKey(criterionType)) {
			log.error("no weight defined for variant: " + criterionType + ". Use 1");
			return 0d;
		}
		return priorities.get(criterionType);
	}

	public Double getValueForAlgorithmParam(final String key) {
		if (!algorithmParams.containsKey(key)) {
			log.error("no value defined for algorithm param: " + key + ". Use 0");
			return 0d;
		}
		return algorithmParams.get(key);
	}

}