package law;

public abstract class IndividualLaw implements Law {

	private Law law;

	public IndividualLaw(Law law) {
		this.law = law;
	}

	@Override
	public String enforcement() {
		return law.enforcement();
	}

}