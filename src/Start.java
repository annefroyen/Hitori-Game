import javax.servlet.http.HttpServletRequest;

public class Start {
	
	
    private String createInput;
	private String feilmelding;
	
	
	public Start(HttpServletRequest request) {
		this.createInput = request.getParameter("createInput");
		this.feilmelding = "";
		
	}

	public void feilmelding() {
		if (!validerInput()) {
			feilmelding = "Ugyldig input!";
			createInput = "";
		}
	}

	
	private boolean validerInput() {
		//TODO
		return true;
	}

	

}
