/*
 * Copyright (c) 2022, Patrick D. Gilmartin @ patrickdgilmartin.tech
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package gilmartin.tech.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Patrick D. Gilmartin @ patrickdgilmartin.tech
 */
@Entity
@Table(name = "days_of_week")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DaysOfWeek.findAll", query = "SELECT d FROM DaysOfWeek d"),
    @NamedQuery(name = "DaysOfWeek.findByDaysOfWeekId", query = "SELECT d FROM DaysOfWeek d WHERE d.daysOfWeekId = :daysOfWeekId"),
    @NamedQuery(name = "DaysOfWeek.findByMonday", query = "SELECT d FROM DaysOfWeek d WHERE d.monday = :monday"),
    @NamedQuery(name = "DaysOfWeek.findByTuesday", query = "SELECT d FROM DaysOfWeek d WHERE d.tuesday = :tuesday"),
    @NamedQuery(name = "DaysOfWeek.findByWednesday", query = "SELECT d FROM DaysOfWeek d WHERE d.wednesday = :wednesday"),
    @NamedQuery(name = "DaysOfWeek.findByThursday", query = "SELECT d FROM DaysOfWeek d WHERE d.thursday = :thursday"),
    @NamedQuery(name = "DaysOfWeek.findByFriday", query = "SELECT d FROM DaysOfWeek d WHERE d.friday = :friday"),
    @NamedQuery(name = "DaysOfWeek.findBySaturday", query = "SELECT d FROM DaysOfWeek d WHERE d.saturday = :saturday"),
    @NamedQuery(name = "DaysOfWeek.findBySunday", query = "SELECT d FROM DaysOfWeek d WHERE d.sunday = :sunday")})
public class DaysOfWeek implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "days_of_week_id")
    private Integer daysOfWeekId;
    @Column(name = "monday")
    private Boolean monday;
    @Column(name = "tuesday")
    private Boolean tuesday;
    @Column(name = "wednesday")
    private Boolean wednesday;
    @Column(name = "thursday")
    private Boolean thursday;
    @Column(name = "friday")
    private Boolean friday;
    @Column(name = "saturday")
    private Boolean saturday;
    @Column(name = "sunday")
    private Boolean sunday;
    @JoinColumn(name = "course", referencedColumnName = "course_id")
    @ManyToOne(optional = false)
    private Course course;

    public DaysOfWeek() {
    }

    public DaysOfWeek(Integer daysOfWeekId) {
        this.daysOfWeekId = daysOfWeekId;
    }

    public Integer getDaysOfWeekId() {
        return daysOfWeekId;
    }

    public void setDaysOfWeekId(Integer daysOfWeekId) {
        this.daysOfWeekId = daysOfWeekId;
    }

    public Boolean getMonday() {
        return monday;
    }

    public void setMonday(Boolean monday) {
        this.monday = monday;
    }

    public Boolean getTuesday() {
        return tuesday;
    }

    public void setTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
    }

    public Boolean getWednesday() {
        return wednesday;
    }

    public void setWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
    }

    public Boolean getThursday() {
        return thursday;
    }

    public void setThursday(Boolean thursday) {
        this.thursday = thursday;
    }

    public Boolean getFriday() {
        return friday;
    }

    public void setFriday(Boolean friday) {
        this.friday = friday;
    }

    public Boolean getSaturday() {
        return saturday;
    }

    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }

    public Boolean getSunday() {
        return sunday;
    }

    public void setSunday(Boolean sunday) {
        this.sunday = sunday;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (daysOfWeekId != null ? daysOfWeekId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DaysOfWeek)) {
            return false;
        }
        DaysOfWeek other = (DaysOfWeek) object;
        if ((this.daysOfWeekId == null && other.daysOfWeekId != null) || (this.daysOfWeekId != null && !this.daysOfWeekId.equals(other.daysOfWeekId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gilmartin.tech.model.DaysOfWeek[ daysOfWeekId=" + daysOfWeekId + " ]";
    }
    
}
