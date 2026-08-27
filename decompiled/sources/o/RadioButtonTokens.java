package o;

import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl;
import coil3.disk.DiskLruCache$Editor;

/* JADX INFO: loaded from: classes.dex */
public final class RadioButtonTokens {
    public DiskLruCache$Editor IconCompatParcelizer;
    public int read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final androidx.navigation.NavArgsLazy RemoteActionCompatParcelizer = new androidx.navigation.NavArgsLazy(16);
    public int RatingCompat = -1;
    public int write = -1;

    public final LinearProgressIndicatorTokens write(int i, long j, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        DiskLruCache$Editor diskLruCache$Editor = this.IconCompatParcelizer;
        if (diskLruCache$Editor == null) {
            return minimizedLabelHalfHeight.IconCompatParcelizer;
        }
        withFrameNanos withframenanos = (withFrameNanos) diskLruCache$Editor.serializer;
        boolean z2 = withframenanos instanceof androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
        PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl = new PrefetchHandleProvider$HandleAndRequestImpl(diskLruCache$Editor, i, this.RemoteActionCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        prefetchHandleProvider$HandleAndRequestImpl.ResultReceiver = androidx.compose.ui.unit.Constraints.m3613boximpl(j);
        if (!z2) {
            withframenanos.write(prefetchHandleProvider$HandleAndRequestImpl);
        } else if (z) {
            androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler androidPrefetchScheduler = (androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler) withframenanos;
            androidPrefetchScheduler.IconCompatParcelizer.add(new BroadcastFrameClock(1, prefetchHandleProvider$HandleAndRequestImpl));
            if (!androidPrefetchScheduler.RatingCompat) {
                androidPrefetchScheduler.RatingCompat = true;
                androidPrefetchScheduler.MediaMetadataCompat.post(androidPrefetchScheduler);
            }
        } else {
            androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler androidPrefetchScheduler2 = (androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler) withframenanos;
            androidPrefetchScheduler2.IconCompatParcelizer.add(new BroadcastFrameClock(0, prefetchHandleProvider$HandleAndRequestImpl));
            if (!androidPrefetchScheduler2.RatingCompat) {
                androidPrefetchScheduler2.RatingCompat = true;
                androidPrefetchScheduler2.MediaMetadataCompat.post(androidPrefetchScheduler2);
            }
        }
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("compose:lazy:schedule_prefetch:index", i);
        return prefetchHandleProvider$HandleAndRequestImpl;
    }

    public RadioButtonTokens(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
