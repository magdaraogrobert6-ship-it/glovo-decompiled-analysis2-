package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose;

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
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.huawei.agconnect.config.impl.m;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.roadrunner.delivery.pickupdropoff.codescanner.RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1;
import com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$CodeScanScreenUiItem$Companion;
import io.sentry.SentryUUID;
import java.util.concurrent.Executor;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodeKtDragAndDropTargetModifierNode1;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IntRect;
import o.PopulateViewStructure_androidKtpopulate7;
import o.PrematureEndOfStreamVideoQuirk;
import o.SelectionMagnifierKt;
import o.SlotTreeKtExternalSyntheticLambda0;
import o.accessisRenderNodeCompatiblecp;
import o.brazelogdefault;
import o.calculateWindowSize;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getEllipsisgIe3tQ8;
import o.getExtendedTouchPaddinghWWAJMo;
import o.getHandleruiannotations;
import o.getLogoDescription;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getVisiblegIe3tQ8;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.plusoCl6YwE;
import o.r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdabm6Xd4G6qvXesbF9M1n8iztWq4c;
import o.setInternalPaintui_graphics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScannerScreenKt {
    private static int IconCompatParcelizer = 0;
    public static final calculateWindowSize RemoteActionCompatParcelizer = new calculateWindowSize(0);
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        int i = IconCompatParcelizer + 7;
        read = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final void read(getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1243164143);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(getextendedtouchpaddinghwwajmo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        int i5 = 1;
        if ((i4 & 19) != 18) {
            int i6 = write + 103;
            int i7 = i6 % Fields.SpotShadowColor;
            serializer = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 109;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            modifier = Modifier.Companion;
            Modifier modifierThen = modifier.then(SizeKt.read);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(7);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getextendedtouchpaddinghwwajmo);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new IntRect(getextendedtouchpaddinghwwajmo, i5);
                getpostalcode.write(objComponentActivity2);
            }
            AndroidView_androidKt.AndroidView(r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifierThen, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 6, 0);
            int i11 = write + 115;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new plusoCl6YwE(getextendedtouchpaddinghwwajmo, modifier, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:110:0x0210  */
    /* JADX WARN: Code duplicated, block: B:112:0x0216  */
    /* JADX WARN: Code duplicated, block: B:113:0x0218  */
    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:129:0x027c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    /* JADX WARN: Code duplicated, block: B:17:0x005d A[PHI: r1
  0x005d: PHI (r1v44 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v46 o.getPostalCode) binds: [B:8:0x0046, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:9:0x0048 A[PHI: r1
  0x0048: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v46 o.getPostalCode) binds: [B:8:0x0046, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void ScannerScreen(SlotTreeKtExternalSyntheticLambda0 slotTreeKtExternalSyntheticLambda0, r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8 r8lambda9sapdiqx6c5hcuvrgmuvyxekhj8, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, p0 p0Var, Modifier modifier, Integer num, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        boolean z;
        Modifier modifier2;
        getPostalCode getpostalcode3;
        boolean z2;
        boolean z3;
        Object getvisiblegie3tq8;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = write + 113;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            slotTreeKtExternalSyntheticLambda0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            p0Var.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1746381716);
            if ((i & 15) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(slotTreeKtExternalSyntheticLambda0);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(slotTreeKtExternalSyntheticLambda0);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            slotTreeKtExternalSyntheticLambda0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            p0Var.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1746381716);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(slotTreeKtExternalSyntheticLambda0);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(slotTreeKtExternalSyntheticLambda0);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.read(r8lambda9sapdiqx6c5hcuvrgmuvyxekhj8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = serializer + 1;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 21 / 0;
                if (!getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i6 = Fields.SpotShadowColor;
                } else {
                    i6 = Fields.RotationX;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i6 = Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i3 |= i6;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i11 = write + 39;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(p0Var) ? Fields.Clip : 8192;
        }
        int i13 = 196608 | i3;
        if ((1572864 & i) == 0) {
            if (getpostalcode2.read(num)) {
                int i14 = serializer + 79;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i5 = 1048576;
            } else {
                i5 = Fields.BlendMode;
            }
            i13 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i4 = 4194304;
            } else {
                int i16 = serializer + 53;
                write = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    int i17 = 57 / 0;
                }
                i4 = 8388608;
            }
            i13 |= i4;
        }
        if ((100663296 & i) == 0) {
            i13 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? 67108864 : 33554432;
        }
        if ((38347923 & i13) != 38347922) {
            int i18 = serializer + 13;
            write = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i13 & 1, z)) {
            int i20 = write + 81;
            serializer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            Modifier.Companion companion = Modifier.Companion;
            int i22 = ((i13 >> 6) & 896) | ((i13 >> 3) & 112);
            Context context = (Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) getpostalcode2.write((getNewPassword) setInternalPaintui_graphics.write);
            boolean z4 = getpostalcode2.read(context);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z4 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = context.getMainExecutor();
                getpostalcode2.write(objComponentActivity);
            }
            Executor executor = (Executor) objComponentActivity;
            executor.getClass();
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode2);
            boolean z5 = getpostalcode2.read(context);
            boolean z6 = getpostalcode2.read(executor);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            Object obj = objComponentActivity2;
            if ((z5 | z6) || objComponentActivity2 == androidContentCaptureManager) {
                getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo = new getExtendedTouchPaddinghWWAJMo(context);
                getextendedtouchpaddinghwwajmo.read(getLogoDescription.serializer);
                getextendedtouchpaddinghwwajmo.MediaMetadataCompat();
                PrematureEndOfStreamVideoQuirk.write();
                int i23 = getextendedtouchpaddinghwwajmo.MediaSessionCompatQueueItem;
                if (2 != i23) {
                    getextendedtouchpaddinghwwajmo.MediaSessionCompatQueueItem = 2;
                    PrematureEndOfStreamVideoQuirk.write();
                    PrematureEndOfStreamVideoQuirk.write();
                    getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer(new brazelogdefault(getextendedtouchpaddinghwwajmo, i23, 4));
                }
                m mVar = new m(new SelectionMagnifierKt(populateViewStructure_androidKtpopulate7Serializer, 7));
                PrematureEndOfStreamVideoQuirk.write();
                if (getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer == mVar) {
                    int i24 = serializer + 65;
                    write = i24 % Fields.SpotShadowColor;
                    if (i24 % 2 != 0) {
                        Executor executor2 = getextendedtouchpaddinghwwajmo.IconCompatParcelizer;
                        throw null;
                    }
                    if (getextendedtouchpaddinghwwajmo.IconCompatParcelizer != executor) {
                        getextendedtouchpaddinghwwajmo.IconCompatParcelizer = executor;
                        getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer = mVar;
                        getextendedtouchpaddinghwwajmo.PlaybackStateCompatCustomAction.IconCompatParcelizer(executor, mVar);
                    }
                } else {
                    getextendedtouchpaddinghwwajmo.IconCompatParcelizer = executor;
                    getextendedtouchpaddinghwwajmo.RemoteActionCompatParcelizer = mVar;
                    getextendedtouchpaddinghwwajmo.PlaybackStateCompatCustomAction.IconCompatParcelizer(executor, mVar);
                }
                getpostalcode2.write(getextendedtouchpaddinghwwajmo);
                obj = getextendedtouchpaddinghwwajmo;
            }
            getExtendedTouchPaddinghWWAJMo getextendedtouchpaddinghwwajmo2 = (getExtendedTouchPaddinghWWAJMo) obj;
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(getextendedtouchpaddinghwwajmo2);
            boolean zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(accessisrendernodecompatiblecp);
            if (((i22 & 896) ^ 384) > 256) {
                int i25 = write + 43;
                serializer = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                if (getpostalcode2.IconCompatParcelizer(p0Var)) {
                    z2 = true;
                } else if ((i22 & 384) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if ((i22 & 384) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if ((z2 | zIconCompatParcelizer2 | zIconCompatParcelizer3) || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(getextendedtouchpaddinghwwajmo2, accessisrendernodecompatiblecp, p0Var, 28);
                getpostalcode2.write(objComponentActivity3);
            }
            getPhoneNumberNational.IconCompatParcelizer(getextendedtouchpaddinghwwajmo2, accessisrendernodecompatiblecp, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode2);
            getextendedtouchpaddinghwwajmo2.getClass();
            PrematureEndOfStreamVideoQuirk.write();
            CoroutineLiveData coroutineLiveData = getextendedtouchpaddinghwwajmo2.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            coroutineLiveData.getClass();
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7IconCompatParcelizer = DragAndDropNodeKtDragAndDropTargetModifierNode1.IconCompatParcelizer(coroutineLiveData, 0, getpostalcode2, 48);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode2.write(objComponentActivity4);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity4;
            boolean zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(getextendedtouchpaddinghwwajmo2);
            boolean zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(executor);
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (!zIconCompatParcelizer4 && !zIconCompatParcelizer5) {
                int i27 = serializer + 53;
                write = i27 % Fields.SpotShadowColor;
                if (i27 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1(getextendedtouchpaddinghwwajmo2, executor, populateViewStructure_androidKtpopulate7, null, 0);
                    getpostalcode2.write(objComponentActivity5);
                }
            } else {
                objComponentActivity5 = new RememberBarcodeScanControllerStateKt$rememberBarcodeScanControllerState$2$1(getextendedtouchpaddinghwwajmo2, executor, populateViewStructure_androidKtpopulate7, null, 0);
                getpostalcode2.write(objComponentActivity5);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, getextendedtouchpaddinghwwajmo2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity5);
            boolean zBooleanValue = ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue();
            Integer num2 = (Integer) populateViewStructure_androidKtpopulate7IconCompatParcelizer.getValue();
            boolean z7 = getpostalcode2.read(getextendedtouchpaddinghwwajmo2);
            boolean zWrite = getpostalcode2.write(zBooleanValue);
            boolean z8 = getpostalcode2.read(num2);
            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
            if (((zWrite | z7) || z8) || objComponentActivity6 == androidContentCaptureManager) {
                boolean zBooleanValue2 = ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue();
                Integer num3 = (Integer) populateViewStructure_androidKtpopulate7IconCompatParcelizer.getValue();
                z3 = false;
                getvisiblegie3tq8 = new getVisiblegIe3tQ8(getextendedtouchpaddinghwwajmo2, zBooleanValue2, num3 != null && num3.intValue() == 1, new getEllipsisgIe3tQ8(getextendedtouchpaddinghwwajmo2, 0));
                getpostalcode2.write(getvisiblegie3tq8);
            } else {
                getvisiblegie3tq8 = objComponentActivity6;
                z3 = false;
            }
            getVisiblegIe3tQ8 getvisiblegie3tq9 = (getVisiblegIe3tQ8) getvisiblegie3tq8;
            companion.getClass();
            FillElement fillElement = SizeKt.read;
            Modifier modifierThen = companion.then(fillElement);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), z3);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
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
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            read(getvisiblegie3tq9.IconCompatParcelizer, null, getpostalcode2, 0);
            boolean z9 = getvisiblegie3tq9.serializer;
            boolean z10 = getvisiblegie3tq9.write;
            getEllipsisgIe3tQ8 getellipsisgie3tq8 = getvisiblegie3tq9.RemoteActionCompatParcelizer;
            Modifier modifierThen2 = companion.then(fillElement);
            MultipleCodeScanTaskUiItem$CodeScanScreenUiItem$Companion multipleCodeScanTaskUiItem$CodeScanScreenUiItem$Companion = SlotTreeKtExternalSyntheticLambda0.Companion;
            int i28 = i13 << 6;
            getPostalCode getpostalcode4 = getpostalcode2;
            ScannerOverlayKt.read(slotTreeKtExternalSyntheticLambda0, r8lambda9sapdiqx6c5hcuvrgmuvyxekhj8, z9, z10, getellipsisgie3tq8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierThen2, num, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getpostalcode2, (i13 & 14) | 1572872 | (i13 & 112) | (458752 & i28) | (29360128 & (i13 << 3)) | (i28 & 1879048192), (i13 >> 24) & 14);
            getpostalcode4.IconCompatParcelizer(true);
            modifier2 = companion;
            getpostalcode3 = getpostalcode4;
        } else {
            getPostalCode getpostalcode5 = getpostalcode2;
            getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            getpostalcode3 = getpostalcode5;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdabm6Xd4G6qvXesbF9M1n8iztWq4c(slotTreeKtExternalSyntheticLambda0, r8lambda9sapdiqx6c5hcuvrgmuvyxekhj8, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, p0Var, modifier2, num, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, i);
        }
    }
}
