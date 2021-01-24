import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-board/src/vaadin-board.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-tabs/src/vaadin-tabs.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class FeelingView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                    width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
  <vaadin-vertical-layout theme="spacing">
   <div>
    <iron-icon icon="lumo:invoice" < iron-icon></iron-icon>
   </div>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-checkbox>
  <iron-icon icon="lumo:bell" style="vertical-align: top;"></iron-icon>Notifications 
 </vaadin-checkbox>
 <vaadin-button theme="icon" aria-label="Add new">
  <iron-icon icon="lumo:plus"></iron-icon>
 </vaadin-button>
 <vaadin-button theme="icon" aria-label="Add new">
  <iron-icon icon="lumo:plus"></iron-icon>
 </vaadin-button>
 <vaadin-button theme="icon" aria-label="Add new">
  <iron-icon icon="lumo:plus"></iron-icon>
 </vaadin-button>
 <vaadin-button>
  <iron-icon icon="lumo:edit" slot="prefix"></iron-icon> Edit 
 </vaadin-button>
 <vaadin-button>
  <iron-icon icon="lumo:arrow-right" slot="suffix"></iron-icon> Next 
 </vaadin-button>
 <vaadin-checkbox>
  <iron-icon icon="lumo:bell" style="vertical-align: top;"></iron-icon>Notifications 
 </vaadin-checkbox>
 <vaadin-text-field placeholder="Search">
  <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
 </vaadin-text-field>
 <vaadin-tabs orientation="horizontal" selected="0">
  <vaadin-tab>
   <iron-icon icon="lumo:user"></iron-icon>
   <span>Tab one</span>
  </vaadin-tab>
  <vaadin-tab>
   <iron-icon icon="lumo:cog"></iron-icon>
   <span>Tab two</span>
  </vaadin-tab>
  <vaadin-tab>
   <iron-icon icon="lumo:bell"></iron-icon>
   <span>Tab three</span>
  </vaadin-tab>
 </vaadin-tabs>
 <iron-icon></iron-icon>
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
