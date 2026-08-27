package o;

import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.internal.gtm.zzkh;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.huawei.hmf.tasks.a.i$d;
import com.sentiance.core.model.events.I$b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.IntConsumer;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class brazelogdefault implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ brazelogdefault(Object obj, int i, int i2) {
        this.serializer = i2;
        this.IconCompatParcelizer = obj;
        this.read = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.serializer) {
            case 0:
                checkForSystemLogLevelProperty checkforsystemloglevelproperty = (checkForSystemLogLevelProperty) this.IconCompatParcelizer;
                int i = this.read;
                StringsKt__StringsKt$$ExternalSyntheticLambda1 stringsKt__StringsKt$$ExternalSyntheticLambda1 = checkforsystemloglevelproperty.write;
                if (stringsKt__StringsKt$$ExternalSyntheticLambda1 != null) {
                    stringsKt__StringsKt$$ExternalSyntheticLambda1.invoke(Integer.valueOf(i), Boolean.valueOf(i == checkforsystemloglevelproperty.MediaSessionCompatQueueItem));
                    return;
                }
                return;
            case 1:
                ((StillCaptureFlashStopRepeatingQuirk) this.IconCompatParcelizer).RemoteActionCompatParcelizer(this.read);
                return;
            case 2:
                LinkedHashSet<getThumbScrollRange> linkedHashSet = (LinkedHashSet) this.IconCompatParcelizer;
                int i2 = this.read;
                for (getThumbScrollRange getthumbscrollrange : linkedHashSet) {
                    if (i2 == 5) {
                        synchronized (getthumbscrollrange.PlaybackStateCompat) {
                            if (getthumbscrollrange.RemoteActionCompatParcelizer() && getthumbscrollrange.RatingCompat != null) {
                                getThumbScrollRange.serializer();
                                Iterator it = getthumbscrollrange.RatingCompat.iterator();
                                while (it.hasNext()) {
                                    ((PreviewExternalSyntheticLambda0) it.next()).write();
                                }
                            }
                        }
                    } else {
                        getthumbscrollrange.getClass();
                    }
                }
                return;
            case 3:
                androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback = (androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback) this.IconCompatParcelizer;
                int i3 = this.read;
                boolean z = mediaCodecCallback.MediaBrowserCompatMediaItem;
                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl = androidx.camera.video.internal.encoder.EncoderImpl.this;
                if (z) {
                    setInflatedId.read(encoderImpl._init_lambda1, "Receives input frame after codec is reset.");
                    return;
                }
                switch (encoderImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        encoderImpl.ParcelableVolumeInfo.offer(Integer.valueOf(i3));
                        encoderImpl.serializer();
                        return;
                    default:
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(encoderImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, "Unknown state: ");
                        return;
                }
            case 4:
                getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo = (getExtendedTouchPaddinghWWAJMo) this.IconCompatParcelizer;
                int i4 = this.read;
                getextendedtouchpaddinghwwajmo.MediaSessionCompatQueueItem = i4;
                setInflatedId.read("CameraController", "setEnabledUseCases: failed to enable use cases properly for enabledUseCases = " + Integer.toBinaryString(2) + ", restoring back previous values " + Integer.toBinaryString(i4));
                return;
            case 5:
                ClickableKt clickableKt = (ClickableKt) this.IconCompatParcelizer;
                int i5 = this.read;
                if (clickableKt.RemoteActionCompatParcelizer.get()) {
                    getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo2 = clickableKt.IconCompatParcelizer.RemoteActionCompatParcelizer;
                    getextendedtouchpaddinghwwajmo2.ParcelableVolumeInfo = i5;
                    getWrapper getwrapper = getextendedtouchpaddinghwwajmo2.PlaybackStateCompatCustomAction;
                    if (getwrapper.write(i5)) {
                        getwrapper.read();
                    }
                    getextendedtouchpaddinghwwajmo2.PlaybackStateCompat.read(i5);
                    androidx.camera.video.VideoCapture videoCapture = getextendedtouchpaddinghwwajmo2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                    if (videoCapture.write(i5)) {
                        videoCapture.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((IntConsumer) this.IconCompatParcelizer).accept(this.read);
                return;
            case 7:
                ((com.braze.ui.contentcards.adapters.ContentCardAdapter) this.IconCompatParcelizer).notifyItemChanged(this.read);
                return;
            case 8:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.IconCompatParcelizer;
                int i6 = this.read;
                View view = (View) sideSheetBehavior.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.get();
                if (view != null) {
                    sideSheetBehavior.IconCompatParcelizer(view, i6, false);
                    return;
                }
                return;
            default:
                I$b i$b = (I$b) this.IconCompatParcelizer;
                int i7 = this.read;
                getMinimumTouchTargetSizeNHjbRc getminimumtouchtargetsizenhjbrc = (getMinimumTouchTargetSizeNHjbRc) i$b.IconCompatParcelizer;
                SparseArray sparseArray = (SparseArray) i$b.MediaSessionCompatResultReceiverWrapper;
                setLastShapeui setlastshapeui = (setLastShapeui) sparseArray.get(i7);
                getRectManager.RemoteActionCompatParcelizer(setlastshapeui != null, "Tried to release nonexistent target: %s", Integer.valueOf(i7));
                Iterator it2 = ((i$d) i$b.MediaMetadataCompat).write(i7).iterator();
                while (true) {
                    zzkh zzkhVar = (zzkh) it2;
                    if (!((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                        OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImplsWrite = getminimumtouchtargetsizenhjbrc.write();
                        ((headH91voCI) onGloballyPositionedModifierDefaultImplsWrite.read).RatingCompat.write(setlastshapeui.write(onGloballyPositionedModifierDefaultImplsWrite.IconCompatParcelizer()));
                        sparseArray.remove(i7);
                        ((HashMap) i$b.PlaybackStateCompat).remove(setlastshapeui.MediaBrowserCompatMediaItem);
                        return;
                    }
                    getminimumtouchtargetsizenhjbrc.write().read((visitNodes) zzkhVar.next());
                }
                break;
        }
    }
}
