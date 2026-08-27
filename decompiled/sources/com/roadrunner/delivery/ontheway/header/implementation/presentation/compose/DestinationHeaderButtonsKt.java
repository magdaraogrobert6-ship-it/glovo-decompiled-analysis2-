package com.roadrunner.delivery.ontheway.header.implementation.presentation.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.InspectableKt$$ExternalSyntheticLambda0;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getKindSetui;
import o.getPostalCode;
import o.getSpanVerticalAligndo9XGgannotations;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toAndroidDragEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DestinationHeaderButtonsKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e A[PHI: r6
  0x003e: PHI (r6v5 o.getPostalCode) = (r6v1 o.getPostalCode), (r6v6 o.getPostalCode) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r6
  0x002a: PHI (r6v2 o.getPostalCode) = (r6v1 o.getPostalCode), (r6v6 o.getPostalCode) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void write(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 97;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1748325181);
            if ((i & 109) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                    i2 = 4;
                } else {
                    int i6 = IconCompatParcelizer + 107;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1748325181);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                    i2 = 4;
                } else {
                    int i8 = IconCompatParcelizer + 107;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i3 & 3) != 2) {
            int i10 = RemoteActionCompatParcelizer + 41;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            companion.getClass();
            HeaderButtonContainer(companion, ExtrasKt.write(2089413139, new toAndroidDragEvent(1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0), getpostalcode), getpostalcode, 54);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new InspectableKt$$ExternalSyntheticLambda0(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i, 1);
        }
    }

    public static final void RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getspanverticalaligndo9xggannotations.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-732572912);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 59;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (!getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = IconCompatParcelizer + 75;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if ((i & 64) == 0 ? getpostalcode.read(getspanverticalaligndo9xggannotations) : getpostalcode.IconCompatParcelizer(getspanverticalaligndo9xggannotations)) {
                int i9 = RemoteActionCompatParcelizer + 23;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 2;
                }
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            companion.getClass();
            HeaderButtonContainer(companion, ExtrasKt.write(635440230, new GapComposerKt$$ExternalSyntheticLambda0(getspanverticalaligndo9xggannotations, 24, r8lambdaunavo3sxub_pc9xroryotnrlvsm), getpostalcode), getpostalcode, 54);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 5, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getspanverticalaligndo9xggannotations);
        }
    }

    public static final void HeaderButtonContainer(Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(917950491);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i4 = IconCompatParcelizer + 63;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            float f = Dimensions.getSubtitle;
            Modifier modifierWrite = SizeKt.write(modifier, f, f);
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
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode.ComponentActivity)) {
                getpostalcode.serializer(constructor);
                int i5 = IconCompatParcelizer + 5;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i2 >> 3) & 14));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKindSetui(modifier, dragAndDropTargetModifierNode, i, 6);
        }
    }
}
