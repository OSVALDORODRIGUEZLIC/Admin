package net.netasystems.business;

import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class PerlLanguaje.
 */
@Component
public class PerlLanguaje implements Languaje {

    /** The description language. */
    private String descriptionLanguage = "Valor desde anotacion";
    
    /** The version. */
    private String version= "version 9";

    /**
     * Gets the description language.
     *
     * @return the description language
     */
    public String getDescriptionLanguage() {
        return descriptionLanguage;
    }

    /**
     * Sets the description language.
     *
     * @param descriptionLanguage the new description language
     */
    public void setDescriptionLanguage(String descriptionLanguage) {
        this.descriptionLanguage = descriptionLanguage;
    }

    /* (non-Javadoc)
     * @see net.netasystems.business.Languaje#description()
     */
    public String description() {
        return descriptionLanguage;
    }

	/* (non-Javadoc)
	 * @see net.netasystems.business.Languaje#version()
	 */
	public String version() {
		// TODO Auto-generated method stub
		return version;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(String version) {
		this.version = version;
	}
}
