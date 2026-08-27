package com.roadrunner.delivery.stacked.delivery.details.ui.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.pickupdropoff.api.PickupDropOffSingleDeliveryUiModel;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getUnspecifiedUIouoOA;
import o.internalPathIteratorPeek;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StackedDeliveryDetailsContentKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    public static final void IconCompatParcelizer(getUnspecifiedUIouoOA getunspecifieduiouooa, SignInDataStore signInDataStore, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-405890381);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(getunspecifieduiouooa) : getpostalcode.IconCompatParcelizer(getunspecifieduiouooa)) {
                int i6 = serializer + 25;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(signInDataStore)) {
                int i8 = serializer + 13;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i10 = IconCompatParcelizer;
            int i11 = i10 + 81;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            int i13 = i10 + 105;
            serializer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                int i14 = 3 % 2;
            }
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                signInDataStore.getClass();
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(8, signInDataStore), true, -944448581);
                getpostalcode.write(dragAndDropTargetModifierNode);
                objComponentActivity = dragAndDropTargetModifierNode;
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity;
            PickupDropOffSingleDeliveryUiModel pickupDropOffSingleDeliveryUiModel = getunspecifieduiouooa.RemoteActionCompatParcelizer;
            if (pickupDropOffSingleDeliveryUiModel != null) {
                getpostalcode.serializer(781380400);
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke(pickupDropOffSingleDeliveryUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, Integer.valueOf(((i2 >> 3) & 112) | 384));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(781383863);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 3, getunspecifieduiouooa, signInDataStore, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    public static final void StackedDeliveryDetailsContent(getUnspecifiedUIouoOA getunspecifieduiouooa, SignInDataStore signInDataStore, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        getunspecifieduiouooa.getClass();
        signInDataStore.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-506405375);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(getunspecifieduiouooa);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getunspecifieduiouooa);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(signInDataStore) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i4 = Fields.SpotShadowColor;
            } else {
                int i6 = IconCompatParcelizer + 43;
                serializer = i6 % Fields.SpotShadowColor;
                i4 = i6 % 2 != 0 ? 4824 : Fields.RotationX;
            }
            i2 |= i4;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i7 = IconCompatParcelizer + 105;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                    int i8 = IconCompatParcelizer + 45;
                    serializer = i8 % Fields.SpotShadowColor;
                    i3 = i8 % 2 != 0 ? 17738 : Fields.CameraDistance;
                } else {
                    i3 = Fields.RotationZ;
                }
                i2 |= i3;
                int i9 = serializer + 93;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
                obj.hashCode();
                throw null;
            }
        }
        int i11 = i2 | 24576;
        if ((i11 & 9363) != 9362) {
            int i12 = serializer + 105;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            modifier2 = Modifier.Companion;
            Modifier modifierSerializer = SizeKt.serializer(SizeKt.write(AnimationModifierKt.write(modifier2, DelayKt.IconCompatParcelizer(0.75f, 200.0f, 4, (Object) null), 2), 1.0f), 1.0f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i13 = serializer + 105;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode.ComponentActivity)) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            StackedDeliveryDetailsHeaderKt.StackedDeliveryDetailsHeader((i11 >> 6) & 14, getpostalcode, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(modifier2, PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode.ComponentActivity)) {
                int i15 = serializer + 47;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.serializer(constructor2);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            IconCompatParcelizer(getunspecifieduiouooa, signInDataStore, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, (i11 & 126) | ((i11 >> 3) & 896));
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) getunspecifieduiouooa, (Object) signInDataStore, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifier2, i, 24);
        }
    }
}
