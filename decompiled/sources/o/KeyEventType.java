package o;

import android.content.Context;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyEventType {
    public final Context IconCompatParcelizer;
    public final DelegatingNode RemoteActionCompatParcelizer;

    public final int hashCode() {
        return ((this.IconCompatParcelizer.hashCode() ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String string = this.IconCompatParcelizer.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.RemoteActionCompatParcelizer);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        c8$$ExternalSyntheticOutline0.m(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }

    public KeyEventType(Context context, DelegatingNode delegatingNode) {
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = delegatingNode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeyEventType)) {
            return false;
        }
        KeyEventType keyEventType = (KeyEventType) obj;
        return this.IconCompatParcelizer.equals(keyEventType.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(keyEventType.RemoteActionCompatParcelizer);
    }
}
