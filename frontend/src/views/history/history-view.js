import { PolymerElement } from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-grid/all-imports.js';
import '@vaadin/vaadin-ordered-layout/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-lumo-styles/all-imports.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/vaadin-vertical-layout.js';

class HistoryView extends PolymerElement {
  static get template() {
    return html`
<style include="shared-styles lumo-badge lumo-typography">
        :host {
          display: block;
          height: 100%;
        }

        vaadin-grid {
          height: 100%;
          line-height: var(--lumo-line-height-m);
          border: 0;
        }
        vaadin-grid-cell {
            border-top: 0px;
        }
        vaadin-grid-cell-content {
          background-color: #ffe23f;
          --_lumo-grid-secondary-border-color: #ffe23f !important;
          border-radius: 25px;
          border: 2px solid black;
          margin-bottom: 20px;
          padding: 20px 20px 20px 20px;
        }
        .header {
          align-items: baseline;
        }
        .actions {
          align-items: center;
        }
        .centered {
            padding-top: 30px;
            margin: 0px 30px 0px 30px;
        }
        #items {
            background-color: #ffe23f;
        }
        .outer {
            background-color: #ffe23f;
            margin: 0px;
            border-left: 2px solid black;
            border-right: 2px solid black;
        }
        vaadin-text-area {
            min-height: 150px;
            min-width: 600px;
            border: 1px solid black;
            border-radius: 25px;
        }
        .textarea {
            background-color: white;
            padding: 15px 15px 15px 15px;
            border-radius: 25px;
            border: 1px solid black;
            color: black;
        }
      </style>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" class="outer"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" class="centered">
  <div id="isNone">
    Div 
  </div>
  <vaadin-grid id="grid" items="[[items]]">
   <vaadin-grid-column id="vaadinGridColumn">
    <template>
     <vaadin-accordion id="vaadinAccordion">
      <vaadin-accordion-panel id="vaadinAccordionPanel" items="[[items]]">
       <div slot="summary" id="div">
        <div class="textarea">
          [[item.date]], [[item.time]] 
        </div>
       </div>
       <vaadin-vertical-layout id="vaadinVerticalLayout">
        <div class="textarea">
         <div>
          <b> [[item.question]] </b>
         </div>
         <div>
           [[item.rtext]] 
         </div>
        </div>
       </vaadin-vertical-layout>
      </vaadin-accordion-panel>
     </vaadin-accordion>
    </template>
   </vaadin-grid-column>
  </vaadin-grid>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" class="outer"></vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  static get is() {
    return 'history-view';
  }

  static get properties() {
    return {
      // Declare your properties here.
    };
  }
}

customElements.define(HistoryView.is, HistoryView);