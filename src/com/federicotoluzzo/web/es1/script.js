var ruota = document.getElementById("ruota");
localStorage.setItem("deg", (0).toString());
setInterval(function () {
    localStorage.setItem("deg", (parseInt(localStorage.getItem("deg")) + 1).toString());
    ruota.style.transform = "rotate(" + localStorage.getItem("deg") + "deg)";
}, 10);
document.addEventListener("mousemove", function (mouse) {
    var item = document.getElementById("perspective1");
    var rect = item.getBoundingClientRect();
    var centerX = rect.x + rect.width / 2;
    var centerY = rect.y + rect.height / 2;
    var deltaX = mouse.x - centerX;
    var deltaY = mouse.y - centerY;
    //const rotY = deltaX > 0 ? Math.log(deltaX) * 2 : Math.log(-deltaX) * -2;
    //const rotX = deltaY > 0 ? Math.log(deltaY) * -2 : Math.log(-deltaY) * 2;
    var rotX = deltaY / 50;
    var rotY = deltaX / -50;
    item.style.transformStyle = "preserve-3d";
    item.style.transform = "perspective(1000px) rotateX(".concat(rotX.toString(), "deg) rotateY(").concat(rotY.toString(), "deg)");
});
document.addEventListener("mousemove", function (mouse) {
    var item = document.getElementById("perspective2");
    var rect = item.getBoundingClientRect();
    var centerX = rect.x + rect.width / 2;
    var centerY = rect.y + rect.height / 2;
    var deltaX = mouse.x - centerX;
    var deltaY = mouse.y - centerY;
    //const rotY = deltaX > 0 ? Math.log(deltaX) * 2 : Math.log(-deltaX) * -2;
    //const rotX = deltaY > 0 ? Math.log(deltaY) * -2 : Math.log(-deltaY) * 2;
    var rotX = deltaY / 50;
    var rotY = deltaX / -50;
    item.style.transformStyle = "preserve-3d";
    item.style.transform = "perspective(750px) rotateX(".concat(rotX.toString(), "deg) rotateY(").concat(rotY.toString(), "deg)");
});
document.addEventListener("mousemove", function (mouse) {
    var item = document.getElementById("perspective3");
    var rect = item.getBoundingClientRect();
    var centerX = rect.x + rect.width / 2;
    var centerY = rect.y + rect.height / 2;
    var deltaX = mouse.x - centerX;
    var deltaY = mouse.y - centerY;
    //const rotY = deltaX > 0 ? Math.log(deltaX) * 2 : Math.log(-deltaX) * -2;
    //const rotX = deltaY > 0 ? Math.log(deltaY) * -2 : Math.log(-deltaY) * 2;
    var rotX = deltaY / 50;
    var rotY = deltaX / -50;
    item.style.transformStyle = "preserve-3d";
    item.style.transform = "perspective(500px) rotateX(".concat(rotX.toString(), "deg) rotateY(").concat(rotY.toString(), "deg)");
});
