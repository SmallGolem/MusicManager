var text = ['Music Manager','The technologie for the music'];
var size = 30;
var police = null;
var cooldown = 0.25;
var text_cooldown = 1;
var letter_cooldown = 0.02;


var title = document.getElementById('title');
var title_text = title.textContent;
let text_number;
let letter_number;

function wait(milliseconds) {
  var start = new Date().getTime();
  for (var i = 0; i < 1e7; i++) {
    if ((new Date().getTime() - start) > milliseconds){
      break;
    }
  }
}

function write() {
	
	title.innerHTML = "";
	var text_number =+ 1;
	if (text_number > text.length) var text_number = 0;
	
	for (i = 0; i < text[text_number].split(""); i++ ) {
    text.innerHTML += "<span hidden>" + text[text_number].split("")[i] + "</span>";
	}
	
}

function showLetter (){
	letters = text[text_number].split("");
}

function onTick (text) {
	letters = text[text_number].split("");
	if (letter_number > letters.length) write();
	showLetter();
		
}

setInterval(onTick(text), 0);
