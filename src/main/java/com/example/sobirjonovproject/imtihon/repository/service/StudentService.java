package com.example.sobirjonovproject.imtihon.repository.service;
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }

    public Student finById(Long id){
        return studentRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("Student with ID " + id + " not found"));
    }

    @Transactional(readOnly = true)
    public Page<Student> findAll(Pageable pageable){
        return  studentRepository.findAll(pageable);
    }
}

}
