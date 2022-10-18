# E-Commerce
Projeto E-Commerce

Projeto desenvolvido com o objetivo de receber o CEP como parâmetro e retorna os dados do endereço para o frontend utilizando o serviço https://viacep.com.br/. Além disso, será criado um endereço para o lista de endereços do cliente, que, com base no e-mail do usuário, retornará a ele uma lista de endereços cadastrados pelo mesmo.

Modelo de dados conceitual (E-Commerce)
Criação de um modelo de dados conceitual que englobe as principais entidades de um e-commerce: cliente, produto, preço, carrinho de compras e pedido. 
O processo do cliente quando ele acessa um site em busca de um produto, ele(a) observa o produto e seu preço, ao realizar a escolha, o cliente adiciona no carrinho de compras e finaliza o seu pedido.

<a href="https://imgur.com/PwNKjSG"><img src="https://i.imgur.com/PwNKjSG.png" title="source: imgur.com" /></a>


# Os passos para a realização do projeto foram os seguintes:

- Criação de EnderecoController;
- Criação de EnderecoService;
- Conexão do controller com a service;
- Criação do Endereco model com os seus atributos;
- Criação do ClienteController;
- Criação do ClienteService;
- Conexão do controller com a service;
- Criação do ClienteRepository;
- Criação do Cliente model com seus atributos;
- Na service de endereco foi realizado a requisição para a URL do viacep; e
- Na service de cliente foi conectado com o repository de cliente.

Para essa etapa do projeto utilizei: Java, Spring e MySQL como banco de dados.
<div style="display: inline_block"><br>
<img align="center" alt="Bia-JAVA" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" />
<img align="center" alt="Bia-Spring" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" />
<img align="center" alt="Bia-Mysql" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" />
</div>




# Instruções para execução do projeto

- Para executar o projeto será necessário clonar o mesmo.
1. Acima da lista de arquivos, clique em Code (botão verde).

<a href="https://imgur.com/XNnjk2n"><img src="https://i.imgur.com/XNnjk2n.png" title="source: imgur.com" /></a>
                                                                
2. Copie a URL do repositório.
                                                                
<a href="https://imgur.com/I0z5pe1"><img src="https://i.imgur.com/I0z5pe1.png" title="source: imgur.com" /></a>                                                                                                     
                                                                                                
3. Abra Git Bash (Clicando com o botão direito do mouse, pode ser já no local de sua preferência).

<a href="https://imgur.com/YvZIye7"><img src="https://i.imgur.com/YvZIye7.png" title="source: imgur.com" /></a>

4. Altere o diretório de trabalho atual para o local em que deseja ter o diretório clonado (sua preferência). 

5. Digite git clone e cole a URL já copiada.

<a href="https://imgur.com/hX9X6Ba"><img src="https://i.imgur.com/hX9X6Ba.png" title="source: imgur.com" /></a>

6. Pronto! Repositório clonado com sucesso.

<a href="https://imgur.com/m98Tnnr"><img src="https://i.imgur.com/m98Tnnr.png" title="source: imgur.com" /></a>

Depois desse processo vamos importar o projeto na nossa máquina, é necessário ter o java 17 ou superior.

# Importando e rodando o projeto na sua máquina

1. Vamos abrir o spring tool suite (STS) ou Eclipse (sua preferência)
2. Clique em File, depois Import...

<a href="https://imgur.com/WUg6zo6"><img src="https://i.imgur.com/WUg6zo6.png" title="source: imgur.com" /></a>

3. Vai abrir Import, como mostra a imagem abaixo. Clique em Existing Maven Projects.

<a href="https://imgur.com/ho2LJvB"><img src="https://i.imgur.com/ho2LJvB.png" title="source: imgur.com" /></a>

4. Vai abrir Import Maven Projects, você clica em Browse... vai abrir o Select Root Folder e você vai selecionar o local onde você clonou o projeto, clique no quadradinho que tem o POM e clique em Finish.

5. O seu projeto vai carregar e ser importado com sucesso!

6. Depois disso, vamos rodar o projeto (Você pode clicar com o botão direito do mouse em TesteApplication.java, depois em Run As e por fim em Spring Boot App ou Java Application.

<a href="https://imgur.com/zfj7Gfk"><img src="https://i.imgur.com/zfj7Gfk.png" title="source: imgur.com" /></a>

7. O projeto está rodando corretamente.

<a href="https://imgur.com/NDQeLRF"><img src="https://i.imgur.com/NDQeLRF.png" title="source: imgur.com" /></a>

# Agora vamos para os testes e como chamar as APIs!

- Primeiro você vai jogar no seu navegador https://api.postmon.com.br/v1/cep/ e coloca seu cep, por exemplo: https://api.postmon.com.br/v1/cep/53525600. Note que apareceu o endereço que você passou, você pode alterar o cep para sua preferência.

<a href="https://imgur.com/vqADArQ"><img src="https://i.imgur.com/vqADArQ.png" title="source: imgur.com" /></a>

# Realizando as requisições no Postman 

1. Vou utilizar o Postman para fazer as requisições

<img align="center" alt="Bia-POSTMAN" height="60" width="70"  src="https://i.imgur.com/MqfqpRc.png" />

2. Criei uma Collection no postman (está na documentação acima, junto com todo projeto), e vamos utilizar para CepReceberEndereco(GET), AdicionarEndereco(Post), BuscarClientes(Get).

- Em CepReceberEndereco(GET), no postman você vai coloca como mostra a imagem abaixo e depois dar um Send (Observe: Coloque o CEP de sua preferência).

<a href="https://imgur.com/VuLPcJV"><img src="https://i.imgur.com/VuLPcJV.png" title="source: imgur.com" /></a>

- Em AdicionarCliente(POST), no postman você vai coloca como mostra a imagem abaixo e depois dar um Send (Observe: Você pode mudar o nome do cliente e o email de sua preferência) o resultado vai ser um Status: 201 Created.

<a href="https://imgur.com/KZW5Myt"><img src="https://i.imgur.com/KZW5Myt.png" title="source: imgur.com" /></a>

- Em AdicionarEndereco(POST), no postman você vai coloca como mostra a imagem abaixo e depois dar um Send (Observe: Você pode mudar o cep, logradouro, bairro, localidade e uf de sua preferência) o resultado vai ser um Status: 201 Created.

Observação: Na requisição você vai passar localhost:8080/cliente/2/enderecos (esse 2 é o id do cliente, que você pode altera pelo o que você cadastrou agora pouco).

<imagem>

- Em BuscarClientes(GET) você vai clica em Send e ira aparecer a lista de endereços de um cliente (representado unicamente por um e-mail). Os dados foram salvos no banco de dados como mostra a imagem abaixo.

<imagem>
<imagem>

- Em EmailClienteEndereco(GET) dado o email do usuário, vai retornar a lista de endereços cadastrados para ele, como mostra a imagem abaixo.

<imagem>

# Teste JUnit

- Vamos realizar um teste em Cliente do Projeto E-commerce. Para executarmos o teste, foi necessário realizar algumas configurações na Source Folder de testes src/test, algumas configurações no arquivo pom.xml. Antes de prosseguir, assegure que o seu projeto E-commerce não esteja em execução no STS ou no Eclipse.
  
 1. Para realizar o teste você deve ir na pasta src/test/java, depois você vai em com.teste.teste.cliente, em ClienteTeste.java você clica com o botão direito do mouse, vai em Run As e rode em JUnit Test.
 
<a href="https://imgur.com/LRPKwYy"><img src="https://i.imgur.com/LRPKwYy.png" title="source: imgur.com" /></a>

2. Pronto! O teste unitário está correto.

<a href="https://imgur.com/hpm8TII"><img src="https://i.imgur.com/hpm8TII.png" title="source: imgur.com" /></a>
  
  
  




















