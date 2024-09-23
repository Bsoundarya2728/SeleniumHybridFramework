package restAssuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtilityFile {
	
	public static String name()
	{
		String generateString=RandomStringUtils.randomAlphabetic(1);
		return ("IRIS"+generateString);
	}
	public static String job()
	{
		String generateString=RandomStringUtils.randomAlphabetic(1);
		return ("QA"+generateString);
	}

}
