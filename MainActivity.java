////credits ->https://github.com/AnyChart/AnyChart-Android
package com.example.piechart;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;
//import com.github.mikephil.charting.charts.PieChart;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
      //private static String TAG ="MainActivity";
      private int[] earnings={400,421,650,121,759,270,910};
      private String[] months={"Jan","Feb","March","April","May","June","July"};
      AnyChartView anyChartView;
      TextView textView,heading;
      //PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anyChartView=findViewById(R.id.anychartview);
        textView=findViewById(R.id.subheading);
        heading=findViewById(R.id.heading);
        setupPieChart();
        Log.i("On Create Function","Starting to make the Chart");
    }

    public void setupPieChart()
    {
        Pie pie = AnyChart.pie();
        List<DataEntry> dataEntries=new ArrayList<>();
        for(int i=0;i<months.length;i++)
        {
            dataEntries.add(new ValueDataEntry(months[i],earnings[i]));
        }
        pie.data(dataEntries);
        anyChartView.setChart(pie);
    }

}
