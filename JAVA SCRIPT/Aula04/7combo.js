//  7. Montagem de combo (switch + “fallthrough” opcional)
//  Crie um programa que pergunte ao usuário qual combo ele quer:
//  1 - Só lanche
//  2 - Lanche + batata
//  3 - Lanche + batata + refrigerante
//  Ao final, exiba:
//  "Você escolheu: <descricaoCombo>".
//  

const input = require("../input");

(async () => {

console.log("🍽️    SEJA BEM VINDO, ESCOLHA SEU COMBO    🍴\n            😊    1,2 OU 3    😂")
    let numb = await input();
    
    switch (numb)){
        case 1:
            console.log (" VC ESCOLHEU SÓ LANCHE ");
        break
        case 2:
            console.log (" VC ESCOLHEU LANCHE + BATATA ");
        break
        case 3:
            console.log (" VC ESCOLHEU + BATATA + REFIGERANTE  ");
        break
        default:
            console.log("OPÇÃO INVALIDA ");


})();