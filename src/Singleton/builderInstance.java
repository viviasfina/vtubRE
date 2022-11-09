package Singleton;

import builder.vtuberBuilder;

public class builderInstance {

	private static vtuberBuilder instance = null;
	
	public static vtuberBuilder getInstance () {
		if(instance==null) {
			instance = new vtuberBuilder();
		}
		return instance;
	}

}
