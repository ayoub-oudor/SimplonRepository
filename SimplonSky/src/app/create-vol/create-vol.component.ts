import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AvionService } from '../services/avion.service';
import { VolService } from '../services/vol.service';



@Component({
  selector: 'app-create-vol',
  templateUrl: './create-vol.component.html',
  styleUrls: ['./create-vol.component.css']
})
export class CreateVolComponent implements OnInit {
  List:any=[];
  vol : any = {
    aeroport : '',
    dateDebut : '',
    dateFin : '',
    destination : '',
    duree : '',
    avion : {
      numAvion : ''
    }
    //numAvion : ''
  }
submitted = false;
constructor(
  private volService : VolService,
  private avionService : AvionService,
  private router: Router ) {}


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

saveVol() {
  const data = {
    aeroport: this.vol.aeroport, 
    dateDebut: this.vol.dateDebut,
    dateFin: this.vol.dateFin,
    destination: this.vol.destination,
    duree: this.vol.duree,
    numAvion: this.vol.numAvion
    };

    this.volService.create(data)
    .subscribe(
      response => {
        console.log(response);
        this.submitted = true;          
      },
      error => {
        console.log(error);
      });
      
      this.router.navigate(["admin/vol"])
}


}
