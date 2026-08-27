package com.mapbox.maps;

/* JADX INFO: loaded from: classes4.dex */
public final class SnapshotterDestroyedException extends IllegalStateException {
    public SnapshotterDestroyedException() {
        super("This snapshotter was already destroyed.");
    }
}
