package o;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeActivityLifecycleCallbackListener implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Long RemoteActionCompatParcelizer;

    public BrazeActivityLifecycleCallbackListener(BrazeCompanionExternalSyntheticLambda8 brazeCompanionExternalSyntheticLambda8) {
        this.RemoteActionCompatParcelizer = brazeCompanionExternalSyntheticLambda8.IconCompatParcelizer;
    }

    public final String toString() {
        return "TransportStateOffTheGrid{preceding_moving_start_time=" + this.RemoteActionCompatParcelizer + "}";
    }

    public final int hashCode() {
        Long l = this.RemoteActionCompatParcelizer;
        return ((l == null ? 0 : l.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BrazeActivityLifecycleCallbackListener)) {
            return false;
        }
        Object obj2 = ((BrazeActivityLifecycleCallbackListener) obj).RemoteActionCompatParcelizer;
        Long l = this.RemoteActionCompatParcelizer;
        return l == obj2 || (l != null && l.equals(obj2));
    }
}
