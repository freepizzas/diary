import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-charts/src/vaadin-chart.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class StatsView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                    background-color: #cb9298;
                }

                .center-top {
                    display: flex;
                    align-items: center;
                    margin-left: auto;
                    margin-right: auto;
                }

                .center-bot {
                    display: flex;
                    align-items: center;
                    margin-left: auto;
                    margin-right: auto;
                }

                vaadin-chart {
                    border-radius: 25px;
                }
                .sorry {
                    margin-top: 35vh;
                    border: 2px solid white;
                    border-radius: 25px;
                    margin-left: auto;
                    margin-right: auto;
                }
                .sorry-inner {
                    padding: 40px 80px 40px 80px;
                    font-family: roboto_condensedbold;
                    font-size: 20px;
                    color: white;
                    text-align: center;
                    
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 75%; height: 100%;" id="vaadinVerticalLayout"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%;">
  <div class="sorry" id="isNone">
    <div class="sorry-inner">
        WE ARE SORRY, <br>
        BUT THERE AREN'T <br>
        ANY ENTRIES. <br>
        GO AND WRITE <br>
        SOMETHING! :D
    </div>
  </div>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <div class="center-top">
    <vaadin-chart title="Moods by Dates" categories="" id="moodChart">
     <vaadin-chart-series title="Moods" unit="Worst to Best [1-5]" values=""></vaadin-chart-series>
    </vaadin-chart>
   </div>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <div class="center-bot">
    <vaadin-chart type="pie" title="Moods Pie Chart" tooltip="" id="pieChart">
     <vaadin-chart-series title="Entries" values=""></vaadin-chart-series>
    </vaadin-chart>
   </div>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 75%; height: 100%;" id="vaadinVerticalLayout1"></vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'stats-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(StatsView.is, StatsView);
