package net.netasystems.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class MasterProgrammer.
 */
@Component
public class MasterProgrammer implements Programmer {

	/** The languaje. */
	@Autowired
	@Qualifier(value="javaLanguage")
    private Languaje languaje;

    /**
     * Gets the languaje.
     *
     * @return the languaje
     */
    public Languaje getLanguaje() {
        return languaje;
    }

    /**
     * Sets the languaje.
     *
     * @param languaje the new languaje
     */
    public void setLanguaje(Languaje languaje) {
        this.languaje = languaje;
    }


    /* (non-Javadoc)
     * @see net.netasystems.business.Programmer#hackTheWorld()
     */
    public String hackTheWorld() {
        return "Program in :" +languaje.description();
    }

	/* (non-Javadoc)
	 * @see net.netasystems.business.Programmer#Theworld()
	 */
	public String Theworld() {
		// TODO Auto-generated method stub
		return "version :" + languaje.version() ;
	}
}