package ex1;

public class NoteBook111 {
    private static int counter;
    private static int battCounter;    
    private Battery batt;
    
    NoteBook111() {
        counter++;
    }

    void replaceBattery(Battery b) {
        batt = b;
    }
    
    void getSytemStatus() {
        if (batt != null) {
            System.out.print("Notebook is healthy and battery is ");
            System.out.print(batt.batteryLevel);
            System.out.println("%");
        } else {
            System.out.println("Not Powered On");
        }
    }
    
    static class Battery {
        private static int counter;
        private int batteryLevel = 10;
        Battery() {
            counter++;
            battCounter++;
        }
        int readBatteryLevel() {
            return batteryLevel;
        }
        void charging(int hours) {
            batteryLevel += 10 * hours;
            if (batteryLevel > 100) {
                batteryLevel = 100;
            }
        }
        static void getCounters() {
            System.out.print(NoteBook111.counter + " : ");
            System.out.print(counter + " : " );
            System.out.println(battCounter);
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
