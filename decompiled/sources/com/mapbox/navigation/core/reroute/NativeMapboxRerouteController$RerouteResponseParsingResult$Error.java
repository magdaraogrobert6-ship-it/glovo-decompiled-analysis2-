package com.mapbox.navigation.core.reroute;

import o.getOnAutofillText;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeMapboxRerouteController$RerouteResponseParsingResult$Error extends getOnAutofillText {
    public final Throwable throwable;

    public final int hashCode() {
        return this.throwable.hashCode();
    }

    public NativeMapboxRerouteController$RerouteResponseParsingResult$Error(Throwable th) {
        this.throwable = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NativeMapboxRerouteController$RerouteResponseParsingResult$Error) && this.throwable.equals(((NativeMapboxRerouteController$RerouteResponseParsingResult$Error) obj).throwable);
    }

    public final String toString() {
        return "Error(throwable=" + this.throwable + ')';
    }
}
