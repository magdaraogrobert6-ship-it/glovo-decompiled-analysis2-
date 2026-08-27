package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setFirstNamelambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Double RemoteActionCompatParcelizer;

    public setFirstNamelambda0(setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release) {
        this.RemoteActionCompatParcelizer = (Double) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write;
    }

    public final String toString() {
        return "FeatureElement{magnitude=" + this.RemoteActionCompatParcelizer + "}";
    }

    public final int hashCode() {
        Double d = this.RemoteActionCompatParcelizer;
        return ((d == null ? 0 : d.hashCode()) ^ 16777619) * (-2128831035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof setFirstNamelambda0)) {
            return false;
        }
        Object obj2 = ((setFirstNamelambda0) obj).RemoteActionCompatParcelizer;
        Double d = this.RemoteActionCompatParcelizer;
        return d == obj2 || (d != null && d.equals(obj2));
    }
}
