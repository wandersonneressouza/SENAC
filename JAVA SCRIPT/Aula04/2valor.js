//  2. Cálculo de valor do pedido pelo código do produto
//  Crie um programa que tenha a seguinte tabela de preços:
//  100 - X-Salada (R$ 12.00)
//  101 - X-Burger (R$ 10.00)
//  102 - Cachorro-Quente (R$ 8.50)
//  103 - Suco (R$ 6.00)
//  104 - Refrigerante (R$ 5.00)
//  Peça:
//  1.	Código do produto
//  2.	Quantidade
//  Use switch(codigo) para:
//  ○	Definir o preço unitário.
//  ○	Calcular total = preço * quantidade.
//  ○	Exibir "Você pediu X unidades de <produto>, total R$ <valor>".
//  Caso o código não exista, o default deve exibir: "Código inválido.".

const input = require("../input");

(async () => {


console.log ("BEM VINDO, ESCOLHA SEU LANCHE PELO CODIGO ");
console.log ("100 X-SALADA          R$ 12,00");
console.log ("101 B-BURGER          R$ 10,00");
console.log ("102 CACHORRO QUENTE   R$ 8,50");
console.log ("103 SUCO NATURAL      R$ 6,00");
console.log ("104 REFRIGERANTE      R$ 5,00");
    let produto = await input();
        
    



    let valor = 0
    let lanche = ""

switch(produto){
        case "100":
            lanche = "X-SALADA"
            valor = 12.00
        break

        case "101":
            lanche = "X BURGER"
            valor = 10.00
        break

        case "102":
            lanche = "CACHORRO QUENTE"
            valor = 8.50
        break

        case "103":
            lanche = "SUCO NATURAL"
            valor = 6.00
        break

        case "104":
            lanche = "REFRIGERANTE"
            valor = 5.00
        break   
        
        default:
            console.log("OPÇÃO INVALIDA");
        return

}


console.log ("QUAL A QUANTIDADE DE PRODUTO ? ")
    let quantidade = Number(await input());



console.log(`Você pediu ${quantidade} unidades de ${lanche}, total R$ ${valor*quantidade}`)

})();