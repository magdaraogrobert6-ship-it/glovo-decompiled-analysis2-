package com.mapbox.navigation.base.trip.model.roadobject;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class RoadObjectMatcherError {
    public final String error;
    public final String roadObjectId;

    public final int hashCode() {
        return this.error.hashCode() + (this.roadObjectId.hashCode() * 31);
    }

    public RoadObjectMatcherError(String str, String str2) {
        this.roadObjectId = str;
        this.error = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoadObjectMatcherError(roadObjectId='");
        sb.append(this.roadObjectId);
        sb.append("', error='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.error, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoadObjectMatcherError.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoadObjectMatcherError roadObjectMatcherError = (RoadObjectMatcherError) obj;
        return this.roadObjectId.equals(roadObjectMatcherError.roadObjectId) && this.error.equals(roadObjectMatcherError.error);
    }
}
