package Interpreter;

public class JsonExpression implements Expression {
    
    @Override
    public String interpret(String context) {
        if(Tools.isXML(context)){
            return Tools.XMLtoJSON(context);
        }else if(Tools.isJSON(context)){
            return context;
        }else{
            return "";
        }
    }
    

}
