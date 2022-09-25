import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from '@angular/forms'

import { AppComponent } from './app.component';
import { AvionComponent } from './avion/avion.component';
import { BilletComponent } from './billet/billet.component';
import { VolComponent } from './vol/vol.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AppRoutingModule } from './app-routing.module';
import { HeaderComponent } from './header/header.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CreateAvionComponent } from './create-avion/create-avion.component';
import { UpdateAvionComponent } from './update-avion/update-avion.component';
import { CreateVolComponent } from './create-vol/create-vol.component';
import { CreateBilletComponent } from './create-billet/create-billet.component';
import { CreateResponsableBilletComponent } from './create-responsable-billet/create-responsable-billet.component';
import { CreateResponsableVolComponent } from './create-responsable-vol/create-responsable-vol.component';
import { UpdateVolComponent } from './update-vol/update-vol.component';
import { UpdateBilletComponent } from './update-billet/update-billet.component';
import { UpdateResponsableBilletComponent } from './update-responsable-billet/update-responsable-billet.component';
import { UpdateResponsableVolComponent } from './update-responsable-vol/update-responsable-vol.component';
import { ResponsableVolComponent } from './responsable-vol/responsable-vol.component';
import { ResponsableBilletComponent } from './responsable-billet/responsable-billet.component';
import { AdminTemplateComponent } from './admin-template/admin-template.component';

@NgModule({
  declarations: [
    AppComponent,
    AvionComponent,
    BilletComponent,
    VolComponent,
    LoginComponent,
    RegisterComponent,
    HeaderComponent,
    CreateAvionComponent,
    UpdateAvionComponent,
    CreateVolComponent,
    CreateBilletComponent,
    CreateResponsableBilletComponent,
    CreateResponsableVolComponent,
    UpdateVolComponent,
    UpdateBilletComponent,
    UpdateResponsableBilletComponent,
    UpdateResponsableVolComponent,
    ResponsableVolComponent,
    ResponsableBilletComponent,
    AdminTemplateComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
