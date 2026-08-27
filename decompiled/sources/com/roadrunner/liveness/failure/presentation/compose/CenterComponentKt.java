package com.roadrunner.liveness.failure.presentation.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.canReadPlayIds;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;
import o.stopIgnoring;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CenterComponentKt {
    private static int serializer = 1;
    private static int write;

    public static final void CenterComponent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1534691061);
        if ((i & 6) == 0) {
            int i6 = serializer + 93;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (getpostalcode2.read(R.drawable.img_medium_brand_id_verf_seflie_failed)) {
                int i8 = write + 119;
                serializer = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 == 0 ? 5 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (!getpostalcode2.read(str2)) {
                i3 = Fields.SpotShadowColor;
            } else {
                int i9 = write + 97;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = Fields.RotationX;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.read(str3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? 8192 : Fields.Clip;
        }
        int i11 = i2 | 196608;
        if (getpostalcode2.write(i11 & 1, (i11 & 74899) != 74898)) {
            int i12 = write + 37;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierThen = companion.then(SizeKt.read);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = write + 15;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z = getpostalcode2.ComponentActivity;
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_medium_brand_id_verf_seflie_failed, getpostalcode2, i11 & 14), "", null, null, null, 0.0f, null, getpostalcode2, 48 | Painter.$stable, 124);
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, f, 0.0f, 0.0f, 13);
            TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, modifierM74paddingqDBjuR0$default, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getWindowSystemUiVisibility(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode2, (i11 >> 3) & 14, 0, 131064);
            Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13);
            modifierM74paddingqDBjuR0$default2.getClass();
            TextKt.m131TextNvy7gAk(str2, modifierM74paddingqDBjuR0$default2, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, (i11 >> 6) & 14, 0, 130040);
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str3, canReadPlayIds.read(PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, f, 0.0f, 0.0f, 13), null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2, 63), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, (i11 >> 9) & 14, 0, 131064);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new stopIgnoring(i, str, str2, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, 3);
        }
    }
}
