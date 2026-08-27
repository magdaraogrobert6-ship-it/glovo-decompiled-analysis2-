package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayItem$Instruction;

/* JADX INFO: loaded from: classes3.dex */
public final class getResourceLoaderCacheKey implements Parcelable.Creator {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 103;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            InAppCameraOverlayItem$Instruction.Config[] configArr = new InAppCameraOverlayItem$Instruction.Config[i];
            obj.hashCode();
            throw null;
        }
        InAppCameraOverlayItem$Instruction.Config[] configArr2 = new InAppCameraOverlayItem$Instruction.Config[i];
        int i5 = i4 + 89;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return configArr2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        InAppCameraOverlayItem$Instruction.Config.write writeVarValueOf;
        int i = 2 % 2;
        int i2 = read + 95;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            parcel.getClass();
            int i3 = 95 / 0;
            if (parcel.readInt() == 0) {
                writeVarValueOf = null;
            } else {
                writeVarValueOf = InAppCameraOverlayItem$Instruction.Config.write.valueOf(parcel.readString());
                int i4 = IconCompatParcelizer + 117;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } else {
            parcel.getClass();
            if (parcel.readInt() == 0) {
                writeVarValueOf = null;
            } else {
                writeVarValueOf = InAppCameraOverlayItem$Instruction.Config.write.valueOf(parcel.readString());
                int i6 = IconCompatParcelizer + 117;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        InAppCameraOverlayItem$Instruction.Config config = new InAppCameraOverlayItem$Instruction.Config(writeVarValueOf);
        int i8 = read + 39;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return config;
    }
}
