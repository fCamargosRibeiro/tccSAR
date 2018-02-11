package br.com.projetosar.entidades

import br.com.projetosar.entidades.Relatorio
import groovy.sql.Sql

class RelatorioService {

    def dataSource
    def springSecurityService

    String verParams(Relatorio cons, String appName){
        def form = getForm(cons,appName,getInputs(cons))
        return form
    }
    
    private String getInputs(Relatorio cons){
        def inputs = """
        <table>
            <tr>
                <td>Nome Arquivo:</td>
                <td><input type='text' name='_name' value='${cons.nome}_${new Date().format('yyyy-MM-dd')}' size=50 /></td>
            </tr>
        """
        def comando = cons.comando.split('#')
        if(comando.size()>1){
            for(i in 1..comando.size()-1){
                switch(comando[i][0]){
                case['T']:
                    inputs+=getInputText(comando[i])
                    break
                case['D']:
                    inputs+=getInputDate(comando[i])
                    break
                case['C']:
                    inputs+=getInputCombo(comando[i])
                    break
                default:
                    break
                }
            }
        }
        inputs+="""
        </table>"""
        return inputs
    }
    
    private String getInputText(String comando){
        def input = comando.split('&')
        def label = input[0][1..-1]
        def parametro = input[1][0..-1]
        return "<tr><td>${label}:</td><td><input type='text' name='${parametro}' id='${parametro}' /></td></tr>"       
    }
    
    private String getInputDate(String comando){
        def input = comando.split('&')
        def label = input[0][1..-1]
        def parametro = input[1][0..-1]
        def valor
        if(input.size() == 3){
            def opcional = input[2][0..-1].toInteger()?new Date() + input[2][0..-1].toInteger():new Date()
            valor = opcional?"value='${opcional.format('yyyy-MM-dd')}'":""
        }
        return "<tr><td>${label}:</td><td><input type='date' name='${parametro}' id='${parametro}' "+valor+" /></td></tr>"
    }
    
    private String getInputCombo(String comando){
        def db = new Sql(dataSource)
        def input = ""
        def combo = comando.split('&')
        def label = combo[0][1..-1]
        def parametroNome = combo[1][0..-1]
        def query = combo[2]
        input+="<tr><td>${label}:</td><td><select name='${parametroNome}'>"
        db.query(query){rs ->
            while(rs.next()){
                input+="<option value='${rs.getString('value')}'>${rs.getString('descricao')}</option> "
            }
        }
        input+='</select></td></tr><br>'
        return input
    }
    
    private String getForm(Relatorio cons, String appName, String inputs) {
        
        def form ="""
        <script type="text/javascript">
            function isValidForm(){
                var isValid = true;
                \$("#resultado > input").each(function(){
                    if(\$(this).val()==""){
                        isValid = false;
                    }
                });
            }
            function submit_formconsulta(link) {            
               link.parentNode._format.value = link.title;
                link.parentNode.submit();
                closebox();
                return false;
            }
        </script>
        """
        switch(cons.jrxml){
           default:
                form+=getFormJrxml(cons,appName,inputs)
                break
        }
        
        return form
    }
    
    private String getFormJrxml(Relatorio cons, String appName, String inputs){
        return """<form class="jasperReport" name="${cons.nome}" action="/${appName}/jasper/" target="_blank" method="post">
            <input type="hidden" name="_format" />
            <input type="hidden" name="_file" value="${cons.jrxml}" />
            ${inputs}
 
            <a href="#" class="jasperButton" title="PDF" onclick="return submit_formconsulta(this)">
            <img border="0"  alt="PDF" src="/${appName}/plugins/jasper-1.11.0/images/icons/PDF.gif" /></a>

            <a href="#" class="jasperButton" title="HTML" onclick="return submit_formconsulta(this)">
            <img border="0"  alt="HTML" src="/${appName}/plugins/jasper-1.11.0/images/icons/HTML.gif" /></a>

            <a href="#" class="jasperButton" title="XLS" onclick="return submit_formconsulta(this)">
            <img border="0"  alt="XLS" src="/${appName}/plugins/jasper-1.11.0/images/icons/XLS.gif" /></a>

            <a href="#" class="jasperButton" title="DOCX" onclick="return submit_formconsulta(this)">
            <img border="0"  alt="DOCX" src="/${appName}/plugins/jasper-1.11.0/images/icons/DOCX.gif" /></a>

            <a href="#" class="jasperButton" title="PPTX" onclick="return submit_formconsulta(this)">
            <img border="0"  alt="PPTX" src="/${appName}/plugins/jasper-1.11.0/images/icons/PPTX.gif" /></a>
           &nbsp;
           <br>
           <input type="button" name="cancel" value="Cancelar" onClick="closebox()">
        </form>"""
    }
    
}
