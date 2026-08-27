package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose.TripPlannerItemKt;
import com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose.VerticalIndicatorKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiedy9eOQZsannotations extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ DrawBehindElement IconCompatParcelizer;
    public final /* synthetic */ toAndroidCapBeK7IIE MediaBrowserCompatMediaItem;
    public final /* synthetic */ boolean RatingCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 serializer;
    public final /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getUnspecifiedy9eOQZsannotations(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, DrawBehindElement drawBehindElement, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, toAndroidCapBeK7IIE toandroidcapbek7iie, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        super(2);
        this.serializer = populateViewStructure_androidKtpopulate7;
        this.IconCompatParcelizer = drawBehindElement;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaBrowserCompatMediaItem = toandroidcapbek7iie;
        this.write = z;
        this.RatingCompat = z2;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x0134  */
    /* JADX WARN: Code duplicated, block: B:36:0x0182  */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r2 r4
  0x0036: PHI (r2v6 o.getBirthDateFull) = (r2v5 o.getBirthDateFull), (r2v10 o.getBirthDateFull) binds: [B:8:0x0034, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0036: PHI (r4v1 o.createFromParcel) = (r4v0 o.createFromParcel), (r4v4 o.createFromParcel) binds: [B:8:0x0034, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws androidx.constraintlayout.core.parser.CLParsingException {
        getBirthDateFull getbirthdatefull;
        createFromParcel createfromparcel;
        getPostalCode getpostalcode;
        boolean z;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 45;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Number) obj2).intValue();
            createfromparcel = createFromParcel.INSTANCE;
            if ((iIntValue & 5) == 4) {
                int i3 = MediaSessionCompatQueueItem + 107;
                MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.MediaSessionCompatToken()) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    return createfromparcel;
                }
            }
        } else {
            getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue2 = ((Number) obj2).intValue();
            createfromparcel = createFromParcel.INSTANCE;
            if ((iIntValue2 & 3) == 2) {
                int i5 = MediaSessionCompatQueueItem + 107;
                MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.MediaSessionCompatToken()) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    return createfromparcel;
                }
            }
        }
        this.serializer.setValue(createfromparcel);
        DrawBehindElement drawBehindElement = this.IconCompatParcelizer;
        int i7 = drawBehindElement.MediaSessionCompatQueueItem;
        drawBehindElement.read();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.serializer(193635658);
        DrawBehindElement drawBehindElement2 = (DrawBehindElement) drawBehindElement.serializer().serializer;
        ClipKt clipKtRemoteActionCompatParcelizer = drawBehindElement2.RemoteActionCompatParcelizer();
        ClipKt clipKtRemoteActionCompatParcelizer2 = drawBehindElement2.RemoteActionCompatParcelizer();
        ClipKt clipKtRemoteActionCompatParcelizer3 = drawBehindElement2.RemoteActionCompatParcelizer();
        onBuildCache[] onbuildcacheArr = {clipKtRemoteActionCompatParcelizer2, clipKtRemoteActionCompatParcelizer3};
        float fM3673constructorimpl = androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f);
        int i8 = drawBehindElement.serializer;
        drawBehindElement.serializer = i8 + 1;
        DrawCacheModifierDefaultImpls drawCacheModifierDefaultImpls = new DrawCacheModifierDefaultImpls(Integer.valueOf(i8));
        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd = new accessroundToPxR2X_6ojd(new char[0]);
        for (int i9 = 0; i9 < 2; i9++) {
            accessroundtopxr2x_6ojd.serializer(accesstoDpSizekrfVVMjd.serializer(onbuildcacheArr[i9].read().toString()));
        }
        accesstoPxR2X_6ojd accesstopxr2x_6ojdIconCompatParcelizer = drawBehindElement.IconCompatParcelizer(drawCacheModifierDefaultImpls);
        accesstopxr2x_6ojdIconCompatParcelizer.serializer("type", "barrier");
        accesstopxr2x_6ojdIconCompatParcelizer.serializer(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "bottom");
        accesstopxr2x_6ojdIconCompatParcelizer.IconCompatParcelizer(fM3673constructorimpl, "margin");
        accesstopxr2x_6ojdIconCompatParcelizer.RemoteActionCompatParcelizer("contains", accessroundtopxr2x_6ojd);
        drawBehindElement.read(15);
        int i10 = 0;
        while (i10 < 2) {
            int i11 = MediaMetadataCompat + 47;
            MediaSessionCompatQueueItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                drawBehindElement.read(onbuildcacheArr[i10].hashCode());
                i10 += 36;
            } else {
                drawBehindElement.read(onbuildcacheArr[i10].hashCode());
                i10++;
            }
        }
        drawBehindElement.read(androidx.compose.ui.unit.Dp.m3679hashCodeimpl(fM3673constructorimpl));
        CacheDrawScopeonDrawBehind1 cacheDrawScopeonDrawBehind1 = new CacheDrawScopeonDrawBehind1(drawCacheModifierDefaultImpls.MediaSessionCompatQueueItem, 0, drawCacheModifierDefaultImpls);
        getpostalcode2.serializer(1668818451);
        toAndroidCapBeK7IIE toandroidcapbek7iie = this.MediaBrowserCompatMediaItem;
        DrawStyleSpan_androidKt drawStyleSpan_androidKt = toandroidcapbek7iie.IconCompatParcelizer;
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
        boolean z2 = getpostalcode2.read(cacheDrawScopeonDrawBehind1);
        Object objComponentActivity = getpostalcode2.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (!z2) {
            int i12 = MediaSessionCompatQueueItem + 111;
            MediaMetadataCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                int i13 = 76 / 0;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new setSizeuvyYCjk(7, cacheDrawScopeonDrawBehind1);
                    getpostalcode2.write(objComponentActivity);
                }
            } else if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new setSizeuvyYCjk(7, cacheDrawScopeonDrawBehind1);
                getpostalcode2.write(objComponentActivity);
            }
        } else {
            objComponentActivity = new setSizeuvyYCjk(7, cacheDrawScopeonDrawBehind1);
            getpostalcode2.write(objComponentActivity);
        }
        createFromParcel createfromparcel2 = createfromparcel;
        VerticalIndicatorKt.VerticalIndicator(drawStyleSpan_androidKt, this.write, this.RatingCompat, DrawBehindElement.read(companion, clipKtRemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), getpostalcode2, 0);
        String str = toandroidcapbek7iie.MediaDescriptionCompat;
        String str2 = toandroidcapbek7iie.RemoteActionCompatParcelizer;
        String str3 = toandroidcapbek7iie.read;
        String str4 = toandroidcapbek7iie.write;
        findField findfield = toandroidcapbek7iie.MediaMetadataCompat;
        androidx.compose.ui.Modifier modifierM73paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m73paddingVpY3zN4$default(companion, Dimensions.setActionBarVisibilityCallback, 0.0f, 2);
        boolean z3 = getpostalcode2.read(clipKtRemoteActionCompatParcelizer);
        boolean z4 = getpostalcode2.read(clipKtRemoteActionCompatParcelizer3);
        Object objComponentActivity2 = getpostalcode2.ComponentActivity();
        if (!(z3 | z4)) {
            int i14 = MediaMetadataCompat + 29;
            MediaSessionCompatQueueItem = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new v2(clipKtRemoteActionCompatParcelizer, clipKtRemoteActionCompatParcelizer3, 7);
                getpostalcode2.write(objComponentActivity2);
                int i16 = MediaMetadataCompat + 121;
                MediaSessionCompatQueueItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i17 = i16 % 2;
            }
        } else {
            objComponentActivity2 = new v2(clipKtRemoteActionCompatParcelizer, clipKtRemoteActionCompatParcelizer3, 7);
            getpostalcode2.write(objComponentActivity2);
            int i18 = MediaMetadataCompat + 121;
            MediaSessionCompatQueueItem = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i19 = i18 % 2;
        }
        TripPlannerItemKt.OrderInfo(str, str2, str4, str3, findfield, DrawBehindElement.read(modifierM73paddingVpY3zN4$default, clipKtRemoteActionCompatParcelizer2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2), getpostalcode2, 0);
        if (toandroidcapbek7iie.serializer != null) {
            int i20 = MediaMetadataCompat + 95;
            MediaSessionCompatQueueItem = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i21 = i20 % 2;
            z = true;
        } else {
            z = false;
        }
        Object objComponentActivity3 = getpostalcode2.ComponentActivity();
        if (objComponentActivity3 == androidContentCaptureManager) {
            objComponentActivity3 = getNoney9eOQZs.serializer;
            getpostalcode2.write(objComponentActivity3);
        }
        androidx.compose.ui.Modifier modifier = DrawBehindElement.read(companion, clipKtRemoteActionCompatParcelizer3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3);
        modifier.getClass();
        getSubscripty9eOQZs.write(z, modifier, null, this.RemoteActionCompatParcelizer, getpostalcode2, 0);
        getpostalcode2.IconCompatParcelizer(false);
        getpostalcode2.IconCompatParcelizer(false);
        if (drawBehindElement.MediaSessionCompatQueueItem != i7) {
            getPhoneNumberNational.write(this.read, getpostalcode2);
        }
        return createfromparcel2;
    }
}
