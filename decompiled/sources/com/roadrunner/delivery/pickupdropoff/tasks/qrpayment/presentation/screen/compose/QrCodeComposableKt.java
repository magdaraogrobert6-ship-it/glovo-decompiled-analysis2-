package com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.perseus.RemoteFunctionKt$onRemoteFunction$1;
import com.google.zxing.WriterException;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AdjustBridgeInstance17;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DpRect;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.buildMapping;
import o.copya9UjIt4default;
import o.getAndroidRenderEffect;
import o.getBirthDateFull;
import o.getBottomD9Ej5fMannotations;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getZeroRKDOV3M;
import o.handleUrlOverridelambda1;
import o.onViewAttachedToWindow;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QrCodeComposableKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    /* JADX INFO: renamed from: QrCodeComposable-EUb7tLY, reason: not valid java name */
    public static final void m4947QrCodeComposableEUb7tLY(String str, float f, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-570668023);
        if ((i & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 117;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.serializer(f)) {
                int i8 = RemoteActionCompatParcelizer + 75;
                read = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 != 0 ? 123 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i9 = RemoteActionCompatParcelizer + 41;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode2.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            int i11 = RemoteActionCompatParcelizer + 37;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i13 = read + 95;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                i3 = i13 % 2 == 0 ? 16763 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        Object obj = null;
        if ((i & 24576) == 0) {
            int i14 = RemoteActionCompatParcelizer + 85;
            read = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.Clip : 8192;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 9363) != 9362)) {
            int iMo42roundToPx0680j_4 = ((Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo42roundToPx0680j_4(f);
            if (((i2 & 14) ^ 6) > 4) {
                int i15 = RemoteActionCompatParcelizer + 95;
                read = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    getpostalcode2.read(str);
                    obj.hashCode();
                    throw null;
                }
                if (getpostalcode2.read(str)) {
                    z = true;
                } else if ((i2 & 6) == 4) {
                    z = true;
                } else {
                    z = false;
                }
            } else if ((i2 & 6) == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = getpostalcode2.read(iMo42roundToPx0680j_4);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z | z3) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new RemoteFunctionKt$onRemoteFunction$1(iMo42roundToPx0680j_4, str, (ShortNewsContentCardView) null);
                getpostalcode2.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(DpRect.RemoteActionCompatParcelizer, str, Integer.valueOf(iMo42roundToPx0680j_4), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity, getpostalcode2, (((i2 & 126) << 3) & 112) | 6);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = CompositionKt.serializer(new getAndroidRenderEffect(populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer, 6));
                getpostalcode2.write(objComponentActivity2);
            }
            onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) objComponentActivity2;
            Boolean bool = (Boolean) onviewattachedtowindow.getValue();
            bool.getClass();
            boolean z4 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (z4 || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new SwitcherUiModelImpl$1.AnonymousClass1(onviewattachedtowindow, populateViewStructure_androidKtpopulate7Serializer, null, 27);
                getpostalcode2.write(objComponentActivity3);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, bool, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3);
            Modifier modifierClip = ClipKt.clip(SizeKt.m83size3ABfNKs(modifier, f), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setMenu));
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierClip);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i16 = read + 119;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    getpostalcode2.serializer(constructor);
                    throw null;
                }
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            copya9UjIt4default copya9ujit4default = (copya9UjIt4default) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue();
            boolean z5 = copya9ujit4default instanceof getBottomD9Ej5fMannotations;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
            if (z5) {
                getpostalcode2.serializer(-2128935444);
                z2 = true;
                getpostalcode = getpostalcode2;
                ImageKt.Image(new BitmapPainter(((getBottomD9Ej5fMannotations) copya9ujit4default).write, 0L, 0L, 6, null), "QR Code", boxScopeInstance.matchParentSize(Modifier.Companion), null, null, 0.0f, null, getpostalcode, BitmapPainter.$stable | 48, 120);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode2;
                z2 = true;
                if (copya9ujit4default instanceof DpRect) {
                    int i17 = read + 57;
                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    getpostalcode.serializer(-2128663791);
                    Object[] objArr = {getpostalcode, BackgroundKt.m20backgroundbw27NRU(boxScopeInstance.matchParentSize(Modifier.Companion), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowIcon(), RectangleShapeKt.getRectangleShape())};
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (!(copya9ujit4default instanceof getZeroRKDOV3M)) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1177055851, false);
                    }
                    getpostalcode.serializer(-2128426331);
                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                    WriterException writerException = ((getZeroRKDOV3M) copya9ujit4default).read;
                    forest.write(writerException);
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(writerException.getMessage());
                    }
                    Object[] objArr2 = {getpostalcode, BackgroundKt.m20backgroundbw27NRU(boxScopeInstance.matchParentSize(Modifier.Companion), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowIcon(), RectangleShapeKt.getRectangleShape())};
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
            getpostalcode.IconCompatParcelizer(z2);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AdjustBridgeInstance17(str, f, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i);
        }
    }
}
