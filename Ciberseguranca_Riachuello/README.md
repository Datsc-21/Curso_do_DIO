# 🔐 Desafio: Ataques de Força Bruta com Kali Linux e Medusa

## 📌 Descrição do Desafio
Implementar, documentar e compartilhar um projeto prático utilizando **Kali Linux** e a ferramenta **Medusa**, em conjunto com ambientes vulneráveis (como **Metasploitable 2** e **DVWA**), para simular cenários de ataque de força bruta e exercitar medidas de prevenção.

### 🛠️ Atividades Propostas
- Configurar o ambiente:
  - Criar duas máquinas virtuais (**Kali Linux** e **Metasploitable 2**) no VirtualBox;
  - Configurar rede interna (**Host-Only**).

- Executar ataques simulados:
  - Ataque de força bruta em **FTP**;
  - Automação de tentativas em formulário web (**DVWA**);
  - Password spraying em **SMB** com enumeração de usuários.

- Documentar os testes:
  - Utilização de wordlists simples;
  - Comandos utilizados;
  - Validação de acessos obtidos;
  - Recomendações de mitigação.
 
  - ==============================================================================================================================================================
  - # 🔐 Projeto Prático: Simulação de Ataques de Força Bruta com Kali Linux e Medusa

## 📌 Visão Geral
Este projeto demonstra, em um **ambiente controlado**, como ataques de força bruta podem ocorrer em diferentes serviços (**FTP, Web e SMB**) e quais medidas podem ser adotadas para mitigá-los.

O laboratório foi montado utilizando máquinas virtuais para simular um cenário realista de testes de segurança.

---

## 🧪 Ambiente do Laboratório

### 🖥️ Máquinas Utilizadas
- Kali Linux (máquina atacante)
- Metasploitable 2 (máquina vulnerável)
- DVWA (aplicação web vulnerável)

### 🌐 Configuração de Rede
- Tipo de rede: Host-Only
- Comunicação direta entre as VMs

### 📡 Verificação de Conectividade
```bash
ping -c 3 (IP)

![Conexão das máquinas] (Modulo/4/Alcancadoamaquinavulnverabelnometa2.png)
