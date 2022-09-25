import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateResponsableBilletComponent } from './update-responsable-billet.component';

describe('UpdateResponsableBilletComponent', () => {
  let component: UpdateResponsableBilletComponent;
  let fixture: ComponentFixture<UpdateResponsableBilletComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateResponsableBilletComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateResponsableBilletComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
