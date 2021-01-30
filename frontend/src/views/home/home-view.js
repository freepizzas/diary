import { PolymerElement } from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';
import '../feeling/feeling-view.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
          font-family: 'Roboto', 'Noto', sans-serif;
          font-size: 50px;
          font-weight: 800;
          color: black;
          margin-bottom: -5%;
          text-align: center;
      }
      .header2 {
          font-family: 'Roboto', 'Noto', sans-serif;
          font-size: 50px;
          font-weight: 800;
          color: black;
          text-align: center;
      }
      .btn-1 {
          font-family: 'Roboto', 'Noto', sans-serif;
          font-weight: 600;
          margin-left: auto;
          margin-right: auto;
          background-color: white;
          color: black;
          display: block;
          text-align: center;
          text-decoration: none;
          font-size: 26px;
          border-radius: 25px;
          border: 2px solid black;
          line-height: 1;
      }
      .btn-2 {
          font-family: 'Roboto', 'Noto', sans-serif;
          font-weight: 600;
          margin-left: auto;
          margin-right: auto;
          background-color: white;
          color: black;
          text-align: center;
          text-decoration: none;
          font-size: 26px;
          border-radius: 25px;
          border: 2px solid black;
          line-height: 1;
      }
      .btn-3 {
          font-family: 'Roboto', 'Noto', sans-serif;
          font-weight: 600;
          margin-left: auto;
          margin-right: auto;
          background-color: white;
          color: black;
          text-align: center;
          text-decoration: none;
          font-size: 26px;
          border-radius: 25px;
          border: 2px solid black;
          line-height: 1;
      }  
</style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
   <vaadin-vertical-layout theme="spacing" class="center" id="vaadinVerticalLayout2">
    <vaadin-horizontal-layout theme="spacing" class="center" id="vaadinHorizontalLayout2">
     <div id="div">
      <h1 class="header1" id="h1"> HELLO "ALICE" </h1>
      <h1 class="header2" id="h11"> WHAT DO YOU WANT TO DO TODAY? </h1>
     </div>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; flex-grow: 0;" id="vaadinHorizontalLayout3">
     <vaadin-button theme="icon" class="btn-1" id="vaadinButton">
       ASK ME A QUESTION 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout4">
     <vaadin-button theme="primary" class="btn-2" id="vaadinButton1">
       LET ME WRITE 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout5">
     <vaadin-button theme="primary" class="btn-3" id="vaadinButton2">
       I'M IN A MOOD 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  static get is() {
    return 'home-view';
  }
}

customElements.define(HomeView.is, HomeView);
