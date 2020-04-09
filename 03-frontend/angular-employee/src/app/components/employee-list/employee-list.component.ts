import {Component, OnInit} from '@angular/core';
import {EmployeeService} from 'src/app/services/employee.service';
import {Employee} from 'src/app/common/employee';
import { Router } from '@angular/router';
import { Observable } from "rxjs";  

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Observable<Employee[]>;

  constructor(private employeeService: EmployeeService,
    private router: Router) {}

  // listEmployees() {
  //   this.employeeService.getEmployeeList().subscribe(data => {
  //       this.employees = data;
  //     }
  //   )
  // }
  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    // this.employees = this.employeeService.getEmployeesList();
    this.employeeService.getEmployeesList().subscribe(data => {
            this.employees = data;
          }
        )

  }

  employeeDetails(id: number){
    this.router.navigate(['details', id]);
  }

}
