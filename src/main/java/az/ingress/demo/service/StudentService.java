package az.ingress.demo.service;




import az.ingress.demo.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class StudentService {


    private  final StudentRepo repo;
    
}
