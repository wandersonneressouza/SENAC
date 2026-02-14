const input = require("../input");

(async () => {
    console.log (" Ola , Qual o seu nome ? ");
    let nome = await input();
    console.log ("Digite agora sua Idade: ");
    let idade = await input();

    console.log (`Ola ${nome}, Sua idade é ${idade}.`);
})();