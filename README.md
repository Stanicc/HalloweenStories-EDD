<div align="center">
  <img src="https://go.hurb.com/wp-content/uploads/2017/10/halloween-tema.jpg"><br>
  <b>Halloween quiz app</b><br><br>
</div>

## Sobre

Este aplicativo foi feito para para o evento do grupo [Elite dos desenvolvedores (EDD)](https://discord.gg/nmv9xb)

## Como funciona?

O aplicativo é bem simples, o intuito dele é para ser um quiz onde cada pergunta que você acerta você desbloqueia uma história sobre o Halloween.

* Gif do aplicativo em funcionamento (Leve em consideração que a animação do app não está funcionando corretamente. O meu PC não estava aguentando o emulador, portanto tive alguns problemas de letidão.):
<img src="https://media.giphy.com/media/U2GHN25FiYovjfjuoT/giphy.gif"><br>

## Requisitos:

* [Android Studio](https://developer.android.com/studio/install?hl=pt-br)
* Android tools instaladas (Quando iniciar o android studio pela primeira vez será feito automaticamente)
* [Git](https://git-scm.com/downloads)

## Começando

Faça uma cópia do código fonte do aplicativo

```
git clone https://github.com/contentful/the-example-app.kotlin.git
```

Depois abra o android studio e crie um novo projeto com o código fonte do aplicativo

## Emulando o aplicativo

Após ter baixado as dependências e estiver tudo pronto, você poderá emular o aplicativo.

* Emulando com um Virtual device

Clique [aqui](https://developer.android.com/studio/run/managing-avds.html?hl=pt-br) para aprender a criar um virtual device;
após ter iniciado o seu virtual device, siga os passos abaixo:

Clique em shift + F10 no seu teclado e aplicativo e o emulador serem iniciados.

* Emulando com um Real device

Ative a depuração no seu celular e coloque o cabo USB nele e no seu computador.

Clique na escolha do device que fica do lado direito de app
<img src="https://i.imgur.com/LGM3h3U.png"><br>

E escolha o seu aparelho, após isso é só clicar em shift + F10 no seu teclado e esperar o aplicativo e o emulador serem iniciados.

## Como criar novas perguntas

Para criar novas perguntas é bem simples, abra o arquivo "stories.json" locaziado em assets, lá você vai ver todas as perguntas que o aplicativo contém, copie qualquer uma e cole abaixo de todas, após isso edite as coisas e inicie o aplicativo.
<img src="https://i.imgur.com/YkvfDss.png"><br>

* Lembre-se

Você deve ser a estrutura das perguntas, veja abaixo:

Você deve colocar a pergunta entre {  }
```
  {
    "question": "Pergunta",
    "option1": "1",
    "option2": "2",
    "option3": "3",
    "option4": "4",
    "ansower": "3",
    "title": "bla bla bla",
    "text": "texto."
  }
```

Após criar outra pergunta lembre-se de por uma vírgula entre ela
```
  {
    "question": "Pergunta",
    "option1": "1",
    "option2": "2",
    "option3": "3",
    "option4": "4",
    "ansower": "3",
    "title": "bla bla bla",
    "text": "texto."
  },
    {
      "question": "Pergunta2",
      "option1": "1",
      "option2": "2",
      "option3": "3",
      "option4": "4",
      "ansower": "3",
      "title": "bla bla bla",
      "text": "texto."
    }
```

## Observações

Fiz o aplicativo com base no meu aparelho (Moto g1), portanto a resulução recomendada é 720 x 1280 (Pode não suportar outras resoluçõs)

* Caso você utilize um emulador ou aparelho com a resolução diferente o aplicativo pode não sair do jeito esperado.