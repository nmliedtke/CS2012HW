
public interface IElectionData {
	
	void addCandidate(String Candidate) throws CandidateExistsException;
	void processVote(String first, String second, String third) throws DuplicateVotesException, UnknownCandidateException ;

}
