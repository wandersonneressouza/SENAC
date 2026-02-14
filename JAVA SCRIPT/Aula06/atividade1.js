function soma(n1, n2=0){
    return n1 + n2
}

let conta = soma(2, 2); //4
console.log(conta)

console.log("Soma é: " + soma(5, 6)  ) ;

let ale1 = Math.floor(Math.random()*11);
let ale2 = Math.floor(Math.random()*11);
console.log("Soma aleatoria é: " + soma(ale1, ale2)  ) ;