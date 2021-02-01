package hr.unipu.diary.views.stats;

import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.*;
import com.vaadin.flow.component.charts.model.style.SolidColor;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import hr.unipu.diary.backend.entity.MoodEntry;
import hr.unipu.diary.backend.entity.TextEntry;
import hr.unipu.diary.backend.repository.MoodEntryRepository;
import hr.unipu.diary.views.main.MainView;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.helger.css.propertyvalue.CCSSValue.TRANSPARENT;

@Tag("stats-view")
@Route(value = "statistics", layout = MainView.class)
@PageTitle("Mood Stats")
@JsModule("./src/views/stats/stats-view.js")
public class StatsView extends PolymerTemplate<StatsView.StatsViewModel> {
    @Id("moodChart")
    private Chart moodChart;
    @Id("pieChart")
    private Chart pieChart;

    public StatsView(MoodEntryRepository moodEntryRepository) {
        List<MoodEntry> moods = moodEntryRepository.findAll();

        //arrays for line chart
        List<String> datesLine = new ArrayList<>();
        List<Number> moodsLine = new ArrayList<Number>();

        int rating = 0, countReallySad = 0, countSad = 0, countOk = 0, countNice = 0, countReallyNice = 0;

        if (!moods.isEmpty()) {
            moodChart.setVisible(true);
            pieChart.setVisible(true);
            for (int i = 0; i < moods.size(); i++) {
                moodsLine.add(moods.get(i).getRating());
                datesLine.add(moods.get(i).getDate());

                rating = moods.get(i).getRating();
                switch (rating) {
                    case 1:
                        countReallySad++;
                        break;
                    case 2:
                        countSad++;
                        break;
                    case 3:
                        countOk++;
                        break;
                    case 4:
                        countNice++;
                        break;
                    case 5:
                        countReallyNice++;
                        break;
                }
            }
            //PieChart configuration
            DataSeries seriesPie = new DataSeries();
            seriesPie.add(new DataSeriesItem("Really sad", countReallySad));
            seriesPie.add(new DataSeriesItem("Sad", countSad));
            seriesPie.add(new DataSeriesItem("Ok", countOk));
            seriesPie.add(new DataSeriesItem("Nice", countNice));
            seriesPie.add(new DataSeriesItem("Really nice", countReallyNice));
            pieChart.getConfiguration().addSeries(seriesPie);

            //LineChart configuration
            ListSeries listSeries = new ListSeries("", moodsLine);
            YAxis yAxis = new YAxis();
            Labels xlabels = yAxis.getLabels();
            xlabels.setStep(1);
            yAxis.setTitle("");
            XAxis xaxis = new XAxis();
            String[] arr = {};
            arr = datesLine.toArray(arr);
            xaxis.setCategories(arr);
            moodChart.getConfiguration().addxAxis(xaxis);
            moodChart.getConfiguration().addyAxis(yAxis);
            moodChart.getConfiguration().addSeries(listSeries);

        } else {
            moodChart.setVisible(false);
            pieChart.setVisible(false);
        }
    }

    public interface StatsViewModel extends TemplateModel {
    }
}
