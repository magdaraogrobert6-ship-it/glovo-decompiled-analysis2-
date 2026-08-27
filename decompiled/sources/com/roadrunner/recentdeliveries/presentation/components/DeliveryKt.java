package com.roadrunner.recentdeliveries.presentation.components;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda2;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.UiMediaScopeImpl;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.setPushTokenI;
import o.startBackgroundTimerI;
import o.teardownAllGlobalParametersS;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeliveryKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        removeNodeAtDepth.RemoteActionCompatParcelizer(SQLite.read(new startBackgroundTimerI("Pizza", "$5.99", "2"), new startBackgroundTimerI("Sandwich", "$5.99", "2"), new startBackgroundTimerI("Supreme Cheeseburger Vegan", "$5.99", "2"))).getClass();
        int i = serializer + 61;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a5  */
    public static final void Delivery(teardownAllGlobalParametersS teardownallglobalparameterss, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Object obj;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        teardownallglobalparameterss.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1033604794);
        if ((i & 6) == 0) {
            if (getpostalcode2.IconCompatParcelizer(teardownallglobalparameterss)) {
                int i7 = write + 5;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
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
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = write + 55;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 86 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                    i4 = Fields.RotationX;
                } else {
                    i4 = Fields.SpotShadowColor;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            int i11 = RemoteActionCompatParcelizer + 47;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3);
                throw null;
            }
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3)) {
                int i12 = RemoteActionCompatParcelizer + 33;
                write = i12 % Fields.SpotShadowColor;
                i3 = i12 % 2 == 0 ? 31815 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            int i13 = write + 25;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2) ? Fields.RenderEffect : 65536;
        }
        int i15 = i2 | 1572864;
        if (!getpostalcode2.write(i15 & 1, (599187 & i15) != 599186)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            obj = modifier;
            getpostalcode = getpostalcode2;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifierWrite, f, 0.0f, 2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(companion, f)});
            String str = teardownallglobalparameterss.PlaybackStateCompatCustomAction;
            String str2 = teardownallglobalparameterss.RatingCompat;
            String str3 = teardownallglobalparameterss.MediaDescriptionCompat;
            boolean z = teardownallglobalparameterss.IconCompatParcelizer;
            boolean z2 = (i15 & 896) == 256;
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(teardownallglobalparameterss);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (!z2 && !zIconCompatParcelizer) {
                int i16 = write + 57;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    int i17 = 20 / 0;
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new setPushTokenI(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, teardownallglobalparameterss, 0);
                        getpostalcode2.write(objComponentActivity);
                    }
                } else if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new setPushTokenI(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, teardownallglobalparameterss, 0);
                    getpostalcode2.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new setPushTokenI(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, teardownallglobalparameterss, 0);
                getpostalcode2.write(objComponentActivity);
            }
            CollapsedDeliveryKt.CollapsedDelivery(str, str2, str3, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, getpostalcode2, (i15 << 9) & 57344);
            getpostalcode = getpostalcode2;
            AnimatedVisibilityKt.serializer(teardownallglobalparameterss.IconCompatParcelizer, null, null, null, null, ExtrasKt.write(-317929416, new PreviewActivity$$ExternalSyntheticLambda2(teardownallglobalparameterss, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, 5), getpostalcode2), getpostalcode, 1572870, 30);
            IconCompatParcelizer.IconCompatParcelizer(companion, f, getpostalcode, true);
            obj = companion;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(teardownallglobalparameterss, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, obj, i, 16);
        }
    }
}
