import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '../question/question-view.js';

class TexteditorqView extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    width: 100%;
                    height: 100%;
                }

                .editor {
                    margin-right: 5%;
                    margin-left: 5%;
                    margin-bottom: 5%;
                    width: 90%;
                    height: 100%;
                    background-color: #ff4f5a;
                    overflow: hidden;
                    border-radius: 30px;
                    border: 3px solid white;
                }

                .background {
                    background-color: #fc5764;
                }

                .btn {
                    margin-left: auto;
                    margin-right: 5%;
                    margin-top: -3%;
                    margin-bottom: 3%;
                    font-weight: 600;
                    background-color: #ff4f5a;
                    color: white;
                    display: block;
                    text-align: center;
                    text-decoration: none;
                    font-size: 20px;
                    border-radius: 15px;
                    border: 3px solid white;
                    line-height: 0;
                    height: 45px;
                    width: 100px;
                }
                .inner {
                    background-color: white;
                    padding: 20px 20px 20px 20px;
                    border-radius: 25px;
                    font-family: 'Roboto', 'Noto', sans-serif;
                    color: #6f7680;
                    font-size: 25px;
                    font-weight: 600;
                }
                .askme {
                    margin-left: 5%;
                    margin-right: 4%;
                    padding: 30px 30px 30px 30px;
                }
            </style>
            <vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout" class="background">
                <vaadin-horizontal-layout style="width:100%; height: 20%">
                    <vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout"
                                            class="background">
                        <vaadin-horizontal-layout style="width: 100%; height: 100%;" theme="spacing">
                            <vaadin-horizontal-layout style="width: 100%; height: 100%;" theme="spacing">
                                <div style="align-self: center; width: 100%" class="askme">
                                    <div items=items class="inner">
                                        [[items]]
                                    </div>
                                </div>
                            </vaadin-horizontal-layout>
                        </vaadin-horizontal-layout>
                    </vaadin-vertical-layout>
                </vaadin-horizontal-layout>
                <vaadin-vertical-layout style="height: 100%; width:100%;" class="background">
                    <vaadin-rich-text-editor class="editor" html-value="<p><br></p>"
                                             id="richtext"></vaadin-rich-text-editor>
                    <vaadin-button class="btn" id="save">
                        SAVE
                    </vaadin-button>
                </vaadin-vertical-layout>
            </vaadin-vertical-layout>
        `;
    }

    static get is() {
        return 'texteditorq-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(TexteditorqView.is, TexteditorqView);
