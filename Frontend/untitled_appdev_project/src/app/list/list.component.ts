import { Component } from '@angular/core';
import { DogService } from '../services/dog.service';
import { Dog } from '../model/dog.model';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})


export class ListComponent{
  dogs: Dog [] = []
  constructor(private dogService: DogService) {
  }

  ngOnInit(): void {
    this.dogService.getDogs().subscribe((data: Dog[]) => {
      this.dogs = data;
    });

  }
}
