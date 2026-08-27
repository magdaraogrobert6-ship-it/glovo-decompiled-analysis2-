package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class setUncaughtExceptionHandlerui extends getChildrenOfVirtualChildren {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public final int hashCode() {
        return ((this.IconCompatParcelizer.hashCode() ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode();
    }

    public setUncaughtExceptionHandlerui(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getChildrenOfVirtualChildren)) {
            return false;
        }
        setUncaughtExceptionHandlerui setuncaughtexceptionhandlerui = (setUncaughtExceptionHandlerui) ((getChildrenOfVirtualChildren) obj);
        return this.IconCompatParcelizer.equals(setuncaughtexceptionhandlerui.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(setuncaughtexceptionhandlerui.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", variantId=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, "}");
    }
}
