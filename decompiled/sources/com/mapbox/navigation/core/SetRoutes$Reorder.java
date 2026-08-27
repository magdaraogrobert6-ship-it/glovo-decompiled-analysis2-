package com.mapbox.navigation.core;

import bo.app.af$$ExternalSyntheticOutline0;
import o.getCutText;

/* JADX INFO: loaded from: classes2.dex */
public final class SetRoutes$Reorder extends getCutText {
    public final int legIndex;

    public final int hashCode() {
        return Integer.hashCode(this.legIndex);
    }

    public SetRoutes$Reorder(int i) {
        this.legIndex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetRoutes$Reorder) && this.legIndex == ((SetRoutes$Reorder) obj).legIndex;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("Reorder(legIndex="), this.legIndex, ')');
    }
}
