package Component;

public class StringMaxLengthValidation implements IValidation{
    private int length;
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean validate(String data) {
        return false;
    }
}
