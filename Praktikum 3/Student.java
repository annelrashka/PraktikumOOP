public interface Student {
    public long getStudentID();
    public double getOverallGPA();
    public double getGrade();
    public  String getMajor();
    public boolean applyMajor(String major);
    public void applyScholarship(String major);
    public void promoteGrade(double z);
    public void payTuition(boolean x, String y);
}
