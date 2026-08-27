package com.roadrunner.sidemenu.frequentlyuseditems;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.copyejIjP34;
import o.expand;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.p7;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FrequentlyUsedItemsKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void FrequentlyUsedItems(r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius, r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2, r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3, r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1747461865);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius) : getpostalcode.IconCompatParcelizer(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius)) {
                i5 = 4;
            } else {
                int i7 = serializer + 123;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = IconCompatParcelizer + 109;
            int i10 = i9 % Fields.SpotShadowColor;
            serializer = i10;
            if (i9 % 2 != 0 ? (i & 64) != 0 : (i & 97) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2);
            } else {
                int i11 = i10 + 91;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                zIconCompatParcelizer = getpostalcode.read(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2);
            }
            if (zIconCompatParcelizer) {
                int i13 = serializer + 99;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                i4 = i13 % 2 != 0 ? 82 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= (i & Fields.RotationY) == 0 ? getpostalcode.read(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3) : getpostalcode.IconCompatParcelizer(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & Fields.TransformOrigin) == 0 ? getpostalcode.read(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius4) : getpostalcode.IconCompatParcelizer(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius4) ? Fields.CameraDistance : Fields.RotationZ;
        }
        Object obj = null;
        if ((i & 24576) == 0) {
            int i14 = IconCompatParcelizer + 11;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ^ true ? 8192 : Fields.Clip;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.read(modifier)) {
                int i15 = IconCompatParcelizer + 109;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i3 = Fields.RenderEffect;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            int i17 = IconCompatParcelizer + 97;
            serializer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            float f = Dimensions.setTabContainer;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifier, f, 0.0f, 2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i19 = serializer + 27;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            int i20 = i2 >> 6;
            int i21 = i20 & 896;
            FrequentlyUsedItemsRow(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius, r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, (i2 & 14) | 72 | (i2 & 112) | i21);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, f)});
            FrequentlyUsedItemsRow(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3, r8lambdaqnzrqetjfff2wxtrt0ewrzhwius4, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, (i20 & 14) | 72 | (i20 & 112) | i21);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) r8lambdaqnzrqetjfff2wxtrt0ewrzhwius, (Object) r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2, (Object) r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3, (Object) r8lambdaqnzrqetjfff2wxtrt0ewrzhwius4, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, i, 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0353  */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:70:0x013b  */
    public static final void FrequentlyUsedItemsRow(final r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius, final r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        final int i4;
        boolean z6;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 97;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1718594307);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius) : getpostalcode.IconCompatParcelizer(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0 ? getpostalcode.read(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2) : getpostalcode.IconCompatParcelizer(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2)) {
                int i9 = IconCompatParcelizer + 25;
                serializer = i9 % Fields.SpotShadowColor;
                i5 = i9 % 2 == 0 ? 12 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            int i10 = IconCompatParcelizer + 47;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 256 : Fields.SpotShadowColor;
        }
        int i12 = i2 | 3072;
        if (getpostalcode.write(i12 & 1, (i12 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierHeight = IntrinsicKt.height(SizeKt.write(companion, 1.0f), expand.Min);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, Alignment.Companion.getTop(), getpostalcode, 6);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierHeight);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (r8lambdaqnzrqetjfff2wxtrt0ewrzhwius == null || r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2 == null) {
                if (r8lambdaqnzrqetjfff2wxtrt0ewrzhwius != null) {
                    getpostalcode.serializer(1073917150);
                    String str = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.read;
                    String str2 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.write;
                    String str3 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.serializer;
                    Modifier modifierSerializer = SizeKt.serializer(copyejIjP34.write(companion, 1.0f), 1.0f);
                    boolean z7 = (i12 & 896) == 256;
                    boolean z8 = (i12 & 14) == 4 || ((i12 & 8) != 0 && getpostalcode.IconCompatParcelizer(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius));
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if ((z7 | z8) || objComponentActivity == androidContentCaptureManager) {
                        final int i13 = 2;
                        objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.r8lambdapXdXi59iif6H3paaLwLdMP7FVPY
                            private static int IconCompatParcelizer = 0;
                            private static int read = 1;

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i14 = 2 % 2;
                                int i15 = IconCompatParcelizer + 121;
                                read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                Object obj = null;
                                if (i15 % 2 == 0) {
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    obj.hashCode();
                                    throw null;
                                }
                                int i16 = i13;
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                if (i16 == 0) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                    return createfromparcel2;
                                }
                                if (i16 == 1) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                    return createfromparcel2;
                                }
                                if (i16 == 2) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                    return createfromparcel2;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                int i17 = IconCompatParcelizer + 17;
                                read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i17 % 2 != 0) {
                                    return createfromparcel2;
                                }
                                obj.hashCode();
                                throw null;
                            }
                        };
                        getpostalcode.write(objComponentActivity);
                    }
                    modifier2 = companion;
                    FrequentlyUsedItemKt.FrequentlyUsedItem(0, 16, getpostalcode, modifierSerializer, null, str, str2, str3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(modifier2, Dimensions.setTabContainer)});
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, copyejIjP34.write(modifier2, 1.0f)});
                    z3 = false;
                    getpostalcode.IconCompatParcelizer(false);
                } else if (r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2 != null) {
                    int i14 = IconCompatParcelizer + 53;
                    serializer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    getpostalcode.serializer(1074365658);
                    String str4 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2.read;
                    String str5 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2.write;
                    String str6 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2.serializer;
                    Modifier modifierSerializer2 = SizeKt.serializer(copyejIjP34.write(companion, 1.0f), 1.0f);
                    if ((i12 & 896) == 256) {
                        int i16 = IconCompatParcelizer + 123;
                        serializer = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z9 = (i12 & 112) == 32 || ((i12 & 64) != 0 && getpostalcode.IconCompatParcelizer(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2));
                    Object objComponentActivity2 = getpostalcode.ComponentActivity();
                    if ((z2 | z9) || objComponentActivity2 == androidContentCaptureManager) {
                        final int i18 = 3;
                        objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.r8lambdapXdXi59iif6H3paaLwLdMP7FVPY
                            private static int IconCompatParcelizer = 0;
                            private static int read = 1;

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i19 = 2 % 2;
                                int i110 = IconCompatParcelizer + 121;
                                read = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                Object obj = null;
                                if (i110 % 2 == 0) {
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    obj.hashCode();
                                    throw null;
                                }
                                int i111 = i18;
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                if (i111 == 0) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                    return createfromparcel2;
                                }
                                if (i111 == 1) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                    return createfromparcel2;
                                }
                                if (i111 == 2) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                    return createfromparcel2;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                int i112 = IconCompatParcelizer + 17;
                                read = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i112 % 2 != 0) {
                                    return createfromparcel2;
                                }
                                obj.hashCode();
                                throw null;
                            }
                        };
                        getpostalcode.write(objComponentActivity2);
                    }
                    modifier2 = companion;
                    FrequentlyUsedItemKt.FrequentlyUsedItem(0, 16, getpostalcode, modifierSerializer2, null, str4, str5, str6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(modifier2, Dimensions.setTabContainer)});
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, copyejIjP34.write(modifier2, 1.0f)});
                    z = false;
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    modifier2 = companion;
                    z = false;
                    getpostalcode.serializer(1074779849);
                    getpostalcode.IconCompatParcelizer(false);
                }
                i3 = IconCompatParcelizer + 61;
                serializer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    z = true;
                }
                getpostalcode.IconCompatParcelizer(z);
            } else {
                getpostalcode.serializer(1073192029);
                String str7 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.read;
                String str8 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.write;
                String str9 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius.serializer;
                Modifier modifierSerializer3 = SizeKt.serializer(copyejIjP34.write(companion, 1.0f), 1.0f);
                int i19 = i12 & 896;
                if (i19 == 256) {
                    int i20 = IconCompatParcelizer + 115;
                    serializer = i20 % Fields.SpotShadowColor;
                    if (i20 % 2 == 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                } else {
                    z4 = false;
                }
                if ((i12 & 14) != 4) {
                    int i21 = serializer + 67;
                    IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    if ((i12 & 8) == 0 || !getpostalcode.IconCompatParcelizer(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                } else {
                    z5 = true;
                }
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (!z4 && !z5) {
                    int i23 = serializer + 87;
                    IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        i4 = 0;
                        objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.r8lambdapXdXi59iif6H3paaLwLdMP7FVPY
                            private static int IconCompatParcelizer = 0;
                            private static int read = 1;

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i110 = 2 % 2;
                                int i111 = IconCompatParcelizer + 121;
                                read = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                Object obj = null;
                                if (i111 % 2 == 0) {
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    obj.hashCode();
                                    throw null;
                                }
                                int i112 = i4;
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                if (i112 == 0) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                    return createfromparcel2;
                                }
                                if (i112 == 1) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                    return createfromparcel2;
                                }
                                if (i112 == 2) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                    return createfromparcel2;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                int i113 = IconCompatParcelizer + 17;
                                read = i113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i113 % 2 != 0) {
                                    return createfromparcel2;
                                }
                                obj.hashCode();
                                throw null;
                            }
                        };
                        getpostalcode.write(objComponentActivity3);
                    } else {
                        i4 = 0;
                    }
                } else {
                    i4 = 0;
                    objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.r8lambdapXdXi59iif6H3paaLwLdMP7FVPY
                        private static int IconCompatParcelizer = 0;
                        private static int read = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i110 = 2 % 2;
                            int i111 = IconCompatParcelizer + 121;
                            read = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            Object obj = null;
                            if (i111 % 2 == 0) {
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                obj.hashCode();
                                throw null;
                            }
                            int i112 = i4;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            if (i112 == 0) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                return createfromparcel2;
                            }
                            if (i112 == 1) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                return createfromparcel2;
                            }
                            if (i112 == 2) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                return createfromparcel2;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                            int i113 = IconCompatParcelizer + 17;
                            read = i113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i113 % 2 != 0) {
                                return createfromparcel2;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    };
                    getpostalcode.write(objComponentActivity3);
                }
                FrequentlyUsedItemKt.FrequentlyUsedItem(0, 16, getpostalcode, modifierSerializer3, null, str7, str8, str9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion, Dimensions.setTabContainer)});
                String str10 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2.read;
                String str11 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2.write;
                String str12 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2.serializer;
                Modifier modifierSerializer4 = SizeKt.serializer(copyejIjP34.write(companion, 1.0f), 1.0f);
                if (i19 == 256) {
                    int i25 = serializer + 3;
                    IconCompatParcelizer = i25 % Fields.SpotShadowColor;
                    int i26 = i25 % 2;
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z10 = (i12 & 112) == 32 || ((i12 & 64) != 0 && getpostalcode.IconCompatParcelizer(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2));
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if ((z6 | z10) || objComponentActivity4 == androidContentCaptureManager) {
                    final int i27 = 1;
                    objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.r8lambdapXdXi59iif6H3paaLwLdMP7FVPY
                        private static int IconCompatParcelizer = 0;
                        private static int read = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i110 = 2 % 2;
                            int i111 = IconCompatParcelizer + 121;
                            read = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            Object obj = null;
                            if (i111 % 2 == 0) {
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                obj.hashCode();
                                throw null;
                            }
                            int i112 = i27;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            r8lambdaqnZRqetjfFf2WXtrt0EwRzhWIUs r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3 = r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            if (i112 == 0) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                return createfromparcel2;
                            }
                            if (i112 == 1) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                return createfromparcel2;
                            }
                            if (i112 == 2) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                                return createfromparcel2;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(r8lambdaqnzrqetjfff2wxtrt0ewrzhwius3);
                            int i113 = IconCompatParcelizer + 17;
                            read = i113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i113 % 2 != 0) {
                                return createfromparcel2;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    };
                    getpostalcode.write(objComponentActivity4);
                }
                modifier2 = companion;
                FrequentlyUsedItemKt.FrequentlyUsedItem(0, 16, getpostalcode, modifierSerializer4, null, str10, str11, str12, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4);
                z3 = false;
                getpostalcode.IconCompatParcelizer(false);
            }
            z = z3;
            i3 = IconCompatParcelizer + 61;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                z = true;
            }
            getpostalcode.IconCompatParcelizer(z);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) r8lambdaqnzrqetjfff2wxtrt0ewrzhwius, (Object) r8lambdaqnzrqetjfff2wxtrt0ewrzhwius2, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i, 29);
        }
    }
}
