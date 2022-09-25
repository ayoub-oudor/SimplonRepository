import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ResponsableVolComponent } from './responsable-vol.component';

describe('ResponsableVolComponent', () => {
  let component: ResponsableVolComponent;
  let fixture: ComponentFixture<ResponsableVolComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ResponsableVolComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ResponsableVolComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
