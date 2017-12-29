import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';


import { AppComponent } from './app.component';
import { TwoWayBindingComponent } from './two-way-binding/two-way-binding.component';
import { EventBindingComponent } from './event-binding/event-binding.component';
import { PropertyBindingComponent } from './property-binding/property-binding.component';
import { PipesComponent } from './pipes/pipes.component';
import { PostService } from './shared/post.service';
import { PostComponent } from './post/post.component';


@NgModule({
  declarations: [
    AppComponent,
    TwoWayBindingComponent,
    EventBindingComponent,
    PropertyBindingComponent,
    PipesComponent,
    PostComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [PostService],
  bootstrap: [AppComponent]
})
export class AppModule { }
