<p align="center"><strong>💻 Atualizado em 30 de Setembro de 2021 💻</strong></p>

<h2 align="center">Exercícios Linguagem JAVA</h2>

<!-- Aluguel de Carros -->
<details>
 <summary><strong>Aluguel Carros</strong></summary>
  <br/>
 
  <div align="center"><h3>ENUNCIADO<h3></div>
   
 ```
Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas. Porém, se a 
duração da locação ultrapassar 12 horas, a locação será cobrada com base em um valor diário. Além do 
valor da locação, é acrescido no preço o valor do imposto conforme regras do país que, no caso do Brasil,
é 20% para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um programa que lê os dados da 
locação (modelo do carro, instante inicial e final da locação), bem como o valor por hora e o valor 
diário de locação. O programa deve então gerar a nota de pagamento (contendo valor da locação, valor do
imposto e valor total do pagamento) e informar os dados na tela. Veja os exemplos.
 ```
   
<div align="center"><h3>EXEMPLO 1<h3></div>
 
<p align="center">
<img src="/Aluguel_Carros/assets/Exemplo01.png" alt="exemplo01" width="750px" height="380px"/>
</p>
 
<div align="center"><h3>EXEMPLO 2<h3></div>
 
<p align="center">
<img src="/Aluguel_Carros/assets/Exemplo02.png" alt="exemplo02" width="750px" height="380px"/>
</p>
 
<div align="center"><h3>COMPOSIÇÃO<h3></div>

<p align="center">
<img src="/Aluguel_Carros/assets/Entities.png" alt="entities" width="750px" height="380px"/>
</p>

<br/>
 
<p align="center">
<img src="/Aluguel_Carros/assets/Services.png" alt="services" width="750px" height="300px"/>
</p>
 
<br/> 

<p align="center">
<img src="/Aluguel_Carros/assets/DomainLayerDesign.png" alt="domainLayerDesign" width="600px" height="210px"/>
</p>
 
<br/>
 
<p align="center">
<img src="/Aluguel_Carros/assets/ServiceLayerDesign.png" alt="serviceLayerDesign" width="750px" height="300px"/>
</p>
 
 
 </details>

<!-- Aumento Salário dos Funcionários -->
 <details>
  <summary><strong>Aumento Salário</strong></summary>
    <br/>
 
 <div align="center"><h3>ENUNCIADO<h3></div>

```
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não 
deve haver repetição de id. 
 
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa
deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. 
Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
 
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. 
Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
```


<div align="center"><h3>RESULTADO 1<h3></div>
 
```
How many employees will be registered? 3

Emplyoee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Emplyoee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Emplyoee #3:
Id: 772
Name: Bob Green
Salary: 5000.00

Enter the employee id that will have salary increase : 536
Enter the percentage: 10.0

List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00
```

<div align="center"><h3>RESULTADO 2<h3></div>

```
How many employees will be registered? 2

Emplyoee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Emplyoee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Enter the employee id that will have salary increase: 776
This id does not exist!

List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3000.00
```
</details>
 
<!-- Automatização de Contratos -->
<details>
<summary><strong>Automatização de Contratos</strong></summary>
 
<div align="center"><h3>ENUNCIADO<h3></div>
   
 ```
Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um contrato consiste
em gerar as parcelas a serem pagas para aquele contrato, com base no número de meses desejado. A empresa 
utiliza um serviço de pagamento online para realizar o pagamento das parcelas. Os serviços de pagamento 
online tipicamente cobram um juro mensal, bem como uma taxa por pagamento. Por enquanto, o serviço 
contratado pela empresa é o do Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de 
pagamento de 2%. Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato, 
e valor total do contrato). Em seguida, o programa deve ler o número de meses para parcelamento do contrato, 
e daí gerar os registros de parcelas a serem pagas (data e valor), sendo a primeira parcela a ser paga um 
mês após a data do contrato, a segunda parcela dois meses após o contrato e assim por diante. Mostrar os 
dados das parcelas na tela.
 ```
 
<div align="center"><h3>EXEMPLO<h3></div>
 
<p align="center">
<img src="/Automatização_De_Contratos/assets/Exemplo.png" alt="exemplo" width="750px" height="380px"/>
</p>

<div align="center"><h3>COMPOSIÇÃO<h3></div>
 
<p align="center">
<img src="/Automatização_De_Contratos/assets/DomainLayerDesign.png" alt="DominLayer" width="600px" height="250px"/>
</p>
 
<p align="center">
<img src="/Automatização_De_Contratos/assets/ServiceLayerDesign.png" alt="ServiceLayer" width="700px" height="250px"/>
</p>

</details>

 
 <!-- Conta Bancária -->
<details>
 <summary><strong>Conta Bancária</strong></summary>
 
 </details>
 
 <!-- Estoque -->
<details>
 <summary><strong>Estoque</strong></summary>
 
 </details>
 
 <!-- Matriz Diagonal -->
<details>
 <summary><strong>Matriz Diagonal</strong></summary>
 
 </details>

<!-- Matriz M e N Posição -->
<details>
<summary><strong>Matriz M e N Posição</strong></summary>
    <br/>
 
 <div align="center"><h3>ENUNCIADO<h3></div>

```
Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas
contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à 
matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando 
houver, conforme exemplo.
```
 <div align="center"><h3>RESULTADO<h3></div>
  
<p align="center">
<img src="/Matriz_MN_Posicao/assets/resultado.png" alt="resultado" width="300px" height="350px"/>
  </p>
 </details>
  
<!-- Média Alunos -->
<details>
 <summary><strong>Média Alunos</strong></summary>
 
 </details>
 
<!-- Post Rede Social -->
<details>
 <summary><strong>Post Rede Social</strong></summary>
 
  </details>
  
<!-- Salário Contratos -->
<details>
<summary><strong>Salário Contratos</strong></summary>

<div align="center"><h3>ENUNCIADO<h3></div>

```
Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar do usuário um
mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo:
```
<p align="center">
<img src="/Salario_Contratos/assets/aa.png" alt="aa" width="700px" height="350px"/>
</p>
 
<div align="center"><h3>EXEMPLO<h3></div>
 
<p align="center">
<img src="/Salario_Contratos/assets/Exemplo.png" alt="exemplo" width="600px" height="450px"/>
</p>

 </details>
  
 <!-- Saque Conta Bancária -->
<details>
 <summary><strong>Saque Conta Bancária</strong></summary>
 
<div align="center"><h3>ENUNCIADO<h3></div>
 
```
Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária,
mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque 
for superior ao limite de saque da conta. Implemente a conta bancária conforme projeto abaixo:
```
<p align="center">
<img src="/Saque_Conta_Bancaria/assets/aa.png" alt="aa" width="235px" height="200px"/>
 </p>

<div align="center"><h3>EXEMPLO 01<h3></div>
 
<p align="center">
<img src="/Saque_Conta_Bancaria/assets/Exemplo01.png" alt="exemplo01" width="400px" height="200px"/>
</p>
 
<div align="center"><h3>EXEMPLO 02<h3></div> 
 
<p align="center">
<img src="/Saque_Conta_Bancaria/assets/Exemplo02.png" alt="exemplo02" width="450px" height="200px"/>
</p>

<div align="center"><h3>EXEMPLO 03<h3></div> 

<p align="center">
<img src="/Saque_Conta_Bancaria/assets/Exemplo03.png" alt="exemplo03" width="450px" height="200px"/>
</p>

<div align="center"><h3>EXEMPLO 04<h3></div> 
 
<p align="center">
<img src="/Saque_Conta_Bancaria/assets/Exemplo04.png" alt="exemplo04" width="400px" height="200px"/>
</p>
 
 </details>