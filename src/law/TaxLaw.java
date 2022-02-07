package law;

public class TaxLaw extends IndividualLaw {

	public TaxLaw(Law law) {
		super(law);
	}

	public String enactment() {
		return "조세 규칙을 추가합니다.";
	}

	@Override
	public String enforcement() {
		return super.enforcement() + enactment();
	}
}