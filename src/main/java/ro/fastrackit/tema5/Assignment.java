package ro.fastrackit.tema5;

import java.util.Objects;
import java.util.UUID;

public class Assignment extends UniqueCollection implements Comparable<Assignment>{
    private UUID uniqueId = UUID.randomUUID();
    private int courseNumber;
    private String assignmentTitle;
    private String assignmentDescription;
    private String difficultyLevel;

    public Assignment(UUID uniqueId, int courseNumber, String assignmentTitle, String assignmentDescription ,
                      String difficultyLevel) {
        this.uniqueId = uniqueId;
        this.courseNumber = courseNumber;
        this.assignmentTitle = assignmentTitle;
        this.assignmentDescription = assignmentDescription;
        this.difficultyLevel = difficultyLevel;
    }

    public Assignment() {

    }

    public UUID getUniqueId() { return uniqueId; }

    public void setUniqueId(UUID uniqueId) { this.uniqueId = uniqueId; }

    public int getCourseNumber() { return courseNumber; }

    public void setCourseNumber(int courseNumber) { this.courseNumber = courseNumber; }

    public String getAssignmentTitle() { return assignmentTitle; }

    public void setAssignmentTitle(String assignmentTitle) { this.assignmentTitle = assignmentTitle; }

    public String getAssignmentDescription() { return assignmentDescription; }

    public void setAssignmentDescription(String assignmentDescription) {
        this.assignmentDescription = assignmentDescription; }

    public String getDifficultyLevel() { return difficultyLevel; }

    public void setDifficultyLevel(String difficultyLevel) { this.difficultyLevel = difficultyLevel; }

    @Override
    public String toString() {
        return "Assignment{" +
                "uniqueId=" + uniqueId +
                ", courseNumber=" + courseNumber +
                ", assignmentTitle='" + assignmentTitle + '\'' +
                ", assignmentDescription='" + assignmentDescription + '\'' +
                ", difficultyLevel='" + difficultyLevel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return courseNumber == that.courseNumber &&
                Objects.equals(uniqueId, that.uniqueId) &&
                Objects.equals(assignmentTitle, that.assignmentTitle) &&
                Objects.equals(assignmentDescription, that.assignmentDescription) &&
                Objects.equals(difficultyLevel, that.difficultyLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueId, courseNumber, assignmentTitle, assignmentDescription, difficultyLevel);
    }

    @Override
    public int compareTo(Assignment o) {
        return 0;
    }

}
