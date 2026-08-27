package o;

import android.webkit.WebView;
import coil3.RealImageLoader$execute$2$job$1;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class obtainSizePxVpY3zN4 {
    public boolean ComponentActivity;
    public final MutableStateFlow IconCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaBrowserCompatMediaItem;
    public final ContextScope MediaDescriptionCompat;
    public final VectorPainter MediaMetadataCompat;
    public final ArrayList MediaSessionCompatQueueItem;
    public final AtomicBoolean MediaSessionCompatResultReceiverWrapper;
    public final StateFlow MediaSessionCompatToken;
    public final Flow ParcelableVolumeInfo;
    public WebView PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public final StateFlow RatingCompat;
    public final setOutlineAmbientShadowColor RemoteActionCompatParcelizer;
    public final BufferedChannel read;
    public final onImageAvailable serializer;
    public final MutableStateFlow write;

    public static final validateSizeN5eqBDc read(obtainSizePxVpY3zN4 obtainsizepxvpy3zn4) {
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) obtainsizepxvpy3zn4.RemoteActionCompatParcelizer).write();
        if (layerSnapshotV21Write == null) {
            return null;
        }
        LayerSnapshot_androidKt layerSnapshot_androidKt = layerSnapshotV21Write.write;
        String strValueOf = String.valueOf(layerSnapshot_androidKt != null ? layerSnapshot_androidKt.globalEntityID : null);
        String strValueOf2 = String.valueOf(layerSnapshotV21Write.ParcelableVolumeInfo);
        String strValueOf3 = String.valueOf(layerSnapshotV21Write.read);
        SurfaceUtils surfaceUtils = layerSnapshotV21Write.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        return new validateSizeN5eqBDc(strValueOf, strValueOf2, strValueOf3, String.valueOf(surfaceUtils != null ? surfaceUtils.id : null));
    }

    public final void IconCompatParcelizer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        ContextScope contextScope = this.MediaDescriptionCompat;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, new VectorPainterKtrememberVectorPainter211(contextScope, this), null, new RealImageLoader$execute$2$job$1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, this, (ShortNewsContentCardView) null, 9), 2);
    }

    public obtainSizePxVpY3zN4(getInvalidateCallbackui getinvalidatecallbackui, setOutlineSpotShadowColor setoutlinespotshadowcolor, setCompositionui setcompositionui, onImageAvailable onimageavailable, VectorPainter vectorPainter, setOutlineAmbientShadowColor setoutlineambientshadowcolor) {
        this.serializer = onimageavailable;
        this.MediaMetadataCompat = vectorPainter;
        this.RemoteActionCompatParcelizer = setoutlineambientshadowcolor;
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = YieldKt.RemoteActionCompatParcelizer(androidx.room.Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read).plus(new VectorPainterKtrememberVectorPainter211invokeinlinedonDispose1(this)));
        BufferedChannel bufferedChannelIconCompatParcelizer = androidx.sqlite.SQLite.IconCompatParcelizer(Integer.MAX_VALUE, 6, (IInAppMessageViewWrapper) null);
        this.read = bufferedChannelIconCompatParcelizer;
        this.ParcelableVolumeInfo = FlowKt.write(bufferedChannelIconCompatParcelizer);
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.TRUE);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatToken = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(rememberVectorPaintermlNsNFs.RemoteActionCompatParcelizer);
        this.write = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        this.MediaSessionCompatResultReceiverWrapper = new AtomicBoolean(false);
        this.MediaSessionCompatQueueItem = new ArrayList();
    }

    public final void serializer() {
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaBrowserCompatMediaItem;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.MediaBrowserCompatMediaItem = null;
        this.write.IconCompatParcelizer(rememberVectorPaintermlNsNFs.RemoteActionCompatParcelizer);
        this.MediaSessionCompatResultReceiverWrapper.set(false);
        this.IconCompatParcelizer.IconCompatParcelizer(Boolean.TRUE);
        this.MediaSessionCompatQueueItem.clear();
        while (!(this.read.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() instanceof resolveUnregisterDisplayedMessagelambda0)) {
        }
    }
}
