package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class createUriActionFromUri implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Boolean read;

    public final int hashCode() {
        return (this.read.hashCode() ^ 16777619) * (-2128831035);
    }

    public createUriActionFromUri(applyPendingRuntimeConfiguration applypendingruntimeconfiguration) {
        this.read = applypendingruntimeconfiguration.read;
    }

    public final String toString() {
        return c8$$ExternalSyntheticOutline0.m(new StringBuilder("StepCountTrackingConfiguration{enabled="), "}", this.read);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof createUriActionFromUri)) {
            return false;
        }
        Object obj2 = ((createUriActionFromUri) obj).read;
        Boolean bool = this.read;
        return bool == obj2 || bool.equals(obj2);
    }
}
