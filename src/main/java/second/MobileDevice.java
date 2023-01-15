package second;

public class MobileDevice {
    int displaySize;
    int ram;
    String cpu;
    String operatingSystem;
    String deviceType;

    public void showDeviceInfo(){
        System.out.println("display size: " + displaySize);
        System.out.println("ram: " + ram);
        System.out.println("cpu: " + cpu);
        System.out.println("operating system: " + operatingSystem );
        System.out.println("device type: " + deviceType);
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
}
