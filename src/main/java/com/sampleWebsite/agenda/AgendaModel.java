package com.sampleWebsite.agenda;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalTime;

@Entity
@Table(name = "agenda")
public class AgendaModel {
    @Getter private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    @Getter @Setter private String AgendaTitle;
    @Getter @Setter private String AgendaSubject;
    @Getter @Setter private Date AgendaDay;
    @Getter @Setter private LocalTime AgendaTime;
    @Getter @Setter private String AgendaLink;
    @Getter @Setter private String AgendaType;
    @Getter @Setter private Boolean IsAgendaActive;
    @Getter @Setter private Timestamp AgendaCreatedAt;
    @Getter @Setter private Timestamp AgendaUpdatedAt;

    public AgendaModel() {

    }

    @Override
    public String toString() {
        return "AgendaModel{" +
                "id=" + id +
                ", agenda_title='" + AgendaTitle + '\'' +
                ", agenda_subject= " + AgendaSubject + '\''+
                ", agenda_day= " + AgendaDay + '\''+
                ", agenda_time= " + AgendaTime + '\''+
                ", agenda_link= " + AgendaLink + '\''+
                ", agenda_type= " + AgendaType + '\''+
                ", agenda_active= " + IsAgendaActive + '\''+
                ", agenda_createdat= " + AgendaCreatedAt + '\''+
                ", agenda_updatedat= " + AgendaUpdatedAt + '\''+
                '}';
    }
}
