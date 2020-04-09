import {Injectable} from '@angular/core';
import {map} from 'rxjs/operators';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/internal/Observable';
import {Employee} from '../common/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl = "http://localhost:8080/api/v1/employees";

  constructor(private httpClient: HttpClient) {
  }


getEmployee(id: number): Observable<any> {
  return this.httpClient.get(`${this.baseUrl}/${id}`);
}

createEmployee(employee: Object): Observable<Object> {
  return this.httpClient.post(`${this.baseUrl}`, employee);
}

getEmployeesList(): Observable<any> {
  return this.httpClient.get(`${this.baseUrl}`);
}
}



