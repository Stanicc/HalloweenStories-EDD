package stanic.halloweenstories.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.contains
import androidx.core.util.set
import kotlinx.android.synthetic.main.activity_main.*
import stanic.halloweenstories.R
import stanic.halloweenstories.model.UserModel
import stanic.halloweenstories.utils.Story

/*
   Activity da parte principal do quiz, onde contém as perguntas.
 */

class MainActivity : AppCompatActivity() {

    //Criando a variável do handler
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Carregando o arquivo stories.json (Onde as perguntas estão)
        val json = assets.open("stories.json")
        Story.loadStories(json)

        //Verificando se a pessoa já jogou, se ainda não estiver jogado iremos criar um novo jogo para ela.
        if (!Story.user.contains(0)) {
            val model = UserModel(0, false)
            Story.user[0] = model
        }

        //Verificando se ela já respondeu todas as perguntas, se já, iremos resetar o jogo.
        if (Story.user[0].position > (Story.stories.size() - 1)) {
            Toast.makeText(this, "Você completou todas as perguntas!", Toast.LENGTH_SHORT).show()
            Story.user[0].position = 0
        }

        //Colocando a animação de aparecimento para as respostas.
        val animation = AnimationUtils.loadAnimation(this, R.anim.fadein_anim)
        option1.startAnimation(animation)
        option2.startAnimation(animation)
        option3.startAnimation(animation)
        option4.startAnimation(animation)

        //Colocando o texto da pergunta e das respostas
        questionText.text = Story.stories[Story.user[0].position].question
        option1.text = Story.stories[Story.user[0].position].option1
        option2.text = Story.stories[Story.user[0].position].option2
        option3.text = Story.stories[Story.user[0].position].option3
        option4.text = Story.stories[Story.user[0].position].option4
    }

    //Evento para quando clicar em alguma resposta
    fun onClick(view: View) {
        //Variável para a história atual
        val story = Story.stories[Story.user[0].position]

        //Variável para o botão da resposta
        val button = view as Button

        //Iniciando a animação de click
        val animation = AnimationUtils.loadAnimation(this, R.anim.click_anim)
        button.startAnimation(animation)

        //Verificando se a pessoa clicou na resposta certa
        Story.user[0].result = button.text == story.ansower

        //Iniciando a activity do resultado, coloquei um tempo de 2 segundos para combinar com a animação do click.
        val runnable = Runnable {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
        handler.postDelayed(runnable, 2000)
    }

}
