import { PolymerElement } from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-grid/all-imports.js';
import '@vaadin/vaadin-ordered-layout/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/vaadin-vertical-layout.js';
import '@vaadin/vaadin-lumo-styles/all-imports.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';

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
        }

        vaadin-grid,
        vaadin-grid-cell-content {
          background-color: #ffe23f;
        
        }
        .header {
          align-items: baseline;
        }
        .actions {
          align-items: center;
        }
        .centered {
            margin-left: auto;
            margin-right: auto;
        }
        vaadin-text-area {
            min-height: 150px;
            min-width: 600px;
            border: 1px solid black;
            border-radius: 25px;
        }
        vaadin-grid-cell-content {
            padding-left: 36%;
            padding-bottom: 30px;
        }
      </style>
<vaadin-grid id="grid" items="[[items]]">
 <vaadin-grid-column id="vaadinGridColumn">
  <template>
   <vaadin-accordion id="vaadinAccordion">
    <vaadin-accordion-panel id="vaadinAccordionPanel" class="makeitblack" items="[[items]]">
     <div slot="summary" id="div" class="makeitblack">
       [[item.date]]
     </div>
     <vaadin-vertical-layout id="vaadinVerticalLayout">
      <vaadin-text-area id="name">
        [[item.rtext]]
      </vaadin-text-area>
     </vaadin-vertical-layout>
    </vaadin-accordion-panel>
   </vaadin-accordion>
  </template>
 </vaadin-grid-column>
</vaadin-grid>
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