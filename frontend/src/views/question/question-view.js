import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class QuestionView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                    width: 100%;
                    background-color: white;
                }
                .askme {
                    margin-left: 5%;
                    margin-right: 4%;
                    padding: 30px 30px 30px 30px;
                }
                .background {
                    background-color: #fc5764;
                }
                .inner {
                    background-color: white;
                    padding: 20px 20px 20px 20px;
                    border-radius: 25px;
                    font-family: 'Roboto', 'Noto', sans-serif;
                    /*text-decoration: underline;*/
                    /*text-decoration-color: #6f7680;*/
                    /*text-underline-offset: 5px;*/
                    /*#4d5157*/
                    color: #6f7680;
                    font-size: 25px;
                    font-weight: 600;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout" class="background">
 <vaadin-horizontal-layout style="width: 100%; height: 100%;" theme="spacing">
  <vaadin-horizontal-layout style="width: 100%; height: 100%;" theme="spacing">
   <div style="align-self: center; width: 100%" class="askme">
    <div class="inner">
         DOBAR DAN, KAKO TE?
    </div>
   </div>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'question-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(QuestionView.is, QuestionView);
