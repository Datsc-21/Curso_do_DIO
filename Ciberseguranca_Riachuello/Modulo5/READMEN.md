# 🛡️ Simulação de Malware com Python (Ransomware + Keylogger)

## 📌 Sobre o Projeto
Este projeto tem como objetivo demonstrar, **em ambiente controlado e com fins educacionais**, o funcionamento de dois tipos comuns de malware:

- 🔒 Ransomware (sequestro de arquivos)
- ⌨️ Keylogger (captura de teclas)

A proposta é entender **como essas ameaças operam na prática**, permitindo desenvolver uma visão crítica sobre **segurança da informação, prevenção e defesa**.

> ⚠️ **Aviso:** Este projeto é exclusivamente educacional. Não deve ser utilizado para fins maliciosos.

---

## 🎯 Objetivos de Aprendizagem

- Compreender o funcionamento de malwares na prática;
- Identificar vulnerabilidades exploradas por atacantes;
- Desenvolver scripts em Python para simulação de ataques;
- Aprender técnicas de mitigação e defesa;
- Documentar projetos técnicos no GitHub.

---

## 🧪 Ambiente Utilizado

- Sistema Operacional: Linux (ex: Kali Linux)
- Linguagem: Python 3
- Bibliotecas:
  - `pynput` (captura de teclado)
  - `cryptography` ou `os` (manipulação de arquivos)
- Ambiente controlado (máquina virtual recomendada)

---

## 🔐 Ransomware Simulado

### 📖 Descrição
O ransomware simulado tem como objetivo:

1. Criar arquivos de teste;
2. Criptografar esses arquivos;
3. Exibir uma mensagem de “resgate”;
4. Permitir a descriptografia.

---

### ⚙️ Funcionamento

- O script percorre arquivos em um diretório;
- Aplica criptografia (ex: chave simétrica);
- Altera o conteúdo dos arquivos;
- Exibe mensagem simulando ataque.

---

### ▶️ Execução

```bash
python3 ransomware.py
```
## ⌨️ Keylogger Simulado
### 📖 Descrição
O keylogger captura as teclas digitadas pelo usuário e armazena em um arquivo .txt.
