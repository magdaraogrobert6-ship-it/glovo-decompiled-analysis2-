package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getLetterSpacingXSAIIZE {
    public static int write(ImageResources_androidKt imageResources_androidKt, boolean z) {
        int i = imageResources_androidKt.RemoteActionCompatParcelizer;
        int i2 = imageResources_androidKt.serializer;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = (byte[][]) imageResources_androidKt.read;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b2 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b2 == b) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b = b2;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }
}
