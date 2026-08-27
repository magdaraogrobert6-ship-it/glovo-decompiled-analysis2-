package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import androidx.transition.TransitionValuesMaps;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.disk.DiskLruCache$Editor;
import com.airbnb.lottie.PerformanceTracker;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.face.Face;
import com.huawei.location.Vw$Vw;
import com.huawei.location.logic.zp;
import com.huawei.wisesecurity.ucs_credential.x;
import com.sentiance.core.model.events.i$c;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.CalculateMatrixToWindow;
import o.CameraValidatorCameraIdListIncorrectException;
import o.ChainedPlatformTextInputInterceptor;
import o.ContentScaleCompanionCrop1;
import o.DeferrableSurfaceSurfaceUnavailableException;
import o.DrawModifierNodeKt;
import o.EncoderImplMediaCodecCallback;
import o.LayoutModifierDefaultImpls;
import o.LayoutModifierImpl;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.PreviewUnderExposureQuirk;
import o.SurfaceUtil;
import o.VideoQualityQuirk;
import o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1;
import o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2;
import o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings;
import o.WindowRecomposer_androidKtgetAnimationScaleFlowFor111;
import o.WrappedCompositionsetContent1211;
import o.accessgetDrawBlockCanvasp;
import o.accessgetPrecomposeMapp;
import o.accessgetRootp;
import o.accessgetSystemNavigationDowncp;
import o.accesssetCurrentIndexp;
import o.accesssetDrawBlockCanvasp;
import o.ancestorToLocalS_NoaFU;
import o.createMeasureResult;
import o.fromParentPosition8S9VItkdefault;
import o.getContentChild;
import o.getMeasurable;
import o.getOriginalEventPositionF1C5BW0ui;
import o.getPanOffsetF1C5BW0;
import o.getParentData;
import o.getRectManager;
import o.headNode;
import o.nodeUpdated;
import o.offsetFromEdgeMKHz9U;
import o.onEndApplyChanges;
import o.preTranslate3XD1CNM;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.resetLayoutState;
import o.setDownChange;
import o.setDropDownVerticalOffset;
import o.setRequestedFrameRate;

/* JADX INFO: loaded from: classes2.dex */
public final class zzm implements DeferrableSurfaceSurfaceUnavailableException, preTranslate3XD1CNM {
    public Object IconCompatParcelizer;
    public Object RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public int write;

    public getContentChild IconCompatParcelizer() {
        WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings = (WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings) this.read;
        if (windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings instanceof WindowRecomposer_androidKtgetAnimationScaleFlowFor111) {
            return ((WindowRecomposer_androidKtgetAnimationScaleFlowFor111) windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings).read;
        }
        return windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings instanceof WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2 ? ((WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2) windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings).read : (getContentChild) this.IconCompatParcelizer;
    }

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public DrawModifierNodeKt RemoteActionCompatParcelizer() {
        Object obj = ((AtomicReference) this.read).get();
        return obj instanceof PreviewUnderExposureQuirk ? new EncoderImplMediaCodecCallback(0, null) : VideoQualityQuirk.read(obj);
    }

    public void read(Object obj) {
        Iterator it;
        int i;
        synchronized (this.IconCompatParcelizer) {
            if (Objects.equals(((AtomicReference) this.read).getAndSet(obj), obj)) {
                return;
            }
            int i2 = this.write + 1;
            this.write = i2;
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            Iterator it2 = ((CopyOnWriteArraySet) this.RatingCompat).iterator();
            while (true) {
                if (it2.hasNext()) {
                    ((SurfaceUtil) it2.next()).write(i2);
                } else {
                    synchronized (this.IconCompatParcelizer) {
                        if (this.write == i2) {
                            this.RemoteActionCompatParcelizer = false;
                            return;
                        } else {
                            it = ((CopyOnWriteArraySet) this.RatingCompat).iterator();
                            i = this.write;
                        }
                    }
                    it2 = it;
                    i2 = i;
                }
            }
        }
    }

    public void read(accessgetDrawBlockCanvasp accessgetdrawblockcanvasp) {
        boolean z;
        Vw$Vw vw$Vw;
        if (accessgetdrawblockcanvasp != ((accessgetDrawBlockCanvasp) this.IconCompatParcelizer)) {
            this.IconCompatParcelizer = accessgetdrawblockcanvasp;
            ancestorToLocalS_NoaFU ancestortolocals_noafuSerializer = ((i$c) ((PinnableContainerKtLocalPinnableContainer1) ((DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5) this.RatingCompat).serializer).serializer).serializer();
            ancestortolocals_noafuSerializer.write("handleOnlineStateChange");
            ArrayList arrayList = new ArrayList();
            Iterator it = ancestortolocals_noafuSerializer.RatingCompat.entrySet().iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                headNode headnode = ((fromParentPosition8S9VItkdefault) ((Map.Entry) it.next()).getValue()).write;
                Object obj = null;
                if (headnode.IconCompatParcelizer && accessgetdrawblockcanvasp == accessgetDrawBlockCanvasp.OFFLINE) {
                    headnode.IconCompatParcelizer = false;
                    vw$Vw = headnode.serializer(new DiskLruCache$Editor(headnode.read, new PerformanceTracker(2), headnode.write, false), null, false);
                } else {
                    vw$Vw = new Vw$Vw(obj, 6, Collections.EMPTY_LIST);
                }
                getRectManager.RemoteActionCompatParcelizer(((List) vw$Vw.IconCompatParcelizer).isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
                offsetFromEdgeMKHz9U offsetfromedgemkhz9u = (offsetFromEdgeMKHz9U) vw$Vw.serializer;
                if (offsetfromedgemkhz9u != null) {
                    arrayList.add(offsetfromedgemkhz9u);
                }
            }
            ancestortolocals_noafuSerializer.ParcelableVolumeInfo.read(arrayList);
            TransitionValuesMaps transitionValuesMaps = ancestortolocals_noafuSerializer.ParcelableVolumeInfo;
            transitionValuesMaps.RatingCompat = accessgetdrawblockcanvasp;
            Iterator it2 = ((HashMap) transitionValuesMaps.MediaDescriptionCompat).values().iterator();
            while (it2.hasNext()) {
                for (accesssetDrawBlockCanvasp accesssetdrawblockcanvasp : ((nodeUpdated) it2.next()).write) {
                    accesssetdrawblockcanvasp.read = accessgetdrawblockcanvasp;
                    offsetFromEdgeMKHz9U offsetfromedgemkhz9u2 = accesssetdrawblockcanvasp.MediaDescriptionCompat;
                    if (offsetfromedgemkhz9u2 != null && !accesssetdrawblockcanvasp.IconCompatParcelizer && accesssetdrawblockcanvasp.write(offsetfromedgemkhz9u2, accessgetdrawblockcanvasp)) {
                        accesssetdrawblockcanvasp.read(accesssetdrawblockcanvasp.MediaDescriptionCompat);
                        z = true;
                    }
                }
            }
            if (z) {
                transitionValuesMaps.RatingCompat();
            }
        }
    }

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public void serializer(Executor executor, CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException) {
        SurfaceUtil surfaceUtil;
        synchronized (this.IconCompatParcelizer) {
            serializer(cameraValidatorCameraIdListIncorrectException);
            surfaceUtil = new SurfaceUtil((AtomicReference) this.read, executor, cameraValidatorCameraIdListIncorrectException);
            ((HashMap) this.serializer).put(cameraValidatorCameraIdListIncorrectException, surfaceUtil);
            ((CopyOnWriteArraySet) this.RatingCompat).add(surfaceUtil);
        }
        surfaceUtil.write(0);
    }

    public void serializer(CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException) {
        SurfaceUtil surfaceUtil = (SurfaceUtil) ((HashMap) this.serializer).remove(cameraValidatorCameraIdListIncorrectException);
        if (surfaceUtil != null) {
            surfaceUtil.serializer.set(false);
            ((CopyOnWriteArraySet) this.RatingCompat).remove(surfaceUtil);
        }
    }

    public void serializer(WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings, zp zpVar) {
        WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1 windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1;
        this.read = windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings;
        if (this.RemoteActionCompatParcelizer || (windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1 = (WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1) this.serializer) == null) {
            WrappedCompositionsetContent1211.write("TaskRequest", "request is time out,tid:" + ((String) this.RatingCompat));
        } else if (((WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings) ((zzm) zpVar.IconCompatParcelizer).read) instanceof WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2) {
            windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1.write(windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings.read);
        } else if (zpVar.write == ((List) zpVar.serializer).size() - 1) {
            ((WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer1) this.serializer).serializer(windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2WhenMappings.read);
        } else {
            zpVar.serializer();
        }
    }

    public void serializer(accessgetDrawBlockCanvasp accessgetdrawblockcanvasp) {
        x xVar = (x) this.read;
        if (xVar != null) {
            xVar.cancel();
            this.read = null;
        }
        this.write = 0;
        if (accessgetdrawblockcanvasp == accessgetDrawBlockCanvasp.ONLINE) {
            this.RemoteActionCompatParcelizer = false;
        }
        read(accessgetdrawblockcanvasp);
    }

    @Override // o.preTranslate3XD1CNM
    public void t_() {
        LayoutModifierDefaultImpls layoutModifierDefaultImpls = (LayoutModifierDefaultImpls) this.RatingCompat;
        if (layoutModifierDefaultImpls != null) {
            try {
                layoutModifierDefaultImpls.write(3, layoutModifierDefaultImpls.RemoteActionCompatParcelizer());
            } catch (RemoteException e) {
                SentryLogcatAdapter.read("LegacyFaceDelegate", "Failed to release legacy face detector.", e);
            }
            this.RatingCompat = null;
        }
    }

    @Override // o.DeferrableSurfaceSurfaceUnavailableException
    public void write(CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException) {
        synchronized (this.IconCompatParcelizer) {
            serializer(cameraValidatorCameraIdListIncorrectException);
        }
    }

    @Override // o.preTranslate3XD1CNM
    public Pair zza(setRequestedFrameRate setrequestedframerate) throws MlKitException {
        zzf[] zzfVarArr;
        if (((LayoutModifierDefaultImpls) this.RatingCompat) == null) {
            zzd();
        }
        LayoutModifierDefaultImpls layoutModifierDefaultImpls = (LayoutModifierDefaultImpls) this.RatingCompat;
        if (layoutModifierDefaultImpls == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        try {
            zzp zzpVar = new zzp(SystemClock.elapsedRealtime(), setrequestedframerate.read, setrequestedframerate.IconCompatParcelizer, 0, getParentData.RemoteActionCompatParcelizer(setrequestedframerate.MediaBrowserCompatMediaItem));
            if (setrequestedframerate.MediaSessionCompatQueueItem != 35 || this.write < 201500000) {
                ObjectWrapper objectWrapper = new ObjectWrapper(getMeasurable.write(setrequestedframerate));
                Parcel parcelRemoteActionCompatParcelizer = layoutModifierDefaultImpls.RemoteActionCompatParcelizer();
                int i = ContentScaleCompanionCrop1.read;
                parcelRemoteActionCompatParcelizer.writeStrongBinder(objectWrapper);
                parcelRemoteActionCompatParcelizer.writeInt(1);
                zzpVar.writeToParcel(parcelRemoteActionCompatParcelizer, 0);
                Parcel parcel = layoutModifierDefaultImpls.read(1, parcelRemoteActionCompatParcelizer);
                zzf[] zzfVarArr2 = (zzf[]) parcel.createTypedArray(zzf.CREATOR);
                parcel.recycle();
                zzfVarArr = zzfVarArr2;
            } else {
                Image.Plane[] planeArr = setrequestedframerate.read();
                accessgetSystemNavigationDowncp.IconCompatParcelizer(planeArr);
                zzfVarArr = layoutModifierDefaultImpls.read(new ObjectWrapper(planeArr[0].getBuffer()), new ObjectWrapper(planeArr[1].getBuffer()), new ObjectWrapper(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), zzpVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzf zzfVar : zzfVarArr) {
                arrayList.add(new Face(zzfVar));
            }
            if (!((CalculateMatrixToWindow) this.read).read) {
                AtomicBoolean atomicBoolean = zzh.read;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Face) it.next()).RemoteActionCompatParcelizer = -1;
                }
            }
            return new Pair(arrayList, null);
        } catch (RemoteException e) {
            throw new MlKitException("Failed to detect with legacy face detector", 13, e);
        }
    }

    @Override // o.preTranslate3XD1CNM
    public boolean zzd() throws MlKitException {
        createMeasureResult layoutModifierImpl;
        int i;
        int i2;
        Context context = (Context) this.IconCompatParcelizer;
        CalculateMatrixToWindow calculateMatrixToWindow = (CalculateMatrixToWindow) this.read;
        boolean z = false;
        if (((LayoutModifierDefaultImpls) this.RatingCompat) != null) {
            return false;
        }
        try {
            IBinder iBinderRemoteActionCompatParcelizer = DynamiteModule.load(context, DynamiteModule.RemoteActionCompatParcelizer, "com.google.android.gms.vision.dynamite").RemoteActionCompatParcelizer("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
            int i3 = accesssetCurrentIndexp.write;
            if (iBinderRemoteActionCompatParcelizer == null) {
                layoutModifierImpl = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderRemoteActionCompatParcelizer.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                layoutModifierImpl = iInterfaceQueryLocalInterface instanceof createMeasureResult ? (createMeasureResult) iInterfaceQueryLocalInterface : new LayoutModifierImpl(iBinderRemoteActionCompatParcelizer, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
            }
            ObjectWrapper objectWrapper = new ObjectWrapper(context);
            if (((LayoutModifierDefaultImpls) this.RatingCompat) == null) {
                int i4 = calculateMatrixToWindow.IconCompatParcelizer;
                if (i4 == 1) {
                    i = 0;
                } else if (i4 == 2) {
                    i = 1;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i4, "Invalid landmark type: "));
                    i = 0;
                }
                int i5 = calculateMatrixToWindow.RemoteActionCompatParcelizer;
                if (i5 == 1) {
                    i2 = 0;
                } else if (i5 == 2) {
                    i2 = 1;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i5, "Invalid classification type: "));
                    i2 = 0;
                }
                this.RatingCompat = ((LayoutModifierImpl) layoutModifierImpl).RemoteActionCompatParcelizer(objectWrapper, new com.google.android.gms.internal.mlkit_vision_face.zzh(0, i, i2, false, calculateMatrixToWindow.read, calculateMatrixToWindow.write));
            }
            if (((LayoutModifierDefaultImpls) this.RatingCompat) == null && !this.RemoteActionCompatParcelizer) {
                Feature[] featureArr = OptionalModuleUtils.write;
                setDownChange setdownchange = getOriginalEventPositionF1C5BW0ui.write;
                Object[] objArr = {"barcode"};
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.write(1, objArr);
                OptionalModuleUtils.RemoteActionCompatParcelizer(context, new getPanOffsetF1C5BW0(1, objArr));
                this.RemoteActionCompatParcelizer = true;
            }
            resetLayoutState resetlayoutstate = (resetLayoutState) this.serializer;
            accessgetPrecomposeMapp accessgetprecomposemapp = accessgetPrecomposeMapp.NO_ERROR;
            AtomicReference atomicReference = ChainedPlatformTextInputInterceptor.read;
            resetlayoutstate.IconCompatParcelizer(new setDropDownVerticalOffset(accessgetprecomposemapp, z), accessgetRootp.ON_DEVICE_FACE_LOAD);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException("Failed to create legacy face detector.", 13, e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }

    public void read(String str) {
        String strM = ff$$ExternalSyntheticOutline0.m("Could not reach Cloud Firestore backend. ", str, "\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.");
        if (this.RemoteActionCompatParcelizer) {
            onEndApplyChanges.RemoteActionCompatParcelizer("OnlineStateTracker", "%s", strM);
            this.RemoteActionCompatParcelizer = false;
        } else {
            onEndApplyChanges.read("OnlineStateTracker", "%s", strM);
        }
    }

    public zzm(Object obj) {
        this.IconCompatParcelizer = new Object();
        this.write = 0;
        this.RemoteActionCompatParcelizer = false;
        this.serializer = new HashMap();
        this.RatingCompat = new CopyOnWriteArraySet();
        this.read = new AtomicReference(obj);
    }

    public zzm(Context context, CalculateMatrixToWindow calculateMatrixToWindow, resetLayoutState resetlayoutstate) {
        this.IconCompatParcelizer = context;
        this.read = calculateMatrixToWindow;
        this.write = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
        this.serializer = resetlayoutstate;
    }

    public zzm() {
    }
}
