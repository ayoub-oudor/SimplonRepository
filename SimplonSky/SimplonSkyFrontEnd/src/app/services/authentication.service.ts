import { Injectable } from '@angular/core';
import { AppUser } from '../models/user';
import { UUID } from 'angular2-uuid';
import { Observable, of, throwError } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  [x: string]: any;
  authenticateUser(appUser: any) {
    throw new Error('Method not implemented.');
  }

  users : AppUser[]=[];

  authenticatedUser : AppUser | undefined

  constructor() { 
    this.users.push({Id : UUID.UUID(),username : "AYOUB", password : "1234", roles : ["USER"]});
    this.users.push({Id : UUID.UUID(),username : "HASNAE", password : "1234", roles : ["USER"]});
    this.users.push({Id : UUID.UUID(),username : "YOUSSEF", password : "1234", roles : ["USER"]});
    this.users.push({Id : UUID.UUID(),username : "ADMIN", password : "1234", roles : ["USER","ADMIN"]});
  }

  public login(username: string, password: string) : Observable<AppUser>{
    let appuser = this.users.find(u => u.username==username);
    if(!appuser) return throwError(()=> new Error("User not found"));
    if(appuser.password!=password) {
      return throwError(()=> new Error("Bad credentials"));
    }
    return of(appuser);
  }

  public authentificateUser(appuser : AppUser):Observable<boolean>{
    this.authenticatedUser = appuser;
    localStorage.setItem("authUser", JSON.stringify({username:appuser.username, roles : appuser.roles, jwt:"JWT_TOKEN"}))
    return of(true);
  }

  public hasRole(role : String) : boolean {
     return  this.authenticatedUser!.roles.includes(role);
  }

  public isAuthenticated(){
    return this.authenticatedUser!=undefined;
  }

  public logout() : Observable<boolean>{
    this.authenticatedUser=undefined;
    localStorage.removeItem("authUser");
    return of(true);
  }

}
