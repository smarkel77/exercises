let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}


document.addEventListener("DOMContentLoaded", function() {
  setPageTitle();
  displayGroceries();


  let list = document.getElementsByTagName('li');

  for (let i = 0; i < list.length; i++) {
    list[i].addEventListener("click", (event) => {
      list[i].setAttribute("class", "completed");
    });
  }

  for (let i = 0; i < list.length; i++) {
    list[i].addEventListener("dblclick", (event) => {
      list[i].removeAttribute("class", "completed");
    });
  }

  let markAllBtn = document.getElementById("toggleAll");
  let allItemsIncomplete = true;
  const listItems = document.getElementsByTagName('li');

  markAllBtn.addEventListener("click", (event) => {
    if (allItemsIncomplete) {
      markCompleted();
      markAllBtn.innerText= "Mark All Incomplete";
      allItemsIncomplete = false;
    } else {
       markIncomplete();
       markAllBtn.innerHTML = "Mark All Complete";
       allItemsIncomplete = true;
    }
  });

  function markIncomplete(){
    for(let i = 0; i < listItems.length; i++){
      listItems[i].removeAttribute('class', 'completed');
    }
  }
  function markCompleted() {
    for(let i = 0; i < listItems.length; i++){
      listItems[i].setAttribute('class', 'completed');
    }
  }

  // for (let i = 0; i < list.length; i++) {
  //   list[i].addEventListener("click", (event) => {
  //     list[i].classList.toggle("completed");
  //   });
  // }






  



});