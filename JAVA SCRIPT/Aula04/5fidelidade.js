// 5. Programa de fidelidade (nível do cliente)
// Crie um programa que peça a quantidade de pontos do cliente (pontos).
// 1.	pontos < 100: "Cliente Iniciante"
// 2.	pontos >= 100 && pontos < 300: "Cliente Bronze"
// 3.	pontos >= 300 && pontos < 700: "Cliente Prata"
// 4.	pontos >= 700: "Cliente Ouro"
// 5.	Mostre o nível e um benefício, por exemplo:
// Ouro: "Direito a um combo grátis por mês."


const input = require("../input");

(async () => {

    console.log("OLA, QUAL SUA PONTUAÇÃO ")
    let pontos = Number( await input());

switch(true){
        case pontos >= 700:
            console.log("CLIENTE OURO  🥇🥇🥇 \n 🌭 VC TEM DIREITO A UM COMBO GRATIS 🌭");
        break
        case pontos >= 300:
            console.log("CLIENTE PRATA 🥈🥈🥈 ");
        break
        case pontos >= 100:
            console.log("CLIENTE BRONZE 🥉🥉🥉 ");
        break
        
        default:
            console.log("CLIENTE INICIANTE 😆😆😆 ");

}


})();