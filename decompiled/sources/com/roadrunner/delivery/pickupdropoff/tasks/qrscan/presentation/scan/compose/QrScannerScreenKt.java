package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.compose;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.CoroutineLiveData;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.location.Vw$Vw;
import com.roadrunner.delivery.pickupdropoff.codescanner.RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$QrScanScreen$Companion;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import java.util.concurrent.Executor;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodeKtDragAndDropTargetModifierNode1;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IntRect;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PrematureEndOfStreamVideoQuirk;
import o.PreviewParameter;
import o.accessgetMaxcp;
import o.accessisRenderNodeCompatiblecp;
import o.brazelogdefault;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getEllipsisgIe3tQ8;
import o.getExtendedTouchPaddinghWWAJMo;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getLogoDescription;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.isInvalidIndex;
import o.plusoCl6YwE;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setInternalPaintui_graphics;
import o.toOffsetgyyYBs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QrScannerScreenKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void IconCompatParcelizer(getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(510250422);
        if ((i & 6) == 0) {
            int i4 = serializer + 47;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = (getpostalcode.IconCompatParcelizer(getextendedtouchpaddinghwwajmo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if (getpostalcode.write(i6 & 1, (i6 & 19) != 18)) {
            int i7 = serializer + 59;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                Modifier.Companion companion = Modifier.Companion;
                getpostalcode.IconCompatParcelizer(getextendedtouchpaddinghwwajmo);
                getpostalcode.ComponentActivity();
                throw null;
            }
            modifier = Modifier.Companion;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getextendedtouchpaddinghwwajmo);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new IntRect(getextendedtouchpaddinghwwajmo, 0);
                getpostalcode.write(objComponentActivity);
            }
            AndroidView_androidKt.AndroidView((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier.then(SizeKt.read), null, getpostalcode, 0, 4);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new plusoCl6YwE(getextendedtouchpaddinghwwajmo, modifier, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0240  */
    /* JADX WARN: Code duplicated, block: B:101:0x0242  */
    /* JADX WARN: Code duplicated, block: B:103:0x0249  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x018c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:98:0x022e  */
    public static final void QrScannerScreen(PreviewParameter previewParameter, accessgetMaxcp accessgetmaxcp, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo;
        int i3;
        Vw$Vw vw$Vw;
        Object obj;
        int i4;
        Integer num;
        int i5;
        Object tooffsetgyyybs;
        int i6;
        int i7 = 2 % 2;
        previewParameter.getClass();
        accessgetmaxcp.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1744594463);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(previewParameter) : getpostalcode.IconCompatParcelizer(previewParameter)) {
                int i8 = serializer + 65;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(accessgetmaxcp) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ^ true ? 8192 : Fields.Clip;
        }
        int i10 = i2 | 196608;
        if ((74899 & i10) != 74898) {
            int i11 = serializer + 1;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            int i13 = serializer + 47;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Context context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) getpostalcode.write((getNewPassword) setInternalPaintui_graphics.write);
            boolean z2 = getpostalcode.read(context);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = context.getMainExecutor();
                getpostalcode.write(objComponentActivity);
            }
            Executor executor = (Executor) objComponentActivity;
            executor.getClass();
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode);
            boolean z3 = getpostalcode.read(context);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z3) {
                obj = objComponentActivity2;
                getextendedtouchpaddinghwwajmo = new getExtendedTouchPaddinghWWAJMo(context);
                getextendedtouchpaddinghwwajmo.read(getLogoDescription.serializer);
                getextendedtouchpaddinghwwajmo.MediaMetadataCompat();
                PrematureEndOfStreamVideoQuirk.write();
                i3 = getextendedtouchpaddinghwwajmo.MediaSessionCompatQueueItem;
                if (2 != i3) {
                    getextendedtouchpaddinghwwajmo.MediaSessionCompatQueueItem = 2;
                    PrematureEndOfStreamVideoQuirk.write();
                    PrematureEndOfStreamVideoQuirk.write();
                    getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer(new brazelogdefault(getextendedtouchpaddinghwwajmo, i3, 4));
                }
                vw$Vw = new Vw$Vw((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) populateViewStructure_androidKtpopulate7Serializer.getValue());
                PrematureEndOfStreamVideoQuirk.write();
                if (getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer == vw$Vw) {
                    int i15 = IconCompatParcelizer + 47;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    if (getextendedtouchpaddinghwwajmo.IconCompatParcelizer != executor) {
                        getextendedtouchpaddinghwwajmo.IconCompatParcelizer = executor;
                        getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer = vw$Vw;
                        getextendedtouchpaddinghwwajmo.PlaybackStateCompatCustomAction.IconCompatParcelizer(executor, vw$Vw);
                    }
                } else {
                    getextendedtouchpaddinghwwajmo.IconCompatParcelizer = executor;
                    getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer = vw$Vw;
                    getextendedtouchpaddinghwwajmo.PlaybackStateCompatCustomAction.IconCompatParcelizer(executor, vw$Vw);
                }
                getpostalcode.write(getextendedtouchpaddinghwwajmo);
                obj = getextendedtouchpaddinghwwajmo;
            } else {
                int i17 = IconCompatParcelizer + 83;
                serializer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    obj = objComponentActivity2;
                    getextendedtouchpaddinghwwajmo = new getExtendedTouchPaddinghWWAJMo(context);
                    getextendedtouchpaddinghwwajmo.read(getLogoDescription.serializer);
                    getextendedtouchpaddinghwwajmo.MediaMetadataCompat();
                    PrematureEndOfStreamVideoQuirk.write();
                    i3 = getextendedtouchpaddinghwwajmo.MediaSessionCompatQueueItem;
                    if (2 != i3) {
                        getextendedtouchpaddinghwwajmo.MediaSessionCompatQueueItem = 2;
                        PrematureEndOfStreamVideoQuirk.write();
                        PrematureEndOfStreamVideoQuirk.write();
                        getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer(new brazelogdefault(getextendedtouchpaddinghwwajmo, i3, 4));
                    }
                    vw$Vw = new Vw$Vw((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) populateViewStructure_androidKtpopulate7Serializer.getValue());
                    PrematureEndOfStreamVideoQuirk.write();
                    if (getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer == vw$Vw) {
                        int i19 = IconCompatParcelizer + 47;
                        serializer = i19 % Fields.SpotShadowColor;
                        int i110 = i19 % 2;
                        if (getextendedtouchpaddinghwwajmo.IconCompatParcelizer != executor) {
                            getextendedtouchpaddinghwwajmo.IconCompatParcelizer = executor;
                            getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer = vw$Vw;
                            getextendedtouchpaddinghwwajmo.PlaybackStateCompatCustomAction.IconCompatParcelizer(executor, vw$Vw);
                        }
                    } else {
                        getextendedtouchpaddinghwwajmo.IconCompatParcelizer = executor;
                        getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer = vw$Vw;
                        getextendedtouchpaddinghwwajmo.PlaybackStateCompatCustomAction.IconCompatParcelizer(executor, vw$Vw);
                    }
                    getpostalcode.write(getextendedtouchpaddinghwwajmo);
                    obj = getextendedtouchpaddinghwwajmo;
                }
            }
            obj = objComponentActivity2;
            getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo2 = (getExtendedTouchPaddinghWWAJMo) obj;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getextendedtouchpaddinghwwajmo2);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(accessisrendernodecompatiblecp);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            boolean z4 = zIconCompatParcelizer | zIconCompatParcelizer2;
            Object obj2 = null;
            if (z4) {
                objComponentActivity3 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(getextendedtouchpaddinghwwajmo2, 11, accessisrendernodecompatiblecp);
                getpostalcode.write(objComponentActivity3);
                i4 = IconCompatParcelizer + 119;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i20 = 4 / 2;
                }
            } else {
                int i21 = IconCompatParcelizer + 103;
                serializer = i21 % Fields.SpotShadowColor;
                if (i21 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(getextendedtouchpaddinghwwajmo2, 11, accessisrendernodecompatiblecp);
                    getpostalcode.write(objComponentActivity3);
                    i4 = IconCompatParcelizer + 119;
                    serializer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        int i22 = 4 / 2;
                    }
                }
            }
            getPhoneNumberNational.IconCompatParcelizer(getextendedtouchpaddinghwwajmo2, accessisrendernodecompatiblecp, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode);
            getextendedtouchpaddinghwwajmo2.getClass();
            PrematureEndOfStreamVideoQuirk.write();
            CoroutineLiveData coroutineLiveData = getextendedtouchpaddinghwwajmo2.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            coroutineLiveData.getClass();
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7IconCompatParcelizer = DragAndDropNodeKtDragAndDropTargetModifierNode1.IconCompatParcelizer(coroutineLiveData, 0, getpostalcode, 48);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity4);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity4;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(getextendedtouchpaddinghwwajmo2);
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(executor);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer3 && !zIconCompatParcelizer4) {
                int i23 = IconCompatParcelizer + 27;
                serializer = i23 % Fields.SpotShadowColor;
                if (i23 % 2 == 0) {
                    int i24 = 6 / 0;
                    if (objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1(getextendedtouchpaddinghwwajmo2, executor, populateViewStructure_androidKtpopulate7, null, 1);
                        getpostalcode.write(objComponentActivity5);
                    }
                } else if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1(getextendedtouchpaddinghwwajmo2, executor, populateViewStructure_androidKtpopulate7, null, 1);
                    getpostalcode.write(objComponentActivity5);
                }
            } else {
                objComponentActivity5 = new RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1(getextendedtouchpaddinghwwajmo2, executor, populateViewStructure_androidKtpopulate7, null, 1);
                getpostalcode.write(objComponentActivity5);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, getextendedtouchpaddinghwwajmo2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity5);
            boolean zBooleanValue = ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue();
            Integer num2 = (Integer) populateViewStructure_androidKtpopulate7IconCompatParcelizer.getValue();
            boolean z5 = getpostalcode.read(getextendedtouchpaddinghwwajmo2);
            boolean zWrite = getpostalcode.write(zBooleanValue);
            boolean z6 = getpostalcode.read(num2);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (!(zWrite | z5) && !z6) {
                int i25 = IconCompatParcelizer + 95;
                serializer = i25 % Fields.SpotShadowColor;
                if (i25 % 2 == 0) {
                    throw null;
                }
                if (objComponentActivity6 == androidContentCaptureManager) {
                    boolean zBooleanValue2 = ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue();
                    num = (Integer) populateViewStructure_androidKtpopulate7IconCompatParcelizer.getValue();
                    if (num == null) {
                        i5 = 1;
                    } else {
                        i5 = 1;
                        boolean z7 = num.intValue() == 1;
                        tooffsetgyyybs = new toOffsetgyyYBs(getextendedtouchpaddinghwwajmo2, zBooleanValue2, z7, new getEllipsisgIe3tQ8(getextendedtouchpaddinghwwajmo2, i5));
                        getpostalcode.write(tooffsetgyyybs);
                    }
                    tooffsetgyyybs = new toOffsetgyyYBs(getextendedtouchpaddinghwwajmo2, zBooleanValue2, z7, new getEllipsisgIe3tQ8(getextendedtouchpaddinghwwajmo2, i5));
                    getpostalcode.write(tooffsetgyyybs);
                } else {
                    tooffsetgyyybs = objComponentActivity6;
                }
            } else {
                boolean zBooleanValue3 = ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue();
                num = (Integer) populateViewStructure_androidKtpopulate7IconCompatParcelizer.getValue();
                if (num == null) {
                    i5 = 1;
                } else {
                    i5 = 1;
                    if (num.intValue() == 1) {
                    }
                    tooffsetgyyybs = new toOffsetgyyYBs(getextendedtouchpaddinghwwajmo2, zBooleanValue3, z7, new getEllipsisgIe3tQ8(getextendedtouchpaddinghwwajmo2, i5));
                    getpostalcode.write(tooffsetgyyybs);
                }
                tooffsetgyyybs = new toOffsetgyyYBs(getextendedtouchpaddinghwwajmo2, zBooleanValue3, z7, new getEllipsisgIe3tQ8(getextendedtouchpaddinghwwajmo2, i5));
                getpostalcode.write(tooffsetgyyybs);
            }
            toOffsetgyyYBs tooffsetgyyybs2 = (toOffsetgyyYBs) tooffsetgyyybs;
            FillElement fillElement = SizeKt.read;
            Modifier modifierThen = companion.then(fillElement);
            modifierThen.getClass();
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
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
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            IconCompatParcelizer(tooffsetgyyybs2.RemoteActionCompatParcelizer, null, getpostalcode, 0);
            boolean z8 = tooffsetgyyybs2.read;
            boolean z9 = tooffsetgyyybs2.IconCompatParcelizer;
            getEllipsisgIe3tQ8 getellipsisgie3tq8 = tooffsetgyyybs2.write;
            Modifier modifierThen2 = companion.then(fillElement);
            QrCodeScanTaskUiItem$QrScanScreen$Companion qrCodeScanTaskUiItem$QrScanScreen$Companion = PreviewParameter.Companion;
            int i26 = i10 << 6;
            modifier = companion;
            QrScannerOverlayKt.QrScannerOverlay(previewParameter, accessgetmaxcp, z8, z9, getellipsisgie3tq8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifierThen2, getpostalcode, (3670016 & i26) | (i26 & 458752) | (i10 & 112) | (i10 & 14) | 12582920);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        Modifier modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) previewParameter, (Object) accessgetmaxcp, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (isInvalidIndex) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, 9);
        }
    }
}
