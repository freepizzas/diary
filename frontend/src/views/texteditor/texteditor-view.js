import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-rich-text-editor/src/vaadin-rich-text-editor.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class TexteditorView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    width: 100%;
                    height: 100%;
                }

                /*.background {*/
                /*    background-color: rosybrown;*/
                /*}*/
                /*vaadin-rich*/
                [part="toolbar"] {
                    background-color: black;
                }
                .editor {
                    padding-right: 5%;
                    padding-left: 5%;
                    padding-bottom: 5%;
                    width: 100%;
                    height: 100%;
                }
                .btn {
                    margin-left: auto;
                    margin-right: 5%;
                    margin-top: -4.5%;
                    font-weight: 600;
                    background-color: #ff4f5a;
                    color: white;
                    display: block;
                    text-align: center;
                    text-decoration: none;
                    font-size: 20px;
                    border-radius: 25px;
                    border: 1px solid white;
                    line-height: 1;
                    height: 35px;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout style="width:100%; height: 20%" class="background">
  <!-- Tu ide mood ili ask me a question-->
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="height: 100%; width:100%;" class="background">
  <vaadin-rich-text-editor class="editor" html-value="<p><br></p>" id="richtext"></vaadin-rich-text-editor>
  <vaadin-button class="btn" id="save">
    Save 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'texteditor-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(TexteditorView.is, TexteditorView);
