package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class unsetCustomUserAttributelambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Boolean RemoteActionCompatParcelizer;

    public unsetCustomUserAttributelambda0(applyPendingRuntimeConfiguration applypendingruntimeconfiguration) {
        this.RemoteActionCompatParcelizer = applypendingruntimeconfiguration.read;
    }

    public final String toString() {
        return c8$$ExternalSyntheticOutline0.m(new StringBuilder("SmartGeofencesConfiguration{include_sensitive_data_in_uploads="), "}", this.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        Boolean bool = this.RemoteActionCompatParcelizer;
        return ((bool == null ? 0 : bool.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof unsetCustomUserAttributelambda0)) {
            return false;
        }
        Object obj2 = ((unsetCustomUserAttributelambda0) obj).RemoteActionCompatParcelizer;
        Boolean bool = this.RemoteActionCompatParcelizer;
        return bool == obj2 || (bool != null && bool.equals(obj2));
    }
}
