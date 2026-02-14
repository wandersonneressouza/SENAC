const input = require("../input");


(async () => {

    let sorteio = Math.floor(Math.random()*10);
    let escolha = 0
    let fim = 0

    do{
        console.log ("Digite um Numero 0 a 10")
        escolha = await input()
        fim ++

    

    }while(sorteio != escolha && fim < 10 )
    {
            console.log(`PARABENS NUMERO ERA ${sorteio}`)

    }



})();