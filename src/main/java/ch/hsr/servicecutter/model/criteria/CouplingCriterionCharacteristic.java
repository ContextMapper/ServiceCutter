package ch.hsr.servicecutter.model.criteria;

import com.google.common.base.MoreObjects;

public class CouplingCriterionCharacteristic {

	private Long id;
	private String name;
	private Integer weight;
	private boolean isDefault = false;
	private CouplingCriterion couplingCriterion;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(final boolean isDefault) {
		this.isDefault = isDefault;
	}

	public CouplingCriterion getCouplingCriterion() {
		return couplingCriterion;
	}

	public void setCouplingCriterion(final CouplingCriterion couplingCriterion) {
		this.couplingCriterion = couplingCriterion;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(final Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this.getClass()).add("id", id).add("name", name).add("weight", weight).toString();
	}
}
