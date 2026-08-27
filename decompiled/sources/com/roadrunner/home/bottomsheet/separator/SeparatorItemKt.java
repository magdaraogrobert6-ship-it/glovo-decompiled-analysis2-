package com.roadrunner.home.bottomsheet.separator;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.hms.location.ActivityIdentificationData;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.onViewStateRestored;
import o.performMeasureDjhGOtQ;
import o.performSaveInstanceState;
import o.performStart;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SeparatorItemKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    public static final void SeparatorItem(onViewStateRestored onviewstaterestored, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3 = 2 % 2;
        onviewstaterestored.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1349750659);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(onviewstaterestored) ? 4 : 2) | i;
        } else {
            int i4 = RemoteActionCompatParcelizer + 109;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i6 & 19) != 18) {
            int i7 = RemoteActionCompatParcelizer + 21;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            int i9 = serializer + 47;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            modifier2 = Modifier.Companion;
            performStart performstart = (performStart) onviewstaterestored;
            boolean zBooleanValue = ((Boolean) ExtrasKt.write(performstart.IconCompatParcelizer, getpostalcode, 0).getValue()).booleanValue();
            Modifier modifierWrite = SizeKt.write(modifier2, 1.0f);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i11 = RemoteActionCompatParcelizer + 39;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i12 = 93 / 0;
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            if (zBooleanValue) {
                getpostalcode.serializer(830331854);
                SeparatorContent(((Boolean) ExtrasKt.write(performstart.RemoteActionCompatParcelizer, getpostalcode, 0).getValue()).booleanValue(), null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(830476965);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
            int i13 = RemoteActionCompatParcelizer + 103;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new o.SizeKt(i, 9, onviewstaterestored, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[PHI: r3
  0x0042: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r3
  0x002d: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void SeparatorContent(boolean z, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z2;
        Modifier modifier2;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 21;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(227921930);
            if ((i & ActivityIdentificationData.RUNNING) == 0) {
                if (!getpostalcode.write(z)) {
                    i2 = 2;
                } else {
                    int i6 = RemoteActionCompatParcelizer + 89;
                    serializer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(227921930);
            if ((i & 6) == 0) {
                if (!getpostalcode.write(z)) {
                    i2 = 2;
                } else {
                    int i8 = RemoteActionCompatParcelizer + 89;
                    serializer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        int i10 = i3 | 48;
        if ((i10 & 19) != 18) {
            int i11 = serializer + 57;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i10 & 1, z2)) {
            modifier2 = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(modifier2, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                int i13 = serializer + 83;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.write(modifier2, 1.0f), Dimensions.read);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, BackgroundKt.m20backgroundbw27NRU(modifierM75height3ABfNKs, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme(), RectangleShapeKt.getRectangleShape())});
                if (z) {
                    getpostalcode.serializer(1145455833);
                    BoxKt.Box(BackgroundKt.background$default(SizeKt.m75height3ABfNKs(SizeKt.write(modifier2, 1.0f), Dimensions.getActionBarHideOffset), Brush.Companion.m677verticalGradient8A3gB4$default(Brush.Companion, SQLite.read(Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme()), Color.m712boximpl(Color.Companion.m757getTransparent0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.7f, 2), getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(1145998798);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new performSaveInstanceState(z, modifier2, i, 0);
        }
    }
}
