package de.simonkrueger.wakeuptimes.model;


import org.apache.tomcat.jni.Local;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
public class Preset {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String presetName;

    LocalTime montag;
    LocalTime dienstag;
    LocalTime mittwoch;
    LocalTime donnerstag;
    LocalTime freitag;
    LocalTime samstag;
    LocalTime sonntag;
}
