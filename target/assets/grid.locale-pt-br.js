/*
 jqGrid Brazilian-Portuguese Translation
 Sergio Righi sergio.righi@gmail.com
 http://curve.com.br

 Updated by Jonnas Fonini
 http://fonini.net


 Updated by Fabio Ferreira da Silva fabio_ferreiradasilva@yahoo.com.br


 Updated by Anderson Pimentel anderson.pimentel[at]gmail.com


 Dual licensed under the MIT and GPL licenses:
 http://www.opensource.org/licenses/mit-license.php
 http://www.gnu.org/licenses/gpl.html
*/
(function(a){"function"===typeof define&&define.amd?define(["jquery"],a):"object"===typeof exports?a(require("jquery")):a(jQuery)})(function(a){a.jgrid=a.jgrid||{};a.extend(!0,a.jgrid,{defaults:{locale:"pt-BR"},locales:{"pt-BR":{name:"Portugu\u00eas (Brasil)",nameEnglish:"Portuguese (Brazil)",isRTL:!1,defaults:{recordtext:"Ver {0} - {1} de {2}",emptyrecords:"Nenhum registro para visualizar",loadtext:"Carregando...",pgtext:"P\u00e1gina {0} de {1}",pgfirst:"Primeira P\u00e1gina",pglast:"\u00daltima P\u00e1gina",
pgnext:"Pr\u00f3xima P\u00e1gina",pgprev:"P\u00e1gina Anterior",pgrecs:"Registros por P\u00e1gina",showhide:"Exibir/Ocultar Grid",savetext:"Salvando..."},search:{caption:"Procurar...",Find:"Procurar",Reset:"Limpar",odata:[{oper:"eq",text:"igual"},{oper:"ne",text:"diferente"},{oper:"lt",text:"menor"},{oper:"le",text:"menor ou igual"},{oper:"gt",text:"maior"},{oper:"ge",text:"maior ou igual"},{oper:"bw",text:"inicia com"},{oper:"bn",text:"n\u00e3o inicia com"},{oper:"in",text:"est\u00e1 em"},{oper:"ni",
text:"n\u00e3o est\u00e1 em"},{oper:"ew",text:"termina com"},{oper:"en",text:"n\u00e3o termina com"},{oper:"cn",text:"cont\u00e9m"},{oper:"nc",text:"n\u00e3o cont\u00e9m"},{oper:"nu",text:"nulo"},{oper:"nn",text:"n\u00e3o nulo"}],groupOps:[{op:"AND",text:"todos"},{op:"OR",text:"qualquer um"}],addGroupTitle:"Add subgroup",deleteGroupTitle:"Delete group",addRuleTitle:"Add rule",deleteRuleTitle:"Delete rule",operandTitle:"Clique para escolher a opera\u00e7\u00e3o de pesquisa.",resetTitle:"Limpar valor da pesquisa"},
edit:{addCaption:"Incluir",editCaption:"Alterar",bSubmit:"Enviar",bCancel:"Cancelar",bClose:"Fechar",saveData:"Os dados foram alterados! Salvar altera\u00e7\u00f5es?",bYes:"Sim",bNo:"N\u00e3o",bExit:"Cancelar",msg:{required:"Campo obrigat\u00f3rio",number:"Por favor, informe um n\u00famero v\u00e1lido",minValue:"valor deve ser igual ou maior que ",maxValue:"valor deve ser menor ou igual a",email:"este e-mail n\u00e3o \u00e9 v\u00e1lido",integer:"Por favor, informe um valor inteiro",date:"Por favor, informe uma data v\u00e1lida",
url:"n\u00e3o \u00e9 uma URL v\u00e1lida. Prefixo obrigat\u00f3rio ('http://' or 'https://')",nodefined:" n\u00e3o est\u00e1 definido!",novalue:" um valor de retorno \u00e9 obrigat\u00f3rio!",customarray:"Fun\u00e7\u00e3o customizada deve retornar um array!",customfcheck:"Fun\u00e7\u00e3o customizada deve estar presente em caso de valida\u00e7\u00e3o customizada!"}},view:{caption:"Ver Registro",bClose:"Fechar"},del:{caption:"Apagar",msg:"Apagar registro(s) selecionado(s)?",bSubmit:"Apagar",bCancel:"Cancelar"},
nav:{edittext:"",edittitle:"Alterar registro selecionado",addtext:"",addtitle:"Incluir novo registro",deltext:"",deltitle:"Apagar registro selecionado",searchtext:"",searchtitle:"Procurar registros",refreshtext:"",refreshtitle:"Recarregar tabela",alertcap:"Aviso",alerttext:"Por favor, selecione um registro",viewtext:"",viewtitle:"Ver linha selecionada",savetext:"",savetitle:"Salvar linha",canceltext:"",canceltitle:"Cancelar edi\u00e7\u00e3o da linha"},col:{caption:"Mostrar/Esconder Colunas",bSubmit:"Enviar",
bCancel:"Cancelar"},errors:{errcap:"Erro",nourl:"Nenhuma URL definida",norecords:"Sem registros para exibir",model:"Comprimento de colNames <> colModel!"},formatter:{integer:{thousandsSeparator:" ",defaultValue:"0"},number:{decimalSeparator:",",thousandsSeparator:" ",decimalPlaces:2,defaultValue:"0,00"},currency:{decimalSeparator:",",thousandsSeparator:".",decimalPlaces:2,prefix:"R$ ",suffix:"",defaultValue:"0,00"},date:{dayNames:"Dom Seg Ter Qua Qui Sex S\u00e1b Domingo Segunda Ter\u00e7a Quarta Quinta Sexta S\u00e1bado".split(" "),
monthNames:"Jan Fev Mar Abr Mai Jun Jul Ago Set Out Nov Dez Janeiro Fevereiro Mar\u00e7o Abril Maio Junho Julho Agosto Setembro Outubro Novembro Dezembro".split(" "),AmPm:["am","pm","AM","PM"],S:function(a){return 11>a||13<a?["\u00ba","\u00ba","\u00ba","\u00ba"][Math.min((a-1)%10,3)]:"\u00ba"},srcformat:"Y-m-d",newformat:"d/m/Y",masks:{ShortDate:"n/j/Y",LongDate:"l, F d, Y",FullDateTime:"l, F d, Y g:i:s A",MonthDay:"F d",ShortTime:"g:i A",LongTime:"g:i:s A",YearMonth:"F, Y"}}}}}})});