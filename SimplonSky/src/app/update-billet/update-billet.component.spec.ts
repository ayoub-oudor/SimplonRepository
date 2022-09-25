import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateBilletComponent } from './update-billet.component';

describe('UpdateBilletComponent', () => {
  let component: UpdateBilletComponent;
  let fixture: ComponentFixture<UpdateBilletComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateBilletComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateBilletComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
