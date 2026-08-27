package o;

import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: loaded from: classes.dex */
public final class materializeImpl implements ComposedModifierKt {
    public final BufferedChannel RemoteActionCompatParcelizer = androidx.sqlite.SQLite.IconCompatParcelizer(0, 7, (IInAppMessageViewWrapper) null);

    @Override // o.ComposedModifierKt
    public final void read() {
        this.RemoteActionCompatParcelizer.b_(createFromParcel.INSTANCE);
    }
}
