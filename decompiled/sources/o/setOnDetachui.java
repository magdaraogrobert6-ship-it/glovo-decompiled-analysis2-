package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class setOnDetachui extends setOnAttachui {
    public final byte[] RatingCompat;

    @Override // o.setOnAttachui
    public void serializer(int i, byte[] bArr) {
        System.arraycopy(this.RatingCompat, 0, bArr, 0, i);
    }

    public int write() {
        return 0;
    }

    @Override // o.setOnAttachui
    public byte IconCompatParcelizer(int i) {
        return this.RatingCompat[i];
    }

    @Override // o.setOnAttachui
    public int IconCompatParcelizer() {
        return this.RatingCompat.length;
    }

    @Override // o.setOnAttachui
    public byte RemoteActionCompatParcelizer(int i) {
        return this.RatingCompat[i];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r8lambdaIZz_yhFbmsc9dFp_Le0QsEa0ZM(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof setOnAttachui) && IconCompatParcelizer() == ((setOnAttachui) obj).IconCompatParcelizer()) {
            if (IconCompatParcelizer() == 0) {
                return true;
            }
            if (obj instanceof setOnDetachui) {
                setOnDetachui setondetachui = (setOnDetachui) obj;
                int i = this.RemoteActionCompatParcelizer;
                int i2 = setondetachui.RemoteActionCompatParcelizer;
                if (i == 0 || i2 == 0 || i == i2) {
                    int iIconCompatParcelizer = IconCompatParcelizer();
                    if (iIconCompatParcelizer <= setondetachui.IconCompatParcelizer()) {
                        if (iIconCompatParcelizer <= setondetachui.IconCompatParcelizer()) {
                            byte[] bArr = setondetachui.RatingCompat;
                            int iWrite = write();
                            int iWrite2 = write();
                            int iWrite3 = setondetachui.write();
                            while (iWrite2 < iWrite + iIconCompatParcelizer) {
                                if (this.RatingCompat[iWrite2] == bArr[iWrite3]) {
                                    iWrite2++;
                                    iWrite3++;
                                }
                            }
                            return true;
                        }
                        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(setondetachui.IconCompatParcelizer(), ff$$ExternalSyntheticOutline0.m(iIconCompatParcelizer, "Ran off end of other: 0, ", ", "));
                        return false;
                    }
                    FieldType$$ExternalSyntheticBUOutline0.RemoteActionCompatParcelizer(iIconCompatParcelizer, IconCompatParcelizer());
                    return false;
                }
            } else {
                return obj.equals(this);
            }
        }
        return false;
    }

    public setOnDetachui(byte[] bArr) {
        this.RemoteActionCompatParcelizer = 0;
        bArr.getClass();
        this.RatingCompat = bArr;
    }
}
