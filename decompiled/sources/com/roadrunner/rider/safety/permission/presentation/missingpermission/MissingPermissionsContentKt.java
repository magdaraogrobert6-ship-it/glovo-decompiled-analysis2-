package com.roadrunner.rider.safety.permission.presentation.missingpermission;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getLayers;
import o.getNewPassword;
import o.getPostalCode;
import o.getSdkVersion;
import o.handleUrlOverridelambda1;
import o.p2;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MissingPermissionsContentKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static final void MissingPermissionsContent(getSdkVersion getsdkversion, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        getsdkversion.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2055566137);
        if ((i & 6) == 0) {
            if (getpostalcode.read(getsdkversion)) {
                int i5 = RemoteActionCompatParcelizer + 109;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 != 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i6 = i2 | 384;
        if ((i6 & 147) != 146) {
            int i7 = RemoteActionCompatParcelizer + 89;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 4 % 3;
            }
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            float f = Dimensions.setLogo;
            Modifier modifierWrite2 = PaddingKt.write(modifierWrite, f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i9 = RemoteActionCompatParcelizer + 111;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
            TitleColumn(null, getpostalcode, 0);
            MissingPermissionRow(getsdkversion, af$$ExternalSyntheticOutline1.m(companion, Dimensions.setUiOptions, getpostalcode, companion, 1.0f), getpostalcode, (i6 & 14) | 48);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, companion.then(new show(1.0f, true))});
            PrimaryKt.write(StringResources_androidKt.stringResource(R.string.rider_safety_give_permission_action_text, getpostalcode, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion, 1.0f), false, false, null, null, null, null, null, getpostalcode, (i6 & 112) | 384, 0, 2040);
            getpostalcode.IconCompatParcelizer(true);
            obj = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            obj = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 5, getsdkversion, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, obj);
        }
    }

    public static final void TitleColumn(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 31;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1060560795);
        int i5 = i | 6;
        if (getpostalcode2.write(i5 & 1, (i5 & 3) != 2)) {
            int i6 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i8 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode2.ComponentActivity)) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String strStringResource = StringResources_androidKt.stringResource(R.string.rider_safety_permissions_screen_title, getpostalcode2, 0);
            TextStyle textStyleMediaSessionCompatQueueItem = performLayout.MediaSessionCompatQueueItem();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(strStringResource, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatQueueItem, getpostalcode2, 0, 0, 131066);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(companion, Dimensions.getNestedScrollAxes)});
            TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.rider_safety_permissions_screen_rationale, getpostalcode2, 0), null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode2, 0, 0, 131066);
            getpostalcode2.IconCompatParcelizer(true);
            getpostalcode = getpostalcode2;
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i10 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier2, i, 23);
        }
    }

    public static final void MissingPermissionRow(getSdkVersion getsdkversion, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1251968063);
        if ((i & 6) == 0) {
            int i5 = RemoteActionCompatParcelizer + 79;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                i2 = (!getpostalcode2.read(getsdkversion) ? 2 : 4) | i;
            } else {
                getpostalcode2.read(getsdkversion);
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i6 = RemoteActionCompatParcelizer + 83;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i8 = RemoteActionCompatParcelizer + 65;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode2.ComponentActivity)) {
                    int i10 = RemoteActionCompatParcelizer + 87;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        getpostalcode2.serializer(constructor);
                        int i11 = 12 / 0;
                    } else {
                        getpostalcode2.serializer(constructor);
                    }
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dimensions.setActionBarVisibilityCallback, 0.0f, 11), Dimensions.setUiOptions);
                float f = Dimensions.write;
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                ImageKt.Image(PainterResources_androidKt.painterResource(getsdkversion.IconCompatParcelizer, getpostalcode2, 0), "", PaddingKt.write(BorderKt.write(modifierM83size3ABfNKs, f, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPopupCallback)), Dimensions.getNestedScrollAxes), null, null, 0.0f, ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0, 2, null), getpostalcode2, Painter.$stable | 48, 56);
                getpostalcode = getpostalcode2;
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(getsdkversion.read, getpostalcode2, 0), d$$ExternalSyntheticOutline0.m(1.0f, true, companion2), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode, 0, 0, 131064);
                getpostalcode.IconCompatParcelizer(true);
                int i12 = IconCompatParcelizer + 77;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 25, getsdkversion, modifier);
        }
    }
}
