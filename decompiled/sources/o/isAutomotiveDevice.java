package o;

import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.GapComposer$CompositionContextImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import java.util.UUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.UiMediaScopeViewingDistance;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class isAutomotiveDevice {
    /* JADX INFO: renamed from: ModalBottomSheetDialog-sW7UJKQ, reason: not valid java name */
    public static final void m5154ModalBottomSheetDialogsW7UJKQ(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final long j, final hasPhysicalKeyboard hasphysicalkeyboard, androidx.compose.animation.core.Animatable animatable, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Object obj;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        boolean zIconCompatParcelizer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(766784632);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.serializer(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(hasphysicalkeyboard) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if ((i & androidx.compose.ui.graphics.Fields.TransformOrigin) == 0) {
                zIconCompatParcelizer = getpostalcode.read(animatable);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(animatable);
            }
            i2 |= zIconCompatParcelizer ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? androidx.compose.ui.graphics.Fields.Clip : 8192;
        }
        int i5 = i2;
        if (getpostalcode.write(i5 & 1, (i5 & 9363) != 9362)) {
            View view = (View) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            final androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
            GapComposer$CompositionContextImpl gapComposer$CompositionContextImplRemoteActionCompatParcelizer = SentryUUID.RemoteActionCompatParcelizer(getpostalcode);
            final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = androidx.compose.runtime.CompositionKt.serializer(dragAndDropTargetModifierNode, getpostalcode);
            Object[] objArr = new Object[0];
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                obj = objComponentActivity;
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(18);
                getpostalcode.write(remoteActionCompatParcelizer);
                obj = remoteActionCompatParcelizer;
            }
            obj = objComponentActivity;
            UUID uuid = (UUID) getEventType.IconCompatParcelizer(objArr, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj, getpostalcode, 48);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            Object obj4 = objComponentActivity2;
            if (objComponentActivity2 == androidContentCaptureManager) {
                getContentViewGroupParentLayout getcontentviewgroupparentlayoutRemoteActionCompatParcelizer = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                getpostalcode.write(getcontentviewgroupparentlayoutRemoteActionCompatParcelizer);
                obj4 = getcontentviewgroupparentlayoutRemoteActionCompatParcelizer;
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj4;
            boolean z = getpostalcode.read(view);
            boolean z2 = getpostalcode.read(density);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if ((z || z2) || objComponentActivity3 == androidContentCaptureManager) {
                i3 = 1;
                androidx.compose.material3.ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = new androidx.compose.material3.ModalBottomSheetDialogWrapper(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, hasphysicalkeyboard, j, view, layoutDirection, density, uuid, animatable, getcontentviewgroupparentlayout);
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode2 = new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetDialog$dialog$1$1$1
                    /* JADX WARN: Code duplicated, block: B:21:0x009e  */
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj5, Object obj6) {
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj5;
                        int iIntValue = ((Number) obj6).intValue();
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Modifier.Companion companion = Modifier.Companion;
                            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                            if (objComponentActivity4 == getCreditCardExpirationMonth.write) {
                                objComponentActivity4 = new UiMediaScopeViewingDistance(13);
                                getpostalcode2.write(objComponentActivity4);
                            }
                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, 1, null);
                            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                            int iSerializer = SentryUUID.serializer(getpostalcode2);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierSemantics$default);
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
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            if (getpostalcode2.ComponentActivity) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            } else {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                }
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion2.getSetModifier());
                            ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) populateViewStructure_androidKtpopulate7Serializer.getValue()).invoke(getpostalcode2, 0);
                            getpostalcode2.IconCompatParcelizer(true);
                        } else {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, true, -1051373467);
                androidx.compose.material3.ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper2 = modalBottomSheetDialogWrapper;
                ZIndexElement zIndexElement = modalBottomSheetDialogWrapper2.read;
                zIndexElement.setParentCompositionContext(gapComposer$CompositionContextImplRemoteActionCompatParcelizer);
                ((onShowTranslationui) zIndexElement.write).setValue(dragAndDropTargetModifierNode2);
                zIndexElement.RemoteActionCompatParcelizer = true;
                zIndexElement.createComposition();
                getpostalcode.write(modalBottomSheetDialogWrapper2);
                obj2 = modalBottomSheetDialogWrapper2;
            } else {
                i3 = 1;
                obj2 = objComponentActivity3;
            }
            final androidx.compose.material3.ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper3 = (androidx.compose.material3.ModalBottomSheetDialogWrapper) obj2;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(modalBottomSheetDialogWrapper3);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity4 == androidContentCaptureManager) {
                i4 = 0;
                isDocked isdocked = new isDocked(i4, modalBottomSheetDialogWrapper3);
                getpostalcode.write(isdocked);
                obj3 = isdocked;
            } else {
                i4 = 0;
                obj3 = objComponentActivity4;
            }
            getPhoneNumberNational.serializer(modalBottomSheetDialogWrapper3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, getpostalcode);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(modalBottomSheetDialogWrapper3);
            int i6 = (i5 & 14) == 4 ? i3 : i4;
            int i7 = (i5 & 896) == 256 ? i3 : i4;
            if ((i5 & 112) != 32) {
                i3 = i4;
            }
            boolean z3 = getpostalcode.read(layoutDirection.ordinal());
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (((z3 ? 1 : 0) | (zIconCompatParcelizer3 ? 1 : 0) | i6 | i7 | i3) != 0 || objComponentActivity5 == androidContentCaptureManager) {
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.isImeVisible
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        modalBottomSheetDialogWrapper3.serializer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, hasphysicalkeyboard, j, layoutDirection);
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                objComponentActivity5 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
            }
            getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, getpostalcode);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new hasValidPointerSourcedefault(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, j, hasphysicalkeyboard, animatable, dragAndDropTargetModifierNode, i);
        }
    }
}
