import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  isMenuOpen = false; // Add this property to control menu visibility

  toggleMenu() {
    this.isMenuOpen = !this.isMenuOpen;
}
}
