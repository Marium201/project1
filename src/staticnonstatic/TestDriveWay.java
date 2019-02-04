package staticnonstatic;

public class TestDriveWay {
	
	public static void main(String[] args) {
		
		House arif = new House();
		House anthony = new House();
		
		arif.setDriveWaySize(6);
		arif.getDriveWaySize();
		
		System.out.print(arif.setDriveWaySize(6));
		
		anthony.setDriveWaySize(7);
		anthony.getDriveWaySize();
		
		House.moveDriveWayDirection();
		
	}

}
