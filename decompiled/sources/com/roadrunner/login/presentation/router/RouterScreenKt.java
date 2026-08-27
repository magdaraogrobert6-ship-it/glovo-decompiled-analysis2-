package com.roadrunner.login.presentation.router;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ca;
import o.cdExternalSyntheticLambda0;
import o.d9;
import o.generatePOSTBodyString;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.p2;
import o.p7;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RouterScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void write(cdExternalSyntheticLambda0 cdexternalsyntheticlambda0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        cdexternalsyntheticlambda0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2136590540);
        boolean z = true;
        if ((i & 6) == 0) {
            int i4 = IconCompatParcelizer + 1;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = (getpostalcode.read(cdexternalsyntheticlambda0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i6 = IconCompatParcelizer + 119;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i8 = IconCompatParcelizer + 73;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            RouterContent(cdexternalsyntheticlambda0.RemoteActionCompatParcelizer, cdexternalsyntheticlambda0.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier.Companion, getpostalcode, ((i2 << 3) & 896) | 3072);
            int i10 = IconCompatParcelizer + 59;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 17, cdexternalsyntheticlambda0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }

    public static final void RouterContent(String str, ca caVar, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1725402802);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i7 = read + 57;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(caVar)) {
                int i9 = read + 11;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.read(modifier)) {
                int i11 = read + 39;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                i3 = i11 % 2 == 0 ? 20543 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifier.then(SizeKt.read), 0.0f, Dimensions.setVisibility, 0.0f, 0.0f, 13);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i12 = read + 59;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z3 = getpostalcode.ComponentActivity;
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i13 = IconCompatParcelizer + 31;
                read = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier.Companion companion3 = Modifier.Companion;
            companion3.getClass();
            d9.read(i2 & 14, getpostalcode, PaddingKt.m74paddingqDBjuR0$default(BoxScopeInstance.serializer.align(companion3, companion.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dimensions.getAnimatedVisibility, 7), str);
            if (caVar == null) {
                getpostalcode.serializer(-2055660074);
                getpostalcode.IconCompatParcelizer(false);
                z2 = true;
            } else {
                getpostalcode.serializer(-2055660073);
                String strStringResource = StringResources_androidKt.stringResource(R.string.no_mobile_services, getpostalcode, 0);
                getpostalcode.serializer(-1735645070);
                getpostalcode.IconCompatParcelizer(false);
                generatePOSTBodyString generatepostbodystring = new generatePOSTBodyString(null, false, strStringResource, null, null, null, 121, null);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    z = true;
                    objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                    getpostalcode.write(objComponentActivity);
                } else {
                    z = true;
                }
                z2 = z;
                MessagePopUpKt.serializer(generatepostbodystring, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, null, null, getpostalcode, ((i2 << 9) & 458752) | 48, 476);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(z2);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7(i, 10, modifier, str, caVar, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
