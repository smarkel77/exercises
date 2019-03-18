function sumDouble(x, y){
    if(x === y) {
        return (x + y) * 2;
    }else {
        return x + y;
    }
}

function hasTeen(x, y, z){
    return ((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19)); 
}

function lastDigit(x, y) {
    return((x % 10) == (y % 10));
}

function seeColor(color) {
    if (color.startsWith("red")){
        return "red";
    } else if (color.startsWith("blue")){
        return "blue";
    } else {
        return "";
    }
}

function oddOnly(arr){
    let answer = [];
    for (let i = 0; i < arr.length; i++){
        if((arr[i] % 2) == 1){
            answer.push(arr[i]);
        }
    }
    return answer;
}

function frontAgain(str){
    front = str.substr(0, 2);
    end = str.substr(str.length - 2, 2);
    return (front == end);
}

function cigarParty(cigar, weekend){
    if(weekend == true && cigar >= 40){
        return true;
    }else {
        return (cigar >= 40 && cigar <= 60);
    }
}

function fizzBuzz(num){
    if(num % 5 == 0 && num % 3 == 0){
        return "FizzBuzz";
    } else if (num % 5 == 0) {
        return "Buzz";
    } else if (num % 3 == 0) {
        return "Fizz";
    } else {
        return num;
    }
}

function filterEvens(arr){
    let answer = [];
    for (let i = 0; i < arr.length; i++){
        if((arr[i] % 2) == 0){
            answer.push(arr[i]);
        }
    }
    return answer;
}

function filterBigNumbers(arr){
    let answer = [];
    for (let i = 0; i < arr.length; i++){
        if(arr[i] >= 100){
            answer.push(arr[i]);
        }
    }
    return answer;
}

function filterMultiplesOfX(arr, x){
    let answer = [];
    for (let i = 0; i < arr.length; i++){
        if(arr[i] % x == 0){
            answer.push(arr[i]);
        }
    }
    return answer;
}

function createObject(){
    let person = {
        firstName : "Steven",
        lastName : "Markel",
        age : 41,
    };
    return person;
}