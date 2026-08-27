package com.roadrunner.delivery.stacked.delivery.list.compose.v1;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FontScaleConverterFactory;
import o.TextFieldDefaults;
import o.accessgetFakeSavedStateRegistryOwnerp;
import o.buildMapping;
import o.canReadPlayIds;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExpandableButtonV1Kt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static final void ExpandableButtonV1(accessgetFakeSavedStateRegistryOwnerp accessgetfakesavedstateregistryownerp, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5;
        int i6 = 2 % 2;
        accessgetfakesavedstateregistryownerp.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-60833021);
        if ((i & 6) == 0) {
            int i7 = RemoteActionCompatParcelizer + 125;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? (i & 8) == 0 : (i & 88) == 0) {
                zIconCompatParcelizer = getpostalcode.read(accessgetfakesavedstateregistryownerp);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessgetfakesavedstateregistryownerp);
                int i8 = IconCompatParcelizer + 113;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
            if (zIconCompatParcelizer) {
                int i10 = RemoteActionCompatParcelizer + 5;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i12 = IconCompatParcelizer + 3;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i14 = RemoteActionCompatParcelizer + 21;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                i4 = i14 % 2 == 0 ? 112 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i15 = RemoteActionCompatParcelizer + 123;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                i3 = i15 % 2 == 0 ? 19980 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            int i16 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            float f = Dimensions.write;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifier2 = canReadPlayIds.read(PaddingKt.RemoteActionCompatParcelizer(BorderKt.write(modifier, f, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setKeyListener(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setChecked)), Dimensions.setTabContainer, Dimensions.setStackedBackground), null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, 63);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterVertically(), getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            Object obj = null;
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i18 = RemoteActionCompatParcelizer + 113;
                    IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 != 0) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.serializer(constructor);
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                TextKt.m131TextNvy7gAk(accessgetfakesavedstateregistryownerp.serializer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatQueueItem(), getpostalcode, 0, 0, 131066);
                Integer num = accessgetfakesavedstateregistryownerp.IconCompatParcelizer;
                if (num == null) {
                    int i19 = RemoteActionCompatParcelizer + 5;
                    IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 == 0) {
                        getpostalcode.serializer(2116373536);
                        z = false;
                    } else {
                        z = false;
                        getpostalcode.serializer(2116373536);
                    }
                    getpostalcode.IconCompatParcelizer(z);
                } else {
                    getpostalcode.serializer(2116373537);
                    int iIntValue = num.intValue();
                    Modifier.Companion companion2 = Modifier.Companion;
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion2, Dimensions.setMenu)});
                    getNonZeroRgk1Os.write(Integer.valueOf(iIntValue), null, SizeKt.m83size3ABfNKs(companion2, Dp.m3673constructorimpl(24.0f)), Okio.RemoteActionCompatParcelizer(iIntValue, getpostalcode, 0), null, null, null, null, ContentScale.Companion.getNone(), ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), 0, 2, null), getpostalcode, (Painter.$stable << 9) | 432, 6, 27632);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new FontScaleConverterFactory(accessgetfakesavedstateregistryownerp, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 0);
        }
    }
}
