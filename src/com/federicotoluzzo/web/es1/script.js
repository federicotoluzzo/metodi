var ruota = document.getElementById("ruota");
localStorage.setItem("deg", (0).toString());
setInterval(function () {
    localStorage.setItem("deg", (parseInt(localStorage.getItem("deg")) + 1).toString());
    ruota.style.transform = "rotate(" + localStorage.getItem("deg") + "deg)";
}, 10);
