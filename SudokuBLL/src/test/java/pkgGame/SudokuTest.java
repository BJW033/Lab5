package pkgGame;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.junit.Test;

import pkgEnum.eGameDifficulty;

public class SudokuTest {

/*	private void PrintStars() {
		for (int i = 0; i < 50; i++)
			System.out.print("*");
		System.out.println();
	}

	@Test
	public void Sudoku_Test1() {

		try {
			Sudoku s1 = new Sudoku(9);
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}

	@Test(expected = Exception.class)
	public void Sudoku_Test2() throws Exception {

		Sudoku s1 = new Sudoku(10);

	}

	@Test
	public void getRegion_Test1() {

		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 3, 4, 1, 2 };

		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region 0 = 1 2 3 4
		// region 1 = 3 4 1 2

		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);

			region = s1.getRegion(1);
			System.out.println(Arrays.toString(region));
			assertTrue(Arrays.equals(ExpectedRegion, region));

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}

	@Test
	public void getRegion_Test2() {

		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 2, 1, 4, 3 };

		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region at 0,2 = 2 1 4 3

		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);

			region = s1.getRegion(0, 2);
			System.out.println(Arrays.toString(region));
			assertTrue(Arrays.equals(ExpectedRegion, region));

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}

	@Test
	public void Sudoku_test1() {
		int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}

	@Test
	public void Sudoku_test2() {
		int[][] puzzle = { { 5, 5, 5, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}*/


	
	
	
	/* These are commented out because their visibility was switched
	 * to private in the Sudoku class. They are called in the constructors or
	 * methods in the constructors.
	 
	 
	public void Sudoku_isDifficultyMetTest() {
		try {
			Sudoku s1 = new Sudoku(9);
			assertTrue(s1.isDifficultyMet(100));
			assertFalse(s1.isDifficultyMet(1000));
			Sudoku s2 = new Sudoku(9, eGameDifficulty.HARD);
			assertTrue(s2.isDifficultyMet(1005));
			assertFalse(s2.isDifficultyMet(4));
			
		}
		catch(Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}
	
	@Test
	public void Sudoku_removeCellTest()
	{
		try {
			Sudoku s1 = new Sudoku(9,eGameDifficulty.EASY);
			Sudoku s2 = new Sudoku(9,eGameDifficulty.MEDIUM);
			Sudoku s3 = new Sudoku(9,eGameDifficulty.HARD);
			
			System.out.println("**********EASY**********");
			s1.PrintPuzzle();
			System.out.println("**********MEDIUM********");
			s2.PrintPuzzle();
			System.out.println("**********HARD**********");
			s3.PrintPuzzle();

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}
	@Test
	public void Sudoku_SetRemaining_Cells_and_Multiplier_test(){
		int[][] puzzle = { 
				{1,2,9, 6,4,8, 0,3,7, },
				{0,7,0, 1,2,0 ,9,4,8 },
				{0,0,5 ,0,3,9, 1,6,2, },

				{5,0,7, 3,8,4, 0,2,9, },
				{9,3,8 ,2,0,6 ,0,1,0 },
				{2,6,4 ,9,0,1 ,8,5,3, },

				{3,0,2 ,8,0,0 ,4,0,6 },
				{8,0,6 ,0,9,2, 3,0,1 },
				{7,9,1 ,0,6,3 ,2,8,5 }};

			try {
				Sudoku s1 = new Sudoku(puzzle);
				s1.SetRemainingCells();
				assertEquals(s1.PossibleValuesMultiplier(s1.getCells()),288);
				

			} catch (Exception e) {
				fail("Test failed to build a Sudoku");
			}
			
		
	}
	*/
	@Test
	public void Sudoku_Different_Difficulties()
	{
		try {
			Sudoku s1 = new Sudoku(9,eGameDifficulty.EASY);
			Sudoku s2 = new Sudoku(9,eGameDifficulty.MEDIUM);
			Sudoku s3 = new Sudoku(9,eGameDifficulty.HARD);
			
			System.out.println("**********EASY**********");
			s1.PrintPuzzle();
			System.out.println("*********MEDIUM*********");
			s2.PrintPuzzle();
			System.out.println("**********HARD**********");
			s3.PrintPuzzle();

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}

}
