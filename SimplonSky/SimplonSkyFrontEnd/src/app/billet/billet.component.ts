import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../services/authentication.service';
import { BilletService } from '../services/billet.service';

@Component({
  selector: 'app-billet',
  templateUrl: './billet.component.html',
  styleUrls: ['./billet.component.css']
})
export class BilletComponent implements OnInit {

  List:any=[];
  constructor(private avionService :BilletService,
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
