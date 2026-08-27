package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class RequestBuilder implements Serializable, Comparable {
    public static final RequestBuilder EMPTY = new RequestBuilder(new byte[0]);
    public final byte[] data;
    public transient int hashCode;
    public transient String utf8;

    public byte[] RemoteActionCompatParcelizer() {
        return this.data;
    }

    public void serializer(RegistryMissingComponentException registryMissingComponentException, int i) {
        registryMissingComponentException.write(this.data, 0, i);
    }

    public RequestBuilder write() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new RequestBuilder(bArrCopyOf);
            }
            i++;
        }
    }

    public String IconCompatParcelizer() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b = bArr[i2];
            char[] cArr2 = ApiException.RemoteActionCompatParcelizer;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i2++;
            i += 2;
        }
        return new String(cArr);
    }

    public byte[] MediaDescriptionCompat() {
        byte[] bArr = this.data;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String read() {
        byte[] bArr = BaseCardViewCompanion.RemoteActionCompatParcelizer;
        byte[] bArr2 = this.data;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            byte b2 = bArr2[i + 1];
            int i3 = i + 3;
            byte b3 = bArr2[i + 2];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            bArr3[i2 + 3] = bArr[b3 & 63];
            i2 += 4;
            i = i3;
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            byte b5 = bArr2[i];
            byte b6 = bArr2[i + 1];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, ensureSubscribedToInAppMessageEvents.write);
    }

    public int serializer() {
        return this.data.length;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b4 A[EDGE_INSN: B:179:0x01b4->B:180:0x01b5 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i3 < length) {
            byte b2 = bArr[i3];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i2 = -1;
                            break;
                        }
                        int i5 = i3 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i3 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                            byte b4 = bArr[i3 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                        i2 = -1;
                                        break;
                                    }
                                    i2 += i6 < 65536 ? 1 : 2;
                                    i3 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i2 = -1;
                            break;
                        }
                    } else {
                        int i7 = i3 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i3 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                    i2 = -1;
                                    break;
                                }
                                i2 += i8 < 65536 ? 1 : 2;
                                i3 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i2 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i3 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i2 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                i2 = -1;
                                break;
                            }
                            i2 += i10 < 65536 ? 1 : 2;
                            i3 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i2 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i2 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i2 += b2 < 65536 ? 1 : 2;
                    i3++;
                    while (true) {
                        i4 = i11;
                        if (i3 < length && (b = bArr[i3]) >= 0) {
                            i3++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i2 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i2 = -1;
                break;
            }
        }
        if (i2 != -1) {
            String strRatingCompat = RatingCompat();
            String strWrite = setCarryoverInAppMessage.write(setCarryoverInAppMessage.write(setCarryoverInAppMessage.write(strRatingCompat.substring(0, i2), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i2 >= strRatingCompat.length()) {
                return m1$$ExternalSyntheticOutline0.m(']', "[text=", strWrite);
            }
            return "[size=" + bArr.length + " text=" + strWrite + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + IconCompatParcelizer() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        sb.append((64 == bArr.length ? this : new RequestBuilder(onContentCardClicked.IconCompatParcelizer(bArr, 0, 64))).IconCompatParcelizer());
        sb.append("…]");
        return sb.toString();
    }

    public byte write(int i) {
        return this.data[i];
    }

    public RequestBuilder(byte[] bArr) {
        bArr.getClass();
        this.data = bArr;
    }

    public static int RemoteActionCompatParcelizer(RequestBuilder requestBuilder, RequestBuilder requestBuilder2) {
        requestBuilder.getClass();
        requestBuilder2.getClass();
        return requestBuilder.IconCompatParcelizer(requestBuilder2.RemoteActionCompatParcelizer());
    }

    public static int read(RequestBuilder requestBuilder, RequestBuilder requestBuilder2) {
        requestBuilder.getClass();
        requestBuilder2.getClass();
        return requestBuilder.read(0, requestBuilder2.RemoteActionCompatParcelizer());
    }

    public int IconCompatParcelizer(byte[] bArr) {
        bArr.getClass();
        int iSerializer = serializer();
        byte[] bArr2 = this.data;
        for (int iMin = Math.min(iSerializer, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (setOptionalTextView.write(bArr2, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RequestBuilder) {
            RequestBuilder requestBuilder = (RequestBuilder) obj;
            int iSerializer = requestBuilder.serializer();
            byte[] bArr = this.data;
            if (iSerializer == bArr.length && requestBuilder.serializer(bArr, 0, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int read(int i, byte[] bArr) {
        bArr.getClass();
        byte[] bArr2 = this.data;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!setOptionalTextView.write(bArr2, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final int compareTo(RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        int iSerializer = serializer();
        int iSerializer2 = requestBuilder.serializer();
        int iMin = Math.min(iSerializer, iSerializer2);
        for (int i = 0; i < iMin; i++) {
            int iWrite = write(i) & 255;
            int iWrite2 = requestBuilder.write(i) & 255;
            if (iWrite != iWrite2) {
                return iWrite < iWrite2 ? -1 : 1;
            }
        }
        if (iSerializer == iSerializer2) {
            return 0;
        }
        return iSerializer < iSerializer2 ? -1 : 1;
    }

    public final String RatingCompat() {
        String str = this.utf8;
        if (str != null) {
            return str;
        }
        byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        bArrRemoteActionCompatParcelizer.getClass();
        String str2 = new String(bArrRemoteActionCompatParcelizer, ensureSubscribedToInAppMessageEvents.write);
        this.utf8 = str2;
        return str2;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.data);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public RequestBuilder read(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = serializer();
        }
        if (i >= 0) {
            byte[] bArr = this.data;
            if (i2 > bArr.length) {
                DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(new StringBuilder("endIndex > length("), bArr.length, ')'));
                return null;
            }
            if (i2 - i >= 0) {
                return (i == 0 && i2 == bArr.length) ? this : new RequestBuilder(onContentCardClicked.IconCompatParcelizer(bArr, i, i2));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("endIndex < beginIndex");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("beginIndex < 0");
        return null;
    }

    public RequestBuilder read(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, serializer());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new RequestBuilder(bArrDigest);
    }

    public String serializer(Charset charset) {
        charset.getClass();
        return new String(this.data, charset);
    }

    public boolean serializer(byte[] bArr, int i, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.data;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && setOptionalTextView.write(bArr2, i, bArr, i2, i3);
    }

    public static /* synthetic */ RequestBuilder serializer(RequestBuilder requestBuilder, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return requestBuilder.read(i, i2);
    }

    public boolean write(int i, RequestBuilder requestBuilder, int i2) {
        requestBuilder.getClass();
        return requestBuilder.serializer(this.data, 0, i, i2);
    }
}
