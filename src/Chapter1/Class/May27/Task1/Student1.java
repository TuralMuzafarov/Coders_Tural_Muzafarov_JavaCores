package Chapter1.Class.May27.Task1;

public class Student1 {
    public Grades grade;
    public int score;

    public Grades getGrade(int score)
    {
        switch (score/10)
        {
            case 10:
            case 9:
            {

                this.grade = Grades.A;
                return Grades.A;
            }
            case 8:
            {
                this.grade = Grades.B;
                return Grades.B;

            }
            case 7:
            {
                this.grade = Grades.C;
                return Grades.C;

            }
            case 6:
            {
                this.grade = Grades.D;
                return  Grades.D;

            }
            case 5:
            {
                this.grade = Grades.E;
                return Grades.E;

            }
            default:
            {
                this.grade = Grades.F;
                return Grades.F;

            }

        }

    }

}
