package o;

/* JADX INFO: loaded from: classes2.dex */
public final class obtainInnerShadowRenderereZhPAX0 {
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;

    public final boolean write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.read) + (Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31);
    }

    public obtainInnerShadowRenderereZhPAX0(boolean z, boolean z2) {
        this.RemoteActionCompatParcelizer = z;
        this.read = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obtainInnerShadowRenderereZhPAX0)) {
            return false;
        }
        obtainInnerShadowRenderereZhPAX0 obtaininnershadowrendererezhpax0 = (obtainInnerShadowRenderereZhPAX0) obj;
        return this.RemoteActionCompatParcelizer == obtaininnershadowrendererezhpax0.RemoteActionCompatParcelizer && this.read == obtaininnershadowrendererezhpax0.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeatureFlags(isTrackingEnabled=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isCameraOnlyImageSharing=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.read, ')');
    }

    public /* synthetic */ obtainInnerShadowRenderereZhPAX0() {
        this(false, false);
    }
}
