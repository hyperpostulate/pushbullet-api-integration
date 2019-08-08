package org.mesutormanli.pushbulletapi.model;

import java.util.Objects;

public class Chat {
    private String iden;
    private Boolean active;
    private Float created;
    private Float modified;
    private Boolean muted;
    private With with;

    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Float getCreated() {
        return created;
    }

    public void setCreated(Float created) {
        this.created = created;
    }

    public Float getModified() {
        return modified;
    }

    public void setModified(Float modified) {
        this.modified = modified;
    }

    public Boolean getMuted() {
        return muted;
    }

    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    public With getWith() {
        return with;
    }

    public void setWith(With with) {
        this.with = with;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(iden, chat.iden) &&
                Objects.equals(active, chat.active) &&
                Objects.equals(created, chat.created) &&
                Objects.equals(modified, chat.modified) &&
                Objects.equals(muted, chat.muted) &&
                Objects.equals(with, chat.with);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iden, active, created, modified, muted, with);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "iden='" + iden + '\'' +
                ", active=" + active +
                ", created=" + created +
                ", modified=" + modified +
                ", muted=" + muted +
                ", with=" + with +
                '}';
    }
}
