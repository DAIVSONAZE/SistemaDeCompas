package usuario.app.sistemadecompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.*;

import android.view.*;
import android.widget.*;


public class ComprasActivity extends AppCompatActivity {


    CheckBox chkarroz, chkleite, chkcarne, chkfeijao;
    Button bttotal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);

        chkarroz = (CheckBox) findViewById(R.id.ChKarroz);
        chkleite = (CheckBox) findViewById(R.id.ChKleite);
        chkcarne = (CheckBox) findViewById(R.id.ChKcarne);
        chkfeijao = (CheckBox) findViewById(R.id.ChKfeijao);

        bttotal = (Button) findViewById(R.id.butTotal);

        bttotal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0){

                double total = 0;

                if (chkarroz.isChecked()) {
                    total +=2.69;
                }


                if (chkleite.isChecked()) {
                    total += 5.00;
                }


                if (chkcarne.isChecked()) {
                    total += 9.7;
                }


                if (chkfeijao.isChecked()) {
                    total += 2.30;
                }


                AlertDialog.Builder dialogoCompras = new AlertDialog.Builder(ComprasActivity.this);
                dialogoCompras.setTitle("Aviso");
                dialogoCompras.setMessage("Valor Total de Compas: R$" + total);
                dialogoCompras.setNeutralButton("OK", null);
                dialogoCompras.show();

            }
        });

    }
}
