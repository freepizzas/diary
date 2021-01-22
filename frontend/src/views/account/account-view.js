import { PolymerElement } from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';
import '../history/history-view.js';

class AccountView extends PolymerElement {
  static get template() {
    return html`
<style>
      :host {
        display: block;
        padding: 1em;
      }
      </style>
<vaadin-button id="sayHello">
 Say hello
</vaadin-button>
<history-view></history-view>
<history-view></history-view>
<history-view></history-view>
`;
  }

  static get is() {
    return 'account-view';
  }
}

customElements.define(AccountView.is, AccountView);
