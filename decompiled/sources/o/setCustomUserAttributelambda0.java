package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomUserAttributelambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Integer RemoteActionCompatParcelizer;

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035);
    }

    public setCustomUserAttributelambda0(setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release) {
        this.RemoteActionCompatParcelizer = (Integer) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write;
    }

    public final String toString() {
        return IconCompatParcelizer.write(this.RemoteActionCompatParcelizer, "}", new StringBuilder("SDKReset{number_of_payloads_not_uploaded="));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof setCustomUserAttributelambda0)) {
            return false;
        }
        Object obj2 = ((setCustomUserAttributelambda0) obj).RemoteActionCompatParcelizer;
        Integer num = this.RemoteActionCompatParcelizer;
        return num == obj2 || num.equals(obj2);
    }
}
