package com.roadrunner.rider.recruitment.passverification.pass_error;

import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt$AutoAcceptOption$1$1;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsKt;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import java.util.Iterator;
import kotlin.ranges.RangesKt;
import o.AndroidContentCaptureManager;
import o.DisplayInfoManager;
import o.PaintExtensions_androidKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SpannedExtensions_androidKt;
import o.StaticLayoutFactoryDefault;
import o.createFromParcel;
import o.cubicTo;
import o.fromString;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getContentCaptureSessionui;
import o.getContentInsetStart;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.isAdapterPositionOnScreen;
import o.populate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.sendDragEventEu1f8Dk;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PassErrorScreenKt$$ExternalSyntheticLambda4 implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ PassErrorScreenKt$$ExternalSyntheticLambda4(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
        this.read = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x0124  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String code;
        Object next;
        fromString fromstring;
        getPostalCode getpostalcode;
        int i;
        DisplayInfoManager displayInfoManager;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj5 = this.read;
        Object obj6 = this.serializer;
        boolean z = true;
        if (i3 == 0) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
            cubicTo cubicto = (cubicTo) obj2;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            cubicto.getClass();
            Bundle bundleRemoteActionCompatParcelizer = cubicto.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
            if (bundleRemoteActionCompatParcelizer == null || (code = bundleRemoteActionCompatParcelizer.getString("passErrorType")) == null) {
                code = fromString.UnexpectedError.getCode();
            }
            fromString.Companion.getClass();
            code.getClass();
            Iterator<E> it = fromString.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((fromString) next).getCode(), code}, getCieXyz.write())).booleanValue());
            fromString fromstring2 = (fromString) next;
            if (fromstring2 == null) {
                int i4 = RemoteActionCompatParcelizer + 125;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                fromstring = fromString.UnexpectedError;
            } else {
                fromstring = fromstring2;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
            boolean z2 = getpostalcode2.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            boolean z3 = getpostalcode2.read(fromstring.ordinal());
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (!(!(z2 | z3)) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new OtpNavigationKt$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 21, fromstring);
                getpostalcode2.write(objComponentActivity);
            }
            PassErrorScreenKt.PassErrorScreen(fromstring, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode2, 0);
            return createfromparcel;
        }
        if (i3 != 1) {
            populate populateVar = (populate) obj5;
            float fFloatValue = ((Float) obj3).floatValue();
            ((Float) obj4).getClass();
            float f = InAppCameraWithTagsKt.read;
            getContentInsetStart getcontentinsetstart = (getContentInsetStart) ((PopulateViewStructure_androidKtpopulate7) obj6).getValue();
            if (getcontentinsetstart != null && (displayInfoManager = (DisplayInfoManager) getcontentinsetstart.ResultReceiver().ResultReceiver().IconCompatParcelizer()) != null) {
                getContentCaptureSessionui getcontentcapturesessionui = (getContentCaptureSessionui) populateVar;
                float fWrite = RangesKt.write(getcontentcapturesessionui.serializer() * fFloatValue, displayInfoManager.IconCompatParcelizer(), displayInfoManager.RemoteActionCompatParcelizer());
                getcontentcapturesessionui.IconCompatParcelizer(fWrite);
                getcontentinsetstart.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().serializer(fWrite);
            }
            return createfromparcel;
        }
        AutoAcceptOptionKt$AutoAcceptOption$1$1 autoAcceptOptionKt$AutoAcceptOption$1$1 = (AutoAcceptOptionKt$AutoAcceptOption$1$1) obj6;
        SignInDataStore signInDataStore = (SignInDataStore) obj5;
        SpannedExtensions_androidKt spannedExtensions_androidKt = (SpannedExtensions_androidKt) obj;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        spannedExtensions_androidKt.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        StaticLayoutFactoryDefault staticLayoutFactoryDefault = (StaticLayoutFactoryDefault) spannedExtensions_androidKt;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(staticLayoutFactoryDefault.MediaBrowserCompatMediaItem, getbirthdatefull2, 0);
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = ExtrasKt.write(staticLayoutFactoryDefault.MediaMetadataCompat, getbirthdatefull2, 0);
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
        boolean z4 = getpostalcode3.read(spannedExtensions_androidKt);
        boolean z5 = getpostalcode3.read(autoAcceptOptionKt$AutoAcceptOption$1$1);
        Object objComponentActivity2 = getpostalcode3.ComponentActivity();
        if ((z4 | z5) || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new ViewUtils$$ExternalSyntheticLambda6(spannedExtensions_androidKt, 12, autoAcceptOptionKt$AutoAcceptOption$1$1);
            getpostalcode3.write(objComponentActivity2);
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
        if (((iIntValue & 112) ^ 48) > 32) {
            int i6 = write + 99;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (!getpostalcode3.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                if ((iIntValue & 48) != 32) {
                    z = false;
                }
            }
        } else if ((iIntValue & 48) != 32) {
            z = false;
        }
        Object objComponentActivity3 = getpostalcode3.ComponentActivity();
        if (z || objComponentActivity3 == androidContentCaptureManager) {
            objComponentActivity3 = new ViewUtils$$ExternalSyntheticLambda6(spannedExtensions_androidKt, 13, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            getpostalcode3.write(objComponentActivity3);
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3;
        r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE r8lambdai4uhhuxi_lbaiwbhw2e2kanuhe = (r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE) ((isAdapterPositionOnScreen) signInDataStore.read).MediaSessionCompatResultReceiverWrapper();
        PaintExtensions_androidKt paintExtensions_androidKt = (PaintExtensions_androidKt) populateViewStructure_androidKtpopulate7Write.getValue();
        Boolean bool = (Boolean) populateViewStructure_androidKtpopulate7Write2.getValue();
        bool.getClass();
        boolean zIconCompatParcelizer = getpostalcode3.IconCompatParcelizer(spannedExtensions_androidKt);
        Object objComponentActivity4 = getpostalcode3.ComponentActivity();
        if (zIconCompatParcelizer) {
            getpostalcode = getpostalcode3;
            i = 0;
            objComponentActivity4 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, spannedExtensions_androidKt, SpannedExtensions_androidKt.class, "onBannerClick", "onBannerClick()V", 0, 5);
            getpostalcode.write(objComponentActivity4);
        } else {
            int i8 = RemoteActionCompatParcelizer + 119;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (objComponentActivity4 == androidContentCaptureManager) {
                getpostalcode = getpostalcode3;
                i = 0;
                objComponentActivity4 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, spannedExtensions_androidKt, SpannedExtensions_androidKt.class, "onBannerClick", "onBannerClick()V", 0, 5);
                getpostalcode.write(objComponentActivity4);
            } else {
                getpostalcode = getpostalcode3;
                i = 0;
            }
        }
        r8lambdai4uhhuxi_lbaiwbhw2e2kanuhe.RemoteActionCompatParcelizer(paintExtensions_androidKt, bool, (registerInAppMessageManagerlambda0) objComponentActivity4, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getpostalcode, Integer.valueOf(i));
        int i10 = write + 23;
        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return createfromparcel;
    }
}
