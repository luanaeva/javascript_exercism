public class LogLevels {

    public static String message(String logLine) {
        String correctedLine = logLine.replace("[ERROR]:","").replace("[INFO]:","").replace("[WARNING]:","");
	String evenedLine = correctedLine.trim();
	logLine = evenedLine;
	return logLine;

    }

    public static String logLevel(String logLine) {
	if(logLine.contains("[ERROR]:"))
	{
	   return "error";
	}else if(logLine.contains("[WARNING]:"))
	    {
	     return "warning";
	    }else
	    {
	     return "info";
	}
    }

    public static String reformat(String logLine) {
	String logLevel = "";

	if(logLine.contains("[ERROR]:"))
	{
	    logLevel = "(error)";
	}else if(logLine.contains("[WARNING]:"))
	    {
	     logLevel = "(warning)";
	    }else
	    {
	     logLevel = "(info)";
	}
	String extractedMessage = message(logLine);

	String finalMessage = String.format("%s %s", extractedMessage, logLevel);

	return finalMessage;
	
    }
}
