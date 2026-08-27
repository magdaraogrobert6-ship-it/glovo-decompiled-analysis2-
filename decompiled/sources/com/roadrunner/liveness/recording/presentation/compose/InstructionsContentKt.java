package com.roadrunner.liveness.recording.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.StrokeJoinCompanion;
import o.accessgetXyzcp;
import o.buildMapping;
import o.dc;
import o.fromCongestionSeverityType;
import o.getBirthDateFull;
import o.getCmykxdoWZVw;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.populateViewStructure;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setClickable;
import o.setOnRefreshListener;
import o.setProgressBackgroundColor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InstructionsContentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 13;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-980375225);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i6 & 19) != 18) {
            int i7 = serializer + 115;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i6 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            companion.getClass();
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str, companion, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setHasNonEmbeddedTabs(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, i6 & 14, 0, 130040);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, 15);
        }
    }

    public static final void serializer(String str, long j, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 41;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-110453861);
        if ((i & 6) == 0) {
            int i7 = serializer + 53;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                getpostalcode2.read(str);
                throw null;
            }
            i2 = i | (getpostalcode2.read(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.serializer(j)) {
                int i8 = RemoteActionCompatParcelizer + 97;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
            int i10 = RemoteActionCompatParcelizer + 27;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 4 / 4;
            }
        }
        int i12 = i2 | 384;
        if ((i12 & 147) != 146) {
            int i13 = serializer + 83;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i12 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            companion.getClass();
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str, companion, j, 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, (i12 & 14) | ((i12 << 3) & 896), 0, 130040);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setClickable(str, j, modifier2, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00e9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final void InstructionsContent(boolean z, String str, String str2, setProgressBackgroundColor setprogressbackgroundcolor, boolean z2, setOnRefreshListener setonrefreshlistener, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z3;
        getPostalCode getpostalcode;
        long presenter;
        ?? r0;
        boolean z4;
        getPostalCode getpostalcode2;
        String str3;
        getPostalCode getpostalcode3;
        getPostalCode getpostalcode4;
        int i3;
        int i4;
        int i5 = 2 % 2;
        setprogressbackgroundcolor.getClass();
        getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull;
        getpostalcode5.MediaSessionCompatQueueItem(-329821134);
        Object obj = null;
        if ((i & 6) == 0) {
            int i6 = serializer + 5;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                i2 = (getpostalcode5.write(z) ? 4 : 2) | i;
            } else {
                getpostalcode5.write(z);
                obj.hashCode();
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = RemoteActionCompatParcelizer + 125;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 |= getpostalcode5.read(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode5.read(str2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode5.read(setprogressbackgroundcolor.ordinal())) {
                int i9 = RemoteActionCompatParcelizer + 121;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            int i11 = RemoteActionCompatParcelizer + 61;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode5.write(z2)) {
                int i13 = serializer + 49;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                i3 = i13 % 2 != 0 ? 11679 : Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode5.read(setonrefreshlistener) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode5.read(modifier) ? 1048576 : Fields.BlendMode;
        }
        if ((599187 & i2) != 599186) {
            int i14 = RemoteActionCompatParcelizer + 103;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (getpostalcode5.write(i2 & 1, z3)) {
            accessgetXyzcp accessgetxyzcpIconCompatParcelizer = RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(R.raw.show_face), getpostalcode5);
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen.face_detection_anim_size, getpostalcode5, 0);
            int i15 = fromCongestionSeverityType.serializer[setprogressbackgroundcolor.ordinal()];
            if (i15 == 1) {
                getpostalcode5.serializer(869487900);
                presenter = ((buildMapping) getpostalcode5.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                getpostalcode5.IconCompatParcelizer(false);
            } else if (i15 == 2) {
                getpostalcode5.serializer(869489085);
                presenter = ((buildMapping) getpostalcode5.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList();
                getpostalcode5.IconCompatParcelizer(false);
            } else if (i15 == 3) {
                getpostalcode5.serializer(869490368);
                presenter = ((buildMapping) getpostalcode5.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setCompoundDrawablesRelative();
                getpostalcode5.IconCompatParcelizer(false);
            } else {
                throw d$$ExternalSyntheticOutline0.m(getpostalcode5, 869486220, false);
            }
            long j = presenter;
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierWrite = PaddingKt.write(modifier, f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode5, 48);
            int iHashCode = Long.hashCode(getpostalcode5.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode5.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode5, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode5.read != null) {
                getpostalcode5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode5.ComponentActivity) {
                    getpostalcode5.serializer(constructor);
                } else {
                    getpostalcode5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode5, modalBottomSheetYbuCTN8Serializer, getpostalcode5, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode5, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode5, Integer.valueOf(iHashCode), getpostalcode5));
                if (str == null) {
                    getpostalcode5.serializer(1544584003);
                    r0 = 0;
                    getpostalcode5.IconCompatParcelizer(false);
                } else {
                    r0 = 0;
                    getpostalcode5.serializer(1544584004);
                    IconCompatParcelizer(0, getpostalcode5, null, str);
                    getpostalcode5.IconCompatParcelizer(false);
                }
                if (str2 == null) {
                    getpostalcode5.serializer(1544694549);
                    getpostalcode5.IconCompatParcelizer((boolean) r0);
                    z4 = true;
                } else {
                    getpostalcode5.serializer(1544694550);
                    z4 = true;
                    serializer(str2, j, null, getpostalcode5, 0);
                    getpostalcode5.IconCompatParcelizer((boolean) r0);
                }
                if (z) {
                    getpostalcode5.serializer(1544886192);
                    Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(PaddingKt.write(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13), Dimensions.setStackedBackground), fDimensionResource);
                    str3 = null;
                    getpostalcode4 = getpostalcode5;
                    ColorModel.read((StrokeJoinCompanion) accessgetxyzcpIconCompatParcelizer.getValue(), modifierM83size3ABfNKs, 1, false, null, null, getpostalcode4, 1572864, 0, 0, 4194236);
                    getpostalcode4.IconCompatParcelizer((boolean) r0);
                } else {
                    getpostalcode2 = getpostalcode5;
                    str3 = null;
                    getpostalcode2.serializer(1545182490);
                    getpostalcode2.IconCompatParcelizer((boolean) r0);
                }
                if (setonrefreshlistener == null) {
                    getpostalcode3 = getpostalcode2;
                    getpostalcode3.serializer(1545223130);
                    getpostalcode3.IconCompatParcelizer((boolean) r0);
                } else {
                    getpostalcode3 = getpostalcode2;
                    getpostalcode3.serializer(1545223131);
                    PageIndicatorKt.PageIndicator(setonrefreshlistener.serializer, setonrefreshlistener.RemoteActionCompatParcelizer, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13), getpostalcode3, r0);
                    getpostalcode3.IconCompatParcelizer((boolean) r0);
                }
                if (z2) {
                    getpostalcode3 = getpostalcode4;
                    getpostalcode3 = getpostalcode4;
                    int i16 = RemoteActionCompatParcelizer + 109;
                    serializer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    getpostalcode3.serializer(1545472464);
                    Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, f, 0.0f, 0.0f, 13);
                    modifierM74paddingqDBjuR0$default.getClass();
                    ErrorCardKt.ErrorCard(r0, getpostalcode3, modifierM74paddingqDBjuR0$default, str3, str3);
                    getpostalcode3.IconCompatParcelizer((boolean) r0);
                } else {
                    getpostalcode3 = getpostalcode4;
                    getpostalcode3 = getpostalcode4;
                    getpostalcode3.serializer(1545666586);
                    getpostalcode3.IconCompatParcelizer((boolean) r0);
                }
                getpostalcode3.IconCompatParcelizer(z4);
                getpostalcode = getpostalcode3;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getPostalCode getpostalcode6 = getpostalcode5;
            getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode = getpostalcode6;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new populateViewStructure(z, str, str2, setprogressbackgroundcolor, z2, setonrefreshlistener, modifier, i);
        }
    }
}
