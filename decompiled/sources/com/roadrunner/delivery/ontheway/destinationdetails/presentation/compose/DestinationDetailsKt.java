package com.roadrunner.delivery.ontheway.destinationdetails.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesLinkUiModel;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesUiModel;
import com.roadrunner.delivery.ontheway.destinationdetails.api.DestinationDetailsUiModel;
import com.roadrunner.delivery.ontheway.destinationdetails.presentation.DestinationDetailsUiModelImpl;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.ontheway.address.DestinationAddressUiModel;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getTabletopm18o9QQ;
import o.handleUrlOverridelambda1;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DestinationDetailsKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    /* JADX WARN: Code duplicated, block: B:12:0x0054  */
    /* JADX WARN: Code duplicated, block: B:14:0x0057 A[PHI: r0
  0x0057: PHI (r0v12 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v14 o.getPostalCode) binds: [B:8:0x0049, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x004b A[PHI: r0
  0x004b: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v14 o.getPostalCode) binds: [B:8:0x0049, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void read(DestinationDetailsUiModel destinationDetailsUiModel, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = RemoteActionCompatParcelizer + 39;
        read = i7 % Fields.SpotShadowColor;
        boolean z = true;
        if (i7 % 2 == 0) {
            destinationDetailsUiModel.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.getClass();
            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(201680066);
            if ((i & 95) == 0) {
                if (!getpostalcode.read(destinationDetailsUiModel)) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            destinationDetailsUiModel.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.getClass();
            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(201680066);
            if ((i & 6) == 0) {
                if (!getpostalcode.read(destinationDetailsUiModel)) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i8 = read + 79;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                i5 = 32;
            } else {
                int i10 = read + 39;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 3 % 5;
                }
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdafbccdpyn0hhvaib8bd2sxm5rsds)) {
                int i12 = RemoteActionCompatParcelizer + 49;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2) ^ true ? Fields.RotationZ : Fields.CameraDistance;
        }
        if ((i & 24576) == 0) {
            i3 |= !(getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2) ^ true) ? Fields.Clip : 8192;
        }
        if ((i3 & 9363) != 9362) {
            int i14 = RemoteActionCompatParcelizer + 105;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            DestinationDetailsUiModelImpl destinationDetailsUiModelImpl = (DestinationDetailsUiModelImpl) destinationDetailsUiModel;
            DestinationDetailsContainer(removeNodeAtDepth.RemoteActionCompatParcelizer((Iterable) ExtrasKt.write(destinationDetailsUiModelImpl.MediaDescriptionCompat, getpostalcode, 0).getValue()), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2, ((Boolean) ExtrasKt.write(destinationDetailsUiModelImpl.MediaSessionCompatQueueItem, getpostalcode, 0).getValue()).booleanValue(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, null, getpostalcode, (i3 & 8176) | ((i3 << 3) & 458752));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM(destinationDetailsUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, i, 14);
            int i16 = read + 75;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                int i17 = 5 / 2;
            }
        }
    }

    public static final void DestinationDetailsContainer(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2, boolean z, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.getClass();
        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1854933361);
        if ((i & 6) == 0) {
            if (getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk)) {
                int i7 = RemoteActionCompatParcelizer + 39;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i9 = RemoteActionCompatParcelizer + 123;
                read = i9 % Fields.SpotShadowColor;
                i4 = i9 % 2 == 0 ? 50 : 32;
            } else {
                int i10 = RemoteActionCompatParcelizer + 61;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdafbccdpyn0hhvaib8bd2sxm5rsds) ^ true) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2)) {
                int i12 = RemoteActionCompatParcelizer + 97;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            int i14 = read + 5;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i2 |= getpostalcode.write(z) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2) ? Fields.RenderEffect : 65536;
        }
        int i16 = i2 | 1572864;
        if ((599187 & i16) != 599186) {
            int i17 = RemoteActionCompatParcelizer + 73;
            read = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i16 & 1, z2)) {
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
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
            if (z) {
                int i19 = read + 55;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                getpostalcode.serializer(-210929642);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(SizeKt.write(companion, 1.0f), Dimensions.setActionBarVisibilityCallback)});
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-210769155);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.serializer(-2085007884);
            for (Object obj : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                if (obj instanceof DestinationAddressUiModel) {
                    getpostalcode.serializer(475333025);
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(obj, getpostalcode, Integer.valueOf(i16 & 112));
                    getpostalcode.IconCompatParcelizer(false);
                } else if (obj instanceof DeliveryNotesUiModel) {
                    int i21 = RemoteActionCompatParcelizer + 125;
                    read = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    getpostalcode.serializer(475337053);
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke(obj, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, getpostalcode, Integer.valueOf(((i16 >> 12) & 112) | (i16 & 896)));
                    getpostalcode.IconCompatParcelizer(false);
                } else if (obj instanceof DeliveryNotesLinkUiModel) {
                    int i23 = read + 125;
                    RemoteActionCompatParcelizer = i23 % Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    getpostalcode.serializer(475342082);
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2.invoke(obj, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, getpostalcode, Integer.valueOf(((i16 >> 12) & 112) | ((i16 >> 3) & 896)));
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(1850890609);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getTabletopm18o9QQ(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2, z, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, modifier2, i);
        }
    }
}
