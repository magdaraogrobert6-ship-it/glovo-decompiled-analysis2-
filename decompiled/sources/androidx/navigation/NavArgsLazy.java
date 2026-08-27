package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import android.view.Choreographer;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.utils.InterruptedRuntimeException;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$3;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import androidx.camera.view.PendingValue;
import androidx.compose.foundation.pager.MeasuredPage;
import androidx.compose.foundation.pager.PagerMeasureResult;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import coil3.util.UtilsKt;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.request.SingleRequest;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.android.gms.stats.zza;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.android.SystemUtils;
import com.sentiance.core.model.thrift.k$c;
import com.sentiance.okhttp3.u$a;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import o.AbstractClickableNodehandlePressInteractionStart11;
import o.Adaptation;
import o.AndroidColorSpace_androidKt;
import o.AndroidGraphicsContext2;
import o.AudioEncoderIgnoresInputTimestampQuirk;
import o.AudioTimestampFramePositionIncorrectQuirk;
import o.BlockDropShadowElement;
import o.C0173graphicsLayer;
import o.CameraValidatorCameraIdListIncorrectException;
import o.CardView1;
import o.Crossfade;
import o.DeferrableSurfaceSurfaceUnavailableException;
import o.DrawModifierNodeKt;
import o.DrawScopeMarker;
import o.DropShadowScope;
import o.DropShadowScopeDefaultImpls;
import o.EncoderImplMediaCodecCallback;
import o.FocusMeteringAction;
import o.ImageCapture1;
import o.ImageKt;
import o.ImageUtilCodecFailedException;
import o.JpegCaptureDownsizingQuirk;
import o.Keysiterator1;
import o.MediaStoreVideoCannotWrite;
import o.PathOperationCompanion;
import o.PrematureEndOfStreamVideoQuirk;
import o.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.PreviewOrientationIncorrectQuirk;
import o.PreviewView1ExternalSyntheticLambda2;
import o.RecomposerrunRecomposeAndApplyChanges2;
import o.RepeatingStreamConstraintForVideoRecordingQuirk;
import o.SizeCannotEncodeVideoQuirk;
import o.SmallDisplaySizeQuirk;
import o.StillCaptureFlashStopRepeatingQuirk;
import o.SurfaceRequest;
import o.SurfaceViewStretchedQuirk;
import o.TransitionKtrememberTransitionlambda10inlinedonDispose1;
import o.VideoEncoderCrashQuirk;
import o.VideoQualityQuirk;
import o.ViewRootForInspectorDefaultImpls;
import o.accessgetMaxp;
import o.accessisSrgb;
import o.accessnoLocalProvidedFor;
import o.accessrecordJVtK1S4jd;
import o.accessregisterComponentCallback;
import o.accesstoDpSizekrfVVMjd;
import o.accesstoRectjd;
import o.addPathUv8p0NA;
import o.area;
import o.compare;
import o.component160d7_KjU;
import o.connectYBCOT_4default;
import o.detectDragGestures;
import o.getAdd0d7_KjU;
import o.getBrightness;
import o.getBundleFromUrl;
import o.getContentInsetEndWithActions;
import o.getCurrentContentInsetRight;
import o.getCurrentContentInsetStart;
import o.getExponentimpl;
import o.getF;
import o.getImageFormatdefault;
import o.getNavigationIcon;
import o.getScaleType;
import o.graphicsLayer2Xn7asIdefault;
import o.holdsCameraSlot;
import o.inflate;
import o.invalidateFocusProperties;
import o.obtainShadowContext;
import o.onContentCardDismissed;
import o.onDrawWithContent;
import o.onRemeasuredozmzZPI;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.removeNodeAtDepth;
import o.resizeToBitmapDimensionslambda3;
import o.setBrightness;
import o.setController;
import o.setInflatedId;
import o.setInitialAnimationsanimation_core;
import o.setMaxCardElevation;
import o.setPrecomputedText;
import o.setScreenFlashWindow;
import o.setThumbTintList;
import o.setUseCompatPadding;
import o.shutdown;
import o.snapTo;
import o.toImageConfig;
import o.updateInitialValuesanimation_core;
import o.updateSizeuvyYCjkfoundation;
import o.updateTargetanimation_core;
import o.validateRectangle;
import okio.Options;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class NavArgsLazy implements DeferrableSurfaceSurfaceUnavailableException, obtainShadowContext, VideoEncoderCrashQuirk, shutdown, BlockDropShadowElement, onViewDetachedFromWindowlambda1, accessrecordJVtK1S4jd {
    public static NavArgsLazy RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer;
    public Object MediaSessionCompatQueueItem;
    public Object RatingCompat;
    public Object read;

    @Override // o.accessrecordJVtK1S4jd
    public void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
    }

    public NavArgsLazy(List list) {
        this.IconCompatParcelizer = 25;
        this.RatingCompat = list;
        this.MediaSessionCompatQueueItem = new ArrayList(list.size());
        this.read = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.MediaSessionCompatQueueItem).add(new Adaptation((List) ((connectYBCOT_4default) list.get(i)).IconCompatParcelizer.RatingCompat));
            ((ArrayList) this.read).add(((connectYBCOT_4default) list.get(i)).read.write());
        }
    }

    public static HashMap IconCompatParcelizer(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = RemoteActionCompatParcelizer(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (AudioTimestampFramePositionIncorrectQuirk.serializer(size, rational, setController.MediaMetadataCompat)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static ArrayList RemoteActionCompatParcelizer(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer);
        arrayList2.add(AudioTimestampFramePositionIncorrectQuirk.write);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                } while (!AudioTimestampFramePositionIncorrectQuirk.serializer(size, (Rational) it2.next(), setController.MediaMetadataCompat));
            }
        }
        return arrayList2;
    }

    public static void serializer(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            } else {
                arrayList.add(0, size3);
            }
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void write(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public float IconCompatParcelizer(DropShadowScope dropShadowScope) {
        HashMap map = (HashMap) this.MediaSessionCompatQueueItem;
        HashMap map2 = (HashMap) this.read;
        if (!(dropShadowScope instanceof accesstoDpSizekrfVVMjd)) {
            if (dropShadowScope instanceof accesstoRectjd) {
                return ((accesstoRectjd) dropShadowScope).IconCompatParcelizer();
            }
            return 0.0f;
        }
        String strWrite = ((accesstoDpSizekrfVVMjd) dropShadowScope).write();
        if (map2.containsKey(strWrite)) {
            return ((DropShadowScopeDefaultImpls) map2.get(strWrite)).serializer();
        }
        if (map.containsKey(strWrite)) {
            return ((Integer) map.get(strWrite)).floatValue();
        }
        return 0.0f;
    }

    public PagerMeasureResult MediaBrowserCompatMediaItem() {
        PagerMeasureResult pagerMeasureResult = (PagerMeasureResult) this.read;
        if (pagerMeasureResult != null) {
            return pagerMeasureResult;
        }
        removeNodeAtDepth.serializer("layoutInfo");
        throw null;
    }

    @Override // o.onViewDetachedFromWindowlambda1
    public boolean MediaSessionCompatToken() {
        return ((addPathUv8p0NA) this.RatingCompat) != null;
    }

    @Override // o.onViewDetachedFromWindowlambda1
    /* JADX INFO: renamed from: ParcelableVolumeInfo, reason: merged with bridge method [inline-methods] */
    public addPathUv8p0NA MediaSessionCompatResultReceiverWrapper() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk = (r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) this.MediaSessionCompatQueueItem;
        addPathUv8p0NA addpathuv8p0na = (addPathUv8p0NA) this.RatingCompat;
        if (addpathuv8p0na != null) {
            return addpathuv8p0na;
        }
        Bundle bundle = (Bundle) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read).invoke();
        ImageKt imageKt = validateRectangle.RemoteActionCompatParcelizer;
        Method method = (Method) imageKt.get(r8lambdaucgighn8fiyv_vccodeafjfpedk);
        if (method == null) {
            method = Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk).getMethod("fromBundle", (Class[]) Arrays.copyOf(validateRectangle.serializer, 1));
            imageKt.put(r8lambdaucgighn8fiyv_vccodeafjfpedk, method);
            method.getClass();
        }
        Object objInvoke = method.invoke(null, bundle);
        objInvoke.getClass();
        addPathUv8p0NA addpathuv8p0na2 = (addPathUv8p0NA) objInvoke;
        this.RatingCompat = addpathuv8p0na2;
        return addpathuv8p0na2;
    }

    @Override // o.accessrecordJVtK1S4jd
    public boolean PlaybackStateCompat() {
        List list = (List) this.read;
        ByteBuffer byteBufferWrite = DrawScopeMarker.write((ByteBuffer) this.MediaSessionCompatQueueItem);
        getF getf = (getF) this.RatingCompat;
        if (byteBufferWrite != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    boolean z = ((accessgetMaxp) list.get(i)).read(byteBufferWrite, getf);
                    if (z) {
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    public int PlaybackStateCompatCustomAction() {
        return ((Number) ((RecomposerrunRecomposeAndApplyChanges2) this.MediaSessionCompatQueueItem).invoke()).intValue();
    }

    @Override // o.accessrecordJVtK1S4jd
    public ImageHeaderParser$ImageType RatingCompat() {
        return resizeToBitmapDimensionslambda3.write((List) this.read, DrawScopeMarker.write((ByteBuffer) this.MediaSessionCompatQueueItem));
    }

    @Override // o.accessrecordJVtK1S4jd
    public Bitmap RemoteActionCompatParcelizer(BitmapFactory.Options options) {
        return invalidateFocusProperties.IconCompatParcelizer(new PathOperationCompanion(DrawScopeMarker.write((ByteBuffer) this.MediaSessionCompatQueueItem)), options, this);
    }

    public SurfaceRequest RemoteActionCompatParcelizer(int i) {
        shutdown shutdownVar = (shutdown) this.MediaSessionCompatQueueItem;
        HashMap map = (HashMap) this.RatingCompat;
        if (map.containsKey(Integer.valueOf(i))) {
            return (SurfaceRequest) map.get(Integer.valueOf(i));
        }
        PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirkSerializer = null;
        if (shutdownVar.serializer(i)) {
            SurfaceRequest surfaceRequestWrite = shutdownVar.write(i);
            getNavigationIcon getnavigationicon = (getNavigationIcon) this.read;
            if (surfaceRequestWrite != null) {
                ArrayList arrayList = new ArrayList();
                for (PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk : surfaceRequestWrite.RemoteActionCompatParcelizer()) {
                    if (updateTargetanimation_core.read(previewDelayWhenVideoCaptureIsBoundQuirk, getnavigationicon)) {
                        arrayList.add(previewDelayWhenVideoCaptureIsBoundQuirk);
                    }
                }
                if (!arrayList.isEmpty()) {
                    previewOrientationIncorrectQuirkSerializer = PreviewOrientationIncorrectQuirk.serializer(surfaceRequestWrite.write(), surfaceRequestWrite.IconCompatParcelizer(), surfaceRequestWrite.read(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), previewOrientationIncorrectQuirkSerializer);
        }
        return previewOrientationIncorrectQuirkSerializer;
    }

    public void RemoteActionCompatParcelizer(Activity activity, component160d7_KjU component160d7_kju) {
        WeakHashMap weakHashMap = (WeakHashMap) this.RatingCompat;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.read;
        reentrantLock.lock();
        try {
            if (component160d7_kju.equals((component160d7_KjU) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((C0173graphicsLayer) ((getExponentimpl) this.MediaSessionCompatQueueItem).read).read.iterator();
            it.getClass();
            while (it.hasNext()) {
                graphicsLayer2Xn7asIdefault graphicslayer2xn7asidefault = (graphicsLayer2Xn7asIdefault) it.next();
                if (graphicslayer2xn7asidefault.serializer.equals(activity)) {
                    graphicslayer2xn7asidefault.RemoteActionCompatParcelizer = component160d7_kju;
                    graphicslayer2xn7asidefault.write.accept(component160d7_kju);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void RemoteActionCompatParcelizer(AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        toImageConfig toimageconfig = (toImageConfig) this.RatingCompat;
        if (toimageconfig != null) {
            toimageconfig.run();
        }
        toImageConfig toimageconfig2 = new toImageConfig((accessregisterComponentCallback) this.MediaSessionCompatQueueItem, androidColorSpace_androidKt);
        this.RatingCompat = toimageconfig2;
        ((Handler) this.read).postAtFrontOfQueue(toimageconfig2);
    }

    public void ResultReceiver() {
        onRemeasuredozmzZPI onremeasuredozmzzpi = (onRemeasuredozmzZPI) this.MediaSessionCompatQueueItem;
        String str = (String) this.RatingCompat;
        List list = (List) onremeasuredozmzzpi.IconCompatParcelizer(str);
        if (list != null) {
            list.remove((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        onremeasuredozmzzpi.write(str, list);
    }

    public void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        ((PreviewView1ExternalSyntheticLambda2) this.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer();
        PrematureEndOfStreamVideoQuirk.write(new Preview$$ExternalSyntheticLambda0(19, this));
    }

    @Override // o.accessrecordJVtK1S4jd
    public int serializer() {
        List list = (List) this.read;
        ByteBuffer byteBufferWrite = DrawScopeMarker.write((ByteBuffer) this.MediaSessionCompatQueueItem);
        getF getf = (getF) this.RatingCompat;
        if (byteBufferWrite != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    int iWrite = ((accessgetMaxp) list.get(i)).write(byteBufferWrite, getf);
                    if (iWrite != -1) {
                        return iWrite;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:60:0x014c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0152  */
    /* JADX WARN: Code duplicated, block: B:65:0x0160  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x0196  */
    /* JADX WARN: Code duplicated, block: B:77:0x019b  */
    /* JADX WARN: Code duplicated, block: B:79:0x019f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3 A[LOOP:2: B:82:0x01ad->B:84:0x01b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x0207  */
    public ArrayList serializer(ImageUtilCodecFailedException imageUtilCodecFailedException) {
        Size[] sizeArr;
        Size size;
        Size size2;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk;
        Size sizeSerializer;
        Rational rationalRemoteActionCompatParcelizer;
        Iterator it;
        Rational rational;
        ArrayList arrayList;
        HashMap mapIconCompatParcelizer;
        Iterator it2;
        Iterator it3;
        FocusMeteringAction focusMeteringAction = (FocusMeteringAction) this.MediaSessionCompatQueueItem;
        getImageFormatdefault getimageformatdefault = (getImageFormatdefault) imageUtilCodecFailedException;
        List list = (List) getimageformatdefault.read(getImageFormatdefault.d_, null);
        ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
        if (arrayList2 != null) {
            return arrayList2;
        }
        setUseCompatPadding setusecompatpadding = (setUseCompatPadding) getimageformatdefault.read(getImageFormatdefault.h_, null);
        List list2 = (List) getimageformatdefault.read(getImageFormatdefault.i_, null);
        int iRemoteActionCompatParcelizer = imageUtilCodecFailedException.RemoteActionCompatParcelizer();
        if (list2 == null) {
            sizeArr = null;
            break;
        }
        Iterator it4 = list2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair pair = (Pair) it4.next();
            if (((Integer) pair.first).intValue() == iRemoteActionCompatParcelizer) {
                sizeArr = (Size[]) pair.second;
                break;
            }
        }
        List listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (listAsList == null) {
            listAsList = focusMeteringAction.serializer(iRemoteActionCompatParcelizer);
        }
        ArrayList arrayList3 = new ArrayList(listAsList);
        Collections.sort(arrayList3, new AudioEncoderIgnoresInputTimestampQuirk(true));
        if (arrayList3.isEmpty()) {
            setInflatedId.read("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + iRemoteActionCompatParcelizer + ".");
        }
        if (setusecompatpadding != null) {
            Size size3 = (Size) getimageformatdefault.read(getImageFormatdefault.f_, null);
            getimageformatdefault.write(0);
            if (!((Boolean) imageUtilCodecFailedException.read(ImageUtilCodecFailedException.ResultReceiver, Boolean.FALSE)).booleanValue()) {
                imageUtilCodecFailedException.RemoteActionCompatParcelizer();
            }
            imageUtilCodecFailedException.toString();
            arrayList3.toString();
            setInflatedId.IconCompatParcelizer(3, "SupportedOutputSizesCollector");
            setUseCompatPadding setusecompatpadding2 = (setUseCompatPadding) getimageformatdefault.write(getImageFormatdefault.h_);
            Rational rational2 = (Rational) this.read;
            Keysiterator1 keysiterator1 = setusecompatpadding2.RemoteActionCompatParcelizer;
            HashMap mapIconCompatParcelizer2 = IconCompatParcelizer(arrayList3);
            Rational rationalRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(keysiterator1.write, rational2 == null || rational2.getNumerator() >= rational2.getDenominator());
            ArrayList<Rational> arrayList4 = new ArrayList(mapIconCompatParcelizer2.keySet());
            Collections.sort(arrayList4, new accessnoLocalProvidedFor(rationalRemoteActionCompatParcelizer2, rational2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Rational rational3 : arrayList4) {
                linkedHashMap.put(rational3, (List) mapIconCompatParcelizer2.get(rational3));
            }
            if (size3 != null) {
                Size size4 = setController.MediaDescriptionCompat;
                int width = size3.getWidth();
                int height = size3.getHeight();
                Iterator it5 = linkedHashMap.keySet().iterator();
                while (it5.hasNext()) {
                    List<Size> list3 = (List) linkedHashMap.get((Rational) it5.next());
                    ArrayList arrayList5 = new ArrayList();
                    for (Size size5 : list3) {
                        if (setController.write(size5) <= height * width) {
                            arrayList5.add(size5);
                        }
                    }
                    list3.clear();
                    list3.addAll(arrayList5);
                }
            }
            CardView1 cardView1 = setusecompatpadding2.IconCompatParcelizer;
            if (cardView1 != null) {
                Iterator it6 = linkedHashMap.keySet().iterator();
                while (it6.hasNext()) {
                    List list4 = (List) linkedHashMap.get((Rational) it6.next());
                    if (!list4.isEmpty()) {
                        int i = cardView1.serializer;
                        if (cardView1 != CardView1.read) {
                            Size size6 = cardView1.RemoteActionCompatParcelizer;
                            if (i == 0) {
                                boolean zContains = list4.contains(size6);
                                list4.clear();
                                if (zContains) {
                                    list4.add(size6);
                                }
                            } else if (i == 1) {
                                serializer(list4, size6, true);
                            } else if (i == 2) {
                                serializer(list4, size6, false);
                            } else if (i == 3) {
                                write(list4, size6, true);
                            } else if (i == 4) {
                                write(list4, size6, false);
                            }
                        }
                    }
                }
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it7 = linkedHashMap.values().iterator();
            while (it7.hasNext()) {
                for (Size size7 : (List) it7.next()) {
                    if (!arrayList6.contains(size7)) {
                        arrayList6.add(size7);
                    }
                }
            }
            return arrayList6;
        }
        getScaleType getscaletype = (getScaleType) this.RatingCompat;
        getscaletype.getClass();
        if (arrayList3.isEmpty()) {
            return arrayList3;
        }
        ArrayList<Size> arrayList7 = new ArrayList(arrayList3);
        Collections.sort(arrayList7, new AudioEncoderIgnoresInputTimestampQuirk(true));
        ArrayList arrayList8 = new ArrayList();
        Size size8 = (Size) getimageformatdefault.read(getImageFormatdefault.f_, null);
        Size size9 = (Size) arrayList7.get(0);
        if (size8 == null) {
            size = size9;
        } else if (setController.write(size9) < size8.getHeight() * size8.getWidth()) {
            size = size9;
        } else {
            size = size8;
        }
        Size sizeSerializer2 = getscaletype.serializer(getimageformatdefault);
        Size size10 = setController.MediaMetadataCompat;
        int iWrite = setController.write(size10);
        if (setController.write(size) >= iWrite) {
            if (sizeSerializer2 != null) {
                if (sizeSerializer2.getHeight() * sizeSerializer2.getWidth() < iWrite) {
                    size2 = sizeSerializer2;
                }
            }
            for (Size size11 : arrayList7) {
                if (setController.write(size11) <= size.getHeight() * size.getWidth()) {
                    if (size11.getHeight() * size11.getWidth() < setController.write(size2) && !arrayList8.contains(size11)) {
                        arrayList8.add(size11);
                    }
                }
            }
            if (!arrayList8.isEmpty()) {
                FieldType$$ExternalSyntheticBUOutline0.serializer("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = ", size2, "\nmaxSize = ", size, "\ninitial size list: ", arrayList7);
                return null;
            }
            jpegCaptureDownsizingQuirk = getImageFormatdefault.j_;
            if (getimageformatdefault.read(jpegCaptureDownsizingQuirk)) {
                rationalRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(((Integer) getimageformatdefault.write(jpegCaptureDownsizingQuirk)).intValue(), getscaletype.RemoteActionCompatParcelizer);
            } else {
                sizeSerializer = getscaletype.serializer(getimageformatdefault);
                if (sizeSerializer != null) {
                    it = RemoteActionCompatParcelizer(arrayList8).iterator();
                    do {
                        if (it.hasNext()) {
                            rational = new Rational(sizeSerializer.getWidth(), sizeSerializer.getHeight());
                            break;
                        }
                        rational = (Rational) it.next();
                    } while (!AudioTimestampFramePositionIncorrectQuirk.serializer(sizeSerializer, rational, setController.MediaMetadataCompat));
                    rationalRemoteActionCompatParcelizer = rational;
                } else {
                    rationalRemoteActionCompatParcelizer = null;
                }
            }
            if (sizeSerializer2 == null) {
                sizeSerializer2 = (Size) getimageformatdefault.read(getImageFormatdefault.e_, null);
            }
            arrayList = new ArrayList();
            new HashMap();
            if (rationalRemoteActionCompatParcelizer == null) {
                arrayList.addAll(arrayList8);
                if (sizeSerializer2 != null) {
                    serializer(arrayList, sizeSerializer2, true);
                    return arrayList;
                }
            } else {
                mapIconCompatParcelizer = IconCompatParcelizer(arrayList8);
                if (sizeSerializer2 != null) {
                    it3 = mapIconCompatParcelizer.keySet().iterator();
                    while (it3.hasNext()) {
                        serializer((List) mapIconCompatParcelizer.get((Rational) it3.next()), sizeSerializer2, true);
                    }
                }
                ArrayList arrayList9 = new ArrayList(mapIconCompatParcelizer.keySet());
                Collections.sort(arrayList9, new accessnoLocalProvidedFor(rationalRemoteActionCompatParcelizer, getscaletype.IconCompatParcelizer));
                it2 = arrayList9.iterator();
                while (it2.hasNext()) {
                    for (Size size12 : (List) mapIconCompatParcelizer.get((Rational) it2.next())) {
                        if (!arrayList.contains(size12)) {
                            arrayList.add(size12);
                        }
                    }
                }
            }
            return arrayList;
        }
        size10 = setController.MediaDescriptionCompat;
        size2 = size10;
        while (r4.hasNext()) {
            if (setController.write(size11) <= size.getHeight() * size.getWidth()) {
                if (size11.getHeight() * size11.getWidth() < setController.write(size2)) {
                }
            }
        }
        if (!arrayList8.isEmpty()) {
            FieldType$$ExternalSyntheticBUOutline0.serializer("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = ", size2, "\nmaxSize = ", size, "\ninitial size list: ", arrayList7);
            return null;
        }
        jpegCaptureDownsizingQuirk = getImageFormatdefault.j_;
        if (getimageformatdefault.read(jpegCaptureDownsizingQuirk)) {
            rationalRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(((Integer) getimageformatdefault.write(jpegCaptureDownsizingQuirk)).intValue(), getscaletype.RemoteActionCompatParcelizer);
        } else {
            sizeSerializer = getscaletype.serializer(getimageformatdefault);
            if (sizeSerializer != null) {
                it = RemoteActionCompatParcelizer(arrayList8).iterator();
                do {
                    if (it.hasNext()) {
                        rational = new Rational(sizeSerializer.getWidth(), sizeSerializer.getHeight());
                        break;
                    }
                    rational = (Rational) it.next();
                } while (!AudioTimestampFramePositionIncorrectQuirk.serializer(sizeSerializer, rational, setController.MediaMetadataCompat));
                rationalRemoteActionCompatParcelizer = rational;
            } else {
                rationalRemoteActionCompatParcelizer = null;
            }
        }
        if (sizeSerializer2 == null) {
            sizeSerializer2 = (Size) getimageformatdefault.read(getImageFormatdefault.e_, null);
        }
        arrayList = new ArrayList();
        new HashMap();
        if (rationalRemoteActionCompatParcelizer == null) {
            arrayList.addAll(arrayList8);
            if (sizeSerializer2 != null) {
                serializer(arrayList, sizeSerializer2, true);
                return arrayList;
            }
        } else {
            mapIconCompatParcelizer = IconCompatParcelizer(arrayList8);
            if (sizeSerializer2 != null) {
                it3 = mapIconCompatParcelizer.keySet().iterator();
                while (it3.hasNext()) {
                    serializer((List) mapIconCompatParcelizer.get((Rational) it3.next()), sizeSerializer2, true);
                }
            }
            ArrayList arrayList10 = new ArrayList(mapIconCompatParcelizer.keySet());
            Collections.sort(arrayList10, new accessnoLocalProvidedFor(rationalRemoteActionCompatParcelizer, getscaletype.IconCompatParcelizer));
            it2 = arrayList10.iterator();
            while (it2.hasNext()) {
                while (r2.hasNext()) {
                    if (!arrayList.contains(size12)) {
                        arrayList.add(size12);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public void serializer(Executor executor, CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException) {
        synchronized (((HashMap) this.read)) {
            boolean zIsEmpty = ((HashMap) this.read).isEmpty();
            ((HashMap) this.read).put(cameraValidatorCameraIdListIncorrectException, executor);
            if (zIsEmpty) {
                removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new holdsCameraSlot(this, 1));
            } else {
                executor.execute(new CameraX$$ExternalSyntheticLambda2(this, 28, cameraValidatorCameraIdListIncorrectException));
            }
        }
    }

    public DropShadowScope write() {
        Dp dp = (Dp) this.MediaSessionCompatQueueItem;
        if (dp != null) {
            return new accesstoRectjd(dp.m3687unboximpl());
        }
        String str = (String) this.read;
        if (str != null) {
            return accesstoDpSizekrfVVMjd.serializer(str);
        }
        SentryLogcatAdapter.serializer("CCL", "DimensionDescription: Null value & symbol for " + ((String) this.RatingCompat) + ". Using WrapContent.");
        return accesstoDpSizekrfVVMjd.serializer("wrap");
    }

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public void write(CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException) {
        synchronized (((HashMap) this.read)) {
            ((HashMap) this.read).remove(cameraValidatorCameraIdListIncorrectException);
            if (((HashMap) this.read).isEmpty()) {
                removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new holdsCameraSlot(this, 0));
            }
        }
    }

    @Override // o.obtainShadowContext
    public Object serializer(onDrawWithContent ondrawwithcontent) {
        ondrawwithcontent.RemoteActionCompatParcelizer(new zza(6, this), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        ((SizeCannotEncodeVideoQuirk) this.RatingCompat).IconCompatParcelizer.set(ondrawwithcontent);
        return "HandlerScheduledFuture-" + ((Callable) this.read).toString();
    }

    public static NavArgsLazy write(Context context) {
        if (RemoteActionCompatParcelizer == null) {
            Context applicationContext = context.getApplicationContext();
            RemoteActionCompatParcelizer = new NavArgsLazy(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return RemoteActionCompatParcelizer;
    }

    public boolean IconCompatParcelizer() {
        return !MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    public SurfaceRequest MediaBrowserCompatMediaItem(int i) {
        SurfaceRequest surfaceRequestSerializer;
        Size size;
        shutdown shutdownVar = (shutdown) this.MediaSessionCompatQueueItem;
        HashMap map = (HashMap) this.RatingCompat;
        if (map.containsKey(Integer.valueOf(i))) {
            return (SurfaceRequest) map.get(Integer.valueOf(i));
        }
        if (shutdownVar.serializer(i)) {
            SurfaceRequest surfaceRequestWrite = shutdownVar.write(i);
            Objects.requireNonNull(surfaceRequestWrite);
            Iterator it = ((u$a) this.read).serializer(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                        if (i == 4) {
                            size = new Size(640, 480);
                            break;
                        }
                        if (i == 5) {
                            size = new Size(960, 720);
                            break;
                        }
                        if (i == 6) {
                            size = new Size(DateTimeConstants.MINUTES_PER_DAY, 1080);
                            break;
                        }
                        break;
                    }
                }
                size = null;
                break;
            }
            if (size == null) {
                surfaceRequestSerializer = surfaceRequestWrite;
            } else {
                ArrayList arrayList = new ArrayList();
                for (PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk : surfaceRequestWrite.RemoteActionCompatParcelizer()) {
                    arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk(previewDelayWhenVideoCaptureIsBoundQuirk.read, previewDelayWhenVideoCaptureIsBoundQuirk.MediaSessionCompatQueueItem, previewDelayWhenVideoCaptureIsBoundQuirk.write, previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer, size.getWidth(), size.getHeight(), previewDelayWhenVideoCaptureIsBoundQuirk.MediaBrowserCompatMediaItem, previewDelayWhenVideoCaptureIsBoundQuirk.serializer, previewDelayWhenVideoCaptureIsBoundQuirk.IconCompatParcelizer, previewDelayWhenVideoCaptureIsBoundQuirk.RatingCompat));
                }
                if (arrayList.isEmpty()) {
                    surfaceRequestSerializer = null;
                } else {
                    surfaceRequestSerializer = PreviewOrientationIncorrectQuirk.serializer(surfaceRequestWrite.write(), surfaceRequestWrite.IconCompatParcelizer(), surfaceRequestWrite.read(), arrayList);
                }
            }
        } else {
            surfaceRequestSerializer = null;
        }
        map.put(Integer.valueOf(i), surfaceRequestSerializer);
        return surfaceRequestSerializer;
    }

    public int MediaDescriptionCompat() {
        if (MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.isEmpty()) {
            return -1;
        }
        long j = ((long) ((MeasuredPage) onContentCardDismissed.MediaDescriptionCompat(MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)).RemoteActionCompatParcelizer) + ((long) MediaBrowserCompatMediaItem().write);
        long jPlaybackStateCompatCustomAction = ((long) PlaybackStateCompatCustomAction()) - 1;
        if (j > jPlaybackStateCompatCustomAction) {
            j = jPlaybackStateCompatCustomAction;
        }
        return (int) j;
    }

    public int MediaMetadataCompat() {
        if (MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.isEmpty()) {
            return 0;
        }
        int i = ((MeasuredPage) onContentCardDismissed.read(MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)).RatingCompat + (-MediaBrowserCompatMediaItem().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        return Math.abs(i <= 0 ? i : 0);
    }

    public int MediaSessionCompatQueueItem() {
        if (MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.isEmpty()) {
            return 0;
        }
        int i = ((MeasuredPage) onContentCardDismissed.MediaDescriptionCompat(MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)).RatingCompat;
        int i2 = MediaBrowserCompatMediaItem().PlaybackStateCompatCustomAction;
        return Math.abs(((i + i2) + MediaBrowserCompatMediaItem().ComponentActivity) - MediaBrowserCompatMediaItem().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
    }

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public DrawModifierNodeKt RemoteActionCompatParcelizer() {
        return UtilsKt.RemoteActionCompatParcelizer(new StreamSharing$$ExternalSyntheticLambda0(9, this));
    }

    public ViewRootForInspectorDefaultImpls RemoteActionCompatParcelizer(setScreenFlashWindow setscreenflashwindow) {
        PrematureEndOfStreamVideoQuirk.write();
        PreviewView1ExternalSyntheticLambda2 previewView1ExternalSyntheticLambda2 = (PreviewView1ExternalSyntheticLambda2) this.MediaSessionCompatQueueItem;
        Objects.toString(previewView1ExternalSyntheticLambda2);
        setBrightness setbrightness = setscreenflashwindow.IconCompatParcelizer;
        Objects.toString(setbrightness);
        setInflatedId.IconCompatParcelizer(3, "SurfaceProcessorNode");
        List<setMaxCardElevation> list = setscreenflashwindow.read;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Objects.toString((setMaxCardElevation) it.next());
            setInflatedId.IconCompatParcelizer(3, "SurfaceProcessorNode");
        }
        this.RatingCompat = new ViewRootForInspectorDefaultImpls();
        for (setMaxCardElevation setmaxcardelevation : list) {
            ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImpls = (ViewRootForInspectorDefaultImpls) this.RatingCompat;
            Rect rect = setmaxcardelevation.RemoteActionCompatParcelizer;
            int i = setmaxcardelevation.read;
            boolean z = setmaxcardelevation.MediaMetadataCompat;
            Matrix matrix = new Matrix(setbrightness.MediaSessionCompatQueueItem);
            RectF rectF = new RectF(rect);
            Size size = setmaxcardelevation.serializer;
            matrix.postConcat(MediaStoreVideoCannotWrite.IconCompatParcelizer(rectF, MediaStoreVideoCannotWrite.read(size), i, z));
            UtilsKt.serializer(MediaStoreVideoCannotWrite.IconCompatParcelizer(MediaStoreVideoCannotWrite.read(MediaStoreVideoCannotWrite.write(rect), i), false, size));
            Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk = setbrightness.MediaSessionCompatResultReceiverWrapper.read();
            repeatingStreamConstraintForVideoRecordingQuirk.serializer = size;
            SmallDisplaySizeQuirk smallDisplaySizeQuirk = repeatingStreamConstraintForVideoRecordingQuirk.read();
            viewRootForInspectorDefaultImpls.put(setmaxcardelevation, new setBrightness(setmaxcardelevation.write, setmaxcardelevation.IconCompatParcelizer, smallDisplaySizeQuirk, matrix, false, rect2, setbrightness.MediaDescriptionCompat - i, -1, setbrightness.MediaMetadataCompat != z));
        }
        try {
            previewView1ExternalSyntheticLambda2.IconCompatParcelizer(setbrightness.RemoteActionCompatParcelizer((ImageCapture1) this.read, true));
        } catch (ProcessingException e) {
            setInflatedId.read("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        for (Map.Entry entry : ((ViewRootForInspectorDefaultImpls) this.RatingCompat).entrySet()) {
            write(setbrightness, entry);
            ((setBrightness) entry.getValue()).read(new WorkerKt$$ExternalSyntheticLambda2(this, setbrightness, entry, 9));
        }
        snapTo snapto = new snapTo(1, (ViewRootForInspectorDefaultImpls) this.RatingCompat);
        setbrightness.getClass();
        setbrightness.PlaybackStateCompat.add(snapto);
        return (ViewRootForInspectorDefaultImpls) this.RatingCompat;
    }

    public int read() {
        if (MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.isEmpty()) {
            return -1;
        }
        long j = ((long) ((MeasuredPage) onContentCardDismissed.read(MediaBrowserCompatMediaItem().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)).RemoteActionCompatParcelizer) - ((long) MediaBrowserCompatMediaItem().write);
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    public SurfaceRequest read(int i) {
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk;
        int i2;
        PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk2;
        NavArgsLazy navArgsLazy = (NavArgsLazy) this.MediaSessionCompatQueueItem;
        HashMap map = (HashMap) this.RatingCompat;
        if (map.containsKey(Integer.valueOf(i))) {
            return (SurfaceRequest) map.get(Integer.valueOf(i));
        }
        PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirkSerializer = null;
        if (navArgsLazy.serializer(i)) {
            SurfaceRequest surfaceRequestMediaBrowserCompatMediaItem = navArgsLazy.MediaBrowserCompatMediaItem(i);
            if (surfaceRequestMediaBrowserCompatMediaItem != null) {
                ArrayList arrayList = new ArrayList(surfaceRequestMediaBrowserCompatMediaItem.RemoteActionCompatParcelizer());
                Iterator it = surfaceRequestMediaBrowserCompatMediaItem.RemoteActionCompatParcelizer().iterator();
                do {
                    if (!it.hasNext()) {
                        previewDelayWhenVideoCaptureIsBoundQuirk = null;
                        break;
                    }
                    previewDelayWhenVideoCaptureIsBoundQuirk = (PreviewDelayWhenVideoCaptureIsBoundQuirk) it.next();
                } while (previewDelayWhenVideoCaptureIsBoundQuirk.RatingCompat != 0);
                if (previewDelayWhenVideoCaptureIsBoundQuirk == null) {
                    previewDelayWhenVideoCaptureIsBoundQuirk2 = null;
                } else {
                    int i3 = previewDelayWhenVideoCaptureIsBoundQuirk.read;
                    String str = previewDelayWhenVideoCaptureIsBoundQuirk.MediaSessionCompatQueueItem;
                    int i4 = previewDelayWhenVideoCaptureIsBoundQuirk.MediaBrowserCompatMediaItem;
                    if (1 != previewDelayWhenVideoCaptureIsBoundQuirk.RatingCompat) {
                        i3 = 5;
                        str = "video/hevc";
                        i4 = 2;
                    }
                    int i5 = i3;
                    String str2 = str;
                    int i6 = i4;
                    int i7 = previewDelayWhenVideoCaptureIsBoundQuirk.write;
                    int i8 = previewDelayWhenVideoCaptureIsBoundQuirk.serializer;
                    if (10 == i8) {
                        i2 = i7;
                    } else {
                        int iDoubleValue = (int) (((double) i7) * new Rational(10, i8).doubleValue());
                        if (setInflatedId.IconCompatParcelizer(3, "BackupHdrProfileEncoderProfilesProvider")) {
                            String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i7), 10, Integer.valueOf(i8), Integer.valueOf(iDoubleValue));
                            setInflatedId.IconCompatParcelizer(3, "BackupHdrProfileEncoderProfilesProvider");
                        }
                        i2 = iDoubleValue;
                    }
                    previewDelayWhenVideoCaptureIsBoundQuirk2 = new PreviewDelayWhenVideoCaptureIsBoundQuirk(i5, str2, i2, previewDelayWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer, previewDelayWhenVideoCaptureIsBoundQuirk.MediaDescriptionCompat, previewDelayWhenVideoCaptureIsBoundQuirk.MediaMetadataCompat, i6, 10, previewDelayWhenVideoCaptureIsBoundQuirk.IconCompatParcelizer, 1);
                }
                updateInitialValuesanimation_core updateinitialvaluesanimation_core = (updateInitialValuesanimation_core) this.read;
                if (previewDelayWhenVideoCaptureIsBoundQuirk2 == null) {
                    previewDelayWhenVideoCaptureIsBoundQuirk2 = null;
                } else {
                    String str3 = previewDelayWhenVideoCaptureIsBoundQuirk2.MediaSessionCompatQueueItem;
                    updateinitialvaluesanimation_core.getClass();
                    setInitialAnimationsanimation_core setinitialanimationsanimation_coreSerializer = updateInitialValuesanimation_core.serializer(str3);
                    if (setinitialanimationsanimation_coreSerializer == null || !setinitialanimationsanimation_coreSerializer.IconCompatParcelizer(previewDelayWhenVideoCaptureIsBoundQuirk2.MediaDescriptionCompat, previewDelayWhenVideoCaptureIsBoundQuirk2.MediaMetadataCompat)) {
                        previewDelayWhenVideoCaptureIsBoundQuirk2 = null;
                    } else {
                        int i9 = previewDelayWhenVideoCaptureIsBoundQuirk2.write;
                        int iIntValue = ((Integer) setinitialanimationsanimation_coreSerializer.serializer().clamp(Integer.valueOf(i9))).intValue();
                        if (iIntValue != i9) {
                            previewDelayWhenVideoCaptureIsBoundQuirk2 = new PreviewDelayWhenVideoCaptureIsBoundQuirk(previewDelayWhenVideoCaptureIsBoundQuirk2.read, previewDelayWhenVideoCaptureIsBoundQuirk2.MediaSessionCompatQueueItem, iIntValue, previewDelayWhenVideoCaptureIsBoundQuirk2.RemoteActionCompatParcelizer, previewDelayWhenVideoCaptureIsBoundQuirk2.MediaDescriptionCompat, previewDelayWhenVideoCaptureIsBoundQuirk2.MediaMetadataCompat, previewDelayWhenVideoCaptureIsBoundQuirk2.MediaBrowserCompatMediaItem, previewDelayWhenVideoCaptureIsBoundQuirk2.serializer, previewDelayWhenVideoCaptureIsBoundQuirk2.IconCompatParcelizer, previewDelayWhenVideoCaptureIsBoundQuirk2.RatingCompat);
                        }
                    }
                }
                if (previewDelayWhenVideoCaptureIsBoundQuirk2 != null) {
                    arrayList.add(previewDelayWhenVideoCaptureIsBoundQuirk2);
                }
                if (!arrayList.isEmpty()) {
                    previewOrientationIncorrectQuirkSerializer = PreviewOrientationIncorrectQuirk.serializer(surfaceRequestMediaBrowserCompatMediaItem.write(), surfaceRequestMediaBrowserCompatMediaItem.IconCompatParcelizer(), surfaceRequestMediaBrowserCompatMediaItem.read(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), previewOrientationIncorrectQuirkSerializer);
        }
        return previewOrientationIncorrectQuirkSerializer;
    }

    @Override // o.VideoEncoderCrashQuirk
    public void a_(Object obj) {
        if (this.IconCompatParcelizer != 10) {
            ((AbstractClickableNodehandlePressInteractionStart11) this.RatingCompat).serializer = null;
        } else {
            k$c k_c = (k$c) this.MediaSessionCompatQueueItem;
            k_c.serializer = (getCurrentContentInsetRight) this.read;
            k_c.MediaBrowserCompatMediaItem = compare.RemoteActionCompatParcelizer((Context) this.RatingCompat);
        }
    }

    @Override // o.shutdown
    public boolean serializer(int i) {
        int i2 = this.IconCompatParcelizer;
        if (i2 == 11) {
            return ((NavArgsLazy) this.MediaSessionCompatQueueItem).serializer(i) && read(i) != null;
        }
        if (i2 != 12) {
            return ((shutdown) this.MediaSessionCompatQueueItem).serializer(i) && MediaBrowserCompatMediaItem(i) != null;
        }
        return ((shutdown) this.MediaSessionCompatQueueItem).serializer(i) && RemoteActionCompatParcelizer(i) != null;
    }

    public String toString() {
        if (this.IconCompatParcelizer != 23) {
            return super.toString();
        }
        String str = (String) this.RatingCompat;
        String str2 = (String) this.read;
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = (Uri) this.MediaSessionCompatQueueItem;
        if (uri != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(uri));
        }
        if (str2 != null) {
            sb.append(" action=");
            sb.append(str2);
        }
        if (str != null) {
            sb.append(" mimetype=");
            sb.append(str);
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // o.shutdown
    public SurfaceRequest write(int i) {
        int i2 = this.IconCompatParcelizer;
        if (i2 != 11) {
            return i2 != 12 ? MediaBrowserCompatMediaItem(i) : RemoteActionCompatParcelizer(i);
        }
        return read(i);
    }

    public void write(setBrightness setbrightness, Map.Entry entry) {
        setBrightness setbrightness2 = (setBrightness) entry.getValue();
        Objects.toString(setbrightness2);
        setInflatedId.IconCompatParcelizer(3, "SurfaceProcessorNode");
        getContentInsetEndWithActions getcontentinsetendwithactions = new getContentInsetEndWithActions(setbrightness.MediaSessionCompatResultReceiverWrapper.MediaMetadataCompat, ((setMaxCardElevation) entry.getKey()).RemoteActionCompatParcelizer, setbrightness.serializer ? (ImageCapture1) this.read : null, ((setMaxCardElevation) entry.getKey()).read, ((setMaxCardElevation) entry.getKey()).MediaMetadataCompat);
        int i = ((setMaxCardElevation) entry.getKey()).IconCompatParcelizer;
        setbrightness2.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        setbrightness2.write();
        UtilsKt.RemoteActionCompatParcelizer("Consumer can only be linked once.", !setbrightness2.IconCompatParcelizer);
        setbrightness2.IconCompatParcelizer = true;
        SurfaceViewStretchedQuirk surfaceViewStretchedQuirk = setbrightness2.MediaSessionCompatToken;
        o.StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkSerializer = VideoQualityQuirk.serializer(surfaceViewStretchedQuirk.IconCompatParcelizer(), new getBrightness(setbrightness2, surfaceViewStretchedQuirk, i, getcontentinsetendwithactions, null), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
        stretchedVideoResolutionQuirkSerializer.RemoteActionCompatParcelizer(new com.google.android.gms.net.zza(stretchedVideoResolutionQuirkSerializer, 1, new Recorder$3(this, 6, setbrightness2)), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
    }

    public Size[] IconCompatParcelizer(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List arrayList4;
        HashMap map = (HashMap) this.RatingCompat;
        Size[] outputSizes = null;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        try {
            outputSizes = ((StreamConfigurationMap) ((ImageCapture$1) this.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).getOutputSizes(i);
        } catch (Throwable th) {
            setInflatedId.RemoteActionCompatParcelizer("StreamConfigurationMapCompat", "Failed to get output sizes for " + i, th);
        }
        if (outputSizes == null || outputSizes.length == 0) {
            setInflatedId.read("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
            return outputSizes;
        }
        i$d i_d = (i$d) this.read;
        i_d.getClass();
        ArrayList arrayList5 = new ArrayList(Arrays.asList(outputSizes));
        if (((ExtraSupportedOutputSizeQuirk) i_d.serializer) != null) {
            Size[] sizeArr = (i == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(DateTimeConstants.MINUTES_PER_DAY, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr.length > 0) {
                arrayList5.addAll(Arrays.asList(sizeArr));
            }
        }
        r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = (r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k) i_d.read;
        r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.getClass();
        if (((ExcludedSupportedSizesQuirk) setThumbTintList.RemoteActionCompatParcelizer.read(ExcludedSupportedSizesQuirk.class)) == null) {
            arrayList4 = new ArrayList();
        } else {
            String str = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList3.add(new Size(4160, 3120));
                    arrayList3.add(new Size(4000, 3000));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList3.add(new Size(4160, 3120));
                    arrayList3.add(new Size(4000, 3000));
                }
            } else if (SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0") && (i == 34 || i == 35)) {
                    arrayList3.add(new Size(720, 720));
                    arrayList3.add(new Size(400, 400));
                }
            } else if ("SAMSUNG".equalsIgnoreCase(str2) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0")) {
                    if (i == 34) {
                        arrayList3.add(new Size(4128, 3096));
                        arrayList3.add(new Size(4128, 2322));
                        arrayList3.add(new Size(3088, 3088));
                        arrayList3.add(new Size(3264, 2448));
                        arrayList3.add(new Size(3264, 1836));
                        arrayList3.add(new Size(Fields.CameraDistance, 1536));
                        arrayList3.add(new Size(Fields.CameraDistance, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    } else if (i == 35) {
                        arrayList3.add(new Size(4128, 2322));
                        arrayList3.add(new Size(3088, 3088));
                        arrayList3.add(new Size(3264, 2448));
                        arrayList3.add(new Size(3264, 1836));
                        arrayList3.add(new Size(Fields.CameraDistance, 1536));
                        arrayList3.add(new Size(Fields.CameraDistance, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    arrayList3.add(new Size(3264, 2448));
                    arrayList3.add(new Size(3264, 1836));
                    arrayList3.add(new Size(2448, 2448));
                    arrayList3.add(new Size(1920, 1920));
                    arrayList3.add(new Size(Fields.CameraDistance, 1536));
                    arrayList3.add(new Size(Fields.CameraDistance, 1152));
                    arrayList3.add(new Size(1920, 1080));
                }
            } else if ("SAMSUNG".equalsIgnoreCase(str2) && "J7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0")) {
                    if (i == 34) {
                        arrayList3.add(new Size(4128, 3096));
                        arrayList3.add(new Size(4128, 2322));
                        arrayList3.add(new Size(3088, 3088));
                        arrayList3.add(new Size(3264, 2448));
                        arrayList3.add(new Size(3264, 1836));
                        arrayList3.add(new Size(Fields.CameraDistance, 1536));
                        arrayList3.add(new Size(Fields.CameraDistance, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    } else if (i == 35) {
                        arrayList3.add(new Size(Fields.CameraDistance, 1536));
                        arrayList3.add(new Size(Fields.CameraDistance, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    }
                } else if (str.equals("1") && (i == 34 || i == 35)) {
                    arrayList3.add(new Size(2576, 1932));
                    arrayList3.add(new Size(2560, DateTimeConstants.MINUTES_PER_DAY));
                    arrayList3.add(new Size(1920, 1920));
                    arrayList3.add(new Size(Fields.CameraDistance, 1536));
                    arrayList3.add(new Size(Fields.CameraDistance, 1152));
                    arrayList3.add(new Size(1920, 1080));
                }
            } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                arrayList3 = new ArrayList();
                if (str.equals("0") && i == 256) {
                    arrayList3.add(new Size(9280, 6944));
                }
            } else if (ExcludedSupportedSizesQuirk.RemoteActionCompatParcelizer()) {
                arrayList2 = new ArrayList();
                if (i == 35) {
                    arrayList4 = arrayList2;
                    arrayList2.add(new Size(3840, 2160));
                    arrayList2.add(new Size(3264, 2448));
                    arrayList2.add(new Size(3200, 2400));
                    arrayList2.add(new Size(2688, 1512));
                    arrayList2.add(new Size(2592, 1944));
                    arrayList2.add(new Size(2592, 1940));
                    arrayList2.add(new Size(1920, DateTimeConstants.MINUTES_PER_DAY));
                    arrayList4 = arrayList2;
                }
            } else if (ExcludedSupportedSizesQuirk.serializer()) {
                arrayList = new ArrayList();
                if (i == 35) {
                    arrayList4 = arrayList;
                    arrayList.add(new Size(4032, 3024));
                    arrayList.add(new Size(4000, 3000));
                    arrayList.add(new Size(3264, 2448));
                    arrayList.add(new Size(3200, 2400));
                    arrayList.add(new Size(3024, 3024));
                    arrayList.add(new Size(2976, 2976));
                    arrayList.add(new Size(2448, 2448));
                    arrayList4 = arrayList;
                }
            } else {
                setInflatedId.read("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                arrayList4 = Collections.EMPTY_LIST;
            }
            arrayList4 = arrayList3;
        }
        arrayList4 = arrayList;
        arrayList4 = arrayList2;
        if (!arrayList4.isEmpty()) {
            arrayList5.removeAll(arrayList4);
        }
        if (arrayList5.isEmpty()) {
            setInflatedId.read("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        Size[] sizeArr2 = (Size[]) arrayList5.toArray(new Size[0]);
        map.put(Integer.valueOf(i), sizeArr2);
        return (Size[]) sizeArr2.clone();
    }

    @Override // o.VideoEncoderCrashQuirk
    public void write(Throwable th) {
        Object obj;
        if (this.IconCompatParcelizer != 10) {
            ((AbstractClickableNodehandlePressInteractionStart11) this.RatingCompat).serializer = null;
            ArrayList arrayList = (ArrayList) this.MediaSessionCompatQueueItem;
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((FocusMeteringAction) this.read).RemoteActionCompatParcelizer((StillCaptureFlashStopRepeatingQuirk) it.next());
            }
            arrayList.clear();
            return;
        }
        k$c k_c = (k$c) this.MediaSessionCompatQueueItem;
        Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = new Preview$$ExternalSyntheticLambda0(22, k_c);
        int i = 3;
        if (PrematureEndOfStreamVideoQuirk.read()) {
            preview$$ExternalSyntheticLambda0.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            UtilsKt.RemoteActionCompatParcelizer("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new Crossfade(preview$$ExternalSyntheticLambda0, i, countDownLatch)));
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e) {
                throw new InterruptedRuntimeException(e);
            }
        }
        getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) k_c.serializer;
        if (getcurrentcontentinsetright != null) {
            synchronized (getcurrentcontentinsetright.MediaSessionCompatResultReceiverWrapper) {
                getcurrentcontentinsetright.ParcelableVolumeInfo.removeCallbacksAndMessages("retry_token");
                int iOrdinal = getcurrentcontentinsetright.PlaybackStateCompatCustomAction.ordinal();
                if (iOrdinal == 0) {
                    getcurrentcontentinsetright.PlaybackStateCompatCustomAction = getCurrentContentInsetStart.SHUTDOWN;
                    obj = EncoderImplMediaCodecCallback.IconCompatParcelizer;
                } else {
                    if (iOrdinal == 1) {
                        throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                    }
                    if (iOrdinal == 2 || iOrdinal == 3) {
                        getcurrentcontentinsetright.PlaybackStateCompatCustomAction = getCurrentContentInsetStart.SHUTDOWN;
                        getCurrentContentInsetRight.RemoteActionCompatParcelizer(getcurrentcontentinsetright.MediaSessionCompatToken);
                        getcurrentcontentinsetright.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = UtilsKt.RemoteActionCompatParcelizer(new StreamSharing$$ExternalSyntheticLambda0(5, getcurrentcontentinsetright));
                    }
                    obj = getcurrentcontentinsetright.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                }
            }
        } else {
            obj = EncoderImplMediaCodecCallback.IconCompatParcelizer;
        }
        obj.getClass();
        synchronized (k_c.RemoteActionCompatParcelizer) {
            k_c.write = null;
            k_c.IconCompatParcelizer = obj;
            ((HashMap) k_c.MediaSessionCompatQueueItem).clear();
            ((HashSet) k_c.MediaDescriptionCompat).clear();
        }
        k_c.serializer = null;
        k_c.MediaBrowserCompatMediaItem = null;
    }

    public static Rational RemoteActionCompatParcelizer(int i, boolean z) {
        if (i == -1) {
            return null;
        }
        if (i == 0) {
            if (z) {
                return AudioTimestampFramePositionIncorrectQuirk.IconCompatParcelizer;
            }
            return AudioTimestampFramePositionIncorrectQuirk.RemoteActionCompatParcelizer;
        }
        if (i == 1) {
            if (z) {
                return AudioTimestampFramePositionIncorrectQuirk.write;
            }
            return AudioTimestampFramePositionIncorrectQuirk.serializer;
        }
        setInflatedId.serializer("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    public /* synthetic */ NavArgsLazy(int i, boolean z) {
        this.IconCompatParcelizer = i;
    }

    public /* synthetic */ NavArgsLazy(Object obj, Object obj2, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.MediaSessionCompatQueueItem = obj;
        this.read = obj2;
        this.RatingCompat = obj3;
    }

    public /* synthetic */ NavArgsLazy(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.IconCompatParcelizer = i;
        this.RatingCompat = obj;
        this.MediaSessionCompatQueueItem = obj2;
        this.read = obj3;
    }

    public NavArgsLazy(getAdd0d7_KjU getadd0d7_kju) {
        this.IconCompatParcelizer = 22;
        this.MediaSessionCompatQueueItem = new accessregisterComponentCallback(getadd0d7_kju, true);
        this.read = new Handler(Looper.getMainLooper());
    }

    public NavArgsLazy(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = 0;
        this.MediaSessionCompatQueueItem = r8lambdaucgighn8fiyv_vccodeafjfpedk;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public NavArgsLazy(shutdown shutdownVar, getNavigationIcon getnavigationicon) {
        this.IconCompatParcelizer = 12;
        this.RatingCompat = new HashMap();
        this.MediaSessionCompatQueueItem = shutdownVar;
        this.read = getnavigationicon;
    }

    public NavArgsLazy(StreamConfigurationMap streamConfigurationMap, i$d i_d) {
        this.IconCompatParcelizer = 5;
        this.RatingCompat = new HashMap();
        new HashMap();
        new HashMap();
        this.MediaSessionCompatQueueItem = new ImageCapture$1(16, streamConfigurationMap);
        this.read = i_d;
    }

    public NavArgsLazy(int i) {
        this.IconCompatParcelizer = i;
        if (i != 16) {
            this.MediaSessionCompatQueueItem = new AndroidGraphicsContext2();
            this.read = new HashMap();
        } else {
            long[] jArr = detectDragGestures.write;
            this.MediaSessionCompatQueueItem = new onRemeasuredozmzZPI();
        }
    }

    public NavArgsLazy(shutdown shutdownVar, u$a u_a) {
        this.IconCompatParcelizer = 13;
        this.RatingCompat = new HashMap();
        this.MediaSessionCompatQueueItem = shutdownVar;
        this.read = u_a;
    }

    public NavArgsLazy(RecomposerrunRecomposeAndApplyChanges2 recomposerrunRecomposeAndApplyChanges2) {
        this.IconCompatParcelizer = 17;
        this.MediaSessionCompatQueueItem = recomposerrunRecomposeAndApplyChanges2;
    }

    public NavArgsLazy(Context context, LocationManager locationManager) {
        this.IconCompatParcelizer = 2;
        this.RatingCompat = new getBundleFromUrl();
        this.MediaSessionCompatQueueItem = context;
        this.read = locationManager;
    }

    public NavArgsLazy(NavArgsLazy navArgsLazy) {
        this.IconCompatParcelizer = 11;
        this.RatingCompat = new HashMap();
        this.MediaSessionCompatQueueItem = navArgsLazy;
        this.read = TransitionKtrememberTransitionlambda10inlinedonDispose1.write;
    }

    public NavArgsLazy(FocusMeteringAction focusMeteringAction, Size size) {
        Rational rational;
        this.IconCompatParcelizer = 8;
        this.MediaSessionCompatQueueItem = focusMeteringAction;
        focusMeteringAction.MediaDescriptionCompat();
        focusMeteringAction.MediaBrowserCompatMediaItem();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listSerializer = focusMeteringAction.serializer(Fields.RotationX);
            if (listSerializer.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listSerializer, new AudioEncoderIgnoresInputTimestampQuirk(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.read = rational;
        this.RatingCompat = new getScaleType(focusMeteringAction, rational);
    }

    public NavArgsLazy(Context context) {
        this.IconCompatParcelizer = 15;
        this.MediaSessionCompatQueueItem = new Object();
        this.RatingCompat = new HashMap();
        this.read = new updateSizeuvyYCjkfoundation(this, context);
    }

    public NavArgsLazy(ImageCapture1 imageCapture1, PreviewView1ExternalSyntheticLambda2 previewView1ExternalSyntheticLambda2) {
        this.IconCompatParcelizer = 9;
        this.read = imageCapture1;
        this.MediaSessionCompatQueueItem = previewView1ExternalSyntheticLambda2;
    }

    public NavArgsLazy(onRemeasuredozmzZPI onremeasuredozmzzpi, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = 18;
        this.MediaSessionCompatQueueItem = onremeasuredozmzzpi;
        this.RatingCompat = str;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public NavArgsLazy(PendingValue pendingValue) {
        this.IconCompatParcelizer = 21;
        this.MediaSessionCompatQueueItem = pendingValue;
        this.read = Choreographer.getInstance();
        this.RatingCompat = new inflate(this);
    }

    public NavArgsLazy(PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk) {
        this.IconCompatParcelizer = 4;
        this.read = new AtomicBoolean(true);
        this.RatingCompat = previewFreezeAfterHighSpeedRecordingQuirk;
    }

    public NavArgsLazy(getExponentimpl getexponentimpl) {
        this.IconCompatParcelizer = 24;
        this.MediaSessionCompatQueueItem = getexponentimpl;
        this.read = new ReentrantLock();
        this.RatingCompat = new WeakHashMap();
    }

    public NavArgsLazy(area areaVar, SingleRequest singleRequest, accessisSrgb accessissrgb) {
        this.IconCompatParcelizer = 28;
        this.RatingCompat = areaVar;
        this.read = singleRequest;
        this.MediaSessionCompatQueueItem = accessissrgb;
    }

    public NavArgsLazy(i$d i_d) {
        this.IconCompatParcelizer = 3;
        this.RatingCompat = i_d;
        this.read = new AtomicBoolean(false);
        this.MediaSessionCompatQueueItem = ((Camera2CameraImpl) i_d.read).r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.schedule(new setPrecomputedText(this, 0), ConstantKt.DEFAULT_REQUEST_TIMEOUT, TimeUnit.MILLISECONDS);
    }
}
