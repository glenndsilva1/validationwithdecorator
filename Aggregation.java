package withdecorator;

import java.util.List;

public class Aggregation {
	public static List<Val> callback(String error,Validity val, List<String> vali) {
		vali.add(error);
		return val.validations();
	}
}
