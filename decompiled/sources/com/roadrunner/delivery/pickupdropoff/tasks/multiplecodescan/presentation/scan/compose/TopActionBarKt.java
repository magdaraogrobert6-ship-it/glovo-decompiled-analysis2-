package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.TopActionBarKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.CircularProgressIndicatorTokens;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextFieldDefaults;
import o.buildMapping;
import o.createFromParcel;
import o.equalEnum;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getEllipsisgIe3tQ8;
import o.getHandleruiannotations;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getUnspecifiedD9Ej5fMannotations;
import o.handleUrlOverridelambda1;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TopActionBarKt {
    private static int read = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:94:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [o.getBirthDateFull] */
    /* JADX WARN: Type inference failed for: r14v2, types: [o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, o.getBirthDateFull, o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [int] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r21v3, types: [o.getBirthDateFull] */
    /* JADX WARN: Type inference failed for: r22v1, types: [o.getBirthDateFull] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v22 */
    public static final void TopActionBar(final boolean z, final boolean z2, final getEllipsisgIe3tQ8 getellipsisgie3tq8, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final int i, Modifier modifier, final Integer num, final String str, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, final int i2) {
        int i3;
        final Modifier modifier2;
        ?? r14;
        boolean z3;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        Modifier.Companion companion;
        ?? r15;
        ?? r6;
        float f;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1028995513);
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode.write(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.write(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(getellipsisgie3tq8) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i7 = read + 35;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = Fields.CameraDistance;
            } else {
                i5 = Fields.RotationZ;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            int i9 = write + 19;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 25 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i4 = Fields.Clip;
                } else {
                    i4 = 8192;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i2 & 196608) == 0) {
            i3 |= getpostalcode.read(i) ? Fields.RenderEffect : 65536;
        }
        int i11 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i11 |= getpostalcode.read(num) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i11 |= getpostalcode.read(str) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i11 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 536870912 : 268435456;
        }
        int i12 = i11;
        if (getpostalcode.write(i12 & 1, (i12 & 306783379) != 306783378)) {
            Modifier.Companion companion2 = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            if ((i12 & 234881024) == 67108864) {
                int i13 = read + 97;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = (i12 & 29360128) != 8388608;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!z3 && !(!z4)) {
                int i15 = write + 101;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate8;
                    companion = companion2;
                    getPostalCode getpostalcode2 = getpostalcode;
                    objComponentActivity2 = new NafathTimerDataStore$set$2(str, num, populateViewStructure_androidKtpopulate7, null, 3);
                    getpostalcode2.write(objComponentActivity2);
                    r15 = getpostalcode2;
                } else {
                    populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate8;
                    companion = companion2;
                    r15 = getpostalcode;
                }
            } else {
                populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate8;
                companion = companion2;
                getPostalCode getpostalcode3 = getpostalcode;
                objComponentActivity2 = new NafathTimerDataStore$set$2(str, num, populateViewStructure_androidKtpopulate7, null, 3);
                getpostalcode3.write(objComponentActivity2);
                r15 = getpostalcode3;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer((getBirthDateFull) r15, str, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
            Modifier.Companion companion3 = companion;
            Modifier modifierWrite = SizeKt.write(companion3, 1.0f);
            float f2 = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifierWrite, f2, 0.0f, 2);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), r15, 48);
            int iHashCode = Long.hashCode(r15.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = r15.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(r15, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            if (r15.read == null) {
                SentryUUID.write();
                throw null;
            }
            r15.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (r15.ComponentActivity) {
                int i17 = write + 87;
                read = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    r15.serializer(constructor);
                    r6 = 0;
                    int i18 = 19 / 0;
                } else {
                    r6 = 0;
                    r15.serializer(constructor);
                }
            } else {
                r6 = 0;
                r15.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, r15, supportingtextpaddinga9ujit4material3defaultSerializer, r15, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(r15, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, (getPostalCode) r15, Integer.valueOf(iHashCode), (getPostalCode) r15));
            int i19 = z2 ? R.drawable.ic_bolt : R.drawable.ic_bolt_off;
            if (z) {
                r15.serializer(-204544355);
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(i19, r15, r6), "Flash toggle", ClickableKt.RemoteActionCompatParcelizer(SizeKt.m83size3ABfNKs(companion3, Dimensions.removeOnMultiWindowModeChangedListener), r6, null, getellipsisgie3tq8, 15), ((buildMapping) r15.write(performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), (getBirthDateFull) r15, Painter.$stable | 48, 0);
                r15.IconCompatParcelizer(r6);
            } else {
                r15.serializer(-204187328);
                Object objComponentActivity3 = r15.ComponentActivity();
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new ScrollExtensionsKt$stopScroll$2(2, 2, null);
                    r15.write(objComponentActivity3);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer((getBirthDateFull) r15, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3);
                r15.IconCompatParcelizer(r6);
            }
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{r15, companion3.then(new show(1.0f, true))});
            ?? r18 = (num == null || num.intValue() < 1 || i <= 1) ? r6 : 1;
            ?? IntValue = num != null ? num.intValue() : r6;
            ?? r20 = (((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue() && r18 != 0) ? 1 : r6;
            float f3 = Dimensions.setCustomView;
            Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(companion3, f3);
            if (r18 != 0) {
                int i20 = write + 73;
                read = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            Modifier modifierM890graphicsLayer_6ThJ44$default = GraphicsLayerModifierKt.m890graphicsLayer_6ThJ44$default(modifierM75height3ABfNKs, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524283, null);
            ?? r7 = (i12 & 1879048192) == 536870912 ? 1 : r6;
            Object objComponentActivity4 = r15.ComponentActivity();
            if (r7 != 0 || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new GestureNodeKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 9);
                r15.write(objComponentActivity4);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM890graphicsLayer_6ThJ44$default, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4);
            Object objComponentActivity5 = r15.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 12);
                r15.write(objComponentActivity5);
            }
            getUnspecifiedD9Ej5fMannotations.IconCompatParcelizer(IntValue, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r18, modifierOnGloballyPositioned, r20, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, r15, ((i12 >> 6) & 112) | 196608);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{r15, SizeKt.m86width3ABfNKs(companion3, f2)});
            equalEnum.IconCompatParcelizer(R.drawable.ic_x, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, companion3, false, null, f3, f3, r15, ((i12 >> 9) & 112) | 384, 24);
            r15.IconCompatParcelizer(true);
            modifier2 = companion3;
            r14 = r15;
        } else {
            getPostalCode getpostalcode4 = getpostalcode;
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            r14 = getpostalcode4;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = r14.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.isFinite0680j_4
                private static int MediaSessionCompatResultReceiverWrapper = 0;
                private static int PlaybackStateCompatCustomAction = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i22 = 2 % 2;
                    int i23 = MediaSessionCompatResultReceiverWrapper + 5;
                    PlaybackStateCompatCustomAction = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1);
                    TopActionBarKt.TopActionBar(z, z2, getellipsisgie3tq8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, i, modifier2, num, str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i25 = PlaybackStateCompatCustomAction + 87;
                    MediaSessionCompatResultReceiverWrapper = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i26 = i25 % 2;
                    return createfromparcel;
                }
            };
        }
    }
}
