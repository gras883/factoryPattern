package factory;

import buttons.Button;

/*
Base Creator
 */
public abstract class Dialog {
    public  void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
