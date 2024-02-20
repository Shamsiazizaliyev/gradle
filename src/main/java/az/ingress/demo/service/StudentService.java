package az.ingress.demo.service;




import az.ingress.demo.model.Student;
import az.ingress.demo.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class StudentService {


    @Autowired
    private StudentRepo studentRepository;


    public Student getStudent(Long id){


        return studentRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
    }



    public Student addStudent( Student student){

        return studentRepository.save(student);



    }


    public Student updateStudent( Long id,Student student){
        getStudent(id);
        student.setId(id);
        return  studentRepository.save(student);

    }


    public void deleteStudent( Long id){

        studentRepository.deleteById(id);


    }

}
