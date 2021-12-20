package Week2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File; 
 
// Create a java program that generates a html file containing java properties in the table format 

public class Prob1_Week2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<meta charset=\"UTF-8\"/>");
        sb.append("<style>");
        sb.append("table { border-collapse: collapse; width: 100%; }");
        sb.append("th, td { border:solid 1px #000;}");
        sb.append("</style>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1 style = \"bold; font-size: 40px;\"> Java Property </h1>");
        sb.append("<table>");
        sb.append("<th style = \"bold; text-align: center;\"> Key </th>");
        sb.append("<th> </th>");

        for (Object k : System.getProperties().keySet()) {
            String key = k.toString();
            String value = System.getProperty(key);

            sb.append("<tr>");
            sb.append("<td>" +  k + "</td>");
            sb.append("<td>" +  value + "</td>");
            sb.append("</tr>");
        }

        sb.append("</table>");
        sb.append("</body>");
        sb.append("</html>");
        
        try {
            File file = new File("property.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
