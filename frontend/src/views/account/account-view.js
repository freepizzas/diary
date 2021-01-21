import { PolymerElement } from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';

class AccountView extends PolymerElement {
  static get template() {
    return html`
    <style>
      :host {
        display: block;
        padding: 1em;
      }
      </style>
      <vaadin-text-field id="name"
        label="Your name"
      ></vaadin-text-field>
      <vaadin-button id="sayHello">Say hello</vaadin-button>
    `;
  }

  static get is() {
    return 'account-view';
  }
}

customElements.define(AccountView.is, AccountView);
