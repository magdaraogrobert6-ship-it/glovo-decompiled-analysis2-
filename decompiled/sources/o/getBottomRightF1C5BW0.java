package o;

import androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException;
import com.huawei.hms.support.api.client.PendingResultsCreator;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import kotlin.text.RegexKt;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class getBottomRightF1C5BW0 extends Okio {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ getBottomRightF1C5BW0(int i) {
        this.IconCompatParcelizer = i;
    }

    public static int read(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            Okio okio2 = getCenterRightF1C5BW0.read;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return getCenterRightF1C5BW0.read(i, getUint64Low32annotations.IconCompatParcelizer(j, bArr));
        }
        if (i2 == 2) {
            return getCenterRightF1C5BW0.serializer(i, getUint64Low32annotations.IconCompatParcelizer(j, bArr), getUint64Low32annotations.IconCompatParcelizer(j + 1, bArr));
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
        return 0;
    }

    @Override // okio.Okio
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        int i4 = i;
        if (this.IconCompatParcelizer != 0) {
            if (((bArr.length - i2) | i4 | i2) >= 0) {
                long j2 = i4;
                int i5 = (int) (((long) i2) - j2);
                if (i5 >= 16) {
                    i3 = 0;
                    long j3 = j2;
                    while (true) {
                        if (i3 >= i5) {
                            i3 = i5;
                            break;
                        }
                        if (getUint64Low32annotations.IconCompatParcelizer(j3, bArr) < 0) {
                            break;
                        }
                        i3++;
                        j3++;
                    }
                } else {
                    i3 = 0;
                }
                int i6 = i5 - i3;
                long j4 = j2 + ((long) i3);
                while (true) {
                    byte bIconCompatParcelizer = 0;
                    while (i6 > 0) {
                        long j5 = j4 + 1;
                        bIconCompatParcelizer = getUint64Low32annotations.IconCompatParcelizer(j4, bArr);
                        if (bIconCompatParcelizer < 0) {
                            j4 = j5;
                            break;
                        }
                        i6--;
                        j4 = j5;
                    }
                    if (i6 == 0) {
                        break;
                    }
                    int i7 = i6 - 1;
                    if (bIconCompatParcelizer >= -32) {
                        if (bIconCompatParcelizer >= -16) {
                            if (i7 < 3) {
                                return read(j4, bArr, bIconCompatParcelizer, i7);
                            }
                            i6 -= 4;
                            byte bIconCompatParcelizer2 = getUint64Low32annotations.IconCompatParcelizer(j4, bArr);
                            if (bIconCompatParcelizer2 <= -65 && (((bIconCompatParcelizer2 + 112) + (bIconCompatParcelizer << 28)) >> 30) == 0 && getUint64Low32annotations.IconCompatParcelizer(j4 + 1, bArr) <= -65) {
                                j = 3 + j4;
                                if (getUint64Low32annotations.IconCompatParcelizer(j4 + 2, bArr) > -65) {
                                }
                                j4 = j;
                            }
                            return -1;
                        }
                        if (i7 < 2) {
                            return read(j4, bArr, bIconCompatParcelizer, i7);
                        }
                        i6 -= 3;
                        byte bIconCompatParcelizer3 = getUint64Low32annotations.IconCompatParcelizer(j4, bArr);
                        if (bIconCompatParcelizer3 <= -65 && ((bIconCompatParcelizer != -32 || bIconCompatParcelizer3 >= -96) && (bIconCompatParcelizer != -19 || bIconCompatParcelizer3 < -96))) {
                            j = j4 + 2;
                            if (getUint64Low32annotations.IconCompatParcelizer(j4 + 1, bArr) > -65) {
                            }
                            j4 = j;
                        }
                        return -1;
                    }
                    if (i7 == 0) {
                        return bIconCompatParcelizer;
                    }
                    i6 -= 2;
                    if (bIconCompatParcelizer < -62 || getUint64Low32annotations.IconCompatParcelizer(j4, bArr) > -65) {
                        return -1;
                    }
                    j4++;
                }
            } else {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            }
            return 0;
        }
        while (i4 < i2 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i2) {
            while (i4 < i2) {
                int i8 = i4 + 1;
                byte b = bArr[i4];
                if (b < 0) {
                    if (b < -32) {
                        if (i8 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i4 += 2;
                            if (bArr[i8] > -65) {
                            }
                        }
                    } else if (b < -16) {
                        if (i8 >= i2 - 1) {
                            return getCenterRightF1C5BW0.read(bArr, i8, i2);
                        }
                        byte b2 = bArr[i8];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i8 = i4 + 3;
                            if (bArr[i4 + 2] > -65) {
                            }
                        }
                    } else {
                        if (i8 >= i2 - 2) {
                            return getCenterRightF1C5BW0.read(bArr, i8, i2);
                        }
                        byte b3 = bArr[i8];
                        if (b3 <= -65 && (((b3 + 112) + (b << 28)) >> 30) == 0 && bArr[i4 + 2] <= -65) {
                            i8 = i4 + 4;
                            if (bArr[i4 + 3] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                i4 = i8;
            }
        }
        return 0;
    }

    @Override // okio.Okio
    public final int serializer(String str, byte[] bArr, int i, int i2) {
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
                    getUint64Low32annotations.write(bArr, j, (byte) cCharAt2);
                    i6++;
                    j++;
                }
                if (i6 != length) {
                    while (i6 < length) {
                        char cCharAt3 = str.charAt(i6);
                        if (cCharAt3 < 128 && j < j2) {
                            getUint64Low32annotations.write(bArr, j, (byte) cCharAt3);
                            j++;
                        } else if (cCharAt3 < c && j <= j2 - 2) {
                            getUint64Low32annotations.write(bArr, j, (byte) ((cCharAt3 >>> 6) | 960));
                            getUint64Low32annotations.write(bArr, j + 1, (byte) ((cCharAt3 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            j += 2;
                        } else if ((cCharAt3 < c3 || c2 < cCharAt3) && j <= j2 - 3) {
                            getUint64Low32annotations.write(bArr, j, (byte) ((cCharAt3 >>> '\f') | 480));
                            getUint64Low32annotations.write(bArr, j + 1, (byte) (((cCharAt3 >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            getUint64Low32annotations.write(bArr, j + 2, (byte) ((cCharAt3 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            j += 3;
                        } else {
                            if (j <= j2 - 4) {
                                int i7 = i6 + 1;
                                if (i7 != length) {
                                    char cCharAt4 = str.charAt(i7);
                                    if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                        int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                        getUint64Low32annotations.write(bArr, j, (byte) ((codePoint >>> 18) | 240));
                                        getUint64Low32annotations.write(bArr, j + 1, (byte) (((codePoint >>> 12) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                                        getUint64Low32annotations.write(bArr, j + 2, (byte) (((codePoint >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                                        getUint64Low32annotations.write(bArr, j + 3, (byte) ((codePoint & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
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

    @Override // okio.Okio
    public final String write(byte[] bArr, int i, int i2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        if (this.IconCompatParcelizer == 0) {
            if ((((bArr.length - i) - i2) | i | i2) < 0) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = i;
            int i5 = 0;
            while (i4 < i3) {
                byte b = bArr[i4];
                if (b < 0) {
                    break;
                }
                i4++;
                cArr[i5] = (char) b;
                i5++;
            }
            int i6 = i5;
            while (i4 < i3) {
                int i7 = i4 + 1;
                byte b2 = bArr[i4];
                if (b2 >= 0) {
                    cArr[i6] = (char) b2;
                    i6++;
                    i4 = i7;
                    while (i4 < i3) {
                        byte b3 = bArr[i4];
                        if (b3 < 0) {
                            break;
                        }
                        i4++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                } else if (b2 < -32) {
                    if (i7 >= i3) {
                        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.read();
                    }
                    i4 += 2;
                    Object[] objArr = {Byte.valueOf(b2), Byte.valueOf(bArr[i7]), cArr, Integer.valueOf(i6)};
                    RegexKt.RemoteActionCompatParcelizer(PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), 72370599, objArr, -72370599, PendingResultsCreator.InstantPendingResult.serializer());
                    i6++;
                } else if (b2 < -16) {
                    if (i7 >= i3 - 1) {
                        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.read();
                    }
                    RegexKt.write(b2, bArr[i7], bArr[i4 + 2], cArr, i6);
                    i6++;
                    i4 += 3;
                } else {
                    if (i7 >= i3 - 2) {
                        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.read();
                    }
                    RegexKt.RemoteActionCompatParcelizer(b2, bArr[i7], bArr[i4 + 2], bArr[i4 + 3], cArr, i6);
                    i6 += 2;
                    i4 += 4;
                }
            }
            return new String(cArr, 0, i6);
        }
        if ((((bArr.length - i) - i2) | i | i2) < 0) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i8 = i + i2;
        char[] cArr2 = new char[i2];
        int i9 = i;
        int i10 = 0;
        while (i9 < i8) {
            byte bIconCompatParcelizer = getUint64Low32annotations.IconCompatParcelizer(i9, bArr);
            if (bIconCompatParcelizer < 0) {
                break;
            }
            i9++;
            cArr2[i10] = (char) bIconCompatParcelizer;
            i10++;
        }
        int i11 = i10;
        while (i9 < i8) {
            int i12 = i9 + 1;
            byte bIconCompatParcelizer2 = getUint64Low32annotations.IconCompatParcelizer(i9, bArr);
            if (bIconCompatParcelizer2 >= 0) {
                cArr2[i11] = (char) bIconCompatParcelizer2;
                i11++;
                i9 = i12;
                while (i9 < i8) {
                    byte bIconCompatParcelizer3 = getUint64Low32annotations.IconCompatParcelizer(i9, bArr);
                    if (bIconCompatParcelizer3 < 0) {
                        break;
                    }
                    i9++;
                    cArr2[i11] = (char) bIconCompatParcelizer3;
                    i11++;
                }
            } else if (bIconCompatParcelizer2 < -32) {
                if (i12 >= i8) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.read();
                }
                i9 += 2;
                Object[] objArr2 = {Byte.valueOf(bIconCompatParcelizer2), Byte.valueOf(getUint64Low32annotations.IconCompatParcelizer(i12, bArr)), cArr2, Integer.valueOf(i11)};
                RegexKt.RemoteActionCompatParcelizer(PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), 72370599, objArr2, -72370599, PendingResultsCreator.InstantPendingResult.serializer());
                i11++;
            } else if (bIconCompatParcelizer2 < -16) {
                if (i12 >= i8 - 1) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.read();
                }
                RegexKt.write(bIconCompatParcelizer2, getUint64Low32annotations.IconCompatParcelizer(i12, bArr), getUint64Low32annotations.IconCompatParcelizer(i9 + 2, bArr), cArr2, i11);
                i11++;
                i9 += 3;
            } else {
                if (i12 >= i8 - 2) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.read();
                }
                RegexKt.RemoteActionCompatParcelizer(bIconCompatParcelizer2, getUint64Low32annotations.IconCompatParcelizer(i12, bArr), getUint64Low32annotations.IconCompatParcelizer(i9 + 2, bArr), getUint64Low32annotations.IconCompatParcelizer(i9 + 3, bArr), cArr2, i11);
                i11 += 2;
                i9 += 4;
            }
        }
        return new String(cArr2, 0, i11);
    }
}
