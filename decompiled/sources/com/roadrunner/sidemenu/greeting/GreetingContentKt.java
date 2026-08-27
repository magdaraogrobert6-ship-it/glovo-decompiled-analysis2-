package com.roadrunner.sidemenu.greeting;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.buildMapping;
import o.dc;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;
import o.r8lambdasr5bVOa2Di9thfD9WpM7Q9rULYM;
import o.r8lambdatyvITgIQDQNju3oEx9E3EWUPNmg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GreetingContentKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035 A[PHI: r7
  0x0035: PHI (r7v5 o.getPostalCode) = (r7v1 o.getPostalCode), (r7v6 o.getPostalCode) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r7
  0x002a: PHI (r7v2 o.getPostalCode) = (r7v1 o.getPostalCode), (r7v6 o.getPostalCode) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void serializer(r8lambdatyvITgIQDQNju3oEx9E3EWUPNmg r8lambdatyvitgiqdqnju3oex9e3ewupnmg, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = serializer + 95;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            r8lambdatyvitgiqdqnju3oex9e3ewupnmg.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-390619527);
            if ((i & 85) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdatyvitgiqdqnju3oex9e3ewupnmg)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            r8lambdatyvitgiqdqnju3oex9e3ewupnmg.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-390619527);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdatyvitgiqdqnju3oex9e3ewupnmg)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        int i6 = i3 | 48;
        int i7 = 0;
        if ((i6 & 19) != 18) {
            int i8 = IconCompatParcelizer + 57;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            int i10 = serializer + 37;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            modifier = Modifier.Companion;
            Greeting(i6 & 112, getpostalcode, modifier, ((r8lambdasr5bVOa2Di9thfD9WpM7Q9rULYM) ExtrasKt.write(r8lambdatyvitgiqdqnju3oex9e3ewupnmg.IconCompatParcelizer, getpostalcode, 0).getValue()).read);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, i7, r8lambdatyvitgiqdqnju3oex9e3ewupnmg, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    public static final void Greeting(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        int i3 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1722576339);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = IconCompatParcelizer + 45;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        int i6 = i2;
        if (getpostalcode2.write(i6 & 1, (i6 & 19) != 18)) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getBottomStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i7 = serializer + 19;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i8 = 43 / 0;
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            getNonZeroRgk1Os.RemoteActionCompatParcelizer(Integer.valueOf(R.drawable.img_large_brand_header_circles), null, null, null, null, getpostalcode2, 48, 2044);
            TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
            long customSelectionActionModeCallback = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setCustomSelectionActionModeCallback();
            Modifier.Companion companion2 = Modifier.Companion;
            float f = Dimensions.setTabContainer;
            TextKt.m131TextNvy7gAk(str, PaddingKt.m74paddingqDBjuR0$default(companion2, f, 0.0f, f, Dimensions.setVisibility, 2), customSelectionActionModeCallback, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode2, i6 & 14, 0, 131064);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i9 = IconCompatParcelizer + 49;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 26);
        }
    }
}
