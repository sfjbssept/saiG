import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


const BASE_URL="http://localhost:5000/students/";

@Injectable({
  providedIn: 'root'
})
export class StudentsService {
  createstudent(student:{ firstname :String,lastname: String,age:Number,class1:number,subject:String})
  {return this.http.post(BASE_URL,student);}
  getStudents(){
     return this.http.get(BASE_URL);
  }
  deletestudent(student:any){
    return this.http.delete(BASE_URL+student.firstname)
  }
  constructor(public http:HttpClient) { }
}
