package pkgEnum;

import static org.junit.Assert.*;

import org.junit.Test;

public class eGameDifficultyTest {

		
		@Test
		public void GameDifficulty_Test(){
		eGameDifficulty eGD = eGameDifficulty.get(99);
		assertNull(eGD);
		eGD = eGameDifficulty.get(100);
		assertEquals(eGameDifficulty.EASY, eGD);
		eGD = eGameDifficulty.get(101);
		assertEquals(eGameDifficulty.EASY, eGD);
		eGD = eGameDifficulty.get(499);
		assertEquals(eGameDifficulty.EASY, eGD);
		eGD = eGameDifficulty.get(500);
		assertEquals(eGameDifficulty.MEDIUM, eGD);
		eGD = eGameDifficulty.get(100000);
		assertEquals(eGameDifficulty.HARD, eGD);
		}


}
