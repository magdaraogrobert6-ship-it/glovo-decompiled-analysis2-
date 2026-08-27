package o;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class setScopeCoordinates {
    public final String IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public boolean read;
    public boolean serializer;
    public final /* synthetic */ LookaheadScopeKt write;

    public final void serializer(boolean z) {
        SharedPreferences.Editor editorEdit = this.write.serializer().edit();
        editorEdit.putBoolean(this.IconCompatParcelizer, z);
        editorEdit.apply();
        this.serializer = z;
    }

    public setScopeCoordinates(LookaheadScopeKt lookaheadScopeKt, String str, boolean z) {
        this.write = lookaheadScopeKt;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = z;
    }

    public final boolean read() {
        if (!this.read) {
            this.read = true;
            this.serializer = this.write.serializer().getBoolean(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
        }
        return this.serializer;
    }
}
