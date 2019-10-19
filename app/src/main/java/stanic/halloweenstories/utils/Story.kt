package stanic.halloweenstories.utils

import android.util.SparseArray
import androidx.core.util.set
import org.json.JSONArray
import stanic.halloweenstories.model.StoryModel
import stanic.halloweenstories.model.UserModel
import java.io.InputStream

class Story {

    companion object {
        //Hashs do quiz.
        //Aqui será guardado as histórias
        val stories = SparseArray<StoryModel>()
        //Aqui será guardada as informações da pessoa.
        val user = SparseArray<UserModel>()

        //Carregando histórias
        fun loadStories(input: InputStream) {
            //Lendo o arquivo
            val jsonArray = readJson(input)

            //Enviando as histórias para a hashs e armazenando elas.
            for (i in 0 until jsonArray.length()) {
                val properties = jsonArray.getJSONObject(i)

                val storyModel = StoryModel(
                    properties.getString("question"),
                    properties.getString("option1"),
                    properties.getString("option2"),
                    properties.getString("option3"),
                    properties.getString("option4"),
                    properties.getString("ansower"),
                    properties.getString("title"),
                    properties.getString("text")
                )
                stories[i] = storyModel
            }
        }

        //Método para ler o arquivo
        private fun readJson(inputStream: InputStream): JSONArray {
            val json: String = inputStream.bufferedReader().use { it.readText() }
            return JSONArray(json)
        }
    }

}