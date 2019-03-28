package fernanda.itics.tesoem.edu.pasarvalores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaPantalla extends AppCompatActivity {

    TextView bienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);

        Bundle parametros = this.getIntent().getExtras();

        bienvenida = (TextView) findViewById(R.id.lblbienvenido);
        bienvenida.setText("Bienvenida " +parametros.getString("Nombre").toString());
    }
}
