import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateResponsableVolComponent } from './update-responsable-vol.component';

describe('UpdateResponsableVolComponent', () => {
  let component: UpdateResponsableVolComponent;
  let fixture: ComponentFixture<UpdateResponsableVolComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateResponsableVolComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateResponsableVolComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
