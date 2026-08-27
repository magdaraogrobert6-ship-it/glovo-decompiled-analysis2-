package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setPhoneNumberlambda20 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Boolean RemoteActionCompatParcelizer;

    public setPhoneNumberlambda20(applyPendingRuntimeConfiguration applypendingruntimeconfiguration) {
        this.RemoteActionCompatParcelizer = applypendingruntimeconfiguration.read;
    }

    public final String toString() {
        return c8$$ExternalSyntheticOutline0.m(new StringBuilder("InitGateConfig{is_enabled="), "}", this.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        Boolean bool = this.RemoteActionCompatParcelizer;
        return ((bool == null ? 0 : bool.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof setPhoneNumberlambda20)) {
            return false;
        }
        Object obj2 = ((setPhoneNumberlambda20) obj).RemoteActionCompatParcelizer;
        Boolean bool = this.RemoteActionCompatParcelizer;
        return bool == obj2 || (bool != null && bool.equals(obj2));
    }
}
