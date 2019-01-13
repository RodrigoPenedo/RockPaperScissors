import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GameTest {
    public String playMatch(String player1, String player2) {
        if (player1.equals(player2)) {
            return ("It's a tie!");
        } else if (player1.equals("rock")) {
            if (player2.equals("paper")) {
                return ("You Win!");
            } else {
                return ("You Lose!");
            }
        } else if (player1.equals("paper")) {
            if (player2.equals("scissors")) {
                return ("You Win!");
            } else {
                return ("You Lose!");
            }
        } else if (player1.equals("scissors")) {
            if (player2.equals("rock")) {
                return ("You Win!");
            } else {
                return ("You Lose!");
            }
        } else {
            return ("Invalid input please try again.");
        }
    }
    
    @Test
    public void invalidInputsShouldReturnError() {
        //Given / When
        String result = playMatch("A", "B");
        String expected = "Invalid input please try again.";

        //Then
        assertEquals(result, expected);
    }

    @Test
    public void rockBeatsScissors() {
        //Given / When
        String result = playMatch("scissors", "rock");
        String expected = "You Win!";

        //Then
        assertEquals(result, expected);
    }

    @Test
    public void paperBeatsRock() {
        //Given / When
        String result = playMatch("rock", "paper");
        String expected = "You Win!";

        //Then
        assertEquals(result, expected);
    }

    @Test
    public void scissorsBeatsPaper() {
        //Given / When
        String result = playMatch("paper", "scissors");
        String expected = "You Win!";

        //Then
        assertEquals(result, expected);
    }

    @Test
    public void scissorsLosesAgainstRock() {
        //Given / When
        String result = playMatch("rock", "scissors");
        String expected = "You Lose!";

        //Then
        assertEquals(result, expected);
    }

    @Test
    public void paperLosesAgainstScissors() {
        //Given / When
        String result = playMatch("scissors", "paper");
        String expected = "You Lose!";

        //Then
        assertEquals(result, expected);
    }

    @Test
    public void rockLosesAgainstPaper() {
        //Given / When
        String result = playMatch("paper", "rock");
        String expected = "You Lose!";

        //Then
        assertEquals(result, expected);
    }

    @Test
    public void bothPlayersPlayingRockShouldResultInATie() {
        //Given / When
        String result = playMatch("rock", "rock");
        String expected = "It's a Tie!";

        //Then
        assertEquals(result, expected);
    }

    @Test
    public void bothPlayersPlayingPaperShouldResultInATie() {
        //Given / When
        String result = playMatch("paper", "paper");
        String expected = "It's a Tie!";

        //Then
        assertEquals(result, expected);
    }

    @Test
    public void bothPlayersPlayingScissorsShouldResultInATie() {
        //Given / When
        String result = playMatch("scissors", "scissors");
        String expected = "It's a Tie!";

        //Then
        assertEquals(result, expected);
    }
}