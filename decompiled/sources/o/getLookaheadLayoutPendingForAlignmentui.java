package o;

import com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.ranges.RangesKt;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getLookaheadLayoutPendingForAlignmentui extends RegexKt {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getLookaheadLayoutPendingForAlignmentui(int i) {
        super(6);
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // kotlin.text.RegexKt
    public final String serializer(byte[] bArr, int i, int i2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        int i3;
        int i4 = i;
        if (this.RemoteActionCompatParcelizer != 0) {
            Charset charset = getMinimumTouchTargetSizeMYxV2XQ.write;
            String str = new String(bArr, i4, i2, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i4, i2 + i4))) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            return str;
        }
        if ((((bArr.length - i4) - i2) | i4 | i2) < 0) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i5 = i4 + i2;
        char[] cArr = new char[i2];
        int i6 = 0;
        while (i4 < i5) {
            byte b = bArr[i4];
            if (b < 0) {
                break;
            }
            i4++;
            cArr[i6] = (char) b;
            i6++;
        }
        while (i4 < i5) {
            int i7 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                cArr[i6] = (char) b2;
                i6++;
                i4 = i7;
                while (i4 < i5) {
                    byte b3 = bArr[i4];
                    if (b3 < 0) {
                        break;
                    }
                    i4++;
                    cArr[i6] = (char) b3;
                    i6++;
                }
            } else {
                if (b2 < -32) {
                    if (i7 >= i5) {
                        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
                    }
                    i4 += 2;
                    byte b4 = bArr[i7];
                    if (b2 >= -62) {
                        if (!((Boolean) RangesKt.read(2010532887, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Byte.valueOf(b4)}, BackspaceCommand.write(), -2010532877, BackspaceCommand.write())).booleanValue()) {
                            cArr[i6] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                            i6++;
                        }
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
                }
                if (b2 < -16) {
                    if (i7 >= i5 - 1) {
                        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
                    }
                    byte b5 = bArr[i7];
                    i3 = i4 + 3;
                    byte b6 = bArr[i4 + 2];
                    if (!((Boolean) RangesKt.read(2010532887, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Byte.valueOf(b5)}, BackspaceCommand.write(), -2010532877, BackspaceCommand.write())).booleanValue() && ((b2 != -32 || b5 >= -96) && (b2 != -19 || b5 < -96))) {
                        if (!((Boolean) RangesKt.read(2010532887, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Byte.valueOf(b6)}, BackspaceCommand.write(), -2010532877, BackspaceCommand.write())).booleanValue()) {
                            cArr[i6] = (char) ((b6 & 63) | ((b5 & 63) << 6) | ((b2 & 15) << 12));
                            i6++;
                        }
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
                }
                if (i7 >= i5 - 2) {
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
                }
                byte b7 = bArr[i7];
                byte b8 = bArr[i4 + 2];
                i3 = i4 + 4;
                byte b9 = bArr[i4 + 3];
                if (!((Boolean) RangesKt.read(2010532887, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Byte.valueOf(b7)}, BackspaceCommand.write(), -2010532877, BackspaceCommand.write())).booleanValue() && (((b7 + 112) + (b2 << 28)) >> 30) == 0) {
                    if (!((Boolean) RangesKt.read(2010532887, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Byte.valueOf(b8)}, BackspaceCommand.write(), -2010532877, BackspaceCommand.write())).booleanValue()) {
                        if (!((Boolean) RangesKt.read(2010532887, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Byte.valueOf(b9)}, BackspaceCommand.write(), -2010532877, BackspaceCommand.write())).booleanValue()) {
                            int i8 = (b9 & 63) | ((b7 & 63) << 12) | ((b2 & 7) << 18) | ((b8 & 63) << 6);
                            cArr[i6] = (char) ((i8 >>> 10) + 55232);
                            cArr[i6 + 1] = (char) ((i8 & 1023) + 56320);
                            i6 += 2;
                        }
                    }
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
                i4 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    public static int write(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            RegexKt regexKt = getNextChildPlaceOrderui.RemoteActionCompatParcelizer;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return getNextChildPlaceOrderui.write(i, getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j, bArr));
        }
        if (i2 == 2) {
            return getNextChildPlaceOrderui.read(i, getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j, bArr), getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j + 1, bArr));
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
        return 0;
    }

    @Override // kotlin.text.RegexKt
    public final int RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        int i4 = i;
        if (this.RemoteActionCompatParcelizer != 0) {
            if (((bArr.length - i2) | i4 | i2) >= 0) {
                long j2 = i4;
                int i5 = (int) (((long) i2) - j2);
                if (i5 >= 16) {
                    int i6 = (int) j2;
                    long j3 = j2;
                    i3 = 0;
                    while (true) {
                        if (i3 >= 8 - (i6 & 7)) {
                            while (true) {
                                int i7 = i3 + 8;
                                if (i7 > i5) {
                                    break;
                                }
                                if ((getLastLookaheadConstraintsDWUhwKw.read.MediaMetadataCompat(getLastLookaheadConstraintsDWUhwKw.IconCompatParcelizer + j3, bArr) & (-9187201950435737472L)) != 0) {
                                    break;
                                }
                                j3 += 8;
                                i3 = i7;
                            }
                            while (true) {
                                if (i3 >= i5) {
                                    i3 = i5;
                                    break;
                                }
                                if (getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j3, bArr) < 0) {
                                    break;
                                }
                                i3++;
                                j3++;
                            }
                        } else {
                            if (getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j3, bArr) < 0) {
                                break;
                            }
                            i3++;
                            j3++;
                        }
                    }
                } else {
                    i3 = 0;
                }
                int i8 = i5 - i3;
                long j4 = j2 + ((long) i3);
                while (true) {
                    byte b = 0;
                    while (i8 > 0) {
                        long j5 = j4 + 1;
                        byte bRemoteActionCompatParcelizer = getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j4, bArr);
                        if (bRemoteActionCompatParcelizer < 0) {
                            j4 = j5;
                            b = bRemoteActionCompatParcelizer;
                            break;
                        }
                        i8--;
                        j4 = j5;
                        b = bRemoteActionCompatParcelizer;
                    }
                    if (i8 != 0) {
                        int i9 = i8 - 1;
                        if (b >= -32) {
                            if (b >= -16) {
                                if (i9 < 3) {
                                    return write(j4, bArr, b, i9);
                                }
                                i8 -= 4;
                                byte bRemoteActionCompatParcelizer2 = getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j4, bArr);
                                if (bRemoteActionCompatParcelizer2 <= -65 && (((bRemoteActionCompatParcelizer2 + 112) + (b << 28)) >> 30) == 0 && getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j4 + 1, bArr) <= -65) {
                                    j = 3 + j4;
                                    if (getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j4 + 2, bArr) > -65) {
                                    }
                                    j4 = j;
                                }
                                return -1;
                            }
                            if (i9 < 2) {
                                return write(j4, bArr, b, i9);
                            }
                            i8 -= 3;
                            byte bRemoteActionCompatParcelizer3 = getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j4, bArr);
                            if (bRemoteActionCompatParcelizer3 <= -65 && ((b != -32 || bRemoteActionCompatParcelizer3 >= -96) && (b != -19 || bRemoteActionCompatParcelizer3 < -96))) {
                                j = j4 + 2;
                                if (getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j4 + 1, bArr) > -65) {
                                }
                                j4 = j;
                            }
                            return -1;
                        }
                        if (i9 == 0) {
                            return b;
                        }
                        i8 -= 2;
                        if (b < -62 || getLastLookaheadConstraintsDWUhwKw.RemoteActionCompatParcelizer(j4, bArr) > -65) {
                            return -1;
                        }
                        j4++;
                    }
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
                int i10 = i4 + 1;
                byte b2 = bArr[i4];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i10 >= i2) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i4 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                    } else if (b2 < -16) {
                        if (i10 >= i2 - 1) {
                            return getNextChildPlaceOrderui.RemoteActionCompatParcelizer(bArr, i10, i2);
                        }
                        byte b3 = bArr[i10];
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            i10 = i4 + 3;
                            if (bArr[i4 + 2] > -65) {
                            }
                        }
                    } else {
                        if (i10 >= i2 - 2) {
                            return getNextChildPlaceOrderui.RemoteActionCompatParcelizer(bArr, i10, i2);
                        }
                        byte b4 = bArr[i10];
                        if (b4 <= -65 && (((b4 + 112) + (b2 << 28)) >> 30) == 0 && bArr[i4 + 2] <= -65) {
                            i10 = i4 + 4;
                            if (bArr[i4 + 3] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                i4 = i10;
            }
        }
        return 0;
    }

    @Override // kotlin.text.RegexKt
    public final int RemoteActionCompatParcelizer(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        char c = 2048;
        char c2 = 57343;
        char c3 = 55296;
        if (this.RemoteActionCompatParcelizer != 0) {
            long j = i;
            long j2 = ((long) i2) + j;
            int length = str.length();
            if (length <= i2 && bArr.length - i2 >= i) {
                int i6 = 0;
                while (i6 < length && (cCharAt2 = str.charAt(i6)) < 128) {
                    getLastLookaheadConstraintsDWUhwKw.write(bArr, j, (byte) cCharAt2);
                    i6++;
                    j++;
                }
                if (i6 != length) {
                    while (i6 < length) {
                        char cCharAt3 = str.charAt(i6);
                        if (cCharAt3 < 128 && j < j2) {
                            getLastLookaheadConstraintsDWUhwKw.write(bArr, j, (byte) cCharAt3);
                            j++;
                        } else if (cCharAt3 < c && j <= j2 - 2) {
                            getLastLookaheadConstraintsDWUhwKw.write(bArr, j, (byte) ((cCharAt3 >>> 6) | 960));
                            getLastLookaheadConstraintsDWUhwKw.write(bArr, j + 1, (byte) ((cCharAt3 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            j += 2;
                        } else if ((cCharAt3 < c3 || c2 < cCharAt3) && j <= j2 - 3) {
                            getLastLookaheadConstraintsDWUhwKw.write(bArr, j, (byte) ((cCharAt3 >>> '\f') | 480));
                            getLastLookaheadConstraintsDWUhwKw.write(bArr, j + 1, (byte) (((cCharAt3 >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            getLastLookaheadConstraintsDWUhwKw.write(bArr, j + 2, (byte) ((cCharAt3 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            j += 3;
                        } else {
                            if (j <= j2 - 4) {
                                int i7 = i6 + 1;
                                if (i7 != length) {
                                    char cCharAt4 = str.charAt(i7);
                                    if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                        int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                        getLastLookaheadConstraintsDWUhwKw.write(bArr, j, (byte) ((codePoint >>> 18) | 240));
                                        getLastLookaheadConstraintsDWUhwKw.write(bArr, j + 1, (byte) (((codePoint >>> 12) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                                        getLastLookaheadConstraintsDWUhwKw.write(bArr, j + 2, (byte) (((codePoint >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                                        getLastLookaheadConstraintsDWUhwKw.write(bArr, j + 3, (byte) ((codePoint & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
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
}
