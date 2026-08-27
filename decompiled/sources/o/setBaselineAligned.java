package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.ImageCapture$Metadata;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo;
import com.google.android.gms.net.zza;
import com.mapbox.search.ApiTypeKt;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class setBaselineAligned implements setBaselineAlignedChildIndex {
    public final ImageCapture$Metadata ComponentActivity;
    public final setDividerDrawable IconCompatParcelizer;
    public final setDropDownVerticalOffset MediaBrowserCompatMediaItem;
    public onDrawWithContent MediaDescriptionCompat;
    public final getTrackTintList MediaMetadataCompat;
    public onDrawBehind MediaSessionCompatQueueItem;
    public setHorizontalGravity MediaSessionCompatToken;
    public getThumbScrollRange ParcelableVolumeInfo;
    public mapToBase PlaybackStateCompat;
    public final ImageCapture$Metadata PlaybackStateCompatCustomAction;
    public setHorizontalGravity RatingCompat;
    public getThumbScrollRange r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public HashMap r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final FlowLayoutBuildingBlocks$WrapInfo r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final boolean serializer;
    public final Object MediaSessionCompatResultReceiverWrapper = new Object();
    public final ArrayList write = new ArrayList();
    public final HashMap RemoteActionCompatParcelizer = new HashMap();
    public List read = Collections.EMPTY_LIST;

    public static HashMap IconCompatParcelizer(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Preview3AThreadCrashQuirk preview3AThreadCrashQuirk = (Preview3AThreadCrashQuirk) it.next();
            int i = preview3AThreadCrashQuirk.IconCompatParcelizer;
            if (i > 0 && preview3AThreadCrashQuirk.read.isEmpty()) {
                List arrayList2 = (List) map.get(Integer.valueOf(i));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(i), arrayList2);
                }
                arrayList2.add(preview3AThreadCrashQuirk);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    public static getOrientation RemoteActionCompatParcelizer(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback getorientation;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk = (StillCaptureFlashStopRepeatingQuirk) it.next();
            if (stillCaptureFlashStopRepeatingQuirk == null) {
                getorientation = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                ApiTypeKt.read(stillCaptureFlashStopRepeatingQuirk, arrayList2);
                getorientation = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new getOrientation(arrayList2);
            }
            arrayList.add(getorientation);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new getOrientation(arrayList);
    }

    public static HashMap serializer(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) map.get(num)).iterator();
            if (it.hasNext()) {
                androidx.camera.core.impl.utils.SurfaceUtil.IconCompatParcelizer((Surface) map2.get(((Preview3AThreadCrashQuirk) it.next()).serializer));
                throw null;
            }
            setInflatedId.serializer("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: 0, streamInfos size: " + arrayList.size());
        }
        return map3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    public final setSwitchTypeface IconCompatParcelizer(Preview3AThreadCrashQuirk preview3AThreadCrashQuirk, HashMap map, String str) {
        long jLongValue;
        PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0 = preview3AThreadCrashQuirk.serializer;
        List list = preview3AThreadCrashQuirk.read;
        Surface surface = (Surface) map.get(previewExternalSyntheticLambda0);
        coil3.util.UtilsKt.IconCompatParcelizer(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        setSwitchTypeface setswitchtypeface = new setSwitchTypeface(preview3AThreadCrashQuirk.IconCompatParcelizer, surface);
        setSwitchMinWidth setswitchminwidth = setswitchtypeface.IconCompatParcelizer;
        if (str != null) {
            ((OutputConfiguration) setswitchminwidth.write()).setPhysicalCameraId(str);
        } else {
            ((OutputConfiguration) setswitchminwidth.write()).setPhysicalCameraId(null);
        }
        int i = preview3AThreadCrashQuirk.RemoteActionCompatParcelizer;
        if (i == 0) {
            setswitchminwidth.IconCompatParcelizer(1);
        } else if (i == 1) {
            setswitchminwidth.IconCompatParcelizer(2);
        }
        if (!list.isEmpty()) {
            ((OutputConfiguration) setswitchminwidth.write()).enableSurfaceSharing();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((PreviewExternalSyntheticLambda0) it.next());
                coil3.util.UtilsKt.IconCompatParcelizer(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                ((OutputConfiguration) setswitchminwidth.write()).addSurface(surface2);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            getTrackTintList gettracktintlist = this.MediaMetadataCompat;
            gettracktintlist.getClass();
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", i2 >= 33);
            DynamicRangeProfiles dynamicRangeProfilesAp_ = ((setSplitTrack) gettracktintlist.serializer).ap_();
            if (dynamicRangeProfilesAp_ == null) {
                jLongValue = 1;
            } else {
                getNavigationIcon getnavigationicon = preview3AThreadCrashQuirk.write;
                Long lAm_ = setEnforceSwitchWidth.am_(getnavigationicon, dynamicRangeProfilesAp_);
                if (lAm_ == null) {
                    setInflatedId.serializer("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + getnavigationicon);
                    jLongValue = 1;
                } else {
                    jLongValue = lAm_.longValue();
                }
            }
        } else {
            jLongValue = 1;
        }
        setswitchminwidth.read(jLongValue);
        return setswitchtypeface;
    }

    public final void IconCompatParcelizer(List list) {
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            switch (this.MediaSessionCompatToken.ordinal()) {
                case 0:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.MediaSessionCompatToken);
                case 1:
                case 4:
                case 5:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                case 2:
                case 3:
                case 6:
                    this.write.addAll(list);
                    break;
                case 7:
                    this.write.addAll(list);
                    this.MediaBrowserCompatMediaItem.IconCompatParcelizer().RemoteActionCompatParcelizer(new Preview$$ExternalSyntheticLambda0(8, this), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
                    break;
            }
        }
    }

    public final boolean IconCompatParcelizer() {
        boolean z;
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            setHorizontalGravity sethorizontalgravity = this.MediaSessionCompatToken;
            z = sethorizontalgravity == setHorizontalGravity.OPENED || sethorizontalgravity == setHorizontalGravity.OPENING;
        }
        return z;
    }

    public final void write() throws Throwable {
        setHorizontalGravity sethorizontalgravity = this.MediaSessionCompatToken;
        setHorizontalGravity sethorizontalgravity2 = setHorizontalGravity.RELEASED;
        if (sethorizontalgravity == sethorizontalgravity2) {
            setInflatedId.IconCompatParcelizer(3, "CaptureSession");
            return;
        }
        RemoteActionCompatParcelizer(sethorizontalgravity2);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        onDrawWithContent ondrawwithcontent = this.MediaDescriptionCompat;
        if (ondrawwithcontent != null) {
            ondrawwithcontent.RemoteActionCompatParcelizer(null);
            this.MediaDescriptionCompat = null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void write(ArrayList arrayList) {
        CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0;
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            try {
                if (this.MediaSessionCompatToken != setHorizontalGravity.OPENED) {
                    setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                    return;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    getDividerDrawable getdividerdrawable = new getDividerDrawable(0);
                    ArrayList arrayList2 = new ArrayList();
                    setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                    Iterator it = arrayList.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        nativeGetYUVImageVUOff nativegetyuvimagevuoff = (nativeGetYUVImageVUOff) it.next();
                        if (!Collections.unmodifiableList(nativegetyuvimagevuoff.MediaBrowserCompatMediaItem).isEmpty()) {
                            Iterator it2 = Collections.unmodifiableList(nativegetyuvimagevuoff.MediaBrowserCompatMediaItem).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    if (nativegetyuvimagevuoff.MediaSessionCompatQueueItem == 2) {
                                        z = true;
                                    }
                                    abandonFocus abandonfocus = new abandonFocus(nativegetyuvimagevuoff);
                                    if (nativegetyuvimagevuoff.MediaSessionCompatQueueItem == 5 && (cameraXExternalSyntheticLambda0 = nativegetyuvimagevuoff.serializer) != null) {
                                        abandonfocus.read = cameraXExternalSyntheticLambda0;
                                    }
                                    mapToBase maptobase = this.PlaybackStateCompat;
                                    if (maptobase != null) {
                                        abandonfocus.RemoteActionCompatParcelizer(maptobase.MediaDescriptionCompat.MediaDescriptionCompat);
                                    }
                                    abandonfocus.RemoteActionCompatParcelizer(nativegetyuvimagevuoff.MediaDescriptionCompat);
                                    nativeGetYUVImageVUOff nativegetyuvimagevuoffIconCompatParcelizer = abandonfocus.IconCompatParcelizer();
                                    getThumbScrollRange getthumbscrollrange = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                                    getthumbscrollrange.serializer.getClass();
                                    CaptureRequest captureRequestRemoteActionCompatParcelizer = removeStaleIds.RemoteActionCompatParcelizer(nativegetyuvimagevuoffIconCompatParcelizer, ((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange.serializer.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).getDevice(), this.RemoteActionCompatParcelizer, false, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                                    if (captureRequestRemoteActionCompatParcelizer != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it3 = nativegetyuvimagevuoff.IconCompatParcelizer.iterator();
                                        while (it3.hasNext()) {
                                            ApiTypeKt.read((StillCaptureFlashStopRepeatingQuirk) it3.next(), arrayList3);
                                        }
                                        getdividerdrawable.serializer(captureRequestRemoteActionCompatParcelizer, arrayList3);
                                        arrayList2.add(captureRequestRemoteActionCompatParcelizer);
                                        break;
                                    }
                                    setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                                    return;
                                }
                                PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0 = (PreviewExternalSyntheticLambda0) it2.next();
                                if (!this.RemoteActionCompatParcelizer.containsKey(previewExternalSyntheticLambda0)) {
                                    Objects.toString(previewExternalSyntheticLambda0);
                                    setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                                    break;
                                }
                            }
                        } else {
                            setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                        return;
                    }
                    if (this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(arrayList2, z)) {
                        getThumbScrollRange getthumbscrollrange2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        coil3.util.UtilsKt.IconCompatParcelizer(getthumbscrollrange2.serializer, "Need to call openCaptureSession before using this API.");
                        ((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange2.serializer.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).stopRepeating();
                        getdividerdrawable.serializer = new getShowDividers(this);
                    }
                    if (this.ComponentActivity.IconCompatParcelizer(arrayList2, z)) {
                        getdividerdrawable.serializer((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new getOrientation(this)));
                    }
                    mapToBase maptobase2 = this.PlaybackStateCompat;
                    if (maptobase2 != null && maptobase2.RatingCompat == 1) {
                        read(arrayList2, getdividerdrawable);
                        return;
                    }
                    getThumbScrollRange getthumbscrollrange3 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    CameraCaptureSession.CaptureCallback captureCallbackIconCompatParcelizer = getthumbscrollrange3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer(getdividerdrawable);
                    coil3.util.UtilsKt.IconCompatParcelizer(getthumbscrollrange3.serializer, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange3.serializer.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).captureBurstRequests(arrayList2, getthumbscrollrange3.MediaBrowserCompatMediaItem, captureCallbackIconCompatParcelizer);
                } catch (CameraAccessException e) {
                    setInflatedId.serializer("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void IconCompatParcelizer(mapToBase maptobase) {
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            switch (this.MediaSessionCompatToken.ordinal()) {
                case 0:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.MediaSessionCompatToken);
                case 1:
                case 4:
                case 5:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                case 2:
                case 3:
                case 6:
                    this.PlaybackStateCompat = maptobase;
                    break;
                case 7:
                    this.PlaybackStateCompat = maptobase;
                    if (maptobase == null) {
                        return;
                    }
                    if (!this.RemoteActionCompatParcelizer.keySet().containsAll(maptobase.RemoteActionCompatParcelizer())) {
                        setInflatedId.serializer("CaptureSession", "Does not have the proper configured lists");
                        return;
                    } else {
                        setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                        write(this.PlaybackStateCompat);
                    }
                    break;
            }
        }
    }

    public final int read(ArrayList arrayList, getDividerDrawable getdividerdrawable) throws CameraAccessException {
        List<CaptureRequest> listCreateHighSpeedRequestList;
        getDividerDrawable getdividerdrawable2 = new getDividerDrawable(0);
        Iterator it = arrayList.iterator();
        int iCaptureBurstRequests = -1;
        while (it.hasNext()) {
            CaptureRequest captureRequest = (CaptureRequest) it.next();
            getThumbScrollRange getthumbscrollrange = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            Objects.requireNonNull(getthumbscrollrange);
            ImageCapture$1 imageCapture$1 = getthumbscrollrange.serializer;
            imageCapture$1.getClass();
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) ((ImageCapture$1) imageCapture$1.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem;
            if (cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession) {
                listCreateHighSpeedRequestList = ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(captureRequest);
            } else {
                listCreateHighSpeedRequestList = Collections.EMPTY_LIST;
            }
            Iterator<CaptureRequest> it2 = listCreateHighSpeedRequestList.iterator();
            while (it2.hasNext()) {
                getdividerdrawable2.serializer(it2.next(), Collections.singletonList(new ListPopupWindowPopupTouchInterceptor(captureRequest, getdividerdrawable)));
            }
            getThumbScrollRange getthumbscrollrange2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            CameraCaptureSession.CaptureCallback captureCallbackIconCompatParcelizer = getthumbscrollrange2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer(getdividerdrawable2);
            coil3.util.UtilsKt.IconCompatParcelizer(getthumbscrollrange2.serializer, "Need to call openCaptureSession before using this API.");
            ImageCapture$1 imageCapture$2 = getthumbscrollrange2.serializer;
            iCaptureBurstRequests = ((CameraCaptureSession) ((ImageCapture$1) imageCapture$2.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).captureBurstRequests(listCreateHighSpeedRequestList, getthumbscrollrange2.MediaBrowserCompatMediaItem, captureCallbackIconCompatParcelizer);
        }
        return iCaptureBurstRequests;
    }

    public final void RemoteActionCompatParcelizer(setHorizontalGravity sethorizontalgravity) throws Throwable {
        if (sethorizontalgravity.ordinal() > this.RatingCompat.ordinal()) {
            this.RatingCompat = sethorizontalgravity;
        }
        this.MediaSessionCompatToken = sethorizontalgravity;
        if (!((Boolean) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-1240730099, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 1240730100, sourceInformationContextOfdefault.read(), new Object[0], sourceInformationContextOfdefault.read())).booleanValue() || this.RatingCompat.ordinal() < setHorizontalGravity.GET_SURFACE.ordinal()) {
            return;
        }
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read(sethorizontalgravity.ordinal(), "CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]");
    }

    public final void write(mapToBase maptobase) {
        List<CaptureRequest> listCreateHighSpeedRequestList;
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            if (maptobase == null) {
                setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                return;
            }
            if (this.MediaSessionCompatToken != setHorizontalGravity.OPENED) {
                setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                return;
            }
            nativeGetYUVImageVUOff nativegetyuvimagevuoff = maptobase.MediaDescriptionCompat;
            if (Collections.unmodifiableList(nativegetyuvimagevuoff.MediaBrowserCompatMediaItem).isEmpty()) {
                setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                try {
                    getThumbScrollRange getthumbscrollrange = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    coil3.util.UtilsKt.IconCompatParcelizer(getthumbscrollrange.serializer, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange.serializer.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).stopRepeating();
                } catch (CameraAccessException e) {
                    setInflatedId.serializer("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return;
            }
            try {
                setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                getThumbScrollRange getthumbscrollrange2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                getthumbscrollrange2.serializer.getClass();
                CaptureRequest captureRequestRemoteActionCompatParcelizer = removeStaleIds.RemoteActionCompatParcelizer(nativegetyuvimagevuoff, ((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange2.serializer.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).getDevice(), this.RemoteActionCompatParcelizer, true, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                if (captureRequestRemoteActionCompatParcelizer == null) {
                    setInflatedId.IconCompatParcelizer(3, "CaptureSession");
                    return;
                }
                CameraCaptureSession.CaptureCallback captureCallbackIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer(RemoteActionCompatParcelizer(nativegetyuvimagevuoff.IconCompatParcelizer, new CameraCaptureSession.CaptureCallback[0]));
                int i = maptobase.RatingCompat;
                getThumbScrollRange getthumbscrollrange3 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                if (i == 1) {
                    ImageCapture$1 imageCapture$1 = getthumbscrollrange3.serializer;
                    imageCapture$1.getClass();
                    CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) ((ImageCapture$1) imageCapture$1.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem;
                    if (cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession) {
                        listCreateHighSpeedRequestList = ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(captureRequestRemoteActionCompatParcelizer);
                    } else {
                        listCreateHighSpeedRequestList = Collections.EMPTY_LIST;
                    }
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(listCreateHighSpeedRequestList, captureCallbackIconCompatParcelizer);
                    return;
                }
                getthumbscrollrange3.read(captureRequestRemoteActionCompatParcelizer, captureCallbackIconCompatParcelizer);
                return;
            } catch (CameraAccessException e2) {
                setInflatedId.serializer("CaptureSession", "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return;
            }
            throw th;
        }
    }

    public setBaselineAligned(getTrackTintList gettracktintlist, u$a u_a, boolean z) throws Throwable {
        setHorizontalGravity sethorizontalgravity = setHorizontalGravity.UNINITIALIZED;
        this.RatingCompat = sethorizontalgravity;
        this.MediaSessionCompatToken = sethorizontalgravity;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new HashMap();
        this.PlaybackStateCompatCustomAction = new ImageCapture$Metadata(2);
        this.ComponentActivity = new ImageCapture$Metadata(3);
        RemoteActionCompatParcelizer(setHorizontalGravity.INITIALIZED);
        this.MediaMetadataCompat = gettracktintlist;
        this.IconCompatParcelizer = new setDividerDrawable(this);
        this.MediaBrowserCompatMediaItem = new setDropDownVerticalOffset(u_a.RemoteActionCompatParcelizer(androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk.class));
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new FlowLayoutBuildingBlocks$WrapInfo(u_a, 3);
        this.serializer = z;
    }

    public final DrawModifierNodeKt write(mapToBase maptobase, CameraDevice cameraDevice, getThumbScrollRange getthumbscrollrange) {
        DrawModifierNodeKt drawModifierNodeKtRemoteActionCompatParcelizer;
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            if (this.MediaSessionCompatToken.ordinal() != 2) {
                setInflatedId.serializer("CaptureSession", "Open not allowed in state: " + this.MediaSessionCompatToken);
                return new EncoderImplMediaCodecCallback(0, new IllegalStateException("open() should not allow the state: " + this.MediaSessionCompatToken));
            }
            RemoteActionCompatParcelizer(setHorizontalGravity.GET_SURFACE);
            ArrayList arrayList = new ArrayList(maptobase.RemoteActionCompatParcelizer());
            this.read = arrayList;
            this.ParcelableVolumeInfo = getthumbscrollrange;
            synchronized (getthumbscrollrange.PlaybackStateCompat) {
                getthumbscrollrange.RatingCompat = arrayList;
                drawModifierNodeKtRemoteActionCompatParcelizer = getthumbscrollrange.RemoteActionCompatParcelizer(arrayList);
            }
            int i = 1;
            StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkSerializer = VideoQualityQuirk.serializer(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(drawModifierNodeKtRemoteActionCompatParcelizer), new PreviewView$1$$ExternalSyntheticLambda2(this, maptobase, cameraDevice, i), this.ParcelableVolumeInfo.MediaBrowserCompatMediaItem);
            stretchedVideoResolutionQuirkSerializer.RemoteActionCompatParcelizer(new zza(stretchedVideoResolutionQuirkSerializer, i, new ImageCapture$1(8, this)), this.ParcelableVolumeInfo.MediaBrowserCompatMediaItem);
            return VideoQualityQuirk.write((DrawModifierNodeKt) stretchedVideoResolutionQuirkSerializer);
        }
    }

    public final void serializer() {
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            int iOrdinal = this.MediaSessionCompatToken.ordinal();
            if (iOrdinal == 0) {
                throw new IllegalStateException("close() should not be possible in state: " + this.MediaSessionCompatToken);
            }
            if (iOrdinal == 2) {
                RemoteActionCompatParcelizer(setHorizontalGravity.RELEASED);
            } else if (iOrdinal == 3) {
                coil3.util.UtilsKt.IconCompatParcelizer(this.ParcelableVolumeInfo, "The Opener shouldn't null in state:" + this.MediaSessionCompatToken);
                this.ParcelableVolumeInfo.IconCompatParcelizer();
                RemoteActionCompatParcelizer(setHorizontalGravity.RELEASED);
            } else if (iOrdinal == 6 || iOrdinal == 7) {
                coil3.util.UtilsKt.IconCompatParcelizer(this.ParcelableVolumeInfo, "The Opener shouldn't null in state:" + this.MediaSessionCompatToken);
                this.ParcelableVolumeInfo.IconCompatParcelizer();
                RemoteActionCompatParcelizer(setHorizontalGravity.CLOSED);
                this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
                this.PlaybackStateCompat = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x003d A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:22:0x0073, B:8:0x000f, B:10:0x0013, B:11:0x0016, B:13:0x003d, B:14:0x0041, B:16:0x0045, B:17:0x0050, B:18:0x0052, B:20:0x0054, B:21:0x006e, B:25:0x0077, B:26:0x008c), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:22:0x0073, B:8:0x000f, B:10:0x0013, B:11:0x0016, B:13:0x003d, B:14:0x0041, B:16:0x0045, B:17:0x0050, B:18:0x0052, B:20:0x0054, B:21:0x006e, B:25:0x0077, B:26:0x008c), top: B:30:0x0003 }] */
    public final DrawModifierNodeKt read() {
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            int iOrdinal = this.MediaSessionCompatToken.ordinal();
            if (iOrdinal != 0) {
                switch (iOrdinal) {
                    case 2:
                        RemoteActionCompatParcelizer(setHorizontalGravity.RELEASED);
                        return EncoderImplMediaCodecCallback.IconCompatParcelizer;
                    case 3:
                        coil3.util.UtilsKt.IconCompatParcelizer(this.ParcelableVolumeInfo, "The Opener shouldn't null in state:" + this.MediaSessionCompatToken);
                        this.ParcelableVolumeInfo.IconCompatParcelizer();
                        RemoteActionCompatParcelizer(setHorizontalGravity.RELEASED);
                        return EncoderImplMediaCodecCallback.IconCompatParcelizer;
                    case 4:
                        if (this.MediaSessionCompatQueueItem == null) {
                            this.MediaSessionCompatQueueItem = coil3.util.UtilsKt.RemoteActionCompatParcelizer(new getShowDividers(this));
                        }
                        return this.MediaSessionCompatQueueItem;
                    case 5:
                    case 7:
                        getThumbScrollRange getthumbscrollrange = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        if (getthumbscrollrange != null) {
                            getthumbscrollrange.write();
                        }
                        RemoteActionCompatParcelizer(setHorizontalGravity.RELEASING);
                        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
                        coil3.util.UtilsKt.IconCompatParcelizer(this.ParcelableVolumeInfo, "The Opener shouldn't null in state:" + this.MediaSessionCompatToken);
                        if (this.ParcelableVolumeInfo.IconCompatParcelizer()) {
                            write();
                            return EncoderImplMediaCodecCallback.IconCompatParcelizer;
                        }
                        if (this.MediaSessionCompatQueueItem == null) {
                            this.MediaSessionCompatQueueItem = coil3.util.UtilsKt.RemoteActionCompatParcelizer(new getShowDividers(this));
                        }
                        return this.MediaSessionCompatQueueItem;
                    case 6:
                        RemoteActionCompatParcelizer(setHorizontalGravity.RELEASING);
                        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
                        coil3.util.UtilsKt.IconCompatParcelizer(this.ParcelableVolumeInfo, "The Opener shouldn't null in state:" + this.MediaSessionCompatToken);
                        if (this.ParcelableVolumeInfo.IconCompatParcelizer()) {
                            write();
                            return EncoderImplMediaCodecCallback.IconCompatParcelizer;
                        }
                        if (this.MediaSessionCompatQueueItem == null) {
                            this.MediaSessionCompatQueueItem = coil3.util.UtilsKt.RemoteActionCompatParcelizer(new getShowDividers(this));
                        }
                        return this.MediaSessionCompatQueueItem;
                    default:
                        return EncoderImplMediaCodecCallback.IconCompatParcelizer;
                }
            }
            throw new IllegalStateException("release() should not be possible in state: " + this.MediaSessionCompatToken);
        }
    }
}
