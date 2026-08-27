package androidx.camera.core.impl;

import o.PreviewExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class DeferrableSurface$SurfaceClosedException extends Exception {
    public final PreviewExternalSyntheticLambda0 write;

    public DeferrableSurface$SurfaceClosedException(String str, PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0) {
        super(str);
        this.write = previewExternalSyntheticLambda0;
    }
}
