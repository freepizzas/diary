import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class NavbarView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    width: 100%;
                }
                .header-btn {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-weight: lighter;
                    font-size: 15px;
                    margin-left: 1%;
                    padding: 5px;
                    border: 1px solid whitesmoke;
                    border-radius: 0;
                    color: whitesmoke;
                    line-height: 1;
                    margin-top: 3px;
                    margin-bottom: 3px;
                  }
                  .header {
                    background-color: black;
                  }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; height: 100%">
  <vaadin-button theme="tertiary" class="header-btn">
    HOME 
  </vaadin-button>
  <vaadin-button theme="tertiary" class="header-btn">
    HISTORY 
  </vaadin-button>
  <vaadin-button theme="tertiary" class="header-btn">
    ACCOUNT 
  </vaadin-button>
  </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'navbar-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(NavbarView.is, NavbarView);
