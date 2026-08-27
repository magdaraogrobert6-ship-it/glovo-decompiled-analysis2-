package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class getChildDelegatesDirtyui extends onNodePlacedui {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final long write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        int iHashCode4 = this.RemoteActionCompatParcelizer.hashCode();
        long j = this.write;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof onNodePlacedui)) {
            return false;
        }
        getChildDelegatesDirtyui getchilddelegatesdirtyui = (getChildDelegatesDirtyui) ((onNodePlacedui) obj);
        return this.read.equals(getchilddelegatesdirtyui.read) && this.serializer.equals(getchilddelegatesdirtyui.serializer) && this.IconCompatParcelizer.equals(getchilddelegatesdirtyui.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(getchilddelegatesdirtyui.RemoteActionCompatParcelizer) && this.write == getchilddelegatesdirtyui.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.read);
        sb.append(", parameterKey=");
        sb.append(this.serializer);
        sb.append(", parameterValue=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", variantId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", templateVersion=");
        return c8$$ExternalSyntheticOutline0.m(this.write, "}", sb);
    }

    public getChildDelegatesDirtyui(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null rolloutId");
            throw null;
        }
        this.read = str;
        if (str2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null parameterKey");
            throw null;
        }
        this.serializer = str2;
        this.IconCompatParcelizer = str3;
        if (str4 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null variantId");
            throw null;
        }
        this.RemoteActionCompatParcelizer = str4;
        this.write = j;
    }
}
