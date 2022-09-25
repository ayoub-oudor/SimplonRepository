import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateResponsableVolComponent } from './create-responsable-vol.component';

describe('CreateResponsableVolComponent', () => {
  let component: CreateResponsableVolComponent;
  let fixture: ComponentFixture<CreateResponsableVolComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateResponsableVolComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateResponsableVolComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
