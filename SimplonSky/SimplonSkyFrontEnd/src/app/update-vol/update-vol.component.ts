import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AvionService } from '../services/avion.service';
import { VolService } from '../services/vol.service';

@Component({
  selector: 'app-update-vol',
  templateUrl: './update-vol.component.html',
  styleUrls: ['./update-vol.component.css']
})
export class UpdateVolComponent implements OnInit {
  List:any=[];
  id : any;
  vol : any = {
    aeroport : '',
    dateDebut : '',
    dateFin : '',
    destination : '',
    duree : '',
    avion : {
      num_avion : ''
    }
  }
submitted = false;
message ='';
  constructor(
    private volService : VolService,
    private router: Router,
    private avionService : AvionService,
    private route: ActivatedRoute  ) {}

  ngOnInit(): void {
   this.route.params.subscribe(params=>{
      this.id = params["id"];
    })
    this.volService.get(this.id).subscribe(data=>{
      this.vol = data;
    })
    this.Get();
  }
  updateVol(data:any) {
      this.volService.update(data)
      .subscribe(
        response => {
          console.log(response);
          this.submitted = true;
          this.message = 'The vol was updated successfully!';
          this.router.navigate(["admin/vol"]);
        },
        error => {
          console.log(error);
        });
        
        //this.router.navigate(["admin/vol"])

  }

  go(){
    this.router.navigate(["admin/vol"])
  }
  Get(){
    this.avionService.getAll()
    .subscribe((result) => {
      this.List = result;
    });
  }

}
