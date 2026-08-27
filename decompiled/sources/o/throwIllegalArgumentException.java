package o;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.cardview.widget.CardView$1;
import coil3.ImageLoader$Builder;
import com.google.android.gms.tasks.zzc;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes.dex */
public final class throwIllegalArgumentException implements ImageBitmapCompanion, findFirstOverlap, rememberGraphicsLayer {
    public final graphicsLayerpANQ8Wgdefault IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final getDefaultShadowColor MediaMetadataCompat;
    public Boolean MediaSessionCompatQueueItem;
    public final accessgetStrokecp MediaSessionCompatToken;
    public final ImageLoader$Builder ParcelableVolumeInfo;
    public final CardView$1 PlaybackStateCompat;
    public final r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 RemoteActionCompatParcelizer;
    public final Interpolatable read;
    public final Context write;
    public final HashMap serializer = new HashMap();
    public final Object MediaDescriptionCompat = new Object();
    public final CardView$1 MediaSessionCompatResultReceiverWrapper = new CardView$1(new accessgetCompositingStrategyNrFUSIjd(2));
    public final HashMap RatingCompat = new HashMap();

    @Override // o.ImageBitmapCompanion
    public final boolean write() {
        return false;
    }

    static {
        setRotationX.IconCompatParcelizer("GreedyScheduler");
    }

    @Override // o.rememberGraphicsLayer
    public final void write(mapMKHz9U mapmkhz9u, boolean z) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0;
        accessgetRgb565cp accessgetrgb565cpWrite = this.MediaSessionCompatResultReceiverWrapper.write(mapmkhz9u);
        if (accessgetrgb565cpWrite != null) {
            this.ParcelableVolumeInfo.serializer(accessgetrgb565cpWrite);
        }
        synchronized (this.MediaDescriptionCompat) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.serializer.remove(mapmkhz9u);
        }
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setRotationX setrotationx = setRotationX.read();
            Objects.toString(mapmkhz9u);
            setrotationx.getClass();
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        if (z) {
            return;
        }
        synchronized (this.MediaDescriptionCompat) {
            this.RatingCompat.remove(mapmkhz9u);
        }
    }

    @Override // o.ImageBitmapCompanion
    public final void RemoteActionCompatParcelizer(String str) {
        List<accessgetRgb565cp> list;
        Runnable runnable;
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = Boolean.valueOf(drawOutlinehn5TExgdefault.RemoteActionCompatParcelizer(this.write, this.IconCompatParcelizer));
        }
        if (!this.MediaSessionCompatQueueItem.booleanValue()) {
            setRotationX.read().getClass();
            return;
        }
        if (!this.MediaBrowserCompatMediaItem) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(this);
            this.MediaBrowserCompatMediaItem = true;
        }
        setRotationX.read().getClass();
        Interpolatable interpolatable = this.read;
        if (interpolatable != null && (runnable = (Runnable) interpolatable.read.remove(str)) != null) {
            ((Handler) interpolatable.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).removeCallbacks(runnable);
        }
        CardView$1 cardView$1 = this.MediaSessionCompatResultReceiverWrapper;
        cardView$1.getClass();
        str.getClass();
        synchronized (cardView$1.IconCompatParcelizer) {
            list = ((accessgetCompositingStrategyNrFUSIjd) cardView$1.RemoteActionCompatParcelizer).read(str);
        }
        for (accessgetRgb565cp accessgetrgb565cp : list) {
            this.ParcelableVolumeInfo.serializer(accessgetrgb565cp);
            CardView$1 cardView$2 = this.PlaybackStateCompat;
            cardView$2.getClass();
            cardView$2.write(accessgetrgb565cp, -512);
        }
    }

    @Override // o.findFirstOverlap
    public final void serializer(setFrom58bKbWc setfrom58bkbwc, forEachui_graphicsdefault foreachui_graphicsdefault) {
        int iWrite = MaybeObserveOn.write();
        int iWrite2 = MaybeObserveOn.write();
        int iWrite3 = MaybeObserveOn.write();
        mapMKHz9U mapmkhz9u = (mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, iWrite2, 1836924255, iWrite, new Object[]{setfrom58bkbwc}, iWrite3);
        boolean z = foreachui_graphicsdefault instanceof rotateRight;
        CardView$1 cardView$1 = this.PlaybackStateCompat;
        ImageLoader$Builder imageLoader$Builder = this.ParcelableVolumeInfo;
        CardView$1 cardView$2 = this.MediaSessionCompatResultReceiverWrapper;
        if (z) {
            if (cardView$2.RemoteActionCompatParcelizer(mapmkhz9u)) {
                return;
            }
            setRotationX setrotationx = setRotationX.read();
            mapmkhz9u.toString();
            setrotationx.getClass();
            accessgetRgb565cp accessgetrgb565cpIconCompatParcelizer = cardView$2.IconCompatParcelizer(mapmkhz9u);
            imageLoader$Builder.write(accessgetrgb565cpIconCompatParcelizer);
            cardView$1.getClass();
            cardView$1.RemoteActionCompatParcelizer(accessgetrgb565cpIconCompatParcelizer, (getClipannotations) null);
            return;
        }
        setRotationX setrotationx2 = setRotationX.read();
        mapmkhz9u.toString();
        setrotationx2.getClass();
        accessgetRgb565cp accessgetrgb565cpWrite = cardView$2.write(mapmkhz9u);
        if (accessgetrgb565cpWrite != null) {
            imageLoader$Builder.serializer(accessgetrgb565cpWrite);
            int iIconCompatParcelizer = ((rebalance) foreachui_graphicsdefault).IconCompatParcelizer();
            cardView$1.getClass();
            cardView$1.write(accessgetrgb565cpWrite, iIconCompatParcelizer);
        }
    }

    @Override // o.ImageBitmapCompanion
    public final void serializer(setFrom58bKbWc... setfrom58bkbwcArr) {
        long j;
        long jMax;
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = Boolean.valueOf(drawOutlinehn5TExgdefault.RemoteActionCompatParcelizer(this.write, this.IconCompatParcelizer));
        }
        if (!this.MediaSessionCompatQueueItem.booleanValue()) {
            setRotationX.read().getClass();
            return;
        }
        if (!this.MediaBrowserCompatMediaItem) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(this);
            this.MediaBrowserCompatMediaItem = true;
        }
        HashSet<setFrom58bKbWc> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (setFrom58bKbWc setfrom58bkbwc : setfrom58bkbwcArr) {
            if (!this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer((mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, MaybeObserveOn.write(), 1836924255, MaybeObserveOn.write(), new Object[]{setfrom58bkbwc}, MaybeObserveOn.write()))) {
                synchronized (this.MediaDescriptionCompat) {
                    mapMKHz9U mapmkhz9u = (mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, MaybeObserveOn.write(), 1836924255, MaybeObserveOn.write(), new Object[]{setfrom58bkbwc}, MaybeObserveOn.write());
                    findOverlapsdefault findoverlapsdefault = (findOverlapsdefault) this.RatingCompat.get(mapmkhz9u);
                    if (findoverlapsdefault == null) {
                        int i = setfrom58bkbwc.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                        this.IconCompatParcelizer.IconCompatParcelizer.getClass();
                        findoverlapsdefault = new findOverlapsdefault(i, System.currentTimeMillis());
                        this.RatingCompat.put(mapmkhz9u, findoverlapsdefault);
                    }
                    j = findoverlapsdefault.write;
                    jMax = Math.max((setfrom58bkbwc.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg - findoverlapsdefault.IconCompatParcelizer) - 5, 0);
                }
                long jMax2 = Math.max(setfrom58bkbwc.serializer(), (jMax * 30000) + j);
                this.IconCompatParcelizer.IconCompatParcelizer.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (setfrom58bkbwc.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == setTranslationX.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax2) {
                        Interpolatable interpolatable = this.read;
                        if (interpolatable != null) {
                            coil3.memory.MemoryCacheService memoryCacheService = interpolatable.RemoteActionCompatParcelizer;
                            HashMap map = interpolatable.read;
                            Runnable runnable = (Runnable) map.remove(setfrom58bkbwc.RatingCompat);
                            if (runnable != null) {
                                ((Handler) memoryCacheService.RemoteActionCompatParcelizer).removeCallbacks(runnable);
                            }
                            zzc zzcVar = new zzc(interpolatable, setfrom58bkbwc, false, 2);
                            map.put(setfrom58bkbwc.RatingCompat, zzcVar);
                            ((getClipannotations) interpolatable.serializer).getClass();
                            ((Handler) memoryCacheService.RemoteActionCompatParcelizer).postDelayed(zzcVar, jMax2 - System.currentTimeMillis());
                        }
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{toolingGraphicsLayer.IconCompatParcelizer, setfrom58bkbwc.read}, getCieXyz.write())).booleanValue()) {
                            if (!this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer((mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, MaybeObserveOn.write(), 1836924255, MaybeObserveOn.write(), new Object[]{setfrom58bkbwc}, MaybeObserveOn.write()))) {
                                setRotationX.read().getClass();
                                CardView$1 cardView$1 = this.MediaSessionCompatResultReceiverWrapper;
                                cardView$1.getClass();
                                accessgetRgb565cp accessgetrgb565cpIconCompatParcelizer = cardView$1.IconCompatParcelizer((mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, MaybeObserveOn.write(), 1836924255, MaybeObserveOn.write(), new Object[]{setfrom58bkbwc}, MaybeObserveOn.write()));
                                this.ParcelableVolumeInfo.write(accessgetrgb565cpIconCompatParcelizer);
                                CardView$1 cardView$2 = this.PlaybackStateCompat;
                                cardView$2.getClass();
                                cardView$2.RemoteActionCompatParcelizer(accessgetrgb565cpIconCompatParcelizer, (getClipannotations) null);
                            }
                        } else {
                            toolingGraphicsLayer toolinggraphicslayer = setfrom58bkbwc.read;
                            if (toolinggraphicslayer.MediaSessionCompatQueueItem) {
                                setRotationX setrotationx = setRotationX.read();
                                setfrom58bkbwc.toString();
                                setrotationx.getClass();
                            } else if (toolinggraphicslayer.write.isEmpty()) {
                                hashSet.add(setfrom58bkbwc);
                                hashSet2.add(setfrom58bkbwc.RatingCompat);
                            } else {
                                setRotationX setrotationx2 = setRotationX.read();
                                setfrom58bkbwc.toString();
                                setrotationx2.getClass();
                            }
                        }
                    }
                }
            }
        }
        synchronized (this.MediaDescriptionCompat) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(",", hashSet2);
                setRotationX.read().getClass();
                for (setFrom58bKbWc setfrom58bkbwc2 : hashSet) {
                    mapMKHz9U mapmkhz9u2 = (mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, MaybeObserveOn.write(), 1836924255, MaybeObserveOn.write(), new Object[]{setfrom58bkbwc2}, MaybeObserveOn.write());
                    if (!this.serializer.containsKey(mapmkhz9u2)) {
                        this.serializer.put(mapmkhz9u2, forEachui_graphics.serializer(this.RemoteActionCompatParcelizer, setfrom58bkbwc2, this.MediaSessionCompatToken.serializer, this));
                    }
                }
            }
        }
    }

    public throwIllegalArgumentException(Context context, graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault, getEmptyInterval getemptyinterval, getDefaultShadowColor getdefaultshadowcolor, CardView$1 cardView$1, accessgetStrokecp accessgetstrokecp) {
        this.write = context;
        coil3.memory.MemoryCacheService memoryCacheService = graphicslayerpanq8wgdefault.MediaDescriptionCompat;
        this.read = new Interpolatable(this, memoryCacheService, graphicslayerpanq8wgdefault.IconCompatParcelizer);
        memoryCacheService.getClass();
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder();
        imageLoader$Builder.RemoteActionCompatParcelizer = memoryCacheService;
        imageLoader$Builder.IconCompatParcelizer = cardView$1;
        imageLoader$Builder.read = new Object();
        imageLoader$Builder.serializer = new LinkedHashMap();
        this.ParcelableVolumeInfo = imageLoader$Builder;
        this.MediaSessionCompatToken = accessgetstrokecp;
        this.RemoteActionCompatParcelizer = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(getemptyinterval);
        this.IconCompatParcelizer = graphicslayerpanq8wgdefault;
        this.MediaMetadataCompat = getdefaultshadowcolor;
        this.PlaybackStateCompat = cardView$1;
    }
}
