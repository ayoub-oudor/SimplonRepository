import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthenticationService } from '../services/authentication.service';
import { AvionService } from '../services/avion.service';

@Component({
  selector: 'app-avion',
  templateUrl: './avion.component.html',
  styleUrls: ['./avion.component.css']
})
export class AvionComponent implements OnInit {
   List:any=[];
  constructor(private avionService :AvionService,
    private router: Router,
    public authService :  AuthenticationService ) {}

  ngOnInit(): void {
    this.Get();
  }

  Get(){
    this.avionService.getAll()
    .subscribe((result) => {
      this.List = result;
    });
  }

  GetById(id : number): void {
    this.avionService.get(id)
    .subscribe((result) => {
        this.List = result;
        console.log(result);
    })
  }

  update(id: number){
    this.router.navigate(["/update-avion"]);
  }
  delete(id: number) {
    this.avionService.delete(id)
      .subscribe(
        response => {
          console.log(response);
        },
        error => {
          console.log(error);
        }); 

        window.location.reload(); 
  }

}
