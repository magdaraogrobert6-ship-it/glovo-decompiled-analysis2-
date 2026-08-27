package io.sentry.android.core.internal.tombstone;

import o.decodeByte;

/* JADX INFO: loaded from: classes5.dex */
public final class r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ implements decodeByte {
    public static final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ IconCompatParcelizer = new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return TombstoneProtos$MemoryError.IconCompatParcelizer.forNumber(i) != null;
    }
}
