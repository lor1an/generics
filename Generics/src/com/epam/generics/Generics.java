/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author lor1an
 */
public class Generics {

    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T t : a) {
            c.add(t);
        }
    }

    public static <T extends S, S> void copyAll(Collection<T> source,
            Collection<S> destination) {
        destination.removeAll(destination);
        for (T t : source) {
            destination.add(t);
        }
    }

    public static <T extends Comparable<T>, K extends Collection> Collection<T> 
            greaterThanSpecified(Collection<T> c, T spec) {
       Collection<T> resultCollection = new ArrayList<>(); 
        for (T t : c) {
            if(t.compareTo(spec)>0){
             resultCollection.add(t);
            }                
        }
       return resultCollection;
    }

    public static void main(String[] args) {
      
    }
}
