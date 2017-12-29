import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent {
  currentTime: Date;

  constructor() {
    setInterval(() => { this.currentTime = new Date(); }, 1000 );
   }

}
