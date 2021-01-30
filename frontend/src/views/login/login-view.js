import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-login/src/vaadin-login-form.js';

class LoginView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
                .newlook {
                    border-radius: 25px !important;
                    background-color: white;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="vaadinVerticalLayout">
 <vaadin-login-form class="newlook" id="vaadinLoginForm"></vaadin-login-form>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'login-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(LoginView.is, LoginView);
