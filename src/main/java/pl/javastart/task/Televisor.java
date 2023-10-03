package pl.javastart.task;

class Televisor {
    boolean isOn;

    public Televisor(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void showStatus() {
        System.out.println("Telewizor jest włączony: " + isOn);
    }
}
