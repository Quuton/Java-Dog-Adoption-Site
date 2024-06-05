import { Component } from '@angular/core';
import { DogService } from '../services/dog.service';
import { Dog } from '../model/dog.model';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {
  dogs: Dog [] = []
  constructor(private dogService: DogService) {
  }

  ngOnInit(): void {
    this.dogService.getDogs().subscribe((data: Dog[]) => {
      this.dogs = data;
    });

  }
  isMenuOpen = false;

  toggleMenu() {
    this.isMenuOpen = !this.isMenuOpen;
}
}
