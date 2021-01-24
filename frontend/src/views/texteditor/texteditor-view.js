import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-rich-text-editor/src/vaadin-rich-text-editor.js';
import '../navbar/navbar-view.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class TexteditorView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
    :host {
        display: block;
        width: 100%;
        height: 100%;
    }
    .background {
        background-color: rosybrown;
    }        
    .editor { 
        padding-right: 5%;
        padding-left: 5%;
        padding-bottom: 5%;
        width: 100%;
        height: 100%;
    }    
</style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout style="width: 100%;">
  <navbar-view></navbar-view>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width:100%; height: 20%" class="background">
  <!-- Tu ide mood ili ask me a question-->
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="height: 100%; width:100%;" class="background">
  <vaadin-rich-text-editor class="editor" html-value="<p><br></p>"></vaadin-rich-text-editor>
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
