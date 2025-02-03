const ruota = document.getElementById("ruota");
localStorage.setItem("deg", (0).toString())

setInterval(() => {
    localStorage.setItem("deg", (parseInt(localStorage.getItem("deg")) + 1).toString());
    ruota.style.transform = "rotate(" + localStorage.getItem("deg") + "deg)";
}, 10);

document.addEventListener("mousemove", (mouse) =>  {
    const item = document.getElementById("perspective1");
    const rect = item.getBoundingClientRect()
    const centerX = rect.x + rect.width / 2;
    const centerY = rect.y + rect.height / 2;

    const deltaX = mouse.x - centerX;
    const deltaY = mouse.y - centerY;
    //const rotY = deltaX > 0 ? Math.log(deltaX) * 2 : Math.log(-deltaX) * -2;
    //const rotX = deltaY > 0 ? Math.log(deltaY) * -2 : Math.log(-deltaY) * 2;
    const rotX = deltaY / 50;
    const rotY = deltaX / -50;
    item.style.transformStyle = "preserve-3d"
    item.style.transform = "perspective(1000px) rotateX(".concat(rotX.toString(), "deg) rotateY(").concat(rotY.toString(), "deg)");
});
document.addEventListener("mousemove", (mouse) =>  {
    const item = document.getElementById("perspective2");
    const rect = item.getBoundingClientRect()
    const centerX = rect.x + rect.width / 2;
    const centerY = rect.y + rect.height / 2;

    const deltaX = mouse.x - centerX;
    const deltaY = mouse.y - centerY;
    //const rotY = deltaX > 0 ? Math.log(deltaX) * 2 : Math.log(-deltaX) * -2;
    //const rotX = deltaY > 0 ? Math.log(deltaY) * -2 : Math.log(-deltaY) * 2;
    const rotX = deltaY / 50;
    const rotY = deltaX / -50;
    item.style.transformStyle = "preserve-3d"
    item.style.transform = "perspective(750px) rotateX(".concat(rotX.toString(), "deg) rotateY(").concat(rotY.toString(), "deg)");
});
document.addEventListener("mousemove", (mouse) =>  {
    const item = document.getElementById("perspective3");
    const rect = item.getBoundingClientRect()
    const centerX = rect.x + rect.width / 2;
    const centerY = rect.y + rect.height / 2;

    const deltaX = mouse.x - centerX;
    const deltaY = mouse.y - centerY;
    //const rotY = deltaX > 0 ? Math.log(deltaX) * 2 : Math.log(-deltaX) * -2;
    //const rotX = deltaY > 0 ? Math.log(deltaY) * -2 : Math.log(-deltaY) * 2;
    const rotX = deltaY / 50;
    const rotY = deltaX / -50;
    item.style.transformStyle = "preserve-3d"
    item.style.transform = "perspective(500px) rotateX(".concat(rotX.toString(), "deg) rotateY(").concat(rotY.toString(), "deg)");
});