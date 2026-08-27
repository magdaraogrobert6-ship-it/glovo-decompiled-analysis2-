package com.mapbox.navigation.core;

import bo.app.af$$ExternalSyntheticOutline0;
import o.getCutText;

/* JADX INFO: loaded from: classes2.dex */
public final class SetRoutes$NewRoutes extends getCutText {
    public final int legIndex;

    public final int hashCode() {
        return Integer.hashCode(this.legIndex);
    }

    public SetRoutes$NewRoutes(int i) {
        this.legIndex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetRoutes$NewRoutes) && this.legIndex == ((SetRoutes$NewRoutes) obj).legIndex;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("NewRoutes(legIndex="), this.legIndex, ')');
    }
}
