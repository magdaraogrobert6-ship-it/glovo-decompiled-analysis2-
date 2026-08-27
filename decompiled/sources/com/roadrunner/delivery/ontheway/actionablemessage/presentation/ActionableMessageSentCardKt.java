package com.roadrunner.delivery.ontheway.actionablemessage.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.StrokeJoinCompanion;
import o.TextFieldDefaults;
import o.accessgetXyzcp;
import o.buildMapping;
import o.computeHorizontalScrollExtent;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCmykxdoWZVw;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLayers;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getVonKries;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdatZCIhOZ7wAy4U965kw0Q8vORJT8;
import o.setCurrentSemanticsNodesui;
import o.setCursorui_text;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ActionableMessageSentCardKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    public static final void MessageSentTick(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1882758657);
        int i3 = i | 6;
        if ((i3 & 3) != 2) {
            int i4 = write + 9;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!getpostalcode.write(i3 & 1, z))) {
            int i6 = write + 59;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            modifier = Modifier.Companion;
            float f = Dimensions.getNestedScrollAxes;
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(modifier, f, 0.0f, 0.0f, 0.0f, 14), Dimensions.setLogo);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierM83size3ABfNKs, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setDropDownBackgroundResource(), RoundedCornerShapeKt.IconCompatParcelizer(f));
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i8 = IconCompatParcelizer + 105;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i10 = IconCompatParcelizer + 29;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_tick_thin, getpostalcode, 0), (String) null, PaddingKt.m73paddingVpY3zN4$default(BoxScopeInstance.serializer.align(modifier, companion.getCenter()), 0.0f, Dp.m3673constructorimpl(4.0f), 1), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportBackgroundTintList(), getpostalcode, Painter.$stable | 48, 0);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x0138  */
    public static final void SuccessAnimation(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1477283116);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i5 = write + 121;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                i2 = i5 % 2 != 0 ? 92 : 32;
            } else {
                i2 = 16;
            }
            i4 |= i2;
            int i6 = IconCompatParcelizer + 45;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = i4;
        boolean z2 = true;
        if ((i8 & 19) != 18) {
            int i9 = write + 119;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i8 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            accessgetXyzcp accessgetxyzcpIconCompatParcelizer = RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(R.raw.success), getpostalcode2);
            getVonKries getvonkriesWrite = r8lambdatZCIhOZ7wAy4U965kw0Q8vORJT8.write((StrokeJoinCompanion) accessgetxyzcpIconCompatParcelizer.getValue(), 0, getpostalcode2, 1022);
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dimensions.setActionBarVisibilityCallback, 0.0f, 11), Dimensions.setActionBarHideOffset);
            StrokeJoinCompanion strokeJoinCompanion = (StrokeJoinCompanion) accessgetxyzcpIconCompatParcelizer.getValue();
            boolean z3 = getpostalcode2.read(getvonkriesWrite);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z3) {
                objComponentActivity = new setCursorui_text(getvonkriesWrite, 0);
                getpostalcode2.write(objComponentActivity);
            } else {
                int i11 = write + 117;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    int i12 = 79 / 0;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new setCursorui_text(getvonkriesWrite, 0);
                        getpostalcode2.write(objComponentActivity);
                    }
                } else if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new setCursorui_text(getvonkriesWrite, 0);
                    getpostalcode2.write(objComponentActivity);
                }
            }
            ColorModel.RemoteActionCompatParcelizer(strokeJoinCompanion, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierM83size3ABfNKs, false, false, false, false, null, false, null, null, false, false, null, null, true, getpostalcode2, 0, 1572864, 65528);
            boolean z4 = !(((Number) getvonkriesWrite.getValue()).floatValue() != 1.0f);
            getpostalcode = getpostalcode2;
            boolean z5 = getpostalcode.read(getvonkriesWrite);
            if ((i8 & 112) == 32) {
                int i13 = IconCompatParcelizer + 3;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else {
                z2 = false;
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!z5 && !z2) {
                int i15 = IconCompatParcelizer + 41;
                write = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    int i16 = 20 / 0;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new LocalAuthDataSource.AnonymousClass2(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getvonkriesWrite, null, 21);
                        getpostalcode.write(objComponentActivity2);
                    }
                } else if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new LocalAuthDataSource.AnonymousClass2(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getvonkriesWrite, null, 21);
                    getpostalcode.write(objComponentActivity2);
                }
            } else {
                objComponentActivity2 = new LocalAuthDataSource.AnonymousClass2(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getvonkriesWrite, null, 21);
                getpostalcode.write(objComponentActivity2);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Boolean.valueOf(z4), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 6);
        }
    }

    public static final void MessageSentCardContent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-623827750);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i5 = write + 7;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode2.read(str);
                throw null;
            }
            i2 = i | (getpostalcode2.read(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!(!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0))) {
                int i6 = write + 15;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i8 = i2 | 384;
        if ((i8 & 147) != 146) {
            int i9 = IconCompatParcelizer;
            int i10 = i9 + 21;
            write = i10 % Fields.SpotShadowColor;
            z = i10 % 2 != 0;
            int i11 = i9 + 81;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i8 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(companion, Dimensions.setActionBarVisibilityCallback, Dimensions.getNestedScrollAxes);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, centerVertically, getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            SuccessAnimation(i8 & 112, getpostalcode2, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i13 = write + 79;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    getpostalcode2.serializer(constructor2);
                    throw null;
                }
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getCenterVertically(), getpostalcode2, 48);
            int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor3);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
            String strStringResource = StringResources_androidKt.stringResource(R.string.actionable_customer_chat_message_sent, getpostalcode2, 0);
            TextStyle textStyle = (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(strStringResource, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131066);
            MessageSentTick(null, getpostalcode2, 0);
            getpostalcode2.IconCompatParcelizer(true);
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, i8 & 14, 0, 131066);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 3);
        }
    }
}
