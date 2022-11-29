package com.javatpoint.endpoint;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.entity.Student;
import com.javatpoint.service.StudentService;
@RestController
public class StudentController 
{
@Autowired
private StudentService serv;

@GetMapping(value = "/student")
public List<Student> getProduct() 
{
List<Student> products = serv.findAll();
return products;
}
}
