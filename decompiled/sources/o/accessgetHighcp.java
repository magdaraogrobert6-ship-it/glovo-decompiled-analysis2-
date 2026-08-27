package o;

import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetHighcp implements ComposedModifierKt {
    public final hashCodeimpl IconCompatParcelizer;
    public final BufferedChannel serializer = androidx.sqlite.SQLite.IconCompatParcelizer(0, 7, (IInAppMessageViewWrapper) null);

    @Override // o.ComposedModifierKt
    public final void read() {
        this.serializer.b_(createFromParcel.INSTANCE);
    }

    public accessgetHighcp(hashCodeimpl hashcodeimpl) {
        this.IconCompatParcelizer = hashcodeimpl;
    }
}
