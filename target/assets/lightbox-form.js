function gradient(c,a){var b=document.getElementById(c);b.style.opacity=a;b.style.MozOpacity=a;b.style.KhtmlOpacity=a;b.style.filter="alpha(opacity="+100*a+")";b.style.display="block"}function fadein(c){for(var a=0;1>=a;)setTimeout("gradient('"+c+"',"+a+")",1E3*a+10),a+=.01}
function openbox(c,a){var b=document.getElementById("box");document.getElementById("shadowing").style.display="block";document.getElementById("boxtitle").innerHTML=c;a?(gradient("box",0),fadein("box")):b.style.display="block"}function closebox(){document.getElementById("box").style.display="none";document.getElementById("shadowing").style.display="none"};