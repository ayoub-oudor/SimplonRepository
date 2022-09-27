import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateBilletComponent } from './create-billet.component';

describe('CreateBilletComponent', () => {
  let component: CreateBilletComponent;
  let fixture: ComponentFixture<CreateBilletComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateBilletComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateBilletComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
