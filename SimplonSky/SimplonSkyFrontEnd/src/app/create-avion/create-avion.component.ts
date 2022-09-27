import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthenticationService } from '../services/authentication.service';
import { AvionService } from '../services/avion.service';

@Component({
  selector: 'app-create-avion',
  templateUrl: './create-avion.component.html',
  styleUrls: ['./create-avion.component.css']
})
export class CreateAvionComponent implements OnInit {
  avion : any = {
      capacite : '',
      modele : ''
  }
  submitted = false;
  constructor(
    private avionService : AvionService,
    private router: Router
    ) {}


  ngOnInit(): void {
  }
  saveAvion() {
    const data = {
      capacite: this.avion.capacite,
      modele: this.avion.modele
      };

      this.avionService.create(data)
      .subscribe(
        response => {
          console.log(response);
          this.submitted = true;          
        },
        error => {
          console.log(error);
        });
        
        this.router.navigate(["admin/avion"])
  }
 

}
