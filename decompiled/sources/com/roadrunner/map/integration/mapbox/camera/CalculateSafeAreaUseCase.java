package com.roadrunner.map.integration.mapbox.camera;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import o.accessisMainThread;
import o.ib;
import o.isStateSaved;

/* JADX INFO: loaded from: classes3.dex */
public final class CalculateSafeAreaUseCase {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final ib IconCompatParcelizer;
    public final SafeAreaPublisherImpl MediaMetadataCompat;
    public final isStateSaved RemoteActionCompatParcelizer;
    public static final int write = (int) Dp.m3673constructorimpl(100.0f);
    public static final int read = (int) Dp.m3673constructorimpl(280.0f);
    public static final int serializer = (int) Dp.m3673constructorimpl(150.0f);

    static {
        int i = MediaDescriptionCompat + 41;
        MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CalculateSafeAreaUseCase(SafeAreaPublisherImpl safeAreaPublisherImpl, ib ibVar, isStateSaved isstatesaved, accessisMainThread accessismainthread) {
        this.MediaMetadataCompat = safeAreaPublisherImpl;
        this.IconCompatParcelizer = ibVar;
        this.RemoteActionCompatParcelizer = isstatesaved;
    }
}
