// CARDAPIO LANCHONETE
//
// 1 X-SALADA
// 2 B-BURGER
// 3 MISTO QUENTE
// 4 SUCO NATURAL
// 5 REFRIGERANTE

// EXIBIR , VC ESCOLHEU X SALADA
// DEFAULT , OPÇÃO INVALIDA

const input = require("../input");

(async () => {

console.log ("BEM VINDO, ESCOLHA SEU LANCHE");
console.log ("1 X-SALADA");
console.log ("2 B-BURGER");
console.log ("3 MISTO QUENTE");
console.log ("4 SUCO NATURAL");
console.log ("5 REFRIGERANTE");
    let menu = await input();


switch(menu){
        case "1":
            console.log("VC ESCOLHEU X-SALADA");
        break

        case "2":
            console.log("VC ESCOLHEU X-BURGER");
        break

        case "3":
            console.log("VC ESCOLHEU MISTO QUENTE");
        break

        case "4":
            console.log("VC ESCOLHEU SUCO NATURAL");
        break

        case "5":
            console.log("VC ESCOLHEU REFRIGERANTE");
        break   
        
        default:
            console.log("OPÇÃO INVALIDA");

}

})();