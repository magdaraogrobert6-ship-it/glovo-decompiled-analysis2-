package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutTileBinding extends RequestBuilder {
    public final transient byte[][] IconCompatParcelizer;
    public final transient int[] read;

    @Override // o.RequestBuilder
    public final byte[] RemoteActionCompatParcelizer() {
        return MediaDescriptionCompat();
    }

    @Override // o.RequestBuilder
    public final String read() {
        throw null;
    }

    @Override // o.RequestBuilder
    public final void serializer(RegistryMissingComponentException registryMissingComponentException, int i) {
        int iSerializer = TextStreamsKt.serializer(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.read;
            int i3 = iSerializer == 0 ? 0 : iArr[iSerializer - 1];
            int i4 = iArr[iSerializer];
            byte[][] bArr = this.IconCompatParcelizer;
            int i5 = iArr[bArr.length + iSerializer];
            int iMin = Math.min(i, (i4 - i3) + i3) - i2;
            int i6 = (i2 - i3) + i5;
            SVGParseException sVGParseException = new SVGParseException(bArr[iSerializer], i6, i6 + iMin, true, false);
            SVGParseException sVGParseException2 = registryMissingComponentException.head;
            if (sVGParseException2 == null) {
                sVGParseException.prev = sVGParseException;
                sVGParseException.next = sVGParseException;
                registryMissingComponentException.head = sVGParseException;
            } else {
                SVGParseException sVGParseException3 = sVGParseException2.prev;
                sVGParseException3.getClass();
                sVGParseException3.IconCompatParcelizer(sVGParseException);
            }
            i2 += iMin;
            iSerializer++;
        }
        registryMissingComponentException.size += (long) i;
    }

    public LayoutTileBinding(byte[][] bArr, int[] iArr) {
        super(RequestBuilder.EMPTY.data);
        this.IconCompatParcelizer = bArr;
        this.read = iArr;
    }

    public final RequestBuilder MediaSessionCompatQueueItem() {
        return new RequestBuilder(MediaDescriptionCompat());
    }

    @Override // o.RequestBuilder
    public final int serializer() {
        return this.read[this.IconCompatParcelizer.length - 1];
    }

    @Override // o.RequestBuilder
    public final byte write(int i) {
        byte[][] bArr = this.IconCompatParcelizer;
        int length = bArr.length;
        int[] iArr = this.read;
        setOptionalTextView.RemoteActionCompatParcelizer(iArr[length - 1], i, 1L);
        int iSerializer = TextStreamsKt.serializer(this, i);
        return bArr[iSerializer][(i - (iSerializer == 0 ? 0 : iArr[iSerializer - 1])) + iArr[bArr.length + iSerializer]];
    }

    @Override // o.RequestBuilder
    public final int IconCompatParcelizer(byte[] bArr) {
        bArr.getClass();
        return MediaSessionCompatQueueItem().IconCompatParcelizer(bArr);
    }

    @Override // o.RequestBuilder
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RequestBuilder) {
            RequestBuilder requestBuilder = (RequestBuilder) obj;
            if (requestBuilder.serializer() == serializer() && write(0, requestBuilder, serializer())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.RequestBuilder
    public final int read(int i, byte[] bArr) {
        bArr.getClass();
        return MediaSessionCompatQueueItem().read(i, bArr);
    }

    @Override // o.RequestBuilder
    public final String serializer(Charset charset) {
        charset.getClass();
        return MediaSessionCompatQueueItem().serializer(charset);
    }

    @Override // o.RequestBuilder
    public final String IconCompatParcelizer() {
        return MediaSessionCompatQueueItem().IconCompatParcelizer();
    }

    @Override // o.RequestBuilder
    public final byte[] MediaDescriptionCompat() {
        byte[] bArr = new byte[serializer()];
        byte[][] bArr2 = this.IconCompatParcelizer;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.read;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            onContentCardClicked.write(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // o.RequestBuilder
    public final RequestBuilder read(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.IconCompatParcelizer;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.read;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new RequestBuilder(bArrDigest);
    }

    @Override // o.RequestBuilder
    public final String toString() {
        return MediaSessionCompatQueueItem().toString();
    }

    @Override // o.RequestBuilder
    public final RequestBuilder write() {
        return MediaSessionCompatQueueItem().write();
    }

    @Override // o.RequestBuilder
    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.IconCompatParcelizer;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.read;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            for (int i7 = i5; i7 < (i6 - i4) + i5; i7++) {
                i3 = (i3 * 31) + bArr2[i7];
            }
            i2++;
            i4 = i6;
        }
        this.hashCode = i3;
        return i3;
    }

    @Override // o.RequestBuilder
    public final RequestBuilder read(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = serializer();
        }
        if (i >= 0) {
            if (i2 > serializer()) {
                StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i2, "endIndex=", " > length(");
                sbM.append(serializer());
                sbM.append(')');
                throw new IllegalArgumentException(sbM.toString().toString());
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == serializer()) {
                    return this;
                }
                if (i == i2) {
                    return RequestBuilder.EMPTY;
                }
                int iSerializer = TextStreamsKt.serializer(this, i);
                int iSerializer2 = TextStreamsKt.serializer(this, i2 - 1);
                byte[][] bArr = this.IconCompatParcelizer;
                byte[][] bArr2 = (byte[][]) onContentCardClicked.write(iSerializer, iSerializer2 + 1, bArr);
                int[] iArr = new int[bArr2.length * 2];
                int[] iArr2 = this.read;
                if (iSerializer <= iSerializer2) {
                    int i4 = iSerializer;
                    int i5 = 0;
                    while (true) {
                        iArr[i5] = Math.min(iArr2[i4] - i, i3);
                        iArr[bArr2.length + i5] = iArr2[bArr.length + i4];
                        if (i4 == iSerializer2) {
                            break;
                        }
                        i4++;
                        i5++;
                    }
                }
                int i6 = iSerializer != 0 ? iArr2[iSerializer - 1] : 0;
                int length = bArr2.length;
                iArr[length] = (i - i6) + iArr[length];
                return new LayoutTileBinding(bArr2, iArr);
            }
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(i2, "endIndex=", i, " < beginIndex="));
            return null;
        }
        DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "beginIndex=", " < 0"));
        return null;
    }

    @Override // o.RequestBuilder
    public final boolean serializer(byte[] bArr, int i, int i2, int i3) {
        bArr.getClass();
        if (i < 0 || i > serializer() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iSerializer = TextStreamsKt.serializer(this, i);
        while (i < i4) {
            int[] iArr = this.read;
            int i5 = iSerializer == 0 ? 0 : iArr[iSerializer - 1];
            int i6 = iArr[iSerializer];
            byte[][] bArr2 = this.IconCompatParcelizer;
            int i7 = iArr[bArr2.length + iSerializer];
            int iMin = Math.min(i4, (i6 - i5) + i5) - i;
            if (!setOptionalTextView.write(bArr2[iSerializer], (i - i5) + i7, bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iSerializer++;
        }
        return true;
    }

    @Override // o.RequestBuilder
    public final boolean write(int i, RequestBuilder requestBuilder, int i2) {
        requestBuilder.getClass();
        if (i >= 0 && i <= serializer() - i2) {
            int i3 = i2 + i;
            int iSerializer = TextStreamsKt.serializer(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.read;
                int i5 = iSerializer == 0 ? 0 : iArr[iSerializer - 1];
                int i6 = iArr[iSerializer];
                byte[][] bArr = this.IconCompatParcelizer;
                int i7 = iArr[bArr.length + iSerializer];
                int iMin = Math.min(i3, (i6 - i5) + i5) - i;
                if (requestBuilder.serializer(bArr[iSerializer], i4, (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iSerializer++;
                }
            }
            return true;
        }
        return false;
    }
}
