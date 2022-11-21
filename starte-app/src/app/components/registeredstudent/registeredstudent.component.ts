import { Component, OnInit } from '@angular/core';
import Student from 'src/app/Entity/Student';
import { StudentsService } from 'src/app/Services/students.service';

@Component({
  selector: 'app-registeredstudent',
  templateUrl: './registeredstudent.component.html',
  styleUrls: ['./registeredstudent.component.css']
})
export class RegisteredstudentComponent implements OnInit {

  student: Student[]=[];

  deletestudent(student ,index){
    const observe =this.studentservice.deletestudent(student);
    observe.subscribe((response:any)=>{
      console.log(student);
       this.student.splice(index,1);
    });
  }
  constructor(private studentservice:StudentsService) { }

  ngOnInit(): void {
    const promise = this.studentservice.getStudents();
    promise.subscribe((response)=>{
      console.log(response);
      this.student=response as Student[];
    });
  }

}
