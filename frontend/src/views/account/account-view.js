import {PolymerElement} from '@polymer/polymer/polymer-element.js';
import {html} from '@polymer/polymer/lib/utils/html-tag.js';
import '../history/history-view.js';
import '@vaadin/flow-frontend/com/github/appreciated/card/stateful-card.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class AccountView extends PolymerElement {
    static get template() {
        return html`
            <style>
                :host {
                    display: block;
                    height: 100%;
                }

                .centered {
                    margin-left: auto;
                    margin-right: auto;
                    background-color: white;
                }
            </style>
            <vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
                <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 40%;"></vaadin-horizontal-layout>
                <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
                    <vaadin-vertical-layout theme="spacing" class="centered">
                        <div id="profile-image" class="centered"></div>
                        <div style="align-self: center;">
                            <vaadin-button style="background-color: #fe505a; color: white" id="stats">
                                View stats
                            </vaadin-button>
                        </div>
                        <div style="align-self: center;">
                            <vaadin-button style="background-color: #fe505a; color: white" id="logOut">
                                Log out
                            </vaadin-button>
                        </div>
                    </vaadin-vertical-layout>
                </vaadin-horizontal-layout>
                <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 40%;"></vaadin-horizontal-layout>
            </vaadin-vertical-layout>
        `;
    }

    static get is() {
        return 'account-view';
    }
}

customElements.define(AccountView.is, AccountView);
