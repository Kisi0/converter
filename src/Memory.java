public class Memory {

    private double memoryValue;

    public void addToMemory(double Value) {
        memoryValue += Value;

    }

    public double recallMemory() {
        return memoryValue;
    }

    public void clearMemory() {
        memoryValue = 0.0;
    }
}
