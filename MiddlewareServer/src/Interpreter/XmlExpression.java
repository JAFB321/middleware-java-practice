package Interpreter;

public class XmlExpression implements Expression{

    @Override
    public String interpret(String context) {
       if(Tools.isJSON(context)){
            return Tools.JSONtoXML(context, "root");
        }else if(Tools.isXML(context)){
            return context;
        }else{
            return "";
        }
    }
    

}
