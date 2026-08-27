package com.roadrunner.rrds.compose.component.forms;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.buildMapping;
import o.createDefaultConnectionOptions;
import o.getBirthDateFull;
import o.getBottomEnd;
import o.getCenterHorizontally;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPointerInputFilterannotations;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.onViewAttachedToWindow;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OutlinedTextFieldV2Kt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:110:0x0198  */
    /* JADX WARN: Code duplicated, block: B:111:0x019b  */
    public static final void OutlinedTextFieldV2(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, boolean z2, VisualTransformation visualTransformation, boolean z3, getCenterHorizontally getcenterhorizontally, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, String str2, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        int i4;
        getPostalCode getpostalcode;
        long jM757getTransparent0d7_KjU;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        boolean z4;
        Throwable th;
        onViewAttachedToWindow onviewattachedtowindowSerializer;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        getBottomEnd getbottomend = getBottomEnd.read;
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(184066023);
        if ((i & 6) == 0) {
            int i11 = RemoteActionCompatParcelizer + 71;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i3 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i13 = i & 3072;
        int i14 = Fields.CameraDistance;
        if (i13 == 0) {
            if (getpostalcode2.write(z)) {
                int i15 = RemoteActionCompatParcelizer + 89;
                serializer = i15 % Fields.SpotShadowColor;
                i9 = i15 % 2 != 0 ? 18650 : 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.write(false)) {
                int i16 = RemoteActionCompatParcelizer + 25;
                serializer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i8 = Fields.Clip;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i18 = i3 | 196608;
        int i19 = i & 1572864;
        int i20 = Fields.BlendMode;
        if (i19 == 0) {
            i18 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            int i21 = serializer + 23;
            RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
            i18 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            int i23 = RemoteActionCompatParcelizer + 119;
            serializer = i23 % Fields.SpotShadowColor;
            int i24 = i23 % 2;
            i18 |= getpostalcode2.IconCompatParcelizer((Object) null) ^ true ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            if (getpostalcode2.write(z2)) {
                int i25 = serializer + 13;
                RemoteActionCompatParcelizer = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i18 |= i7;
        }
        int i27 = i18;
        if ((i2 & 6) == 0) {
            i4 = (getpostalcode2.read(visualTransformation) ? 4 : 2) | i2;
        } else {
            int i28 = RemoteActionCompatParcelizer + 91;
            serializer = i28 % Fields.SpotShadowColor;
            int i29 = i28 % 2;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.write(z3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= getpostalcode2.read(Integer.MAX_VALUE) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            if (!getpostalcode2.read(getcenterhorizontally)) {
                i14 = 1024;
            }
            i4 |= i14;
        }
        if ((i2 & 24576) == 0) {
            int i30 = RemoteActionCompatParcelizer + 111;
            serializer = i30 % Fields.SpotShadowColor;
            if (i30 % 2 != 0) {
                int i31 = 24 / 0;
                if (getpostalcode2.read(getbottomend)) {
                    i6 = Fields.Clip;
                } else {
                    i6 = 8192;
                }
            } else if (getpostalcode2.read(getbottomend)) {
                i6 = Fields.Clip;
            } else {
                i6 = 8192;
            }
            i4 |= i6;
        }
        if ((196608 & i2) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde2)) {
                int i32 = RemoteActionCompatParcelizer + 85;
                serializer = i32 % Fields.SpotShadowColor;
                int i33 = i32 % 2;
                i5 = Fields.RenderEffect;
            } else {
                i5 = 65536;
            }
            i4 |= i5;
        }
        if ((1572864 & i2) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde3)) {
                i20 = 1048576;
            }
            i4 |= i20;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= getpostalcode2.read(str2) ? 8388608 : 4194304;
        }
        int i34 = i4;
        if (getpostalcode2.write(i27 & 1, ((i27 & 306783379) == 306783378 && (i34 & 4793491) == 4793490) ? false : true)) {
            TextStyle textStyleRatingCompat = performLayout.RatingCompat();
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions._init_lambda1);
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.IconCompatParcelizer;
            long j = BuildersKt.read(getpostalcode2);
            long j2 = BuildersKt.read(getpostalcode2);
            long jIconCompatParcelizer = BuildersKt.IconCompatParcelizer(getpostalcode2);
            long j3 = BuildersKt.read(getpostalcode2);
            Color.Companion companion = Color.Companion;
            long jM757getTransparent0d7_KjU2 = companion.m757getTransparent0d7_KjU();
            long jM757getTransparent0d7_KjU3 = companion.m757getTransparent0d7_KjU();
            long jIconCompatParcelizer2 = BuildersKt.IconCompatParcelizer(getpostalcode2);
            long jM757getTransparent0d7_KjU4 = companion.m757getTransparent0d7_KjU();
            long jM757getTransparent0d7_KjU5 = companion.m757getTransparent0d7_KjU();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextFieldColors textFieldColorsRemoteActionCompatParcelizer = OutlinedTextFieldDefaults.RemoteActionCompatParcelizer(j, j2, jIconCompatParcelizer, j3, jIconCompatParcelizer2, jM757getTransparent0d7_KjU2, jM757getTransparent0d7_KjU3, jM757getTransparent0d7_KjU5, jM757getTransparent0d7_KjU4, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportProgressBarIndeterminateVisibility(), companion.m757getTransparent0d7_KjU(), companion.m757getTransparent0d7_KjU(), companion.m757getTransparent0d7_KjU(), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setTheme(), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setTheme(), getpostalcode2, 843023604);
            if (z) {
                getpostalcode2.serializer(793854194);
                getpostalcode2.IconCompatParcelizer(false);
                jM757getTransparent0d7_KjU = companion.m757getTransparent0d7_KjU();
            } else {
                getpostalcode2.serializer(793855002);
                long jOnBackPressedDispatcher_delegatelambda0 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).onBackPressedDispatcher_delegatelambda0();
                getpostalcode2.IconCompatParcelizer(false);
                jM757getTransparent0d7_KjU = jOnBackPressedDispatcher_delegatelambda0;
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) objComponentActivity;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier, jM757getTransparent0d7_KjU, gettopleftannotationsIconCompatParcelizer);
            float f = Dimensions.MediaSessionCompatResultReceiverWrapper;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = getPointerInputFilterannotations.RemoteActionCompatParcelizer(mutableInteractionSourceImpl2, getpostalcode2, 6);
            long jStartActivityForResult = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).startActivityForResult();
            long jReportFullyDrawn = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).reportFullyDrawn();
            long contentView = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setContentView();
            long jM757getTransparent0d7_KjU6 = companion.m757getTransparent0d7_KjU();
            if (z) {
                if (z2) {
                    jM757getTransparent0d7_KjU6 = contentView;
                } else {
                    jM757getTransparent0d7_KjU6 = ((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue() ? jStartActivityForResult : jReportFullyDrawn;
                }
            }
            if (z) {
                getpostalcode2.serializer(806364774);
                th = null;
                mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                z4 = false;
                onviewattachedtowindowSerializer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(jM757getTransparent0d7_KjU6, (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{150, 0, null, 6}), "", null, getpostalcode2, 432, 8);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                z4 = false;
                th = null;
                getpostalcode2.serializer(806487565);
                onviewattachedtowindowSerializer = CompositionKt.serializer(Color.m712boximpl(jM757getTransparent0d7_KjU6), getpostalcode2);
                getpostalcode2.IconCompatParcelizer(false);
            }
            Modifier modifierWrite = BorderKt.write(modifierM20backgroundbw27NRU, f, ((Color) onviewattachedtowindowSerializer.getValue()).m732unboximpl(), gettopleftannotationsIconCompatParcelizer);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), z4);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw th;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Modifier modifierWrite2 = SizeKt.write(Modifier.Companion, 1.0f);
            modifierWrite2.getClass();
            int i35 = i27 << 3;
            int i36 = i34 << 6;
            int i37 = i34 << 18;
            getpostalcode = getpostalcode2;
            OutlinedTextFieldKt.OutlinedTextField(str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifierWrite2, z, textStyleRatingCompat, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, z2, visualTransformation, getcenterhorizontally, getbottomend, z3, Integer.MAX_VALUE, 0, mutableInteractionSourceImpl, gettopleftannotationsIconCompatParcelizer, textFieldColorsRemoteActionCompatParcelizer, getpostalcode, (i27 & 64638) | (3670016 & i35) | (29360128 & i35) | (234881024 & i35) | (i35 & 1879048192), ((i34 >> 15) & 126) | ((i27 >> 18) & 7168) | ((i34 << 12) & 57344) | (458752 & i36) | (i36 & 3670016) | (29360128 & i37) | (234881024 & i37), 6, 528384);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new createDefaultConnectionOptions(str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, z2, visualTransformation, z3, getcenterhorizontally, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, str2, i, i2);
            int i38 = RemoteActionCompatParcelizer + 31;
            serializer = i38 % Fields.SpotShadowColor;
            int i39 = i38 % 2;
        }
    }
}
