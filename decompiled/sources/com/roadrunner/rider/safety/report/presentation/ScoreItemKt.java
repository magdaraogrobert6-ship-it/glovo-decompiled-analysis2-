package com.roadrunner.rider.safety.report.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
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
import androidx.compose.ui.unit.Dp;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.enableDeviceIdsReadingOnce;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getStoreInfo;
import o.handleUrlOverridelambda1;
import o.onMessageReceived;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScoreItemKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    /* JADX WARN: Code duplicated, block: B:77:0x02b4  */
    public static final void ScoreItem(String str, String str2, String str3, enableDeviceIdsReadingOnce enabledeviceidsreadingonce, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = write + 7;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        str.getClass();
        str2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1348192529);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i9 = RemoteActionCompatParcelizer + 31;
                write = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    i5 = 2;
                } else {
                    i5 = 4;
                }
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = write + 9;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(enabledeviceidsreadingonce.ordinal()) ^ true ? Fields.RotationZ : Fields.CameraDistance;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.read;
            Alignment.Companion companion = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$1, companion.getTop(), getpostalcode, 6);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierM86width3ABfNKs = SizeKt.m86width3ABfNKs(companion3, Dp.m3673constructorimpl(215.0f));
                Alignment.Horizontal start = companion.getStart();
                FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, start, getpostalcode, 48);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM86width3ABfNKs);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long presenter = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                TextAlign.Companion companion4 = TextAlign.Companion;
                int i12 = i2;
                TextKt.m131TextNvy7gAk(str, null, presenter, 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3516getStarte0LSkKk()), 0L, 0, false, 1, 0, null, textStyle, getpostalcode, i2 & 14, 24576, 113658);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.getNestedScrollAxes)});
                TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, (i12 >> 3) & 14, 0, 130042);
                getpostalcode.IconCompatParcelizer(true);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getCenterHorizontally(), getpostalcode, 48);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor3);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                int[] iArr = getStoreInfo.read;
                int i13 = iArr[enabledeviceidsreadingonce.ordinal()];
                if (i13 != 1) {
                    int i14 = write + 83;
                    int i15 = i14 % Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i15;
                    int i16 = i14 % 2;
                    if (i13 == 2) {
                        i3 = 0;
                        getpostalcode.serializer(1454526364);
                        TagsKt.write(str3, null, 0, 0, getpostalcode, (i12 >> 6) & 14, 30);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        int i17 = i15 + 21;
                        write = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 == 0 ? i13 == 3 : i13 == 2) {
                            i3 = 0;
                            getpostalcode.serializer(1454528058);
                            TagsKt.serializer(str3, (Modifier) null, 0, 0, getpostalcode, (i12 >> 6) & 14, 30);
                            getpostalcode.IconCompatParcelizer(false);
                        } else if (i13 == 4) {
                            getpostalcode.serializer(1454529690);
                            TagsKt.serializer(2032277805, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer(), -2032277804, new Object[]{str3, null, 0, 0, getpostalcode, Integer.valueOf((i12 >> 6) & 14), 30}, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer());
                            i3 = 0;
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1454524992, false);
                        }
                    }
                } else {
                    i3 = 0;
                    getpostalcode.serializer(1454526364);
                    TagsKt.write(str3, null, 0, 0, getpostalcode, (i12 >> 6) & 14, 30);
                    getpostalcode.IconCompatParcelizer(false);
                }
                int i18 = iArr[enabledeviceidsreadingonce.ordinal()];
                if (i18 != 1) {
                    int i19 = write + 97;
                    RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    if (i18 == 2) {
                        i4 = R.string.rider_safety_good_tag;
                    } else if (i18 == 3) {
                        i4 = R.string.rider_safety_okay_tag;
                    } else {
                        if (i18 != 4) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return;
                        }
                        i4 = R.string.rider_safety_poor_tag;
                    }
                } else {
                    i4 = R.string.rider_safety_excellent_tag;
                }
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(i4, getpostalcode, i3), null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 1, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 0, 24576, 113658);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
                int i21 = RemoteActionCompatParcelizer + 35;
                write = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(str, str2, str3, enabledeviceidsreadingonce, modifier, i, 12);
        }
    }
}
