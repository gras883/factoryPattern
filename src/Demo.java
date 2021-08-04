import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowDialog;

public class Demo {
    public static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    public static void configure(){
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowDialog();
        }else {
            dialog = new HtmlDialog();
        }
    }

    public static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
