package com.mapbox.navigation.core;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesSetSuccess {
    public final LinkedHashMap ignoredAlternatives;

    public final int hashCode() {
        return this.ignoredAlternatives.hashCode();
    }

    public RoutesSetSuccess(LinkedHashMap linkedHashMap) {
        this.ignoredAlternatives = linkedHashMap;
    }

    public final String toString() {
        return "RoutesSetSuccess(ignoredAlternatives=" + this.ignoredAlternatives + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoutesSetSuccess.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.ignoredAlternatives.equals(((RoutesSetSuccess) obj).ignoredAlternatives);
    }
}
