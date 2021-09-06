package ceduc.calculadora;

import android.app.assist.AssistStructure;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_cero  = (Button) this.findViewById(R.id.btn_cero);
        Button btn_uno  = (Button) this.findViewById(R.id.btn_uno);
        Button btn_dos  = (Button) this.findViewById(R.id.btn_tres);
        Button btn_tres = (Button) this.findViewById(R.id.btn_dos);
        Button btn_cuatro = (Button) this.findViewById(R.id.btn_cuatro);
        Button btn_cinco = (Button) this.findViewById(R.id.btn_cinco);
        Button btn_seis = (Button) this.findViewById(R.id.btn_seis);
        Button btn_siete = (Button) this.findViewById(R.id.btn_siete);
        Button btn_ocho = (Button) this.findViewById(R.id.btn_ocho);
        Button btn_nueve = (Button) this.findViewById(R.id.btn_nueve);
        //Asignacion de botones operacioneales

        Button btn_name = (Button) this.findViewById(R.id.btn_name);
        Button btn_multiplicacion = (Button) this.findViewById(R.id.btn_multiplicacion);
        Button btn_division = (Button) this.findViewById(R.id.btn_division);
        Button btn_decimal = (Button) this.findViewById(R.id.btn_decimal);
        Button btn_eliminar = (Button) this.findViewById(R.id.btn_eliminar);
        Button btn_suma = (Button) this.findViewById(R.id.btn_suma);
        Button btn_resta = (Button) this.findViewById(R.id.btn_resta);
        Button btn_espacio = (Button) this.findViewById(R.id.btn_espacio);
        Button btn_igual = (Button) this.findViewById(R.id.btn_igual);
        //Asignamos pantalla

        TextView txt_display = (TextView) this.findViewById(R.id.txt_display);

        btn_cero.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("0");
            }
        });

        btn_uno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigitotView("1");
            }
        });
        btn_dos.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("2");
            }
        });
        btn_tres.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("3");
            }
        });
        btn_cuatro.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("4");
            }
        });
        btn_cinco.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("5");
            }
        });
        btn_seis.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("6");
            }
        });
        btn_siete.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("7");
            }
        });
        btn_nueve.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("9");
            }
        });
        btn_eliminar.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("ce");
            }
        });
        btn_espacio.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("←");
            }
        });
        btn_suma.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("+");
            }
        });
        btn_resta.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("-");
            }
        });
        btn_multiplicacion.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("*");
            }
        });
        btn_division.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("/");
            }
        });
        btn_decimal.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito(".");
            }
        });
        btn_igual.setOnClickListener(new.OnClickListener()) {
            public void onClick(View v) {
                setDigito("=");
            }
        });




    void setDigitotView(String s) {
        TextView txt_display =(TextView) this.findViewById(R.id.txt_display);
        String actual = txt_display.getText().toString();
        String nuevo = actual + digito;
        txt_display.setText(nuevo);

    }



        }
   }