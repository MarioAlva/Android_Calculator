package edu.upc.eetac.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double [] Numeros = new double[60];
    int [] Signos = new int [59];
    int i = 0;
    int u = 0;
    String variable;
    TextView _texto;
    String texto;
    String Unidad = "rad";
    Boolean igual = false;
    Button boton;
    Boolean raddeg = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _texto = findViewById(R.id.textView);
        boton = findViewById(R.id.button15);
    }

    public void Btnmas(View view) {
        if(igual==false){
        Signos[i]=1;
        i++;
        double resultado = Double.parseDouble(variable);
        variable = null;
        Numeros[u] = resultado;
        u++;
        texto = texto + "+";
        _texto.setText(texto);
        }else{
            Signos[i]=1;
            i++;
            variable = null;
            texto = String.valueOf(Numeros[0]);
            texto = texto + "+";
            _texto.setText(texto);
            igual = false;
        }
    }
    public void Btnmenos(View view) {
        if(igual==false){
            Signos[i]=2;
            i++;
            double resultado = Double.parseDouble(variable);
            variable = null;
            Numeros[u] = resultado;
            u++;
            texto = texto + "-";
            _texto.setText(texto);
        }else{
            Signos[i]=2;
            i++;
            variable = null;
            texto = String.valueOf(Numeros[0]);
            texto = texto + "-";
            _texto.setText(texto);
            igual = false;
        }
    }
    public void Btnmultiplicar(View view) {
        if(igual==false){
        Signos[i]=3;
        i++;
        double resultado = Double.parseDouble(variable);
        variable = null;
        Numeros[u] = resultado;
        u++;
        texto = texto + "*";
        _texto.setText(texto);
    }else{
        Signos[i]=3;
        i++;
        variable = null;
        texto = String.valueOf(Numeros[0]);
        texto = texto + "*";
        _texto.setText(texto);
            igual = false;
    }
    }
    public void Btndividir(View view) {
        if(igual==false){
        Signos[i]=4;
        i++;
        double resultado = Double.parseDouble(variable);
        variable = null;
        Numeros[u] = resultado;
        u++;
        texto = texto + "/";
        _texto.setText(texto);
        }else{
            Signos[i]=4;
            i++;
            variable = null;
            texto = String.valueOf(Numeros[0]);
            texto = texto + "/";
            _texto.setText(texto);
            igual = false;
        }
    }
    public void Btnsin(View view) {
        if(texto!=null){
            texto = texto + "sin";
        }else texto = "sin";
        if(igual==false){
            Signos[i]=5;
            i++;
        }else{
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            texto = "sin";
            Signos[i]=5;
            i++;
            igual=false;
        }
        _texto.setText(texto);
    }
    public void Btncos(View view) {
        if(texto!=null){
            texto = texto + "cos";
        }else texto = "cos";
        if(igual==false){
            Signos[i]=6;
            i++;
        }else{
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            texto = "cos";
            Signos[i]=6;
            i++;
            igual=false;
        }
        _texto.setText(texto);
    }
    public void Btntan(View view) {
        if(texto!=null){
            texto = texto + "tan";
        }else texto = "tan";
        if(igual==false){
            Signos[i]=7;
            i++;
        }else{
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            texto = "tan";
            Signos[i]=7;
            i++;
            igual=false;
        }
        _texto.setText(texto);
    }
    public void Btnparenabierto(View view) {
        if(texto!=null){
            texto = texto + "(";
        }else texto = "(";
        if(igual==false){
            Signos[i]=8;
            i++;
        }else{
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            texto = "(";
            Signos[i]=8;
            i++;
            igual=false;
        }
        _texto.setText(texto);
    }
    public void Btnparencerrado(View view) {
        if(texto!=null){
            texto = texto + ")";
        }else texto = ")";
        if(igual==false){
            Signos[i]=9;
            i++;
        }else{
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            texto = ")";
            Signos[i]=9;
            i++;
            igual=false;
        }
        _texto.setText(texto);
    }
    public void Btnraddeg(View view) {
        if(!raddeg){
            boton.setText("Deg");
            raddeg = true;
        }else {
            boton.setText("Rad");
            raddeg = false;
        }
    }
    public void Btnpunto(View view) {
        if(igual==true){
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            igual=false;
        }
        if(variable!=null){
            variable = variable + ".";
        }else variable = ".";
        if(texto!=null){
            texto = texto + ".";
        }else texto = ".";
        _texto.setText(texto);
    }
    public void Btn0(View view) {
        if(igual==true){
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            igual=false;
        }
        if(variable!=null){
            variable = variable + "0";
        }else variable = "0";
        if(texto!=null){
            texto = texto + "0";
        }else texto = "0";
        _texto.setText(texto);
    }
    public void Btn1(View view) {
        if(igual==true){
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            igual=false;
        }
        if(variable!=null){
            variable = variable + "1";
        }else variable = "1";
        if(texto!=null){
            texto = texto + "1";
        }else texto = "1";
        _texto.setText(texto);
    }
    public void Btn2(View view) {
        if(igual==true){
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            igual=false;
        }
        if(variable!=null){
            variable = variable + "2";
        }else variable = "2";
        if(texto!=null){
            texto = texto + "2";
        }else texto = "2";
        _texto.setText(texto);
    }
    public void Btn3(View view) {
        if(igual==true){
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            igual=false;
        }
        if(variable!=null){
            variable = variable + "3";
        }else variable = "3";
        if(texto!=null){
            texto = texto + "3";
        }else texto = "3";
        _texto.setText(texto);
    }
    public void Btn4(View view) {
        if(igual==true){
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            igual=false;
        }
        if(variable!=null){
            variable = variable + "4";
        }else variable = "4";
        if(texto!=null){
            texto = texto + "4";
        }else texto = "4";
        _texto.setText(texto);
    }
    public void Btn5(View view) {
        if(igual==true){
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            igual=false;
        }
        if(variable!=null){
            variable = variable + "5";
        }else variable = "5";
        if(texto!=null){
            texto = texto + "5";
        }else texto = "5";
        _texto.setText(texto);
    }
    public void Btn6(View view) {
        if(igual==true){
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            igual=false;
        }
        if(variable!=null){
            variable = variable + "6";
        }else variable = "6";
        if(texto!=null){
            texto = texto + "6";
        }else texto = "6";
        _texto.setText(texto);
    }
    public void Btn7(View view) {
        if(igual==true){
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            igual=false;
        }
        if(variable!=null){
            variable = variable + "7";
        }else variable = "7";
        if(texto!=null){
            texto = texto + "7";
        }else texto = "7";
        _texto.setText(texto);
    }
    public void Btn8(View view) {
        if(igual==true){
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            igual=false;
        }
        if(variable!=null){
            variable = variable + "8";
        }else variable = "8";
        if(texto!=null){
            texto = texto + "8";
        }else texto = "8";
        _texto.setText(texto);
    }
    public void Btn9(View view) {
        if(igual==true){
            variable=null;
            texto=null;
            u=0;
            Numeros[0]=0;
            igual=false;
        }
        if(variable!=null){
            variable = variable + "9";
        }else variable = "9";
        if(texto!=null){
            texto = texto + "9";
        }else texto = "9";
        _texto.setText(texto);
    }
    public void Btnc(View view) {
            variable=null;
            texto=null;
            u=0;
            i=0;
            int j=0;
            while(j<58){
                Numeros[j]=0;
                Signos[j]=0;
                j++;
            }
        texto = null;
        _texto.setText("0");
    }
    public void Btnigual(View view) {
        double resultado = Double.parseDouble(variable);
        variable = null;
        Numeros[u] = resultado;
        u++;
        int j = 0;
        int y;
        while(j<=58){
            if(Signos[j]==8){
                y = j;
                while(y<58||Signos[y]==9){
                    Signos[y] = Signos[y+1]+9;
                    y++;
                }
                j = y;
                while(y<58){
                    Signos[y] = Signos[y+1];
                    y++;
                }
            }else j++;
        }
        j=0;
        while(j<=58){
            if(Signos[j]==12){
                Numeros[j] = Numeros[j] * Numeros[j+1];
                double probando = Numeros[j] + Numeros[j+1];
                String prob = String.valueOf(probando);
                _texto.setText(prob);

                y = j + 1;
                while(y<58){
                    Numeros[y] = Numeros[y+1];
                    Signos[y-1] = Signos[y];
                    y++;
                }
            }else if(Signos[j]==13){
                Numeros[j] = Numeros[j] / Numeros[j+1];
                y=j + 1;
                while(y<58){
                    Numeros[y] = Numeros[y+1];
                    Signos[y-1] = Signos[y];
                    y++;
                }
            }else j++;
        }
        j=0;
        while(j<=58){
            if(Signos[j]==10){
                Numeros[j] = Numeros[j] + Numeros[j+1];
                double probando = Numeros[j] + Numeros[j+1];
                String prob = String.valueOf(probando);
                _texto.setText(prob);

                y = j + 1;
                while(y<58){
                    Numeros[y] = Numeros[y+1];
                    Signos[y-1] = Signos[y];
                    y++;
                }
            }else if(Signos[j]==11){
                Numeros[j] = Numeros[j] - Numeros[j+1];
                y=j + 1;
                while(y<58){
                    Numeros[y] = Numeros[y+1];
                    Signos[y-1] = Signos[y];
                    y++;
                }
            }else j++;
        }
        j=0;
        while(j<=58){
            if(Signos[j]==5){
                if(!raddeg){
                Numeros[j] = Math.sin(Numeros[j]);
                }else Numeros[j] = Math.sin(Math.toRadians(Numeros[j]));

                y = j + 1;
                while(y<58){
                    Signos[y-1] = Signos[y];
                    y++;
                }
            }else if(Signos[j]==6){
                if(!raddeg){
                    Numeros[j] = Math.cos(Numeros[j]);
                }else Numeros[j] = Math.cos(Math.toRadians(Numeros[j]));
                y=j + 1;
                while(y<58){
                    Signos[y-1] = Signos[y];
                    y++;
                }
            }else if(Signos[j]==7){
                if(!raddeg){
                    Numeros[j] = Math.tan(Numeros[j]);
                }else Numeros[j] = Math.tan(Math.toRadians(Numeros[j]));
                y=j + 1;
                while(y<58){
                    Signos[y-1] = Signos[y];
                    y++;
                }
            }else j++;
        }
        j=0;
        while(j<=58){
            if(Signos[j]==3){
                Numeros[j] = Numeros[j] * Numeros[j+1];
                double probando = Numeros[j] + Numeros[j+1];
                String prob = String.valueOf(probando);
                _texto.setText(prob);

                y = j + 1;
                while(y<58){
                    Numeros[y] = Numeros[y+1];
                    Signos[y-1] = Signos[y];
                    y++;
                }
            }else if(Signos[j]==4){
                Numeros[j] = Numeros[j] / Numeros[j+1];
                y=j + 1;
                while(y<58){
                    Numeros[y] = Numeros[y+1];
                    Signos[y-1] = Signos[y];
                    y++;
                }
            }else j++;
        }
        j=0;
        while(j<=58){
            if(Signos[j]==1){
                Numeros[j] = Numeros[j] + Numeros[j+1];
                double probando = Numeros[j] + Numeros[j+1];
                String prob = String.valueOf(probando);
                _texto.setText(prob);

                y = j + 1;
                while(y<58){
                    Numeros[y] = Numeros[y+1];
                    Signos[y-1] = Signos[y];
                    y++;
                }
            }else if(Signos[j]==2){
                Numeros[j] = Numeros[j] - Numeros[j+1];
                y=j + 1;
                while(y<58){
                    Numeros[y] = Numeros[y+1];
                    Signos[y-1] = Signos[y];
                    y++;
                }
            }else j++;
        }
        i = 0;
        u = 1;
        igual = true;
        _texto.setText(String.valueOf(Numeros[0]));;
    }
}