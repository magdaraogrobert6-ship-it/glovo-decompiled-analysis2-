package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE serializer;

    public final int hashCode() {
        return (this.serializer.hashCode() ^ 16777619) * (-2128831035);
    }

    public r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o(setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release) {
        this.serializer = (r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write;
    }

    public final String toString() {
        return "TransportChangeEvent{transport_state=" + this.serializer + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o)) {
            return false;
        }
        Object obj2 = ((r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o) obj).serializer;
        r8lambdaXwjHgoHSivQ1p7NGKxWRhunWE r8lambdaxwjhgohsivq1p7ngkxwrhunwe = this.serializer;
        return r8lambdaxwjhgohsivq1p7ngkxwrhunwe == obj2 || r8lambdaxwjhgohsivq1p7ngkxwrhunwe.equals(obj2);
    }
}
