package info.nguyentai.loggenerator;
public class LoggerGenerator {

	public static void main(String[] args) {
		// Input
		String[] inputArray = new String[] {"searchType", "searchValue", "startTime", "endTime", "dateSearchType",
				"stageCode", "providerContentTier", "categoryInf", "offer.getSearchOptionPeriodPast()", "offer.getSearchOptionPeriodPresent()",
				"offer.getSearchOptionPeriodFuture()", "bean.getRecordsTotal()", "bean.getRecordsFiltered()", "orderColumnName", "orderDir",
				"offerlist.size()"};

		// Output
		StringBuilder loggerBuilder = new StringBuilder("TheLogger.info(");
		for (int i = 0; i < inputArray.length; i++) {
			loggerBuilder.append("\"" + inputArray[i] + ":\" + ");
			loggerBuilder.append(inputArray[i] + " + \"\\n\"");
			if (i < inputArray.length - 1) {
				loggerBuilder.append(" + ");
			}
		}
		loggerBuilder.append(");");
		
		System.out.println(loggerBuilder.toString());
	}

}
