package com.roadrunner.recentdeliveries.presentation.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.p2;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.startBackgroundTimerI;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeliveryItemKt {
    private static int read = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:14:0x004f A[PHI: r3
  0x004f: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r3
  0x0032: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void DeliveryItem(startBackgroundTimerI startbackgroundtimeri, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        Object obj;
        int i4 = 2 % 2;
        int i5 = write + 57;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            startbackgroundtimeri.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1869383496);
            if ((i & 23) == 0) {
                if (getpostalcode.read(startbackgroundtimeri)) {
                    int i6 = write + 71;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    int i8 = write + 117;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            startbackgroundtimeri.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1869383496);
            if ((i & 6) == 0) {
                if (getpostalcode.read(startbackgroundtimeri)) {
                    int i10 = write + 71;
                    read = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i2 = 4;
                } else {
                    int i12 = write + 117;
                    read = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        int i14 = i3 | 48;
        if ((i14 & 19) != 18) {
            int i15 = read + 13;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i14 & 1, z)) {
            int i17 = read + 9;
            write = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            Modifier.Companion companion = Modifier.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i19 = write + 97;
                read = i19 % Fields.SpotShadowColor;
                if (i19 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    int i20 = 14 / 0;
                } else {
                    getpostalcode.serializer(constructor);
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i21 = write + 95;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            String str = startbackgroundtimeri.RemoteActionCompatParcelizer;
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            TextAlign.Companion companion3 = TextAlign.Companion;
            int iM3516getStarte0LSkKk = companion3.m3516getStarte0LSkKk();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier.Companion companion4 = companion;
            getPostalCode getpostalcode2 = getpostalcode;
            TextKt.m131TextNvy7gAk(str, SizeKt.m86width3ABfNKs(companion, Dimensions.getTitle), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, TextAlign.m3504boximpl(iM3516getStarte0LSkKk), 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 130040);
            TextKt.m131TextNvy7gAk(startbackgroundtimeri.serializer, d$$ExternalSyntheticOutline0.m(1.0f, true, companion4), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion3.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 130040);
            Object[] objArr = {getpostalcode, SizeKt.m86width3ABfNKs(companion4, Dimensions.setTabContainer)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            TextKt.m131TextNvy7gAk(startbackgroundtimeri.IconCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion3.m3512getEnde0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 130042);
            getpostalcode.IconCompatParcelizer(true);
            int i23 = read + 41;
            write = i23 % Fields.SpotShadowColor;
            obj = companion4;
            if (i23 % 2 != 0) {
                int i24 = 3 % 2;
                obj = companion4;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            obj = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 24, startbackgroundtimeri, obj);
        }
    }
}
