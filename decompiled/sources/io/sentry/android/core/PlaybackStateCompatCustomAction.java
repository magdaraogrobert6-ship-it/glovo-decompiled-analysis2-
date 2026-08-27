package io.sentry.android.core;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompatCustomAction {
    public final File IconCompatParcelizer;
    public final Map RemoteActionCompatParcelizer;
    public final long read;
    public final long serializer;
    public final boolean write;

    public PlaybackStateCompatCustomAction(long j, long j2, boolean z, File file, HashMap map) {
        this.serializer = j;
        this.IconCompatParcelizer = file;
        this.read = j2;
        this.RemoteActionCompatParcelizer = map;
        this.write = z;
    }
}
