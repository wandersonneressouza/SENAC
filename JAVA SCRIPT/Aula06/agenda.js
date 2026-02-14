const input = require("../input");
const { ValTel } = require("./marcius");
const { ValEmail } = require("./marcius");

(async () => {

    let agenda = []; //declara um vetor vazio chamado agenda
    let continuar; //declara uma variave chamada continuar


    do { // inicia o meu laço
        console.log("Digite um Nome:")      // escreve no terminal o texto dentro das aspas
        let nomeE = await input(); // le do terminal e salva na variavel elegivel chamada NomeE


        console.log("Digite um Telefone:")      // escreve no terminal o texto dentro das aspas
        let telE = await input(); // le do terminal e salva na variavel elegivel chamada telE

        if (ValTel(telE)) {

        } else {
            console.log("NUMERO TELEFONE INVALIDO !!!");
        }


        console.log("Digite um Email:")
        let emailE = await input();

        if (ValEmail(emailE)) {

        } else {
            console.log("EMAIL INVALIDO");
        }

                if (!ValTel(telE) && !ValEmail(emailE))  {
                console.log ("ALGO NAO ESTA CERTO");
                return;

                } else {
                console.log("ok");
                
                }
                
            agenda.push({
            nome:       nomeE,
            telefone:   telE,
            email:      emailE
    }) 

                



        
        console.log("Dseja continuar? (sim)")      // escreve no terminal o texto dentro das aspas
        continuar = (await input()).toLowerCase(); // le do terminal, deixa tudo minsuculo e salva na variavel elegivel chamada continuar

    } while (agenda.length <= 5 && continuar == "sim") //enquanto a agenda tiver menos ou 5 elementos o programa continua e a pessoa escreve que quer continuar
    console.log(agenda) //escreve no terminal a minha


})();

