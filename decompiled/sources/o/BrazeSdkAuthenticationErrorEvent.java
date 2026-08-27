package o;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.protobuf.Utf8$UnpairedSurrogateException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeSdkAuthenticationErrorEvent {
    public final /* synthetic */ int read;

    public /* synthetic */ BrazeSdkAuthenticationErrorEvent(int i) {
        this.read = i;
    }

    public static int serializer(Context context, String str) {
        return RemoteActionCompatParcelizer(context, str, context.getPackageName(), Process.myPid(), Process.myUid());
    }

    public static int RemoteActionCompatParcelizer(Context context, String str, String str2, int i, int i2) {
        int iNoteProxyOpNoThrow;
        if (context.checkPermission(str, i, i2) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                int iMyUid = Process.myUid();
                String packageName = context.getPackageName();
                if (iMyUid == i2 && Objects.equals(packageName, str2) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), str2);
                    if (iNoteProxyOpNoThrow == 0) {
                        String strWrite = getXor.write(context);
                        if (appOpsManager == null) {
                            return -2;
                        }
                        iNoteProxyOpNoThrow = appOpsManager.checkOpNoThrow(strPermissionToOp, i2, strWrite);
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, str2);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public boolean serializer(byte[] bArr, int i, int i2) {
        int iRemoteActionCompatParcelizer;
        int i3;
        int i4 = i;
        if (this.read == 0) {
            while (i4 < i2 && bArr[i4] >= 0) {
                i4++;
            }
            if (i4 >= i2) {
                return true;
            }
            while (i4 < i2) {
                int i5 = i4 + 1;
                byte b = bArr[i4];
                if (b < 0) {
                    if (b < -32) {
                        if (i5 >= i2) {
                            iRemoteActionCompatParcelizer = b;
                        } else {
                            if (b < -62) {
                                return false;
                            }
                            i4 += 2;
                            if (bArr[i5] > -65) {
                                return false;
                            }
                        }
                    } else if (b < -16) {
                        if (i5 >= i2 - 1) {
                            iRemoteActionCompatParcelizer = getErrorReason.RemoteActionCompatParcelizer(bArr, i5, i2);
                        } else {
                            byte b2 = bArr[i5];
                            if (b2 > -65) {
                                return false;
                            }
                            if (b == -32 && b2 < -96) {
                                return false;
                            }
                            if (b == -19 && b2 >= -96) {
                                return false;
                            }
                            i5 = i4 + 3;
                            if (bArr[i4 + 2] > -65) {
                                return false;
                            }
                        }
                    } else if (i5 >= i2 - 2) {
                        iRemoteActionCompatParcelizer = getErrorReason.RemoteActionCompatParcelizer(bArr, i5, i2);
                    } else {
                        byte b3 = bArr[i5];
                        if (b3 > -65 || (((b3 + 112) + (b << 28)) >> 30) != 0 || bArr[i4 + 2] > -65) {
                            return false;
                        }
                        i5 = i4 + 4;
                        if (bArr[i4 + 3] > -65) {
                            return false;
                        }
                    }
                }
                i4 = i5;
            }
            return true;
        }
        if (((bArr.length - i2) | i4 | i2) < 0) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return true;
        }
        long j = i4;
        int i6 = (int) (((long) i2) - j);
        if (i6 >= 16) {
            int i7 = (int) j;
            long j2 = j;
            i3 = 0;
            while (true) {
                if (i3 >= 8 - (i7 & 7)) {
                    while (true) {
                        int i8 = i3 + 8;
                        if (i8 > i6) {
                            break;
                        }
                        if ((SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(SimpleValueCallback.MediaBrowserCompatMediaItem + j2, bArr) & (-9187201950435737472L)) != 0) {
                            break;
                        }
                        j2 += 8;
                        i3 = i8;
                    }
                    while (true) {
                        if (i3 >= i6) {
                            i3 = i6;
                            break;
                        }
                        if (SimpleValueCallback.IconCompatParcelizer(j2, bArr) < 0) {
                            break;
                        }
                        i3++;
                        j2++;
                    }
                } else {
                    if (SimpleValueCallback.IconCompatParcelizer(j2, bArr) < 0) {
                        break;
                    }
                    i3++;
                    j2++;
                }
            }
        } else {
            i3 = 0;
        }
        int i9 = i6 - i3;
        long j3 = j + ((long) i3);
        while (true) {
            iRemoteActionCompatParcelizer = 0;
            while (i9 > 0) {
                long j4 = j3 + 1;
                byte bIconCompatParcelizer = SimpleValueCallback.IconCompatParcelizer(j3, bArr);
                if (bIconCompatParcelizer < 0) {
                    j3 = j4;
                    iRemoteActionCompatParcelizer = bIconCompatParcelizer;
                    break;
                }
                i9--;
                j3 = j4;
                iRemoteActionCompatParcelizer = bIconCompatParcelizer;
            }
            if (i9 == 0) {
                return true;
            }
            int i10 = i9 - 1;
            if (iRemoteActionCompatParcelizer < -32) {
                if (i10 != 0) {
                    i9 -= 2;
                    if (iRemoteActionCompatParcelizer < -62 || SimpleValueCallback.IconCompatParcelizer(j3, bArr) > -65) {
                        return false;
                    }
                    j3++;
                }
            } else if (iRemoteActionCompatParcelizer < -16) {
                if (i10 < 2) {
                    iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j3, bArr, iRemoteActionCompatParcelizer, i10);
                } else {
                    i9 -= 3;
                    byte bIconCompatParcelizer2 = SimpleValueCallback.IconCompatParcelizer(j3, bArr);
                    if (bIconCompatParcelizer2 > -65) {
                        return false;
                    }
                    if (iRemoteActionCompatParcelizer == -32 && bIconCompatParcelizer2 < -96) {
                        return false;
                    }
                    if (iRemoteActionCompatParcelizer == -19 && bIconCompatParcelizer2 >= -96) {
                        return false;
                    }
                    long j5 = j3 + 2;
                    if (SimpleValueCallback.IconCompatParcelizer(j3 + 1, bArr) > -65) {
                        return false;
                    }
                    j3 = j5;
                }
            } else if (i10 < 3) {
                iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j3, bArr, iRemoteActionCompatParcelizer, i10);
            } else {
                i9 -= 4;
                byte bIconCompatParcelizer3 = SimpleValueCallback.IconCompatParcelizer(j3, bArr);
                if (bIconCompatParcelizer3 > -65 || (((bIconCompatParcelizer3 + 112) + (iRemoteActionCompatParcelizer << 28)) >> 30) != 0 || SimpleValueCallback.IconCompatParcelizer(j3 + 1, bArr) > -65) {
                    return false;
                }
                long j6 = 3 + j3;
                if (SimpleValueCallback.IconCompatParcelizer(j3 + 2, bArr) > -65) {
                    return false;
                }
                j3 = j6;
            }
        }
        return iRemoteActionCompatParcelizer == 0;
    }

    public final int read(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        char c = 2048;
        char c2 = 57343;
        char c3 = 55296;
        if (this.read != 0) {
            long j = i;
            long j2 = ((long) i2) + j;
            int length = str.length();
            if (length <= i2 && bArr.length - i2 >= i) {
                int i6 = 0;
                while (i6 < length && (cCharAt2 = str.charAt(i6)) < 128) {
                    SimpleValueCallback.RemoteActionCompatParcelizer(bArr, j, (byte) cCharAt2);
                    i6++;
                    j++;
                }
                if (i6 != length) {
                    while (i6 < length) {
                        char cCharAt3 = str.charAt(i6);
                        if (cCharAt3 < 128 && j < j2) {
                            SimpleValueCallback.RemoteActionCompatParcelizer(bArr, j, (byte) cCharAt3);
                            j++;
                        } else if (cCharAt3 < c && j <= j2 - 2) {
                            SimpleValueCallback.RemoteActionCompatParcelizer(bArr, j, (byte) ((cCharAt3 >>> 6) | 960));
                            SimpleValueCallback.RemoteActionCompatParcelizer(bArr, j + 1, (byte) ((cCharAt3 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            j += 2;
                        } else if ((cCharAt3 < c3 || c2 < cCharAt3) && j <= j2 - 3) {
                            SimpleValueCallback.RemoteActionCompatParcelizer(bArr, j, (byte) ((cCharAt3 >>> '\f') | 480));
                            SimpleValueCallback.RemoteActionCompatParcelizer(bArr, j + 1, (byte) (((cCharAt3 >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            SimpleValueCallback.RemoteActionCompatParcelizer(bArr, j + 2, (byte) ((cCharAt3 & '?') | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                            j += 3;
                        } else {
                            if (j <= j2 - 4) {
                                int i7 = i6 + 1;
                                if (i7 != length) {
                                    char cCharAt4 = str.charAt(i7);
                                    if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                        int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                        SimpleValueCallback.RemoteActionCompatParcelizer(bArr, j, (byte) ((codePoint >>> 18) | 240));
                                        SimpleValueCallback.RemoteActionCompatParcelizer(bArr, j + 1, (byte) (((codePoint >>> 12) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                                        SimpleValueCallback.RemoteActionCompatParcelizer(bArr, j + 2, (byte) (((codePoint >>> 6) & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
                                        SimpleValueCallback.RemoteActionCompatParcelizer(bArr, j + 3, (byte) ((codePoint & 63) | androidx.compose.ui.graphics.Fields.SpotShadowColor));
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

    public static String serializer(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (b < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (b2 >= 0) {
                    cArr[i5] = (char) b2;
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = byteBuffer.get(i);
                        if (b3 < 0) {
                            break;
                        }
                        i++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                } else if (b2 < -32) {
                    if (i6 < i3) {
                        i += 2;
                        getEventType.serializer(b2, byteBuffer.get(i6), cArr, i5);
                        i5++;
                    } else {
                        throw com.sentiance.protobuf.InvalidProtocolBufferException.read();
                    }
                } else if (b2 < -16) {
                    if (i6 < i3 - 1) {
                        getEventType.RemoteActionCompatParcelizer(b2, byteBuffer.get(i6), byteBuffer.get(i + 2), cArr, i5);
                        i5++;
                        i += 3;
                    } else {
                        throw com.sentiance.protobuf.InvalidProtocolBufferException.read();
                    }
                } else if (i6 < i3 - 2) {
                    getEventType.write(b2, byteBuffer.get(i6), byteBuffer.get(i + 2), byteBuffer.get(i + 3), cArr, i5);
                    i5 += 2;
                    i += 4;
                } else {
                    throw com.sentiance.protobuf.InvalidProtocolBufferException.read();
                }
            }
            return new String(cArr, 0, i5);
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
        return null;
    }

    public final String write(byte[] bArr, int i, int i2) {
        if (this.read != 0) {
            Charset charset = isFromOfflineStorage.read;
            String str = new String(bArr, i, i2, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw com.sentiance.protobuf.InvalidProtocolBufferException.read();
            }
            return str;
        }
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (b < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    cArr[i5] = (char) b2;
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 < 0) {
                            break;
                        }
                        i++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                } else if (b2 < -32) {
                    if (i6 < i3) {
                        i += 2;
                        getEventType.serializer(b2, bArr[i6], cArr, i5);
                        i5++;
                    } else {
                        throw com.sentiance.protobuf.InvalidProtocolBufferException.read();
                    }
                } else if (b2 < -16) {
                    if (i6 < i3 - 1) {
                        getEventType.RemoteActionCompatParcelizer(b2, bArr[i6], bArr[i + 2], cArr, i5);
                        i5++;
                        i += 3;
                    } else {
                        throw com.sentiance.protobuf.InvalidProtocolBufferException.read();
                    }
                } else if (i6 < i3 - 2) {
                    getEventType.write(b2, bArr[i6], bArr[i + 2], bArr[i + 3], cArr, i5);
                    i5 += 2;
                    i += 4;
                } else {
                    throw com.sentiance.protobuf.InvalidProtocolBufferException.read();
                }
            }
            return new String(cArr, 0, i5);
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
        return null;
    }

    public static int RemoteActionCompatParcelizer(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            BrazeSdkAuthenticationErrorEvent brazeSdkAuthenticationErrorEvent = getErrorReason.read;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return getErrorReason.RemoteActionCompatParcelizer(i, SimpleValueCallback.IconCompatParcelizer(j, bArr));
        }
        if (i2 == 2) {
            return getErrorReason.read(i, SimpleValueCallback.IconCompatParcelizer(j, bArr), SimpleValueCallback.IconCompatParcelizer(j + 1, bArr));
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
        return 0;
    }
}
