package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.ButtonTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$Companion;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ComposeAnimationState;
import o.DensityDefaultImpls;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.accessgetInfinitycp;
import o.buildMapping;
import o.compareTo0680j_4;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getDensityannotations;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getStore;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.sourceInformationContextOf;
import o.widthMask;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MultipleCodeScanKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static final void IconCompatParcelizer(accessgetInfinitycp accessgetinfinitycp, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        accessgetinfinitycp.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1248637888);
        if ((i & 6) == 0) {
            if (getpostalcode.read(accessgetinfinitycp)) {
                int i5 = IconCompatParcelizer + 117;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i6 = i2 | 384;
        if ((i6 & 147) != 146) {
            int i7 = RemoteActionCompatParcelizer + 93;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            int i9 = RemoteActionCompatParcelizer + 39;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            modifier2 = Modifier.Companion;
            getDensityannotations getdensityannotations = (getDensityannotations) ExtrasKt.write(accessgetinfinitycp.MediaSessionCompatQueueItem, getpostalcode, 0).getValue();
            if (!(getdensityannotations instanceof DensityDefaultImpls)) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getdensityannotations, widthMask.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1645127872, false);
                }
                getpostalcode.serializer(540939324);
                getpostalcode.IconCompatParcelizer(false);
                getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new compareTo0680j_4(accessgetinfinitycp, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 0);
                    return;
                }
                return;
            }
            getpostalcode.serializer(-1645124902);
            sourceInformationContextOf sourceinformationcontextof = ((DensityDefaultImpls) getdensityannotations).IconCompatParcelizer;
            MultipleCodeScanTaskUiItem$Companion multipleCodeScanTaskUiItem$Companion = sourceInformationContextOf.Companion;
            MultipleCodeScanContent(sourceinformationcontextof, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, getpostalcode, (i6 & 112) | 8 | (i6 & 896));
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i11 = IconCompatParcelizer + 23;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat2 = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat2 != null) {
            gethandleruiannotationsMediaDescriptionCompat2.serializer = new compareTo0680j_4(accessgetinfinitycp, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[PHI: r2
  0x0050: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r2
  0x002f: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void MultipleCodeScanContent(sourceInformationContextOf sourceinformationcontextof, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = RemoteActionCompatParcelizer + 23;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1897242201);
            if ((i & 88) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(sourceinformationcontextof);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(sourceinformationcontextof);
                }
                if (!zIconCompatParcelizer) {
                    i3 = 2;
                } else {
                    i2 = IconCompatParcelizer + 99;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        i3 = 5;
                    } else {
                        i3 = 4;
                    }
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1897242201);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(sourceinformationcontextof);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(sourceinformationcontextof);
                }
                if (!zIconCompatParcelizer) {
                    i3 = 2;
                } else {
                    i2 = IconCompatParcelizer + 99;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        i3 = 5;
                    } else {
                        i3 = 4;
                    }
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = RemoteActionCompatParcelizer + 83;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i & 384) == 0) {
            int i10 = IconCompatParcelizer + 31;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i4 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i4 & 1, (i4 & 147) != 146)) {
            int i12 = IconCompatParcelizer + 75;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            modifier.getClass();
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i14 = RemoteActionCompatParcelizer + 39;
                    IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    getpostalcode.serializer(constructor);
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                String str = sourceinformationcontextof.title;
                TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                boolean z = false;
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 0, 0, 131066);
                Modifier.Companion companion2 = Modifier.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.getActionBarHideOffset)});
                String str2 = sourceinformationcontextof.description;
                if (str2 == null) {
                    getpostalcode.serializer(412995311);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(412995312);
                    TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (!sourceinformationcontextof.isSuccess) {
                    getpostalcode.serializer(413199664);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setMenu)});
                    ComposeAnimationState composeAnimationState = sourceinformationcontextof.scanCodesButton;
                    ButtonTypeTokenMapperKt.IconCompatParcelizer(composeAnimationState.type, composeAnimationState.actionTitle, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion2, 1.0f), false, false, composeAnimationState.actionIcon, getpostalcode, ((i4 << 3) & 896) | 3072, 176);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(413694579);
                    getpostalcode.IconCompatParcelizer(false);
                }
                int i16 = RemoteActionCompatParcelizer + 81;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    z = true;
                }
                getpostalcode.IconCompatParcelizer(z);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 23, sourceinformationcontextof, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }
}
