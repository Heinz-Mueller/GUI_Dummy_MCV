package model;

/**
 * Created by Fuse on 10.01.2017.
 */
public interface IObservableInterface
{
    public void registerObserver (IObserverInterface o);
    public void notifyObservers();
}
