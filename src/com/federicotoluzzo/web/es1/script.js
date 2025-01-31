var ruota = document.getElementById("ruota");
localStorage.setItem("deg", (0).toString());
setInterval(function () {
    localStorage.setItem("deg", (parseInt(localStorage.getItem("deg")) + 1).toString());
    ruota.style.transform = "rotate(" + localStorage.getItem("deg") + "deg)";
}, 10);
document.addEventListener("mousemove", function (mouse) {
    var item = document.getElementById("perspective");
    var rect = item.getBoundingClientRect();
    var centerX = rect.x + rect.width / 2;
    var centerY = rect.y + rect.height / 2;
    var deltaX = mouse.x - centerX;
    var deltaY = mouse.y - centerY;
    console.log("perspective(1000px) rotateX(".concat(deltaX, ") rotateY(").concat(deltaY, ")"));
    item.style.transform = "perspective(1000px) rotateX(".concat(deltaX, ") rotateY(").concat(deltaY, ")");
});
