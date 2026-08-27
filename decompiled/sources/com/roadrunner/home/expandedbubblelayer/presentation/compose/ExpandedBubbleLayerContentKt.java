package com.roadrunner.home.expandedbubblelayer.presentation.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.IntPair;
import com.huawei.hms.location.LocationRequest;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.expandedbubblelayer.presentation.ExpandedBubbleUiModelImpl;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.forEachGesturableIntersection;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getInternalPaintui_graphics;
import o.getPostalCode;
import o.onKeyEventZmokQxo;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;
import o.setSharedElementEnterTransition;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExpandedBubbleLayerContentKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    public static final void ExpandedBubbleLayerContent(ExpandedBubbleUiModelImpl expandedBubbleUiModelImpl, setSharedElementEnterTransition setsharedelemententertransition, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        expandedBubbleUiModelImpl.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1928223187);
        if ((i & 6) == 0) {
            int i5 = serializer + 121;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(expandedBubbleUiModelImpl);
                throw null;
            }
            i2 = i | (getpostalcode.IconCompatParcelizer(expandedBubbleUiModelImpl) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = IconCompatParcelizer + 73;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (getpostalcode.IconCompatParcelizer(setsharedelemententertransition)) {
                i3 = 32;
            } else {
                int i8 = serializer + 65;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        int i10 = i2 | 384;
        if ((i10 & 147) != 146) {
            int i11 = IconCompatParcelizer + 123;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dp.m3673constructorimpl(IntPair.RemoteActionCompatParcelizer(getpostalcode) + Dimensions.setPrimaryBackground), 0.0f, 0.0f, 13);
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i12 = IconCompatParcelizer + 11;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i14 = IconCompatParcelizer + 19;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            AnimatedVisibilityKt.serializer(((Boolean) ExtrasKt.write(expandedBubbleUiModelImpl.read, getpostalcode, 0).getValue()).booleanValue(), null, onKeyEventZmokQxo.write((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(LocationRequest.PRIORITY_INDOOR), 0, null, 6}), companion2.getTopCenter(), 12), onKeyEventZmokQxo.IconCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(LocationRequest.PRIORITY_INDOOR), 0, null, 6}), companion2.getTopCenter(), 12), null, ExtrasKt.write(-2049374651, new forEachGesturableIntersection(setsharedelemententertransition, 4, expandedBubbleUiModelImpl), getpostalcode), getpostalcode, 1600518, 18);
            getpostalcode.IconCompatParcelizer(true);
            int i16 = serializer + 73;
            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getInternalPaintui_graphics(i, 7, expandedBubbleUiModelImpl, setsharedelemententertransition, modifier2);
        }
    }
}
