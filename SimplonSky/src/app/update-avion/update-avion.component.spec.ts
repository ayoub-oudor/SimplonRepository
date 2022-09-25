import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateAvionComponent } from './update-avion.component';

describe('UpdateAvionComponent', () => {
  let component: UpdateAvionComponent;
  let fixture: ComponentFixture<UpdateAvionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateAvionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateAvionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
