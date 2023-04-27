package test1;
public class Test1Model {
    static String[] msgHistory = new String[30];
    Test1Model(){
        for( int i = 0; i < 30; i++) {
                msgHistory[i] = "";
        }
    }
    public String collectMsg( String msg) {
        String result = "";
        for( int i = 28; i >= 0; i--) {
            msgHistory[i+1] = msgHistory[i];
            result = msgHistory[i] + "\n" + result;
            	  
        }
        msgHistory[0] = msg;
        result = msg + "\n" + result;
        return result;
    }
}