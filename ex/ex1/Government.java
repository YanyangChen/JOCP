package ex1;

class Government {				//existing class for Government
    private int treasuryBalance;

    public void collectMoney(int money) {
        treasuryBalance += money;
    }
    
    public void treasuryReport() {
        System.out.println("Government has: "+ treasuryBalance);
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
