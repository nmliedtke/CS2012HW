import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Examples {
	public Examples(){
		System.out.println("The candidates are ");
	}
	
	ElectionData Setup1 () {
	ElectionData ED = new ElectionData();
	try {
		ED.addCandidate("gompei");
		ED.addCandidate("husky");
		ED.addCandidate("John Cena");
		
		ED.processVote("John Cena", "gompei", "husky");
		ED.processVote("John Cena", "husky", "gompei");
		ED.processVote("gompei", "husky", "John Cena");
	} catch (Exception e) {}
	
	return(ED);
	
	}
	
	ElectionData Setup2 () {
		ElectionData ED = new ElectionData();
		try {
			ED.addCandidate("gompei");
			ED.addCandidate("husky");
			ED.addCandidate("John Cena");
			
			ED.processVote("gompei", "husky", "John Cena");
			ED.processVote("gompei", "husky", "John Cena");
			ED.processVote("John Cena", "husky", "gompei");
			ED.processVote("husky", "gompei", "gompei");

		} catch (Exception e) {}
		
		return(ED);
		
		}
	
	ElectionData Setup3 () {
		ElectionData ED = new ElectionData();
		try {
			ED.addCandidate("gompei");
			ED.addCandidate("husky");
			ED.addCandidate("John Cena");
			
			ED.processVote("gompei", "husky", "John Cena");
			ED.processVote("gompei", "husky", "SuperMan");
			ED.processVote("John Cena", "husky", "gompei");
			ED.processVote("husky", "gompei", "gompei");

		} catch (Exception e) {}
		
		return(ED);
		
		}
	
	
	
	@Test
	public void testSetup1()  {
		//System.out.println(Setup1().findWinnerMostFirstVotes());
		assertEquals("John Cena", Setup1().findWinnerMostPoints());
		assertEquals("John Cena", Setup1().findWinnerMostFirstVotes());
		assertFalse(Setup1().getBallot().contains("Batman"));
	

	}
	
	@Test(expected = CandidateExistsException.class)
	public void testCandidateExistsException() throws CandidateExistsException{
		//System.out.println(Setup1().findWinnerMostFirstVotes());
		ElectionData data = new ElectionData();
		data.addCandidate("1");
		data.addCandidate("2");
		data.addCandidate("3");
		data.addCandidate("4");
		data.addCandidate("5");
		data.addCandidate("1");
		
	}
	
	
	
//	@Test
//	public void testSetup2() throws CandidateExistsException {
//		System.out.println(Setup2().findWinnerMostFirstVotes());
//		assertEquals("husky", Setup2().findWinnerMostPoints());
//		assertEquals("John Cena", Setup2().findWinnerMostFirstVotes());
//		assertFalse(Setup2().getBallot().contains("Batman"));
//		Setup2().addCandidate("Batman");
//		assertTrue(Setup2().getBallot().contains("Batman"));
//
//	}
//	
//	@Test
//	public void testSetup3() throws CandidateExistsException {
//		System.out.println(Setup3().findWinnerMostFirstVotes());
//		assertEquals("husky", Setup3().findWinnerMostPoints());
//		assertEquals("John Cena", Setup3().findWinnerMostFirstVotes());
//		assertFalse(Setup3().getBallot().contains("Batman"));
//		Setup3().addCandidate("Batman");
//		assertTrue(Setup3().getBallot().contains("Batman"));
//
//	}
//	
//	@Test
//	public void check() {
//
//		assertEquals(1, 1+0);
//	}
	
}
