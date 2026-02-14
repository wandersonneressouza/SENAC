

const input = require("../input");

let num = 0;
let sim;
VEZES = 0;

(async () => {

    do {
        console.log("quer continuar. Digite SIM ")
        console.log(`PASSEI AQUI ${VEZES}`)
        var cont = await input();
        VEZES ++
    } while (cont == "sim");
    
        
})();
