package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class getLocalBitmaplambda1 extends getDisplayHeightAndWidthPixels {
    public static final RequestBuilder MediaBrowserCompatMediaItem;
    public static final RequestBuilder MediaMetadataCompat;
    public static final RequestBuilder MediaSessionCompatQueueItem;
    public static final RequestBuilder MediaSessionCompatResultReceiverWrapper;
    public static final RequestBuilder RatingCompat;
    public long MediaSessionCompatToken;
    public final RegistryMissingComponentException ParcelableVolumeInfo;
    public int PlaybackStateCompat = 0;
    public int PlaybackStateCompatCustomAction;
    public final RegistryNoSourceEncoderAvailableException ResultReceiver;
    public String r8lambda54BeH8ZsBru0CXI2CCSP2syNys;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.PlaybackStateCompat = 0;
        this.read[0] = 8;
        this.MediaDescriptionCompat = 1;
        this.ParcelableVolumeInfo.serializer();
        this.ResultReceiver.close();
    }

    public final int IconCompatParcelizer(String str, getLocalBitmap getlocalbitmap) {
        int length = getlocalbitmap.RemoteActionCompatParcelizer.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(getlocalbitmap.RemoteActionCompatParcelizer[i])) {
                this.PlaybackStateCompat = 0;
                int[] iArr = this.serializer;
                int i2 = this.MediaDescriptionCompat - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:163:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:174:0x01fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:175:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:177:0x020b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0213  */
    /* JADX WARN: Code duplicated, block: B:236:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0127 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x0139  */
    /* JADX WARN: Code duplicated, block: B:97:0x0142  */
    public final int ResultReceiver() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int i;
        String str;
        String str2;
        int i2;
        char cIconCompatParcelizer;
        int i3;
        char c;
        int i4;
        int i5;
        byte bIconCompatParcelizer;
        char c2;
        int[] iArr = this.read;
        int i6 = this.MediaDescriptionCompat - 1;
        int i7 = iArr[i6];
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.ResultReceiver;
        RegistryMissingComponentException registryMissingComponentException = this.ParcelableVolumeInfo;
        if (i7 == 1) {
            iArr[i6] = 2;
        } else if (i7 == 2) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(true);
            registryMissingComponentException.MediaBrowserCompatMediaItem();
            if (iRemoteActionCompatParcelizer != 44) {
                if (iRemoteActionCompatParcelizer != 59) {
                    if (iRemoteActionCompatParcelizer == 93) {
                        this.PlaybackStateCompat = 4;
                        return 4;
                    }
                    serializer("Unterminated array");
                    throw null;
                }
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            }
        } else {
            if (i7 == 3 || i7 == 5) {
                iArr[i6] = 4;
                if (i7 == 5) {
                    int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(true);
                    registryMissingComponentException.MediaBrowserCompatMediaItem();
                    if (iRemoteActionCompatParcelizer2 != 44) {
                        if (iRemoteActionCompatParcelizer2 != 59) {
                            if (iRemoteActionCompatParcelizer2 == 125) {
                                this.PlaybackStateCompat = 2;
                                return 2;
                            }
                            serializer("Unterminated object");
                            throw null;
                        }
                        r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    }
                }
                int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(true);
                if (iRemoteActionCompatParcelizer3 == 34) {
                    registryMissingComponentException.MediaBrowserCompatMediaItem();
                    this.PlaybackStateCompat = 13;
                    return 13;
                }
                if (iRemoteActionCompatParcelizer3 == 39) {
                    registryMissingComponentException.MediaBrowserCompatMediaItem();
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    this.PlaybackStateCompat = 12;
                    return 12;
                }
                if (iRemoteActionCompatParcelizer3 != 125) {
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    if (serializer((char) iRemoteActionCompatParcelizer3)) {
                        this.PlaybackStateCompat = 14;
                        return 14;
                    }
                    serializer("Expected name");
                    throw null;
                }
                if (i7 == 5) {
                    serializer("Expected name");
                    throw null;
                }
                registryMissingComponentException.MediaBrowserCompatMediaItem();
                this.PlaybackStateCompat = 2;
                return 2;
            }
            if (i7 == 4) {
                iArr[i6] = 5;
                int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(true);
                registryMissingComponentException.MediaBrowserCompatMediaItem();
                if (iRemoteActionCompatParcelizer4 != 58) {
                    if (iRemoteActionCompatParcelizer4 != 61) {
                        serializer("Expected ':'");
                        throw null;
                    }
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    if (registryNoSourceEncoderAvailableException.write(1L) && registryMissingComponentException.IconCompatParcelizer(0L) == 62) {
                        registryMissingComponentException.MediaBrowserCompatMediaItem();
                    }
                }
            } else if (i7 == 6) {
                iArr[i6] = 7;
            } else if (i7 == 7) {
                if (RemoteActionCompatParcelizer(false) == -1) {
                    this.PlaybackStateCompat = 18;
                    return 18;
                }
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            } else {
                if (i7 == 9) {
                    throw null;
                }
                if (i7 == 8) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(true);
        if (iRemoteActionCompatParcelizer5 == 34) {
            registryMissingComponentException.MediaBrowserCompatMediaItem();
            this.PlaybackStateCompat = 9;
            return 9;
        }
        if (iRemoteActionCompatParcelizer5 == 39) {
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            registryMissingComponentException.MediaBrowserCompatMediaItem();
            this.PlaybackStateCompat = 8;
            return 8;
        }
        if (iRemoteActionCompatParcelizer5 != 44 && iRemoteActionCompatParcelizer5 != 59) {
            if (iRemoteActionCompatParcelizer5 == 91) {
                registryMissingComponentException.MediaBrowserCompatMediaItem();
                this.PlaybackStateCompat = 3;
                return 3;
            }
            if (iRemoteActionCompatParcelizer5 != 93) {
                if (iRemoteActionCompatParcelizer5 == 123) {
                    registryMissingComponentException.MediaBrowserCompatMediaItem();
                    this.PlaybackStateCompat = 1;
                    return 1;
                }
                byte bIconCompatParcelizer2 = registryMissingComponentException.IconCompatParcelizer(0L);
                if (bIconCompatParcelizer2 == 116 || bIconCompatParcelizer2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bIconCompatParcelizer2 != 102 && bIconCompatParcelizer2 != 70) {
                        if (bIconCompatParcelizer2 != 110 && bIconCompatParcelizer2 != 78) {
                            i2 = 0;
                            break;
                        }
                        i = 7;
                        str2 = "null";
                        str = "NULL";
                        if (i2 != 0) {
                            return i2;
                        }
                        boolean z = true;
                        i3 = 0;
                        boolean z2 = false;
                        long j = 0;
                        c = 0;
                        while (true) {
                            i4 = i3 + 1;
                            if (registryNoSourceEncoderAvailableException.write(i4)) {
                                bIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer(i3);
                                if (bIconCompatParcelizer != 43) {
                                    if (bIconCompatParcelizer != 69 || bIconCompatParcelizer == 101) {
                                        if (c != 2 || c == 4) {
                                            c = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = 0;
                                        }
                                    } else if (bIconCompatParcelizer == 45) {
                                        c2 = 6;
                                        if (c == 0) {
                                            z2 = true;
                                            c = 1;
                                        } else {
                                            if (c != 5) {
                                                i5 = 0;
                                            }
                                            c = c2;
                                        }
                                        i3 = i4;
                                    } else if (bIconCompatParcelizer != 46) {
                                        if (bIconCompatParcelizer >= 48 && bIconCompatParcelizer <= 57) {
                                            if (c == 1 || c == 0) {
                                                j = -(bIconCompatParcelizer - 48);
                                                c = 2;
                                            } else if (c == 2) {
                                                if (j != 0) {
                                                    long j2 = (10 * j) - ((long) (bIconCompatParcelizer - 48));
                                                    z = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) & z;
                                                    j = j2;
                                                }
                                            } else if (c == 3) {
                                                c = 4;
                                            } else if (c == 5 || c == 6) {
                                                c = 7;
                                            }
                                            i3 = i4;
                                        } else if (!serializer(bIconCompatParcelizer)) {
                                        }
                                        i5 = 0;
                                    } else if (c == 2) {
                                        c = 3;
                                        i3 = i4;
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (serializer(registryMissingComponentException.IconCompatParcelizer(0L))) {
                                        serializer("Expected value");
                                        throw null;
                                    }
                                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                    this.PlaybackStateCompat = 10;
                                    return 10;
                                }
                                c2 = 6;
                                if (c != 5) {
                                    i5 = 0;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (serializer(registryMissingComponentException.IconCompatParcelizer(0L))) {
                                        serializer("Expected value");
                                        throw null;
                                    }
                                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                    this.PlaybackStateCompat = 10;
                                    return 10;
                                }
                                c = c2;
                                i3 = i4;
                            }
                            if (c != 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
                                if (!z2) {
                                    j = -j;
                                }
                                this.MediaSessionCompatToken = j;
                                registryMissingComponentException.RatingCompat(i3);
                                this.PlaybackStateCompat = 16;
                                i5 = 16;
                            } else if (c != 2 || c == 4 || c == 7) {
                                this.PlaybackStateCompatCustomAction = i3;
                                this.PlaybackStateCompat = 17;
                                i5 = 17;
                            } else {
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (serializer(registryMissingComponentException.IconCompatParcelizer(0L))) {
                                serializer("Expected value");
                                throw null;
                            }
                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                            this.PlaybackStateCompat = 10;
                            return 10;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                int i8 = 1;
                while (true) {
                    if (i8 >= length) {
                        if (!registryNoSourceEncoderAvailableException.write(length + 1) || !serializer(registryMissingComponentException.IconCompatParcelizer(length))) {
                            registryMissingComponentException.RatingCompat(length);
                            this.PlaybackStateCompat = i;
                            i2 = i;
                            break;
                        }
                    } else {
                        int i9 = i8 + 1;
                        if (registryNoSourceEncoderAvailableException.write(i9) && ((cIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer(i8)) == str2.charAt(i8) || cIconCompatParcelizer == str.charAt(i8))) {
                            i8 = i9;
                        }
                    }
                    i2 = 0;
                    break;
                }
                if (i2 != 0) {
                    return i2;
                }
                boolean z3 = true;
                i3 = 0;
                boolean z4 = false;
                long j3 = 0;
                c = 0;
                while (true) {
                    i4 = i3 + 1;
                    if (registryNoSourceEncoderAvailableException.write(i4)) {
                        bIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer(i3);
                        if (bIconCompatParcelizer != 43) {
                            if (bIconCompatParcelizer != 69) {
                                if (c != 2) {
                                }
                                c = 5;
                                i3 = i4;
                            } else {
                                if (c != 2) {
                                }
                                c = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (serializer(registryMissingComponentException.IconCompatParcelizer(0L))) {
                                serializer("Expected value");
                                throw null;
                            }
                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                            this.PlaybackStateCompat = 10;
                            return 10;
                        }
                        c2 = 6;
                        if (c != 5) {
                            i5 = 0;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (serializer(registryMissingComponentException.IconCompatParcelizer(0L))) {
                                serializer("Expected value");
                                throw null;
                            }
                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                            this.PlaybackStateCompat = 10;
                            return 10;
                        }
                        c = c2;
                        i3 = i4;
                    }
                    if (c != 2) {
                        if (c != 2) {
                        }
                        this.PlaybackStateCompatCustomAction = i3;
                        this.PlaybackStateCompat = 17;
                        i5 = 17;
                    } else {
                        if (c != 2) {
                        }
                        this.PlaybackStateCompatCustomAction = i3;
                        this.PlaybackStateCompat = 17;
                        i5 = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (serializer(registryMissingComponentException.IconCompatParcelizer(0L))) {
                        serializer("Expected value");
                        throw null;
                    }
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    this.PlaybackStateCompat = 10;
                    return 10;
                }
            }
            if (i7 == 1) {
                registryMissingComponentException.MediaBrowserCompatMediaItem();
                this.PlaybackStateCompat = 4;
                return 4;
            }
        }
        if (i7 != 1 && i7 != 2) {
            serializer("Unexpected value");
            throw null;
        }
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        this.PlaybackStateCompat = 7;
        return 7;
    }

    public final String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        long jWrite = this.ResultReceiver.write(MediaSessionCompatResultReceiverWrapper);
        RegistryMissingComponentException registryMissingComponentException = this.ParcelableVolumeInfo;
        if (jWrite == -1) {
            return registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        }
        registryMissingComponentException.getClass();
        return registryMissingComponentException.read(jWrite, ensureSubscribedToInAppMessageEvents.write);
    }

    public final char r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int i;
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = this.ResultReceiver;
        if (!registryNoSourceEncoderAvailableException.write(1L)) {
            serializer("Unterminated escape sequence");
            throw null;
        }
        RegistryMissingComponentException registryMissingComponentException = this.ParcelableVolumeInfo;
        byte bMediaBrowserCompatMediaItem = registryMissingComponentException.MediaBrowserCompatMediaItem();
        if (bMediaBrowserCompatMediaItem == 10 || bMediaBrowserCompatMediaItem == 34 || bMediaBrowserCompatMediaItem == 39 || bMediaBrowserCompatMediaItem == 47 || bMediaBrowserCompatMediaItem == 92) {
            return (char) bMediaBrowserCompatMediaItem;
        }
        if (bMediaBrowserCompatMediaItem == 98) {
            return '\b';
        }
        if (bMediaBrowserCompatMediaItem == 102) {
            return '\f';
        }
        if (bMediaBrowserCompatMediaItem == 110) {
            return '\n';
        }
        if (bMediaBrowserCompatMediaItem == 114) {
            return '\r';
        }
        if (bMediaBrowserCompatMediaItem == 116) {
            return '\t';
        }
        if (bMediaBrowserCompatMediaItem != 117) {
            if (this.write) {
                return (char) bMediaBrowserCompatMediaItem;
            }
            serializer("Invalid escape sequence: \\" + ((char) bMediaBrowserCompatMediaItem));
            throw null;
        }
        if (!registryNoSourceEncoderAvailableException.write(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(RemoteActionCompatParcelizer()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer(i2);
            char c2 = (char) (c << 4);
            if (bIconCompatParcelizer >= 48 && bIconCompatParcelizer <= 57) {
                i = bIconCompatParcelizer - 48;
            } else if (bIconCompatParcelizer >= 97 && bIconCompatParcelizer <= 102) {
                i = bIconCompatParcelizer - 87;
            } else {
                if (bIconCompatParcelizer < 65 || bIconCompatParcelizer > 70) {
                    serializer("\\u".concat(registryMissingComponentException.read(4L, ensureSubscribedToInAppMessageEvents.write)));
                    throw null;
                }
                i = bIconCompatParcelizer - 55;
            }
            c = (char) (i + c2);
        }
        registryMissingComponentException.RatingCompat(4L);
        return c;
    }

    public final int serializer(String str, getLocalBitmap getlocalbitmap) {
        int length = getlocalbitmap.RemoteActionCompatParcelizer.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(getlocalbitmap.RemoteActionCompatParcelizer[i])) {
                this.PlaybackStateCompat = 0;
                this.IconCompatParcelizer[this.MediaDescriptionCompat - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final String serializer(RequestBuilder requestBuilder) throws EOFException, com.squareup.moshi.JsonEncodingException {
        StringBuilder sb = null;
        while (true) {
            long jWrite = this.ResultReceiver.write(requestBuilder);
            if (jWrite == -1) {
                serializer("Unterminated string");
                throw null;
            }
            RegistryMissingComponentException registryMissingComponentException = this.ParcelableVolumeInfo;
            if (registryMissingComponentException.IconCompatParcelizer(jWrite) != 92) {
                if (sb == null) {
                    String str = registryMissingComponentException.read(jWrite, ensureSubscribedToInAppMessageEvents.write);
                    registryMissingComponentException.MediaBrowserCompatMediaItem();
                    return str;
                }
                sb.append(registryMissingComponentException.read(jWrite, ensureSubscribedToInAppMessageEvents.write));
                registryMissingComponentException.MediaBrowserCompatMediaItem();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(registryMissingComponentException.read(jWrite, ensureSubscribedToInAppMessageEvents.write));
            registryMissingComponentException.MediaBrowserCompatMediaItem();
            sb.append(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
        }
    }

    public final void write(RequestBuilder requestBuilder) throws EOFException, com.squareup.moshi.JsonEncodingException {
        while (true) {
            long jWrite = this.ResultReceiver.write(requestBuilder);
            if (jWrite == -1) {
                serializer("Unterminated string");
                throw null;
            }
            RegistryMissingComponentException registryMissingComponentException = this.ParcelableVolumeInfo;
            if (registryMissingComponentException.IconCompatParcelizer(jWrite) != 92) {
                registryMissingComponentException.RatingCompat(jWrite + 1);
                return;
            } else {
                registryMissingComponentException.RatingCompat(jWrite + 1);
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            }
        }
    }

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        MediaMetadataCompat = ImageHeaderParserImageType.serializer("'\\");
        RatingCompat = ImageHeaderParserImageType.serializer("\"\\");
        MediaSessionCompatResultReceiverWrapper = ImageHeaderParserImageType.serializer("{}[]:, \n\t\r\f/\\;#=");
        MediaSessionCompatQueueItem = ImageHeaderParserImageType.serializer("\n\r");
        MediaBrowserCompatMediaItem = ImageHeaderParserImageType.serializer("*/");
    }

    public getLocalBitmaplambda1(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException) {
        if (registryNoSourceEncoderAvailableException == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("source == null");
            throw null;
        }
        this.ResultReceiver = registryNoSourceEncoderAvailableException;
        this.ParcelableVolumeInfo = registryNoSourceEncoderAvailableException.MediaSessionCompatQueueItem();
        write(6);
    }

    public final String ComponentActivity() throws EOFException, com.squareup.moshi.JsonEncodingException {
        String strSerializer;
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver == 14) {
            strSerializer = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        } else if (iResultReceiver == 13) {
            strSerializer = serializer(RatingCompat);
        } else if (iResultReceiver == 12) {
            strSerializer = serializer(MediaMetadataCompat);
        } else {
            if (iResultReceiver != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(MediaSessionCompatToken());
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at path ", RemoteActionCompatParcelizer());
                return null;
            }
            strSerializer = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        }
        this.PlaybackStateCompat = 0;
        this.IconCompatParcelizer[this.MediaDescriptionCompat - 1] = strSerializer;
        return strSerializer;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void IconCompatParcelizer() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(MediaSessionCompatToken());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at path ", RemoteActionCompatParcelizer());
            return;
        }
        int i = this.MediaDescriptionCompat;
        int i2 = i - 1;
        this.MediaDescriptionCompat = i2;
        this.IconCompatParcelizer[i2] = null;
        int[] iArr = this.serializer;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.PlaybackStateCompat = 0;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final boolean MediaBrowserCompatMediaItem() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        return (iResultReceiver == 2 || iResultReceiver == 4 || iResultReceiver == 18) ? false : true;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final long MediaDescriptionCompat() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver == 16) {
            this.PlaybackStateCompat = 0;
            int[] iArr = this.serializer;
            int i = this.MediaDescriptionCompat - 1;
            iArr[i] = iArr[i] + 1;
            return this.MediaSessionCompatToken;
        }
        if (iResultReceiver == 17) {
            long j = this.PlaybackStateCompatCustomAction;
            RegistryMissingComponentException registryMissingComponentException = this.ParcelableVolumeInfo;
            registryMissingComponentException.getClass();
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = registryMissingComponentException.read(j, ensureSubscribedToInAppMessageEvents.write);
        } else if (iResultReceiver == 9 || iResultReceiver == 8) {
            String strSerializer = iResultReceiver == 9 ? serializer(RatingCompat) : serializer(MediaMetadataCompat);
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = strSerializer;
            try {
                long j2 = Long.parseLong(strSerializer);
                this.PlaybackStateCompat = 0;
                int[] iArr2 = this.serializer;
                int i2 = this.MediaDescriptionCompat - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        } else if (iResultReceiver != 11) {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(MediaSessionCompatToken());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at path ", RemoteActionCompatParcelizer());
            return 0L;
        }
        this.PlaybackStateCompat = 11;
        try {
            long jLongValueExact = new BigDecimal(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).longValueExact();
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
            this.PlaybackStateCompat = 0;
            int[] iArr3 = this.serializer;
            int i3 = this.MediaDescriptionCompat - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Expected a long but was ", this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, RemoteActionCompatParcelizer());
            return 0L;
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final double MediaMetadataCompat() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver == 16) {
            this.PlaybackStateCompat = 0;
            int[] iArr = this.serializer;
            int i = this.MediaDescriptionCompat - 1;
            iArr[i] = iArr[i] + 1;
            return this.MediaSessionCompatToken;
        }
        if (iResultReceiver == 17) {
            long j = this.PlaybackStateCompatCustomAction;
            RegistryMissingComponentException registryMissingComponentException = this.ParcelableVolumeInfo;
            registryMissingComponentException.getClass();
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = registryMissingComponentException.read(j, ensureSubscribedToInAppMessageEvents.write);
        } else if (iResultReceiver == 9) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = serializer(RatingCompat);
        } else if (iResultReceiver == 8) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = serializer(MediaMetadataCompat);
        } else if (iResultReceiver == 10) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        } else if (iResultReceiver != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(MediaSessionCompatToken());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at path ", RemoteActionCompatParcelizer());
            return 0.0d;
        }
        this.PlaybackStateCompat = 11;
        try {
            double d = Double.parseDouble(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            if (!this.write && (Double.isNaN(d) || Double.isInfinite(d))) {
                StringBuilder sbM = af$$ExternalSyntheticOutline0.m(d, "JSON forbids NaN and infinities: ", " at path ");
                sbM.append(RemoteActionCompatParcelizer());
                throw new com.squareup.moshi.JsonEncodingException(sbM.toString());
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
            this.PlaybackStateCompat = 0;
            int[] iArr2 = this.serializer;
            int i2 = this.MediaDescriptionCompat - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Expected a double but was ", this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, RemoteActionCompatParcelizer());
            return 0.0d;
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final int MediaSessionCompatQueueItem() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver == 16) {
            long j = this.MediaSessionCompatToken;
            int i = (int) j;
            if (j == i) {
                this.PlaybackStateCompat = 0;
                int[] iArr = this.serializer;
                int i2 = this.MediaDescriptionCompat - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new com.squareup.moshi.JsonDataException("Expected an int but was " + j + " at path " + RemoteActionCompatParcelizer());
        }
        if (iResultReceiver == 17) {
            long j2 = this.PlaybackStateCompatCustomAction;
            RegistryMissingComponentException registryMissingComponentException = this.ParcelableVolumeInfo;
            registryMissingComponentException.getClass();
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = registryMissingComponentException.read(j2, ensureSubscribedToInAppMessageEvents.write);
        } else if (iResultReceiver == 9 || iResultReceiver == 8) {
            String strSerializer = iResultReceiver == 9 ? serializer(RatingCompat) : serializer(MediaMetadataCompat);
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = strSerializer;
            try {
                int i3 = Integer.parseInt(strSerializer);
                this.PlaybackStateCompat = 0;
                int[] iArr2 = this.serializer;
                int i4 = this.MediaDescriptionCompat - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iResultReceiver != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(MediaSessionCompatToken());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at path ", RemoteActionCompatParcelizer());
            return 0;
        }
        this.PlaybackStateCompat = 11;
        try {
            double d = Double.parseDouble(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            int i5 = (int) d;
            if (i5 != d) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Expected an int but was ", this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, RemoteActionCompatParcelizer());
                return 0;
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
            this.PlaybackStateCompat = 0;
            int[] iArr3 = this.serializer;
            int i6 = this.MediaDescriptionCompat - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Expected an int but was ", this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, RemoteActionCompatParcelizer());
            return 0;
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void MediaSessionCompatResultReceiverWrapper() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(MediaSessionCompatToken());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at path ", RemoteActionCompatParcelizer());
        } else {
            this.PlaybackStateCompat = 0;
            int[] iArr = this.serializer;
            int i = this.MediaDescriptionCompat - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final getLocalBitmaplambda3 MediaSessionCompatToken() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        switch (iResultReceiver) {
            case 1:
                return getLocalBitmaplambda3.BEGIN_OBJECT;
            case 2:
                return getLocalBitmaplambda3.END_OBJECT;
            case 3:
                return getLocalBitmaplambda3.BEGIN_ARRAY;
            case 4:
                return getLocalBitmaplambda3.END_ARRAY;
            case 5:
            case 6:
                return getLocalBitmaplambda3.BOOLEAN;
            case 7:
                return getLocalBitmaplambda3.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return getLocalBitmaplambda3.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return getLocalBitmaplambda3.NAME;
            case 16:
            case 17:
                return getLocalBitmaplambda3.NUMBER;
            case 18:
                return getLocalBitmaplambda3.END_DOCUMENT;
            default:
                int iSerializer = isAppSetIdReadingEnabled.serializer();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
                return null;
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final String PlaybackStateCompat() throws EOFException, com.squareup.moshi.JsonEncodingException {
        String string;
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver == 10) {
            string = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        } else if (iResultReceiver == 9) {
            string = serializer(RatingCompat);
        } else if (iResultReceiver == 8) {
            string = serializer(MediaMetadataCompat);
        } else if (iResultReceiver == 11) {
            string = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        } else if (iResultReceiver == 16) {
            string = Long.toString(this.MediaSessionCompatToken);
        } else {
            if (iResultReceiver != 17) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(MediaSessionCompatToken());
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at path ", RemoteActionCompatParcelizer());
                return null;
            }
            long j = this.PlaybackStateCompatCustomAction;
            RegistryMissingComponentException registryMissingComponentException = this.ParcelableVolumeInfo;
            registryMissingComponentException.getClass();
            string = registryMissingComponentException.read(j, ensureSubscribedToInAppMessageEvents.write);
        }
        this.PlaybackStateCompat = 0;
        int[] iArr = this.serializer;
        int i = this.MediaDescriptionCompat - 1;
        iArr[i] = iArr[i] + 1;
        return string;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void PlaybackStateCompatCustomAction() throws EOFException, com.squareup.moshi.JsonEncodingException {
        if (this.RemoteActionCompatParcelizer) {
            getLocalBitmaplambda3 getlocalbitmaplambda3MediaSessionCompatToken = MediaSessionCompatToken();
            ComponentActivity();
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(getlocalbitmaplambda3MediaSessionCompatToken);
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at ", RemoteActionCompatParcelizer());
            return;
        }
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver == 14) {
            long jWrite = this.ResultReceiver.write(MediaSessionCompatResultReceiverWrapper);
            RegistryMissingComponentException registryMissingComponentException = this.ParcelableVolumeInfo;
            if (jWrite == -1) {
                jWrite = registryMissingComponentException.size;
            }
            registryMissingComponentException.RatingCompat(jWrite);
        } else if (iResultReceiver == 13) {
            write(RatingCompat);
        } else if (iResultReceiver == 12) {
            write(MediaMetadataCompat);
        } else if (iResultReceiver != 15) {
            StringBuilder sb2 = new StringBuilder("Expected a name but was ");
            sb2.append(MediaSessionCompatToken());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb2, " at path ", RemoteActionCompatParcelizer());
            return;
        }
        this.PlaybackStateCompat = 0;
        this.IconCompatParcelizer[this.MediaDescriptionCompat - 1] = "null";
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final boolean RatingCompat() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver == 5) {
            this.PlaybackStateCompat = 0;
            int[] iArr = this.serializer;
            int i = this.MediaDescriptionCompat - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iResultReceiver != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(MediaSessionCompatToken());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at path ", RemoteActionCompatParcelizer());
            return false;
        }
        this.PlaybackStateCompat = 0;
        int[] iArr2 = this.serializer;
        int i2 = this.MediaDescriptionCompat - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void read() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver == 1) {
            write(3);
            this.PlaybackStateCompat = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(MediaSessionCompatToken());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at path ", RemoteActionCompatParcelizer());
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final int serializer(getLocalBitmap getlocalbitmap) throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver < 12 || iResultReceiver > 15) {
            return -1;
        }
        if (iResultReceiver == 15) {
            return serializer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, getlocalbitmap);
        }
        int iSerializer = this.ResultReceiver.serializer(getlocalbitmap.read);
        if (iSerializer != -1) {
            this.PlaybackStateCompat = 0;
            this.IconCompatParcelizer[this.MediaDescriptionCompat - 1] = getlocalbitmap.RemoteActionCompatParcelizer[iSerializer];
            return iSerializer;
        }
        String str = this.IconCompatParcelizer[this.MediaDescriptionCompat - 1];
        String strComponentActivity = ComponentActivity();
        int iSerializer2 = serializer(strComponentActivity, getlocalbitmap);
        if (iSerializer2 == -1) {
            this.PlaybackStateCompat = 15;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = strComponentActivity;
            this.IconCompatParcelizer[this.MediaDescriptionCompat - 1] = str;
        }
        return iSerializer2;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void serializer() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver == 3) {
            write(1);
            this.serializer[this.MediaDescriptionCompat - 1] = 0;
            this.PlaybackStateCompat = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(MediaSessionCompatToken());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at path ", RemoteActionCompatParcelizer());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.ResultReceiver + ")";
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final int write(getLocalBitmap getlocalbitmap) throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver < 8 || iResultReceiver > 11) {
            return -1;
        }
        if (iResultReceiver == 11) {
            return IconCompatParcelizer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, getlocalbitmap);
        }
        int iSerializer = this.ResultReceiver.serializer(getlocalbitmap.read);
        if (iSerializer != -1) {
            this.PlaybackStateCompat = 0;
            int[] iArr = this.serializer;
            int i = this.MediaDescriptionCompat - 1;
            iArr[i] = iArr[i] + 1;
            return iSerializer;
        }
        String strPlaybackStateCompat = PlaybackStateCompat();
        int iIconCompatParcelizer = IconCompatParcelizer(strPlaybackStateCompat, getlocalbitmap);
        if (iIconCompatParcelizer == -1) {
            this.PlaybackStateCompat = 11;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = strPlaybackStateCompat;
            int[] iArr2 = this.serializer;
            int i2 = this.MediaDescriptionCompat - 1;
            iArr2[i2] = iArr2[i2] - 1;
        }
        return iIconCompatParcelizer;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void write() throws EOFException, com.squareup.moshi.JsonEncodingException {
        int iResultReceiver = this.PlaybackStateCompat;
        if (iResultReceiver == 0) {
            iResultReceiver = ResultReceiver();
        }
        if (iResultReceiver != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(MediaSessionCompatToken());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at path ", RemoteActionCompatParcelizer());
        } else {
            int i = this.MediaDescriptionCompat;
            this.MediaDescriptionCompat = i - 1;
            int[] iArr = this.serializer;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.PlaybackStateCompat = 0;
        }
    }

    public final int RemoteActionCompatParcelizer(boolean z) throws EOFException, com.squareup.moshi.JsonEncodingException {
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException;
        long j;
        RegistryMissingComponentException registryMissingComponentException;
        byte bIconCompatParcelizer;
        long length;
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                registryNoSourceEncoderAvailableException = this.ResultReceiver;
                if (!registryNoSourceEncoderAvailableException.write(i2)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                j = i;
                registryMissingComponentException = this.ParcelableVolumeInfo;
                bIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer(j);
                if (bIconCompatParcelizer == 10 || bIconCompatParcelizer == 32 || bIconCompatParcelizer == 13 || bIconCompatParcelizer == 9) {
                    i = i2;
                }
            }
            registryMissingComponentException.RatingCompat(j);
            RequestBuilder requestBuilder = MediaSessionCompatQueueItem;
            if (bIconCompatParcelizer == 47) {
                if (registryNoSourceEncoderAvailableException.write(2L)) {
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                    byte bIconCompatParcelizer2 = registryMissingComponentException.IconCompatParcelizer(1L);
                    if (bIconCompatParcelizer2 == 42) {
                        registryMissingComponentException.MediaBrowserCompatMediaItem();
                        registryMissingComponentException.MediaBrowserCompatMediaItem();
                        RequestBuilder requestBuilder2 = MediaBrowserCompatMediaItem;
                        long jRemoteActionCompatParcelizer = registryNoSourceEncoderAvailableException.RemoteActionCompatParcelizer(requestBuilder2);
                        boolean z2 = jRemoteActionCompatParcelizer != -1;
                        if (z2) {
                            length = jRemoteActionCompatParcelizer + ((long) requestBuilder2.data.length);
                        } else {
                            length = registryMissingComponentException.size;
                        }
                        registryMissingComponentException.RatingCompat(length);
                        if (!z2) {
                            serializer("Unterminated comment");
                            throw null;
                        }
                    } else if (bIconCompatParcelizer2 == 47) {
                        registryMissingComponentException.MediaBrowserCompatMediaItem();
                        registryMissingComponentException.MediaBrowserCompatMediaItem();
                        long jWrite = registryNoSourceEncoderAvailableException.write(requestBuilder);
                        registryMissingComponentException.RatingCompat(jWrite != -1 ? jWrite + 1 : registryMissingComponentException.size);
                    }
                }
                return bIconCompatParcelizer;
            }
            if (bIconCompatParcelizer != 35) {
                return bIconCompatParcelizer;
            }
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            long jWrite2 = registryNoSourceEncoderAvailableException.write(requestBuilder);
            registryMissingComponentException.RatingCompat(jWrite2 != -1 ? jWrite2 + 1 : registryMissingComponentException.size);
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void ParcelableVolumeInfo() {
        if (MediaBrowserCompatMediaItem()) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = ComponentActivity();
            this.PlaybackStateCompat = 11;
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() throws EOFException, com.squareup.moshi.JsonEncodingException {
        if (this.RemoteActionCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(MediaSessionCompatToken());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb, " at ", RemoteActionCompatParcelizer());
            return;
        }
        int i = 0;
        do {
            int iResultReceiver = this.PlaybackStateCompat;
            if (iResultReceiver == 0) {
                iResultReceiver = ResultReceiver();
            }
            if (iResultReceiver == 3) {
                write(1);
            } else {
                if (iResultReceiver == 1) {
                    write(3);
                } else if (iResultReceiver == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(MediaSessionCompatToken());
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb2, " at path ", RemoteActionCompatParcelizer());
                        return;
                    }
                    this.MediaDescriptionCompat--;
                } else if (iResultReceiver == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(MediaSessionCompatToken());
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb3, " at path ", RemoteActionCompatParcelizer());
                        return;
                    }
                    this.MediaDescriptionCompat--;
                } else {
                    RegistryMissingComponentException registryMissingComponentException = this.ParcelableVolumeInfo;
                    if (iResultReceiver == 14 || iResultReceiver == 10) {
                        long jWrite = this.ResultReceiver.write(MediaSessionCompatResultReceiverWrapper);
                        if (jWrite == -1) {
                            jWrite = registryMissingComponentException.size;
                        }
                        registryMissingComponentException.RatingCompat(jWrite);
                    } else if (iResultReceiver == 9 || iResultReceiver == 13) {
                        write(RatingCompat);
                    } else if (iResultReceiver == 8 || iResultReceiver == 12) {
                        write(MediaMetadataCompat);
                    } else if (iResultReceiver == 17) {
                        registryMissingComponentException.RatingCompat(this.PlaybackStateCompatCustomAction);
                    } else if (iResultReceiver == 18) {
                        StringBuilder sb4 = new StringBuilder("Expected a value but was ");
                        sb4.append(MediaSessionCompatToken());
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(sb4, " at path ", RemoteActionCompatParcelizer());
                        return;
                    }
                }
                this.PlaybackStateCompat = 0;
            }
            i++;
            this.PlaybackStateCompat = 0;
        } while (i != 0);
        int[] iArr = this.serializer;
        int i2 = this.MediaDescriptionCompat - 1;
        iArr[i2] = iArr[i2] + 1;
        this.IconCompatParcelizer[i2] = "null";
    }

    public final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() throws com.squareup.moshi.JsonEncodingException {
        if (this.write) {
            return;
        }
        serializer("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final boolean serializer(int i) throws com.squareup.moshi.JsonEncodingException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        return false;
    }
}
