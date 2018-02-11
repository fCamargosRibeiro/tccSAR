import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_springSecurityOAuthaskToLinkOrCreateAccount_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/springSecurityOAuth/askToLinkOrCreateAccount.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',2,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(1, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',40,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
if(true && (flash.error)) {
printHtmlPart(5)
expressionOut.print(flash.error)
printHtmlPart(6)
}
printHtmlPart(7)
invokeTag('message','g',49,['code':("springSecurity.oauth.registration.link.not.exists"),'default':("No user was found with this account."),'args':([session.springSecurityOAuthToken.providerName])],-1)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('renderErrors','g',54,['bean':(createAccountCommand),'as':("list")],-1)
printHtmlPart(10)
})
invokeTag('hasErrors','g',56,['bean':(createAccountCommand)],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('message','g',60,['code':("springSecurity.oauth.registration.create.legend"),'default':("Create a new account")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: createAccountCommand, field: 'username', 'error'))
printHtmlPart(14)
invokeTag('message','g',62,['code':("OAuthCreateAccountCommand.username.label"),'default':("Username")],-1)
printHtmlPart(15)
invokeTag('textField','g',63,['name':("username"),'value':(createAccountCommand?.username)],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: createAccountCommand, field: 'password1', 'error'))
printHtmlPart(17)
invokeTag('message','g',66,['code':("OAuthCreateAccountCommand.password1.label"),'default':("Password")],-1)
printHtmlPart(15)
invokeTag('passwordField','g',67,['name':("password1"),'value':(createAccountCommand?.password1)],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: createAccountCommand, field: 'password2', 'error'))
printHtmlPart(18)
invokeTag('message','g',70,['code':("OAuthCreateAccountCommand.password2.label"),'default':("Password re-type")],-1)
printHtmlPart(15)
invokeTag('passwordField','g',71,['name':("password2"),'value':(createAccountCommand?.password2)],-1)
printHtmlPart(19)
invokeTag('submitButton','g',73,['name':(message(code: 'springSecurity.oauth.registration.create.button', default: 'Create'))],-1)
printHtmlPart(20)
})
invokeTag('form','g',75,['action':("createAccount"),'method':("post"),'autocomplete':("off")],2)
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('renderErrors','g',81,['bean':(linkAccountCommand),'as':("list")],-1)
printHtmlPart(10)
})
invokeTag('hasErrors','g',83,['bean':(linkAccountCommand)],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('message','g',87,['code':("springSecurity.oauth.registration.login.legend"),'default':("Link to an existing account")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: linkAccountCommand, field: 'username', 'error'))
printHtmlPart(14)
invokeTag('message','g',89,['code':("OAuthLinkAccountCommand.username.label"),'default':("Username")],-1)
printHtmlPart(15)
invokeTag('textField','g',90,['name':("username"),'value':(linkAccountCommand?.username)],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: linkAccountCommand, field: 'password', 'error'))
printHtmlPart(22)
invokeTag('message','g',93,['code':("OAuthLinkAccountCommand.password.label"),'default':("Password")],-1)
printHtmlPart(15)
invokeTag('passwordField','g',94,['name':("password"),'value':(linkAccountCommand?.password)],-1)
printHtmlPart(19)
invokeTag('submitButton','g',96,['name':(message(code: 'springSecurity.oauth.registration.login.button', default: 'Login'))],-1)
printHtmlPart(20)
})
invokeTag('form','g',98,['action':("linkAccount"),'method':("post"),'autocomplete':("off")],2)
printHtmlPart(21)
createTagBody(2, {->
invokeTag('message','g',102,['code':("springSecurity.oauth.registration.back"),'default':("Back to login page")],-1)
})
invokeTag('link','g',102,['controller':("login"),'action':("auth")],2)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',105,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975307L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
