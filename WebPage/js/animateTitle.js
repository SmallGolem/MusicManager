var text = ["Music Manager","The technologie for the music"];
var size = 30;
var police = null;
var cooldown = 0.25;
var text_cooldown = 1.75;
var letter_cooldown = 0.2

var title = document.getElementById(title);
var title = null

function wait(milliseconds) {
  var start = new Date().getTime();
  for (var i = 0; i < 1e7; i++) {
    if ((new Date().getTime() - start) > milliseconds){
      break;
    }
  }
}

function titleanim (text, text_cooldown, letter_cooldown) {
	while (true) {
		for (let i = 0; i < text.length; i++) {
			var letters = text[i].split("");
			for (let i = 0; i < letters.length; i++) {
	  			//console.log(letters[i]);
	 			var title = title + letters[i];
	  			wait(letter_cooldown * 1000);
			}
			wait(text_cooldown * 1000);
			var title = null;
		}
	}
}