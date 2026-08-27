package com.roadrunner.biometrics.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import o.AndroidAutofillManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RectList;
import o.SemanticsSortKtUnmergedConfigComparator1;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.isValidParameter;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BiometricContentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[PHI: r2
  0x0058: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x003e, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0040 A[PHI: r2
  0x0040: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x003e, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void BiometricContent(SemanticsSortKtUnmergedConfigComparator1 semanticsSortKtUnmergedConfigComparator1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6 = 2 % 2;
        int i7 = RemoteActionCompatParcelizer + 73;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            semanticsSortKtUnmergedConfigComparator1.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1586823017);
            if ((i & 70) == 0) {
                if (getpostalcode.read(semanticsSortKtUnmergedConfigComparator1)) {
                    i4 = RemoteActionCompatParcelizer + 55;
                    serializer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            semanticsSortKtUnmergedConfigComparator1.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1586823017);
            if ((i & 6) == 0) {
                if (getpostalcode.read(semanticsSortKtUnmergedConfigComparator1)) {
                    i4 = RemoteActionCompatParcelizer + 55;
                    serializer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = RemoteActionCompatParcelizer + 51;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i3 & 1171) != 1170) {
            int i10 = RemoteActionCompatParcelizer + 123;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            int i12 = serializer + 83;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Modifier modifierWrite = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(modifier.then(SizeKt.read), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            Object obj = null;
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = serializer + 75;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode.ComponentActivity;
                obj.hashCode();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i15 = RemoteActionCompatParcelizer + 83;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            BiometricInformation(semanticsSortKtUnmergedConfigComparator1.RemoteActionCompatParcelizer, semanticsSortKtUnmergedConfigComparator1.serializer, semanticsSortKtUnmergedConfigComparator1.write, d$$ExternalSyntheticOutline0.m(1.0f, true, Modifier.Companion), getpostalcode, 0);
            BiometricAction(((i3 >> 3) & 112) | ((i3 << 6) & 7168), getpostalcode, null, semanticsSortKtUnmergedConfigComparator1.IconCompatParcelizer, semanticsSortKtUnmergedConfigComparator1.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) semanticsSortKtUnmergedConfigComparator1, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    public static final void BiometricAction(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(267262162);
        if ((i & 6) == 0) {
            int i7 = serializer + 71;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.read(str)) {
                int i9 = serializer + 45;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    i5 = 2;
                } else {
                    i5 = 4;
                }
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = RemoteActionCompatParcelizer + 65;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i12 = serializer + 81;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                if (getpostalcode.read(str2)) {
                    int i13 = RemoteActionCompatParcelizer + 97;
                    serializer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    i4 = Fields.RotationX;
                } else {
                    i4 = Fields.SpotShadowColor;
                }
                i2 |= i4;
            } else {
                getpostalcode.read(str2);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1))) {
                int i15 = RemoteActionCompatParcelizer + 49;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i17 = i2 | 24576;
        if ((i17 & 9363) != 9362) {
            int i18 = RemoteActionCompatParcelizer + 87;
            serializer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i17 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                int i20 = RemoteActionCompatParcelizer + 51;
                serializer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion, 1.0f), false, false, null, null, null, null, null, getpostalcode, (i17 & 14) | 384 | (i17 & 112), 0, 2040);
                isValidParameter.RemoteActionCompatParcelizer(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13), false, false, null, null, null, null, getpostalcode, (i17 >> 6) & 126, 1016);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion;
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new RectList(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045 A[PHI: r4
  0x0045: PHI (r4v60 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v62 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r4
  0x0030: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v62 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void BiometricInformation(int i, String str, String str2, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode;
        int i3;
        int i4;
        getPostalCode getpostalcode2;
        boolean z;
        getPostalCode getpostalcode3;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = serializer + 9;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-2055986793);
            if ((i2 & 98) == 0) {
                if (getpostalcode.read(i)) {
                    int i9 = RemoteActionCompatParcelizer + 101;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i4 = i2;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-2055986793);
            if ((i2 & 6) == 0) {
                if (getpostalcode.read(i)) {
                    int i11 = RemoteActionCompatParcelizer + 101;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i4 = i2;
            }
        }
        if ((i2 & 48) == 0) {
            int i13 = RemoteActionCompatParcelizer + 49;
            serializer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                i4 |= getpostalcode2.read(str) ? 32 : 16;
            } else {
                getpostalcode2.read(str);
                throw null;
            }
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode2.read(str2)) {
                int i14 = RemoteActionCompatParcelizer + 53;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i6 = Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i4 |= i6;
            int i16 = serializer + 1;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i18 = serializer + 63;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                i5 = i18 % 2 == 0 ? 8448 : Fields.CameraDistance;
            } else {
                i5 = Fields.RotationZ;
            }
            i4 |= i5;
        }
        int i19 = i4;
        if ((i19 & 1171) != 1170) {
            int i20 = RemoteActionCompatParcelizer + 19;
            serializer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i19 & 1, z)) {
            int i22 = RemoteActionCompatParcelizer + 89;
            serializer = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterHorizontally(), getpostalcode2, 54);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode2.ComponentActivity)) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                int i24 = i19 & 14;
                getNonZeroRgk1Os.write(Integer.valueOf(i), null, null, Okio.RemoteActionCompatParcelizer(i, getpostalcode2, i24), null, null, null, null, ContentScale.Companion.getNone(), null, getpostalcode2, i24 | 48 | (Painter.$stable << 9), 6, 31732);
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion2, 1.0f), 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13);
                TextAlign.Companion companion3 = TextAlign.Companion;
                int iM3511getCentere0LSkKk = companion3.m3511getCentere0LSkKk();
                TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                getPostalCode getpostalcode4 = getpostalcode2;
                TextKt.m131TextNvy7gAk(str, modifierM74paddingqDBjuR0$default, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(iM3511getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode4, (i19 >> 3) & 14, 0, 130040);
                getpostalcode3 = getpostalcode4;
                TextKt.m131TextNvy7gAk(str2, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion2, 1.0f), 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion3.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode3, (i19 >> 6) & 14, 0, 130040);
                getpostalcode3.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager(i, str, str2, modifier, i2, 6);
        }
    }
}
