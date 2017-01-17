package controller;

import model.*;
import view.*;

/**
 * Created by E.E on 10.01.2017.
 */

public class einloggenController implements iControllerInterface
{
    private iModelInterface m_model;
    private Einloggen einloggFenster;

    /**
     * Erstellt einen einlogenController.
     */
    public einloggenController (iModelInterface model)
    {
        //einloggFenster = einloggFenster;
        m_model = model;
    }

    /**
     * Prüft User und übergibt dem Model.
     */
    public void setBenutzer (String user)
    {
        boolean error = false;

        if ( !error )
        {
            m_model.setUser(user);
        }
    }

}
