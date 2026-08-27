package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.AcceptBottomSheetKt;
import com.roadrunner.delivery.accept.orderitems.presentation.compose.OrderItemsBottomSheetKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ReportBottomSheetKt;
import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dividedefault implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ dividedefault(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
        this.read = obj3;
        this.serializer = obj4;
        this.MediaSessionCompatQueueItem = obj5;
        this.MediaBrowserCompatMediaItem = obj6;
        this.MediaDescriptionCompat = obj7;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x018f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0199  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.MediaDescriptionCompat;
        Object obj5 = this.MediaBrowserCompatMediaItem;
        Object obj6 = this.MediaSessionCompatQueueItem;
        Object obj7 = this.serializer;
        Object obj8 = this.read;
        Object obj9 = this.IconCompatParcelizer;
        Object obj10 = this.write;
        boolean z = false;
        if (i3 == 0) {
            SimpleGraphicsLayerModifierlayerBlock1 simpleGraphicsLayerModifierlayerBlock1 = (SimpleGraphicsLayerModifierlayerBlock1) obj10;
            DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) obj9;
            coil3.compose.AsyncImagePainter asyncImagePainter = (coil3.compose.AsyncImagePainter) obj8;
            String str = (String) obj7;
            androidx.compose.ui.Alignment alignment = (androidx.compose.ui.Alignment) obj6;
            androidx.compose.ui.layout.ContentScale contentScale = (androidx.compose.ui.layout.ContentScale) obj5;
            androidx.compose.ui.graphics.ColorFilter colorFilter = (androidx.compose.ui.graphics.ColorFilter) obj4;
            getShouldCreateCompositionOnAttachedToWindow getshouldcreatecompositiononattachedtowindow = (getShouldCreateCompositionOnAttachedToWindow) obj;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                int i4 = RatingCompat + 21;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 63 / 0;
                    if (((getPostalCode) getbirthdatefull).read(getshouldcreatecompositiononattachedtowindow)) {
                        i = 4;
                    } else {
                        int i6 = RatingCompat + 11;
                        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                    }
                } else if (!((getPostalCode) getbirthdatefull).read(getshouldcreatecompositiononattachedtowindow)) {
                    int i8 = RatingCompat + 11;
                    MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                } else {
                    i = 4;
                }
                iIntValue |= i;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 19) != 18)) {
                ((coil3.compose.ConstraintsSizeResolver) simpleGraphicsLayerModifierlayerBlock1).read(((getWindow) getshouldcreatecompositiononattachedtowindow).read);
                dragAndDropTargetModifierNode.invoke(new accessgetNonZerocp(getshouldcreatecompositiononattachedtowindow, asyncImagePainter, str, alignment, contentScale, colorFilter), getpostalcode, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i3 == 1) {
            getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) obj10;
            getPlatformAndroidManager getplatformandroidmanager2 = (getPlatformAndroidManager) obj9;
            getPlatformAndroidManager getplatformandroidmanager3 = (getPlatformAndroidManager) obj8;
            N$b n$b = (N$b) obj7;
            TextPainterKt textPainterKt = (TextPainterKt) obj6;
            SignInDataStore signInDataStore = (SignInDataStore) obj5;
            com.huawei.wisesecurity.ucs_credential.p0 p0Var = (com.huawei.wisesecurity.ucs_credential.p0) obj4;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
            int iIntValue2 = ((Integer) obj3).intValue();
            ((ModalBottomSheetDialogWrapper) obj).getClass();
            if ((iIntValue2 & 17) != 16) {
                int i10 = RatingCompat + 93;
                MediaMetadataCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                z = true;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue2 & 1, z)) {
                AcceptBottomSheetKt.SheetContent(getplatformandroidmanager, getplatformandroidmanager2, getplatformandroidmanager3, n$b, textPainterKt, signInDataStore, p0Var, null, getpostalcode2, 438);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i3 == 2) {
            Api34SegmentFindertoAndroidSegmentFinder1 api34SegmentFindertoAndroidSegmentFinder1 = (Api34SegmentFindertoAndroidSegmentFinder1) obj10;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9;
            accessgetStripNonMetricAffectingCharSpansp accessgetstripnonmetricaffectingcharspansp = (accessgetStripNonMetricAffectingCharSpansp) obj8;
            accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans = (accessstripNonMetricAffectingCharacterStyleSpans) obj7;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj6;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj2;
            int iIntValue3 = ((Integer) obj3).intValue();
            ((ModalBottomSheetDialogWrapper) obj).getClass();
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
            if (getpostalcode3.write(iIntValue3 & 1, !((iIntValue3 & 17) == 16))) {
                OrderItemsBottomSheetKt.OrderItemsContent(api34SegmentFindertoAndroidSegmentFinder1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, accessgetstripnonmetricaffectingcharspansp, accessstripnonmetricaffectingcharacterstylespans, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode3, 8);
            } else {
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        hideSoftInput hidesoftinput = (hideSoftInput) obj10;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj9;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj7;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj6;
        androidx.compose.material3.SheetState sheetState = (androidx.compose.material3.SheetState) obj5;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
        getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj2;
        int iIntValue4 = ((Integer) obj3).intValue();
        ((ModalBottomSheetDialogWrapper) obj).getClass();
        getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
        if (getpostalcode4.write(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
            boolean zIconCompatParcelizer = getpostalcode4.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean z2 = getpostalcode4.read(sheetState);
            boolean z3 = getpostalcode4.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k4);
            Object objComponentActivity = getpostalcode4.ComponentActivity();
            if (!(zIconCompatParcelizer | z2) && !z3) {
                int i12 = RatingCompat + 21;
                MediaMetadataCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new accessisDocked(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k4);
                    getpostalcode4.write(objComponentActivity);
                    int i13 = RatingCompat + 55;
                    MediaMetadataCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                }
            } else {
                objComponentActivity = new accessisDocked(getcontentviewgroupparentlayout, sheetState, r8lambdardpfsr94j4iebcwx_kpqzpm8k4);
                getpostalcode4.write(objComponentActivity);
                int i15 = RatingCompat + 55;
                MediaMetadataCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
            }
            ReportBottomSheetKt.ReportSheetContent(hidesoftinput, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode4, 0);
        } else {
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
