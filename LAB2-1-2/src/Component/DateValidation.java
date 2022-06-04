package Component;

public class DateValidation implements IValidation {
    private String fomat;

    public String getFomat() {
        return fomat;
    }

    public void setFomat(String fomat) {
        this.fomat = fomat;
    }

    @Override
    public boolean validate(String data) {
        return false;
    }
}
