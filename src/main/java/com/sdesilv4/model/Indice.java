package com.sdesilv4.model;

import java.util.ArrayList;
import java.util.Date;


public class Indice extends Actif
{
 private ArrayList<Action> collectionIndicePonderes;

 public Indice(String _nom, String _codeISIN, double _prix, long _volume, Date _date) {
  super(_nom, _codeISIN, _prix, _volume, _date);
  this.collectionIndicePonderes = new ArrayList<Action>();
 }

 public void addACtion(Action a, double weight)
 {
  a.addIndiceWeight(this,weight);
  collectionIndicePonderes.add(a);
 }

public String ToString()
{
 String out = "L'indice est ";
         out+= this.getNom();

}

}




