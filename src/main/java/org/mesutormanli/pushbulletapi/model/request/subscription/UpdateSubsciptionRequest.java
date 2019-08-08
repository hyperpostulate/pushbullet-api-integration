package org.mesutormanli.pushbulletapi.model.request.subscription;

import java.util.Objects;

public class UpdateSubsciptionRequest {
    private Boolean muted;

    public Boolean getMuted() {
        return muted;
    }

    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateSubsciptionRequest that = (UpdateSubsciptionRequest) o;
        return Objects.equals(muted, that.muted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(muted);
    }

    @Override
    public String toString() {
        return "UpdateSubsciptionRequest{" +
                "muted=" + muted +
                '}';
    }
}
