import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title :String= 'app1';
  items:Array<any>=[
    {
      id:1,
      name:'laptop',
      price:149000,
      description:'New Mac Pro',
      canBuy:true,
      imagePath:'assets/Laptop.png',
    },
     {
      id:2,
       name:'mobile',
       price:19000,
       description:'New Pro',
       canBuy:true,
       imagePath:'assets/Mobile.jpg',
     },
  ]
  currentTab: number = 1

  changeTab(event: Event, tabIndex: number) {
    this.currentTab = tabIndex
  }
}
