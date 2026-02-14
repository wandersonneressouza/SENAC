//  6. Forma de pagamento e acréscimos/descontos
//  Crie um programa que peça:
//  ○	Valor da compra (valor).
//  ○	Forma de pagamento (numérico):
//  1 - Dinheiro (10% de desconto)
//  2 - Débito (5% de desconto)
//  3 - Crédito (sem desconto)
//  4 - Pix (8% de desconto)
//  Use switch(formaPagamento) para:
//  ○	Calcular o valor final com desconto (ou não).
//  ○	Exibir a mensagem: "Forma escolhida: <nome>. Valor final: R$ <valorFinal>".
//  ○	Em default: "Forma de pagamento inválida."
//  

const input = require("../input");

(async () => {

    console.log("\n OLA, QUAL O VALOR DA SUA COMPRA: \n")
    let compra = Number( await input());

    console.log("\n QUAL A FORMA DE PAGAMENTO: \n 1-DINHEIRO \n 2-PIX \n 3-DEBITO \n 4-CREDITO \n")
    let pag = Number( await input());

    switch(pag){
        case 1:
            console.log("\n Dinheiro (10% de desconto) \b total a pagar  " +  (compra - compra * 0.1));
        break
        case 2:
            console.log("\n Pix (8% de desconto) \n total a pagar " +  (compra - compra * 0.08));
        break    
        case 3:
            console.log("\n Débito (5% de desconto) \n total a pagar " +  (compra - compra * 0.05));
        break                       
        default:
            console.log("\n Crédito (sem desconto) \n Valor total " + (compra) );


}







})();