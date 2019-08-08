package org.mesutormanli.pushbulletapi.model.request.push;

import java.util.Objects;

public class UpdatePushRequest {
    private Boolean dismissed;

    public Boolean getDismissed() {
        return dismissed;
    }

    public void setDismissed(Boolean dismissed) {
        this.dismissed = dismissed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdatePushRequest that = (UpdatePushRequest) o;
        return Objects.equals(dismissed, that.dismissed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dismissed);
    }

    @Override
    public String toString() {
        return "UpdatePushRequest{" +
                "dismissed=" + dismissed +
                '}';
    }
}
