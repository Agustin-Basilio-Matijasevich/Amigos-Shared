const btn1 = document.getElementById("btn1");
const btn2 = document.getElementById("btn2");
const btn3 = document.getElementById("btn3");
const btn4 = document.getElementById("btn4");
const musica = document.getElementById("musica");
const pre = document.getElementById("preparate");
const vid = document.getElementById("mylife");
const vid2 = document.getElementById("mylife2");
const h1 = document.getElementById("h1");
var numero = 1;

function verde() {
    if (numero == 3) {

    }
    else {

        alert("Cambio a verde");
        document.body.style.background = 'green';
        document.body.style.color = 'red';
        numero = 3;
    }
}

function rojo() {
    if (numero == 2) {

    }
    else {
        alert("Cambio a rojo");
        document.body.style.background = 'red';
        document.body.style.color = 'green';
        numero = 2;
    }
}

function amarillo() {
    if (numero == 1) {

    }
    else {
        alert("Back to the future");
        document.body.style.background = 'yellow';
        document.body.style.color = 'black';
        numero = 1;
    }
}

function fiesta() {
    if (numero == 4) {

    }
    else {
        pre.play();
        alert("PREPARATE LA PUTA QUE TE RE PARIO");
        musica.play();
        vid.hidden = false;
        vid.play();
        vid2.hidden = false;
        vid2.play();
    }
    numero = 4;

        function ca1() {
            document.body.style.background = 'green';
            document.body.style.color = 'red';
            setTimeout(ca3, 2000);
        }

        function ca2() {
            document.body.style.background = 'red';
            document.body.style.color = 'green';
            setTimeout(ca1, 2000);
        }

        function ca3() {
            document.body.style.background = 'yellow';
            document.body.style.color = 'black';
            setTimeout(ca2, 2000);
        }

    setTimeout(ca3, 1500);

}

function active() {
    btn4.hidden = false;
}

btn1.addEventListener('click', verde, true);
btn2.addEventListener('click', rojo, true);
btn3.addEventListener('click', amarillo, true);
btn4.addEventListener('click', fiesta, true);
h1.addEventListener('click', active, true);