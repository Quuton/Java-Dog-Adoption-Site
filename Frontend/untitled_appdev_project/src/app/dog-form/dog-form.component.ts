import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule } from '@angular/forms';
import { Dog } from '../model/dog.model';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-dog-form',
  templateUrl: './dog-form.component.html',
  styleUrls: ['./dog-form.component.css']
})

export class DogFormComponent {
  dogForm: FormGroup;

  constructor(private http: HttpClient,
    private formBuilder: FormBuilder) {
    this.dogForm = this.formBuilder.group({
      name: ['', Validators.required],
      breed: [''],
      turnInDate: [new Date()],
      gender: [false],
    });
  }
    onSubmit() {
      const headers = { 'content-type': 'application/json'} 
      const apiUrl = 'http://localhost:4201/api/dog/add-json';
      alert(JSON.stringify(this.dogForm.value));
      
      this.http.post(apiUrl, JSON.stringify(this.dogForm.value), {'headers':headers}).subscribe();
    }
}