package stanic.halloweenstories.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_stories.*
import stanic.halloweenstories.R
import stanic.halloweenstories.utils.Story

class StoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stories)

        //Variável para a história atual
        val story = Story.stories[Story.user[0].position]

        //Setando o titulo e o texto da história
        storyTitle.text = story.title
        storyText.text = story.text
    }

    //Evento para quando clicar em próxima pergunta
    fun onClickInSkip(view: View) {
        //Passando a pessoa para a próxima história
        Story.user[0].position += 1

        //Iniciando a activity principal onde contém as perguntas e respostas.
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
