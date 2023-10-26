/*
 * package com.crud.Controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.crud.Service.CourseService; import com.crud.entity.Course;
 * 
 * @RestController public class CourseController {
 * 
 * @Autowired private CourseService courseService;
 * 
 * @PostMapping("/addcourse/{name}") public Course addcourse(@RequestBody Course
 * Course,@PathVariable(value = "coursename") String Name) { return
 * courseService.addCourse(Course, Name); }
 * 
 * }
 */