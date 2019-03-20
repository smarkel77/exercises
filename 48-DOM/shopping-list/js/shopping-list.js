// add pageTitle
const pageTitle = 'My Shopping List';

// add groceries
const groceries = ["cheese", "milk", "hotdogs", "butter", "coffee", "cookies", "bread",
                  "cereal", "donuts", "gold"];
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const page = document.getElementById('title');
  page.innerHTML = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const list = document.getElementsByTagName("ul");

  groceries.forEach((item) => {
    const listItem = document.createElement('li');
    listItem.innerHTML = item;
    list[0].appendChild(listItem);
  }

  );

}
/**
 * This function will be called wh4en the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const listItems = document.getElementsByTagName('li');
  for(let i = 0; i < listItems.length; i++){
    listItems[i].setAttribute('class', 'completed');
  }
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});

