package com.mapbox.navigation.base.internal.utils;

import o.IconCompatParcelizer;
import o.getCieXyz;
import o.getDismiss;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class AlternativesParsingResult$Parsed extends getDismiss {
    public final Object value;

    public AlternativesParsingResult$Parsed(Object obj) {
        this.value = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlternativesParsingResult$Parsed)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((AlternativesParsingResult$Parsed) obj).value}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return IconCompatParcelizer.RemoteActionCompatParcelizer(new StringBuilder("Parsed(value="), this.value, ')');
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
