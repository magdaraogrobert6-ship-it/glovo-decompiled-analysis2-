package com.incognia.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mnC {
    public static DU6 BGx(byte[] bArr) throws IOException {
        Tl tl = new Tl(new ByteArrayInputStream(bArr));
        Long lValueOf = 0L;
        Long lValueOf2 = null;
        Long lValueOf3 = null;
        Long lValueOf4 = null;
        Long lValueOf5 = null;
        String strMbG = null;
        String strMbG2 = null;
        String strMbG3 = null;
        while (tl.BGx()) {
            Yc ycMbG = tl.mbG();
            switch (ycMbG.BGx) {
                case 1:
                    lValueOf = Long.valueOf(ycMbG.BGx());
                    break;
                case 2:
                    lValueOf2 = Long.valueOf(ycMbG.BGx());
                    break;
                case 3:
                    lValueOf3 = Long.valueOf(ycMbG.BGx());
                    break;
                case 4:
                    strMbG = ycMbG.mbG();
                    break;
                case 5:
                    lValueOf4 = Long.valueOf(ycMbG.BGx());
                    break;
                case 6:
                    strMbG2 = ycMbG.mbG();
                    break;
                case 7:
                    lValueOf5 = Long.valueOf(ycMbG.BGx());
                    break;
                case 8:
                    strMbG3 = ycMbG.mbG();
                    break;
            }
        }
        return new DU6(lValueOf, lValueOf2, lValueOf3, strMbG, lValueOf4, strMbG2, lValueOf5, strMbG3);
    }
}
