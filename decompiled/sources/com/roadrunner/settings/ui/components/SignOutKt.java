package com.roadrunner.settings.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.buildMapping;
import o.canReadPlayIds;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SignOutKt {
    private static int serializer = 1;
    private static int write;

    public static final void SignOut(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        int i3;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1255193173);
        if ((i & 6) == 0) {
            i2 = (!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i5 & 19) != 18) {
            int i6 = write + 41;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i5 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            float f = Dimensions.setTabContainer;
            Modifier modifier3 = canReadPlayIds.read(SizeKt.write(PaddingKt.RemoteActionCompatParcelizer(companion, f, Dimensions.getAnimatedVisibility), 1.0f), null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2, 63);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            Object obj = null;
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i8 = write + 21;
                serializer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    getpostalcode2.serializer(constructor);
                    obj.hashCode();
                    throw null;
                }
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i9 = write + 123;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            modifier2 = companion;
            i3 = 0;
            getpostalcode = getpostalcode2;
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_logout_logout, getpostalcode2, 0), (String) null, (Modifier) null, ColorResources_androidKt.colorResource(R.color.error_dark_02, getpostalcode2, 0), getpostalcode2, Painter.$stable | 48, 4);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(modifier2, f)});
            TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.settings_sign_out_title, getpostalcode, 0), null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setUiOptions(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            i3 = 0;
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, i3);
        }
    }
}
