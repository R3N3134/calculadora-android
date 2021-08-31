package ceduc.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_cero  = (button) this.findViewById(R.id.btn_cero);
        Button btn_uno  = (button) this.findViewById(R.id.btn_uno);
        Button btn_dos  = (button) this.findViewById(R.id.btn_dos);
        Button btn_tres = (button) this.findViewById(R.id.btn_tres);
        Button btn_cuatro = (button) this.findViewById(R.id.btn_cuatro);
        Button btn_cinco = (button) this.findViewById(R.id.btn_cinco);
        Button btn_seis = (button) this.findViewById(R.id.btn_seis);
        Button btn_siete = (button) this.findViewById(R.id.btn_siete);
        Button btn_ocho = (button) this.findViewById(R.id.btn_ocho);
        Button btn_nueve = (button) this.findViewById(R.id.btn_nueve);
        //Asignacion de botones operacioneales

        Button btn_name = (Button) this.findViewById(R.id.btn_name);
        Button btn_multiplicacion = (Button) this.findViewById(R.id.btn_multiplicacion);
        Button btn_division = (Button) this.findViewById(R.id.btn_division);
        Button btn_decimal = (Button) this.findViewById(R.id.btn_decimal);
        Button btn_eliminar = (Button) this.findViewById(R.id.btn_eliminar);
        Button btn_suma = (Button) this.findViewById(R.id.btn_suma);
        Button btn_resta = (Button) this.findViewById(R.id.btn_resta);
        Button btn_espacio = (Button) this.findViewById(R.id.btn_espacio);
        //Asignamos pantalla

        TextView txt_display = (TextView) this.findViewById(R.id.txt_display);

        btn_cero.setOnClickListener(new.OnClickListener()) {
            public void onClick (View v){ setDigito("0"); }
        });
        btn_uno.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("1"); }
        });

        btn_dos.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("2"); }
        });
        btn_tres.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("3"); }
        });
        btn_cuatro.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("4"); }
        });
        btn_cinco.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("5"); }
        });
        btn_seis.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("6"); }
        });
        btn_siete.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("7"); }
        });
        btn_ocho.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("8"); }
        });
        btn_nueve.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("9"); }
        });
        btn_suma.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("+"); }
        });
        btn_resta.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("-"); }
        });
        btn_multiplicacion.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("*"); }
        });
        btn_division.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("/"); }
        });
        btn_eliminar.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("ce"); }
        });
        btn_decimal.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("."); }
        });
        btn_espacio.set0nClickListener(new View.OnClickListener()) {
            public void onClickListener (View v){ setDigito("←"); }
        });

        void setDigito(String digito) {
        TextView txt_display =(TextView) this.findViewById(R.id.txt_display);
        String actual = txt_display.getText().toString();
        String nuevo = actual + digito;
        txt_display.setText(nuevo);

                void setDigito(String digito) {
                TextView txt_display =(TextView) this.findViewById(R.id.txt_display);
                String actual = txt_display.getText().toString();
                String nuevo = actual / digito;
                txt_display.setText(nuevo);


        }
   }