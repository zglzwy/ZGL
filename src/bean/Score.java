package bean;

public class Score {
    private String studentid;
    private String courceid;
    private int score;

    public Score(String studentid, String courceid, int score) {
        this.studentid = studentid;
        this.courceid = courceid;
        this.score = score;
    }

    public Score() {
    }

    @Override
    public String toString() {
        return "bean.Score{" +
                "studentid='" + studentid + '\'' +
                ", courceid='" + courceid + '\'' +
                ", score=" + score +
                '}';
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getCourceid() {
        return courceid;
    }

    public void setCourceid(String courceid) {
        this.courceid = courceid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
