package com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1;

import androidx.compose.foundation.layout.Arrangement;
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
import java.util.Iterator;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.WrapPreview;
import o.accessgetFakeSavedStateRegistryOwnerp;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getStore;
import o.handleUrlOverridelambda1;
import o.r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ;
import o.r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E;
import o.toViewInfo;
import o.toViewInfoFactory;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OrderHeaderV1Kt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    public static final void OrderHeaderV1(r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ r8lambdayigkjx4opgvyddqvttr8slptylq, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Object obj;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(120581138);
        Object obj2 = null;
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer;
            int i6 = i5 + 77;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if ((i & 8) == 0) {
                int i8 = i5 + 77;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    getpostalcode.read(r8lambdayigkjx4opgvyddqvttr8slptylq);
                    obj2.hashCode();
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode.read(r8lambdayigkjx4opgvyddqvttr8slptylq);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdayigkjx4opgvyddqvttr8slptylq);
            }
            if (!zIconCompatParcelizer) {
                i3 = 2;
            } else {
                int i9 = IconCompatParcelizer + 121;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = read + 111;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i12 = i2 | 384;
        if (getpostalcode.write(i12 & 1, (i12 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = PaddingKt.write(companion, Dimensions.setActionBarVisibilityCallback);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
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
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            WrapPreview wrapPreview = r8lambdayigkjx4opgvyddqvttr8slptylq.MediaBrowserCompatMediaItem;
            if (wrapPreview == null) {
                getpostalcode.serializer(-680580423);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-680580422);
                toViewInfo.IconCompatParcelizer(wrapPreview, null, getpostalcode, 0);
                IconCompatParcelizer.IconCompatParcelizer(companion, Dimensions.getNestedScrollAxes, getpostalcode, false);
            }
            accessgetFakeSavedStateRegistryOwnerp accessgetfakesavedstateregistryownerp = r8lambdayigkjx4opgvyddqvttr8slptylq.serializer;
            if (accessgetfakesavedstateregistryownerp == null) {
                getpostalcode.serializer(-680399383);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-680399382);
                ExpandableButtonComponentV1Kt.ExpandableButtonComponentV1(accessgetfakesavedstateregistryownerp, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, getpostalcode, (i12 & 112) | 8);
                IconCompatParcelizer.IconCompatParcelizer(companion, Dimensions.getNestedScrollAxes, getpostalcode, false);
            }
            List list = r8lambdayigkjx4opgvyddqvttr8slptylq.read;
            if (list == null) {
                getpostalcode.serializer(-680123793);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-680123792);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    toViewInfoFactory.RemoteActionCompatParcelizer((r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E) it.next(), null, getpostalcode, 0);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.getNestedScrollAxes)});
                }
                getpostalcode.IconCompatParcelizer(false);
            }
            r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0 r8lambdamtsd8x0f0xutzn3oeie_s8mt0 = r8lambdayigkjx4opgvyddqvttr8slptylq.RemoteActionCompatParcelizer;
            if (r8lambdamtsd8x0f0xutzn3oeie_s8mt0 == null) {
                getpostalcode.serializer(-679946628);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-679946627);
                BagsAndItemsV1Kt.BagsAndItemsV1(r8lambdamtsd8x0f0xutzn3oeie_s8mt0, null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
            obj = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            obj = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 17, r8lambdayigkjx4opgvyddqvttr8slptylq, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, obj);
        }
    }
}
