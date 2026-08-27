package com.roadrunner.delivery.accept.orderitems.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.accept.orderitems.api.OrderItemsNavigationUiModel;
import com.roadrunner.delivery.accept.orderitems.presentation.OrderItemsNavigationUiModelImpl;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.GraphemeClusterSegmentFinder;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RadioButton;
import o.accessgetReusableRectp;
import o.buildMapping;
import o.computeHorizontalScrollExtent;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.previousEndBoundary;
import o.previousStartBoundary;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OrderItemsNavigationKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b A[PHI: r9
  0x003b: PHI (r9v5 o.getPostalCode) = (r9v1 o.getPostalCode), (r9v6 o.getPostalCode) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r9
  0x0030: PHI (r9v2 o.getPostalCode) = (r9v1 o.getPostalCode), (r9v6 o.getPostalCode) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RemoteActionCompatParcelizer(OrderItemsNavigationUiModel orderItemsNavigationUiModel, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = read + 9;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            orderItemsNavigationUiModel.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1321940644);
            if ((i & 56) == 0) {
                if (getpostalcode.read(orderItemsNavigationUiModel)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            orderItemsNavigationUiModel.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1321940644);
            if ((i & 6) == 0) {
                if (getpostalcode.read(orderItemsNavigationUiModel)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true) ? 32 : 16;
        }
        int i6 = i3 | 384;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            int i7 = read + 47;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            modifier = Modifier.Companion;
            previousEndBoundary previousendboundary = (previousEndBoundary) ExtrasKt.write(((OrderItemsNavigationUiModelImpl) orderItemsNavigationUiModel).MediaSessionCompatQueueItem, getpostalcode, 0).getValue();
            if (previousendboundary instanceof previousStartBoundary) {
                getpostalcode.serializer(1378861337);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(previousendboundary instanceof GraphemeClusterSegmentFinder)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -925355841, false);
                }
                int i9 = RemoteActionCompatParcelizer + 59;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getpostalcode.serializer(1378964691);
                OrderItemsNavigation(i6 & 1008, getpostalcode, modifier, ((GraphemeClusterSegmentFinder) previousendboundary).write, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        Modifier modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 26, modifier2, (Object) orderItemsNavigationUiModel, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }

    public static final void OrderItemsNavigation(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1413546211);
        if ((i & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 27;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                i2 = (getpostalcode.read(str) ? 4 : 2) | i;
            } else {
                getpostalcode.read(str);
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i7 = RemoteActionCompatParcelizer + 7;
                read = i7 % Fields.SpotShadowColor;
                i4 = i7 % 2 != 0 ? 44 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i8 = read + 27;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                i3 = i8 % 2 == 0 ? 29299 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if ((i9 & 147) != 146) {
            z = true;
        } else {
            int i10 = RemoteActionCompatParcelizer + 15;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = false;
        }
        if (!(!getpostalcode.write(i9 & 1, z))) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                int i12 = read + 111;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode.ComponentActivity)) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                DividerKt.read(0.0f, 0, 5, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPopupTheme(), getpostalcode, null);
                Modifier modifierThen = PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, Dimensions.setTabContainer, 0.0f, 0.0f, 0.0f, 14).then(new RadioButton(companion.getStart()));
                modifierThen.getClass();
                TertiaryKt.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierThen, false, 0, null, null, null, getpostalcode, i9 & 126, 248);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 1);
        }
    }
}
