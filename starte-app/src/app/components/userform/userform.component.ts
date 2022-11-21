import { Component, OnInit } from '@angular/core';
import Student from 'src/app/Entity/Student';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {

  uNames:String="";
  salary:Number=0;
  title1 = 'Hi This is Sai and this is from TS file';
  desc1:String="I'm looking for becoming a good Full Stack Developer";

  student:Student = new Student();
  save(){
    console.log("Hi !, your requested amount is "+this.salary+"for the user "+this.uNames);
  }

  constructor() { }

  ngOnInit(): void {
  }

}
