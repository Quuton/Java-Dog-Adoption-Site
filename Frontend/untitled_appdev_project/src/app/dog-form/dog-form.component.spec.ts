import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DogFormComponent } from './dog-form.component';

describe('DogFormComponent', () => {
  let component: DogFormComponent;
  let fixture: ComponentFixture<DogFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DogFormComponent]
    });
    fixture = TestBed.createComponent(DogFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
