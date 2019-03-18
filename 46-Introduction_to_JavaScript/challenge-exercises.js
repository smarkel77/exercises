function iqTest(x){
    let arrOfNums = x.split(" ");
    let even = 0;
    let odd = 0;
    if (x == ""){
        return 0;
    }
    for (let i = 0; i < arrOfNums.length; i++){
        if (arrOfNums[i] % 2 == 0){
            even++;
        } else {
            odd++;
        }
    }
    if (odd == 0 || even == 0){
        return 0;
    }
    if (even > odd) {
        for (let i = 0; i < arrOfNums.length; i++){
            if (arrOfNums[i] % 2 == 1){
                return i + 1;
            } 
        }
    }
    if (odd > even) {
        for (let i = 0; i < arrOfNums.length; i++){
            if (arrOfNums[i] % 2 == 0){
                return i + 1;
            } 
        }
    }
    if (odd == even){
        return 0;
    }
}