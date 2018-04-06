
/**
 * Write a description of csvfiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import org.apache.commons.csv.*;
public class csvfiles {
    public static void getinfo(CSVParser parser,String country){
    for(CSVRecord record:parser){
        String getcountry=record.get("Country");
    if(getcountry.contains(country)){
    System.out.print(record.get("Country") + ":" + record.get("Exports") +
                     ":"+record.get("Value")); 
    }
    }
}
    
    public static void listExporterstwoproducts(CSVParser parser, String a,
                                               String b){
    for(CSVRecord record:parser){
    String export=record.get("Exports");
        if(export.contains(a) && export.contains(b)){
            String cun= record.get("Country");
        System.out.print(cun);
        }
    }
    }
    
    public static void bigExporters(CSVParser parser,String value){
        for(CSVRecord record:parser){
            String values=record.get("Value");
    if(values.length()>value.length()){   
    System.out.println(record.get("Country"));
    }
    }
    }

    
    public static void tester(){
    FileResource fr=new FileResource();
    CSVParser parser=fr.getCSVParser();
    //System.out.println("INFORMATION ON GERMANY");
    getinfo(parser,"germany");
    System.out.println();
    //System.out.println("LIST OF EXPORTERS WHICH EXPORT GOLD AND DIAMONDS");
    listExporterstwoproducts(parser,"gold","diamonds");
    System.out.println();
    //System.out.println("LIST OF EXPORTERS WITH VALUE GREATER THAN $999,999,999");
    bigExporters(parser,"$999,999,999");
}   
}
