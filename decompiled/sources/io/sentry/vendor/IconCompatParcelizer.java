package io.sentry.vendor;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IconCompatParcelizer {
    public static NotificationChannelGroup read(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannelGroup(str);
    }

    public static byte[] read(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        int i = (length / 3) * 4;
        int i2 = length % 3;
        if (i2 == 1) {
            i += 2;
        } else if (i2 == 2) {
            i += 3;
        }
        byte[] bArr3 = new byte[i];
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int i6 = i3 + 3;
            bArr2 = write.serializer;
            if (i6 > length) {
                break;
            }
            int i7 = (bArr[i3 + 2] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8);
            bArr3[i5] = bArr2[(i7 >> 18) & 63];
            bArr3[i5 + 1] = bArr2[(i7 >> 12) & 63];
            bArr3[i5 + 2] = bArr2[(i7 >> 6) & 63];
            bArr3[i5 + 3] = bArr2[i7 & 63];
            int i8 = i5 + 4;
            i4--;
            if (i4 == 0) {
                i5 += 5;
                bArr3[i8] = 10;
                i4 = 19;
            } else {
                i5 = i8;
            }
            i3 = i6;
        }
        if (i3 == length - 1) {
            int i9 = (bArr[i3] & 255) << 4;
            bArr3[i5] = bArr2[(i9 >> 6) & 63];
            bArr3[i5 + 1] = bArr2[i9 & 63];
            return bArr3;
        }
        if (i3 == length - 2) {
            int i10 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr3[i5] = bArr2[(i10 >> 12) & 63];
            bArr3[i5 + 1] = bArr2[(i10 >> 6) & 63];
            bArr3[i5 + 2] = bArr2[i10 & 63];
        }
        return bArr3;
    }

    public static String IconCompatParcelizer(byte[] bArr) {
        try {
            return new String(read(bArr), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            return null;
        }
    }
}
