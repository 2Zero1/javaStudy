package exerciseproblem.ch5.No15;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class Format extends Formatter {
    @Override
    public String format(LogRecord record) {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("<!doctype html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("<date>"+record.getInstant()+"</date>");
        stringBuilder.append("<milis>"+record.getInstant()+"</milis>");
        stringBuilder.append("<Sequence>"+record.getSequenceNumber()+"</Sequence>");
        stringBuilder.append("<class>"+record.getClass()+"</class>");
        stringBuilder.append("<method>"+record.getSourceMethodName()+"</method>");
        stringBuilder.append("<thread>"+record.getThreadID()+"</thread>");
        stringBuilder.append("<message>"+record.getMessage()+"</message>");
        stringBuilder.append("</html>\n");

        return stringBuilder.toString();
    }
}
