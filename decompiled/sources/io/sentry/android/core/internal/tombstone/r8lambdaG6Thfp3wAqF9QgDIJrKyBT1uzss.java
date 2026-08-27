package io.sentry.android.core.internal.tombstone;

import o.decodeByte;

/* JADX INFO: loaded from: classes5.dex */
public final class r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss implements decodeByte {
    public static final r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss read = new r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return TombstoneProtos$MemoryError.write.forNumber(i) != null;
    }
}
