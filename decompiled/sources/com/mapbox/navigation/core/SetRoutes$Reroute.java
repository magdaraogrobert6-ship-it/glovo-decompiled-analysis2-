package com.mapbox.navigation.core;

import bo.app.af$$ExternalSyntheticOutline0;
import o.getCutText;

/* JADX INFO: loaded from: classes2.dex */
public final class SetRoutes$Reroute extends getCutText {
    public final int legIndex;

    public final int hashCode() {
        return Integer.hashCode(this.legIndex);
    }

    public SetRoutes$Reroute(int i) {
        this.legIndex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetRoutes$Reroute) && this.legIndex == ((SetRoutes$Reroute) obj).legIndex;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("Reroute(legIndex="), this.legIndex, ')');
    }
}
