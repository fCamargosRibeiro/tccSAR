function getPasteEvent(){var d=document.createElement("input");d.setAttribute("onpaste","");return"function"===typeof d.onpaste?"paste":"input"}var pasteEventName=getPasteEvent()+".mask",ua=navigator.userAgent,iPhone=/iphone/i.test(ua),android=/android/i.test(ua),caretTimeoutId;$.mask={definitions:{9:"[0-9]",a:"[A-Za-z]","*":"[A-Za-z0-9]"},dataName:"rawMaskFn",placeholder:"_"};
$.fn.extend({caret:function(d,f){var g;if(0!==this.length&&!this.is(":hidden")){if("number"==typeof d)return f="number"===typeof f?f:d,this.each(function(){this.setSelectionRange?this.setSelectionRange(d,f):this.createTextRange&&(g=this.createTextRange(),g.collapse(!0),g.moveEnd("character",f),g.moveStart("character",d),g.select())});this[0].setSelectionRange?(d=this[0].selectionStart,f=this[0].selectionEnd):document.selection&&document.selection.createRange&&(g=document.selection.createRange(),d=
0-g.duplicate().moveStart("character",-1E5),f=d+g.text.length);return{begin:d,end:f}}},unmask:function(){return this.trigger("unmask")},mask:function(d,f){var g,s,h,n,p,m;if(!d&&0<this.length)return g=$(this[0]),g.data($.mask.dataName)();f=$.extend({placeholder:$.mask.placeholder,completed:null},f);s=$.mask.definitions;h=[];n=m=d.length;p=null;$.each(d.split(""),function(f,d){"?"==d?(m--,n=f):s[d]?(h.push(new RegExp(s[d])),null===p&&(p=h.length-1)):h.push(null)});return this.trigger("unmask").each(function(){function g(c){for(;++c<
m&&!h[c];);return c}function v(c,k){var a,b;if(!(0>c)){a=c;for(b=g(k);a<m;a++)if(h[a]){if(b<m&&h[a].test(l[b]))l[a]=l[b],l[b]=f.placeholder;else break;b=g(b)}q();e.caret(Math.max(p,c))}}function w(c){var k=c.which,a,b;if(8===k||46===k||iPhone&&127===k){a=e.caret();b=a.begin;a=a.end;if(0===a-b){if(46!==k)for(;0<=--b&&!h[b];);else b=a=g(b-1);a=46===k?g(a):a}t(b,a);v(b,a-1);c.preventDefault()}else 27==k&&(e.val(u),e.caret(0,r()),c.preventDefault())}function x(c){var k=c.which,a=e.caret();if(!(c.ctrlKey||
c.altKey||c.metaKey||32>k)&&k){0!==a.end-a.begin&&(t(a.begin,a.end),v(a.begin,a.end-1));a=g(a.begin-1);if(a<m&&(k=String.fromCharCode(k),h[a].test(k))){var b,d,n,p;b=a;for(d=f.placeholder;b<m;b++)if(h[b])if(n=g(b),p=l[b],l[b]=d,n<m&&h[n].test(p))d=p;else break;l[a]=k;q();a=g(a);android?setTimeout($.proxy($.fn.caret,e,a),0):e.caret(a);f.completed&&a>=m&&f.completed.call(e)}c.preventDefault()}}function t(c,e){var a;for(a=c;a<e&&a<m;a++)h[a]&&(l[a]=f.placeholder)}function q(){e.val(l.join(""))}function r(c){var d=
e.val(),a=-1,b,g;for(pos=b=0;b<m;b++)if(h[b]){for(l[b]=f.placeholder;pos++<d.length;)if(g=d.charAt(pos-1),h[b].test(g)){l[b]=g;a=b;break}if(pos>d.length)break}else l[b]===d.charAt(pos)&&b!==n&&(pos++,a=b);c?q():a+1<n?(e.val(""),t(0,m)):(q(),e.val(e.val().substring(0,a+1)));return n?b:p}var e=$(this),l=$.map(d.split(""),function(c,d){if("?"!=c)return s[c]?f.placeholder:c}),u=e.val();e.data($.mask.dataName,function(){return $.map(l,function(c,d){return h[d]&&c!=f.placeholder?c:null}).join("")});e.attr("readonly")||
e.one("unmask",function(){e.unbind(".mask").removeData($.mask.dataName)}).bind("focus.mask",function(){clearTimeout(caretTimeoutId);var c;u=e.val();c=r();caretTimeoutId=setTimeout(function(){q();c==d.length?e.caret(0,c):e.caret(c)},10)}).bind("blur.mask",function(){r();e.val()!=u&&e.change()}).bind("keydown.mask",w).bind("keypress.mask",x).bind(pasteEventName,function(){setTimeout(function(){var c=r(!0);e.caret(c);f.completed&&c==e.val().length&&f.completed.call(e)},0)});r()})}});