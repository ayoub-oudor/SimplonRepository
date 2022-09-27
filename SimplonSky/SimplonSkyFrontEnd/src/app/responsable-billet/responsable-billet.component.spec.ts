import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ResponsableBilletComponent } from './responsable-billet.component';

describe('ResponsableBilletComponent', () => {
  let component: ResponsableBilletComponent;
  let fixture: ComponentFixture<ResponsableBilletComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ResponsableBilletComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ResponsableBilletComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
