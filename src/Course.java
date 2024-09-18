
public class Course
{

    String name;

    String id;

    int credits;

    public Course( String name, String id, int credits )
    {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }//Course

    @Override
    public String toString()
    {
        return "Course{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", credits=" + credits + '}';
    }//String toString
}//classCourse