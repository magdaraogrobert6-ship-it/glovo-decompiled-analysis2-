package com.mapbox.navigation.base.trip.model.roadobject.merge;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class MergingAreaInfo {
    public final String type;

    public final int hashCode() {
        return this.type.hashCode();
    }

    public MergingAreaInfo(String str) {
        this.type = str;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("MergingAreaInfo(type='"), this.type, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MergingAreaInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.type.equals(((MergingAreaInfo) obj).type);
    }
}
