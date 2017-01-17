package model;

import java.util.ArrayList;

public class DataModel implements iModelInterface
{
    private String user;
    private ArrayList<IObserverInterface> m_observers = new ArrayList<IObserverInterface>();

    @Override
    public String getUser()
    {
        return user;
    }

    @Override
    public void setUser(String benutzer)
    {
        user = benutzer;
        notifyObservers();
    }

    @Override
    public void registerObserver(IObserverInterface o)
    {
        m_observers.add(o);
    }

    @Override
    public void notifyObservers()
    {
        for ( int i=0; i < m_observers.size(); ++i)
            m_observers.get(i).update();
    }
}