public class Student {
    private final int score;
    private final String name;

    Student(int sc, String n)
    {
        this.score=sc;
        this.name=n;
    }

    public int getScore()
    {
        return score;
    }

    public String getName() {
        return name;
    }
}
