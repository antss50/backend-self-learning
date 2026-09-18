import java.util.*;

public class studentScore {
    public static int totalScore(int[] scoreList) {
        int totalScore = 0;
        for (int i = 0; i < scoreList.length; i++) {
            totalScore += scoreList[i];
        }
        return totalScore;
    };

    public static double avgScore(int[] scoreList) {
        int total = totalScore(scoreList);
        return total/scoreList.length;
    }

    public static double maxScore(int[] scoreList) {
        int max = scoreList[0];
        for (int i = 1; i < scoreList.length; i++) {
            if (scoreList[i] > max) {
                max = scoreList[i];
            }
        }
        return max;
    }

    public static double minScore(int[] scoreList) {
        int min = scoreList[0];
        for (int i = 1; i < scoreList.length; i++) {
            if (scoreList[i] < min) {
                min = scoreList[i];
            }
        }
        return min;
    }

    public static String result (double avgScore) {
        if (avgScore < 60)
            return "Xep loai E";
        if (avgScore >= 60 && avgScore <= 69)
            return "Xep loai D";
        if (avgScore >= 70 && avgScore <= 79)
            return "Xep loai C";
        if (avgScore >= 80 && avgScore <= 89)
            return "Xep loai B";
        if (avgScore >= 90)
            return "Xep loai A";
        return "Khong xep loai";
    }

    public static int countPassSubjects(int[] scoreList) {
        int count = 0;
        for (int i = 0; i < scoreList.length; i++) {
            if (scoreList[i] >= 50)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String studentName = "Ta Ngoc An";
        int[] scores = {
                85,
                90,
                78,
                92,
                88
        };
        System.out.println("================================");
        System.out.println("STUDENT SCORE REPORT");
        System.out.println("================================");
        System.out.println("Student name: " + studentName);
        System.out.print("Score: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        System.out.println("Total score: " + totalScore(scores));
        System.out.println("Avg score: " + avgScore(scores));
        System.out.println("Max score: " + maxScore(scores));
        System.out.println("Min score: " + minScore(scores));
        System.out.println("Total pass subjects: " + countPassSubjects(scores));
        System.out.println("Grade: " + result(avgScore(scores)));
    }
}