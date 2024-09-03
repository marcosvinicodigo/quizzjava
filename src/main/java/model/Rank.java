package model;

// TODO: Auto-generated Javadoc
/**
 * The Class Rank.
 */
public class Rank {
	
	/** The id. */
	private int id;
	
	/** The nome. */
	private String nome;
	
	/** The pontos. */
	private int pontos;

	/**
	 * Instantiates a new rank.
	 */
	public Rank(){
		super();
	}
	
	/**
	 * Instantiates a new rank.
	 *
	 * @param id the id
	 * @param nome the nome
	 * @param pontos the pontos
	 */
	public Rank(int id, String nome, int pontos){
		super();
		
		this.id = id;
	    this.nome = nome;
		this.pontos = pontos;
		
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
	 * Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the nome.
	 *
	 * @param nome the new nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Gets the pontos.
	 *
	 * @return the pontos
	 */
	public int getPontos() {
		return pontos;
	}

	/**
	 * Sets the pontos.
	 *
	 * @param pontos the new pontos
	 */
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

  }
