package com.example.calculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlin.math.*
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.toRadians


class MainActivity : AppCompatActivity() {
    private lateinit var a: EditText
    private lateinit var b: EditText
    private lateinit var c: TextView
    private lateinit var d:TextView
    private lateinit var b1:Button
    private lateinit var b2:Button
    private lateinit var b3:Button
    private lateinit var b4:Button
    private lateinit var b5:Button
    private lateinit var b6:Button
    private lateinit var b7:Button
    private lateinit var b8:Button
    private lateinit var b9:Button
    private lateinit var b10:Button
    private lateinit var b11:Button
    private lateinit var b12:Button
    private lateinit var b13:Button
    private lateinit var b14:Button
    private lateinit var b15:Button
    private lateinit var b16:Button
    private lateinit var b17:Button
    private lateinit var b18:Button
    public var prev :Double= 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a = findViewById(R.id.Sum1 )
        b = findViewById(R.id.Sum2)
        c = findViewById(R.id.Sum3)
        d=findViewById(R.id.Op)
        b1=findViewById(R.id.b1)
        b2=findViewById(R.id.b2)
        b3=findViewById(R.id.b3)
        b4=findViewById(R.id.b4)
        b5=findViewById(R.id.b5)
        b6=findViewById(R.id.b6)
        b7=findViewById(R.id.b7)
        b8=findViewById(R.id.b8)
        b9=findViewById(R.id.b9)
        b10=findViewById(R.id.b10)
        b11=findViewById(R.id.b11)
        b12=findViewById(R.id.b12)
        b13=findViewById(R.id.b13)
        b14=findViewById(R.id.b14)
        b15=findViewById(R.id.b15)
        b16=findViewById(R.id.b16)
        b17=findViewById(R.id.b17)
        b18=findViewById(R.id.b18)

        a.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })
        b.addTextChangedListener( object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
            }

        } )
    }




    fun onClick(view: View) {
        val x = a.text.toString();
        val y = b.text.toString();
        if(x!="" && y!="")
        {val z = x.toDouble() - y.toDouble();
        c.text = z.toString()
        d.text="-"
        prev=z}
        else
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
        }
    }

    fun onClick1(view: View) {
        val x = a.text.toString();
        val y = b.text.toString();
        if(x!="" && y!="")
        {val z = x.toDouble() + y.toDouble();
            c.text = z.toString()
            d.text="+"
            prev=z}
        else
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
        }
    return}

    fun onClick2(view: View) {
        val x = a.text.toString();
        val y = b.text.toString();
        if(x!="" && y!="")
        {val z = x.toDouble() * y.toDouble();
            c.text = z.toString()
            d.text="*"
            prev=z}
        else
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
        }
        return
    }

    fun onClick3(view: View) {
        val x = a.text.toString()
        val y = b.text.toString()
        if(x!="" && y!="")
        {val z = x.toFloat() / y.toFloat()
        c.text = z.toFloat().toString()
        d.text="/"
        prev=z.toDouble()}
        else
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
        }
    return }

    fun onClick4(view: View) {
        var x1 = a.text.toString()
        var y1 = b.text.toString()
        if(x1=="" || y1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }
        var x = x1.toDouble()
        var y = y1.toDouble()
        var z = x % y
        if (x<0||y<0)
        {z+=y}
        c.text = z.toString()
        d.text="%(Remainder)"
        prev=z.toDouble()
    return }

    fun onClick5(view: View) {
        var  x1 = a.text.toString()
        var y1 = b.text.toString()

        if(x1=="" || y1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }
        var x=x1.toDouble()
        var y=y1.toDouble()
        var z=x.toDouble().pow(y.toDouble())
        c.text = z.toFloat().toString()
        d.text="${x}EXP${y}"
        prev=z

    return }
    public fun fac(y:Double ): Double { var z:Double=1.0
        var x=y.toInt()
        if (x==1||x==0)
        {z=1.0}
        else if(x<0)
        {z=Double.NaN}
        else{
            for(i in 2..x)
            {z*=i}}

        return z.toDouble();}
    fun onClick6(view: View) {
        var x1 = a.text.toString()
        if(x1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }
          var   x=x1.toDouble()
        val z=fac(x)
        c.text = z.toString()
        d.text="$x!"
        prev=z.toDouble()
    return }

    fun onClick7(view: View) {
        var x1 = a.text.toString()
        if(x1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }
        var x=x1.toDouble().toInt()
        if (x<0)
        {Toast.makeText(this,"Number N is negative",Toast.LENGTH_LONG).show();
            return}
        val z = (x*(x+1)*(2*x+1))/6
        c.text = z.toString()
        d.text="Sum N2 1 to $x"
        prev=z.toDouble()}
    fun onClick9(view: View) {
        var x1 = a.text.toString()
        if(x1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }
        var x=x1.toDouble().toInt()
        if (x<0)
        {   Toast.makeText(this,"Number N is Negative",Toast.LENGTH_LONG).show();
            return}
        val z = (x*(x+1))/2
        c.text = z.toString()
        d.text="Sum N:  1 to $x"
        prev=z.toDouble()}
    fun onClick8(view: View) {
        var x1 = a.text.toString()
        if(x1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }
        var x=x1.toDouble().toInt()
        if (x<0)
        {Toast.makeText(this,"Number N is Negative",Toast.LENGTH_LONG).show();
            return}
        val z = (x*(x+1)*(x+1)*x)/4
        c.text = z.toString()
        d.text="Sum N3: 1 to $x"
        prev=z.toDouble()}

    fun onClick10(view: View) {
        var x1  = a.text.toString()
        var y1  = b.text.toString()
        if(x1=="" ||y1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }
        var x=x1.toDouble()
        var y=y1.toDouble()
        if(x<=0 || y<=0)
        {
            Toast.makeText(this,"Number is Negative",Toast.LENGTH_LONG).show();
            return
        }


        val z:Double;
        if (y > x) {
            z = Double.NaN
        } else
        {
            z = (fac(x) / fac(x - y)).toFloat().toDouble()
        }
        c.text = z.toString()
        d.text="${x.toInt()}P${y.toInt()}"
        prev=z.toDouble()
    }

    fun onClick11(view: View) {

        var x1  = a.text.toString()
        var y1  = b.text.toString()

        if(x1=="" ||y1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }

        val x: Double = x1.toDouble()
        val y: Double = y1.toDouble()
        if(x<=0 || y<=0)
        {
            Toast.makeText(this,"Number is Negative",Toast.LENGTH_LONG).show();
            return
        }

        val z:Double;
        if (y > x) {
            z = Double.NaN
        } else
        {z=(fac(x)/(fac(x-y)*fac(y))).toFloat().toDouble()}
        c.text = z.toString()
        //d.text=String.format("%d &nbspC %d",x.toF,y)
        d.text="${x.toInt()}C${y.toInt()}"
        prev=z.toDouble()}

    fun onClick12(view: View) {
        val x1 = a.text.toString()
        if(x1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }
        val x=x1.toDouble()
        val z=tan(toRadians(x)).toFloat()
        c.text = z.toFloat().toString()
        d.text="tan($x)"
        prev=z.toDouble()}

    fun onClick13(view: View) {
        val x1 = a.text.toString()
        if(x1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }
        val x=x1.toDouble()
        val z= cos(toRadians(x)).toFloat()
        c.text = z.toString()
        d.text="cos($x)"
        prev=z.toDouble()}

    fun onClick14(view: View) {
        val x1 = a.text.toString()
        if(x1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }
        val x=x1.toDouble()
        val z= sin(toRadians(x)).toFloat()
        c.text = z.toFloat().toString()
        d.text="sin($x)"
        prev=z.toFloat().toDouble()}

    fun onClick15(view: View) {


        val x1 = a.text.toString()
        val y1 = b.text.toString()
        if(x1=="" ||y1=="")
        {
            Toast.makeText(this,"Textfield is Empty",Toast.LENGTH_LONG).show();
            return
        }
        val z = log(y1.toDouble(),x1.toDouble())
        c.text = z.toFloat().toString()
        d.text="log${x1}($y1)"
        prev=z}

    fun onClick16(view: View) {
        a.setText(0.0.toString())
        b.setText(0.0.toString())
        c.setText("0.0")
        d.text=""

    }

    fun onClick18(view: View) {a.setText(prev.toFloat().toString())}
}
