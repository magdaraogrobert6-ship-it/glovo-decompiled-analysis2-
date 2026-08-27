package o;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class CheckboxDefaults {
    public Parcel write;

    public final void read(byte b) {
        this.write.writeByte(b);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void serializer(long j) {
        byte b;
        long jM3866getTypeUIouoOA = androidx.compose.ui.unit.TextUnit.m3866getTypeUIouoOA(j);
        androidx.compose.ui.unit.TextUnitType.Companion companion = androidx.compose.ui.unit.TextUnitType.Companion;
        if (androidx.compose.ui.unit.TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3901getUnspecifiedUIouoOA())) {
            b = 0;
        } else if (androidx.compose.ui.unit.TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
            b = 1;
        } else if (androidx.compose.ui.unit.TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA())) {
            b = 2;
        } else {
            b = 0;
        }
        read(b);
        if (androidx.compose.ui.unit.TextUnitType.m3895equalsimpl0(androidx.compose.ui.unit.TextUnit.m3866getTypeUIouoOA(j), companion.m3901getUnspecifiedUIouoOA())) {
            return;
        }
        IconCompatParcelizer(androidx.compose.ui.unit.TextUnit.m3867getValueimpl(j));
    }

    public final void IconCompatParcelizer(float f) {
        this.write.writeFloat(f);
    }
}
