import {PolymerElement} from '@polymer/polymer/polymer-element.js';
import {html} from '@polymer/polymer/lib/utils/html-tag.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class LandingView extends PolymerElement {

    static get template() {
        return html`
            <style>
                :host {
                    display: block;
                    height: 100%;
                    /*background-image: url("");*/
                    background-color: gold;
                }

                .center {
                    margin-right: auto;
                    margin-left: auto;
                }

                .top-text {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-size: 70px;
                    font-weight: 800;
                    margin-bottom: -15%;
                    color: white;
                    -webkit-text-stroke-width: 1px;
                    -webkit-text-stroke-color: rebeccapurple;
                }

                .mid-text {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-size: 75px;
                    font-weight: 800;
                    color: white;
                    -webkit-text-stroke-width: 1px;
                    -webkit-text-stroke-color: rebeccapurple;
                }

                .bot-text {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-size: 66px;
                    font-weight: 800;
                    margin-top: -12%;
                    margin-bottom: -5%;
                    color: white;
                    -webkit-text-stroke-width: 1px;
                    -webkit-text-stroke-color: rebeccapurple;
                }

                .btn-center-1 {
                    font-family: 'Roboto', 'Noto', sans-serif;
                    font-weight: 600;
                    background-color: rebeccapurple;
                    border: 1px solid white;
                    color: white;
                    text-align: center;
                    text-decoration: none;
                    display: inline-block;
                    font-size: 26px;
                    height: 60px;
                    width: 250px;
                    border-radius: 25px;
                    opacity: 1;
                }
            </style>
            <vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
                <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
                <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
                <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: center;">
                    <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; justify-content: center;">
                        <vaadin-horizontal-layout theme="spacing" class="center">
                            <div class="top-text">
                                JOURNAL
                            </div>
                        </vaadin-horizontal-layout>
                        <vaadin-horizontal-layout theme="spacing" class="center">
                            <div class="mid-text">
                                WHENEVER,
                            </div>
                        </vaadin-horizontal-layout>
                        <vaadin-horizontal-layout theme="spacing" class="center">
                            <div class="bot-text">
                                WHEREVER.
                            </div>
                        </vaadin-horizontal-layout>
                    </vaadin-vertical-layout>
                </vaadin-horizontal-layout>
                <vaadin-horizontal-layout theme="spacing"
                                          style="width: 100%; height: 100%; align-items: center; align-self: center; justify-content: center;">
                    <vaadin-button theme="large" class="btn-center-1" id="joinNow">
                        JOIN NOW
                    </vaadin-button>
                </vaadin-horizontal-layout>
                <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
                <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
            </vaadin-vertical-layout>
        `;
    }

    static get is() {
        return 'landing-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(LandingView.is, LandingView);
