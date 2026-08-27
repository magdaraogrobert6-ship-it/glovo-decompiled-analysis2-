package o;

import android.content.Context;
import android.os.Build;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetCmykcp extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 ComponentActivity;
    public final /* synthetic */ android.graphics.Rect IconCompatParcelizer;
    public final /* synthetic */ StrokeJoinCompanion MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.layout.ContentScale MediaDescriptionCompat;
    public final /* synthetic */ Context MediaMetadataCompat;
    public final /* synthetic */ boolean MediaSessionCompatQueueItem;
    public final /* synthetic */ boolean MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ android.graphics.Matrix MediaSessionCompatToken;
    public final /* synthetic */ Map ParcelableVolumeInfo;
    public final /* synthetic */ accessgetMirrorcp PlaybackStateCompat;
    public final /* synthetic */ boolean PlaybackStateCompatCustomAction;
    public final /* synthetic */ boolean RatingCompat;
    public final /* synthetic */ androidx.compose.ui.Alignment RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 ResultReceiver;
    public final /* synthetic */ getComposeTileModeDecal3opZhB0 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final /* synthetic */ boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final /* synthetic */ boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final /* synthetic */ getMiterLxFBmk8 read;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetCmykcp(android.graphics.Rect rect, androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.ui.Alignment alignment, android.graphics.Matrix matrix, accessgetMirrorcp accessgetmirrorcp, boolean z, boolean z2, getComposeTileModeDecal3opZhB0 getcomposetilemodedecal3opzhb0, getMiterLxFBmk8 getmiterlxfbmk8, StrokeJoinCompanion strokeJoinCompanion, Map map, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Context context, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7) {
        super(1);
        this.IconCompatParcelizer = rect;
        this.MediaDescriptionCompat = contentScale;
        this.RemoteActionCompatParcelizer = alignment;
        this.MediaSessionCompatToken = matrix;
        this.PlaybackStateCompat = accessgetmirrorcp;
        this.PlaybackStateCompatCustomAction = z;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = z2;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getcomposetilemodedecal3opzhb0;
        this.read = getmiterlxfbmk8;
        this.MediaBrowserCompatMediaItem = strokeJoinCompanion;
        this.ParcelableVolumeInfo = map;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z3;
        this.serializer = z4;
        this.write = z5;
        this.MediaSessionCompatResultReceiverWrapper = z6;
        this.MediaSessionCompatQueueItem = z7;
        this.RatingCompat = z8;
        this.MediaMetadataCompat = context;
        this.ResultReceiver = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.ComponentActivity = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        boolean zRemove;
        androidx.compose.ui.graphics.drawscope.DrawScope drawScope = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
        drawScope.getClass();
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        android.graphics.Rect rect = this.IconCompatParcelizer;
        long jSize = androidx.compose.ui.geometry.SizeKt.Size(rect.width(), rect.height());
        long jIntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(MathKt.write(androidx.compose.ui.geometry.Size.m546getWidthimpl(drawScope.mo1304getSizeNHjbRc())), MathKt.write(androidx.compose.ui.geometry.Size.m543getHeightimpl(drawScope.mo1304getSizeNHjbRc())));
        long jMo2202computeScaleFactorH7hwNQA = this.MediaDescriptionCompat.mo2202computeScaleFactorH7hwNQA(jSize, drawScope.mo1304getSizeNHjbRc());
        long jMo139alignKFBX0sM = this.RemoteActionCompatParcelizer.mo139alignKFBX0sM(androidx.compose.ui.unit.IntSizeKt.IntSize((int) (androidx.compose.ui.layout.ScaleFactor.m2330getScaleXimpl(jMo2202computeScaleFactorH7hwNQA) * androidx.compose.ui.geometry.Size.m546getWidthimpl(jSize)), (int) (androidx.compose.ui.layout.ScaleFactor.m2331getScaleYimpl(jMo2202computeScaleFactorH7hwNQA) * androidx.compose.ui.geometry.Size.m543getHeightimpl(jSize))), jIntSize, drawScope.getLayoutDirection());
        android.graphics.Matrix matrix = this.MediaSessionCompatToken;
        matrix.reset();
        matrix.preTranslate(androidx.compose.ui.unit.IntOffset.m3801getXimpl(jMo139alignKFBX0sM), androidx.compose.ui.unit.IntOffset.m3802getYimpl(jMo139alignKFBX0sM));
        matrix.preScale(androidx.compose.ui.layout.ScaleFactor.m2330getScaleXimpl(jMo2202computeScaleFactorH7hwNQA), androidx.compose.ui.layout.ScaleFactor.m2331getScaleYimpl(jMo2202computeScaleFactorH7hwNQA));
        TileModeCompanion tileModeCompanion = TileModeCompanion.MergePathsApi19;
        accessgetMirrorcp accessgetmirrorcp = this.PlaybackStateCompat;
        HashSet hashSet = (HashSet) accessgetmirrorcp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read;
        if (!this.PlaybackStateCompatCustomAction) {
            zRemove = hashSet.remove(tileModeCompanion);
        } else if (Build.VERSION.SDK_INT < tileModeCompanion.minRequiredSdkVersion) {
            getD50Xyzui_graphics.IconCompatParcelizer(String.format("%s is not supported pre SDK %d", tileModeCompanion.name(), Integer.valueOf(tileModeCompanion.minRequiredSdkVersion)));
            zRemove = false;
        } else {
            zRemove = hashSet.add(tileModeCompanion);
        }
        if (accessgetmirrorcp.MediaDescriptionCompat != null && zRemove) {
            accessgetmirrorcp.write();
        }
        accessgetmirrorcp.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        accessgetmirrorcp.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        accessgetmirrorcp.RemoteActionCompatParcelizer();
        accessgetmirrorcp.serializer = this.read;
        accessgetmirrorcp.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
        Map map = accessgetmirrorcp.MediaSessionCompatResultReceiverWrapper;
        Map map2 = this.ParcelableVolumeInfo;
        if (map2 != map) {
            accessgetmirrorcp.MediaSessionCompatResultReceiverWrapper = map2;
            accessgetmirrorcp.invalidateSelf();
        }
        if (this.ComponentActivity.getValue() != null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
            return null;
        }
        boolean z = accessgetmirrorcp.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        boolean z2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (z != z2) {
            accessgetmirrorcp.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = z2;
            getBt2020 getbt2020 = accessgetmirrorcp.PlaybackStateCompat;
            if (getbt2020 != null) {
                getbt2020.read(z2);
            }
        }
        accessgetmirrorcp.PlaybackStateCompatCustomAction = this.serializer;
        accessgetmirrorcp.ComponentActivity = this.write;
        accessgetmirrorcp.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = this.MediaSessionCompatResultReceiverWrapper;
        boolean z3 = accessgetmirrorcp.MediaBrowserCompatMediaItem;
        boolean z4 = this.MediaSessionCompatQueueItem;
        if (z4 != z3) {
            accessgetmirrorcp.MediaBrowserCompatMediaItem = z4;
            getBt2020 getbt2021 = accessgetmirrorcp.PlaybackStateCompat;
            if (getbt2021 != null) {
                getbt2021.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = z4;
            }
            accessgetmirrorcp.invalidateSelf();
        }
        boolean z5 = accessgetmirrorcp.MediaSessionCompatQueueItem;
        boolean z6 = this.RatingCompat;
        if (z6 != z5) {
            accessgetmirrorcp.MediaSessionCompatQueueItem = z6;
            accessgetmirrorcp.invalidateSelf();
        }
        isWideGamut iswidegamutIconCompatParcelizer = accessgetmirrorcp.IconCompatParcelizer();
        if (accessgetmirrorcp.write(this.MediaMetadataCompat) || iswidegamutIconCompatParcelizer == null) {
            accessgetmirrorcp.read(((Number) this.ResultReceiver.invoke()).floatValue());
        } else {
            accessgetmirrorcp.read(iswidegamutIconCompatParcelizer.serializer);
        }
        accessgetmirrorcp.setBounds(0, 0, rect.width(), rect.height());
        android.graphics.Canvas nativeCanvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas);
        RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0 = accessgetmirrorcp.addObserverForBackInvokerlambda0;
        ThreadPoolExecutor threadPoolExecutor = accessgetMirrorcp.write;
        getB getb = accessgetmirrorcp.RemoteActionCompatParcelizer;
        Semaphore semaphore = accessgetmirrorcp.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        getBt2020 getbt2022 = accessgetmirrorcp.PlaybackStateCompat;
        StrokeJoinCompanion strokeJoinCompanion = accessgetmirrorcp.MediaDescriptionCompat;
        if (getbt2022 != null && strokeJoinCompanion != null) {
            getMiterLxFBmk8 getmiterlxfbmk8 = accessgetmirrorcp.serializer;
            if (getmiterlxfbmk8 == null) {
                getmiterlxfbmk8 = getRoundLxFBmk8.read;
            }
            boolean z7 = getmiterlxfbmk8 == getMiterLxFBmk8.ENABLED;
            if (z7) {
                try {
                    semaphore.acquire();
                    if (accessgetmirrorcp.MediaMetadataCompat()) {
                        accessgetmirrorcp.read(getb.serializer());
                    }
                } catch (InterruptedException unused) {
                    if (z7) {
                        semaphore.release();
                        if (getbt2022.addObserverForBackInvokerlambda0 != getb.serializer()) {
                        }
                    }
                    return createFromParcel.INSTANCE;
                } catch (Throwable th) {
                    if (z7) {
                        semaphore.release();
                        if (getbt2022.addObserverForBackInvokerlambda0 != getb.serializer()) {
                            threadPoolExecutor.execute(rxWorker$1$$ExternalSyntheticLambda0);
                        }
                    }
                    throw th;
                }
            }
            boolean z8 = accessgetmirrorcp.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            int i = accessgetmirrorcp.read;
            boolean z9 = accessgetmirrorcp.ensureViewModelStore;
            if (z8) {
                try {
                    if (z9) {
                        nativeCanvas.save();
                        nativeCanvas.concat(matrix);
                        accessgetmirrorcp.RemoteActionCompatParcelizer(nativeCanvas, getbt2022);
                        nativeCanvas.restore();
                    } else {
                        getbt2022.RemoteActionCompatParcelizer(nativeCanvas, matrix, i, null);
                    }
                } catch (Throwable unused2) {
                    getD50Xyzui_graphics.write.getClass();
                    getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
                }
            } else if (z9) {
                nativeCanvas.save();
                nativeCanvas.concat(matrix);
                accessgetmirrorcp.RemoteActionCompatParcelizer(nativeCanvas, getbt2022);
                nativeCanvas.restore();
            } else {
                getbt2022.RemoteActionCompatParcelizer(nativeCanvas, matrix, i, null);
            }
            accessgetmirrorcp.ResultReceiver = false;
            if (z7) {
                semaphore.release();
                if (getbt2022.addObserverForBackInvokerlambda0 != getb.serializer()) {
                    threadPoolExecutor.execute(rxWorker$1$$ExternalSyntheticLambda0);
                }
            }
        }
        return createFromParcel.INSTANCE;
    }
}
