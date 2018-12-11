package br.com.berland.nathalie.placar.ui.placar.placaraac

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.berland.nathalie.placar.R
import kotlinx.android.synthetic.main.activity_placar_aac.*

class PlacarAACActivity : AppCompatActivity() {

    lateinit var placarAACViewModel: PlacarAACViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar_aac)

        placarAACViewModel = ViewModelProviders
                .of(this)
                .get(PlacarAACViewModel::class.java)

        registraObservers()

        bt3pontostimeA.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeA(ponto = 3)

        }
        bt2pontostimeA.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeA(ponto = 2)
        }

        bt1pontotimeA.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeA(ponto = 1)
        }

        bt3pontostimeB.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeB(ponto = 3)
        }

        bt2pontostimeB.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeB(ponto = 2)
        }

        bt1pontotimeB.setOnClickListener {
            placarAACViewModel.adicionarPontoTimeB(ponto = 1)
        }

        btReiniciar.setOnClickListener {
            placarAACViewModel.reiniciarJogo()
        }
    }

    private fun registraObservers() {
        placarAACViewModel.placarA.observe(this, Observer {
            tvPlacarTimeA.text = it.toString()
        })

        placarAACViewModel.placarB.observe(this, Observer {
            tvPlacarTimeB.text = it.toString()
        })
    }
}


