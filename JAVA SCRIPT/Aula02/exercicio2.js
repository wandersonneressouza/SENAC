//  2) Calculadora Simples (Soma)
//
//  Peça ao usuário dois números e exiba a soma.
//
//  Exemplo:
//  Perguntar "Digite o primeiro número:"
//  Perguntar "Digite o segundo número:"
//  Exibir: "A soma entre X + Y = Z."

const input = require("../input");

(async () => {

        console.log ("DIGITE UM NUMERO: ");
        let n1 = Number(await input());
        console.log ("DIGITE OUTRO NUMERO: ");
        let n2 = Number(await input());

        console.log (`A SOMA DE ${n1} + ${n2} é = ${n1+n2}`);

})();