package com.mapbox.navigation.core;

import bo.app.af$$ExternalSyntheticOutline0;
import o.getCutText;

/* JADX INFO: loaded from: classes2.dex */
public final class SetRoutes$Alternatives extends getCutText {
    public final int legIndex;

    public final int hashCode() {
        return Integer.hashCode(this.legIndex);
    }

    public SetRoutes$Alternatives(int i) {
        this.legIndex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetRoutes$Alternatives) && this.legIndex == ((SetRoutes$Alternatives) obj).legIndex;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("Alternatives(legIndex="), this.legIndex, ')');
    }
}
