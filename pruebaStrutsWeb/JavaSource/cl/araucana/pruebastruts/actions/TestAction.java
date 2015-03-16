package cl.araucana.pruebastruts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cl.araucana.pruebastruts.forms.LoginForm;
import cl.araucana.pruebastruts.vo.Usuario;

/**
 * @version 	1.0
 * @author
 */
public class TestAction extends Action {

	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();
		// return value
		String target = "success";
		try {

			// do something here
			LoginForm loginForm = (LoginForm) form;
			
			Usuario u = new Usuario(loginForm.getRut(),loginForm.getPassword());
			
			request.setAttribute("usuario",u);
		} catch (Exception e) {

			// Report the error using the appropriate name and ID.
			errors.add("name", new ActionError("id"));

		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

		if (!errors.isEmpty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as desired)
			target = "failure";

		} //else {

			// Forward control to the appropriate 'success' URI (change name as desired)
			
		//}

		forward = mapping.findForward(target);
		
		// Finish with
		return (forward);

	}
}
