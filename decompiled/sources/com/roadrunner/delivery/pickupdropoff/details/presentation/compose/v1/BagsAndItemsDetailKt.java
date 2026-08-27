package com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Iterator;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.WrapPreviewlambda1;
import o.accessgetTextCentercp;
import o.buildMapping;
import o.currentTimeMillis;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.onKeyEventZmokQxo;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BagsAndItemsDetailKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void RemoteActionCompatParcelizer(boolean z, r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0 r8lambdamtsd8x0f0xutzn3oeie_s8mt0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        int i3 = 2 % 2;
        r8lambdamtsd8x0f0xutzn3oeie_s8mt0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1869600162);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? getpostalcode.read(r8lambdamtsd8x0f0xutzn3oeie_s8mt0) : getpostalcode.IconCompatParcelizer(r8lambdamtsd8x0f0xutzn3oeie_s8mt0) ? 32 : 16;
            int i4 = IconCompatParcelizer + 111;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if ((i2 & 19) != 18) {
            int i6 = serializer + 37;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i2 & 1, z2)) {
            AnimatedVisibilityKt.RemoteActionCompatParcelizer(z, null, onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, Alignment.Companion.getTop(), 13).serializer(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 1)), onKeyEventZmokQxo.serializer((accessgetTextCentercp) null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15)).read(onKeyEventZmokQxo.write(null, 3)), null, ExtrasKt.write(-1078280758, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(19, r8lambdamtsd8x0f0xutzn3oeie_s8mt0), getpostalcode), getpostalcode, (i2 & 14) | 200064, 18);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new currentTimeMillis(z, r8lambdamtsd8x0f0xutzn3oeie_s8mt0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    public static final void ProductItemsList(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 105;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(377450299);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) : getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i6 = serializer + 3;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i8 = serializer + 59;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dimensions.setActionBarVisibilityCallback);
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setMenu, 0.0f, 0.0f, 13);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(snapelevationIconCompatParcelizer, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i10 = IconCompatParcelizer + 15;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i11 = 39 / 0;
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i12 = IconCompatParcelizer + 91;
                    serializer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                } else {
                    getpostalcode.serializer(constructor);
                }
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i14 = IconCompatParcelizer + 91;
                    serializer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                }
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(897055482);
            Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
            while (it.hasNext()) {
                int i16 = serializer + 35;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                ProductItemKt.ProductItem((r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k) it.next(), getpostalcode, 0);
            }
            getpostalcode.IconCompatParcelizer(false);
            dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i2 >> 3) & 14));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 17, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, dragAndDropTargetModifierNode);
        }
    }

    public static final void ItemsSummary(WrapPreviewlambda1 wrapPreviewlambda1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(82412504);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode2.read(wrapPreviewlambda1) : getpostalcode2.IconCompatParcelizer(wrapPreviewlambda1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i4 & 19) != 18) {
            int i5 = serializer + 57;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i4 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), Dimensions.setActionBarVisibilityCallback, 0.0f, 0.0f, 0.0f, 14);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, Alignment.Companion.getTop(), getpostalcode2, 6);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i7 = serializer + 61;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode2.ComponentActivity;
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i8 = IconCompatParcelizer + 57;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String str = wrapPreviewlambda1.serializer;
            TextStyle textStyleMediaSessionCompatToken = performLayout.MediaSessionCompatToken();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setMenuPrepared(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatToken, getpostalcode2, 0, 0, 131066);
            String str2 = wrapPreviewlambda1.IconCompatParcelizer;
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            long menuPrepared = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setMenuPrepared();
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str2, null, menuPrepared, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 18, wrapPreviewlambda1, modifier2);
        }
    }
}
