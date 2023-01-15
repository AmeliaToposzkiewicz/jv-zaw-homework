package second;

public class Tablet extends MobileDevice {
    private boolean pencilSupport;

    @Override
    public void showDeviceInfo() {
        System.out.println("display size: " + displaySize);
        System.out.println("ram: " + ram);
        System.out.println("cpu: " + cpu);
        System.out.println("operating system: " + operatingSystem);
        System.out.println("device type: " + deviceType);
        System.out.println("pencil support: " + pencilSupport);
    }

    public boolean isPencilSupport() {
        return pencilSupport;
    }

    public void setPencilSupport(boolean pencilSupport) {
        this.pencilSupport = pencilSupport;
    }
}
