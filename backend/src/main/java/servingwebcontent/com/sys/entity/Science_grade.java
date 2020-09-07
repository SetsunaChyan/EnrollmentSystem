package servingwebcontent.com.sys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="science_grade", schema="enroll_system_DB")
public class Science_grade
{
    @EmbeddedId
    private Science_gradeKey id;
    @Basic
    @Column(name="=ExaminationNumber")
    private String ExaminationNumber;
    @Basic
    @Column(name="Name")
    private String name;
    @Basic
    @Column(name="Chinese_grade")
    private int Chinese_grade;
    @Basic
    @Column(name="Math_grade")
    private int Math_grade;
    @Basic
    @Column(name="English_grade")
    private int English_grade;
    @Basic
    @Column(name="Physics_grade")
    private int Physics_grade;
    @Basic
    @Column(name="Chemistry_grade")
    private int Chemistry_grade;
    @Basic
    @Column(name="Biology_grade")
    private int Biology_grade;
    @Basic
    @Column(name="Total_points")
    private int Total_points;
    @Basic
    @Column(name="Ranking")
    private int Ranking;

    public String getExaminationNumber()
    {
        return ExaminationNumber;
    }
    public void setExaminationNumber(String ExaminationNumber)
    {
        this.ExaminationNumber=ExaminationNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public int getChinese_grade()
    {
        return Chinese_grade;
    }

    public void setChinese_grade(int Chinese_grade)
    {
        this.Chinese_grade=Chinese_grade;
    }

    public int getMath_grade()
    {
        return Math_grade;
    }

    public void setMath_grade(int Math_grade)
    {
        this.Math_grade=Math_grade;
    }

    public int getEnglish_grade()
    {
        return English_grade;
    }

    public void setEnglish_grade(int English_grade)
    {
        this.English_grade=English_grade;
    }

    public int getPhysics_grade()
    {
        return Physics_grade;
    }

    public void setPhysics_grade(int Physics_grade)
    {
        this.Physics_grade=Physics_grade;
    }

    public int getChemistry_grade()
    {
        return Chemistry_grade;
    }

    public void setChemistry_grade(int Chemistry_grade)
    {
        this.Chemistry_grade=Chemistry_grade;
    }

    public int getBiology_grade()
    {
        return Biology_grade;
    }

    public void setBiology_grade(int Biology_grade)
    {
        this.Biology_grade=Biology_grade;
    }

    public int getTotal_points()
    {
        return Total_points;
    }

    public void setTotal_points(int Total_points)
    {
        this.Total_points=Total_points;
    }

    public int getRanking()
    {
        return Ranking;
    }

    public void setRanking(int Ranking)
    {
        this.Ranking=Ranking;
    }

    public Science_grade()
    {
    }

    public Science_gradeKey getId()
    {
        return id;
    }

    public void setId(Science_gradeKey id)
    {
        this.id=id;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(id,ExaminationNumber,name,Chinese_grade,Math_grade,English_grade,Physics_grade,Chemistry_grade,Biology_grade,Total_points,Ranking);
    }
}
