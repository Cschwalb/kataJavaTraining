public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        double average = (s1 + s2 + s3) / 3;
        char ret = 'A';
        if(average >= 90 && average <= 100) {
            ret = 'A';
        }
        else if(average >= 80 && average <= 90) {
            ret = 'B';
        }
        else if(average >= 70 && average <= 80) {
            ret = 'C';
        }
        else if(average >= 60 && average <= 70) {
            ret = 'D';
        }
        else if(average < 60) {
            ret = 'F';
        }
        return ret;
    }
}
