package ex1;

class GovernmentFinder {		//Singleton Factory for class Government
    private static GovernmentFinder myFinder = null;
    private Government theGovernment;

    private GovernmentFinder () { }

    public static synchronized GovernmentFinder getInstance() {
        if (myFinder == null) {
            myFinder = new GovernmentFinder();
        }
        return myFinder;
    }

    public synchronized Government getGovernment() {
        if (theGovernment == null) {
            theGovernment = new Government ();
        }
        return theGovernment;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
