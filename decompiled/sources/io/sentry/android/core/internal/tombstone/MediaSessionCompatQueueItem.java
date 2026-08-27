package io.sentry.android.core.internal.tombstone;

import o.decodeByte;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaSessionCompatQueueItem implements decodeByte {
    public static final MediaSessionCompatQueueItem write = new MediaSessionCompatQueueItem();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return read.forNumber(i) != null;
    }
}
