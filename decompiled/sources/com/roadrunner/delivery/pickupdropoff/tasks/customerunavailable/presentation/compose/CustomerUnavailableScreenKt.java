package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model.CustomerUnavailableTaskState$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model.IvrState;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerUnavailableScreenKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$CancelOrderData$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$DispatcherData$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$IvrCallData$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$TimerData$Companion;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.stepper.TaskStatusIndicatorKt;
import io.sentry.SentryUUID;
import java.util.Iterator;
import java.util.List;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.ContextCache;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.TextFieldDefaults;
import o.TransitionBasedAnimation;
import o.TransitionComposeAnimation_androidKt;
import o.asTree;
import o.boundsOfLayoutNode;
import o.buildMapping;
import o.expand;
import o.fieldToDouble;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getCurrentAnimation;
import o.getHandleruiannotations;
import o.getMaxDuration;
import o.getNewPassword;
import o.getPostalCode;
import o.getStable;
import o.handleUrlOverridelambda1;
import o.makeTreedefault;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdakX1auGmjk4nKnxFqVYyTYqzkc;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomerUnavailableScreenKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:132:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:13:0x005a  */
    /* JADX WARN: Code duplicated, block: B:207:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0161  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [o.getBirthDateFull, o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, o.getBirthDateFull, o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v27, types: [o.getBirthDateFull] */
    /* JADX WARN: Type inference failed for: r8v13, types: [o.getBirthDateFull] */
    /* JADX WARN: Type inference failed for: r9v22, types: [o.getBirthDateFull] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [int] */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    public static final void CustomerUnavailableScreen(final makeTreedefault maketreedefault, final getMaxDuration getmaxduration, final String str, final boolean z, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        final Modifier modifier2;
        ?? r0;
        Iterator it;
        Object next;
        Object next2;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        getPostalCode getpostalcode;
        boolean z6;
        ?? r13;
        ?? r1;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        ?? r9;
        ?? r10;
        boolean z7;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 2 % 2;
        List list = maketreedefault.components;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k4.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k5.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k6.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1864555540);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode2.read(maketreedefault) : getpostalcode2.IconCompatParcelizer(maketreedefault)) {
                int i12 = RemoteActionCompatParcelizer + 43;
                serializer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    i10 = 2;
                } else {
                    i10 = 4;
                }
            } else {
                i10 = 2;
            }
            i3 = i10 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? getpostalcode2.read(getmaxduration) : getpostalcode2.IconCompatParcelizer(getmaxduration) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (!getpostalcode2.read(str)) {
                i9 = 128;
            } else {
                int i13 = RemoteActionCompatParcelizer + 115;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i9 = Fields.RotationX;
            }
            i3 |= i9;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.write(z) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i15 = RemoteActionCompatParcelizer + 17;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i8 = Fields.RenderEffect;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i17 = serializer + 45;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i7 = 1048576;
            } else {
                i7 = Fields.BlendMode;
            }
            i3 |= i7;
        }
        if ((12582912 & i) == 0) {
            int i19 = RemoteActionCompatParcelizer + 91;
            serializer = i19 % Fields.SpotShadowColor;
            if (i19 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k5) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k6)) {
                int i20 = serializer + 113;
                RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                if (i20 % 2 == 0) {
                    i6 = 2;
                } else {
                    i6 = 4;
                }
            } else {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i21 = i4 | 384;
        if (getpostalcode2.write(i3 & 1, ((306783379 & i3) == 306783378 && (i21 & 147) == 146) ? false : true)) {
            int i22 = RemoteActionCompatParcelizer + 121;
            serializer = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            Modifier.Companion companion = Modifier.Companion;
            boolean z8 = getmaxduration.isChatInitiated;
            boolean z9 = getmaxduration.isCallInitiated;
            boolean z10 = z8 && z9 && (getmaxduration.ivrState == IvrState.SUCCESS);
            boolean z11 = getpostalcode2.read(list);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z11) {
                it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof boundsOfLayoutNode));
                objComponentActivity = (boundsOfLayoutNode) next;
                getpostalcode2.write(objComponentActivity);
            } else {
                int i24 = serializer + 27;
                RemoteActionCompatParcelizer = i24 % Fields.SpotShadowColor;
                if (i24 % 2 == 0) {
                    throw null;
                }
                if (objComponentActivity == androidContentCaptureManager) {
                    it = list.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(next instanceof boundsOfLayoutNode));
                    objComponentActivity = (boundsOfLayoutNode) next;
                    getpostalcode2.write(objComponentActivity);
                }
            }
            boundsOfLayoutNode boundsoflayoutnode = (boundsOfLayoutNode) objComponentActivity;
            boolean z12 = getpostalcode2.read(list);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (z12 || objComponentActivity2 == androidContentCaptureManager) {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!(next2 instanceof asTree));
                objComponentActivity2 = (asTree) next2;
                getpostalcode2.write(objComponentActivity2);
            }
            asTree astree = (asTree) objComponentActivity2;
            Modifier modifierThen = companion.then(SizeKt.read);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            Modifier.Companion companion3 = companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            CustomerUnavailableHeaderKt.CustomerUnavailableHeader((i3 >> 9) & 112, getpostalcode2, null, maketreedefault.title, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            Modifier.Companion companion5 = Modifier.Companion;
            float f = Dimensions.setTabContainer;
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(PaddingKt.write(companion5, f), PagerWrapperFlingBehavior.read(0, getpostalcode2, 1), false, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierIconCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            if (z) {
                z2 = false;
                getpostalcode2.serializer(-22887526);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                int i25 = RemoteActionCompatParcelizer + 21;
                serializer = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                getpostalcode2.serializer(-23192163);
                TextKt.m131TextNvy7gAk(maketreedefault.description, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
                z2 = false;
                IconCompatParcelizer.IconCompatParcelizer(companion5, f, getpostalcode2, false);
            }
            r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc = maketreedefault.customerData;
            if (r8lambdakx1augmjk4nknxfqvyytyqzkc == null) {
                getpostalcode2.serializer(-22818273);
                getpostalcode2.IconCompatParcelizer(z2);
                companion3 = companion3;
                i5 = i3;
                z3 = z8;
                i21 = i21;
                z7 = z2;
                r13 = z7 ? 1 : 0;
                r1 = getpostalcode2;
                z4 = z9;
            } else {
                getpostalcode2.serializer(-22818272);
                if (z) {
                    getpostalcode2.serializer(-2131846906);
                    int i27 = i3 >> 6;
                    z3 = z8;
                    i5 = i3;
                    boolean z13 = z2;
                    z4 = z9;
                    TransitionComposeAnimation_androidKt.read(r8lambdakx1augmjk4nknxfqvyytyqzkc, z8, z9, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, 1, getpostalcode2, (i27 & 57344) | (i27 & 7168) | 8 | ((i21 << 12) & 458752));
                    IconCompatParcelizer.IconCompatParcelizer(companion5, Dimensions.setStackedBackground, getpostalcode2, z13);
                    getpostalcode = getpostalcode2;
                    z5 = z13;
                } else {
                    i5 = i3;
                    z3 = z8;
                    boolean z14 = z2;
                    z4 = z9;
                    getpostalcode2.serializer(-2131289371);
                    int i28 = i5 >> 6;
                    getPostalCode getpostalcode3 = getpostalcode2;
                    CustomerContactSectionKt.CustomerContactSection(r8lambdakx1augmjk4nknxfqvyytyqzkc, z3, z4, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, 1, null, getpostalcode2, (i28 & 7168) | 8 | (i28 & 57344) | (458752 & i28));
                    getpostalcode3.IconCompatParcelizer(z14);
                    getpostalcode = getpostalcode3;
                    z5 = z14;
                }
                getpostalcode.IconCompatParcelizer(z5);
                z6 = true;
                r1 = getpostalcode;
                r13 = z5;
            }
            if (astree == null) {
                r1.serializer(-21676915);
                r1.IconCompatParcelizer(r13);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            } else {
                r1.serializer(-21676914);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                boolean zBooleanValue = ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(astree.requiredSteps)).booleanValue();
                int i29 = (z6 ? 1 : 0) + 1;
                IvrState ivrState = getmaxduration.ivrState;
                CustomerUnavailableTaskUiItem$IvrCallData$Companion customerUnavailableTaskUiItem$IvrCallData$Companion = asTree.Companion;
                TransitionBasedAnimation.RemoteActionCompatParcelizer(astree, ivrState, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, zBooleanValue, null, Integer.valueOf(i29), r1, ((i5 >> 18) & 896) | 8);
                IconCompatParcelizer.IconCompatParcelizer(companion5, Dimensions.setStackedBackground, (getPostalCode) r1, (boolean) r13);
                r9 = i29;
            }
            if (boundsoflayoutnode == null) {
                z6 = z7;
                z6 = z7;
                r9 = z6;
                r1.serializer(-21229895);
                r1.IconCompatParcelizer(r13);
                r10 = r9;
            } else {
                z6 = z7;
                z6 = z7;
                r9 = z6;
                r1.serializer(-21229894);
                boolean zBooleanValue2 = ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(boundsoflayoutnode.requiredSteps)).booleanValue();
                int i30 = (r9 == true ? 1 : 0) + 1;
                CustomerUnavailableTaskUiItem$TimerData$Companion customerUnavailableTaskUiItem$TimerData$Companion = boundsOfLayoutNode.Companion;
                getCurrentAnimation.write(boundsoflayoutnode, str, null, zBooleanValue2, Integer.valueOf(i30), r1, ((i5 >> 3) & 112) | 8);
                IconCompatParcelizer.IconCompatParcelizer(companion5, Dimensions.setStackedBackground, (getPostalCode) r1, (boolean) r13);
                r10 = i30;
            }
            Modifier modifierHeight = IntrinsicKt.height(companion5, expand.Max);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getTop(), r1, r13);
            int iHashCode3 = Long.hashCode(r1.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = r1.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(r1, modifierHeight);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion4.getConstructor();
            r1.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (r1.ComponentActivity) {
                r1.serializer(constructor3);
            } else {
                r1.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, r1, supportingtextpaddinga9ujit4material3defaultSerializer, r1, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(r1, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion4, (getPostalCode) r1, Integer.valueOf(iHashCode3), (getPostalCode) r1));
            TaskStatusIndicatorKt.TaskStatusIndicator((z3 && z4) ? fieldToDouble.Active : fieldToDouble.Inactive, null, Integer.valueOf(r10 + 1), false, r1, 3072, 2);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{r1, SizeKt.m86width3ABfNKs(companion5, Dimensions.setStackedBackground)});
            ?? r2 = r1;
            getStable getstable = maketreedefault.dispatcherData;
            if (getstable == null) {
                r2.serializer(-1762133942);
                r2.IconCompatParcelizer(r13);
            } else {
                r2.serializer(-1762133941);
                CustomerUnavailableTaskUiItem$DispatcherData$Companion customerUnavailableTaskUiItem$DispatcherData$Companion = getStable.Companion;
                CustomerUnavailableTaskState$Companion customerUnavailableTaskState$Companion = getMaxDuration.Companion;
                DispatcherWithTimerSectionKt.DispatcherWithTimerSection(getstable, getmaxduration, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, z10, z, r2, (i5 & 112) | 72 | (i5 & 896) | ((i5 >> 18) & 7168) | ((i21 << 9) & 57344) | ((i5 << 12) & 29360128));
                r2.IconCompatParcelizer(r13);
            }
            ContextCache contextCache = maketreedefault.cancelOrderData;
            if (contextCache == null) {
                int i31 = serializer + 71;
                RemoteActionCompatParcelizer = i31 % Fields.SpotShadowColor;
                int i32 = i31 % 2;
                r2.serializer(-1761566642);
                r2.IconCompatParcelizer(r13);
            } else {
                r2.serializer(-1761566641);
                CustomerUnavailableTaskUiItem$CancelOrderData$Companion customerUnavailableTaskUiItem$CancelOrderData$Companion = ContextCache.Companion;
                CustomerUnavailableTaskState$Companion customerUnavailableTaskState$Companion2 = getMaxDuration.Companion;
                int i33 = i21 << 9;
                CancelOrderWithTimerSectionKt.CancelOrderWithTimerSection(contextCache, getmaxduration, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, z10, z, r2, (i33 & 57344) | (i5 & 112) | 72 | (i5 & 896) | (i33 & 7168) | ((i5 << 12) & 29360128));
                r2.IconCompatParcelizer(r13);
            }
            af$$ExternalSyntheticOutline0.m((getPostalCode) r2, true, true, true);
            modifier2 = companion3;
            r0 = r2;
        } else {
            getPostalCode getpostalcode4 = getpostalcode2;
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            r0 = getpostalcode4;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = r0.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TransitionComposeAnimation
                private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
                private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i34 = 2 % 2;
                    int i35 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 89;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i35 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i36 = i35 % 2;
                    ((Integer) obj3).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    CustomerUnavailableScreenKt.CustomerUnavailableScreen(maketreedefault, getmaxduration, str, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i37 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 35;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i37 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i38 = i37 % 2;
                    return createfromparcel;
                }
            };
        }
    }
}
