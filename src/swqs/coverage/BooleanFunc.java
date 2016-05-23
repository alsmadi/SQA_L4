package swqs.coverage;

public final class BooleanFunc {
	
	public static boolean aAndbOrC(boolean A, boolean B, boolean C) {
		if(A && B){
			return true;
		}
		else if(C) {
			return true;
		}
		else {
			return false;
		}
	}
        
        public static boolean aOrbAndC(boolean A, boolean B, boolean C) {
		if(B && C){
			return true;
		}
		else if(A) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
