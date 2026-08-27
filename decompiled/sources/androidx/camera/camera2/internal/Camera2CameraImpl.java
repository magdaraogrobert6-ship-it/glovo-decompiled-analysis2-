package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.UseCase;
import androidx.camera.video.Recorder$3;
import androidx.lifecycle.BlockRunner;
import androidx.navigation.NavArgsLazy;
import bo.app.wg$$ExternalSyntheticLambda0;
import coil3.network.NetworkHeaders$Builder;
import coil3.util.UtilsKt;
import com.google.android.gms.net.zza;
import com.huawei.hmf.tasks.a.i$d;
import com.incognia.internal.pNP$$ExternalSyntheticLambda5;
import com.mapbox.search.base.utils.extension.StringKt;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import o.AeFpsRangeQuirk;
import o.AndroidGraphicsContext2;
import o.AuthenticatorUtils;
import o.CameraControlOperationCanceledException;
import o.CameraXExternalSyntheticLambda2;
import o.CaptureFailedRetryQuirk;
import o.DeferrableSurfaceSurfaceUnavailableException;
import o.DrawModifierNodeKt;
import o.FocusMeteringAction;
import o.ImageCapture1;
import o.ImageCaptureMetadata;
import o.ImageCaptureRotationOptionQuirk;
import o.ImageUtilCodecFailedException;
import o.InitializationException;
import o.JpegCaptureDownsizingQuirk;
import o.LegacyCameraOutputConfigNullPointerQuirk;
import o.LruCache;
import o.PreviewExternalSyntheticLambda0;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.RenderIntent;
import o.ReportedVideoQualityNotSupportedQuirk;
import o.SmallDisplaySizeQuirk;
import o.StillCaptureFlashStopRepeatingQuirk;
import o.SurfaceOrderQuirk;
import o.TemporalNoiseQuirk;
import o.Toolbar;
import o.VideoCapture;
import o.access801;
import o.accessgetGreencp;
import o.colorResource;
import o.getContentInsetStart;
import o.getInflatedId;
import o.getNavigationIcon;
import o.getSearchViewTextMinWidthDp;
import o.getTargetCheckedState;
import o.getThumbScrollRange;
import o.getThumbTextPadding;
import o.getThumbTintList;
import o.getTitleMarginBottom;
import o.getTrackTintList;
import o.mapToBase;
import o.nativeConvertAndroid420ToABGR;
import o.nativeGetSurfaceInfo;
import o.nativeGetYUVImageVUOff;
import o.nativeNewDirectByteBuffer;
import o.nativeWriteJpegToSurface;
import o.onCreateInputConnection;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.onMeasure;
import o.onReadoutStarted;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.setAutoSizeTextTypeUniformWithPresetSizes;
import o.setBaselineAligned;
import o.setCompoundDrawablesWithIntrinsicBounds;
import o.setDividerPadding;
import o.setDropDownVerticalOffset;
import o.setImplementationMode;
import o.setInflatedId;
import o.setLastBaselineToBottomHeight;
import o.setLineHeight;
import o.setTextFuture;
import o.setTextMetricsParamsCompat;
import o.setTextSize;
import o.setThumbTintList;
import o.setTrackDrawable;
import o.setTrackTintMode;
import o.sourceInformationContextOfdefault;
import o.toContentCaptureSession;
import o.toString;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2CameraImpl implements ImageCapture1 {
    public boolean ComponentActivity;
    public final setCompoundDrawablesWithIntrinsicBounds IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final setLineHeight MediaDescriptionCompat;
    public final accessgetGreencp MediaMetadataCompat;
    public final nativeWriteJpegToSurface MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatResultReceiverWrapper;
    public final BlockRunner MediaSessionCompatToken;
    public final getTitleMarginBottom ParcelableVolumeInfo;
    public setBaselineAligned PlaybackStateCompat;
    public final BlockRunner PlaybackStateCompatCustomAction;
    public final CameraManagerCompat RatingCompat;
    public final Camera2CameraCoordinator RemoteActionCompatParcelizer;
    public final DisplayInfoManager ResultReceiver;
    public volatile setTextFuture _init_lambda1 = setTextFuture.INITIALIZED;
    public final SupportedSurfaceCombination _init_lambda2;
    public final setTextMetricsParamsCompat _init_lambda3;
    public int _init_lambda4;
    public final boolean accessensureViewModelStore;
    public final NetworkHeaders$Builder addObserverForBackInvoker;
    public onDrawWithContent createFullyDrawnExecutor;
    public DrawModifierNodeKt ensureViewModelStore;
    public final PreviewFreezeAfterHighSpeedRecordingQuirk r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final getTrackTintList r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final i$d r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public boolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final Object r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public BlockRunner r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final NavArgsLazy r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final ReportedVideoQualityNotSupportedQuirk r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final HashSet r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final AtomicInteger r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final LinkedHashMap r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final Camera2CameraControlImpl read;
    public CameraControlOperationCanceledException serializer;
    public CameraDevice write;

    @Override // o.ImageCapture1
    public final CameraControlOperationCanceledException MediaBrowserCompatMediaItem() {
        return this.serializer;
    }

    @Override // o.ImageCapture1
    public final DeferrableSurfaceSurfaceUnavailableException MediaDescriptionCompat() {
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    }

    @Override // o.ImageCapture1
    public final FocusMeteringAction MediaMetadataCompat() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.ImageCapture1
    public final ImageCaptureMetadata MediaSessionCompatQueueItem() {
        return this.read;
    }

    @Override // o.ImageCapture1
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = z;
    }

    public static String write(UseCase useCase) {
        return useCase.MediaSessionCompatToken() + useCase.hashCode();
    }

    public final void IconCompatParcelizer() throws Throwable {
        int i = 0;
        int i2 = 1;
        UtilsKt.RemoteActionCompatParcelizer((String) null, this._init_lambda1 == setTextFuture.RELEASING || this._init_lambda1 == setTextFuture.CLOSING);
        UtilsKt.RemoteActionCompatParcelizer((String) null, this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.isEmpty());
        if (!this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) {
            RemoteActionCompatParcelizer();
            return;
        }
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
            write("Ignored since configAndClose is processing");
            return;
        }
        if (!this.IconCompatParcelizer.RemoteActionCompatParcelizer) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = false;
            RemoteActionCompatParcelizer();
            write("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            write("Open camera to configAndClose");
            onDrawBehind ondrawbehindRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer(new setLastBaselineToBottomHeight(this, i2));
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
            ondrawbehindRemoteActionCompatParcelizer.serializer.RemoteActionCompatParcelizer(new onMeasure(this, i), this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        }
    }

    public final void MediaSessionCompatToken() {
        int i;
        int i2 = 1;
        UtilsKt.RemoteActionCompatParcelizer((String) null, this._init_lambda1 == setTextFuture.OPENED);
        nativeGetSurfaceInfo nativegetsurfaceinfoSerializer = this.addObserverForBackInvoker.serializer();
        if (!nativegetsurfaceinfoSerializer.write()) {
            write("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(this.write.getId(), this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.write.getId()))) {
            write("Unable to create capture session in camera operating mode = " + this.RemoteActionCompatParcelizer.IconCompatParcelizer());
            return;
        }
        HashMap map = new HashMap();
        Collection<mapToBase> collectionIconCompatParcelizer = this.addObserverForBackInvoker.IconCompatParcelizer();
        Collection collectionMediaMetadataCompat = this.addObserverForBackInvoker.MediaMetadataCompat();
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = getTargetCheckedState.write;
        collectionIconCompatParcelizer.getClass();
        collectionMediaMetadataCompat.getClass();
        ArrayList arrayList = new ArrayList(collectionMediaMetadataCompat);
        Iterator it = collectionIconCompatParcelizer.iterator();
        while (true) {
            i = 3;
            if (it.hasNext()) {
                mapToBase maptobase = (mapToBase) it.next();
                if (maptobase.MediaDescriptionCompat.MediaDescriptionCompat.RemoteActionCompatParcelizer.containsKey(jpegCaptureDownsizingQuirk) && maptobase.RemoteActionCompatParcelizer().size() != 1) {
                    setInflatedId.serializer("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(maptobase.RemoteActionCompatParcelizer().size())}, 1)));
                    break;
                }
                if (maptobase.MediaDescriptionCompat.MediaDescriptionCompat.RemoteActionCompatParcelizer.containsKey(jpegCaptureDownsizingQuirk)) {
                    int i3 = 0;
                    for (mapToBase maptobase2 : collectionIconCompatParcelizer) {
                        if (((ImageUtilCodecFailedException) arrayList.get(i3)).write() == VideoCapture.METERING_REPEATING) {
                            List listRemoteActionCompatParcelizer = maptobase2.RemoteActionCompatParcelizer();
                            listRemoteActionCompatParcelizer.getClass();
                            UtilsKt.RemoteActionCompatParcelizer("MeteringRepeating should contain a surface", !listRemoteActionCompatParcelizer.isEmpty());
                            map.put(maptobase2.RemoteActionCompatParcelizer().get(0), 1L);
                        } else if (maptobase2.MediaDescriptionCompat.MediaDescriptionCompat.RemoteActionCompatParcelizer.containsKey(jpegCaptureDownsizingQuirk)) {
                            List listRemoteActionCompatParcelizer2 = maptobase2.RemoteActionCompatParcelizer();
                            listRemoteActionCompatParcelizer2.getClass();
                            if (!listRemoteActionCompatParcelizer2.isEmpty()) {
                                Object obj = maptobase2.RemoteActionCompatParcelizer().get(0);
                                Object objWrite = maptobase2.MediaDescriptionCompat.MediaDescriptionCompat.write(jpegCaptureDownsizingQuirk);
                                objWrite.getClass();
                                map.put(obj, objWrite);
                            }
                        }
                        i3++;
                    }
                }
            }
            map.toString();
            setInflatedId.IconCompatParcelizer(3, "StreamUseCaseUtil");
            break;
        }
        setBaselineAligned setbaselinealigned = this.PlaybackStateCompat;
        synchronized (setbaselinealigned.MediaSessionCompatResultReceiverWrapper) {
            setbaselinealigned.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = map;
        }
        setBaselineAligned setbaselinealigned2 = this.PlaybackStateCompat;
        mapToBase maptobaseRemoteActionCompatParcelizer = nativegetsurfaceinfoSerializer.RemoteActionCompatParcelizer();
        CameraDevice cameraDevice = this.write;
        cameraDevice.getClass();
        BlockRunner blockRunner = this.PlaybackStateCompatCustomAction;
        DrawModifierNodeKt drawModifierNodeKtWrite = setbaselinealigned2.write(maptobaseRemoteActionCompatParcelizer, cameraDevice, new getThumbScrollRange((u$a) blockRunner.RemoteActionCompatParcelizer, (u$a) blockRunner.IconCompatParcelizer, (BlockRunner) blockRunner.write, (PreviewFreezeAfterHighSpeedRecordingQuirk) blockRunner.read, (ReportedVideoQualityNotSupportedQuirk) blockRunner.serializer, (Handler) blockRunner.RatingCompat));
        drawModifierNodeKtWrite.RemoteActionCompatParcelizer(new zza(drawModifierNodeKtWrite, i2, new Recorder$3(this, i, setbaselinealigned2)), this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
    }

    public final void PlaybackStateCompat() {
        nativeGetSurfaceInfo nativegetsurfaceinfoRemoteActionCompatParcelizer = this.addObserverForBackInvoker.RemoteActionCompatParcelizer();
        boolean zWrite = nativegetsurfaceinfoRemoteActionCompatParcelizer.write();
        Camera2CameraControlImpl camera2CameraControlImpl = this.read;
        if (!zWrite) {
            camera2CameraControlImpl.ComponentActivity = 1;
            camera2CameraControlImpl.PlaybackStateCompatCustomAction.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = 1;
            camera2CameraControlImpl.RemoteActionCompatParcelizer.MediaMetadataCompat = 1;
            this.PlaybackStateCompat.IconCompatParcelizer(camera2CameraControlImpl.MediaBrowserCompatMediaItem());
            return;
        }
        int i = nativegetsurfaceinfoRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().MediaDescriptionCompat.MediaSessionCompatQueueItem;
        camera2CameraControlImpl.ComponentActivity = i;
        camera2CameraControlImpl.PlaybackStateCompatCustomAction.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i;
        camera2CameraControlImpl.RemoteActionCompatParcelizer.MediaMetadataCompat = i;
        nativegetsurfaceinfoRemoteActionCompatParcelizer.read(camera2CameraControlImpl.MediaBrowserCompatMediaItem());
        this.PlaybackStateCompat.IconCompatParcelizer(nativegetsurfaceinfoRemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
    }

    public final setBaselineAligned RatingCompat() {
        setBaselineAligned setbaselinealigned;
        synchronized (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
            getTitleMarginBottom gettitlemarginbottom = this.ParcelableVolumeInfo;
            if (gettitlemarginbottom != null) {
                JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = setTrackDrawable.RemoteActionCompatParcelizer;
                if (gettitlemarginbottom.PlaybackStateCompatCustomAction.read(setTrackDrawable.RemoteActionCompatParcelizer, null) != null) {
                    throw new ClassCastException();
                }
            }
            setbaselinealigned = new setBaselineAligned(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.MediaDescriptionCompat.MediaBrowserCompatMediaItem, false);
        }
        return setbaselinealigned;
    }

    public final void RemoteActionCompatParcelizer() throws Throwable {
        UtilsKt.RemoteActionCompatParcelizer((String) null, this._init_lambda1 == setTextFuture.RELEASING || this._init_lambda1 == setTextFuture.CLOSING);
        UtilsKt.RemoteActionCompatParcelizer((String) null, this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.isEmpty());
        this.write = null;
        if (this._init_lambda1 == setTextFuture.CLOSING) {
            read(setTextFuture.INITIALIZED);
            return;
        }
        ((CameraManager) this.RatingCompat.serializer.MediaSessionCompatQueueItem).unregisterAvailabilityCallback(this.IconCompatParcelizer);
        read(setTextFuture.RELEASED);
        onDrawWithContent ondrawwithcontent = this.createFullyDrawnExecutor;
        if (ondrawwithcontent != null) {
            ondrawwithcontent.RemoteActionCompatParcelizer(null);
            this.createFullyDrawnExecutor = null;
        }
    }

    @Override // o.ImageCapture1
    public final void RemoteActionCompatParcelizer(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(serializer(arrayList2));
        for (UseCase useCase : new ArrayList(arrayList2)) {
            String strWrite = write(useCase);
            HashSet hashSet = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            if (hashSet.contains(strWrite)) {
                useCase.MediaBrowserCompatMediaItem();
                hashSet.remove(strWrite);
            }
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.execute(new onCreateInputConnection(this, arrayList3, 1));
    }

    public final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        if (setDropDownVerticalOffset.write(this.MediaDescriptionCompat.RemoteActionCompatParcelizer)) {
            nativeGetSurfaceInfo nativegetsurfaceinfoRemoteActionCompatParcelizer = this.addObserverForBackInvoker.RemoteActionCompatParcelizer();
            if (nativegetsurfaceinfoRemoteActionCompatParcelizer.write()) {
                int iIntValue = ((Integer) nativegetsurfaceinfoRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().MediaDescriptionCompat.IconCompatParcelizer().getUpper()).intValue();
                Camera2CameraControlImpl camera2CameraControlImpl = this.read;
                if (iIntValue > 30) {
                    camera2CameraControlImpl.IconCompatParcelizer(true);
                } else {
                    camera2CameraControlImpl.IconCompatParcelizer(false);
                }
            }
        }
    }

    public final void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() throws Exception {
        Iterator it = this.addObserverForBackInvoker.MediaMetadataCompat().iterator();
        boolean zBooleanValue = false;
        while (it.hasNext()) {
            zBooleanValue |= ((Boolean) ((ImageUtilCodecFailedException) it.next()).read(ImageUtilCodecFailedException.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, Boolean.FALSE)).booleanValue();
        }
        getThumbTextPadding getthumbtextpadding = this.read.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (getthumbtextpadding.RatingCompat != zBooleanValue && zBooleanValue) {
            setImplementationMode setimplementationmode = getthumbtextpadding.RemoteActionCompatParcelizer;
            while (!setimplementationmode.serializer()) {
                ((getInflatedId) setimplementationmode.RemoteActionCompatParcelizer()).close();
            }
        }
        getthumbtextpadding.RatingCompat = zBooleanValue;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void read() {
        boolean z;
        NetworkHeaders$Builder networkHeaders$Builder;
        String str;
        Size size;
        NetworkHeaders$Builder networkHeaders$Builder2 = this.addObserverForBackInvoker;
        nativeGetSurfaceInfo nativegetsurfaceinfoSerializer = networkHeaders$Builder2.serializer();
        LinkedHashMap linkedHashMap = networkHeaders$Builder2.serializer;
        mapToBase maptobaseRemoteActionCompatParcelizer = nativegetsurfaceinfoSerializer.RemoteActionCompatParcelizer();
        int size2 = Collections.unmodifiableList(maptobaseRemoteActionCompatParcelizer.MediaDescriptionCompat.MediaBrowserCompatMediaItem).size();
        int size3 = maptobaseRemoteActionCompatParcelizer.RemoteActionCompatParcelizer().size();
        BlockRunner blockRunner = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        boolean z2 = false;
        z2 = false;
        String str2 = "MeteringRepeating";
        int i = 1;
        if (blockRunner == null ? false : networkHeaders$Builder2.serializer(read(blockRunner))) {
            Object[] objArr = size2 != 1 || size3 == 1;
            if (objArr == true || serializer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM)) {
                if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != null) {
                    StringBuilder sb = new StringBuilder("MeteringRepeating");
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.getClass();
                    sb.append(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.hashCode());
                    String string = sb.toString();
                    if (linkedHashMap.containsKey(string)) {
                        SurfaceOrderQuirk surfaceOrderQuirk = (SurfaceOrderQuirk) linkedHashMap.get(string);
                        surfaceOrderQuirk.serializer = false;
                        if (!surfaceOrderQuirk.RemoteActionCompatParcelizer) {
                            linkedHashMap.remove(string);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("MeteringRepeating");
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.getClass();
                    sb2.append(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.hashCode());
                    String string2 = sb2.toString();
                    if (linkedHashMap.containsKey(string2)) {
                        SurfaceOrderQuirk surfaceOrderQuirk2 = (SurfaceOrderQuirk) linkedHashMap.get(string2);
                        surfaceOrderQuirk2.RemoteActionCompatParcelizer = false;
                        if (!surfaceOrderQuirk2.serializer) {
                            linkedHashMap.remove(string2);
                        }
                    }
                    BlockRunner blockRunner2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    blockRunner2.getClass();
                    setInflatedId.IconCompatParcelizer(3, "MeteringRepeating");
                    o.Camera2CameraFactory camera2CameraFactory = (o.Camera2CameraFactory) blockRunner2.read;
                    if (camera2CameraFactory != null) {
                        camera2CameraFactory.write();
                    }
                    blockRunner2.read = null;
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
                }
                if (objArr != false) {
                    z2 = true;
                }
            } else {
                z2 = true;
            }
        } else {
            if (size2 != 0 || size3 <= 0) {
                z = true;
            } else {
                if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
                    getThumbTintList getthumbtintlist = this.MediaDescriptionCompat.RemoteActionCompatParcelizer;
                    setLastBaselineToBottomHeight setlastbaselinetobottomheight = new setLastBaselineToBottomHeight(this, z2 ? 1 : 0);
                    BlockRunner blockRunner3 = new BlockRunner();
                    setTrackTintMode settracktintmode = new setTrackTintMode();
                    blockRunner3.IconCompatParcelizer = null;
                    blockRunner3.RatingCompat = new getSearchViewTextMinWidthDp();
                    blockRunner3.RemoteActionCompatParcelizer = setlastbaselinetobottomheight;
                    Size[] sizeArrIconCompatParcelizer = getthumbtintlist.serializer().IconCompatParcelizer(34);
                    if (sizeArrIconCompatParcelizer != null) {
                        if (settracktintmode.IconCompatParcelizer != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                            ArrayList arrayList = new ArrayList();
                            for (Size size4 : sizeArrIconCompatParcelizer) {
                                if (setTrackTintMode.write.compare(size4, setTrackTintMode.read) >= 0) {
                                    arrayList.add(size4);
                                }
                            }
                            sizeArrIconCompatParcelizer = (Size[]) arrayList.toArray(new Size[0]);
                        }
                        List listAsList = Arrays.asList(sizeArrIconCompatParcelizer);
                        Collections.sort(listAsList, new wg$$ExternalSyntheticLambda0(i));
                        Size sizeRemoteActionCompatParcelizer = this.ResultReceiver.RemoteActionCompatParcelizer();
                        long jMin = Math.min(((long) sizeRemoteActionCompatParcelizer.getWidth()) * ((long) sizeRemoteActionCompatParcelizer.getHeight()), 307200L);
                        int length = sizeArrIconCompatParcelizer.length;
                        int i2 = 0;
                        Size size5 = null;
                        while (true) {
                            if (i2 < length) {
                                Size size6 = sizeArrIconCompatParcelizer[i2];
                                networkHeaders$Builder = networkHeaders$Builder2;
                                str = str2;
                                long width = ((long) size6.getWidth()) * ((long) size6.getHeight());
                                if (width == jMin) {
                                    size = size6;
                                    break;
                                }
                                if (width > jMin) {
                                    if (size5 != null) {
                                        size = size5;
                                        break;
                                    }
                                } else {
                                    i2++;
                                    size5 = size6;
                                    networkHeaders$Builder2 = networkHeaders$Builder;
                                    str2 = str;
                                }
                            } else {
                                networkHeaders$Builder = networkHeaders$Builder2;
                                str = str2;
                            }
                            size = (Size) listAsList.get(0);
                            break;
                        }
                    } else {
                        setInflatedId.serializer("MeteringRepeating", "Can not get output size list.");
                        size = new Size(0, 0);
                        networkHeaders$Builder = networkHeaders$Builder2;
                        str = "MeteringRepeating";
                    }
                    blockRunner3.write = size;
                    Objects.toString(size);
                    setInflatedId.IconCompatParcelizer(3, str);
                    blockRunner3.serializer = blockRunner3.RemoteActionCompatParcelizer();
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = blockRunner3;
                } else {
                    networkHeaders$Builder = networkHeaders$Builder2;
                }
                if (!serializer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM)) {
                    BlockRunner blockRunner4 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    if (blockRunner4 != null) {
                        String str3 = read(blockRunner4);
                        BlockRunner blockRunner5 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        mapToBase maptobase = (mapToBase) blockRunner5.serializer;
                        getSearchViewTextMinWidthDp getsearchviewtextminwidthdp = (getSearchViewTextMinWidthDp) blockRunner5.RatingCompat;
                        VideoCapture videoCapture = VideoCapture.METERING_REPEATING;
                        List listSingletonList = Collections.singletonList(videoCapture);
                        NetworkHeaders$Builder networkHeaders$Builder3 = networkHeaders$Builder;
                        LinkedHashMap linkedHashMap2 = networkHeaders$Builder3.serializer;
                        SurfaceOrderQuirk surfaceOrderQuirk3 = (SurfaceOrderQuirk) linkedHashMap2.get(str3);
                        if (surfaceOrderQuirk3 == null) {
                            surfaceOrderQuirk3 = new SurfaceOrderQuirk(maptobase, getsearchviewtextminwidthdp, null, listSingletonList);
                            linkedHashMap2.put(str3, surfaceOrderQuirk3);
                        }
                        surfaceOrderQuirk3.serializer = true;
                        networkHeaders$Builder3.serializer(str3, maptobase, getsearchviewtextminwidthdp, null, listSingletonList);
                        BlockRunner blockRunner6 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        mapToBase maptobase2 = (mapToBase) blockRunner6.serializer;
                        getSearchViewTextMinWidthDp getsearchviewtextminwidthdp2 = (getSearchViewTextMinWidthDp) blockRunner6.RatingCompat;
                        List listSingletonList2 = Collections.singletonList(videoCapture);
                        LinkedHashMap linkedHashMap3 = networkHeaders$Builder3.serializer;
                        SurfaceOrderQuirk surfaceOrderQuirk4 = (SurfaceOrderQuirk) linkedHashMap3.get(str3);
                        if (surfaceOrderQuirk4 == null) {
                            surfaceOrderQuirk4 = new SurfaceOrderQuirk(maptobase2, getsearchviewtextminwidthdp2, null, listSingletonList2);
                            linkedHashMap3.put(str3, surfaceOrderQuirk4);
                        }
                        z = true;
                        surfaceOrderQuirk4.RemoteActionCompatParcelizer = true;
                    } else {
                        z = true;
                    }
                }
            }
            z2 = z;
        }
        this.read.MediaSessionCompatResultReceiverWrapper = z2;
        if (z2) {
            return;
        }
        setInflatedId.serializer("Camera2CameraImpl", "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
    }

    public final void read(boolean z) throws Throwable {
        write("Attempting to force open the camera.");
        if (this.MediaSessionCompatQueueItem.serializer(this)) {
            write(z);
        } else {
            write("No cameras available. Waiting for available camera before opening camera.");
            read(setTextFuture.PENDING_OPEN);
        }
    }

    public final CameraDevice.StateCallback serializer() {
        ArrayList arrayList = new ArrayList(this.addObserverForBackInvoker.serializer().RemoteActionCompatParcelizer().read);
        arrayList.add((setDividerPadding) this.MediaSessionCompatToken.IconCompatParcelizer);
        arrayList.add(this._init_lambda3);
        return RenderIntent.RemoteActionCompatParcelizer(arrayList);
    }

    public final ArrayList serializer(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            boolean z = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            String strWrite = write(useCase);
            Class<?> cls = useCase.getClass();
            mapToBase maptobase = z ? useCase.MediaSessionCompatResultReceiverWrapper : useCase.PlaybackStateCompatCustomAction;
            ImageUtilCodecFailedException imageUtilCodecFailedException = useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            SmallDisplaySizeQuirk smallDisplaySizeQuirk = useCase.MediaSessionCompatToken;
            arrayList2.add(new access801(strWrite, cls, maptobase, imageUtilCodecFailedException, smallDisplaySizeQuirk != null ? smallDisplaySizeQuirk.MediaMetadataCompat : null, smallDisplaySizeQuirk, useCase.RatingCompat() == null ? null : LruCache.IconCompatParcelizer(useCase)));
        }
        return arrayList2;
    }

    public final void serializer(boolean z) throws Throwable {
        write("Attempting to open the camera.");
        if (this.IconCompatParcelizer.RemoteActionCompatParcelizer && this.MediaSessionCompatQueueItem.serializer(this)) {
            write(z);
        } else {
            write("No cameras available. Waiting for available camera before opening camera.");
            read(setTextFuture.PENDING_OPEN);
        }
    }

    public final String toString() {
        Locale locale = Locale.US;
        int iHashCode = hashCode();
        return String.format(locale, "Camera@%x[id=%s]", Integer.valueOf(iHashCode), this.MediaDescriptionCompat.MediaDescriptionCompat);
    }

    public final void write() throws Throwable {
        ArrayList<nativeGetYUVImageVUOff> arrayList;
        UtilsKt.RemoteActionCompatParcelizer("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this._init_lambda1 + " (error: " + RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem) + ")", this._init_lambda1 == setTextFuture.CLOSING || this._init_lambda1 == setTextFuture.RELEASING || (this._init_lambda1 == setTextFuture.REOPENING && this.MediaBrowserCompatMediaItem != 0));
        PlaybackStateCompatCustomAction();
        setBaselineAligned setbaselinealigned = this.PlaybackStateCompat;
        synchronized (setbaselinealigned.MediaSessionCompatResultReceiverWrapper) {
            if (setbaselinealigned.write.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(setbaselinealigned.write);
                setbaselinealigned.write.clear();
            }
        }
        if (arrayList != null) {
            for (nativeGetYUVImageVUOff nativegetyuvimagevuoff : arrayList) {
                Iterator it = nativegetyuvimagevuoff.IconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    ((StillCaptureFlashStopRepeatingQuirk) it.next()).RemoteActionCompatParcelizer(nativegetyuvimagevuoff.serializer());
                }
            }
        }
    }

    public final void write(ArrayList arrayList) throws Exception {
        Size size;
        boolean zIsEmpty = this.addObserverForBackInvoker.IconCompatParcelizer().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            access801 access801Var = (access801) it.next();
            if (!this.addObserverForBackInvoker.serializer(access801Var.MediaSessionCompatQueueItem)) {
                NetworkHeaders$Builder networkHeaders$Builder = this.addObserverForBackInvoker;
                String str = access801Var.MediaSessionCompatQueueItem;
                mapToBase maptobase = access801Var.read;
                ImageUtilCodecFailedException imageUtilCodecFailedException = access801Var.IconCompatParcelizer;
                SmallDisplaySizeQuirk smallDisplaySizeQuirk = access801Var.write;
                List list = access801Var.RemoteActionCompatParcelizer;
                LinkedHashMap linkedHashMap = networkHeaders$Builder.serializer;
                SurfaceOrderQuirk surfaceOrderQuirk = (SurfaceOrderQuirk) linkedHashMap.get(str);
                if (surfaceOrderQuirk == null) {
                    surfaceOrderQuirk = new SurfaceOrderQuirk(maptobase, imageUtilCodecFailedException, smallDisplaySizeQuirk, list);
                    linkedHashMap.put(str, surfaceOrderQuirk);
                }
                surfaceOrderQuirk.serializer = true;
                networkHeaders$Builder.serializer(str, maptobase, imageUtilCodecFailedException, smallDisplaySizeQuirk, list);
                arrayList2.add(access801Var.MediaSessionCompatQueueItem);
                if (access801Var.MediaBrowserCompatMediaItem == AuthenticatorUtils.class && (size = access801Var.serializer) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        write("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED");
        if (zIsEmpty) {
            this.read.RemoteActionCompatParcelizer(true);
            Camera2CameraControlImpl camera2CameraControlImpl = this.read;
            synchronized (camera2CameraControlImpl.PlaybackStateCompat) {
                camera2CameraControlImpl.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM++;
            }
        }
        read();
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        PlaybackStateCompat();
        PlaybackStateCompatCustomAction();
        setTextFuture settextfuture = this._init_lambda1;
        setTextFuture settextfuture2 = setTextFuture.OPENED;
        if (settextfuture == settextfuture2) {
            MediaSessionCompatToken();
        } else {
            int iOrdinal = this._init_lambda1.ordinal();
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                read(false);
            } else if (iOrdinal != 5) {
                write("open() ignored due to being in state: " + this._init_lambda1);
            } else {
                read(setTextFuture.REOPENING);
                if (!this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.isEmpty() && !this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 && this.MediaBrowserCompatMediaItem == 0) {
                    UtilsKt.RemoteActionCompatParcelizer("Camera Device should be open if session close is not complete", this.write != null);
                    read(settextfuture2);
                    MediaSessionCompatToken();
                }
            }
        }
        if (rational != null) {
            this.read.PlaybackStateCompatCustomAction.ResultReceiver = rational;
        }
    }

    @Override // o.ImageCapture1
    public final void IconCompatParcelizer(boolean z) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.execute(new pNP$$ExternalSyntheticLambda5(this, z, 1));
    }

    @Override // o.ImageCapture1
    public final void MediaSessionCompatResultReceiverWrapper() {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.execute(new onMeasure(this, 1));
    }

    @Override // o.ImageCapture1
    public final DrawModifierNodeKt ParcelableVolumeInfo() {
        return UtilsKt.RemoteActionCompatParcelizer(new setLastBaselineToBottomHeight(this, 4));
    }

    @Override // o.ImageCapture1
    public final void write(CameraControlOperationCanceledException cameraControlOperationCanceledException) {
        if (cameraControlOperationCanceledException == null) {
            cameraControlOperationCanceledException = CameraXExternalSyntheticLambda2.write;
        }
        cameraControlOperationCanceledException.RemoteActionCompatParcelizer();
        this.serializer = cameraControlOperationCanceledException;
        synchronized (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
        }
    }

    public static String read(BlockRunner blockRunner) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        blockRunner.getClass();
        sb.append(blockRunner.hashCode());
        return sb.toString();
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void IconCompatParcelizer(UseCase useCase) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.execute(new setAutoSizeTextTypeUniformWithPresetSizes(this, write(useCase), this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss ? useCase.MediaSessionCompatResultReceiverWrapper : useCase.PlaybackStateCompatCustomAction, useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, useCase.MediaSessionCompatToken, useCase.RatingCompat() == null ? null : LruCache.IconCompatParcelizer(useCase), 2));
    }

    @Override // o.ImageCapture1
    public final void RemoteActionCompatParcelizer(Collection collection) {
        Camera2CameraControlImpl camera2CameraControlImpl = this.read;
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (camera2CameraControlImpl.PlaybackStateCompat) {
            camera2CameraControlImpl.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM++;
        }
        ArrayList<UseCase> arrayList2 = new ArrayList(arrayList);
        HashSet hashSet = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        for (UseCase useCase : arrayList2) {
            String strWrite = write(useCase);
            if (!hashSet.contains(strWrite)) {
                hashSet.add(strWrite);
                useCase.ResultReceiver();
                useCase.g_();
            }
        }
        try {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.execute(new onCreateInputConnection(this, new ArrayList(serializer(arrayList)), 0));
        } catch (RejectedExecutionException unused) {
            write("Unable to attach use cases.");
            camera2CameraControlImpl.RemoteActionCompatParcelizer();
        }
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void read(UseCase useCase) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.execute(new setAutoSizeTextTypeUniformWithPresetSizes(this, write(useCase), this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss ? useCase.MediaSessionCompatResultReceiverWrapper : useCase.PlaybackStateCompatCustomAction, useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, useCase.MediaSessionCompatToken, useCase.RatingCompat() == null ? null : LruCache.IconCompatParcelizer(useCase), 0));
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void serializer(UseCase useCase) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.execute(new setAutoSizeTextTypeUniformWithPresetSizes(this, write(useCase), this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss ? useCase.MediaSessionCompatResultReceiverWrapper : useCase.PlaybackStateCompatCustomAction, useCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, useCase.MediaSessionCompatToken, useCase.RatingCompat() == null ? null : LruCache.IconCompatParcelizer(useCase), 1));
    }

    /* JADX WARN: Code duplicated, block: B:57:0x011a  */
    public final void serializer(setTextFuture settextfuture, Toolbar toolbar, boolean z) throws Throwable {
        nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr;
        nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr2;
        nativeNewDirectByteBuffer nativenewdirectbytebufferWrite;
        write("Transitioning camera internal state: " + this._init_lambda1 + " --> " + settextfuture);
        if (((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue()) {
            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(settextfuture.ordinal(), "CX:C2State[" + this + "]");
            if (toolbar != null) {
                this._init_lambda4++;
            }
            if (this._init_lambda4 > 0) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(toolbar != null ? toolbar.write : 0, "CX:C2StateErrorCode[" + this + "]");
            }
        }
        this._init_lambda1 = settextfuture;
        switch (settextfuture.ordinal()) {
            case 0:
                nativeconvertandroid420toabgr = nativeConvertAndroid420ToABGR.RELEASED;
                break;
            case 1:
                nativeconvertandroid420toabgr = nativeConvertAndroid420ToABGR.RELEASING;
                break;
            case 2:
                nativeconvertandroid420toabgr = nativeConvertAndroid420ToABGR.CLOSED;
                break;
            case 3:
                nativeconvertandroid420toabgr = nativeConvertAndroid420ToABGR.PENDING_OPEN;
                break;
            case 4:
            case 5:
            case 6:
                nativeconvertandroid420toabgr = nativeConvertAndroid420ToABGR.CLOSING;
                break;
            case 7:
            case 8:
                nativeconvertandroid420toabgr = nativeConvertAndroid420ToABGR.OPENING;
                break;
            case 9:
                nativeconvertandroid420toabgr = nativeConvertAndroid420ToABGR.OPEN;
                break;
            case 10:
                nativeconvertandroid420toabgr = nativeConvertAndroid420ToABGR.CONFIGURED;
                break;
            default:
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(settextfuture, "Unknown state: ");
                return;
        }
        nativeWriteJpegToSurface nativewritejpegtosurface = this.MediaSessionCompatQueueItem;
        synchronized (nativewritejpegtosurface.write) {
            int i = nativewritejpegtosurface.IconCompatParcelizer;
            nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr3 = nativeConvertAndroid420ToABGR.RELEASED;
            HashMap map = nativewritejpegtosurface.serializer;
            HashMap map2 = null;
            if (nativeconvertandroid420toabgr == nativeconvertandroid420toabgr3) {
                nativeNewDirectByteBuffer nativenewdirectbytebuffer = (nativeNewDirectByteBuffer) map.remove(this);
                if (nativenewdirectbytebuffer != null) {
                    nativewritejpegtosurface.serializer();
                    nativeconvertandroid420toabgr2 = nativenewdirectbytebuffer.write;
                } else {
                    nativeconvertandroid420toabgr2 = null;
                }
            } else {
                nativeNewDirectByteBuffer nativenewdirectbytebuffer2 = (nativeNewDirectByteBuffer) map.get(this);
                UtilsKt.IconCompatParcelizer(nativenewdirectbytebuffer2, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr4 = nativenewdirectbytebuffer2.write;
                nativenewdirectbytebuffer2.write = nativeconvertandroid420toabgr;
                nativeConvertAndroid420ToABGR nativeconvertandroid420toabgr5 = nativeConvertAndroid420ToABGR.OPENING;
                if (nativeconvertandroid420toabgr == nativeconvertandroid420toabgr5) {
                    UtilsKt.RemoteActionCompatParcelizer("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", (nativeconvertandroid420toabgr != null && nativeconvertandroid420toabgr.holdsCameraSlot()) || nativeconvertandroid420toabgr4 == nativeconvertandroid420toabgr5);
                }
                if (nativeconvertandroid420toabgr4 != nativeconvertandroid420toabgr) {
                    nativeWriteJpegToSurface.read(this, nativeconvertandroid420toabgr);
                    nativewritejpegtosurface.serializer();
                }
                nativeconvertandroid420toabgr2 = nativeconvertandroid420toabgr4;
            }
            if (nativeconvertandroid420toabgr2 != nativeconvertandroid420toabgr) {
                if (nativewritejpegtosurface.read.IconCompatParcelizer() == 2 && nativeconvertandroid420toabgr == nativeConvertAndroid420ToABGR.CONFIGURED) {
                    String strIconCompatParcelizer = nativewritejpegtosurface.read.IconCompatParcelizer(MediaMetadataCompat().read());
                    if (strIconCompatParcelizer != null) {
                        nativenewdirectbytebufferWrite = nativewritejpegtosurface.write(strIconCompatParcelizer);
                    } else {
                        nativenewdirectbytebufferWrite = null;
                    }
                } else {
                    nativenewdirectbytebufferWrite = null;
                }
                if (i < 1 && nativewritejpegtosurface.IconCompatParcelizer > 0) {
                    map2 = new HashMap();
                    for (Map.Entry entry : nativewritejpegtosurface.serializer.entrySet()) {
                        if (((nativeNewDirectByteBuffer) entry.getValue()).write == nativeConvertAndroid420ToABGR.PENDING_OPEN) {
                            map2.put((getContentInsetStart) entry.getKey(), (nativeNewDirectByteBuffer) entry.getValue());
                        }
                    }
                } else if (nativeconvertandroid420toabgr == nativeConvertAndroid420ToABGR.PENDING_OPEN && nativewritejpegtosurface.IconCompatParcelizer > 0) {
                    map2 = new HashMap();
                    map2.put(this, (nativeNewDirectByteBuffer) nativewritejpegtosurface.serializer.get(this));
                }
                if (map2 != null && !z) {
                    map2.remove(this);
                }
                if (map2 != null) {
                    for (nativeNewDirectByteBuffer nativenewdirectbytebuffer3 : map2.values()) {
                        nativenewdirectbytebuffer3.getClass();
                        try {
                            nativenewdirectbytebuffer3.serializer.execute(new Preview$$ExternalSyntheticLambda0(14, nativenewdirectbytebuffer3.read));
                        } catch (RejectedExecutionException e) {
                            setInflatedId.read("CameraStateRegistry", "Unable to notify camera to open.", e);
                        }
                    }
                }
                if (nativenewdirectbytebufferWrite != null) {
                    try {
                        nativenewdirectbytebufferWrite.serializer.execute(new Preview$$ExternalSyntheticLambda0(15, nativenewdirectbytebufferWrite.IconCompatParcelizer));
                    } catch (RejectedExecutionException e2) {
                        setInflatedId.read("CameraStateRegistry", "Unable to notify camera to configure.", e2);
                    }
                }
            }
        }
        ((AndroidGraphicsContext2) this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaSessionCompatQueueItem).serializer(new toString(nativeconvertandroid420toabgr));
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(nativeconvertandroid420toabgr, toolbar);
    }

    public final boolean serializer(BlockRunner blockRunner) {
        int i;
        int i2;
        blockRunner.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
            i = 0;
            i2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer() == 2 ? 1 : 0;
        }
        NetworkHeaders$Builder networkHeaders$Builder = this.addObserverForBackInvoker;
        networkHeaders$Builder.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : networkHeaders$Builder.serializer.entrySet()) {
            if (((SurfaceOrderQuirk) entry.getValue()).serializer) {
                arrayList2.add((SurfaceOrderQuirk) entry.getValue());
            }
        }
        for (SurfaceOrderQuirk surfaceOrderQuirk : Collections.unmodifiableCollection(arrayList2)) {
            List list = surfaceOrderQuirk.read;
            if (list == null || list.get(i) != VideoCapture.METERING_REPEATING) {
                if (surfaceOrderQuirk.write != null && surfaceOrderQuirk.read != null) {
                    mapToBase maptobase = surfaceOrderQuirk.IconCompatParcelizer;
                    ImageUtilCodecFailedException imageUtilCodecFailedException = surfaceOrderQuirk.MediaMetadataCompat;
                    for (PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0 : maptobase.RemoteActionCompatParcelizer()) {
                        SupportedSurfaceCombination supportedSurfaceCombination = this._init_lambda2;
                        int iRemoteActionCompatParcelizer = imageUtilCodecFailedException.RemoteActionCompatParcelizer();
                        Size size = previewExternalSyntheticLambda0.PlaybackStateCompatCustomAction;
                        AeFpsRangeQuirk aeFpsRangeQuirkRatingCompat = imageUtilCodecFailedException.RatingCompat();
                        TemporalNoiseQuirk temporalNoiseQuirkSerializer = supportedSurfaceCombination.serializer(iRemoteActionCompatParcelizer);
                        CaptureFailedRetryQuirk captureFailedRetryQuirk = CaptureFailedRetryQuirk.CAPTURE_SESSION_TABLES;
                        AeFpsRangeQuirk aeFpsRangeQuirk = ImageCaptureRotationOptionQuirk.IconCompatParcelizer;
                        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirkRemoteActionCompatParcelizer = StringKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, size, temporalNoiseQuirkSerializer, i2, captureFailedRetryQuirk, aeFpsRangeQuirkRatingCompat);
                        int iRemoteActionCompatParcelizer2 = imageUtilCodecFailedException.RemoteActionCompatParcelizer();
                        Size size2 = previewExternalSyntheticLambda0.PlaybackStateCompatCustomAction;
                        SmallDisplaySizeQuirk smallDisplaySizeQuirk = surfaceOrderQuirk.write;
                        getNavigationIcon getnavigationicon = smallDisplaySizeQuirk.read;
                        List list2 = surfaceOrderQuirk.read;
                        InitializationException initializationException = smallDisplaySizeQuirk.serializer;
                        int i3 = smallDisplaySizeQuirk.MediaDescriptionCompat;
                        Range range = smallDisplaySizeQuirk.IconCompatParcelizer;
                        Boolean bool = (Boolean) imageUtilCodecFailedException.read(ImageUtilCodecFailedException.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, Boolean.FALSE);
                        Objects.requireNonNull(bool);
                        arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk(imageCaptureRotationOptionQuirkRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, size2, getnavigationicon, list2, initializationException, i3, range, bool.booleanValue()));
                        i = 0;
                    }
                } else {
                    setInflatedId.read("Camera2CameraImpl", "Invalid stream spec or capture types in " + surfaceOrderQuirk);
                    return true;
                }
            }
        }
        HashMap map = new HashMap();
        map.put((getSearchViewTextMinWidthDp) blockRunner.RatingCompat, Collections.singletonList((Size) blockRunner.write));
        try {
            this._init_lambda2.serializer(i2, arrayList, map, false, false, false);
            write("Surface combination with metering repeating supported!");
            getTitleMarginBottom gettitlemarginbottom = this.ParcelableVolumeInfo;
            return (gettitlemarginbottom == null || ((Boolean) gettitlemarginbottom.PlaybackStateCompatCustomAction.read(getTitleMarginBottom.MediaSessionCompatQueueItem, Boolean.TRUE)).booleanValue()) ? false : true;
        } catch (IllegalArgumentException unused) {
            write("Surface combination with metering repeating  not supported!");
            return true;
        }
    }

    public final void write(boolean z) throws Throwable {
        if (!z) {
            this._init_lambda3.serializer.write = -1L;
        }
        this._init_lambda3.RemoteActionCompatParcelizer();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read();
        write("Opening camera.");
        read(setTextFuture.OPENING);
        try {
            this.RatingCompat.serializer.write(this.MediaDescriptionCompat.MediaDescriptionCompat, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, serializer());
        } catch (CameraAccessExceptionCompat e) {
            write("Unable to open camera due to " + e.getMessage());
            if (e.read == 10001) {
                serializer(setTextFuture.INITIALIZED, new Toolbar(7, e), true);
                return;
            }
            i$d i_d = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            setTextFuture settextfuture = ((Camera2CameraImpl) i_d.read)._init_lambda1;
            setTextFuture settextfuture2 = setTextFuture.OPENING;
            Camera2CameraImpl camera2CameraImpl = (Camera2CameraImpl) i_d.read;
            if (settextfuture != settextfuture2) {
                camera2CameraImpl.write("Don't need the onError timeout handler.");
                return;
            }
            camera2CameraImpl.write("Camera waiting for onError.");
            i_d.read();
            i_d.serializer = new NavArgsLazy(i_d);
        } catch (SecurityException e2) {
            write("Unable to open camera due to " + e2.getMessage());
            read(setTextFuture.REOPENING);
            this._init_lambda3.IconCompatParcelizer();
        } catch (RuntimeException unused) {
            write("Unexpected error occurred when opening camera.");
            serializer(setTextFuture.OPENING_WITH_ERROR, new Toolbar(6, null), true);
        }
    }

    public final void write(String str) {
        toString();
        setInflatedId.IconCompatParcelizer(3, "Camera2CameraImpl");
    }

    @Override // o.Camera2CapturePipelineScreenFlashTask
    public final void RemoteActionCompatParcelizer(UseCase useCase) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.execute(new CameraX$$ExternalSyntheticLambda2(this, 6, write(useCase)));
    }

    public final void PlaybackStateCompatCustomAction() throws Throwable {
        mapToBase maptobase;
        List listUnmodifiableList;
        int i = 1;
        UtilsKt.RemoteActionCompatParcelizer((String) null, this.PlaybackStateCompat != null);
        write("Resetting Capture Session");
        setBaselineAligned setbaselinealigned = this.PlaybackStateCompat;
        synchronized (setbaselinealigned.MediaSessionCompatResultReceiverWrapper) {
            maptobase = setbaselinealigned.PlaybackStateCompat;
        }
        synchronized (setbaselinealigned.MediaSessionCompatResultReceiverWrapper) {
            listUnmodifiableList = Collections.unmodifiableList(setbaselinealigned.write);
        }
        setBaselineAligned setbaselinealignedRatingCompat = RatingCompat();
        this.PlaybackStateCompat = setbaselinealignedRatingCompat;
        setbaselinealignedRatingCompat.IconCompatParcelizer(maptobase);
        this.PlaybackStateCompat.IconCompatParcelizer(listUnmodifiableList);
        if (this._init_lambda1.ordinal() != 9) {
            write("Skipping Capture Session state check due to current camera state: " + this._init_lambda1 + " and previous session status: " + setbaselinealigned.IconCompatParcelizer());
        } else if (this.accessensureViewModelStore && setbaselinealigned.IconCompatParcelizer()) {
            write("Close camera before creating new session");
            read(setTextFuture.REOPENING_QUIRK);
        }
        if (this.MediaSessionCompatResultReceiverWrapper && setbaselinealigned.IconCompatParcelizer()) {
            write("ConfigAndClose is required when close the camera.");
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = true;
        }
        setbaselinealigned.serializer();
        DrawModifierNodeKt drawModifierNodeKt = setbaselinealigned.read();
        write("Releasing session in state " + this._init_lambda1.name());
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.put(setbaselinealigned, drawModifierNodeKt);
        drawModifierNodeKt.RemoteActionCompatParcelizer(new zza(drawModifierNodeKt, i, new colorResource(this, 2, setbaselinealigned)), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
    }

    public Camera2CameraImpl(Context context, CameraManagerCompat cameraManagerCompat, String str, setLineHeight setlineheight, Camera2CameraCoordinator camera2CameraCoordinator, nativeWriteJpegToSurface nativewritejpegtosurface, Executor executor, Handler handler, DisplayInfoManager displayInfoManager, long j, getTitleMarginBottom gettitlemarginbottom) throws CameraUnavailableException {
        NavArgsLazy navArgsLazy = new NavArgsLazy(6);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = navArgsLazy;
        this.MediaBrowserCompatMediaItem = 0;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new AtomicInteger(0);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new LinkedHashMap();
        this._init_lambda4 = 0;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = false;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = false;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new HashSet();
        this.serializer = CameraXExternalSyntheticLambda2.write;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new Object();
        this.ComponentActivity = false;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new i$d(this);
        this.RatingCompat = cameraManagerCompat;
        this.RemoteActionCompatParcelizer = camera2CameraCoordinator;
        this.MediaSessionCompatQueueItem = nativewritejpegtosurface;
        ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk = new ReportedVideoQualityNotSupportedQuirk(handler);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = reportedVideoQualityNotSupportedQuirk;
        PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = new PreviewFreezeAfterHighSpeedRecordingQuirk(executor);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = previewFreezeAfterHighSpeedRecordingQuirk;
        this._init_lambda3 = new setTextMetricsParamsCompat(this, previewFreezeAfterHighSpeedRecordingQuirk, reportedVideoQualityNotSupportedQuirk, j);
        this.addObserverForBackInvoker = new NetworkHeaders$Builder(str);
        ((AndroidGraphicsContext2) navArgsLazy.MediaSessionCompatQueueItem).serializer(new toString(nativeConvertAndroid420ToABGR.CLOSED));
        accessgetGreencp accessgetgreencp = new accessgetGreencp(nativewritejpegtosurface);
        this.MediaMetadataCompat = accessgetgreencp;
        BlockRunner blockRunner = new BlockRunner();
        blockRunner.serializer = new Object();
        blockRunner.RatingCompat = new LinkedHashSet();
        blockRunner.write = new LinkedHashSet();
        blockRunner.RemoteActionCompatParcelizer = new LinkedHashSet();
        blockRunner.IconCompatParcelizer = new setDividerPadding(blockRunner);
        blockRunner.read = previewFreezeAfterHighSpeedRecordingQuirk;
        this.MediaSessionCompatToken = blockRunner;
        this.ResultReceiver = displayInfoManager;
        this.ParcelableVolumeInfo = gettitlemarginbottom;
        try {
            getThumbTintList getthumbtintlistSerializer = cameraManagerCompat.serializer(str);
            Camera2CameraControlImpl camera2CameraControlImpl = new Camera2CameraControlImpl(getthumbtintlistSerializer, reportedVideoQualityNotSupportedQuirk, previewFreezeAfterHighSpeedRecordingQuirk, new setTextSize(this), setlineheight.MediaBrowserCompatMediaItem);
            this.read = camera2CameraControlImpl;
            this.MediaDescriptionCompat = setlineheight;
            setlineheight.read(camera2CameraControlImpl);
            setlineheight.MediaSessionCompatQueueItem.serializer((AndroidGraphicsContext2) accessgetgreencp.write);
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getTrackTintList.serializer(getthumbtintlistSerializer);
            this.PlaybackStateCompat = RatingCompat();
            this.PlaybackStateCompatCustomAction = new BlockRunner(previewFreezeAfterHighSpeedRecordingQuirk, reportedVideoQualityNotSupportedQuirk, handler, blockRunner, setlineheight.MediaBrowserCompatMediaItem, setThumbTintList.RemoteActionCompatParcelizer);
            u$a u_a = setlineheight.MediaBrowserCompatMediaItem;
            this.accessensureViewModelStore = u_a.RemoteActionCompatParcelizer(androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk.class) || u_a.RemoteActionCompatParcelizer(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
            this.MediaSessionCompatResultReceiverWrapper = setlineheight.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(LegacyCameraSurfaceCleanupQuirk.class);
            setCompoundDrawablesWithIntrinsicBounds setcompounddrawableswithintrinsicbounds = new setCompoundDrawablesWithIntrinsicBounds(this, str);
            this.IconCompatParcelizer = setcompounddrawableswithintrinsicbounds;
            setTextSize settextsize = new setTextSize(this);
            synchronized (nativewritejpegtosurface.write) {
                UtilsKt.RemoteActionCompatParcelizer("Camera is already registered: " + this, !nativewritejpegtosurface.serializer.containsKey(this));
                nativewritejpegtosurface.serializer.put(this, new nativeNewDirectByteBuffer(previewFreezeAfterHighSpeedRecordingQuirk, settextsize, setcompounddrawableswithintrinsicbounds));
            }
            ((CameraManager) cameraManagerCompat.serializer.MediaSessionCompatQueueItem).registerAvailabilityCallback(previewFreezeAfterHighSpeedRecordingQuirk, setcompounddrawableswithintrinsicbounds);
            this._init_lambda2 = new SupportedSurfaceCombination(context, str, cameraManagerCompat, new toContentCaptureSession(2), onReadoutStarted.MediaMetadataCompat);
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public static String RemoteActionCompatParcelizer(int i) {
        if (i == 0) {
            return "ERROR_NONE";
        }
        if (i == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i == 4) {
            return "ERROR_CAMERA_DEVICE";
        }
        if (i != 5) {
            return "UNKNOWN ERROR";
        }
        return "ERROR_CAMERA_SERVICE";
    }

    public final void read(setTextFuture settextfuture) throws Throwable {
        serializer(settextfuture, null, true);
    }
}
