const ruota = document.getElementById("ruota");
localStorage.setItem("deg", (0).toString())

setInterval(() => {
    localStorage.setItem("deg", (parseInt(localStorage.getItem("deg")) + 1).toString());
    ruota.style.transform = "rotate(" + localStorage.getItem("deg") + "deg)";
}, 10);

document.addEventListener("mousemove", (mouse) =>  {
    const item = document.getElementById("perspective");
    const rect = item.getBoundingClientRect()
    const centerX = rect.x + rect.width / 2;
    const centerY = rect.y + rect.height / 2;

    const deltaX = mouse.x - centerX;
    const deltaY = mouse.y - centerY;

    console.log(`perspective(1000px) rotateX(${deltaX}) rotateY(${deltaY})`)
    item.style.transform = `perspective(1000px) rotateX(${deltaX}) rotateY(${deltaY})`;
});