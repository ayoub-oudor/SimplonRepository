import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AvionComponent } from './avion/avion.component';
import { VolComponent } from './vol/vol.component';
import { BilletComponent } from './billet/billet.component';
import { CreateAvionComponent } from './create-avion/create-avion.component';
import { UpdateAvionComponent } from './update-avion/update-avion.component';
import { CreateVolComponent } from './create-vol/create-vol.component';
import { UpdateVolComponent } from './update-vol/update-vol.component';
import { CreateBilletComponent } from './create-billet/create-billet.component';
import { UpdateBilletComponent } from './update-billet/update-billet.component';
import { CreateResponsableVolComponent } from './create-responsable-vol/create-responsable-vol.component';
import { UpdateResponsableVolComponent } from './update-responsable-vol/update-responsable-vol.component';
import { CreateResponsableBilletComponent } from './create-responsable-billet/create-responsable-billet.component';
import { UpdateResponsableBilletComponent } from './update-responsable-billet/update-responsable-billet.component';
import { LoginComponent } from './login/login.component';
import { AdminTemplateComponent } from './admin-template/admin-template.component';
import { AppComponent } from './app.component';
import { AuthentificationGuard } from './guards/authentification.guard';

const routes : Routes=[
  {path: "login", component : LoginComponent},
  {path: "", component : LoginComponent},
   {path: "admin", component : AdminTemplateComponent, canActivate : [AuthentificationGuard],
    children :[
      {path: "avion", component: AvionComponent},
      {path: "vol", component: VolComponent},
      {path: "billet", component: BilletComponent},
      {path: "create-avion", component: CreateAvionComponent},
      {path: "update-avion/:id", component: UpdateAvionComponent},
      {path: "create-vol", component: CreateVolComponent},
      {path: "update-vol/:id", component: UpdateVolComponent},
      {path: "create-billet", component: CreateBilletComponent},
      {path: "update-billet/:id", component: UpdateBilletComponent},
      {path: "create-responsable-vol", component: CreateResponsableVolComponent},
      {path: "update-responsable-vol/:id", component: UpdateResponsableVolComponent},
      {path: "create-responsable-billet", component: CreateResponsableBilletComponent},
      {path: "update-responsable-billet/:id", component: UpdateResponsableBilletComponent},
  ]},

];

@NgModule({
  imports :[RouterModule.forRoot(routes)],
  exports :[RouterModule]
})
export class AppRoutingModule { }
