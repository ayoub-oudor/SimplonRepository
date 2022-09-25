import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../services/authentication.service';
import { VolService } from '../services/vol.service';

@Component({
  selector: 'app-vol',
  templateUrl: './vol.component.html',
  styleUrls: ['./vol.component.css']
})
export class VolComponent implements OnInit {

  List:any=[];
  constructor(private volService :VolService,
    private router: Router,
    public authService :  AuthenticationService) {}

  ngOnInit(): void {
    this.Get();
  }

  Get(){
    this.volService.getAll()
    .subscribe((result) => {
      this.List = result;
    });
  }

  GetById(id : number): void {
    this.volService.get(id)
    .subscribe((result) => {
        this.List = result;
        console.log(result);
    })
  }

  update(id: number){
    this.router.navigate(["/update-vol"]);
  }
  delete(id: number) {
    this.volService.delete(id)
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
