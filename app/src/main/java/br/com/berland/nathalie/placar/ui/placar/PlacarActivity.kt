package br.com.berland.nathalie.placar.ui.placar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import br.com.berland.nathalie.placar.R
import br.com.berland.nathalie.placar.utils.KEY_EXTRA_TIME_A
import br.com.berland.nathalie.placar.utils.KEY_EXTRA_TIME_B
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    private var PlacarA = 0
            var PlacarB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        if(savedInstanceState !=null) {
            PlacarA = savedInstanceState.getInt("PLACAR_CASA")
            PlacarB = savedInstanceState.getInt("PlACAR_VISITANTE")

            tvPlacarTimeA.text = PlacarA.toString()
            tvPlacarTimeB.text = PlacarB.toString()

        }


        tvTimeA.text = intent.extras.getString(KEY_EXTRA_TIME_A)
        tvTimeB.text = intent.extras.getString(KEY_EXTRA_TIME_B)

        bt3pontostimeA.setOnClickListener{adicionaPontoTimeA(3)}
        bt2pontostimeA.setOnClickListener{adicionaPontoTimeA(2)}
        bt1pontotimeA.setOnClickListener{adicionaPontoTimeA(1)}

        bt3pontostimeB.setOnClickListener{adicionaPontoTimeB(3)}
        bt2pontostimeB.setOnClickListener{adicionaPontoTimeB(2)}
        bt1pontotimeB.setOnClickListener {adicionaPontoTimeB(1)}


    }

    private fun adicionaPontoTimeA(ponto: Int) {
        PlacarA +=ponto
        tvPlacarTimeA.text = PlacarA.toString()
    }

    private fun adicionaPontoTimeB(ponto: Int) {
        PlacarB +=ponto
        tvPlacarTimeB.text = PlacarB.toString()
    }


    override fun onResume() {
        super.onResume()
        Log.i("TAG", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("TAG", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TAG", "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("TAG", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TAG", "onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
            outState?.putInt("PLACAR_CASA", PlacarA)
            outState?.putInt("PLACAR_VISITANTE", PlacarB)
    }
}



