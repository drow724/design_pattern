package village;

import law.FundamentalLaw;
import law.Law;
import law.TaxLaw;
import law.TrafficLaw;

public class Village {

	public static void main(String[] args) {

		Law law = new FundamentalLaw();

		System.out.println(law.enforcement());

		Law fundamentalLawWithTrafficLaw = new TrafficLaw(
			new FundamentalLaw()
		);

		System.out.println(fundamentalLawWithTrafficLaw.enforcement());
		
		Law fundamentalLawWithTrafficLawWithTaxLaw = new TrafficLaw(
				new TaxLaw(new FundamentalLaw())
			);
		
		System.out.println(fundamentalLawWithTrafficLawWithTaxLaw.enforcement());
		
	}

}
