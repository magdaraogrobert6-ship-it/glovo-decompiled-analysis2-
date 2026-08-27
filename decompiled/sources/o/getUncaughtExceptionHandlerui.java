package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class getUncaughtExceptionHandlerui extends markLayoutPending {
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final int serializer;
    public final boolean write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i = this.serializer;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.IconCompatParcelizer) * 1000003) ^ (this.write ? 1231 : 1237);
    }

    public getUncaughtExceptionHandlerui(String str, boolean z, int i, int i2) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = i;
        this.IconCompatParcelizer = i2;
        this.write = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof markLayoutPending)) {
            return false;
        }
        getUncaughtExceptionHandlerui getuncaughtexceptionhandlerui = (getUncaughtExceptionHandlerui) ((markLayoutPending) obj);
        return this.RemoteActionCompatParcelizer.equals(getuncaughtexceptionhandlerui.RemoteActionCompatParcelizer) && this.serializer == getuncaughtexceptionhandlerui.serializer && this.IconCompatParcelizer == getuncaughtexceptionhandlerui.IconCompatParcelizer && this.write == getuncaughtexceptionhandlerui.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", pid=");
        sb.append(this.serializer);
        sb.append(", importance=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", defaultProcess=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, "}");
    }
}
