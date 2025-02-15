package commonproblemtests;
import commonproblems.implementashoppingcart.ImplementShoppingCart;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import commonproblems.designavotingsystem.*;
import java.util.*;
public class VoteSystemTest {
    @Test
    void testCastVote() {
        assertDoesNotThrow(() -> {
            DesignVotingSystem.castVote("Shristy");
            DesignVotingSystem.castVote("Nancy");
            DesignVotingSystem.castVote("Arjun");
        });
    }
    @Test
    void testDisplaySortedResults() {
        DesignVotingSystem.castVote("Arjun");
        DesignVotingSystem.castVote("Nancy");
        DesignVotingSystem.castVote("Arjun");
        assertEquals(0, DesignVotingSystem.displaySortedVotes());

    }
}
