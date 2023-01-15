package second;

public class MobilePhone extends MobileDevice{
    private boolean lteSupport;

    @Override
    public void showDeviceInfo(){
        System.out.println("display size: " + displaySize);
        System.out.println("ram: " + ram);
        System.out.println("cpu: " + cpu);
        System.out.println("operating system: " + operatingSystem );
        System.out.println("device type: " + deviceType);
        System.out.println("LTE support: " + lteSupport);
    }

    public boolean isLteSupport() {
        return lteSupport;
    }

    public void setLteSupport(boolean lteSupport) {
        this.lteSupport = lteSupport;
    }
}
