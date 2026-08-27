package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setLocationCustomAttributelambda3 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Short RemoteActionCompatParcelizer;

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035);
    }

    public setLocationCustomAttributelambda3(setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release) {
        this.RemoteActionCompatParcelizer = (Short) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write;
    }

    public final String toString() {
        return "HardEventDetectionPeakCheckConfiguration{peak_threshold=" + this.RemoteActionCompatParcelizer + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof setLocationCustomAttributelambda3)) {
            return false;
        }
        Object obj2 = ((setLocationCustomAttributelambda3) obj).RemoteActionCompatParcelizer;
        Short sh = this.RemoteActionCompatParcelizer;
        return sh == obj2 || sh.equals(obj2);
    }
}
