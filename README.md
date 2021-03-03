# OrangeTalents-Servlets

Algumas anotações sobre o curso de Servlets realizado pela Alura.

## Primeiro Módulo - Fundamentos da Web e API de Servlets
* O Tomcat roda em cima de uma maquina virtual (JRE) e nosso projeto ira ser inicializado no tomcat;
* Tomcat entende o protocolo HTTP e roda por padrão no http://localhost:8080;
* Um servlet é um objeto Java que podemos chamar a partir de uma requisição HTTP;
* Para mapear a URL para um servlet usamos a anotação @WebServlet;
* Um servlet deve estender a classe HttpServlet e sobrescrever um determinado método (por exemplo service);

## Segundo Módulo - Trabalhando com POST e GET
* Para enviar dados a partir do navegador podemos fazer isso de duas formas diferentes. A primeira delas é inserir parâmetros da requisição na URL, utilizando o método GET do protocolo HTTP;
* GET pode não ser o mais adequado para alguns casos, como no caso de quando estamos trabalhando com parâmetros muito longos, ou no caso de quando não queremos mostrar esses parâmetros;
* A segunda forma de enviar dados do navegador é através do método POST do protocolo HTTP, e é possível utilizar um form para receber os dados e assim enviar;

## Terceiro Módulo - Definindo nosso modelo
* Aqui foi apenas criadas classes de modelo.