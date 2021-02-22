package Interpreter;

public class XmlExpression implements Expression{

    @Override
    public String interpret(String context) {
       if(Tools.isXML(context)){
            return Tools.JSONtoXML(context);
        }else if(Tools.isJSON(context)){
            return context;
        }else{
            return "";
        }
    }
    

}
