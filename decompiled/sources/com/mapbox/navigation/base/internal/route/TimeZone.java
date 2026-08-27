package com.mapbox.navigation.base.internal.route;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeZone {
    public final String abbreviation;
    public final String identifier;
    public final String offset;

    public final int hashCode() {
        return this.abbreviation.hashCode() + af$$ExternalSyntheticOutline0.m(this.offset.hashCode() * 31, 31, this.identifier);
    }

    public TimeZone(String str, String str2, String str3) {
        this.offset = str;
        this.identifier = str2;
        this.abbreviation = str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeZone(offset='");
        sb.append(this.offset);
        sb.append("', identifier='");
        sb.append(this.identifier);
        sb.append("', abbreviation='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.abbreviation, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TimeZone.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        TimeZone timeZone = (TimeZone) obj;
        return this.offset.equals(timeZone.offset) && this.identifier.equals(timeZone.identifier) && this.abbreviation.equals(timeZone.abbreviation);
    }
}
