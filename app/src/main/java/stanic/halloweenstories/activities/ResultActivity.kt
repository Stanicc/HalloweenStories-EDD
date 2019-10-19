package stanic.halloweenstories.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*
import stanic.halloweenstories.R
import stanic.halloweenstories.utils.Story

class ResultActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Animação de zoom do resultado.
        val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_anim)

        //Verificando se o resultado está correto ou errado.
        if (Story.user[0].result) {
            retryButton.visibility = View.GONE
            resultText.text = "Você acertou!"
        }
        else {
            skipButton.visibility = View.GONE
            showStoryButton.visibility = View.GONE
            resultText.text = "Você errou!"
        }
        resultText.startAnimation(animation)
    }

    //Evento de clicar no botão para ver a história
    fun onClickInStory(view: View) {
        //Iniciando activity da história
        val intent = Intent(this, StoriesActivity::class.java)
        startActivity(intent)
    }

    //Evento de clicar no botão para a próxima pergunta
    fun onClickInSkip(view: View) {
        //Passando a pessoa para a próxima história
        Story.user[0].position += 1

        //Iniciando a activity principal onde contém as perguntas e respostas.
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    //Evento para quando clicar em tentar novamente
    fun onClickInRetry(view: View) {
        //Iniciando a activity principal onde contém as perguntas e respostas.
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
