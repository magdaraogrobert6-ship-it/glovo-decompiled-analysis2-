package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayItem$Instruction;

/* JADX INFO: loaded from: classes3.dex */
public final class TypefaceRequestCache implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = write;
        int i4 = i3 + 31;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        InAppCameraOverlayItem$Instruction[] inAppCameraOverlayItem$InstructionArr = new InAppCameraOverlayItem$Instruction[i];
        int i6 = i3 + 21;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return inAppCameraOverlayItem$InstructionArr;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        InAppCameraOverlayItem$Instruction.Config configCreateFromParcel;
        int i = 2 % 2;
        parcel.getClass();
        int i2 = parcel.readInt();
        String string = parcel.readString();
        if (parcel.readInt() == 0) {
            int i3 = write + 45;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            configCreateFromParcel = null;
            if (i3 % 2 == 0) {
                throw null;
            }
        } else {
            configCreateFromParcel = InAppCameraOverlayItem$Instruction.Config.CREATOR.createFromParcel(parcel);
        }
        InAppCameraOverlayItem$Instruction inAppCameraOverlayItem$Instruction = new InAppCameraOverlayItem$Instruction(i2, string, configCreateFromParcel);
        int i4 = RemoteActionCompatParcelizer + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return inAppCameraOverlayItem$Instruction;
    }
}
