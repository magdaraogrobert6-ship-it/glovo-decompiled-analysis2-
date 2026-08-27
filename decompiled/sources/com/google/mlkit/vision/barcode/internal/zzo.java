package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.huawei.hmf.tasks.a.i$d;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import o.AutoClearFocusBehaviorCompanion;
import o.HoverIconModifierNodefindDescendantNodeWithCursorInBounds1;
import o.MatrixPositionCalculator;
import o.PointerTypeCompanion;
import o.accessgetStyluscp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetVolumeMutecp;
import o.calculateWindowSize;
import o.getEraserT8wyACA;
import o.getMotionEvent;
import o.getMouseT8wyACA;
import o.getParentData;
import o.isRelevantPointerTypeuerMTgs;
import o.setRequestedFrameRate;
import o.toMotionEventScoped4ec7I;

/* JADX INFO: loaded from: classes2.dex */
public final class zzo implements AutoClearFocusBehaviorCompanion {
    public static final MatrixPositionCalculator RemoteActionCompatParcelizer;
    public boolean IconCompatParcelizer;
    public final calculateWindowSize MediaBrowserCompatMediaItem;
    public getEraserT8wyACA MediaSessionCompatQueueItem;
    public final toMotionEventScoped4ec7I RatingCompat;
    public boolean read;
    public boolean serializer;
    public final Context write;

    public static boolean serializer(Context context) {
        return DynamiteModule.write(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    public final getEraserT8wyACA zze(accessgetVolumeMutecp accessgetvolumemutecp, String str, String str2) throws DynamiteModule.LoadingException {
        PointerTypeCompanion accessgetstyluscp;
        Context context = this.write;
        IBinder iBinderRemoteActionCompatParcelizer = DynamiteModule.load(context, accessgetvolumemutecp, str).RemoteActionCompatParcelizer(str2);
        int i = getMouseT8wyACA.RemoteActionCompatParcelizer;
        getEraserT8wyACA geterasert8wyaca = null;
        if (iBinderRemoteActionCompatParcelizer == null) {
            accessgetstyluscp = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderRemoteActionCompatParcelizer.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
            accessgetstyluscp = iInterfaceQueryLocalInterface instanceof PointerTypeCompanion ? (PointerTypeCompanion) iInterfaceQueryLocalInterface : new accessgetStyluscp(iBinderRemoteActionCompatParcelizer, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        zzyd zzydVar = new zzyd(this.MediaBrowserCompatMediaItem.IconCompatParcelizer, false);
        accessgetStyluscp accessgetstyluscp2 = (accessgetStyluscp) accessgetstyluscp;
        Parcel parcel = accessgetstyluscp2.read();
        int i2 = isRelevantPointerTypeuerMTgs.IconCompatParcelizer;
        parcel.writeStrongBinder(objectWrapper);
        parcel.writeInt(1);
        zzydVar.writeToParcel(parcel, 0);
        Parcel parcelSerializer = accessgetstyluscp2.serializer(1, parcel);
        IBinder strongBinder = parcelSerializer.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            geterasert8wyaca = iInterfaceQueryLocalInterface2 instanceof getEraserT8wyACA ? (getEraserT8wyACA) iInterfaceQueryLocalInterface2 : new getEraserT8wyACA(strongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
        }
        parcelSerializer.recycle();
        return geterasert8wyaca;
    }

    public zzo(Context context, calculateWindowSize calculatewindowsize, toMotionEventScoped4ec7I tomotioneventscoped4ec7i) {
        this.write = context;
        this.MediaBrowserCompatMediaItem = calculatewindowsize;
        this.RatingCompat = tomotioneventscoped4ec7i;
    }

    @Override // o.AutoClearFocusBehaviorCompanion
    public final void IconCompatParcelizer() {
        getEraserT8wyACA geterasert8wyaca = this.MediaSessionCompatQueueItem;
        if (geterasert8wyaca != null) {
            try {
                geterasert8wyaca.IconCompatParcelizer(2, geterasert8wyaca.read());
            } catch (RemoteException e) {
                SentryLogcatAdapter.read("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.MediaSessionCompatQueueItem = null;
            this.read = false;
        }
    }

    @Override // o.AutoClearFocusBehaviorCompanion
    public final ArrayList zza(setRequestedFrameRate setrequestedframerate) throws Throwable {
        if (this.MediaSessionCompatQueueItem == null) {
            zzc();
        }
        getEraserT8wyACA geterasert8wyaca = this.MediaSessionCompatQueueItem;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(geterasert8wyaca);
        if (!this.read) {
            try {
                geterasert8wyaca.IconCompatParcelizer(1, geterasert8wyaca.read());
                this.read = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e);
            }
        }
        int rowStride = setrequestedframerate.read;
        if (setrequestedframerate.MediaSessionCompatQueueItem == 35) {
            Image.Plane[] planeArr = setrequestedframerate.read();
            accessgetSystemNavigationDowncp.IconCompatParcelizer(planeArr);
            rowStride = planeArr[0].getRowStride();
        }
        int i = setrequestedframerate.MediaSessionCompatQueueItem;
        zzyu zzyuVar = new zzyu(SystemClock.elapsedRealtime(), i, rowStride, setrequestedframerate.IconCompatParcelizer, getParentData.RemoteActionCompatParcelizer(setrequestedframerate.MediaBrowserCompatMediaItem));
        ImageUtils.write.getClass();
        ObjectWrapper imageDataWrapper = ImageUtils.getImageDataWrapper(setrequestedframerate);
        try {
            Parcel parcel = geterasert8wyaca.read();
            int i2 = isRelevantPointerTypeuerMTgs.IconCompatParcelizer;
            parcel.writeStrongBinder(imageDataWrapper);
            parcel.writeInt(1);
            zzyuVar.writeToParcel(parcel, 0);
            Parcel parcelSerializer = geterasert8wyaca.serializer(3, parcel);
            ArrayList arrayListCreateTypedArrayList = parcelSerializer.createTypedArrayList(zzyb.CREATOR);
            parcelSerializer.recycle();
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListCreateTypedArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(new Barcode(new i$d.a(4, (zzyb) it.next())));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (((com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse) kotlin.LazyKt__LazyJVMKt.read(r1)).write == false) goto L40;
     */
    @Override // o.AutoClearFocusBehaviorCompanion
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.barcode.internal.zzo.zzc():boolean");
    }

    static {
        HoverIconModifierNodefindDescendantNodeWithCursorInBounds1 hoverIconModifierNodefindDescendantNodeWithCursorInBounds1 = getMotionEvent.RemoteActionCompatParcelizer;
        Object[] objArr = {"com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite"};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "at index "));
                return;
            }
        }
        RemoteActionCompatParcelizer = new MatrixPositionCalculator(2, objArr);
    }
}
