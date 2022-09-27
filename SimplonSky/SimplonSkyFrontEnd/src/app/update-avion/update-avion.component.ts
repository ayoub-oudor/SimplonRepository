import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AvionService } from '../services/avion.service';

@Component({
  selector: 'app-update-avion',
  templateUrl: './update-avion.component.html',
  styleUrls: ['./update-avion.component.css']
})
export class UpdateAvionComponent implements OnInit {
  id : any;
  avion : any = {
    id: '',
    capacite : '',
    modele : ''
}
submitted = false;
message ='';
  constructor(
    private avionService : AvionService,
    private router: Router,
    private route: ActivatedRoute  ) {}

  ngOnInit(): void {
   this.route.params.subscribe(params=>{
      this.id = params["id"];
    })
    this.avionService.get(this.id).subscribe(data=>{
      this.avion = data;
    })
  }
  updateAvion(data:any) {
      this.avionService.update(data)
      .subscribe(
        response => {
          console.log(response);
          this.submitted = true;
          this.message = 'The airplane was updated successfully!';
        },
        error => {
          console.log(error);
        });
        
        this.router.navigate(["admin/avion"])
  }

  go(){
    this.router.navigate(["admin/avion"])
  }

}
