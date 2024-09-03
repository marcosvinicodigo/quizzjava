package model;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaBeans.
 */
public class JavaBeans {
	
	/** The id. */
	private int id;
	
	/** The pergunta. */
	private String pergunta;
	
	/** The resp 1. */
	private String resp1;
	
	/** The resp 2. */
	private String resp2;
	
	/** The resp 3. */
	private String resp3;
	
	
	/** The resp 4. */
	private String resp4;
	
	/** The respcerta. */
	private int respcerta;
	
	/**
	 * Instantiates a new java beans.
	 */
	public JavaBeans(){
		super();
	}
	
	/**
	 * Instantiates a new java beans.
	 *
	 * @param id the id
	 * @param pergunta the pergunta
	 * @param resp1 the resp 1
	 * @param resp2 the resp 2
	 * @param resp3 the resp 3
	 * @param resp4 the resp 4
	 * @param respcerta the respcerta
	 */
	public JavaBeans(int id, String pergunta, String resp1, String resp2, String resp3, String resp4, int respcerta){
		super();
		
		this.id = id;
		this.pergunta = pergunta;
		this.resp1 = resp1;
		this.resp2 = resp2;
		this.resp3 = resp3;
		this.resp4 = resp4;
		this.respcerta = respcerta;
		
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the pergunta.
	 *
	 * @return the pergunta
	 */
	public String getPergunta() {
		return pergunta;
	}

	/**
	 * Sets the pergunta.
	 *
	 * @param pergunta the new pergunta
	 */
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	/**
	 * Gets the resp 1.
	 *
	 * @return the resp 1
	 */
	public String getResp1() {
		return resp1;
	}

	/**
	 * Sets the resp 1.
	 *
	 * @param resp1 the new resp 1
	 */
	public void setResp1(String resp1) {
		this.resp1 = resp1;
	}

	/**
	 * Gets the resp 2.
	 *
	 * @return the resp 2
	 */
	public String getResp2() {
		return resp2;
	}

	/**
	 * Sets the resp 2.
	 *
	 * @param resp2 the new resp 2
	 */
	public void setResp2(String resp2) {
		this.resp2 = resp2;
	}

	/**
	 * Gets the resp 3.
	 *
	 * @return the resp 3
	 */
	public String getResp3() {
		return resp3;
	}

	/**
	 * Sets the resp 3.
	 *
	 * @param resp3 the new resp 3
	 */
	public void setResp3(String resp3) {
		this.resp3 = resp3;
	}

	/**
	 * Gets the resp 4.
	 *
	 * @return the resp 4
	 */
	public String getResp4() {
		return resp4;
	}

	/**
	 * Sets the resp 4.
	 *
	 * @param resp4 the new resp 4
	 */
	public void setResp4(String resp4) {
		this.resp4 = resp4;
	}

	/**
	 * Gets the respcerta.
	 *
	 * @return the respcerta
	 */
	public int getRespcerta() {
		return respcerta;
	}

	/**
	 * Sets the respcerta.
	 *
	 * @param respcerta the new respcerta
	 */
	public void setRespcerta(int respcerta) {
		this.respcerta = respcerta;
	}
	


}
