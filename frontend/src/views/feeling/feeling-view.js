import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-board/src/vaadin-board.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

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
                .icon-spacing {
                    margin-left: auto;
                    margin-right: auto;
                    margin-top: 5%;
                    margin-bottom: 5%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" class="centered" id="vaadinHorizontalLayout2">
   <vaadin-vertical-layout theme="spacing" class="icon-spacing" id="vaadinVerticalLayout1">
     Loše 
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" class="icon-spacing" id="vaadinVerticalLayout2">
     Meh 
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" class="icon-spacing" id="vaadinVerticalLayout3">
     Ok 
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" class="icon-spacing" id="vaadinVerticalLayout4">
     Dobro 
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" class="icon-spacing" id="vaadinVerticalLayout5">
     Super 
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout3"></vaadin-horizontal-layout>
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
