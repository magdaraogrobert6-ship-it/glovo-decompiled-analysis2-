package com.incognia.internal;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.nlp.network.OnlineLocationService;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import o.onMove;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class E6a {
    public final ICj BGx;

    public E6a(KWh kWh, ICj iCj) {
        this.BGx = iCj;
    }

    public final Map BGx(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        N4A n4aBGx = this.BGx.BGx();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) W4i.OJQ.MediaSessionCompatResultReceiverWrapper(), Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone((String) W4i.GVe.MediaSessionCompatResultReceiverWrapper()));
        String str = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        String str2 = n4aBGx.hIl;
        String strValueOf = String.valueOf(n4aBGx.hs);
        String str3 = n4aBGx.BGx;
        String str4 = n4aBGx.mbG;
        String str5 = n4aBGx.VV3;
        String strValueOf2 = String.valueOf(71002);
        String str6 = (String) W4i.SD.MediaSessionCompatResultReceiverWrapper();
        byte[] bArr4 = {118, 76, 71, 68, 86, 48, 107, 74, 114, 117, 106, 82, 80, 63, 48, 100, 86, 99, 85, 44, 108, 119, 72, 103, 118, 110, 49, 105, 88, 51, 97, 80};
        if (bArr.length == 0) {
            bArr2 = new byte[0];
        } else {
            bArr2 = new byte[32];
            int i = 2;
            while (true) {
                bArr2[i - 2] = bArr[bArr.length / i];
                if (i == 33) {
                    break;
                }
                i++;
            }
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr2.length + 32);
        System.arraycopy(bArr2, 0, bArrCopyOf, 32, bArr2.length);
        Arrays.fill(bArr4, (byte) 0);
        E2e e2e = new E2e(bArrCopyOf);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(strValueOf);
        sb.append(str3);
        sb.append(str5);
        String strM = ff$$ExternalSyntheticOutline0.m(sb, strValueOf2, str4);
        Lql lql = e2e.mbG;
        lql.getClass();
        lql.BGx(bArr.length, bArr);
        e2e.mbG.BGx(strM.getBytes(Charset.forName(str6)));
        byte[] bytes = strM.getBytes(Charset.forName(str6));
        if (bytes.length == 0) {
            bArr3 = new byte[0];
        } else {
            byte[] bArr5 = new byte[16];
            int i2 = 2;
            while (true) {
                bArr5[i2 - 2] = bytes[bytes.length / i2];
                if (i2 == 17) {
                    break;
                }
                i2++;
            }
            bArr3 = bArr5;
        }
        Lql lql2 = e2e.mbG;
        lql2.getClass();
        lql2.BGx(bArr3.length, bArr3);
        Lql lql3 = new Lql();
        byte[] bArrBGx = nQ.BGx(E2e.N, E2e.BGx(e2e.BGx));
        byte[] bArrBGx2 = e2e.mbG.BGx();
        int length = bArrBGx.length;
        int i3 = length + 32;
        byte[] bArr6 = new byte[i3];
        System.arraycopy(bArrBGx, 0, bArr6, 0, length);
        System.arraycopy(bArrBGx2, 0, bArr6, length, 32);
        lql3.BGx(i3, bArr6);
        return onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0((String) W4i.ck7.MediaSessionCompatResultReceiverWrapper(), yEy.HQ(3, lql3.BGx())), new onViewAttachedToWindowlambda0((String) W4i.UP3.MediaSessionCompatResultReceiverWrapper(), "5"), new onViewAttachedToWindowlambda0((String) W4i.Ub.MediaSessionCompatResultReceiverWrapper(), OnlineLocationService.SRC_DEFAULT), new onViewAttachedToWindowlambda0((String) W4i.TF.MediaSessionCompatResultReceiverWrapper(), str), new onViewAttachedToWindowlambda0((String) W4i.gDG.MediaSessionCompatResultReceiverWrapper(), str2), new onViewAttachedToWindowlambda0((String) W4i.KJ.MediaSessionCompatResultReceiverWrapper(), strValueOf), new onViewAttachedToWindowlambda0((String) W4i.db.MediaSessionCompatResultReceiverWrapper(), str3), new onViewAttachedToWindowlambda0((String) W4i.H1.MediaSessionCompatResultReceiverWrapper(), str5), new onViewAttachedToWindowlambda0((String) W4i.cm4.MediaSessionCompatResultReceiverWrapper(), strValueOf2), new onViewAttachedToWindowlambda0((String) W4i.HN2.MediaSessionCompatResultReceiverWrapper(), str4));
    }
}
