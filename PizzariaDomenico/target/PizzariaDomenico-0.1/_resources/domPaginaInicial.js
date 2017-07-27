function main() {
  var fechar = [];
  var fecharDoces = [];
  var fecharBebidas = [];
  var abrir = document.querySelector("#abresalgadas");
  var abrirDoces = document.querySelector("#abredoces");
  var abrirBebidas = document.querySelector("#abrebebidas");
  var botaocardapio = document.querySelector("#buttoncardapio");
  var nossa = document.querySelector("#buttonnossacasa");
  var varhome = document.querySelector("#buttonhome");
  var promo = document.querySelector("#buttonpromocoes");
  var localiza = document.querySelector("#buttonlocalizacao");
  var contato = document.querySelector("#buttoncontato");

  fechar = document.querySelectorAll(".buttonsfecharsalgadas");
  for (var i = 0; i < fechar.length; i++) {
    fechar[i].addEventListener("click", hideSalgadas);
  }

  fecharDoces = document.querySelectorAll(".buttonsfechardoces");
  for (var i = 0; i < fecharDoces.length; i++) {
    fecharDoces[i].addEventListener("click", hideDoces);
  }

  fecharBebidas = document.querySelectorAll(".buttonsfecharbebidas");
  for (var i = 0; i < fecharBebidas.length; i++) {
    fecharBebidas[i].addEventListener("click", hideBebidas);
  }

  abrir.addEventListener("click", showSalgadas);
  abrirDoces.addEventListener("click", showDoces);
  abrirBebidas.addEventListener("click", showBebidas);
  varhome.addEventListener("click", home);
  promo.addEventListener("click", promocao);
  nossa.addEventListener("click", nossacasa);
  botaocardapio.addEventListener("click", cardapio);
  localiza.addEventListener("click", localizacao);
  contato.addEventListener("click", scrollcontato);
}

function home() {
  window.scrollTo(0,0);
}

function nossacasa() {
  document.querySelector("#nossacasa").scrollIntoView();
}

function promocao() {
  document.querySelector("#sessaopromocoes").scrollIntoView();
}

function cardapio() {
  document.querySelector("#sessaocardapio").scrollIntoView();
}

function localizacao() {
  document.querySelector("#sessaolocalizacao").scrollIntoView();
}

function scrollcontato() {
  document.querySelector("#sessaocontato").scrollIntoView();
}

function showSalgadas() {
  document.querySelector(".mostrarsalgadas").style.display = "block";
  document.querySelector("#abresalgadas").style.display = "none";
}

function showDoces() {
  document.querySelector(".mostrardoces").style.display = "block";
  document.querySelector("#abredoces").style.display = "none";
}

function showBebidas() {
  document.querySelector(".mostrarbebidas").style.display = "block";
  document.querySelector("#abrebebidas").style.display = "none";
}

function hideSalgadas() {
  document.querySelector(".mostrarsalgadas").style.display = "none";
  document.querySelector("#abresalgadas").style.display = "block";
}

function hideDoces() {
  document.querySelector(".mostrardoces").style.display = "none";
  document.querySelector("#abredoces").style.display = "block";
}

function hideBebidas() {
  document.querySelector(".mostrarbebidas").style.display = "none";
  document.querySelector("#abrebebidas").style.display = "block";
}

window.addEventListener("load", main);
