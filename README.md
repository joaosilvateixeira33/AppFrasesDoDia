# 📱 App Frases do Dia

Um aplicativo Android simples e intuitivo desenvolvido em **Java** que entrega doses diárias de motivação e inspiração através de frases geradas aleatoriamente.

## 📋 Sobre o Projeto

O **App Frases do Dia** foi criado com o objetivo de praticar o desenvolvimento nativo Android. O aplicativo funciona como um gerador de conteúdo motivacional, sorteando frases de um banco de dados interno sempre que o usuário solicita.

Este projeto foca no uso de lógica de arrays, manipulação de elementos de UI (TextView, Button) e ciclo de vida básico de uma Activity.

## 🚀 Funcionalidades

-   **Gerador de Frases:** Ao clicar em um botão, uma nova frase é exibida na tela.
-   **Conteúdo Variado:** Banco de dados local com frases curtas de motivação, foco e reflexão.
-   **Interface Limpa:** Design minimalista focado na leitura da mensagem.

## 📱 Screenshots

| Tela Inicial | Nova Frase Gerada |
|:---:|:---:|
| <img src="https://via.placeholder.com/200x400?text=Tela+Inicial" width="200"> | <img src="https://via.placeholder.com/200x400?text=Frase+Sorteada" width="200"> |

## 🛠️ Tecnologias Utilizadas

-   **Linguagem:** [Java](https://www.java.com/)
-   **IDE:** [Android Studio](https://developer.android.com/studio)
-   **Layout:** XML (ConstraintLayout / LinearLayout)
-   **SDK Mínimo:** Android 5.0 (Lollipop) - *AJUSTE CONFORME SEU PROJETO*

## 🔧 Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/joaosilvateixeira33/AppFrasesDoDia.git](https://github.com/joaosilvateixeira33/AppFrasesDoDia.git)
    ```
2.  **Abra no Android Studio:**
    -   Inicie o Android Studio e selecione "Open an Existing Project".
    -   Navegue até a pasta onde você clonou o repositório.
3.  **Aguarde o Gradle:**
    -   Espere o Android Studio baixar as dependências e indexar o projeto.
4.  **Execute:**
    -   Conecte seu dispositivo físico ou inicie um emulador.
    -   Clique no botão de **Run** (Play verde).

## 📄 Exemplo de Código

A lógica principal de sorteio das frases utiliza a classe `Random` do Java:

```java
// Exemplo da lógica utilizada no MainActivity.java
String[] frases = {
    "O melhor está por vir.",
    "Acredite: você é capaz.",
    "Feito é melhor que perfeito."
};

int numeroAleatorio = new Random().nextInt(frases.length);
textoFrase.setText(frases[numeroAleatorio]);
