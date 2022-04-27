package app.ojinc.unitconverter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import app.ojinc.unitconverter.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1: Button = findViewById(R.id.n1)
        val n2: Button = findViewById(R.id.n2)
        val n3: Button = findViewById(R.id.n3)
        val n4: Button = findViewById(R.id.n4)
        val n5: Button = findViewById(R.id.n5)
        val n6: Button = findViewById(R.id.n6)
        val n7: Button = findViewById(R.id.n7)
        val n8: Button = findViewById(R.id.n8)
        val n9: Button = findViewById(R.id.n9)
        val dot: Button = findViewById(R.id.dot)
        val n0: Button = findViewById(R.id.n0)
        val nD0: Button = findViewById(R.id.nD0)
        val ac: Button = findViewById(R.id.AC)
        val back: Button = findViewById(R.id.backButton)
        val result: TextView = findViewById(R.id.resultTV)
        val input: TextView = findViewById(R.id.inputTV)
        val c: Button = findViewById(R.id.C)


        n1.setOnClickListener {
            inputTV.append(n1.text)
            result.text = (inputTV.text.toString().toDouble() / 0.3048).toString()
        }
        n2.setOnClickListener {
            inputTV.append(n2.text)
            result.text = (inputTV.text.toString().toDouble() / 0.3048).toString()
        }
        n3.setOnClickListener {
            inputTV.append(n3.text)
            result.text = (inputTV.text.toString().toDouble() / 0.3048).toString()
        }
        n4.setOnClickListener {
            inputTV.append(n4.text)
            result.text = (inputTV.text.toString().toDouble() / 0.3048).toString()
        }
        n5.setOnClickListener {
            inputTV.append(n5.text)
            result.text = (inputTV.text.toString().toDouble() / 0.3048).toString()
        }
        n6.setOnClickListener {
            inputTV.append(n6.text)
            result.text = (inputTV.text.toString().toDouble() / 0.3048).toString()
        }
        n7.setOnClickListener {
            inputTV.append(n7.text)
            result.text = (inputTV.text.toString().toDouble() / 0.3048).toString()
        }
        n8.setOnClickListener {
            inputTV.append(n8.text)
            result.text = (inputTV.text.toString().toDouble() / 0.3048).toString()
        }
        n9.setOnClickListener {
            inputTV.append(n9.text)
            result.text = (inputTV.text.toString().toDouble() / 0.3048).toString()
        }
        dot.setOnClickListener {
            inputTV.append(dot.text)
        }
        n0.setOnClickListener {
            inputTV.append(n0.text)
            result.text = (inputTV.text.toString().toDouble() / 0.3048).toString()
        }
        nD0.setOnClickListener {
            inputTV.append(nD0.text)
            result.text = (inputTV.text.toString().toDouble() / 0.3048).toString()
        }
        ac.setOnClickListener {
            input.text = ""
            result.text = ""
        }
        c.setOnClickListener {
            input.text = ""
            result.text = ""
        }

        back.setOnClickListener {
            if(inputTV.text.isEmpty()){
                result.text = "0"
            } else {
                result.text = (input.text.toString().toDouble() / 0.3048).toString()
                inputTV.text = input.text.substring(0, input.text.length - 1)
            }

        }

    }

    fun allClear(view: View) {}
}