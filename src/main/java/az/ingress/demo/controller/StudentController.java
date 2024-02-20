package az.ingress.demo.controller;


import az.ingress.demo.dto.Studentdto;
import az.ingress.demo.model.Student;
import az.ingress.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("test")
    public  String test(){
        return "salam";
    }

    @GetMapping("getStudent/{id}")
    public Student getStudent(@PathVariable("id") Long id){
        return  studentService.getStudent(id);

    }

    @PostMapping("/save")

    public ResponseEntity<Student> addStudent(@RequestBody Student student){

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(studentService.addStudent(student));

    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable( "id") Long id,@RequestBody Student student){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.updateStudent(id,student));

    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable( "id") Long id){
        studentService.deleteStudent(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT).
                build();

    }



}
