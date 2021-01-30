import {PolymerElement} from '@polymer/polymer/polymer-element.js';
import {html} from '@polymer/polymer/lib/utils/html-tag.js';
import '../feeling/feeling-view.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class HomeView extends PolymerElement {
  static get template() {
    return html`
<style>
      :host {
        display: block;
        height: 100%;
      }
      .center {
          margin-right: auto;
          margin-left: auto;
      }
      .header1 {
        font-family: 'roboto_condensedbold';
        font-size: 35px;
          font-weight: 800;
          color: white;
          margin-bottom: -5%;
          text-align: center;
          background-color: #ff4f5a;
          border: 2px solid white;
          padding-bottom: 15px;
          border-radius: 25px;
          margin-top: 0px;
      }
      .header2 {
        font-family: 'roboto_condensedbold';
        font-size: 35px;
          font-weight: 800;
          color: white;
          text-align: center;
          background-color: #ff4f5a; 
          margin-top: 15;
          padding: 10px 30px 10px 30px;
          border: 2px solid white;
          border-radius: 25px;
          
      }
      .btn-1 {
        font-family: 'roboto_condensedbold';
        font-weight: 600;
        background-color: #ff4f5a;
        color: white;
        display: block;
        text-align: center;
        text-decoration: none;
        font-size: 20px;
        border-radius: 25px;
        border: 2px solid white;
        line-height: 1;
          height: 70px;
      }
      .btn-2 {
        font-family: 'roboto_condensedbold';
        font-weight: 600;
          margin-left: auto;
          margin-right: 4%;
          background-color: #ff4f5a;
          color: white;
          text-align: center;
          text-decoration: none;
          font-size: 20px;
          border-radius: 25px;
          border: 2px solid white;
          line-height: 1;
          height: 70px;
      }
      .btn-3 {
        font-family: 'roboto_condensedbold';
        font-weight: 600;
        background-color: #ff4f5a;
        color: white;
        text-align: center;
        text-decoration: none;
        font-size: 20px;
        border-radius: 25px;
        border: 2px solid white;
            line-height: 1;
            height: 70px;
      }  
</style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
   <vaadin-vertical-layout theme="spacing" class="center" id="vaadinVerticalLayout2" style="justify-content: center;">
    <div id="div" class="makeitround">
     <h1 class="header1" items="name" id="h1"> HELLO "[[ALICE]]" </h1>
     <h1 class="header2" id="h11"> WHAT DO YOU WANT TO DO TODAY? </h1>
    </div>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout3">
     <vaadin-button theme="icon" class="btn-1" id="askMeAQ">
       ASK ME A QUESTION 
     </vaadin-button>
     <vaadin-button theme="primary" class="btn-2" id="letMeWrite">
       LET ME WRITE 
     </vaadin-button>
     <vaadin-button theme="primary" class="btn-3" id="inAMood">
       I'M IN A MOOD 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

               

    static get is() {
        return 'home-view';
    }
}

customElements.define(HomeView.is, HomeView);
