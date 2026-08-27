package io.sentry.android.replay;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompat {
    public volatile r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus serializer;

    public final boolean write(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus r8lambda7awclmlnptireoc8eoyg0revmus) {
        r8lambda7awclmlnptireoc8eoyg0revmus.getClass();
        switch (ParcelableVolumeInfo.serializer[this.serializer.ordinal()]) {
            case 1:
                return r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STARTED || r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.CLOSED;
            case 2:
                return r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.PAUSED || r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STOPPED || r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.CLOSED;
            case 3:
                return r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.PAUSED || r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STOPPED || r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.CLOSED;
            case 4:
                return r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RESUMED || r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STOPPED || r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.CLOSED;
            case 5:
                return r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STARTED || r8lambda7awclmlnptireoc8eoyg0revmus == r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.CLOSED;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            case 6:
                return false;
        }
    }
}
