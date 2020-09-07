package servingwebcontent.com.sys.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="arts_grade", schema="enroll_system_DB")
public class Arts_grade
{
    @EmbeddedId
    private Arts_gradeKey id;
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
    @Column(name="History_grade")
    private int History_grade;
    @Basic
    @Column(name="Politics_grade")
    private int Politics_grade;
    @Basic
    @Column(name="Geography_grade")
    private int Geography_grade;
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

    public int getHistory_grade()
    {
        return History_grade;
    }

    public void setHistory_grade(int History_grade)
    {
        this.History_grade=History_grade;
    }

    public int getPolitics_grade()
    {
        return Politics_grade;
    }

    public void setPolitics_grade(int Politics_grade)
    {
        this.Politics_grade=Politics_grade;
    }

    public int getGeography_grade()
    {
        return Geography_grade;
    }

    public void setGeography_grade(int Geography_grade)
    {
        this.Geography_grade=Geography_grade;
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

    public Arts_grade()
    {
    }

    public Arts_gradeKey getId()
    {
        return id;
    }

    public void setId(Arts_gradeKey id)
    {
        this.id=id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id,ExaminationNumber,name,Chinese_grade,Math_grade,English_grade,History_grade,Politics_grade,Geography_grade,Total_points,Ranking);
    }
}
