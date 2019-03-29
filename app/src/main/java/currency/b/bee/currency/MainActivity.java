package currency.b.bee.currency;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText edtIn;
    private Spinner spnIn;
    private Spinner spnOut;
    private TextView tvwOut;
    private Button btnCurrency;

    private double in , out ;

    // update on 10/03/2019
    private double usd = 23149.6;
    private double gbp = 30130.94;
    private double eur = 26108.97;
    private double cny = 3444.11;
    private double lak = 2.7;
    private double thb = 729.56;
    private double rub = 348.97;
    private double jpy = 208.25;
    private double krw = 20.41;
    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnIn = (Spinner) findViewById(R.id.spnIn);
        spnOut = (Spinner) findViewById(R.id.spnOut);
        btnCurrency = (Button)findViewById(R.id.btnCurrency) ;
        edtIn = (EditText) findViewById(R.id.edtIn);
        tvwOut = (TextView) findViewById(R.id.tvwOut);

        //on click spinner input


        list.add("Việt Nam Đồng(VND)");
        list.add("Đô la Mỹ (USD)");
        list.add("Bảng Anh (GBP)");
        list.add("Euro (EUR)");
        list.add("Nhân dân Tệ Trung Quốc (CNY)");
        list.add("Kíp Lào (LAK)");
        list.add("Bat Thái Lan (THB)");
        list.add("Rup Nga (RUB)");
        list.add("Yên Nhật (JPY)");
        list.add("Won Hàn Quốc (KRW)");

        ArrayAdapter<String> adapter = new ArrayAdapter(this , android.R.layout.simple_spinner_item,list );
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spnIn.setAdapter(adapter);
        spnIn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(spnIn.getSelectedItem().toString().equals("Đô la Mỹ (USD)"))
                    in = usd ;
                else if(spnIn.getSelectedItem().toString().equals("Bảng Anh (GBP)"))
                    in = gbp ;
                else if(spnIn.getSelectedItem().toString().equals("Euro (EUR)"))
                    in = eur ;
                else if(spnIn.getSelectedItem().toString().equals("Nhân dân Tệ Trung Quốc (CNY)"))
                    in = cny ;
                else if(spnIn.getSelectedItem().toString().equals("Kíp Lào (LAK)"))
                    in = lak ;
                else if(spnIn.getSelectedItem().toString().equals("Bat Thái Lan (THB)"))
                    in = thb ;
                else if(spnIn.getSelectedItem().toString().equals("Rup Nga (RUB)"))
                    in = rub ;
                else if(spnIn.getSelectedItem().toString().equals("Yên Nhật (JPY)"))
                    in = jpy ;
                else if(spnIn.getSelectedItem().toString().equals("Won Hàn Quốc (KRW)"))
                    in = krw ;
                else in = 1 ;

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        // on click spinner output


        list2.add("Việt Nam Đồng(VND)");
        list2.add("Đô la Mỹ (USD)");
        list2.add("Bảng Anh (GBP)");
        list2.add("Euro (EUR)");
        list2.add("Nhân dân Tệ Trung Quốc (CNY)");
        list2.add("Kíp Lào (LAK)");
        list2.add("Bat Thái Lan (THB)");
        list2.add("Rup Nga (RUB)");
        list2.add("Yên Nhật (JPY)");
        list2.add("Won Hàn Quốc (KRW)");

        ArrayAdapter<String> adapter2 = new ArrayAdapter(this , android.R.layout.simple_spinner_item,list2 );
        adapter2.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spnOut.setAdapter(adapter2);
        spnOut.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView2, View view, int i, long l) {
                if(spnOut.getSelectedItem().toString().equals("Đô la Mỹ (USD)"))
                    out = usd ;
                else if(spnOut.getSelectedItem().toString().equals("Bảng Anh (GBP)"))
                    out = gbp ;
                else if(spnOut.getSelectedItem().toString().equals("Euro (EUR)"))
                    out = eur ;
                else if(spnOut.getSelectedItem().toString().equals("Nhân dân Tệ Trung Quốc (CNY)"))
                    out = cny ;
                else if(spnOut.getSelectedItem().toString().equals("Kíp Lào (LAK)"))
                    out = lak ;
                else if(spnOut.getSelectedItem().toString().equals("Bat Thái Lan (THB)"))
                    out = thb ;
                else if(spnOut.getSelectedItem().toString().equals("Rup Nga (RUB)"))
                    out = rub ;
                else if(spnOut.getSelectedItem().toString().equals("Yên Nhật (JPY)"))
                    out = jpy ;
                else if(spnOut.getSelectedItem().toString().equals("Won Hàn Quốc (KRW)"))
                    out = krw ;
                else out = 1 ;

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView2) {

            }
        });

        // on click Button
        btnCurrency.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                double result = Double.parseDouble(edtIn.getText().toString());
                result = result*in/out;
                DecimalFormat df = new DecimalFormat("######.###");
                tvwOut.setText(df.format(result) + "");

            }
        });


    }


}
