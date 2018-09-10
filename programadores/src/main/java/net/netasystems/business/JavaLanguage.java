package net.netasystems.business;

import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaLanguage.
 */
@Component
public class JavaLanguage implements Languaje {
    
    /* (non-Javadoc)
     * @see net.netasystems.business.Languaje#description()
     */
    public String description() {
        return "Java rules!!";
    }

	/* (non-Javadoc)
	 * @see net.netasystems.business.Languaje#version()
	 */
	public String version() {
		// TODO Auto-generated method stub
		return "version"
				;
	}
}
