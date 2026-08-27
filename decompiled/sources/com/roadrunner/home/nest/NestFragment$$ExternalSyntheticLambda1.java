package com.roadrunner.home.nest;

import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.room.RoomDatabase$createConnectionManager$2;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.compose.SwitcherKt$Switcher$2$1;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$QrScanScreen$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.compose.QrPaymentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.compose.ShowQrCodeKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.navigation.PinScreenArgs;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment$onCreateView$1$1$1$1;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenViewModel;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.compose.PinScreenContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.compose.QrScannerScreenKt;
import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.compose.SignatureContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.compose.TakePictureKt;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsKt;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryScreenKt;
import com.roadrunner.diagnostics.presentation.fragment.SettingsNotificationsDiagnosticsFragment;
import com.roadrunner.diagnostics.presentation.fragment.SettingsNotificationsDiagnosticsFragment$$ExternalSyntheticLambda0;
import com.roadrunner.diagnostics.presentation.view.NotificationsDiagnosticsScreenKt;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.location.toggle.presentation.LocationToggleFloatingContentKt;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import o.AndroidContentCaptureManager;
import o.C0195provider;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PreviewParameter;
import o.ShortNewsContentCardView;
import o.WorkerWrapperKt;
import o.accessgetCountjd;
import o.accessgetMaxcp;
import o.copyiSbpLlY;
import o.createFromParcel;
import o.ef;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getDisplayName;
import o.getFontScaleannotations;
import o.getHeightD9Ej5fM;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.getReferencedIds;
import o.getTopD9Ej5fMannotations;
import o.getYD9Ej5fM;
import o.getYD9Ej5fMannotations;
import o.getZeroMYxV2XQ;
import o.isEmimpl;
import o.lerp81ZRxRo;
import o.plusCBMgk4;
import o.pluse_xh8Ic;
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.setNavigationOnClickListener;
import o.takeOrElseD5KLDUw;
import o.toIntRectozmzZPI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NestFragment$$ExternalSyntheticLambda1 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ NestFragment$$ExternalSyntheticLambda1(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
    }

    private final Object write(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 69;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) obj2;
        bool.getClass();
        ((LastStopSelectionCoordinator$$ExternalSyntheticLambda1) this.serializer).invoke((ef) obj, bool, Boolean.FALSE);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = write + 21;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private final Object RemoteActionCompatParcelizer(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = write + 87;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        WorkerWrapperKt workerWrapperKt = (WorkerWrapperKt) this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            int i4 = read + 73;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            int i6 = write + 5;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                LocationToggleFloatingContentKt.LocationToggleFloatingContent(workerWrapperKt, null, getpostalcode, 1);
            } else {
                LocationToggleFloatingContentKt.LocationToggleFloatingContent(workerWrapperKt, null, getpostalcode, 0);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    private final Object serializer(Object obj, Object obj2) {
        int i = 2 % 2;
        SettingsNotificationsDiagnosticsFragment settingsNotificationsDiagnosticsFragment = (SettingsNotificationsDiagnosticsFragment) this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i2 = 1;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i3 = read + 3;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(settingsNotificationsDiagnosticsFragment);
                getpostalcode.ComponentActivity();
                throw null;
            }
            getReferencedIds getreferencedids = (getReferencedIds) settingsNotificationsDiagnosticsFragment.write.MediaSessionCompatResultReceiverWrapper();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(settingsNotificationsDiagnosticsFragment);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new SettingsNotificationsDiagnosticsFragment$$ExternalSyntheticLambda0(settingsNotificationsDiagnosticsFragment, i2);
                getpostalcode.write(objComponentActivity);
            }
            NotificationsDiagnosticsScreenKt.NotificationsDiagnosticsScreen(getreferencedids, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i4 = read + 49;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 5 / 5;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c A[PHI: r1 r13 r14
  0x003c: PHI (r1v8 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl) = 
  (r1v5 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl)
  (r1v10 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl)
 binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r13v7 o.getBirthDateFull) = (r13v1 o.getBirthDateFull), (r13v8 o.getBirthDateFull) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r14v10 int) = (r14v2 int), (r14v12 int) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r1 r13 r14
  0x0031: PHI (r1v6 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl) = 
  (r1v5 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl)
  (r1v10 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl)
 binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r13v2 o.getBirthDateFull) = (r13v1 o.getBirthDateFull), (r13v8 o.getBirthDateFull) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r14v3 int) = (r14v2 int), (r14v12 int) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    private final Object invoke$com$roadrunner$delivery$pickupdropoff$tasks$takepicture$presentation$TakePictureTaskComposableFactoryV1Impl$$ExternalSyntheticLambda5(Object obj, Object obj2) {
        TakePictureTaskUiModelImpl takePictureTaskUiModelImpl;
        getBirthDateFull getbirthdatefull;
        int iIntValue;
        boolean z;
        int i = 2 % 2;
        int i2 = read + 97;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            takePictureTaskUiModelImpl = (TakePictureTaskUiModelImpl) this.serializer;
            getbirthdatefull = (getBirthDateFull) obj;
            iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 2) != 5) {
                int i3 = read + 31;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            takePictureTaskUiModelImpl = (TakePictureTaskUiModelImpl) this.serializer;
            getbirthdatefull = (getBirthDateFull) obj;
            iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 3) != 2) {
                int i5 = read + 31;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            boolean z2 = getpostalcode.read(takePictureTaskUiModelImpl);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new NestFragment.AnonymousClass1(1, takePictureTaskUiModelImpl, TakePictureTaskUiModelImpl.class, "requestOpenCamera", "requestOpenCamera(Lcom/roadrunner/delivery/pickupdropoff/tasks/model/TakePictureTaskUiItem;)V", 0, 1);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity);
            boolean z3 = getpostalcode.read(takePictureTaskUiModelImpl);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z3) {
                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = new RoomDatabase$createConnectionManager$2(2, takePictureTaskUiModelImpl, TakePictureTaskUiModelImpl.class, "removePicture", "removePicture(Lcom/roadrunner/delivery/pickupdropoff/tasks/model/TakePictureTaskUiItem;Lcom/roadrunner/delivery/pickupdropoff/tasks/model/TakePictureTaskUiItem$PictureStatus$PictureAdded;)V", 0, 14);
                getpostalcode.write(roomDatabase$createConnectionManager$2);
                int i7 = read + 123;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                objComponentActivity2 = roomDatabase$createConnectionManager$2;
            } else {
                int i9 = write + 27;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                if (objComponentActivity2 == androidContentCaptureManager) {
                    RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$3 = new RoomDatabase$createConnectionManager$2(2, takePictureTaskUiModelImpl, TakePictureTaskUiModelImpl.class, "removePicture", "removePicture(Lcom/roadrunner/delivery/pickupdropoff/tasks/model/TakePictureTaskUiItem;Lcom/roadrunner/delivery/pickupdropoff/tasks/model/TakePictureTaskUiItem$PictureStatus$PictureAdded;)V", 0, 14);
                    getpostalcode.write(roomDatabase$createConnectionManager$3);
                    int i10 = read + 123;
                    write = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    objComponentActivity2 = roomDatabase$createConnectionManager$3;
                }
            }
            TakePictureKt.TakePicture(takePictureTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity2), null, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034 A[PHI: r1 r13 r14
  0x0034: PHI (r1v8 com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl) = 
  (r1v5 com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl)
  (r1v10 com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl)
 binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r13v9 o.getBirthDateFull) = (r13v1 o.getBirthDateFull), (r13v10 o.getBirthDateFull) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r14v16 int) = (r14v2 int), (r14v18 int) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064 A[DONT_INVERT, PHI: r2 r4
  0x0064: PHI (r2v4 java.lang.Object) = (r2v3 java.lang.Object), (r2v9 java.lang.Object) binds: [B:19:0x0062, B:16:0x0055] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r4v4 o.AndroidContentCaptureManager) = (r4v3 o.AndroidContentCaptureManager), (r4v12 o.AndroidContentCaptureManager) binds: [B:19:0x0062, B:16:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r1 r13 r14
  0x0032: PHI (r1v6 com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl) = 
  (r1v5 com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl)
  (r1v10 com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl)
 binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r13v2 o.getBirthDateFull) = (r13v1 o.getBirthDateFull), (r13v10 o.getBirthDateFull) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r14v3 int) = (r14v2 int), (r14v18 int) binds: [B:8:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    private final Object invoke$com$roadrunner$delivery$pickupdropoff$tasks$signature$presentation$SignatureTaskComposableFactoryImpl$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        SignatureTaskUiModelImpl signatureTaskUiModelImpl;
        getBirthDateFull getbirthdatefull;
        int iIntValue;
        boolean z;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        boolean z2;
        Object objComponentActivity2;
        int i = 2 % 2;
        int i2 = read + 33;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            signatureTaskUiModelImpl = (SignatureTaskUiModelImpl) this.serializer;
            getbirthdatefull = (getBirthDateFull) obj;
            iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 5) != 5) {
                z = true;
            } else {
                z = false;
            }
        } else {
            signatureTaskUiModelImpl = (SignatureTaskUiModelImpl) this.serializer;
            getbirthdatefull = (getBirthDateFull) obj;
            iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            int i3 = write + 101;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                boolean z3 = getpostalcode.read(signatureTaskUiModelImpl);
                objComponentActivity = getpostalcode.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                int i4 = 3 / 0;
                if (!z3) {
                    if (objComponentActivity == androidContentCaptureManager) {
                    }
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity);
                z2 = getpostalcode.read(signatureTaskUiModelImpl);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z2 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new PinScreenFragment$onCreateView$1$1$1$1(1, signatureTaskUiModelImpl, SignatureTaskUiModelImpl.class, "onRemoveSignature", "onRemoveSignature(Lcom/roadrunner/delivery/pickupdropoff/tasks/model/SignatureTaskUiItem;)V", 0, 28);
                    getpostalcode.write(objComponentActivity2);
                }
                SignatureContentKt.Signature(signatureTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), null, getpostalcode, 0);
                int i5 = read + 23;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                boolean z4 = getpostalcode.read(signatureTaskUiModelImpl);
                objComponentActivity = getpostalcode.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (!z4) {
                    if (objComponentActivity == androidContentCaptureManager) {
                    }
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity);
                z2 = getpostalcode.read(signatureTaskUiModelImpl);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z2) {
                    objComponentActivity2 = new PinScreenFragment$onCreateView$1$1$1$1(1, signatureTaskUiModelImpl, SignatureTaskUiModelImpl.class, "onRemoveSignature", "onRemoveSignature(Lcom/roadrunner/delivery/pickupdropoff/tasks/model/SignatureTaskUiItem;)V", 0, 28);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    objComponentActivity2 = new PinScreenFragment$onCreateView$1$1$1$1(1, signatureTaskUiModelImpl, SignatureTaskUiModelImpl.class, "onRemoveSignature", "onRemoveSignature(Lcom/roadrunner/delivery/pickupdropoff/tasks/model/SignatureTaskUiItem;)V", 0, 28);
                    getpostalcode.write(objComponentActivity2);
                }
                SignatureContentKt.Signature(signatureTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), null, getpostalcode, 0);
                int i7 = read + 23;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            objComponentActivity = new PinScreenFragment$onCreateView$1$1$1$1(1, signatureTaskUiModelImpl, SignatureTaskUiModelImpl.class, "onOpenSignatureScreen", "onOpenSignatureScreen(Lcom/roadrunner/delivery/pickupdropoff/tasks/model/SignatureTaskUiItem;)V", 0, 27);
            getpostalcode.write(objComponentActivity);
            int i9 = read + 99;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            androidContentCaptureManager = androidContentCaptureManager;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity);
            z2 = getpostalcode.read(signatureTaskUiModelImpl);
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z2) {
                objComponentActivity2 = new PinScreenFragment$onCreateView$1$1$1$1(1, signatureTaskUiModelImpl, SignatureTaskUiModelImpl.class, "onRemoveSignature", "onRemoveSignature(Lcom/roadrunner/delivery/pickupdropoff/tasks/model/SignatureTaskUiItem;)V", 0, 28);
                getpostalcode.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new PinScreenFragment$onCreateView$1$1$1$1(1, signatureTaskUiModelImpl, SignatureTaskUiModelImpl.class, "onRemoveSignature", "onRemoveSignature(Lcom/roadrunner/delivery/pickupdropoff/tasks/model/SignatureTaskUiItem;)V", 0, 28);
                getpostalcode.write(objComponentActivity2);
            }
            SignatureContentKt.Signature(signatureTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), null, getpostalcode, 0);
            int i11 = read + 23;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    private final Object invoke$com$roadrunner$designsystem$mode$discovery$DarkModeDiscoveryDialogFragment$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        int i = 2 % 2;
        DarkModeDiscoveryDialogFragment darkModeDiscoveryDialogFragment = (DarkModeDiscoveryDialogFragment) this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            String strStringResource = StringResources_androidKt.stringResource(R.string.settings_appearance_discover_dialog_title, getpostalcode, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.settings_appearance_discover_dialog_description, getpostalcode, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(R.string.settings_appearance_discover_dialog_primary_action, getpostalcode, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(R.string.settings_appearance_discover_dialog_tertiary_action, getpostalcode, 0);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer) {
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, darkModeDiscoveryDialogFragment, DarkModeDiscoveryDialogFragment.class, "onOkayClicked", "onOkayClicked()V", 0, 0);
                getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1);
                objComponentActivity = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
            } else {
                int i2 = write + 77;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 90 / 0;
                    if (objComponentActivity == androidContentCaptureManager) {
                        DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, darkModeDiscoveryDialogFragment, DarkModeDiscoveryDialogFragment.class, "onOkayClicked", "onOkayClicked()V", 0, 0);
                        getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2);
                        objComponentActivity = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2;
                    }
                } else if (objComponentActivity == androidContentCaptureManager) {
                    DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, darkModeDiscoveryDialogFragment, DarkModeDiscoveryDialogFragment.class, "onOkayClicked", "onOkayClicked()V", 0, 0);
                    getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3);
                    objComponentActivity = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3;
                }
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2) {
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, darkModeDiscoveryDialogFragment, DarkModeDiscoveryDialogFragment.class, "onGoToSettings", "onGoToSettings()V", 0, 21);
                getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4);
                objComponentActivity2 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4;
            } else {
                int i4 = write + 37;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 20 / 0;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$5 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, darkModeDiscoveryDialogFragment, DarkModeDiscoveryDialogFragment.class, "onGoToSettings", "onGoToSettings()V", 0, 21);
                        getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$5);
                        objComponentActivity2 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$5;
                    }
                } else if (objComponentActivity2 == androidContentCaptureManager) {
                    DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$6 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, darkModeDiscoveryDialogFragment, DarkModeDiscoveryDialogFragment.class, "onGoToSettings", "onGoToSettings()V", 0, 21);
                    getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$6);
                    objComponentActivity2 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$6;
                }
            }
            DarkModeDiscoveryScreenKt.RemoteActionCompatParcelizer(strStringResource, strStringResource2, strStringResource3, strStringResource4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), null, getpostalcode, 0);
            int i6 = write + 13;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 4 % 4;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        r11 = r3;
        r12 = r4;
        r2 = (o.timesadjELrA) r2.MediaSessionCompatResultReceiverWrapper();
        r3 = r14.IconCompatParcelizer(r2);
        r4 = r14.ComponentActivity();
        r6 = o.getCreditCardExpirationMonth.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        if ((!r3) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r4 != r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        r4 = new com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, r2, o.timesadjELrA.class, "onCloseClick", "onCloseClick()V", 0, 20);
        r14.write(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        r2 = (o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((o.registerInAppMessageManagerlambda0) r4);
        r3 = r14.IconCompatParcelizer(r5);
        r4 = r14.ComponentActivity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        r3 = com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1.read + 47;
        com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        if (r4 != r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        r13 = new com.roadrunner.home.nest.NestFragment$onCreateView$1$1$1$1(3, r5, com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsFragment.class, "showSnackbar", "showSnackbar(Ljava/lang/String;Lcom/ui/common/util/SnackbarType;I)V", 0, 7);
        r14.write(r13);
        r3 = com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1.write + 27;
        com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1.read = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d2, code lost:
    
        com.roadrunner.delivery.stacked.delivery.details.ui.compose.StackedDeliveryDetailsContentKt.StackedDeliveryDetailsContent(r11, r12, r2, (o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((o.registerInAppMessageManagerlambda0) r4), null, r14, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        o.removeNodeAtDepth.serializer("pickupDropOffSingleDeliveryComposableFactory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e7, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invoke$com$roadrunner$delivery$stacked$delivery$details$ui$StackedDeliveryDetailsFragment$$ExternalSyntheticLambda2(java.lang.Object r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1.invoke$com$roadrunner$delivery$stacked$delivery$details$ui$StackedDeliveryDetailsFragment$$ExternalSyntheticLambda2(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v20 ??, still in use, count: 1, list:
          (r4v20 ?? I:java.lang.Object) from 0x00dc: INVOKE (r3v2 ?? I:o.getPostalCode), (r4v20 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:191)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private final java.lang.Object invoke$com$roadrunner$inappnotifications$presentation$InAppNotificationsFragment$$ExternalSyntheticLambda3(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v20 ??, still in use, count: 1, list:
          (r4v20 ?? I:java.lang.Object) from 0x00dc: INVOKE (r3v2 ?? I:o.getPostalCode), (r4v20 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:191)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    private final Object invoke$com$roadrunner$delivery$pickupdropoff$tasks$qrscan$presentation$pin$PinScreenFragment$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        boolean zIconCompatParcelizer;
        PinScreenArgs pinScreenArgs;
        int i = 2 % 2;
        PinScreenFragment pinScreenFragment = (PinScreenFragment) this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        boolean zWrite = getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (!zWrite) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            return createfromparcel;
        }
        int i2 = read + 109;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getQueryContext getquerycontext = pinScreenFragment.serializer().MediaBrowserCompatMediaItem;
        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(pinScreenFragment);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (zIconCompatParcelizer2) {
            PinScreenFragment$onCreateView$1$1$1$1 pinScreenFragment$onCreateView$1$1$1$1 = new PinScreenFragment$onCreateView$1$1$1$1(1, pinScreenFragment, PinScreenFragment.class, "handlePendingActions", "handlePendingActions(Lcom/roadrunner/delivery/pickupdropoff/tasks/qrscan/PinScreenAction;)V", 0, 0);
            getpostalcode.write(pinScreenFragment$onCreateView$1$1$1$1);
            objComponentActivity = pinScreenFragment$onCreateView$1$1$1$1;
        } else {
            int i4 = read + 13;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
                if (objComponentActivity == androidContentCaptureManager) {
                    PinScreenFragment$onCreateView$1$1$1$1 pinScreenFragment$onCreateView$1$1$1$2 = new PinScreenFragment$onCreateView$1$1$1$1(1, pinScreenFragment, PinScreenFragment.class, "handlePendingActions", "handlePendingActions(Lcom/roadrunner/delivery/pickupdropoff/tasks/qrscan/PinScreenAction;)V", 0, 0);
                    getpostalcode.write(pinScreenFragment$onCreateView$1$1$1$2);
                    objComponentActivity = pinScreenFragment$onCreateView$1$1$1$2;
                }
            } else if (objComponentActivity == androidContentCaptureManager) {
                PinScreenFragment$onCreateView$1$1$1$1 pinScreenFragment$onCreateView$1$1$1$3 = new PinScreenFragment$onCreateView$1$1$1$1(1, pinScreenFragment, PinScreenFragment.class, "handlePendingActions", "handlePendingActions(Lcom/roadrunner/delivery/pickupdropoff/tasks/qrscan/PinScreenAction;)V", 0, 0);
                getpostalcode.write(pinScreenFragment$onCreateView$1$1$1$3);
                objComponentActivity = pinScreenFragment$onCreateView$1$1$1$3;
            }
        }
        SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 8);
        boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(pinScreenFragment);
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        int i6 = 7;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (zIconCompatParcelizer3 || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new HomeViewModel.AnonymousClass1(pinScreenFragment, shortNewsContentCardView, i6);
            getpostalcode.write(objComponentActivity2);
        }
        getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(pinScreenFragment.serializer().MediaMetadataCompat, getpostalcode, 0);
        pluse_xh8Ic pluse_xh8ic = (pluse_xh8Ic) ExtrasKt.write(pinScreenFragment.serializer().MediaDescriptionCompat, getpostalcode, 0).getValue();
        getFontScaleannotations getfontscaleannotations = (getFontScaleannotations) populateViewStructure_androidKtpopulate7Write.getValue();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getfontscaleannotations, getZeroMYxV2XQ.write}, getCieXyz.write())).booleanValue()) {
            getpostalcode.serializer(-142550498);
            getpostalcode.IconCompatParcelizer(false);
            return createfromparcel;
        }
        if (!(getfontscaleannotations instanceof copyiSbpLlY)) {
            throw d$$ExternalSyntheticOutline0.m(getpostalcode, -142553093, false);
        }
        int i7 = read + 107;
        write = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            getpostalcode.serializer(-124018656);
            accessgetCountjd accessgetcountjd = ((copyiSbpLlY) getfontscaleannotations).RemoteActionCompatParcelizer.qrScanScreen.fallbackScreen;
            pinScreenFragment.getArguments();
            throw null;
        }
        getpostalcode.serializer(-124018656);
        accessgetCountjd accessgetcountjd2 = ((copyiSbpLlY) getfontscaleannotations).RemoteActionCompatParcelizer.qrScanScreen.fallbackScreen;
        Bundle arguments = pinScreenFragment.getArguments();
        if (arguments == null || (pinScreenArgs = (PinScreenArgs) SQLite.read(arguments, "args_pin_screen", PinScreenArgs.class)) == null) {
            zIconCompatParcelizer = false;
        } else {
            zIconCompatParcelizer = pinScreenArgs.IconCompatParcelizer();
            int i8 = read + 7;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        PinScreenViewModel pinScreenViewModelSerializer = pinScreenFragment.serializer();
        boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(pinScreenViewModelSerializer);
        Object objComponentActivity3 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer4 || objComponentActivity3 == androidContentCaptureManager) {
            objComponentActivity3 = new PinScreenFragment$onCreateView$1$1$1$1(1, pinScreenViewModelSerializer, PinScreenViewModel.class, "onPinChanged", "onPinChanged(Lkotlinx/collections/immutable/ImmutableList;)V", 0, 24);
            getpostalcode.write(objComponentActivity3);
            int i10 = write + 105;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity3;
        PinScreenViewModel pinScreenViewModelSerializer2 = pinScreenFragment.serializer();
        boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(pinScreenViewModelSerializer2);
        Object objComponentActivity4 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer5 || objComponentActivity4 == androidContentCaptureManager) {
            objComponentActivity4 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, pinScreenViewModelSerializer2, PinScreenViewModel.class, "onBackOrCloseClicked", "onBackOrCloseClicked()V", 0, 11);
            getpostalcode.write(objComponentActivity4);
            int i12 = read + 115;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        PinScreenContentKt.PinScreenContent(accessgetcountjd2, zIconCompatParcelizer, pluse_xh8ic, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda0, null, getpostalcode, 0);
        getpostalcode.IconCompatParcelizer(false);
        int i14 = write + 79;
        read = i14 % Fields.SpotShadowColor;
        if (i14 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d A[PHI: r2 r5 r6
  0x003d: PHI (r2v12 com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment) = 
  (r2v5 com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment)
  (r2v14 com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment)
 binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r5v5 o.getBirthDateFull) = (r5v1 o.getBirthDateFull), (r5v7 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r6v28 int) = (r6v2 int), (r6v31 int) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x015f  */
    /* JADX WARN: Code duplicated, block: B:9:0x003b A[PHI: r2 r5 r6
  0x003b: PHI (r2v6 com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment) = 
  (r2v5 com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment)
  (r2v14 com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment)
 binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r5v2 o.getBirthDateFull) = (r5v1 o.getBirthDateFull), (r5v7 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r6v3 int) = (r6v2 int), (r6v31 int) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    private final Object invoke$com$roadrunner$delivery$pickupdropoff$tasks$qrscan$presentation$scan$QrScannerFragment$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        QrScannerFragment qrScannerFragment;
        getBirthDateFull getbirthdatefull;
        int iIntValue;
        boolean z;
        int i = 2 % 2;
        int i2 = write + 55;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            qrScannerFragment = (QrScannerFragment) this.serializer;
            getbirthdatefull = (getBirthDateFull) obj;
            iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 2) != 5) {
                z = true;
            } else {
                z = false;
            }
        } else {
            qrScannerFragment = (QrScannerFragment) this.serializer;
            getbirthdatefull = (getBirthDateFull) obj;
            iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        boolean zWrite = getpostalcode.write(iIntValue & 1, z);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (!zWrite) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            return createfromparcel;
        }
        getQueryContext getquerycontext = qrScannerFragment.serializer().RatingCompat;
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(qrScannerFragment);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
            PinScreenFragment$onCreateView$1$1$1$1 pinScreenFragment$onCreateView$1$1$1$1 = new PinScreenFragment$onCreateView$1$1$1$1(1, qrScannerFragment, QrScannerFragment.class, "handlePendingActions", "handlePendingActions(Lcom/roadrunner/delivery/pickupdropoff/tasks/qrscan/QrScanScreenAction;)V", 0, 25);
            getpostalcode.write(pinScreenFragment$onCreateView$1$1$1$1);
            objComponentActivity = pinScreenFragment$onCreateView$1$1$1$1;
        }
        int i3 = 8;
        SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 8);
        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(qrScannerFragment);
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer2) {
            objComponentActivity2 = new HomeViewModel.AnonymousClass1(qrScannerFragment, null, i3);
            getpostalcode.write(objComponentActivity2);
        } else {
            int i4 = write + 43;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new HomeViewModel.AnonymousClass1(qrScannerFragment, null, i3);
                getpostalcode.write(objComponentActivity2);
            }
        }
        getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(qrScannerFragment.serializer().MediaMetadataCompat, getpostalcode, 0);
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = ExtrasKt.write(qrScannerFragment.serializer().MediaDescriptionCompat, getpostalcode, 0);
        getFontScaleannotations getfontscaleannotations = (getFontScaleannotations) populateViewStructure_androidKtpopulate7Write.getValue();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getfontscaleannotations, getZeroMYxV2XQ.write}, getCieXyz.write())).booleanValue()) {
            getpostalcode.serializer(782368820);
            getpostalcode.IconCompatParcelizer(false);
            return createfromparcel;
        }
        if (!(getfontscaleannotations instanceof copyiSbpLlY)) {
            throw d$$ExternalSyntheticOutline0.m(getpostalcode, 782366282, false);
        }
        getpostalcode.serializer(-1516289103);
        PreviewParameter previewParameter = ((copyiSbpLlY) getfontscaleannotations).RemoteActionCompatParcelizer.qrScanScreen;
        accessgetMaxcp accessgetmaxcp = (accessgetMaxcp) populateViewStructure_androidKtpopulate7Write2.getValue();
        lerp81ZRxRo lerp81zrxroSerializer = qrScannerFragment.serializer();
        boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(lerp81zrxroSerializer);
        Object objComponentActivity3 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer3 || objComponentActivity3 == androidContentCaptureManager) {
            objComponentActivity3 = new PinScreenFragment$onCreateView$1$1$1$1(1, lerp81zrxroSerializer, lerp81ZRxRo.class, "scanQrCodes", "scanQrCodes(Ljava/util/List;)V", 0, 26);
            getpostalcode.write(objComponentActivity3);
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity3);
        lerp81ZRxRo lerp81zrxroSerializer2 = qrScannerFragment.serializer();
        boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(lerp81zrxroSerializer2);
        Object objComponentActivity4 = getpostalcode.ComponentActivity();
        if (!zIconCompatParcelizer4) {
            int i6 = read + 103;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 14 / 0;
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, lerp81zrxroSerializer2, lerp81ZRxRo.class, "closeScannerScreen", "closeScannerScreen()V", 0, 12);
                    getpostalcode.write(objComponentActivity4);
                }
            } else if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, lerp81zrxroSerializer2, lerp81ZRxRo.class, "closeScannerScreen", "closeScannerScreen()V", 0, 12);
                getpostalcode.write(objComponentActivity4);
            }
        } else {
            objComponentActivity4 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, lerp81zrxroSerializer2, lerp81ZRxRo.class, "closeScannerScreen", "closeScannerScreen()V", 0, 12);
            getpostalcode.write(objComponentActivity4);
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4);
        lerp81ZRxRo lerp81zrxroSerializer3 = qrScannerFragment.serializer();
        boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(lerp81zrxroSerializer3);
        Object objComponentActivity5 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer5 || objComponentActivity5 == androidContentCaptureManager) {
            objComponentActivity5 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, lerp81zrxroSerializer3, lerp81ZRxRo.class, "openPinScreen", "openPinScreen()V", 0, 13);
            getpostalcode.write(objComponentActivity5);
        }
        QrCodeScanTaskUiItem$QrScanScreen$Companion qrCodeScanTaskUiItem$QrScanScreen$Companion = PreviewParameter.Companion;
        QrScannerScreenKt.QrScannerScreen(previewParameter, accessgetmaxcp, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5), null, getpostalcode, 8);
        getpostalcode.IconCompatParcelizer(false);
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x013c  */
    private final Object invoke$com$roadrunner$delivery$pickupdropoff$tasks$qrpayment$presentation$QrPaymentTaskComposableFactoryImpl$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        getTopD9Ej5fMannotations gettopd9ej5fmannotations = (getTopD9Ej5fMannotations) this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            int i2 = write + 113;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(iIntValue & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i4 = write + 9;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                getpostalcode.read(gettopd9ej5fmannotations);
                getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            boolean z2 = getpostalcode.read(gettopd9ej5fmannotations);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager2) {
                SwitcherKt$Switcher$2$1 switcherKt$Switcher$2$1 = new SwitcherKt$Switcher$2$1(0, gettopd9ej5fmannotations, getTopD9Ej5fMannotations.class, "onShowQrCodeClicked", "onShowQrCodeClicked()V", 0, 29);
                getpostalcode.write(switcherKt$Switcher$2$1);
                objComponentActivity = switcherKt$Switcher$2$1;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
            boolean z3 = getpostalcode.read(gettopd9ej5fmannotations);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z3 || objComponentActivity2 == androidContentCaptureManager2) {
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, gettopd9ej5fmannotations, getTopD9Ej5fMannotations.class, "onSwitchToCashClicked", "onSwitchToCashClicked()V", 0, 1);
                getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1);
                int i5 = write + 117;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                objComponentActivity2 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity2;
            boolean z4 = getpostalcode.read(gettopd9ej5fmannotations);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z4) {
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, gettopd9ej5fmannotations, getTopD9Ej5fMannotations.class, "onSwitchToQrClicked", "onSwitchToQrClicked()V", 0, 2);
                getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2);
                objComponentActivity3 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2;
            } else {
                int i7 = read + 55;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (objComponentActivity3 == androidContentCaptureManager2) {
                    DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, gettopd9ej5fmannotations, getTopD9Ej5fMannotations.class, "onSwitchToQrClicked", "onSwitchToQrClicked()V", 0, 2);
                    getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3);
                    objComponentActivity3 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3;
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity3;
            boolean z5 = getpostalcode.read(gettopd9ej5fmannotations);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (z5) {
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, gettopd9ej5fmannotations, getTopD9Ej5fMannotations.class, "onCashPaymentEditClicked", "onCashPaymentEditClicked()V", 0, 3);
                getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4);
                objComponentActivity4 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4;
            } else {
                int i9 = read + 69;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (objComponentActivity4 == androidContentCaptureManager2) {
                    DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$5 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, gettopd9ej5fmannotations, getTopD9Ej5fMannotations.class, "onCashPaymentEditClicked", "onCashPaymentEditClicked()V", 0, 3);
                    getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$5);
                    objComponentActivity4 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$5;
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda3 = (registerInAppMessageManagerlambda0) objComponentActivity4;
            boolean z6 = getpostalcode.read(gettopd9ej5fmannotations);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (z6 || objComponentActivity5 == androidContentCaptureManager2) {
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$6 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, gettopd9ej5fmannotations, getTopD9Ej5fMannotations.class, "onCashPaymentCancelClicked", "onCashPaymentCancelClicked()V", 0, 4);
                getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$6);
                objComponentActivity5 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$6;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda4 = (registerInAppMessageManagerlambda0) objComponentActivity5;
            boolean z7 = getpostalcode.read(gettopd9ej5fmannotations);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (z7) {
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$7 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, gettopd9ej5fmannotations, getTopD9Ej5fMannotations.class, "onCashPaymentDoneClicked", "onCashPaymentDoneClicked()V", 0, 5);
                getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$7);
                objComponentActivity6 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$7;
            } else {
                int i11 = read + 57;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                if (objComponentActivity6 == androidContentCaptureManager2) {
                    DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$8 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, gettopd9ej5fmannotations, getTopD9Ej5fMannotations.class, "onCashPaymentDoneClicked", "onCashPaymentDoneClicked()V", 0, 5);
                    getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$8);
                    objComponentActivity6 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$8;
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda5 = (registerInAppMessageManagerlambda0) objComponentActivity6;
            boolean z8 = getpostalcode.read(gettopd9ej5fmannotations);
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (z8 || objComponentActivity7 == androidContentCaptureManager2) {
                PinScreenFragment$onCreateView$1$1$1$1 pinScreenFragment$onCreateView$1$1$1$1 = new PinScreenFragment$onCreateView$1$1$1$1(1, gettopd9ej5fmannotations, getTopD9Ej5fMannotations.class, "onCashPaymentAmountChanged", "onCashPaymentAmountChanged(Ljava/lang/String;)V", 0, 20);
                getpostalcode.write(pinScreenFragment$onCreateView$1$1$1$1);
                objComponentActivity7 = pinScreenFragment$onCreateView$1$1$1$1;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda6 = (registerInAppMessageManagerlambda0) objComponentActivity7;
            boolean z9 = getpostalcode.read(gettopd9ej5fmannotations);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (z9 || objComponentActivity8 == androidContentCaptureManager2) {
                PinScreenFragment$onCreateView$1$1$1$1 pinScreenFragment$onCreateView$1$1$1$2 = new PinScreenFragment$onCreateView$1$1$1$1(1, gettopd9ej5fmannotations, getTopD9Ej5fMannotations.class, "onCashPaymentShowReasons", "onCashPaymentShowReasons(Lcom/roadrunner/delivery/pickupdropoff/tasks/model/CashPaymentTaskUiItem$Reasons;)V", 0, 21);
                getpostalcode.write(pinScreenFragment$onCreateView$1$1$1$2);
                objComponentActivity8 = pinScreenFragment$onCreateView$1$1$1$2;
            }
            QrPaymentKt.IconCompatParcelizer(gettopd9ej5fmannotations, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity8), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda6, null, getpostalcode, 0);
            int i12 = read + 113;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d A[PHI: r2 r5 r6
  0x003d: PHI (r2v9 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment) = 
  (r2v5 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment)
  (r2v11 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment)
 binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r5v5 o.getBirthDateFull) = (r5v1 o.getBirthDateFull), (r5v7 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r6v18 int) = (r6v2 int), (r6v21 int) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0154  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:9:0x003b A[PHI: r2 r5 r6
  0x003b: PHI (r2v6 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment) = 
  (r2v5 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment)
  (r2v11 com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsFragment)
 binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r5v2 o.getBirthDateFull) = (r5v1 o.getBirthDateFull), (r5v7 o.getBirthDateFull) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r6v3 int) = (r6v2 int), (r6v21 int) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    private final Object invoke$com$roadrunner$delivery$pickupdropoff$tasks$takepicture$presentation$picture_with_tag$InAppCameraWithTagsFragment$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        InAppCameraWithTagsFragment inAppCameraWithTagsFragment;
        getBirthDateFull getbirthdatefull;
        int iIntValue;
        boolean z;
        int i = 2 % 2;
        int i2 = write + 117;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            inAppCameraWithTagsFragment = (InAppCameraWithTagsFragment) this.serializer;
            getbirthdatefull = (getBirthDateFull) obj;
            iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 2) != 2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            inAppCameraWithTagsFragment = (InAppCameraWithTagsFragment) this.serializer;
            getbirthdatefull = (getBirthDateFull) obj;
            iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            int i3 = write + 19;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            toIntRectozmzZPI tointrectozmzzpi = (toIntRectozmzZPI) ExtrasKt.write(inAppCameraWithTagsFragment.serializer().read, getpostalcode, 0).getValue();
            getQueryContext getquerycontext = inAppCameraWithTagsFragment.serializer().MediaSessionCompatQueueItem;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(inAppCameraWithTagsFragment);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer) {
                NestFragment.AnonymousClass1 anonymousClass1 = new NestFragment.AnonymousClass1(1, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "handleAction", "handleAction(Lcom/roadrunner/delivery/pickupdropoff/tasks/takepicture/presentation/picture_with_tag/InAppCameraAction;)V", 0, 3);
                getpostalcode.write(anonymousClass1);
                objComponentActivity = anonymousClass1;
            } else {
                int i5 = write + 77;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 19 / 0;
                    if (objComponentActivity == androidContentCaptureManager) {
                        NestFragment.AnonymousClass1 anonymousClass2 = new NestFragment.AnonymousClass1(1, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "handleAction", "handleAction(Lcom/roadrunner/delivery/pickupdropoff/tasks/takepicture/presentation/picture_with_tag/InAppCameraAction;)V", 0, 3);
                        getpostalcode.write(anonymousClass2);
                        objComponentActivity = anonymousClass2;
                    }
                } else if (objComponentActivity == androidContentCaptureManager) {
                    NestFragment.AnonymousClass1 anonymousClass3 = new NestFragment.AnonymousClass1(1, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "handleAction", "handleAction(Lcom/roadrunner/delivery/pickupdropoff/tasks/takepicture/presentation/picture_with_tag/InAppCameraAction;)V", 0, 3);
                    getpostalcode.write(anonymousClass3);
                    objComponentActivity = anonymousClass3;
                }
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 8);
            isEmimpl isemimplSerializer = inAppCameraWithTagsFragment.serializer().serializer();
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(inAppCameraWithTagsFragment);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                NestFragment.AnonymousClass1 anonymousClass4 = new NestFragment.AnonymousClass1(1, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "handlePictureError", "handlePictureError(Ljava/lang/Throwable;)V", 0, 4);
                getpostalcode.write(anonymousClass4);
                objComponentActivity2 = anonymousClass4;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity2;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(inAppCameraWithTagsFragment);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (!(!zIconCompatParcelizer3)) {
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "cancelPhotoAction", "cancelPhotoAction()V", 0, 16);
                getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1);
                objComponentActivity3 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
            } else {
                int i7 = write + 105;
                read = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    throw null;
                }
                if (objComponentActivity3 == androidContentCaptureManager) {
                    DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "cancelPhotoAction", "cancelPhotoAction()V", 0, 16);
                    getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2);
                    objComponentActivity3 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2;
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity3;
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(inAppCameraWithTagsFragment);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer4 || objComponentActivity4 == androidContentCaptureManager) {
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "retakePhoto", "retakePhoto()V", 0, 17);
                getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3);
                objComponentActivity4 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity4;
            boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(inAppCameraWithTagsFragment);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer5) {
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "usePhoto", "usePhoto()V", 0, 18);
                getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4);
                int i8 = write + 109;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                objComponentActivity5 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$4;
            } else {
                int i10 = read + 21;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 84 / 0;
                    if (objComponentActivity5 == androidContentCaptureManager) {
                        DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$5 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "usePhoto", "usePhoto()V", 0, 18);
                        getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$5);
                        int i12 = write + 109;
                        read = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        objComponentActivity5 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$5;
                    }
                } else if (objComponentActivity5 == androidContentCaptureManager) {
                    DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$6 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "usePhoto", "usePhoto()V", 0, 18);
                    getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$6);
                    int i14 = write + 109;
                    read = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    objComponentActivity5 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$6;
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda3 = (registerInAppMessageManagerlambda0) objComponentActivity5;
            setNavigationOnClickListener setnavigationonclicklistenerWrite = inAppCameraWithTagsFragment.serializer().write();
            boolean zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(inAppCameraWithTagsFragment);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (!(!zIconCompatParcelizer6) || objComponentActivity6 == androidContentCaptureManager) {
                DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$7 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, inAppCameraWithTagsFragment, InAppCameraWithTagsFragment.class, "handleTakePicture", "handleTakePicture()V", 0, 19);
                getpostalcode.write(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$7);
                objComponentActivity6 = darkModeDiscoveryDialogFragment$onCreateView$1$1$1$7;
            }
            InAppCameraWithTagsKt.RemoteActionCompatParcelizer(isemimplSerializer, tointrectozmzzpi, setnavigationonclicklistenerWrite, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity6), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda3, true ^ ((FirebaseRemoteConfigImpl) inAppCameraWithTagsFragment.serializer().RatingCompat.IconCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.TAKE_PICTURE_TASK_NEW_CAMERA_OVERLAY_KILL_SWITCH_ENABLED.getFirebaseFlagName()), inAppCameraWithTagsFragment.serializer().RemoteActionCompatParcelizer(), null, getpostalcode, 64, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x013f  */
    /* JADX WARN: Code duplicated, block: B:33:0x017b  */
    private final Object invoke$com$roadrunner$delivery$pickupdropoff$tasks$qrpayment$presentation$screen$QrPaymentScreenFragment$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        boolean z;
        getPostalCode getpostalcode;
        int i = 2 % 2;
        QrPaymentScreenFragment qrPaymentScreenFragment = (QrPaymentScreenFragment) this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            int i2 = write + 63;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        if (getpostalcode2.write(iIntValue & 1, z)) {
            getQueryContext getquerycontext = qrPaymentScreenFragment.serializer().MediaMetadataCompat;
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(qrPaymentScreenFragment);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                PinScreenFragment$onCreateView$1$1$1$1 pinScreenFragment$onCreateView$1$1$1$1 = new PinScreenFragment$onCreateView$1$1$1$1(1, qrPaymentScreenFragment, QrPaymentScreenFragment.class, "handleAction", "handleAction(Lcom/roadrunner/delivery/pickupdropoff/tasks/qrpayment/QrPaymentScreenAction;)V", 0, 22);
                getpostalcode2.write(pinScreenFragment$onCreateView$1$1$1$1);
                objComponentActivity = pinScreenFragment$onCreateView$1$1$1$1;
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode2, 8);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(qrPaymentScreenFragment.serializer().ParcelableVolumeInfo, getpostalcode2, 0);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = ExtrasKt.write(qrPaymentScreenFragment.serializer().MediaBrowserCompatMediaItem, getpostalcode2, 0);
            getYD9Ej5fMannotations getyd9ej5fmannotations = (getYD9Ej5fMannotations) populateViewStructure_androidKtpopulate7Write.getValue();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getyd9ej5fmannotations, plusCBMgk4.write}, getCieXyz.write())).booleanValue()) {
                getpostalcode2.serializer(-227336142);
                getpostalcode2.IconCompatParcelizer(false);
                Timber.RemoteActionCompatParcelizer.write(new IllegalStateException("No arguments passed to QrPaymentScreenFragment"));
                qrPaymentScreenFragment.read(false, false);
            } else {
                if (!(getyd9ej5fmannotations instanceof getYD9Ej5fM)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode2, -227337865, false);
                }
                getpostalcode2.serializer(1542619747);
                C0195provider c0195provider = ((getYD9Ej5fM) getyd9ej5fmannotations).IconCompatParcelizer;
                getDisplayName getdisplayname = c0195provider.qrCode;
                if (getdisplayname == null) {
                    getpostalcode2.serializer(1542710205);
                    getpostalcode2.IconCompatParcelizer(false);
                    Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("QrPaymentScreenFragment: qrCode became null while screen was open. Safely dismissing."));
                    qrPaymentScreenFragment.read(false, false);
                    getpostalcode = getpostalcode2;
                } else {
                    getpostalcode2.serializer(1542953648);
                    boolean zMediaSessionCompatQueueItem = c0195provider.MediaSessionCompatQueueItem();
                    boolean zBooleanValue = ((Boolean) C0195provider.read(r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -9058359, 9058359, new Object[]{c0195provider}, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read())).booleanValue();
                    takeOrElseD5KLDUw takeorelsed5klduw = (takeOrElseD5KLDUw) populateViewStructure_androidKtpopulate7Write2.getValue();
                    getHeightD9Ej5fM getheightd9ej5fmSerializer = qrPaymentScreenFragment.serializer();
                    boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(getheightd9ej5fmSerializer);
                    Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if (zIconCompatParcelizer2) {
                        objComponentActivity2 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, getheightd9ej5fmSerializer, getHeightD9Ej5fM.class, "closeQrPaymentScreen", "closeQrPaymentScreen()V", 0, 6);
                        getpostalcode2.write(objComponentActivity2);
                    } else {
                        int i4 = write + 105;
                        read = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            objComponentActivity2 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, getheightd9ej5fmSerializer, getHeightD9Ej5fM.class, "closeQrPaymentScreen", "closeQrPaymentScreen()V", 0, 6);
                            getpostalcode2.write(objComponentActivity2);
                        }
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                    getHeightD9Ej5fM getheightd9ej5fmSerializer2 = qrPaymentScreenFragment.serializer();
                    boolean zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(getheightd9ej5fmSerializer2);
                    Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                    if (zIconCompatParcelizer3) {
                        objComponentActivity3 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, getheightd9ej5fmSerializer2, getHeightD9Ej5fM.class, "onQrCodeReady", "onQrCodeReady()V", 0, 7);
                        getpostalcode2.write(objComponentActivity3);
                    } else {
                        int i6 = write + 119;
                        read = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            int i7 = 53 / 0;
                            if (objComponentActivity3 == androidContentCaptureManager) {
                                objComponentActivity3 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, getheightd9ej5fmSerializer2, getHeightD9Ej5fM.class, "onQrCodeReady", "onQrCodeReady()V", 0, 7);
                                getpostalcode2.write(objComponentActivity3);
                            }
                        } else if (objComponentActivity3 == androidContentCaptureManager) {
                            objComponentActivity3 = new DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1(0, getheightd9ej5fmSerializer2, getHeightD9Ej5fM.class, "onQrCodeReady", "onQrCodeReady()V", 0, 7);
                            getpostalcode2.write(objComponentActivity3);
                        }
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity3;
                    getHeightD9Ej5fM getheightd9ej5fmSerializer3 = qrPaymentScreenFragment.serializer();
                    boolean zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(getheightd9ej5fmSerializer3);
                    Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                    if (zIconCompatParcelizer4 || objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new PinScreenFragment$onCreateView$1$1$1$1(1, getheightd9ej5fmSerializer3, getHeightD9Ej5fM.class, "onQrCodeFailed", "onQrCodeFailed(Ljava/lang/String;)V", 0, 23);
                        getpostalcode2.write(objComponentActivity4);
                        int i8 = write + 63;
                        read = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            int i9 = 3 % 2;
                        }
                    }
                    getpostalcode = getpostalcode2;
                    ShowQrCodeKt.ShowQrCodeComposable(getdisplayname, takeorelsed5klduw, zMediaSessionCompatQueueItem, zBooleanValue, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity4), null, getpostalcode, 8);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v170 ??, still in use, count: 1, list:
          (r1v170 ?? I:java.lang.Object) from 0x008e: INVOKE (r2v151 ?? I:o.getPostalCode), (r1v170 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:259)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final java.lang.Object invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v170 ??, still in use, count: 1, list:
          (r1v170 ?? I:java.lang.Object) from 0x008e: INVOKE (r2v151 ?? I:o.getPostalCode), (r1v170 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:259)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r58v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
}
