import java.util.List;

public interface StudentDao {
	
	boolean saveStudent(Student std);
	boolean updateStudent(Student std);
	boolean deleteStudent(int id);
	List<Student> getStudentList();

}
