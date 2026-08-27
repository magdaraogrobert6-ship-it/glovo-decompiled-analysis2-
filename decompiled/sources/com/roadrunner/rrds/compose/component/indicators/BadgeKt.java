package com.roadrunner.rrds.compose.component.indicators;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidAutofillManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.IconButtonKt;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getInternalPaintui_graphics;
import o.getNewPassword;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa2Dl51lAH9MKTP_RaVwuQrXOFEM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BadgeKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void RemoteActionCompatParcelizer(IconButtonKt iconButtonKt, String str, Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier3;
        float f;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = IconCompatParcelizer + 55;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        iconButtonKt.getClass();
        str.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1740506290);
        if ((i & 6) == 0) {
            int i10 = RemoteActionCompatParcelizer + 123;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i3 = (getpostalcode.read(iconButtonKt) ? 4 : 2) | i;
        } else {
            int i12 = RemoteActionCompatParcelizer + 111;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str)) {
                int i14 = RemoteActionCompatParcelizer + 109;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        int i16 = i2 & 2;
        if (i16 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                if (getpostalcode.read(modifier2)) {
                    int i17 = RemoteActionCompatParcelizer + 69;
                    IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    i4 = Fields.RotationX;
                } else {
                    i4 = Fields.SpotShadowColor;
                }
                i3 |= i4;
            }
            z = false;
            if ((i3 & 147) != 146) {
                i5 = IconCompatParcelizer + 67;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    z = true;
                }
            }
            if (getpostalcode.write(i3 & 1, z)) {
                if (i16 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (str.length() > 0) {
                    f = Dimensions.setLogo;
                } else {
                    f = Dimensions.setActionBarVisibilityCallback;
                }
                SurfaceKt.m126SurfaceT9BRK9s(SizeKt.m83size3ABfNKs(iconButtonKt.align(modifier3, Alignment.Companion.getTopEnd()), f), RoundedCornerShapeKt.IconCompatParcelizer, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).RatingCompat(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(-738710637, new r8lambdaa2Dl51lAH9MKTP_RaVwuQrXOFEM(str, 5), getpostalcode), getpostalcode, 12582912, 120);
                modifier2 = modifier3;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager((Object) iconButtonKt, (Object) str, modifier2, i, i2, 12);
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        z = false;
        if ((i3 & 147) != 146) {
            i5 = IconCompatParcelizer + 67;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                z = true;
            }
        }
        if (getpostalcode.write(i3 & 1, z)) {
            if (i16 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (str.length() > 0) {
                f = Dimensions.setLogo;
            } else {
                f = Dimensions.setActionBarVisibilityCallback;
            }
            SurfaceKt.m126SurfaceT9BRK9s(SizeKt.m83size3ABfNKs(iconButtonKt.align(modifier3, Alignment.Companion.getTopEnd()), f), RoundedCornerShapeKt.IconCompatParcelizer, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).RatingCompat(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(-738710637, new r8lambdaa2Dl51lAH9MKTP_RaVwuQrXOFEM(str, 5), getpostalcode), getpostalcode, 12582912, 120);
            modifier2 = modifier3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager((Object) iconButtonKt, (Object) str, modifier2, i, i2, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void BadgedBox(int i, getBirthDateFull getbirthdatefull, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, Modifier modifier) {
        int i2;
        boolean z;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        MeasurePolicy measurePolicy;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(105085883);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(modifier)) {
                int i5 = RemoteActionCompatParcelizer + 121;
                int i6 = i5 % Fields.SpotShadowColor;
                IconCompatParcelizer = i6;
                i3 = i5 % 2 != 0 ? 98 : 32;
                int i7 = i6 + 13;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i9 = RemoteActionCompatParcelizer + 19;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                z = true;
            }
            if (getpostalcode.write(i2 & 1, z)) {
                measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Object obj = BoxScopeInstance.serializer;
                dragAndDropTargetModifierNode2.invoke(obj, getpostalcode, Integer.valueOf(((i2 >> 3) & 112) | 6));
                dragAndDropTargetModifierNode.invoke(obj, getpostalcode, Integer.valueOf(((i2 << 3) & 112) | 6));
                getpostalcode.IconCompatParcelizer(true);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new getInternalPaintui_graphics(i, 11, dragAndDropTargetModifierNode, modifier, dragAndDropTargetModifierNode2);
            }
        }
        int i10 = RemoteActionCompatParcelizer + 99;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        z = false;
        if (getpostalcode.write(i2 & 1, z)) {
            measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            companion = ComposeUiNode.Companion;
            constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Object obj2 = BoxScopeInstance.serializer;
            dragAndDropTargetModifierNode2.invoke(obj2, getpostalcode, Integer.valueOf(((i2 >> 3) & 112) | 6));
            dragAndDropTargetModifierNode.invoke(obj2, getpostalcode, Integer.valueOf(((i2 << 3) & 112) | 6));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getInternalPaintui_graphics(i, 11, dragAndDropTargetModifierNode, modifier, dragAndDropTargetModifierNode2);
        }
    }
}
