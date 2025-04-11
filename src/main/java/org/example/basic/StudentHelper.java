package org.example.basic;

public class StudentHelper {

    /* PROBLEM 1 */
    /*
     * You get a grade B if marks are between 51 and 80 (both inclusive). Except for Maths where the upper limit is increased by 10.
     */

    // Grade B constants
    private static final int GRADE_B_LOWER_LIMIT = 51;
    private static final int GRADE_B_UPPER_LIMIT = 80;
    private static final int MATHS_GRADE_B_EXTRA = 10;

    // Grade A constants
    private static final int GRADE_A_THRESHOLD = 90;
    private static final int MATHS_GRADE_A_EXTRA = 5;

    public boolean isGradeB(int marks, boolean isMaths) {
        int upperLimit = isMaths  ? GRADE_B_UPPER_LIMIT + MATHS_GRADE_B_EXTRA : GRADE_B_UPPER_LIMIT;
        return marks >= GRADE_B_LOWER_LIMIT && marks <= upperLimit;
    }

    // Quiz qualification constants
    private static final int GOOD_MARKS_THRESHOLD = 80;
    private static final int BAD_MARKS_THRESHOLD = 20;
    private static final int MATHS_THRESHOLD_EXTRA = 5;


    /* PROBLEM 2 */
	/*
	You are awarded a grade based on your marks.
	Grade A = 91 to 100, Grade B = 51 to 90, Otherwise Grade C
	Except for Maths where marks to get a Grade are 5 higher than required for other subjects.
	*/

    public String getGrade(int marks, boolean isMaths) {
        if (isGradeA(marks, isMaths)) {
            return "A";
        } else if (isGradeBRange(marks, isMaths)) {
            return "B";
        }
        return "C";
    }

    private boolean isGradeA(int marks, boolean isMaths) {
        int gradeAThreshold = isMaths ? GRADE_A_THRESHOLD + MATHS_GRADE_A_EXTRA : GRADE_A_THRESHOLD;
        return marks > gradeAThreshold;
    }

    private boolean isGradeBRange(int marks, boolean isMaths) {
        int lowerLimit = isMaths ? GRADE_B_LOWER_LIMIT + MATHS_THRESHOLD_EXTRA : GRADE_B_LOWER_LIMIT - 1;
        return marks > lowerLimit && marks <= GRADE_A_THRESHOLD;
    }




    /*  PROBLEM 3
     * You and your Friend are planning to enter a Subject Quiz.
     * However, there is a marks requirement that you should attain to qualify.
     *
     * Return value can be YES, NO or MAYBE.
     *
     * YES If either of you are very good at the subject(has 80 or more marks)
     * However, there is an exception that if either of you is not good in the subject(20 or less marks), it is NO.
     * In all other conditions, return MAYBE.
     *
     * However, the definition for good and not good are 5 marks higher if the subject is Mathematics.
     *
     * marks1 - your marks
     * marks2 - your friends marks
     */

    public String willQualifyForQuiz(int marks1, int marks2, boolean isMaths) {
        int badThreshold = isMaths ? BAD_MARKS_THRESHOLD + MATHS_THRESHOLD_EXTRA : BAD_MARKS_THRESHOLD;
        int goodThreshold = isMaths ? GOOD_MARKS_THRESHOLD + MATHS_THRESHOLD_EXTRA : GOOD_MARKS_THRESHOLD;

        if (marks1 <= badThreshold || marks2 <= badThreshold) {
            return "NO";
        }
        if (marks1 >= goodThreshold || marks2 >= goodThreshold) {
            return "YES";
        }
        return "MAYBE";
    }

}