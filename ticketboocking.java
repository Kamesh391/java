package Week5;

public class ticketbooking {
	private static int upper = 1;
    private static int lower = 1;
    private static int middle = 1;
	private static void allocateBerth(Passenger p) {
        switch(p.getPrefBerth()){
            case UPPER:
                if(upper>0) {
                    p.setAllocatedBerth(Berth.UPPER);
                    upper--;
                }
            case LOWER:
                if(p.getAllocatedBerth()==null && lower>0){
                    p.setAllocatedBerth(Berth.LOWER);
                    lower--;
                }
            case MIDDLE:
                if(p.getAllocatedBerth()==null && middle>0){
                    p.setAllocatedBerth(Berth.MIDDLE);
                    middle--;
                }else if(p.getAllocatedBerth()==null && upper>0){
                    p.setAllocatedBerth(Berth.UPPER);
                    upper--;
                }else if(p.getAllocatedBerth()==null && lower>0){
                    p.setAllocatedBerth(Berth.LOWER);
                    lower--;
                }
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
