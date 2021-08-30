package ceduc.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_uno  = (button) this.findViewById(R.id.btn_uno);
        Button btn_dos  = (button) this.findViewById(R.id.btn_dos);
        Button btn_tres  = (button) this.findViewById(R.id.btn_tres);
        Button btn_cuatro  = (button) this.findViewById(R.id.btn_cuatro);
        Button btn_cinco  = (button) this.findViewById(R.id.btn_cinco);
        Button btn_seis  = (button) this.findViewById(R.id.btn_seis);
        Button btn_siete  = (button) this.findViewById(R.id.btn_siete);
        Button btn_ocho  = (button) this.findViewById(R.id.btn_ocho);
        Button btn_nueve  = (button) this.findViewById(R.id.btn_nueve);

        Button btn_suma  = (button) this.findViewById(R.id.btn_suma);
        Button btn_resta  = (button) this.findViewById(R.id.btn_resta);
        Button btn_multiplicacion  = (button) this.findViewById(R.id.btn_multiplicacion);
        Button btn_division  = (button) this.findViewById(R.id.btn_division);
        Button btn_eliminar  = (button) this.findViewById(R.id.btn_eliminar);
        Button btn_decimal  = (button) this.findViewById(R.id.btn_decimal);

    }

}