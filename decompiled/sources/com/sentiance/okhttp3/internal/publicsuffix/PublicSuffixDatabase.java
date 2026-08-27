package com.sentiance.okhttp3.internal.publicsuffix;

import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import o.getFallbackConfigKey;
import o.getResourceIdentifier;
import o.isPushDeepLinkBackStackActivityEnabled;
import o.isSdkAuthenticationEnabled;
import o.r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08;
import o.readResourceValuelambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    public byte[] MediaBrowserCompatMediaItem;
    public byte[] MediaMetadataCompat;
    public static final byte[] read = {42};
    public static final String[] write = new String[0];
    public static final String[] serializer = {"*"};
    public static final PublicSuffixDatabase IconCompatParcelizer = new PublicSuffixDatabase();
    public final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);
    public final CountDownLatch RatingCompat = new CountDownLatch(1);

    public static String read(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.MediaMetadataCompat);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public final void serializer() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = getResourceIdentifier.read;
        readResourceValuelambda1 readresourcevaluelambda1 = new readResourceValuelambda1(new getFallbackConfigKey(new isSdkAuthenticationEnabled(new isPushDeepLinkBackStackActivityEnabled(), resourceAsStream)));
        try {
            byte[] bArr = new byte[readresourcevaluelambda1.ParcelableVolumeInfo()];
            readresourcevaluelambda1.IconCompatParcelizer(bArr);
            byte[] bArr2 = new byte[readresourcevaluelambda1.ParcelableVolumeInfo()];
            readresourcevaluelambda1.IconCompatParcelizer(bArr2);
            r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(readresourcevaluelambda1);
            synchronized (this) {
                this.MediaBrowserCompatMediaItem = bArr;
                this.MediaMetadataCompat = bArr2;
            }
            this.RatingCompat.countDown();
        } catch (Throwable th) {
            r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(readresourcevaluelambda1);
            throw th;
        }
    }
}
