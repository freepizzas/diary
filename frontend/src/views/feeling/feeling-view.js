import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-board/src/vaadin-board.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class FeelingView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                    width: 100%;
                    background-color: white;
                }

                .centered {
                    margin-left: 5%;
                    margin-right: 5%;
                    margin-top: 5%;
                    margin-bottom: 5%;
                }
                .btn1 {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-weight: 600;
                    background-color: #ff0000;
                    color: white;
                    display: block;
                    text-align: center;
                    text-decoration: none;
                    font-size: 20px;
                    border-radius: 25px;
                    border: 3px solid white;
                    line-height: 1;
                    height: 70px;
                }
                .btn2 {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-weight: 600;
                    background-color: orangered;
                    color: white;
                    display: block;
                    text-align: center;
                    text-decoration: none;
                    font-size: 20px;
                    border-radius: 25px;
                    border: 3px solid white;
                    line-height: 1;
                    height: 70px;
                }
                .btn3 {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-weight: 600;
                    background-color: gold;
                    color: white;
                    display: block;
                    text-align: center;
                    text-decoration: none;
                    font-size: 20px;
                    border-radius: 25px;
                    border: 3px solid white;
                    line-height: 1;
                    height: 70px;
                }
                .btn4 {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-weight: 600;
                    background-color: greenyellow;
                    color: white;
                    display: block;
                    text-align: center;
                    text-decoration: none;
                    font-size: 20px;
                    border-radius: 25px;
                    border: 3px solid white;
                    line-height: 1;
                    height: 70px;
                }
                .btn5 {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-weight: 600;
                    background-color: forestgreen;
                    color: white;
                    display: block;
                    text-align: center;
                    text-decoration: none;
                    font-size: 20px;
                    border-radius: 25px;
                    border: 3px solid white;
                    line-height: 1;
                    height: 70px;
                }
                .btn6 {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-weight: 600;
                    background-color: #ff4f5a;
                    color: white;
                    display: block;
                    text-align: center;
                    text-decoration: none;
                    font-size: 20px;
                    border-radius: 25px;
                    border: 3px solid white;
                    line-height: 1;
                    height: 70px;
                }
                .icon-spacing {
                    margin-left: auto;
                    margin-right: auto;
                }
                .background {
                    background-color: #fc5764;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout" class="background">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" class="centered" id="vaadinHorizontalLayout2">
   <vaadin-vertical-layout theme="spacing" class="icon-spacing" id="vaadinVerticalLayout1" style="align-self: center;">
    <vaadin-button id="reallySad" class="btn1">
      I FEEL REALLY SAD 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" class="icon-spacing" id="vaadinVerticalLayout2" style="align-self: center;">
    <vaadin-button id="sad" class="btn2">
      I FEEL SAD 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" class="icon-spacing" id="vaadinVerticalLayout3" style="align-self: center;">
    <vaadin-button id="ok" class="btn3">
      I FEEL OK 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" class="icon-spacing" id="vaadinVerticalLayout4" style="align-self: center;">
    <vaadin-button id="nice" class="btn4">
      I FEEL NICE 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" class="icon-spacing" id="vaadinVerticalLayout5" style="align-self: center;">
    <vaadin-button id="reallyNice" class="btn5">
      I FEEL REALLY NICE 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'feeling-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(FeelingView.is, FeelingView);
