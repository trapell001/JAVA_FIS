package Component;

public class InputComponent {
    private IValidation validation;
    private String data;

    public InputComponent(IValidation validation, String data) {
        this.validation = validation;
        this.data = data;
    }
    public void setValidation(IValidation validation) {
        this.validation = validation;
    }
    public void setData(String data) {
        this.data = data;
    }
    public  void Display(){

    }
    public boolean validate(){
        return true;
    }
}
