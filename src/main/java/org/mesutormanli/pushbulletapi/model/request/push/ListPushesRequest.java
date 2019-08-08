package org.mesutormanli.pushbulletapi.model.request.push;

import java.util.Objects;

public class ListPushesRequest {
    private String modifiedAfter;
    private String active;
    private String cursor;
    private Integer limit;

    public String getModifiedAfter() {
        return modifiedAfter;
    }

    public void setModifiedAfter(String modifiedAfter) {
        this.modifiedAfter = modifiedAfter;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListPushesRequest that = (ListPushesRequest) o;
        return Objects.equals(modifiedAfter, that.modifiedAfter) &&
                Objects.equals(active, that.active) &&
                Objects.equals(cursor, that.cursor) &&
                Objects.equals(limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modifiedAfter, active, cursor, limit);
    }

    @Override
    public String toString() {
        return "ListPushesRequest{" +
                "modifiedAfter='" + modifiedAfter + '\'' +
                ", active='" + active + '\'' +
                ", cursor='" + cursor + '\'' +
                ", limit=" + limit +
                '}';
    }
}
