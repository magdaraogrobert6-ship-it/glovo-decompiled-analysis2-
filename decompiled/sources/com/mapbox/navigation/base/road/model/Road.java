package com.mapbox.navigation.base.road.model;

import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class Road {
    public final ArrayList components;

    public final int hashCode() {
        return this.components.hashCode();
    }

    public Road(ArrayList arrayList) {
        this.components = arrayList;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline1.m(new StringBuilder("Road(components="), this.components, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Road.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.components.equals(((Road) obj).components);
    }
}
