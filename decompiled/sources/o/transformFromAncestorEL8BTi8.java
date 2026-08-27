package o;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class transformFromAncestorEL8BTi8 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ toParentPosition8S9VItkdefault read;

    public /* synthetic */ transformFromAncestorEL8BTi8(toParentPosition8S9VItkdefault toparentposition8s9vitkdefault, int i) {
        this.IconCompatParcelizer = i;
        this.read = toparentposition8s9vitkdefault;
    }

    public final void write(long j) {
        int i = this.IconCompatParcelizer;
        toParentPosition8S9VItkdefault toparentposition8s9vitkdefault = this.read;
        if (i != 0) {
            toparentposition8s9vitkdefault.write.RemoteActionCompatParcelizer(~j);
        } else {
            toparentposition8s9vitkdefault.write.RemoteActionCompatParcelizer(j);
        }
    }

    public final void serializer() {
        int i = this.IconCompatParcelizer;
        toParentPosition8S9VItkdefault toparentposition8s9vitkdefault = this.read;
        if (i != 0) {
            updateLayerParametersdefault updatelayerparametersdefault = toparentposition8s9vitkdefault.write;
            updatelayerparametersdefault.serializer((byte) -1);
            updatelayerparametersdefault.serializer((byte) -1);
        } else {
            updateLayerParametersdefault updatelayerparametersdefault2 = toparentposition8s9vitkdefault.write;
            updatelayerparametersdefault2.IconCompatParcelizer((byte) -1);
            updatelayerparametersdefault2.IconCompatParcelizer((byte) -1);
        }
    }

    public final void RemoteActionCompatParcelizer(double d) {
        int i = this.IconCompatParcelizer;
        toParentPosition8S9VItkdefault toparentposition8s9vitkdefault = this.read;
        if (i != 0) {
            updateLayerParametersdefault updatelayerparametersdefault = toparentposition8s9vitkdefault.write;
            long jDoubleToLongBits = Double.doubleToLongBits(d);
            long j = jDoubleToLongBits ^ (jDoubleToLongBits >= 0 ? Long.MIN_VALUE : -1L);
            int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j);
            RoundingMode roundingMode = RoundingMode.UP;
            int iSerializer = transformToAncestorEL8BTi8.serializer(64 - iNumberOfLeadingZeros, 8);
            updatelayerparametersdefault.write(iSerializer + 1);
            byte[] bArr = updatelayerparametersdefault.read;
            int i2 = updatelayerparametersdefault.write;
            int i3 = i2 + 1;
            updatelayerparametersdefault.write = i3;
            bArr[i2] = (byte) (~iSerializer);
            int i4 = i3 + iSerializer;
            while (true) {
                i4--;
                int i5 = updatelayerparametersdefault.write;
                if (i4 < i5) {
                    updatelayerparametersdefault.write = i5 + iSerializer;
                    return;
                } else {
                    updatelayerparametersdefault.read[i4] = (byte) (~(j & 255));
                    j >>>= 8;
                }
            }
        } else {
            updateLayerParametersdefault updatelayerparametersdefault2 = toparentposition8s9vitkdefault.write;
            long jDoubleToLongBits2 = Double.doubleToLongBits(d);
            long j2 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >= 0 ? Long.MIN_VALUE : -1L);
            int iNumberOfLeadingZeros2 = Long.numberOfLeadingZeros(j2);
            RoundingMode roundingMode2 = RoundingMode.UP;
            int iSerializer2 = transformToAncestorEL8BTi8.serializer(64 - iNumberOfLeadingZeros2, 8);
            updatelayerparametersdefault2.write(iSerializer2 + 1);
            byte[] bArr2 = updatelayerparametersdefault2.read;
            int i6 = updatelayerparametersdefault2.write;
            int i7 = i6 + 1;
            updatelayerparametersdefault2.write = i7;
            bArr2[i6] = (byte) iSerializer2;
            int i8 = i7 + iSerializer2;
            while (true) {
                i8--;
                int i9 = updatelayerparametersdefault2.write;
                if (i8 < i9) {
                    updatelayerparametersdefault2.write = i9 + iSerializer2;
                    return;
                } else {
                    updatelayerparametersdefault2.read[i8] = (byte) (j2 & 255);
                    j2 >>>= 8;
                }
            }
        }
    }

    public final void write(String str) {
        int i = this.IconCompatParcelizer;
        toParentPosition8S9VItkdefault toparentposition8s9vitkdefault = this.read;
        if (i != 0) {
            updateLayerParametersdefault updatelayerparametersdefault = toparentposition8s9vitkdefault.write;
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                char cCharAt = str.charAt(i2);
                if (cCharAt < 128) {
                    updatelayerparametersdefault.read((byte) cCharAt);
                } else if (cCharAt < 2048) {
                    updatelayerparametersdefault.read((byte) ((cCharAt >>> 6) | 960));
                    updatelayerparametersdefault.read((byte) ((cCharAt & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                } else if (cCharAt < 55296 || 57343 < cCharAt) {
                    updatelayerparametersdefault.read((byte) ((cCharAt >>> '\f') | 480));
                    updatelayerparametersdefault.read((byte) (((cCharAt >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                    updatelayerparametersdefault.read((byte) ((cCharAt & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                } else {
                    int iCodePointAt = Character.codePointAt(str, i2);
                    i2++;
                    updatelayerparametersdefault.read((byte) ((iCodePointAt >>> 18) | 240));
                    updatelayerparametersdefault.read((byte) (((iCodePointAt >>> 12) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                    updatelayerparametersdefault.read((byte) (((iCodePointAt >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                    updatelayerparametersdefault.read((byte) ((iCodePointAt & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                }
                i2++;
            }
            updatelayerparametersdefault.serializer((byte) 0);
            updatelayerparametersdefault.serializer((byte) 1);
            return;
        }
        updateLayerParametersdefault updatelayerparametersdefault2 = toparentposition8s9vitkdefault.write;
        int length2 = str.length();
        int i3 = 0;
        while (i3 < length2) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 128) {
                updatelayerparametersdefault2.write((byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                updatelayerparametersdefault2.write((byte) ((cCharAt2 >>> 6) | 960));
                updatelayerparametersdefault2.write((byte) ((cCharAt2 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
            } else if (cCharAt2 < 55296 || 57343 < cCharAt2) {
                updatelayerparametersdefault2.write((byte) ((cCharAt2 >>> '\f') | 480));
                updatelayerparametersdefault2.write((byte) (((cCharAt2 >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                updatelayerparametersdefault2.write((byte) ((cCharAt2 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
            } else {
                int iCodePointAt2 = Character.codePointAt(str, i3);
                i3++;
                updatelayerparametersdefault2.write((byte) ((iCodePointAt2 >>> 18) | 240));
                updatelayerparametersdefault2.write((byte) (((iCodePointAt2 >>> 12) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                updatelayerparametersdefault2.write((byte) (((iCodePointAt2 >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                updatelayerparametersdefault2.write((byte) ((iCodePointAt2 & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
            }
            i3++;
        }
        updatelayerparametersdefault2.IconCompatParcelizer((byte) 0);
        updatelayerparametersdefault2.IconCompatParcelizer((byte) 1);
    }
}
