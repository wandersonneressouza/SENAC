//Converter Número para Dobro
//
//Pergunte um número ao usuário, converta com Number(), e mostre o dobro.
//
//Exemplo:
//Entrada: 7
//Saída: O dobro é 14.


const input = require("../input");

(async () => {

    console.log ("DIGITE UM NUMERO: ");
    let n1 = Number (await input());
   
    console.log (`O DOBRO DE ${n1} É ${n1*2}`);

})();