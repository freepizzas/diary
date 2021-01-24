import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class LandingView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                    /*background-image: url("");*/
                    background-color: gold;
                }
                .center {
                    margin-right: auto;
                    margin-left: auto;
                }       
                .top-text{
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-size: 70px;
                    font-weight: 800;
                    margin-bottom: -15%;
                    color: white;
                    -webkit-text-stroke-width: 1px;
                    -webkit-text-stroke-color: goldenrod;
                }
                .mid-text{
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-size: 75px;
                    font-weight: 800;
                    color: white;
                    -webkit-text-stroke-width: 1px;
                    -webkit-text-stroke-color: goldenrod;
                }
                .bot-text{
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-size: 66px;
                    font-weight: 800;
                    margin-top: -12%;
                    color: white;
                    -webkit-text-stroke-width: 1px;
                    -webkit-text-stroke-color: goldenrod;
                }
                .btn-center-1 {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-weight: 600;
                    margin-left: auto;
                    margin-right: 1%;
                    background-color: mediumpurple;
                    border: 1px rebeccapurple;
                    color: white;
                    text-align: center;
                    text-decoration: none;
                    display: inline-block;
                    font-size: 26px;
                    border-radius: 3px;             
                }
                .btn-center-2 {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-weight: 600;
                    margin-right: auto;
                    background-color: rebeccapurple; /* Green */
                    border: none;
                    color: white;
                    text-align: center;
                    text-decoration: none;
                    display: inline-block;
                    font-size: 26px;
                    border-radius: 3px;                       
                }
                
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" class="center">
    <div class="top-text">
      JOURNAL 
    </div>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" class="center">
    <div class="mid-text">
      WHENEVER, 
    </div>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" class="center">
    <div class="bot-text">
      WHEREVER. 
    </div>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center;">
  <vaadin-button theme="large" class="btn-center-1">
    JOIN NOW 
  </vaadin-button>
  <vaadin-button theme="large" class="btn-center-2">
    SIGN IN 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'landing-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(LandingView.is, LandingView);
