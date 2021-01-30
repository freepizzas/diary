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
                    border-radius: 25px;
                    border: 2px solid white;
                    padding-top: 15px;
                }
                .img {
                    margin: 30px 30px 25px 30px;
                    padding: 15px 15px 15px 15px;
                    border-radius: 25px;
                    border: 3px solid #153043;
                }
                .btn {
                    font-family: 'roboto_condensedbold';
                    background-color: #153043;
                    color: white;
                    margin-left: auto;
                    margin-right: auto;
                    height: 50px;
                    width: 150px;
                    font-weight: 600;
                }
                .center1 {
                    margin-left: auto;
                    margin-right: auto;
                    margin-top: 0px;
                    margin-bottom: 10px;
                }
                .center2 {
                    margin-top: 0px;
                    margin-left: auto;
                    margin-right: auto;
                    margin-bottom: 15px;
                }
            </style>
            <vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
                <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 40%;"></vaadin-horizontal-layout>
                <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
                    <vaadin-vertical-layout theme="spacing" class="centered">
                        <div id="profile-image" class="img"></div>
                        <div class="center1">
                            <vaadin-button class="btn" id="stats">
                                VIEW STATS
                            </vaadin-button>
                        </div>
                        <div class="center2"> 
                            <vaadin-button class="btn" id="logOut">
                                LOG OUT
                            </vaadin-button>
                        </div>                     
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
