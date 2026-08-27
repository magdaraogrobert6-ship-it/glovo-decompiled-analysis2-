package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.face.verification.presentation.selfie.review.HumanReviewBottomSheetKt;
import com.roadrunner.rider.recruitment.passverification.presentation.VerifyScreenKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DefaultLazyKey implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;

    public /* synthetic */ DefaultLazyKey(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.read = i;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0075  */
    /* JADX WARN: Code duplicated, block: B:77:0x02f0  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.ui.Modifier.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        int i;
        boolean z;
        getPushAlert getpushalert;
        int i2;
        int i3;
        boolean z2;
        int i4 = 2 % 2;
        int i5 = this.read;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = null;
        boolean z3 = false;
        boolean z4 = false;
        switch (i5) {
            case 0:
                ((Integer) obj3).getClass();
                getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj2);
                getpostalcode.serializer(-756081143);
                PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11 = (PagerMeasurePolicyKtrememberPagerMeasurePolicy11) getpostalcode.write((getNewPassword) PagerMeasureResult.RemoteActionCompatParcelizer);
                if (pagerMeasurePolicyKtrememberPagerMeasurePolicy11 != null) {
                    getpostalcode.serializer(-1604682242);
                } else {
                    getpostalcode.serializer(-1604549624);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
                        int i6 = IconCompatParcelizer + 75;
                        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                    }
                    mutableInteractionSourceImpl = (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) objComponentActivity;
                }
                androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                getpostalcode.IconCompatParcelizer(false);
                androidx.compose.ui.Modifier modifierSerializer = androidx.compose.foundation.ClickableKt.serializer(androidx.compose.ui.Modifier.Companion, mutableInteractionSourceImpl2, pagerMeasurePolicyKtrememberPagerMeasurePolicy11, true, null, this.serializer);
                getpostalcode.IconCompatParcelizer(false);
                return modifierSerializer;
            case 1:
                androidx.compose.ui.layout.MeasureScope measureScope = (androidx.compose.ui.layout.MeasureScope) obj;
                androidx.compose.ui.layout.Measurable measurable = (androidx.compose.ui.layout.Measurable) obj2;
                androidx.compose.ui.unit.Constraints constraints = (androidx.compose.ui.unit.Constraints) obj3;
                float fM3687unboximpl = ((androidx.compose.ui.unit.Dp) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke()).m3687unboximpl();
                androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(androidx.compose.ui.unit.Constraints.m3616copyZbe2FdA$default(constraints.m3632unboximpl(), 0, 0, androidx.compose.ui.unit.ConstraintsKt.m3642constrainHeightK40F9xA(constraints.m3632unboximpl(), androidx.compose.ui.unit.Dp.m3678equalsimpl0(fM3687unboximpl, androidx.compose.ui.unit.Dp.Companion.m3693getUnspecifiedD9Ej5fM()) ? 0 : measureScope.mo42roundToPx0680j_4(fM3687unboximpl)), 0, 11, null));
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new accessgetEvenOddcp(placeableMo2209measureBRTryo0, 6), 4, null);
            case 2:
                androidx.compose.ui.Modifier modifier = (androidx.compose.ui.Modifier) obj;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((getPostalCode) getbirthdatefull).read(modifier) ? 4 : 2;
                }
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
                if (getpostalcode2.write(iIntValue & 1, (iIntValue & 19) != 18)) {
                    androidx.compose.ui.Modifier modifierM83size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(modifier, Dimensions.setActionBarVisibilityCallback);
                    modifierM83size3ABfNKs.getClass();
                    getRootCause.read(com.logistics.rider.glovo.R.drawable.ic_info_circle, this.serializer, modifierM83size3ABfNKs, null, false, null, null, getpostalcode2, 0, 248);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 3:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                layoutInflater.getClass();
                viewGroup.getClass();
                View viewInflate = layoutInflater.inflate(com.logistics.rider.glovo.R.layout.adapter_item_auto_accept_toggle, viewGroup, false);
                if (zBooleanValue) {
                    viewGroup.addView(viewInflate);
                }
                if (viewInflate == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("rootView");
                    return null;
                }
                getOnLoggedCallbackannotations getonloggedcallbackannotations = (getOnLoggedCallbackannotations) viewInflate;
                copyCXVQc50 copycxvqc50 = new copyCXVQc50(getonloggedcallbackannotations, getonloggedcallbackannotations);
                getonloggedcallbackannotations.setOnToggleClickListener(new getMutablePendingIntentFlags(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k1));
                return copycxvqc50;
            case 4:
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((IconButtonKt) obj).getClass();
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode3.write(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.Companion;
                    companion2.getClass();
                    hashObject.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_chat_chat_bubbles, this.serializer, companion2, getpostalcode3, 384, 0);
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 5:
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((IconButtonKt) obj).getClass();
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode4.write(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    int i8 = RemoteActionCompatParcelizer + 89;
                    IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
                    companion3.getClass();
                    r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.drawable.ic_bold_large_chat_bubble_text, this.serializer, companion3, false, null, getpostalcode4, 384, 24);
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 6:
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull4;
                if (getpostalcode5.write(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    int i10 = IconCompatParcelizer + 3;
                    RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.Companion;
                    companion4.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_medium_cancel_thin, this.serializer, companion4, false, null, getpostalcode5, 384, 24);
                } else {
                    getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 7:
                getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull5;
                if (!getpostalcode6.write(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    int i12 = IconCompatParcelizer + 41;
                    RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        companion = androidx.compose.ui.Modifier.Companion;
                        companion.getClass();
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
                        i = com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin;
                        z = true;
                        getpushalert = null;
                        i2 = 31136;
                        i3 = 25;
                    } else {
                        companion = androidx.compose.ui.Modifier.Companion;
                        companion.getClass();
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.serializer;
                        i = com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin;
                        z = false;
                        getpushalert = null;
                        i2 = 384;
                        i3 = 24;
                    }
                    HeaderKt.read(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion, z, getpushalert, getpostalcode6, i2, i3);
                }
                return createfromparcel;
            case 8:
                getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode7 = (getPostalCode) getbirthdatefull6;
                if (getpostalcode7.write(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_medium_cancel_thin, this.serializer, null, false, null, getpostalcode7, 0, 28);
                } else {
                    getpostalcode7.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 9:
                getBirthDateFull getbirthdatefull7 = (getBirthDateFull) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode8 = (getPostalCode) getbirthdatefull7;
                if (getpostalcode8.write(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    androidx.compose.ui.Modifier.Companion companion5 = androidx.compose.ui.Modifier.Companion;
                    companion5.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin, this.serializer, companion5, false, null, getpostalcode8, 384, 24);
                } else {
                    getpostalcode8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 10:
                getBirthDateFull getbirthdatefull8 = (getBirthDateFull) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode9 = (getPostalCode) getbirthdatefull8;
                if (getpostalcode9.write(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    androidx.compose.ui.Modifier.Companion companion6 = androidx.compose.ui.Modifier.Companion;
                    companion6.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin, this.serializer, companion6, false, null, getpostalcode9, 384, 24);
                } else {
                    getpostalcode9.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 11:
                getBirthDateFull getbirthdatefull9 = (getBirthDateFull) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                if ((iIntValue9 & 17) != 16) {
                    int i13 = RemoteActionCompatParcelizer + 67;
                    IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                getPostalCode getpostalcode10 = (getPostalCode) getbirthdatefull9;
                if (getpostalcode10.write(iIntValue9 & 1, z2)) {
                    HumanReviewBottomSheetKt.HumanReviewBottomSheetContent(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode10, 0);
                } else {
                    getpostalcode10.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 12:
                getBirthDateFull getbirthdatefull10 = (getBirthDateFull) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode11 = (getPostalCode) getbirthdatefull10;
                if (getpostalcode11.write(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    androidx.compose.ui.Modifier.Companion companion7 = androidx.compose.ui.Modifier.Companion;
                    companion7.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin, this.serializer, companion7, false, null, getpostalcode11, 384, 24);
                } else {
                    getpostalcode11.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 13:
                getBirthDateFull getbirthdatefull11 = (getBirthDateFull) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                getPostalCode getpostalcode12 = (getPostalCode) getbirthdatefull11;
                if (getpostalcode12.write(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    getRootCause.write(com.logistics.rider.glovo.R.drawable.ic_bold_large_essentials_info, this.serializer, null, new getPushAlert(((buildMapping) getpostalcode12.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), ((buildMapping) getpostalcode12.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), ((buildMapping) getpostalcode12.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled()), false, null, null, getpostalcode12, 0, Constant.ERROR_GNSS_STATUS_INVALID);
                } else {
                    getpostalcode12.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 14:
                getBirthDateFull getbirthdatefull12 = (getBirthDateFull) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                getPostalCode getpostalcode13 = (getPostalCode) getbirthdatefull12;
                if (getpostalcode13.write(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    getRootCause.write(com.logistics.rider.glovo.R.drawable.ic_bold_large_essentials_info, this.serializer, null, new getPushAlert(((buildMapping) getpostalcode13.write((getNewPassword) setcurrentsemanticsnodesui2)).setEmojiCompatEnabled(), ((buildMapping) getpostalcode13.write((getNewPassword) setcurrentsemanticsnodesui2)).setEmojiCompatEnabled(), ((buildMapping) getpostalcode13.write((getNewPassword) setcurrentsemanticsnodesui2)).setEmojiCompatEnabled()), false, null, null, getpostalcode13, 0, Constant.ERROR_GNSS_STATUS_INVALID);
                } else {
                    getpostalcode13.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 15:
                getBirthDateFull getbirthdatefull13 = (getBirthDateFull) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                getPostalCode getpostalcode14 = (getPostalCode) getbirthdatefull13;
                if (getpostalcode14.write(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui3 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    getRootCause.write(com.logistics.rider.glovo.R.drawable.ic_bold_large_essentials_info, this.serializer, null, new getPushAlert(((buildMapping) getpostalcode14.write((getNewPassword) setcurrentsemanticsnodesui3)).setPresenter(), ((buildMapping) getpostalcode14.write((getNewPassword) setcurrentsemanticsnodesui3)).setPresenter(), ((buildMapping) getpostalcode14.write((getNewPassword) setcurrentsemanticsnodesui3)).setPresenter()), false, null, null, getpostalcode14, 0, Constant.ERROR_GNSS_STATUS_INVALID);
                } else {
                    getpostalcode14.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 16:
                androidx.compose.ui.Modifier modifier2 = (androidx.compose.ui.Modifier) obj;
                getBirthDateFull getbirthdatefull14 = (getBirthDateFull) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                modifier2.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= ((getPostalCode) getbirthdatefull14).read(modifier2) ? 4 : 2;
                }
                getPostalCode getpostalcode15 = (getPostalCode) getbirthdatefull14;
                if (getpostalcode15.write(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    getRootCause.write(com.logistics.rider.glovo.R.drawable.ic_bold_large_essentials_info, this.serializer, modifier2, null, false, null, null, getpostalcode15, (iIntValue14 << 6) & 896, 248);
                } else {
                    getpostalcode15.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 17:
                getBirthDateFull getbirthdatefull15 = (getBirthDateFull) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode16 = (getPostalCode) getbirthdatefull15;
                if (getpostalcode16.write(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    androidx.compose.ui.Modifier.Companion companion8 = androidx.compose.ui.Modifier.Companion;
                    companion8.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_medium_cancel_thin, this.serializer, companion8, false, null, getpostalcode16, 384, 24);
                } else {
                    getpostalcode16.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 18:
                getBirthDateFull getbirthdatefull16 = (getBirthDateFull) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode17 = (getPostalCode) getbirthdatefull16;
                if (getpostalcode17.write(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    androidx.compose.ui.Modifier.Companion companion9 = androidx.compose.ui.Modifier.Companion;
                    companion9.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin, this.serializer, companion9, false, null, getpostalcode17, 384, 24);
                } else {
                    getpostalcode17.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 19:
                getBirthDateFull getbirthdatefull17 = (getBirthDateFull) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode18 = (getPostalCode) getbirthdatefull17;
                if (getpostalcode18.write(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    boolean z5 = getpostalcode18.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    Object objComponentActivity2 = getpostalcode18.ComponentActivity();
                    if (z5) {
                        objComponentActivity2 = new b1$$ExternalSyntheticLambda0(22, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                        getpostalcode18.write(objComponentActivity2);
                    } else {
                        int i15 = RemoteActionCompatParcelizer + 3;
                        IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i15 % 2 != 0) {
                            int i16 = 50 / 0;
                            if (objComponentActivity2 == androidContentCaptureManager) {
                                objComponentActivity2 = new b1$$ExternalSyntheticLambda0(22, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                                getpostalcode18.write(objComponentActivity2);
                            }
                        } else if (objComponentActivity2 == androidContentCaptureManager) {
                            objComponentActivity2 = new b1$$ExternalSyntheticLambda0(22, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                            getpostalcode18.write(objComponentActivity2);
                        }
                    }
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, null, false, null, getpostalcode18, 0, 28);
                } else {
                    getpostalcode18.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 20:
                getBirthDateFull getbirthdatefull18 = (getBirthDateFull) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode19 = (getPostalCode) getbirthdatefull18;
                if (getpostalcode19.write(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    int i17 = IconCompatParcelizer + 31;
                    RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    androidx.compose.ui.Modifier.Companion companion10 = androidx.compose.ui.Modifier.Companion;
                    companion10.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_essentials_info_outline, this.serializer, companion10, false, null, getpostalcode19, 384, 24);
                } else {
                    getpostalcode19.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 21:
                getBirthDateFull getbirthdatefull19 = (getBirthDateFull) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((ModalBottomSheetDialogWrapper) obj).getClass();
                getPostalCode getpostalcode20 = (getPostalCode) getbirthdatefull19;
                if (getpostalcode20.write(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    androidx.compose.ui.Modifier.Companion companion11 = androidx.compose.ui.Modifier.Companion;
                    androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.PaddingKt.write(companion11, Dimensions.setTabContainer);
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, androidx.compose.ui.Alignment.Companion.getStart(), getpostalcode20, 0);
                    int iHashCode = Long.hashCode(getpostalcode20.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode20.serializer();
                    androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode20, modifierWrite);
                    androidx.compose.ui.node.ComposeUiNode.Companion companion12 = androidx.compose.ui.node.ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion12.getConstructor();
                    if (getpostalcode20.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode20.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode20.ComponentActivity) {
                        getpostalcode20.serializer(constructor);
                    } else {
                        getpostalcode20.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion12, getpostalcode20, modalBottomSheetYbuCTN8Serializer, getpostalcode20, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode20, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion12, getpostalcode20, Integer.valueOf(iHashCode), getpostalcode20));
                    androidx.compose.material3.TextKt.m131TextNvy7gAk(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.login_verify_account_info_box_title, getpostalcode20, 0), null, ((buildMapping) getpostalcode20.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, androidx.compose.ui.text.font.FontWeight.Companion.getBold(), null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode20, 1572864, 0, 131002);
                    VerifyScreenKt.IconCompatParcelizer(0, getpostalcode20, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(companion11, 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.login_verify_account_info_bullet_1, getpostalcode20, 0));
                    String strStringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.login_verify_account_info_bullet_2, getpostalcode20, 0);
                    float f = Dimensions.setPrimaryBackground;
                    VerifyScreenKt.IconCompatParcelizer(0, getpostalcode20, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(companion11, 0.0f, f, 0.0f, 0.0f, 13), strStringResource);
                    String string = hideCurrentlyDisplayingInAppMessage.read(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.login_verify_account_info_bullet_3_prefix, getpostalcode20, 0)).toString();
                    String strStringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.login_verify_account_info_bullet_3_link, getpostalcode20, 0);
                    VerifyScreenKt.RemoteActionCompatParcelizer(af$$ExternalSyntheticOutline0.m(string, " ", strStringResource2), strStringResource2, this.serializer, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(companion11, 0.0f, f, 0.0f, 0.0f, 13), getpostalcode20, 0);
                    VerifyScreenKt.IconCompatParcelizer(0, getpostalcode20, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(companion11, 0.0f, f, 0.0f, 0.0f, 13), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.login_verify_account_info_bullet_4, getpostalcode20, 0));
                    getpostalcode20.IconCompatParcelizer(true);
                } else {
                    getpostalcode20.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 22:
                ((Integer) obj3).getClass();
                ((androidx.compose.animation.AnimatedVisibilityScope) obj).getClass();
                enableSendingInBackground.IconCompatParcelizer(0, (getBirthDateFull) obj2, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.ui.Modifier.Companion, 0.0f, Dimensions.setHideOnContentScrollEnabled, 0.0f, 0.0f, 13), null, null, null, this.serializer);
                return createfromparcel;
            case 23:
                getBirthDateFull getbirthdatefull20 = (getBirthDateFull) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                if ((iIntValue20 & 17) != 16) {
                    int i19 = RemoteActionCompatParcelizer + 113;
                    IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    z4 = true;
                }
                getPostalCode getpostalcode21 = (getPostalCode) getbirthdatefull20;
                if (getpostalcode21.write(iIntValue20 & 1, z4)) {
                    androidx.compose.ui.Modifier.Companion companion13 = androidx.compose.ui.Modifier.Companion;
                    companion13.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin, this.serializer, companion13, false, null, getpostalcode21, 384, 24);
                } else {
                    getpostalcode21.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 24:
                getBirthDateFull getbirthdatefull21 = (getBirthDateFull) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode22 = (getPostalCode) getbirthdatefull21;
                if (getpostalcode22.write(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    androidx.compose.ui.Modifier.Companion companion14 = androidx.compose.ui.Modifier.Companion;
                    companion14.getClass();
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_large_cancel_thin, this.serializer, companion14, false, null, getpostalcode22, 384, 24);
                } else {
                    getpostalcode22.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 25:
                getBirthDateFull getbirthdatefull22 = (getBirthDateFull) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                if ((iIntValue22 & 17) != 16) {
                    int i21 = RemoteActionCompatParcelizer + 41;
                    IconCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    z3 = true;
                }
                getPostalCode getpostalcode23 = (getPostalCode) getbirthdatefull22;
                if (!(!getpostalcode23.write(iIntValue22 & 1, z3))) {
                    boolean z6 = getpostalcode23.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    Object objComponentActivity3 = getpostalcode23.ComponentActivity();
                    if (z6) {
                        objComponentActivity3 = new extractJsonLong(10, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                        getpostalcode23.write(objComponentActivity3);
                    } else {
                        int i23 = IconCompatParcelizer + 47;
                        RemoteActionCompatParcelizer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        if (objComponentActivity3 == androidContentCaptureManager) {
                            objComponentActivity3 = new extractJsonLong(10, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                            getpostalcode23.write(objComponentActivity3);
                        }
                    }
                    HeaderKt.read(com.logistics.rider.glovo.R.drawable.ic_bold_medium_cancel_thin, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, null, false, null, getpostalcode23, 0, 28);
                } else {
                    getpostalcode23.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            default:
                getBirthDateFull getbirthdatefull23 = (getBirthDateFull) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((copyejIjP34) obj).getClass();
                getPostalCode getpostalcode24 = (getPostalCode) getbirthdatefull23;
                if (getpostalcode24.write(iIntValue23 & 1, !((iIntValue23 & 17) == 16))) {
                    TertiaryKt.IconCompatParcelizer(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.done, getpostalcode24, 0), this.serializer, null, false, 0, null, null, null, getpostalcode24, 0, 252);
                } else {
                    getpostalcode24.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
        }
    }
}
