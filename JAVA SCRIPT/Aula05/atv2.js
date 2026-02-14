const input = require("../input");

let num = 0;
let sim;
VEZES = 0;

(async () => {
    let cont = "sim"
    while(cont == "sim"){
    
    console.log("quer continuar. Digite SIM ")
    cont = await input();
    }

})();