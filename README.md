# 📱 App Frases do Dia

![Status](https://img.shields.io/badge/STATUS-CONCLUÍDO-brightgreen?style=flat-square)

Um aplicativo Android simples e intuitivo desenvolvido em **Java** que entrega doses diárias de motivação e inspiração através de frases geradas aleatoriamente.

## 📋 Sobre o Projeto

O **App Frases do Dia** foi criado com o objetivo de praticar o desenvolvimento nativo Android. O aplicativo funciona como um gerador de conteúdo motivacional, sorteando frases de um banco de dados interno sempre que o usuário solicita.

Este projeto foca no uso de lógica de arrays, manipulação de elementos de UI (TextView, Button) e ciclo de vida básico de uma Activity.

## 🚀 Funcionalidades

-   **Gerador de Frases:** Ao clicar em um botão, uma nova frase é exibida na tela.
-   **Exibir todas as frases:** Ao clicar em um botão, exibe uma lista com todas as frases.
-   **Conteúdo Variado:** Banco de dados local com frases curtas de motivação, foco e reflexão.
-   **Interface Limpa:** Design minimalista focado na leitura da mensagem.

## 📱 Screenshots

| Tela Inicial | Nova Frase Gerada | Todas as Frases 
|:---:|:---:| :---: |
| <img src="/assets/print1.png"> | <img src="/assets/print3.png"> | <img src="/assets/print2.png">

## 🛠️ Tecnologias Utilizadas

-  ![Java](https://img.shields.io/badge/Linguagem-Java-ED8B00?style=flat-square&logo=java&logoColor=white)
-  ![Android Studio](https://img.shields.io/badge/IDE-Android_Studio-46A07E?style=flat-square&logo=android-studio&logoColor=white)
-  ![XML](https://img.shields.io/badge/Layout-XML-blue?style=flat-square)
-  ![Min SDK](https://img.shields.io/badge/Min_SDK-API_29_(Android_10)-7C4DFF?style=flat-square&logo=android&logoColor=white)

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
