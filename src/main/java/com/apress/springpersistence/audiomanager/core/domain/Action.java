package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import java.util.Date;

/**
 * Created by pfisher on 9/29/14.
 */
@Entity
public class Action extends Thing {


    private ActionStatusType actionStatus;
    @ManyToOne
    private Person agent;


    @ManyToOne
    private Place location;

    @ManyToOne
    private Person participant;

    private Date startTime;
    private Date endTime;
    @ManyToOne
    private EntryPoint target;

    public ActionStatusType getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(ActionStatusType actionStatus) {
        this.actionStatus = actionStatus;
    }

    public Person getAgent() {
        return agent;
    }

    public void setAgent(Person agent) {
        this.agent = agent;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }



    public Place getLocation() {
        return location;
    }

    public void setLocation(Place location) {
        this.location = location;
    }


    public Person getParticipant() {
        return participant;
    }

    public void setParticipant(Person participant) {
        this.participant = participant;
    }



    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public EntryPoint getTarget() {
        return target;
    }

    public void setTarget(EntryPoint target) {
        this.target = target;
    }
}
