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
                    margin-left: auto;
                    margin-right: auto;
                }
                vaadin-chart {
                    border-radius: 25px;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout theme="spacing" style="width: 75%; height: 100%;" id="vaadinVerticalLayout"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <div class="center-top">
    <vaadin-chart title="Line chart of Moods for this month" categories="[2010, 2011, 2012, 2013, 2014, 2015, 206, 2017]">
     <vaadin-chart-series title="Moods" unit="Number of Employees" values="[43934, 52503, 57177, 69658, 97031, 119931, 137133, 154175]"></vaadin-chart-series>
     <vaadin-chart-series title="Manufacturing" unit="Number of Employees" values="[24916, 24064, 29742, 29851, 32490, 30282, 38121, 40434]"></vaadin-chart-series>
    </vaadin-chart>
   </div>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <div class="center-bot">
    <vaadin-chart type="pie" title="Pie chart of Moods for this month" tooltip="">
     <vaadin-chart-series title="Brands" values="[[&quot;Chrome&quot;,61.41],
                            [&quot;Internet Explorer&quot;,11.84],
                            [&quot;Firefox&quot;,10.85],
                            [&quot;Edge&quot;,4.67],
                            [&quot;Safari&quot;,4.18],
                            [&quot;Sogou Explorer&quot;,1.64],
                            [&quot;Opera&quot;,1.6],
                            [&quot;QQ&quot;,1.2],
                            [&quot;Other&quot;,2.61]]"></vaadin-chart-series>
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
