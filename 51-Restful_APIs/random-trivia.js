

$(document).ready(function () {

    $("#refreshButton").on("click", generateQuiz);
    

});


const baseUrl = "https://cors-anywhere.herokuapp.com/https://www.opentdb.com/api.php?amount=10&type=multiple";

function generateQuiz(){
    $.ajax({
        url: baseUrl,
        dataType: "json"
    })
    .done((data) => {
        makeQuiz(data);
    });
}

function makeQuiz(data) {
    const container = $("#quizQuestions");
    
    for (let i = 0; i < data.results.length; i++) {
        const results = data.results[i];
        const question = $("<h1>").html(results.question);
        const correct = results.correct_answer;
        const array = [results.correct_answer, results.incorrect_answers[0], 
                    results.incorrect_answers[1], results.incorrect_answers[2]];
        shuffleArray(array);
        const ul = $("<ul>");


        for (let j = 0; j < array.length; j++){
            let li = $("<li>").html(array[j]);
            if(array[j] == correct){
                $(li).on("click", () => {
                    $(li.addClass("correct"));
                });
            } else if (array[j] != correct) {
                $(li).on("click", () => {
                    $(li.addClass("incorrect"));
                });
            
            }
            ul.append(li);
        }
        

        container.append(question);
        container.append(ul);
    }
}




function shuffleArray(array) {
    for (var i = array.length - 1; i > 0; i--) {
        var j = Math.floor(Math.random() * (i + 1));
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

