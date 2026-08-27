package com.roadrunner.rider.safety.report.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import com.roadrunner.rrds.compose.component.indicators.loading.ProgressorCirclesKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.enableDeviceIdsReadingOnce;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getLogger;
import o.getNewPassword;
import o.getPostalCode;
import o.getPreinstallFilePath;
import o.getUrlStrategyDomains;
import o.handleUrlOverridelambda1;
import o.onMessageReceived;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RiderSafetyScoreKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    public static final void RiderSafetyScore(getPreinstallFilePath getpreinstallfilepath, getLogger getlogger, Modifier modifier, String str, String str2, String str3, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        String str4;
        String str5;
        String str6;
        String strStringResource;
        String strStringResource2;
        String str7;
        String str8;
        float f;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 29;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        String str9 = getpreinstallfilepath.write;
        enableDeviceIdsReadingOnce enabledeviceidsreadingonce = getpreinstallfilepath.IconCompatParcelizer;
        String str10 = getlogger.RemoteActionCompatParcelizer;
        String str11 = getlogger.write;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1454598769);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 109;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (getpostalcode2.read(getpreinstallfilepath) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(getlogger) ? 32 : 16;
        }
        int i8 = i2 | 384;
        if ((i & 3072) == 0) {
            int i9 = RemoteActionCompatParcelizer + 65;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i8 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            int i11 = serializer + 29;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i8 |= 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= 65536;
        }
        if ((74899 & i8) != 74898) {
            int i13 = serializer + 101;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode2.write(i8 & 1, z)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode2.PlaybackStateCompat()) {
                Modifier.Companion companion = Modifier.Companion;
                String strStringResource3 = StringResources_androidKt.stringResource(R.string.rider_safety_heres_your_road_safety_score, getpostalcode2, 0);
                int i14 = getUrlStrategyDomains.write[enabledeviceidsreadingonce.ordinal()];
                if (i14 != 1) {
                    int i15 = RemoteActionCompatParcelizer;
                    int i16 = i15 + 59;
                    serializer = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 == 0 ? i14 == 2 : i14 == 3) {
                        getpostalcode2.serializer(-2005034679);
                        strStringResource = StringResources_androidKt.stringResource(R.string.rider_safety_good_tag, getpostalcode2, 0);
                        getpostalcode2.IconCompatParcelizer(false);
                    } else if (i14 == 3) {
                        getpostalcode2.serializer(-2005032279);
                        strStringResource = StringResources_androidKt.stringResource(R.string.rider_safety_okay_tag, getpostalcode2, 0);
                        getpostalcode2.IconCompatParcelizer(false);
                    } else {
                        if (i14 != 4) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode2, -2005038243, false);
                        }
                        int i17 = i15 + 107;
                        serializer = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        getpostalcode2.serializer(-2005029879);
                        strStringResource = StringResources_androidKt.stringResource(R.string.rider_safety_poor_tag, getpostalcode2, 0);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode2.serializer(-2005037234);
                    strStringResource = StringResources_androidKt.stringResource(R.string.rider_safety_excellent_tag, getpostalcode2, 0);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                if (str11 != null) {
                    int i19 = serializer + 123;
                    RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    getpostalcode2.serializer(-2026256228);
                    strStringResource2 = StringResources_androidKt.stringResource(R.string.rider_safety_based_on_your_riding_from_until, new Object[]{str10, str11}, getpostalcode2, 0);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(-2026071003);
                    strStringResource2 = StringResources_androidKt.stringResource(R.string.rider_safety_based_on_your_riding_from, new Object[]{str10}, getpostalcode2, 0);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                str7 = strStringResource2;
                modifier2 = companion;
                str8 = strStringResource3;
                str5 = strStringResource;
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
                str8 = str;
                str5 = str2;
                str7 = str3;
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            float f2 = getpreinstallfilepath.RemoteActionCompatParcelizer / 100.0f;
            Modifier modifierWrite = SizeKt.write(modifier2, 1.0f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
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
                int i21 = serializer + 1;
                RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TextStyle textStyleMediaSessionCompatToken = performLayout.MediaSessionCompatToken();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long presenter = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
            TextAlign.Companion companion4 = TextAlign.Companion;
            TextKt.m131TextNvy7gAk(str8, null, presenter, 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatToken, getpostalcode2, 0, 0, 130042);
            Modifier.Companion companion5 = Modifier.Companion;
            float f3 = Dimensions.setActionBarVisibilityCallback;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion5, f3)});
            Modifier modifierWrite2 = SizeKt.write(companion5, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getCenterHorizontally(), getpostalcode2, 48);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            int i23 = getUrlStrategyDomains.write[enabledeviceidsreadingonce.ordinal()];
            if (i23 == 1) {
                f = f3;
                getpostalcode2.serializer(-497998045);
                ProgressorCirclesKt.ProgressorCircleSuccess(str9, f2, null, getpostalcode2, 0);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion5, Dimensions.getNestedScrollAxes)});
                getpostalcode = getpostalcode2;
                TagsKt.write(str5, null, R.drawable.ic_star, 0, getpostalcode2, 0, 26);
                getpostalcode.IconCompatParcelizer(false);
            } else if (i23 == 2) {
                f = f3;
                getpostalcode2.serializer(-497566928);
                ProgressorCirclesKt.ProgressorCircleSuccess(str9, f2, null, getpostalcode2, 0);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion5, Dimensions.getNestedScrollAxes)});
                getpostalcode = getpostalcode2;
                TagsKt.write(str5, null, 0, 0, getpostalcode2, 0, 30);
                getpostalcode.IconCompatParcelizer(false);
            } else if (i23 == 3) {
                getpostalcode2.serializer(-497240684);
                ProgressorCirclesKt.write(str9, f2, null, getpostalcode2, 0);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion5, Dimensions.getNestedScrollAxes)});
                f = f3;
                TagsKt.serializer(str5, (Modifier) null, 0, 0, getpostalcode2, 0, 30);
                getpostalcode2.IconCompatParcelizer(false);
                getpostalcode = getpostalcode2;
            } else {
                if (i23 != 4) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode2, 122482384, false);
                }
                getpostalcode2.serializer(-496918284);
                ProgressorCirclesKt.ProgressorCircleError(str9, f2, null, getpostalcode2, 0);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion5, Dimensions.getNestedScrollAxes)});
                TagsKt.serializer(2032277805, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer(), -2032277804, new Object[]{str5, null, 0, 0, getpostalcode2, 0, 30}, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer());
                getpostalcode2.IconCompatParcelizer(false);
                f = f3;
                getpostalcode = getpostalcode2;
            }
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion5, f)});
            TextKt.m131TextNvy7gAk(str7, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 0, 0, 130042);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            str4 = str8;
            str6 = str7;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            str4 = str;
            str5 = str2;
            str6 = str3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) getpreinstallfilepath, (Object) getlogger, modifier2, (Object) str4, (Object) str5, (Object) str6, i, 22);
        }
    }
}
