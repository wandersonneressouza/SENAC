/*

Você foi contratado para criar o sistema de uma lanchonete.

Esse sistema deve permitir que o cliente escolha o preço dos
produtos usados no lanche e, automaticamente, calcule o valor
final dos lanches considerando o lucro que o cliente espera ter

Os ingredientes são
Pão, salsicha, bacon, purê de batata, salada e batata palha

Este é o cardápio do restaurante
1 - Hotdog simples Salsicha e pure
2 - Dog Salada Salsicha e salada
3 - Dog Duplo Especial Duas salsichas, purê e bacon
4 - Dog-Tudo Duas salsichas, purê em dobro, bacon, salada

Considere que todos os lanches contém Pão e Batata Palha

------ ATIVIDADE
Mostre o valor dos lanches para o dono, sendo o preço de custo,
e o valor para o cliente final, considerando o lucro (preço venda)


*/


const input = require("../input");

(async () => {
    
    // valores pré programado.
    pao = 2,50
    salsicha = 3
    bacon = 10
    pure = 7,50
    salada = 3,50
    batata = 5
    porcentagem = 20

    //simples = (pao + batata + salsicha + pure)
    //salada = pao + batata + salsicha + salada 
    //duplo = pao + batata + salsicha + salsicha + salada 
    //tudo = pao + batata + salsicha + salsicha + pure + pure + bacon + salada 


    console.log ("VAMOS COMEÇAR, 1 PARA ADCIONAR VALORES MANUAL ou 2 PARA VALORES PRÉ PROGRAMADO: ");
    let escolha = await input();
        if(escolha == "1") {

            console.log ("VALOR DO PÃO: ");
            let pao = await input();

            console.log ("VALOR DO SALSINHA: ");
            let salsinha = await input();

            console.log ("VALOR DO BACON: ");
            let bacon = await input();

            console.log ("VALOR DO PURE DE BATATA: ");
            let pure = await input();

            console.log ("VALOR DA SALADA: ");
            let salada = await input();

            console.log ("VALOR DO BATATA PALHA: ");
            let batata = await input();

            console.log ("PORCENTAGEM DO LUCRO: ");
            let porcentagem = await input();

        }else if (escolha == "2"){
                       console.log ("PRE PROGRAMADO")     
        }else {
        console.log ("OPÇÃO INVALIDA, TENTE NOVAMENTE")
        return
        }

    console.log ("qual opção seu cliente escolheu? 1,2,3 ou 4:");
    let opção = await input();

    if (opção == "1"){
    console.log ("Vc escolheu SIMPLES 🌭")
    
        

})();