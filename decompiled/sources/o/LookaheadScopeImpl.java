package o;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadScopeImpl {
    public final long IconCompatParcelizer;
    public final /* synthetic */ LookaheadScopeKt RemoteActionCompatParcelizer;
    public long read;
    public final String serializer;
    public boolean write;

    public final void serializer(long j) {
        SharedPreferences.Editor editorEdit = this.RemoteActionCompatParcelizer.serializer().edit();
        editorEdit.putLong(this.serializer, j);
        editorEdit.apply();
        this.read = j;
    }

    public LookaheadScopeImpl(LookaheadScopeKt lookaheadScopeKt, String str, long j) {
        Objects.requireNonNull(lookaheadScopeKt);
        this.RemoteActionCompatParcelizer = lookaheadScopeKt;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.serializer = str;
        this.IconCompatParcelizer = j;
    }

    public final long RemoteActionCompatParcelizer() {
        if (!this.write) {
            this.write = true;
            this.read = this.RemoteActionCompatParcelizer.serializer().getLong(this.serializer, this.IconCompatParcelizer);
        }
        return this.read;
    }
}
