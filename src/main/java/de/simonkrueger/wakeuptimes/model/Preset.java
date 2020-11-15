package de.simonkrueger.wakeuptimes.model;


import lombok.Getter;
import lombok.Setter;
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
    @Getter @Setter long id;
    @Getter @Setter String presetName;

    @Getter @Setter LocalTime montag;
    @Getter @Setter LocalTime dienstag;
    @Getter @Setter LocalTime mittwoch;
    @Getter @Setter LocalTime donnerstag;
    @Getter @Setter LocalTime freitag;
    @Getter @Setter LocalTime samstag;
    @Getter @Setter LocalTime sonntag;
}
