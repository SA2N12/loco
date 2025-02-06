function animateUnderline(element) {
    element.style.transition = "all 0.6s ease-in-out";
    element.style.textDecorationColor = "#f97316"; // orange-400
    element.style.textDecorationThickness = "2px";
}

function resetUnderline(element) {
    element.style.transition = "all 0.6s ease-in-out";
    element.style.textDecorationColor = "transparent";
    element.style.textDecorationThickness = "0px";
}