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

## Quarto Módulo - Primeiro JSP
* Java Server Pages (JSP) - linguagem de script, criada com o objetivo de gerar conteúdo dinâmico para páginas da internet. É possível escrever HTML com códigos JSP embutidos;
* O código (scriptlet) <% %>  é executado no servidor antes de enviar a resposta para o navegador;
* Usamos o RequestDispatcher para chamar um JSP a partir da servlet;
* Obtemos o RequestDispatcher a partir do HttpServletRequest;
* Usamos a requisição para colocar ou pegar um atributo (setAttribute(.., ..) ou getAttribute(..);

## Quinto Módulo - JSTL e Expression Language
* Expression Language - linguagem que torna o acesso dinâmico de dados mais simples, e podemos substituir alguns servlets por expression languages, marcado pelo uso de ${ };
* JavaServer Pages Standard Taglib (JSTL) - biblioteca que podemos usar para recuperar dados de forma transparente, através de tags que trazem produtividade e simplicidade para arquivos JSP;

## Sexto Módulo - Redirecionando o fluxo
* Quando é utilizado o dispatcher para ir de um servlet para outro é feita apenas uma requisição, e o redirecionamento é realizado no lado do servidor podendo assim ser chamado de **Redirecionamento Server Side**;
* Já quando devolvemos a resposta para o navegador e este, por sua vez, envia outra requisição a partir da resposta recebida. Esse tipo de redirecionamento é chamado de **Redirecionamento Client Side**, e é o mais recomendado;

## Sétimo Módulo - Arquivo web.xml e Inversão de controle
* Apesar de  ter se tornado obsoleto por conta das anotações, uma vantagem do arquivo é tornar possível realizar todas as configurações em um só lugar;
* Dentre configurações possíveis no arquivo, é possível:
	* indicar qual arquivo será exibido como 'home' de seu projeto, através da tag welcome-file;
	* definir classes de servlets, dá nomes e mapear rotas para os mesmos;
	* restringir páginas para um determinado usuário logado;
* Inversão de Controle - ocorre quando ao invés de se criar explicitamente um código, ou acompanhar todo o ciclo de vida de uma execução, o programador tem tudo isso de forma transparente;
* No caso do projeto em questão, o TomCat faz essa inversão de controle;