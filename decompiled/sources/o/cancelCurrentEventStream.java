package o;

import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes2.dex */
public final class cancelCurrentEventStream extends DelayKt {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ cancelCurrentEventStream(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // kotlinx.coroutines.DelayKt
    public final String RemoteActionCompatParcelizer(ByteBuffer byteBuffer, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
        if (this.IconCompatParcelizer != 0) {
            if ((((byteBuffer.limit() - i) - i2) | i | i2) >= 0) {
                long jMediaDescriptionCompat = setDirty.RatingCompat.MediaDescriptionCompat(setDirty.serializer, byteBuffer) + ((long) i);
                long j = ((long) i2) + jMediaDescriptionCompat;
                char[] cArr = new char[i2];
                int i3 = 0;
                while (jMediaDescriptionCompat < j) {
                    byte bSerializer = setDirty.RatingCompat.serializer(jMediaDescriptionCompat);
                    if (!updateOutline.read(bSerializer)) {
                        break;
                    }
                    jMediaDescriptionCompat++;
                    updateOutline.serializer(bSerializer, cArr, i3);
                    i3++;
                }
                int i4 = i3;
                while (jMediaDescriptionCompat < j) {
                    long j2 = jMediaDescriptionCompat + 1;
                    GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
                    byte bSerializer2 = graphicsLayerOwnerLayerrecordLambda1.serializer(jMediaDescriptionCompat);
                    if (updateOutline.read(bSerializer2)) {
                        int i5 = i4 + 1;
                        updateOutline.serializer(bSerializer2, cArr, i4);
                        while (j2 < j) {
                            byte bSerializer3 = setDirty.RatingCompat.serializer(j2);
                            if (!updateOutline.read(bSerializer3)) {
                                break;
                            }
                            j2++;
                            updateOutline.serializer(bSerializer3, cArr, i5);
                            i5++;
                        }
                        i4 = i5;
                        jMediaDescriptionCompat = j2;
                    } else if (updateOutline.IconCompatParcelizer(bSerializer2)) {
                        if (j2 < j) {
                            jMediaDescriptionCompat += 2;
                            updateOutline.IconCompatParcelizer(bSerializer2, graphicsLayerOwnerLayerrecordLambda1.serializer(j2), cArr, i4);
                            i4++;
                        } else {
                            throw com.google.protobuf.InvalidProtocolBufferException.IconCompatParcelizer();
                        }
                    } else if (updateOutline.RemoteActionCompatParcelizer(bSerializer2)) {
                        if (j2 < j - 1) {
                            updateOutline.serializer(bSerializer2, graphicsLayerOwnerLayerrecordLambda1.serializer(j2), graphicsLayerOwnerLayerrecordLambda1.serializer(jMediaDescriptionCompat + 2), cArr, i4);
                            i4++;
                            jMediaDescriptionCompat += 3;
                        } else {
                            throw com.google.protobuf.InvalidProtocolBufferException.IconCompatParcelizer();
                        }
                    } else if (j2 < j - 2) {
                        updateOutline.RemoteActionCompatParcelizer(bSerializer2, graphicsLayerOwnerLayerrecordLambda1.serializer(j2), graphicsLayerOwnerLayerrecordLambda1.serializer(jMediaDescriptionCompat + 2), graphicsLayerOwnerLayerrecordLambda1.serializer(jMediaDescriptionCompat + 3), cArr, i4);
                        i4 += 2;
                        jMediaDescriptionCompat += 4;
                    } else {
                        throw com.google.protobuf.InvalidProtocolBufferException.IconCompatParcelizer();
                    }
                }
                return new String(cArr, 0, i4);
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        return DelayKt.serializer(byteBuffer, i, i2);
    }

    @Override // kotlinx.coroutines.DelayKt
    public final String RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) throws com.google.protobuf.InvalidProtocolBufferException {
        if (this.IconCompatParcelizer != 0) {
            Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
            String str = new String(bArr, i, i2, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw com.google.protobuf.InvalidProtocolBufferException.IconCompatParcelizer();
            }
            return str;
        }
        if ((((bArr.length - i) - i2) | i | i2) < 0) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!updateOutline.read(b)) {
                break;
            }
            i++;
            updateOutline.serializer(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (updateOutline.read(b2)) {
                updateOutline.serializer(b2, cArr, i5);
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (!updateOutline.read(b3)) {
                        break;
                    }
                    i++;
                    updateOutline.serializer(b3, cArr, i5);
                    i5++;
                }
            } else if (updateOutline.IconCompatParcelizer(b2)) {
                if (i6 >= i3) {
                    throw com.google.protobuf.InvalidProtocolBufferException.IconCompatParcelizer();
                }
                i += 2;
                updateOutline.IconCompatParcelizer(b2, bArr[i6], cArr, i5);
                i5++;
            } else if (updateOutline.RemoteActionCompatParcelizer(b2)) {
                if (i6 >= i3 - 1) {
                    throw com.google.protobuf.InvalidProtocolBufferException.IconCompatParcelizer();
                }
                updateOutline.serializer(b2, bArr[i6], bArr[i + 2], cArr, i5);
                i5++;
                i += 3;
            } else {
                if (i6 >= i3 - 2) {
                    throw com.google.protobuf.InvalidProtocolBufferException.IconCompatParcelizer();
                }
                updateOutline.RemoteActionCompatParcelizer(b2, bArr[i6], bArr[i + 2], bArr[i + 3], cArr, i5);
                i5 += 2;
                i += 4;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static int RemoteActionCompatParcelizer(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            DelayKt delayKt = IndirectPointerNavigationGestureDetector.write;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return IndirectPointerNavigationGestureDetector.write(i, setDirty.RemoteActionCompatParcelizer(j, bArr));
        }
        if (i2 == 2) {
            return IndirectPointerNavigationGestureDetector.read(i, setDirty.RemoteActionCompatParcelizer(j, bArr), setDirty.RemoteActionCompatParcelizer(j + 1, bArr));
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
        return 0;
    }

    @Override // kotlinx.coroutines.DelayKt
    public final int IconCompatParcelizer(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        char c = 2048;
        char c2 = 57343;
        char c3 = 55296;
        if (this.IconCompatParcelizer != 0) {
            long j = i;
            long j2 = ((long) i2) + j;
            int length = str.length();
            if (length <= i2 && bArr.length - i2 >= i) {
                int i6 = 0;
                while (i6 < length && (cCharAt2 = str.charAt(i6)) < 128) {
                    setDirty.RemoteActionCompatParcelizer(bArr, j, (byte) cCharAt2);
                    i6++;
                    j++;
                }
                if (i6 != length) {
                    while (i6 < length) {
                        char cCharAt3 = str.charAt(i6);
                        if (cCharAt3 < 128 && j < j2) {
                            setDirty.RemoteActionCompatParcelizer(bArr, j, (byte) cCharAt3);
                            j++;
                        } else if (cCharAt3 < c && j <= j2 - 2) {
                            setDirty.RemoteActionCompatParcelizer(bArr, j, (byte) ((cCharAt3 >>> 6) | 960));
                            setDirty.RemoteActionCompatParcelizer(bArr, j + 1, (byte) ((cCharAt3 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            j += 2;
                        } else if ((cCharAt3 < c3 || c2 < cCharAt3) && j <= j2 - 3) {
                            setDirty.RemoteActionCompatParcelizer(bArr, j, (byte) ((cCharAt3 >>> '\f') | 480));
                            setDirty.RemoteActionCompatParcelizer(bArr, j + 1, (byte) (((cCharAt3 >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            setDirty.RemoteActionCompatParcelizer(bArr, j + 2, (byte) ((cCharAt3 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            j += 3;
                        } else {
                            if (j <= j2 - 4) {
                                int i7 = i6 + 1;
                                if (i7 != length) {
                                    char cCharAt4 = str.charAt(i7);
                                    if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                        int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                        setDirty.RemoteActionCompatParcelizer(bArr, j, (byte) ((codePoint >>> 18) | 240));
                                        setDirty.RemoteActionCompatParcelizer(bArr, j + 1, (byte) (((codePoint >>> 12) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                                        setDirty.RemoteActionCompatParcelizer(bArr, j + 2, (byte) (((codePoint >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                                        setDirty.RemoteActionCompatParcelizer(bArr, j + 3, (byte) ((codePoint & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                                        i6 = i7;
                                        j = 4 + j;
                                    } else {
                                        i6 = i7;
                                    }
                                }
                                throw new Utf8$UnpairedSurrogateException(i6 - 1, length);
                            }
                            if (c3 <= cCharAt3 && cCharAt3 <= 57343 && ((i5 = i6 + 1) == length || !Character.isSurrogatePair(cCharAt3, str.charAt(i5)))) {
                                throw new Utf8$UnpairedSurrogateException(i6, length);
                            }
                            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m(cCharAt3, j);
                        }
                        i6++;
                        c = 2048;
                        c2 = 57343;
                        c3 = 55296;
                    }
                }
                return (int) j;
            }
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m((int) str.charAt(length - 1), i + i2);
            return 0;
        }
        int length2 = str.length();
        int i8 = i2 + i;
        int i9 = 0;
        while (i9 < length2) {
            int i10 = i9 + i;
            if (i10 >= i8 || (cCharAt = str.charAt(i9)) >= 128) {
                break;
            }
            bArr[i10] = (byte) cCharAt;
            i9++;
        }
        if (i9 == length2) {
            return i + length2;
        }
        int i11 = i + i9;
        while (i9 < length2) {
            char cCharAt5 = str.charAt(i9);
            if (cCharAt5 >= 128 || i11 >= i8) {
                if (cCharAt5 < 2048 && i11 <= i8 - 2) {
                    bArr[i11] = (byte) ((cCharAt5 >>> 6) | 960);
                    i3 = i11 + 2;
                    bArr[i11 + 1] = (byte) ((cCharAt5 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                } else {
                    if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || i11 > i8 - 3) {
                        if (i11 <= i8 - 4) {
                            int i12 = i9 + 1;
                            if (i12 != str.length()) {
                                char cCharAt6 = str.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    bArr[i11] = (byte) ((codePoint2 >>> 18) | 240);
                                    bArr[i11 + 1] = (byte) (((codePoint2 >>> 12) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                                    bArr[i11 + 2] = (byte) (((codePoint2 >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                                    bArr[i11 + 3] = (byte) ((codePoint2 & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                                    i11 += 4;
                                    i9 = i12;
                                } else {
                                    i9 = i12;
                                }
                            }
                            throw new Utf8$UnpairedSurrogateException(i9 - 1, length2);
                        }
                        if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i4 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt5, str.charAt(i4)))) {
                            throw new Utf8$UnpairedSurrogateException(i9, length2);
                        }
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{Integer.valueOf(cCharAt5), Integer.valueOf(i11)}, 896860986, isAppSetIdReadingEnabled.serializer(), -896860985, isAppSetIdReadingEnabled.serializer());
                        return 0;
                    }
                    bArr[i11] = (byte) ((cCharAt5 >>> '\f') | 480);
                    bArr[i11 + 1] = (byte) (((cCharAt5 >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    i3 = i11 + 3;
                    bArr[i11 + 2] = (byte) ((cCharAt5 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor);
                }
                i11 = i3;
            } else {
                bArr[i11] = (byte) cCharAt5;
                i11++;
            }
            i9++;
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0237  */
    /* JADX WARN: Code duplicated, block: B:178:0x0241 A[ADDED_TO_REGION, LOOP:6: B:178:0x0241->B:270:0x0241, LOOP_START, PHI: r2
  0x0241: PHI (r2v3 int) = (r2v2 int), (r2v4 int) binds: [B:176:0x023e, B:270:0x0241] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:180:0x0246  */
    /* JADX WARN: Code duplicated, block: B:182:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x0252  */
    /* JADX WARN: Code duplicated, block: B:187:0x0256  */
    /* JADX WARN: Code duplicated, block: B:192:0x0261  */
    /* JADX WARN: Code duplicated, block: B:195:0x026a  */
    /* JADX WARN: Code duplicated, block: B:197:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x0281  */
    /* JADX WARN: Code duplicated, block: B:208:0x028c  */
    /* JADX WARN: Code duplicated, block: B:210:0x0290  */
    /* JADX WARN: Code duplicated, block: B:252:? A[PHI: r2
  PHI (r2v1 int) = (r2v0 int), (r2v15 int), (r2v21 int), (r2v23 int) binds: [B:126:0x01ab, B:170:0x0231, B:151:0x01ed, B:136:0x01bf] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x02a7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x02a7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (o.setDirty.RemoteActionCompatParcelizer(r14, r25) > (-65)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (o.setDirty.RemoteActionCompatParcelizer(r14, r25) > (-65)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        if (o.setDirty.RemoteActionCompatParcelizer(r14, r25) > (-65)) goto L122;
     */
    @Override // kotlinx.coroutines.DelayKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cancelCurrentEventStream.read(byte[], int, int, int):int");
    }
}
