package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getConfigurationProvider implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Boolean RemoteActionCompatParcelizer;

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035);
    }

    public getConfigurationProvider(applyPendingRuntimeConfiguration applypendingruntimeconfiguration) {
        this.RemoteActionCompatParcelizer = applypendingruntimeconfiguration.read;
    }

    public final String toString() {
        return c8$$ExternalSyntheticOutline0.m(new StringBuilder("AppBackgroundRefreshStatusChangeEvent{is_background_refresh_enabled="), "}", this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof getConfigurationProvider)) {
            return false;
        }
        Object obj2 = ((getConfigurationProvider) obj).RemoteActionCompatParcelizer;
        Boolean bool = this.RemoteActionCompatParcelizer;
        return bool == obj2 || bool.equals(obj2);
    }
}
