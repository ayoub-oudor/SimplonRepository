import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateResponsableBilletComponent } from './create-responsable-billet.component';

describe('CreateResponsableBilletComponent', () => {
  let component: CreateResponsableBilletComponent;
  let fixture: ComponentFixture<CreateResponsableBilletComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateResponsableBilletComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateResponsableBilletComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
