package com.roadrunner.face.verification.presentation.identitypopup.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.buildMapping;
import o.dc;
import o.expand;
import o.getBirthDateFull;
import o.getCurrentSessionimpl;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.setOnHierarchyChangeListener;
import o.supportingTextPaddinga9UjIt4material3default;
import o.withSessionCancellingPreviousimpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IdentityPopupContentKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    public static final void serializer(String str, String str2, String str3, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1898314336);
        int i5 = 4;
        if ((i & 6) == 0) {
            int i6 = serializer + 75;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode.read(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str2)) {
                int i7 = IconCompatParcelizer + 7;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            int i9 = serializer + 39;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i11 = i2 | 3072;
        if ((i11 & 1171) != 1170) {
            int i12 = serializer + 119;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            int i14 = serializer + 119;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            modifier2 = Modifier.Companion;
            modifier2.getClass();
            getCurrentSessionimpl.read(modifier2, RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.BaseMenuWrapper), withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowIcon(), getpostalcode, 0), null, null, ExtrasKt.write(-249102162, new r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw(str, str2, str3, i5), getpostalcode), getpostalcode, 196608, 24);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setOnHierarchyChangeListener(str, str2, str3, modifier2, i, 0);
        }
        int i16 = IconCompatParcelizer + 73;
        serializer = i16 % Fields.SpotShadowColor;
        if (i16 % 2 != 0) {
            int i17 = 12 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:14:0x0040 A[PHI: r3
  0x0040: PHI (r3v28 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v30 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r3
  0x002c: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v30 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IdentityWarning(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        getPostalCode getpostalcode2;
        Modifier modifier2;
        int i4 = 2 % 2;
        int i5 = serializer + 97;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1874075050);
            if ((i & 111) == 0) {
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                int i6 = IconCompatParcelizer + 75;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1874075050);
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                int i8 = IconCompatParcelizer + 75;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                i3 = i;
            }
        }
        getPostalCode getpostalcode3 = getpostalcode;
        int i10 = i3 | 48;
        if ((i10 & 19) != 18) {
            int i11 = serializer + 125;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            int i13 = serializer + 43;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                int i14 = 5 % 5;
            }
            z = false;
        }
        if (!(!getpostalcode3.write(i10 & 1, z))) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(IntrinsicKt.height(SizeKt.IconCompatParcelizer(companion, null, 3), expand.Min), 0.0f, Dimensions.setSplitBackground, 1);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterVertically(), getpostalcode3, 54);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode3.read != null) {
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i15 = IconCompatParcelizer + 113;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode3, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(companion, Dimensions.getTitle);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_essentials_warning, getpostalcode3, 0);
                ColorFilter.Companion companion3 = ColorFilter.Companion;
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                ImageKt.Image(painterPainterResource, "This icon is used to show the warning symbol for the instructions section", modifierM83size3ABfNKs, null, null, 0.0f, ColorFilter.Companion.m763tintxETnrds$default(companion3, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0, 2, null), getpostalcode3, Painter.$stable | 48, 56);
                TextKt.m131TextNvy7gAk(str, SizeKt.IconCompatParcelizer(companion, null, 3), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper(), getpostalcode3, (i10 & 14) | 48, 0, 130040);
                getpostalcode2 = getpostalcode3;
                getpostalcode2.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode2 = getpostalcode3;
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, 10);
        }
    }
}
