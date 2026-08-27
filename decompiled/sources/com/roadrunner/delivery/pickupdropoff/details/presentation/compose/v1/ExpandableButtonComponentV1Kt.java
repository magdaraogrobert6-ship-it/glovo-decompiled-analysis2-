package com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1;

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
public abstract class ExpandableButtonComponentV1Kt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [o.getBirthDateFull] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r15v2, types: [o.getBirthDateFull, o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v12, types: [o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r3v32, types: [o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r3v33, types: [o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    public static final void ExpandableButtonComponentV1(accessgetFakeSavedStateRegistryOwnerp accessgetfakesavedstateregistryownerp, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        ?? r3;
        getPostalCode getpostalcode;
        ?? r14;
        ?? r15;
        boolean z;
        ?? r4;
        boolean z2;
        getPostalCode getpostalcode2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        accessgetfakesavedstateregistryownerp.getClass();
        Integer num = accessgetfakesavedstateregistryownerp.IconCompatParcelizer;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(770145098);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode3.read(accessgetfakesavedstateregistryownerp) : getpostalcode3.IconCompatParcelizer(accessgetfakesavedstateregistryownerp)) {
                int i6 = read + 25;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            int i8 = RemoteActionCompatParcelizer + 39;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = read + 99;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i12 = read + 85;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i14 = i2 | 384;
        if (getpostalcode3.write(i14 & 1, (i14 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            float f = Dimensions.write;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifier3 = canReadPlayIds.read(PaddingKt.RemoteActionCompatParcelizer(BorderKt.write(companion, f, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setKeyListener(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setChecked)), Dimensions.setTabContainer, Dimensions.setStackedBackground), null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode3, 63);
            modifier3.getClass();
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterVertically(), getpostalcode3, 54);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode3.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i15 = RemoteActionCompatParcelizer + 19;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                getpostalcode3.serializer(constructor);
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode3, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
            TextKt.m131TextNvy7gAk(accessgetfakesavedstateregistryownerp.serializer, null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatQueueItem(), getpostalcode3, 0, 0, 131066);
            if (num != null) {
                getpostalcode2 = getpostalcode3;
                getpostalcode2.serializer(-803279443);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m86width3ABfNKs(companion, Dimensions.setMenu)});
                r14 = 0;
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode3;
                r14 = 0;
                getpostalcode.serializer(-803203524);
                getpostalcode.IconCompatParcelizer(false);
            }
            if (num == null) {
                r15 = getpostalcode;
                int i17 = read + 83;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    r15 = getpostalcode2;
                    r15.serializer(-803155227);
                    z2 = true;
                    r15.IconCompatParcelizer(true);
                } else {
                    r15 = getpostalcode2;
                    z2 = true;
                    r15.serializer(-803155227);
                    r15.IconCompatParcelizer(r14);
                }
                z = z2;
                r4 = r15;
            } else {
                r15 = getpostalcode;
                r15 = getpostalcode2;
                r15.serializer(-803155226);
                int iIntValue = num.intValue();
                getNonZeroRgk1Os.write(Integer.valueOf(iIntValue), null, SizeKt.m83size3ABfNKs(companion, Dp.m3673constructorimpl(24.0f)), Okio.RemoteActionCompatParcelizer(iIntValue, r15, r14), null, null, null, null, ContentScale.Companion.getNone(), ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, ((buildMapping) r15.write(setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), 0, 2, null), r15, (Painter.$stable << 9) | 432, 6, 27632);
                ?? r5 = r15;
                r5.IconCompatParcelizer(r14);
                z = true;
                r4 = r5;
            }
            r4.IconCompatParcelizer(z);
            modifier2 = companion;
            r3 = r4;
        } else {
            getPostalCode getpostalcode4 = getpostalcode3;
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            r3 = getpostalcode4;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = r3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new FontScaleConverterFactory(accessgetfakesavedstateregistryownerp, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 1);
        }
    }
}
