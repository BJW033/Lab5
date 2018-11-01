package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {

		EASY(100), MEDIUM(500), HARD(1000);
		
		private final int iDifficulty;
		private static final Map<Integer,eGameDifficulty> lookup = new HashMap<Integer,eGameDifficulty>();
		
		static {

			for(eGameDifficulty e : eGameDifficulty.values()) {
				lookup.put(e.getiDifficulty(),e);
			}
		}
		private eGameDifficulty(int x) {
			this.iDifficulty = x;
		}
		public int getiDifficulty(){
			return iDifficulty;
		}
		public static eGameDifficulty get(int iDiff) {
			eGameDifficulty eGDSetValue = null;
			for(eGameDifficulty eGD: eGameDifficulty.values()) {
				if(eGD.iDifficulty <=iDiff) {
					eGDSetValue = eGD;
				}
			}
			return eGDSetValue;
		}
		
		
		
		
		
		
	}
