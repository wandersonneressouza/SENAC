const input = require("../input");

(async () => {
    console.log("você tem a chve ( sim ou não) ou qual é a senha? ");
    let chave= await input();
    
    if(chave.toLowerCase() == "sim" || chave == "senac123"){
        console.log("A porta se abriu")
    }

})();