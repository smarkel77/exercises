

function setPageTitle() {
    const title = document.getElementById('title');
    title.innerText = pageTitle;
  }


document.addEventListener("DOMContentLoaded", function() {
    setPageTitle();
    displayGroceries();

    const loadBtn = document.getElementsByClassName("loadingButton")[0];
    loadBtn.addEventListener("click", (event) => {

        fetch("shopping-list/assets/data/shopping-list.json")
        .then((response) => {
            return response.json();
        })
        .then((data) => {

        });

    });





















});