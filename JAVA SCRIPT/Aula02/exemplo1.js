// fazendo uma importação trazer função externas para este arquivo
const input = require("../input");
// declarei uma variavel do tipo constant chamada imput.

//async = assincrono 

(async () => [
    console.log(  "Qual a sua idade:" ); 
    let idade = await input();
    console.log("A sua idade é " + idade);
])();

