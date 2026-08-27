package com.sentiance.okio;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;
import java.util.Arrays;
import o.isInAppMessageAccessibilityExclusiveModeEnabled;
import o.r8lambdaBEyrNr8p6809BwlBoRO_sTaNs;
import o.resetCachelambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class SegmentedByteString extends ByteString {
    public final transient byte[][] IconCompatParcelizer;
    public final transient int[] MediaMetadataCompat;

    public SegmentedByteString(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, int i) {
        super(null);
        isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans.serializer, 0L, i);
        resetCachelambda0 resetcachelambda0 = r8lambdabeyrnr8p6809bwlboro_stans.read;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = resetcachelambda0.read;
            int i6 = resetcachelambda0.IconCompatParcelizer;
            if (i5 == i6) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "s.limit == s.pos");
                throw null;
            }
            i3 += i5 - i6;
            i4++;
            resetcachelambda0 = resetcachelambda0.RatingCompat;
        }
        this.IconCompatParcelizer = new byte[i4][];
        this.MediaMetadataCompat = new int[i4 * 2];
        resetCachelambda0 resetcachelambda1 = r8lambdabeyrnr8p6809bwlboro_stans.read;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.IconCompatParcelizer;
            bArr[i7] = resetcachelambda1.serializer;
            int i8 = resetcachelambda1.read;
            int i9 = resetcachelambda1.IconCompatParcelizer;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.MediaMetadataCompat;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            resetcachelambda1.RemoteActionCompatParcelizer = true;
            i7++;
            resetcachelambda1 = resetcachelambda1.RatingCompat;
        }
    }

    private Object writeReplace() {
        return MediaDescriptionCompat();
    }

    @Override // com.sentiance.okio.ByteString
    public final String IconCompatParcelizer() {
        throw null;
    }

    public final int IconCompatParcelizer(int i) {
        int iBinarySearch = Arrays.binarySearch(this.MediaMetadataCompat, 0, this.IconCompatParcelizer.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.sentiance.okio.ByteString
    public final byte[] MediaBrowserCompatMediaItem() {
        byte[][] bArr = this.IconCompatParcelizer;
        int length = bArr.length;
        int[] iArr = this.MediaMetadataCompat;
        byte[] bArr2 = new byte[iArr[length - 1]];
        int length2 = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            int i3 = iArr[length2 + i];
            int i4 = iArr[i];
            System.arraycopy(bArr[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public final ByteString MediaDescriptionCompat() {
        return new ByteString(MediaBrowserCompatMediaItem());
    }

    @Override // com.sentiance.okio.ByteString
    public final int write() {
        return this.MediaMetadataCompat[this.IconCompatParcelizer.length - 1];
    }

    @Override // com.sentiance.okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        return byteString.write() == write() && IconCompatParcelizer(byteString, write());
    }

    @Override // com.sentiance.okio.ByteString
    public final boolean serializer(byte[] bArr, int i, int i2, int i3) {
        if (i >= 0 && i <= write() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int iIconCompatParcelizer = IconCompatParcelizer(i);
            while (i3 > 0) {
                int[] iArr = this.MediaMetadataCompat;
                int i4 = iIconCompatParcelizer == 0 ? 0 : iArr[iIconCompatParcelizer - 1];
                int iMin = Math.min(i3, ((iArr[iIconCompatParcelizer] - i4) + i4) - i);
                byte[][] bArr2 = this.IconCompatParcelizer;
                int i5 = iArr[bArr2.length + iIconCompatParcelizer];
                byte[] bArr3 = bArr2[iIconCompatParcelizer];
                Charset charset = isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer;
                for (int i6 = 0; i6 < iMin; i6++) {
                    if (bArr3[(i - i4) + i5 + i6] == bArr[i6 + i2]) {
                    }
                }
                i += iMin;
                i2 += iMin;
                i3 -= iMin;
                iIconCompatParcelizer++;
            }
            return true;
        }
        return false;
    }

    @Override // com.sentiance.okio.ByteString
    public final String RatingCompat() {
        return MediaDescriptionCompat().RatingCompat();
    }

    @Override // com.sentiance.okio.ByteString
    public final String read() {
        return MediaDescriptionCompat().read();
    }

    @Override // com.sentiance.okio.ByteString
    public final ByteString serializer() {
        return MediaDescriptionCompat().serializer();
    }

    @Override // com.sentiance.okio.ByteString
    public final String toString() {
        return MediaDescriptionCompat().toString();
    }

    @Override // com.sentiance.okio.ByteString
    public final int hashCode() {
        int i = this.serializer;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.IconCompatParcelizer;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            int[] iArr = this.MediaMetadataCompat;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            for (int i7 = i5; i7 < (i6 - i4) + i5; i7++) {
                i3 = (i3 * 31) + bArr2[i7];
            }
            i2++;
            i4 = i6;
        }
        this.serializer = i3;
        return i3;
    }

    @Override // com.sentiance.okio.ByteString
    public final byte RemoteActionCompatParcelizer(int i) {
        byte[][] bArr = this.IconCompatParcelizer;
        int length = bArr.length;
        int[] iArr = this.MediaMetadataCompat;
        isInAppMessageAccessibilityExclusiveModeEnabled.IconCompatParcelizer(iArr[length - 1], i, 1L);
        int iIconCompatParcelizer = IconCompatParcelizer(i);
        return bArr[iIconCompatParcelizer][(i - (iIconCompatParcelizer == 0 ? 0 : iArr[iIconCompatParcelizer - 1])) + iArr[bArr.length + iIconCompatParcelizer]];
    }

    @Override // com.sentiance.okio.ByteString
    public final void write(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans) {
        byte[][] bArr = this.IconCompatParcelizer;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.MediaMetadataCompat;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            resetCachelambda0 resetcachelambda0 = new resetCachelambda0(bArr[i], i3, (i3 + i4) - i2);
            resetCachelambda0 resetcachelambda1 = r8lambdabeyrnr8p6809bwlboro_stans.read;
            if (resetcachelambda1 == null) {
                resetcachelambda0.MediaMetadataCompat = resetcachelambda0;
                resetcachelambda0.RatingCompat = resetcachelambda0;
                r8lambdabeyrnr8p6809bwlboro_stans.read = resetcachelambda0;
            } else {
                resetcachelambda1.MediaMetadataCompat.serializer(resetcachelambda0);
            }
            i++;
            i2 = i4;
        }
        r8lambdabeyrnr8p6809bwlboro_stans.serializer += (long) i2;
    }

    @Override // com.sentiance.okio.ByteString
    public final boolean IconCompatParcelizer(ByteString byteString, int i) {
        if (write() - i >= 0) {
            int iIconCompatParcelizer = IconCompatParcelizer(0);
            int i2 = 0;
            int i3 = 0;
            while (i > 0) {
                int[] iArr = this.MediaMetadataCompat;
                int i4 = iIconCompatParcelizer == 0 ? 0 : iArr[iIconCompatParcelizer - 1];
                int iMin = Math.min(i, ((iArr[iIconCompatParcelizer] - i4) + i4) - i2);
                byte[][] bArr = this.IconCompatParcelizer;
                if (byteString.serializer(bArr[iIconCompatParcelizer], i3, (i2 - i4) + iArr[bArr.length + iIconCompatParcelizer], iMin)) {
                    i2 += iMin;
                    i3 += iMin;
                    i -= iMin;
                    iIconCompatParcelizer++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.sentiance.okio.ByteString
    public final ByteString RemoteActionCompatParcelizer() {
        return MediaDescriptionCompat().RemoteActionCompatParcelizer();
    }
}
