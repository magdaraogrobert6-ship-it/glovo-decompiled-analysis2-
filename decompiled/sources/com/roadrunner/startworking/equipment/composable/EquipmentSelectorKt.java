package com.roadrunner.startworking.equipment.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.lambda316;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw;
import o.r8lambdatwlPMTrSrus3A7UmaCID8_1F1M;
import o.removeNodeAtDepth;
import o.snapElevation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EquipmentSelectorKt {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public static final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk serializer = removeNodeAtDepth.RemoteActionCompatParcelizer(SQLite.read(new lambda316("Car", "Car", null, true, true), new lambda316("Bike", "Bike", null, false, true), new lambda316("Horseback Carriage", "Horseback Carriage", null, false, true), new lambda316("Scooter", "Scooter", null, false, true), new lambda316("Boat", "Boat", null, false, true), new lambda316("A Pink Volkswagen with 5 doors and 4 wheels. It also makes a meep meep sound when you press the horn.", "a long title", null, false, true)));
    public static final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk IconCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(SQLite.read(new lambda316("Car", "Car", null, false, true), new lambda316("Bike", "Bike", null, false, true), new lambda316("Horseback Carriage", "Horseback Carriage", null, false, true), new lambda316("Scooter", "Scooter", null, false, true), new lambda316("Boat", "Boat", null, false, true), new lambda316("A Pink Volkswagen with 5 doors and 4 wheels. It also makes a meep meep sound when you press the horn.", "a long title", null, false, true)));

    static {
        int i = RemoteActionCompatParcelizer + 9;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final void EquipmentSelector(String str, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        str.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(674140849);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(str)) {
                int i7 = MediaSessionCompatQueueItem + 25;
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
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = read + 69;
            MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                throw null;
            }
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                i4 = Fields.RotationX;
            } else {
                int i10 = read + 9;
                MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i12 = read + 23;
                MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            int i14 = read + 81;
            MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
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
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            float f = Dimensions.setStackedBackground;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(f);
            getpostalcode = getpostalcode2;
            FlowLayoutKt.serializer(null, Arrangement.IconCompatParcelizer(f), snapelevationIconCompatParcelizer, null, 0, 0, ExtrasKt.write(281761932, new r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, str, 7), getpostalcode2), getpostalcode2, 1572864, 57);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdatwlPMTrSrus3A7UmaCID8_1F1M(str, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, i, 4);
        }
    }
}
