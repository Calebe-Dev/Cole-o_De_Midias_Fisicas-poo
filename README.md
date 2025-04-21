# 🎵🎬 Sistema de Organização de Mídias Físicas

Projeto Java orientado a objetos para organização de mídias físicas como CDs, Vinis e Fitas K7. O objetivo é criar um sistema modular que armazene e exiba informações detalhadas sobre cada mídia da coleção, considerando aspectos físicos e artísticos.

---

## 🧠 Conceitos Aplicados

Este projeto foi desenvolvido com foco em **Programação Orientada a Objetos (POO)**. Os principais conceitos usados são:

- **Abstração**: Criação de classes genéricas como `Midia` e `FormatoFisico` que representam entidades do mundo real.
- **Herança**: Especialização de classes, como `CD`, `Vinil` e `FitaK7` que herdam de `FormatoFisico`.
- **Encapsulamento**: Atributos privados com acesso controlado via getters e setters.
- **Polimorfismo**: Métodos sobrescritos como `exibirInfo()` que se comportam de forma diferente dependendo do tipo de mídia.

---

## 📁 Estrutura do Projeto

```
calebe/
└── poo/
    ├── Aplic.java               # Classe principal (main)
    ├── Midia.java               # Classe base para todas as mídias
    ├── MidiaMusical.java        # Classe para mídias musicais
    ├── FormatoFisico.java       # Classe base para CDs, Vinis, Fitas
    ├── CD.java                  # Classe especializada de FormatoFisico
    ├── Vinil.java               # Classe especializada de FormatoFisico
    └── FitaK7.java              # Classe especializada de FormatoFisico
```

---

## 💡 Exemplo de Uso

A classe `Aplic.java` instancia uma mídia musical em formato **Vinil**, preenchendo com faixas dos lados A e B, artistas, letras e outras informações relevantes.

### Saída esperada (resumida):
```
===== INFORMAÇÕES DA MÍDIA MUSICAL =====
Título: Album de Teste
Artistas: Artista 1, Artista 2
Número de Faixas: 6
Nacionalidade: Brasil
Data de Lançamento: 01/01/1990
Data de Aquisição: 15/04/2024

--- Informações do Formato Físico ---
Nome: Disco de Teste
Duração: 45.5
Observações: Vinil clássico de capa dupla
Conservação: Bom estado
Faixas Lado A:
  1. Intro
  2. Primeira Música
  3. Segunda Música
Faixas Lado B:
  1. Terceira Música
  2. Quarta Música
  3. Encerramento
```

---

## 🔧 Como Rodar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/midias-fisicas.git
   ```

2. Abra o projeto em uma IDE como **NetBeans**, **IntelliJ** ou **VS Code** com suporte a Java.

3. Compile e execute a classe `Aplic.java`.

---

## ✍️ Autor

**Calebe (cah)**  
Projeto desenvolvido para estudo e prática de Programação Orientada a Objetos com Java.

---

## 📌 Licença

Este projeto está sob a licença MIT - sinta-se livre para usar, estudar e modificar. ✌️
```
