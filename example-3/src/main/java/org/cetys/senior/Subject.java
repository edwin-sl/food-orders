package org.cetys.senior;

/**
 * Created by edwin on May, 2020
 */
// TODO: change to use template
public interface Subject
{
    void attach(Observer o);
    void detach(Observer o);
    void notifyUpdate(float payed);
}