package Exercises.P05_FootballTeamGenerator;
/* @created by Ch.B. on 16-Mar-21 - 23:48 */

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }

        this.name = name;
    }

    private void setEndurance(int endurance) {
        validateStatus(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        validateStatus(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        validateStatus(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        validateStatus(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        validateStatus(shooting, "Shooting");
        this.shooting = shooting;
    }

    public String getName() {
        return name;
    }

    public double overallSkillLevel() {
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / 5.0;

    }

    private void validateStatus(int val, String exceptionPrefix) {
        if (val < 0 || val > 100) {
            throw new IllegalArgumentException(exceptionPrefix + " should be between 0 and 100.");
        }
    }
}
