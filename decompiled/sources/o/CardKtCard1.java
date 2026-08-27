package o;

import android.os.Parcel;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class CardKtCard1 {
    public final Parcel RemoteActionCompatParcelizer;

    public final long RemoteActionCompatParcelizer() {
        long jM3899getEmUIouoOA;
        Parcel parcel = this.RemoteActionCompatParcelizer;
        byte b = parcel.readByte();
        if (b == 1) {
            jM3899getEmUIouoOA = androidx.compose.ui.unit.TextUnitType.Companion.m3900getSpUIouoOA();
        } else {
            jM3899getEmUIouoOA = b == 2 ? androidx.compose.ui.unit.TextUnitType.Companion.m3899getEmUIouoOA() : androidx.compose.ui.unit.TextUnitType.Companion.m3901getUnspecifiedUIouoOA();
        }
        return androidx.compose.ui.unit.TextUnitType.m3895equalsimpl0(jM3899getEmUIouoOA, androidx.compose.ui.unit.TextUnitType.Companion.m3901getUnspecifiedUIouoOA()) ? androidx.compose.ui.unit.TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : androidx.compose.ui.unit.TextUnitKt.m3879TextUnitanM5pPY(parcel.readFloat(), jM3899getEmUIouoOA);
    }

    public CardKtCard1(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.RemoteActionCompatParcelizer = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }
}
