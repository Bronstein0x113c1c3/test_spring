package com.example.demo_testing.controller;
import com.example.demo_testing.repo.*;
import com.example.demo_testing.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
public class StudentController {
    @Autowired
    public StudentRepo TheRepo;

    @GetMapping("/students")
    public ResponseEntity<List<Human>> getStudent(){
        List<Human> res = (List<Human>) TheRepo.findAll();
        return new ResponseEntity<>(res,HttpStatus.OK);
    }
}
