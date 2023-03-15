import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        String line = " ";
        for (String company : companies) {
            line += company + ", ";
        }
        StringBuffer sb= new StringBuffer(line);
        sb.deleteCharAt(sb.length()-2);
        System.out.println(sb);
    }
}