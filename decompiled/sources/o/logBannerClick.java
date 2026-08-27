package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.Braze$$ExternalSyntheticLambda9;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.liveness.recording.presentation.compose.CameraContentKt;
import com.roadrunner.liveness.recording.presentation.compose.CameraOverlayKt;
import com.roadrunner.vendor.review.presentation.comment.CommentBottomSheetKt;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class logBannerClick implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ logBannerClick(setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled, Integer num, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getWrapper getwrapper, setNavigationOnClickListener setnavigationonclicklistener, Integer num2) {
        this.write = setlegacyrequestdisallowintercepttoucheventenabled;
        this.serializer = num;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = getwrapper;
        this.RatingCompat = setnavigationonclicklistener;
        this.MediaDescriptionCompat = num2;
    }

    public /* synthetic */ logBannerClick(logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release, getContentViewGroupParentLayout getcontentviewgroupparentlayout, androidx.compose.material3.SheetState sheetState, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7) {
        this.write = logpushdeliveryandroid_sdk_base_release;
        this.serializer = getcontentviewgroupparentlayout;
        this.read = sheetState;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaDescriptionCompat = populateViewStructure_androidKtpopulate7;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01be  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:56:0x01cf  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        boolean zIconCompatParcelizer;
        boolean z;
        boolean z2;
        Object objComponentActivity;
        int i2;
        int i3 = 2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.MediaDescriptionCompat;
        Object obj5 = this.RatingCompat;
        Object obj6 = this.read;
        Object obj7 = this.serializer;
        Object obj8 = this.write;
        if (i4 != 0) {
            setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled = (setLegacyRequestDisallowInterceptTouchEventEnabled) obj8;
            Integer num = (Integer) obj7;
            getWrapper getwrapper = (getWrapper) obj6;
            setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) obj5;
            Integer num2 = (Integer) obj4;
            getShouldCreateCompositionOnAttachedToWindow getshouldcreatecompositiononattachedtowindow = (getShouldCreateCompositionOnAttachedToWindow) obj;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            getshouldcreatecompositiononattachedtowindow.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= ((getPostalCode) getbirthdatefull).read(getshouldcreatecompositiononattachedtowindow) ? 4 : 2;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (!getpostalcode.write(iIntValue & 1, (iIntValue & 19) != 18)) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                return createfromparcel;
            }
            float f = Dimensions.setSubtitle;
            getWindow getwindow = (getWindow) getshouldcreatecompositiononattachedtowindow;
            androidx.compose.ui.unit.Dp dpM3671boximpl = androidx.compose.ui.unit.Dp.m3671boximpl(getwindow.read());
            androidx.compose.ui.unit.Dp dpM3671boximpl2 = androidx.compose.ui.unit.Dp.m3671boximpl(getwindow.serializer());
            dpM3671boximpl.getClass();
            dpM3671boximpl2.getClass();
            if (dpM3671boximpl.compareTo(dpM3671boximpl2) > 0) {
                dpM3671boximpl = dpM3671boximpl2;
            }
            float fM3687unboximpl = dpM3671boximpl.m3687unboximpl();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.SizeKt.write(androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion, fM3687unboximpl), 1.0f);
            androidx.compose.ui.Alignment.Companion companion2 = androidx.compose.ui.Alignment.Companion;
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = androidx.compose.foundation.layout.BoxKt.read(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            androidx.compose.ui.node.ComposeUiNode.Companion companion3 = androidx.compose.ui.node.ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i5 = MediaBrowserCompatMediaItem + 37;
                MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.serializer;
            CameraContentKt.serializer(this.RemoteActionCompatParcelizer, getwrapper, setnavigationonclicklistener, boxScopeInstance.matchParentSize(companion), getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(true);
            CameraOverlayKt.read(f, setlegacyrequestdisallowintercepttoucheventenabled, androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion, fM3687unboximpl), getpostalcode, 0);
            if (num == null) {
                getpostalcode.serializer(-945404442);
                getpostalcode.IconCompatParcelizer(false);
                return createfromparcel;
            }
            getpostalcode.serializer(-945404441);
            setTargetOffsetTopAndBottom.serializer(num.intValue(), num2, androidx.compose.foundation.layout.PaddingKt.write(androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), fM3687unboximpl), f), getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(false);
            return createfromparcel;
        }
        boolean z3 = false;
        logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release = (logPushDeliveryandroid_sdk_base_release) obj8;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj7;
        androidx.compose.material3.SheetState sheetState = (androidx.compose.material3.SheetState) obj6;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj4;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        ((ModalBottomSheetDialogWrapper) obj).getClass();
        if ((iIntValue2 & 17) != 16) {
            int i7 = MediaSessionCompatQueueItem + 85;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z3 = true;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (true ^ getpostalcode2.write(iIntValue2 & 1, z3)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i9 = MediaSessionCompatQueueItem + 109;
            MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            String str = logpushdeliveryandroid_sdk_base_release.IconCompatParcelizer;
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean z4 = getpostalcode2.read(sheetState);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!zIconCompatParcelizer2 && !z4) {
                int i11 = MediaSessionCompatQueueItem + 57;
                MediaBrowserCompatMediaItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i = 2;
                int i12 = i11 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                z = getpostalcode2.read(sheetState);
                z2 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                objComponentActivity = getpostalcode2.ComponentActivity();
                if (!(zIconCompatParcelizer | z) && !z2) {
                    i2 = MediaSessionCompatQueueItem + 47;
                    MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new Braze$$ExternalSyntheticLambda9(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate7, 8);
                        getpostalcode2.write(objComponentActivity);
                    }
                } else {
                    objComponentActivity = new Braze$$ExternalSyntheticLambda9(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate7, 8);
                    getpostalcode2.write(objComponentActivity);
                }
                CommentBottomSheetKt.CommentBottomSheet(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, this.RemoteActionCompatParcelizer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue(), null, getpostalcode2, 0);
            } else {
                i = 2;
            }
            objComponentActivity2 = new getUdmandroid_sdk_base_release(getcontentviewgroupparentlayout, sheetState, populateViewStructure_androidKtpopulate7, i);
            getpostalcode2.write(objComponentActivity2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            z = getpostalcode2.read(sheetState);
            z2 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            objComponentActivity = getpostalcode2.ComponentActivity();
            if (!(zIconCompatParcelizer | z) && !z2) {
                i2 = MediaSessionCompatQueueItem + 47;
                MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new Braze$$ExternalSyntheticLambda9(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate7, 8);
                    getpostalcode2.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new Braze$$ExternalSyntheticLambda9(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate7, 8);
                getpostalcode2.write(objComponentActivity);
            }
            CommentBottomSheetKt.CommentBottomSheet(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, this.RemoteActionCompatParcelizer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue(), null, getpostalcode2, 0);
        }
        return createfromparcel;
    }
}
