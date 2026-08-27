package com.roadrunner.delivery.pickupdropoff.details.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.FixedScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.getStore;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw;
import o.r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InstructionV2Kt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[PHI: r0 r2 r5
  0x004f: PHI (r0v32 int) = (r0v4 int), (r0v33 int) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r2v19 o.getAddressCountry) = (r2v1 o.getAddressCountry), (r2v20 o.getAddressCountry) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r5v5 o.getPostalCode) = (r5v1 o.getPostalCode), (r5v7 o.getPostalCode) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003a A[PHI: r0 r2 r5
  0x003a: PHI (r0v5 int) = (r0v4 int), (r0v33 int) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r2v2 o.getAddressCountry) = (r2v1 o.getAddressCountry), (r2v20 o.getAddressCountry) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r5v2 o.getPostalCode) = (r5v1 o.getPostalCode), (r5v7 o.getPostalCode) binds: [B:8:0x0038, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void InstructionV2(r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        boolean zIconCompatParcelizer;
        int i3;
        int i4;
        Modifier modifier2;
        boolean z;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 81;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            i2 = r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m.read;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1832145465);
            getaddresscountry = getpostalcode.read;
            if ((i & 127) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m);
                }
                if (zIconCompatParcelizer) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i | i3;
            } else {
                i4 = i;
            }
        } else {
            i2 = r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m.read;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1832145465);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m);
                }
                if (zIconCompatParcelizer) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i | i3;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i7 = i4 | 384;
        if (getpostalcode.write(i7 & 1, (i7 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifierWrite, f, 0.0f, 2);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            FixedScale none = ContentScale.Companion.getNone();
            ColorFilter.Companion companion4 = ColorFilter.Companion;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            modifier2 = companion;
            getNonZeroRgk1Os.write(Integer.valueOf(i2), null, null, Okio.RemoteActionCompatParcelizer(i2, getpostalcode, 0), null, null, null, null, none, ColorFilter.Companion.m763tintxETnrds$default(companion4, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0, 2, null), getpostalcode, (Painter.$stable << 9) | 48, 6, 27636);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(modifier2, f)});
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m131TextNvy7gAk(r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m.write, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
            String str = r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m.RemoteActionCompatParcelizer;
            if (str == null) {
                getpostalcode.serializer(-658468345);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-658468344);
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(false);
            }
            r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw r8lambdaaiqcq78tsty9mg_yjfdvtlmfw = r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m.serializer;
            if (r8lambdaaiqcq78tsty9mg_yjfdvtlmfw == null) {
                getpostalcode.serializer(-658328008);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-658328007);
                String str2 = r8lambdaaiqcq78tsty9mg_yjfdvtlmfw.serializer;
                if ((i7 & 112) == 32) {
                    int i8 = IconCompatParcelizer + 115;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(r8lambdaaiqcq78tsty9mg_yjfdvtlmfw);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 4, r8lambdaaiqcq78tsty9mg_yjfdvtlmfw);
                    getpostalcode.write(objComponentActivity);
                }
                TertiaryKt.IconCompatParcelizer(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, false, 0, null, null, null, getpostalcode, 0, 252);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i10 = IconCompatParcelizer + 85;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 14, r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2);
        }
        int i12 = write + 69;
        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
    }
}
