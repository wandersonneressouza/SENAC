const input = require("../input");

(async () => {

    for(let ale=-1, num, i=0; ale != num && i<10; i++){
        ale = Math.floor(Math.random()*10);
        console.log ("Digite um Numero 0 a 10");
        num =Number(await input());
    }
})(); 