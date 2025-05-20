document.addEventListener("DOMContentLoaded", function () {
  alert("Page Loaded!");
});

function greetUser() {
  let name = document.getElementById("name").value;
  alert("Hello, " + name + "!");
}
