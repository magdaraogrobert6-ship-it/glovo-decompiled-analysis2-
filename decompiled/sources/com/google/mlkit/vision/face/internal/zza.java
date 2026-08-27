package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.face.Face;
import io.sentry.android.core.SentryLogcatAdapter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.CalculateMatrixToWindow;
import o.ChainedPlatformTextInputInterceptor;
import o.ContentScaleCompanionCrop1;
import o.accessgetPrecomposeMapp;
import o.accessgetRootp;
import o.accessgetVolumeMutecp;
import o.disposeOrReuseStartingFromIndex;
import o.getCompositionContext;
import o.getMeasurable;
import o.getOriginalEventPositionF1C5BW0ui;
import o.getPanOffsetF1C5BW0;
import o.getParentData;
import o.preTranslate3XD1CNM;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.resetLayoutState;
import o.setDownChange;
import o.setDropDownVerticalOffset;
import o.setRequestedFrameRate;
import o.subcompose;
import o.takeNodeFromReusables;

/* JADX INFO: loaded from: classes2.dex */
public final class zza implements preTranslate3XD1CNM {
    public boolean IconCompatParcelizer;
    public final resetLayoutState MediaSessionCompatQueueItem;
    public subcompose RatingCompat;
    public final CalculateMatrixToWindow RemoteActionCompatParcelizer;
    public boolean read;
    public final Context serializer;
    public boolean write;

    public static boolean read(Context context) {
        return DynamiteModule.write(context, "com.google.mlkit.dynamite.face") > 0;
    }

    public final subcompose zze(accessgetVolumeMutecp accessgetvolumemutecp, String str, String str2, zzou zzouVar) throws DynamiteModule.LoadingException {
        IInterface takenodefromreusables;
        Context context = this.serializer;
        IBinder iBinderRemoteActionCompatParcelizer = DynamiteModule.load(context, accessgetvolumemutecp, str).RemoteActionCompatParcelizer(str2);
        int i = getCompositionContext.RemoteActionCompatParcelizer;
        subcompose subcomposeVar = null;
        if (iBinderRemoteActionCompatParcelizer == null) {
            takenodefromreusables = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderRemoteActionCompatParcelizer.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
            takenodefromreusables = iInterfaceQueryLocalInterface instanceof disposeOrReuseStartingFromIndex ? (disposeOrReuseStartingFromIndex) iInterfaceQueryLocalInterface : new takeNodeFromReusables(iBinderRemoteActionCompatParcelizer, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        takeNodeFromReusables takenodefromreusables2 = (takeNodeFromReusables) takenodefromreusables;
        Parcel parcelRemoteActionCompatParcelizer = takenodefromreusables2.RemoteActionCompatParcelizer();
        int i2 = ContentScaleCompanionCrop1.read;
        parcelRemoteActionCompatParcelizer.writeStrongBinder(objectWrapper);
        parcelRemoteActionCompatParcelizer.writeInt(1);
        zzouVar.writeToParcel(parcelRemoteActionCompatParcelizer, 0);
        Parcel parcel = takenodefromreusables2.read(1, parcelRemoteActionCompatParcelizer);
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            subcomposeVar = iInterfaceQueryLocalInterface2 instanceof subcompose ? (subcompose) iInterfaceQueryLocalInterface2 : new subcompose(strongBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector");
        }
        parcel.recycle();
        return subcomposeVar;
    }

    public zza(Context context, CalculateMatrixToWindow calculateMatrixToWindow, resetLayoutState resetlayoutstate) {
        this.serializer = context;
        this.RemoteActionCompatParcelizer = calculateMatrixToWindow;
        this.MediaSessionCompatQueueItem = resetlayoutstate;
    }

    @Override // o.preTranslate3XD1CNM
    public final void t_() {
        try {
            subcompose subcomposeVar = this.RatingCompat;
            if (subcomposeVar != null) {
                subcomposeVar.write(2, subcomposeVar.RemoteActionCompatParcelizer());
                this.RatingCompat = null;
            }
        } catch (RemoteException e) {
            SentryLogcatAdapter.read("DecoupledFaceDelegate", "Failed to release face detector.", e);
        }
        this.write = false;
    }

    @Override // o.preTranslate3XD1CNM
    public final Pair zza(setRequestedFrameRate setrequestedframerate) throws MlKitException {
        ArrayList arrayList;
        if (this.RatingCompat == null) {
            zzd();
        }
        if (!this.write) {
            try {
                subcompose subcomposeVar = this.RatingCompat;
                if (subcomposeVar != null) {
                    subcomposeVar.write(1, subcomposeVar.RemoteActionCompatParcelizer());
                }
                this.write = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init face detector.", 13, e);
            }
        }
        subcompose subcomposeVar2 = this.RatingCompat;
        if (subcomposeVar2 != null) {
            if (setrequestedframerate.MediaSessionCompatQueueItem == -1) {
                ByteBuffer byteBufferWrite = getMeasurable.write(setrequestedframerate);
                int i = setrequestedframerate.read;
                int i2 = setrequestedframerate.IconCompatParcelizer;
                int i3 = setrequestedframerate.MediaBrowserCompatMediaItem;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                setrequestedframerate = new setRequestedFrameRate(byteBufferWrite, i, i2, i3);
                setRequestedFrameRate.write(17, 3, jElapsedRealtime, i2, i, byteBufferWrite.limit(), i3);
            }
            zzoq zzoqVar = new zzoq(SystemClock.elapsedRealtime(), setrequestedframerate.MediaSessionCompatQueueItem, setrequestedframerate.read, setrequestedframerate.IconCompatParcelizer, getParentData.RemoteActionCompatParcelizer(setrequestedframerate.MediaBrowserCompatMediaItem));
            ImageUtils.write.getClass();
            ObjectWrapper imageDataWrapper = ImageUtils.getImageDataWrapper(setrequestedframerate);
            try {
                Parcel parcelRemoteActionCompatParcelizer = subcomposeVar2.RemoteActionCompatParcelizer();
                int i4 = ContentScaleCompanionCrop1.read;
                parcelRemoteActionCompatParcelizer.writeStrongBinder(imageDataWrapper);
                parcelRemoteActionCompatParcelizer.writeInt(1);
                zzoqVar.writeToParcel(parcelRemoteActionCompatParcelizer, 0);
                Parcel parcel = subcomposeVar2.read(3, parcelRemoteActionCompatParcelizer);
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzow.CREATOR);
                parcel.recycle();
                arrayList = new ArrayList();
                Iterator it = arrayListCreateTypedArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Face((zzow) it.next()));
                }
                if (!this.RemoteActionCompatParcelizer.read) {
                    AtomicBoolean atomicBoolean = zzh.read;
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((Face) it2.next()).RemoteActionCompatParcelizer = -1;
                    }
                }
            } catch (RemoteException e2) {
                throw new MlKitException("Failed to run face detector.", 13, e2);
            }
        } else {
            arrayList = null;
        }
        return new Pair(arrayList, null);
    }

    public final void write() {
        if (this.RatingCompat == null) {
            CalculateMatrixToWindow calculateMatrixToWindow = this.RemoteActionCompatParcelizer;
            zzou zzouVar = new zzou(1, calculateMatrixToWindow.IconCompatParcelizer, calculateMatrixToWindow.RemoteActionCompatParcelizer, 1, calculateMatrixToWindow.read, calculateMatrixToWindow.write);
            this.RatingCompat = this.read ? zze(DynamiteModule.IconCompatParcelizer, "com.google.mlkit.dynamite.face", "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", zzouVar) : zze(DynamiteModule.RemoteActionCompatParcelizer, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", zzouVar);
        }
    }

    @Override // o.preTranslate3XD1CNM
    public final boolean zzd() throws MlKitException {
        if (this.RatingCompat != null) {
            return this.read;
        }
        Context context = this.serializer;
        int iWrite = DynamiteModule.write(context, "com.google.mlkit.dynamite.face");
        resetLayoutState resetlayoutstate = this.MediaSessionCompatQueueItem;
        if (iWrite > 0) {
            this.read = true;
            try {
                write();
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create thick face detector.", 13, e);
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException("Failed to load the bundled face module.", 13, e2);
            }
        } else {
            this.read = false;
            try {
                write();
            } catch (RemoteException e3) {
                boolean z = this.read;
                accessgetPrecomposeMapp accessgetprecomposemapp = accessgetPrecomposeMapp.OPTIONAL_MODULE_INIT_ERROR;
                AtomicReference atomicReference = ChainedPlatformTextInputInterceptor.read;
                resetlayoutstate.IconCompatParcelizer(new setDropDownVerticalOffset(accessgetprecomposemapp, z), accessgetRootp.ON_DEVICE_FACE_LOAD);
                throw new MlKitException("Failed to create thin face detector.", 13, e3);
            } catch (DynamiteModule.LoadingException e4) {
                if (!this.IconCompatParcelizer) {
                    Feature[] featureArr = OptionalModuleUtils.write;
                    setDownChange setdownchange = getOriginalEventPositionF1C5BW0ui.write;
                    Object[] objArr = {"face"};
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.write(1, objArr);
                    OptionalModuleUtils.RemoteActionCompatParcelizer(context, new getPanOffsetF1C5BW0(1, objArr));
                    this.IconCompatParcelizer = true;
                }
                boolean z2 = this.read;
                accessgetPrecomposeMapp accessgetprecomposemapp2 = accessgetPrecomposeMapp.OPTIONAL_MODULE_NOT_AVAILABLE;
                AtomicReference atomicReference2 = ChainedPlatformTextInputInterceptor.read;
                resetlayoutstate.IconCompatParcelizer(new setDropDownVerticalOffset(accessgetprecomposemapp2, z2), accessgetRootp.ON_DEVICE_FACE_LOAD);
                throw new MlKitException("Waiting for the face module to be downloaded. Please wait.", 14, e4);
            }
        }
        boolean z3 = this.read;
        accessgetPrecomposeMapp accessgetprecomposemapp3 = accessgetPrecomposeMapp.NO_ERROR;
        AtomicReference atomicReference3 = ChainedPlatformTextInputInterceptor.read;
        resetlayoutstate.IconCompatParcelizer(new setDropDownVerticalOffset(accessgetprecomposemapp3, z3), accessgetRootp.ON_DEVICE_FACE_LOAD);
        return this.read;
    }
}
