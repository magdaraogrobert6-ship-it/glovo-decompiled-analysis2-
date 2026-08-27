package com.roadrunner.liveness.instruction.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.copyejIjP34;
import o.dc;
import o.expand;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.lambda321;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.processViewInfoslambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InstructionComponentKt {
    private static int serializer = 0;
    private static int write = 1;

    public static final void RequirementComponent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1293548281);
        Object obj = null;
        if ((i & 6) == 0) {
            int i6 = serializer + 111;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode2.read(str);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode2.read(str)) {
                int i7 = write + 9;
                serializer = i7 % Fields.SpotShadowColor;
                i4 = i7 % 2 != 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i8 = write + 9;
                serializer = i8 % Fields.SpotShadowColor;
                i3 = i8 % 2 != 0 ? 41 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if (!getpostalcode2.write(i9 & 1, (i9 & 19) != 18)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode = getpostalcode2;
        } else {
            Modifier modifierWrite = PaddingKt.write(modifier, Dimensions.setSplitBackground);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i10 = serializer + 109;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i12 = write + 13;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, i9 & 14, 0, 130042);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:6:0x001c A[PHI: r1
  0x001c: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:9:0x002b, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f A[PHI: r1
  0x001f: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:9:0x002b, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void InstructionHeading(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2) {
        getPostalCode getpostalcode;
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = write + 35;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-2118006674);
            if ((i & 94) == 0) {
                if (getpostalcode.read(str)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
                i2 = i | i4;
            } else {
                i2 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-2118006674);
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
                i2 = i | i4;
            } else {
                i2 = i;
            }
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.read(str2)) {
                i3 = 16;
            } else {
                int i7 = serializer + 29;
                write = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 == 0 ? 125 : 32;
            }
            i2 |= i3;
        }
        int i8 = i2 | 384;
        if (getpostalcode.write(i8 & 1, (i8 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i9 = serializer + 49;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i11 = write + 41;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i13 = write + 95;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getNonZeroRgk1Os.write(Integer.valueOf(R.drawable.img_small_brand_selfie), "", null, Okio.RemoteActionCompatParcelizer(R.drawable.img_small_brand_selfie, getpostalcode, 0), null, null, null, null, ContentScale.Companion.getNone(), null, getpostalcode, (Painter.$stable << 9) | 48, 6, 31732);
            Modifier modifierM = af$$ExternalSyntheticOutline1.m(companion, Dimensions.setStackedBackground, getpostalcode, companion, 1.0f);
            TextAlign.Companion companion3 = TextAlign.Companion;
            int iM3511getCentere0LSkKk = companion3.m3511getCentere0LSkKk();
            TextStyle textStyleMediaMetadataCompat = performLayout.MediaMetadataCompat();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, modifierM, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(iM3511getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyleMediaMetadataCompat, getpostalcode, (i8 & 14) | 48, 0, 130040);
            TextKt.m131TextNvy7gAk(str2, SizeKt.write(companion, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion3.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, ((i8 >> 3) & 14) | 48, 0, 130040);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new lambda321(str, str2, modifier2, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    public static final void Instructions(String str, String str2, String str3, String str4, String str5, String str6, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-891468161);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i7 = write + 87;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                if (getpostalcode2.read(str)) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
            } else {
                int i8 = 49 / 0;
                if (!getpostalcode2.read(str)) {
                    i5 = 2;
                } else {
                    i5 = 4;
                }
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i9 = write + 71;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                i2 |= getpostalcode2.read(str4) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                getpostalcode2.read(str4);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.read(str5)) {
                int i10 = write + 121;
                serializer = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 != 0 ? 17451 : Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode2.read(str6)) {
                i3 = Fields.RenderEffect;
            } else {
                int i11 = write + 123;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((1572864 & i) == 0) {
            int i13 = serializer + 43;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i2 |= getpostalcode2.read(modifier) ? 1048576 : Fields.BlendMode;
        }
        int i15 = i2;
        if ((i15 & 599187) != 599186) {
            int i16 = serializer + 69;
            write = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i15 & 1, z)) {
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getCenterHorizontally(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                TextAlign.Companion companion3 = TextAlign.Companion;
                int iM3511getCentere0LSkKk = companion3.m3511getCentere0LSkKk();
                TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportBackgroundTintList(), 0L, null, null, 0L, TextAlign.m3504boximpl(iM3511getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, i15 & 14, 0, 130042);
                Modifier.Companion companion4 = Modifier.Companion;
                float f = Dimensions.setSplitBackground;
                TextKt.m131TextNvy7gAk(str2, PaddingKt.m74paddingqDBjuR0$default(companion4, 0.0f, f, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion3.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, (i15 >> 3) & 14, 0, 130040);
                DividerKt.read(0.0f, 0, 6, 0L, getpostalcode2, PaddingKt.m74paddingqDBjuR0$default(companion4, 0.0f, Dimensions.setTransitioning, 0.0f, 0.0f, 13));
                TextKt.m131TextNvy7gAk(str3, PaddingKt.m74paddingqDBjuR0$default(companion4, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getWindowSystemUiVisibility(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion3.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, (i15 >> 6) & 14, 0, 130040);
                Modifier modifierHeight = IntrinsicKt.height(PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion4, 1.0f), 0.0f, f, 0.0f, 0.0f, 13), expand.Max);
                getpostalcode = getpostalcode2;
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getTop(), getpostalcode, 0);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierHeight);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i18 = write + 41;
                    serializer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                RequirementComponent((i15 >> 12) & 14, getpostalcode, copyejIjP34.write(companion4, 1.0f), str5);
                DividerKt.serializer(0.0f, 6, 0L, getpostalcode, SizeKt.serializer(companion4, 1.0f));
                RequirementComponent((i15 >> 15) & 14, getpostalcode, copyejIjP34.write(companion4, 1.0f), str6);
                DividerKt.serializer(0.0f, 6, 0L, getpostalcode, SizeKt.serializer(companion4, 1.0f));
                RequirementComponent((i15 >> 9) & 14, getpostalcode, copyejIjP34.write(companion4, 1.0f), str4);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new processViewInfoslambda1(str, str2, str3, str4, str5, str6, modifier, i, 1);
        }
    }
}
