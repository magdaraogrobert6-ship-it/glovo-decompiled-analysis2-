package com.airbnb.lottie.parser.moshi;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.EOFException;
import java.io.IOException;
import o.DoubleFunction;
import o.GifDrawableTransformation;
import o.ImageHeaderParserImageType;
import o.RegistryMissingComponentException;
import o.RequestBuilder;
import o.colorResource;
import o.ensureSubscribedToInAppMessageEvents;
import o.getConnectors;
import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final class JsonUtf8Reader extends JsonReader {
    public static final RequestBuilder MediaBrowserCompatMediaItem;
    public static final RequestBuilder MediaDescriptionCompat;
    public static final RequestBuilder MediaSessionCompatQueueItem;
    public final RegistryMissingComponentException MediaMetadataCompat;
    public int MediaSessionCompatResultReceiverWrapper;
    public long MediaSessionCompatToken;
    public final GifDrawableTransformation ParcelableVolumeInfo;
    public String PlaybackStateCompatCustomAction;
    public int RatingCompat;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.RatingCompat = 0;
        this.read[0] = 8;
        this.RemoteActionCompatParcelizer = 1;
        this.MediaMetadataCompat.serializer();
        this.ParcelableVolumeInfo.close();
    }

    public final String ComponentActivity() {
        long jWrite = this.ParcelableVolumeInfo.write(MediaBrowserCompatMediaItem);
        RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
        if (jWrite == -1) {
            return registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        }
        registryMissingComponentException.getClass();
        return registryMissingComponentException.read(jWrite, ensureSubscribedToInAppMessageEvents.write);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double MediaMetadataCompat() throws JsonEncodingException, EOFException {
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        if (iParcelableVolumeInfo == 16) {
            this.RatingCompat = 0;
            int[] iArr = this.serializer;
            int i = this.RemoteActionCompatParcelizer - 1;
            iArr[i] = iArr[i] + 1;
            return this.MediaSessionCompatToken;
        }
        if (iParcelableVolumeInfo == 17) {
            long j = this.MediaSessionCompatResultReceiverWrapper;
            RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
            registryMissingComponentException.getClass();
            this.PlaybackStateCompatCustomAction = registryMissingComponentException.read(j, ensureSubscribedToInAppMessageEvents.write);
        } else if (iParcelableVolumeInfo == 9) {
            this.PlaybackStateCompatCustomAction = read(MediaDescriptionCompat);
        } else if (iParcelableVolumeInfo == 8) {
            this.PlaybackStateCompatCustomAction = read(MediaSessionCompatQueueItem);
        } else if (iParcelableVolumeInfo == 10) {
            this.PlaybackStateCompatCustomAction = ComponentActivity();
        } else if (iParcelableVolumeInfo != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(PlaybackStateCompatCustomAction());
            getConnectors.read(sb, serializer());
            return 0.0d;
        }
        this.RatingCompat = 11;
        try {
            double d = Double.parseDouble(this.PlaybackStateCompatCustomAction);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                StringBuilder sbM = af$$ExternalSyntheticOutline0.m(d, "JSON forbids NaN and infinities: ", " at path ");
                sbM.append(serializer());
                throw new JsonEncodingException(sbM.toString());
            }
            this.PlaybackStateCompatCustomAction = null;
            this.RatingCompat = 0;
            int[] iArr2 = this.serializer;
            int i2 = this.RemoteActionCompatParcelizer - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.PlaybackStateCompatCustomAction + " at path " + serializer());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void MediaSessionCompatResultReceiverWrapper() {
        int i = 0;
        do {
            int iParcelableVolumeInfo = this.RatingCompat;
            if (iParcelableVolumeInfo == 0) {
                iParcelableVolumeInfo = ParcelableVolumeInfo();
            }
            if (iParcelableVolumeInfo == 3) {
                RemoteActionCompatParcelizer(1);
            } else {
                if (iParcelableVolumeInfo == 1) {
                    RemoteActionCompatParcelizer(3);
                } else if (iParcelableVolumeInfo == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb = new StringBuilder("Expected a value but was ");
                        sb.append(PlaybackStateCompatCustomAction());
                        getConnectors.read(sb, serializer());
                        return;
                    }
                    this.RemoteActionCompatParcelizer--;
                } else if (iParcelableVolumeInfo == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(PlaybackStateCompatCustomAction());
                        getConnectors.read(sb2, serializer());
                        return;
                    }
                    this.RemoteActionCompatParcelizer--;
                } else {
                    RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
                    if (iParcelableVolumeInfo == 14 || iParcelableVolumeInfo == 10) {
                        long jWrite = this.ParcelableVolumeInfo.write(MediaBrowserCompatMediaItem);
                        if (jWrite == -1) {
                            jWrite = registryMissingComponentException.size;
                        }
                        registryMissingComponentException.RatingCompat(jWrite);
                    } else if (iParcelableVolumeInfo == 9 || iParcelableVolumeInfo == 13) {
                        serializer(MediaDescriptionCompat);
                    } else if (iParcelableVolumeInfo == 8 || iParcelableVolumeInfo == 12) {
                        serializer(MediaSessionCompatQueueItem);
                    } else if (iParcelableVolumeInfo == 17) {
                        registryMissingComponentException.RatingCompat(this.MediaSessionCompatResultReceiverWrapper);
                    } else if (iParcelableVolumeInfo == 18) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(PlaybackStateCompatCustomAction());
                        getConnectors.read(sb3, serializer());
                        return;
                    }
                }
                this.RatingCompat = 0;
            }
            i++;
            this.RatingCompat = 0;
        } while (i != 0);
        int[] iArr = this.serializer;
        int i2 = this.RemoteActionCompatParcelizer - 1;
        iArr[i2] = iArr[i2] + 1;
        this.write[i2] = "null";
    }

    /* JADX WARN: Code duplicated, block: B:146:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:165:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:171:0x01e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:172:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:174:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:176:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:229:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0111  */
    /* JADX WARN: Code duplicated, block: B:92:0x0122  */
    /* JADX WARN: Code duplicated, block: B:94:0x012b  */
    public final int ParcelableVolumeInfo() throws JsonEncodingException, EOFException {
        int i;
        String str;
        String str2;
        char cIconCompatParcelizer;
        int i2;
        char c;
        int i3;
        int i4;
        byte bIconCompatParcelizer;
        char c2;
        int[] iArr = this.read;
        int i5 = this.RemoteActionCompatParcelizer - 1;
        int i6 = iArr[i5];
        RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(true);
            registryMissingComponentException.MediaBrowserCompatMediaItem();
            if (iRemoteActionCompatParcelizer != 44) {
                if (iRemoteActionCompatParcelizer == 59) {
                    PlaybackStateCompat();
                    throw null;
                }
                if (iRemoteActionCompatParcelizer == 93) {
                    this.RatingCompat = 4;
                    return 4;
                }
                read("Unterminated array");
                throw null;
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5) {
                    int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(true);
                    registryMissingComponentException.MediaBrowserCompatMediaItem();
                    if (iRemoteActionCompatParcelizer2 != 44) {
                        if (iRemoteActionCompatParcelizer2 == 59) {
                            PlaybackStateCompat();
                            throw null;
                        }
                        if (iRemoteActionCompatParcelizer2 == 125) {
                            this.RatingCompat = 2;
                            return 2;
                        }
                        read("Unterminated object");
                        throw null;
                    }
                }
                int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(true);
                if (iRemoteActionCompatParcelizer3 == 34) {
                    registryMissingComponentException.MediaBrowserCompatMediaItem();
                    this.RatingCompat = 13;
                    return 13;
                }
                if (iRemoteActionCompatParcelizer3 == 39) {
                    registryMissingComponentException.MediaBrowserCompatMediaItem();
                    PlaybackStateCompat();
                    throw null;
                }
                if (iRemoteActionCompatParcelizer3 != 125) {
                    PlaybackStateCompat();
                    throw null;
                }
                if (i6 == 5) {
                    read("Expected name");
                    throw null;
                }
                registryMissingComponentException.MediaBrowserCompatMediaItem();
                this.RatingCompat = 2;
                return 2;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(true);
                registryMissingComponentException.MediaBrowserCompatMediaItem();
                if (iRemoteActionCompatParcelizer4 != 58) {
                    if (iRemoteActionCompatParcelizer4 != 61) {
                        read("Expected ':'");
                        throw null;
                    }
                    PlaybackStateCompat();
                    throw null;
                }
            } else if (i6 == 6) {
                iArr[i5] = 7;
            } else {
                if (i6 == 7) {
                    if (RemoteActionCompatParcelizer(false) == -1) {
                        this.RatingCompat = 18;
                        return 18;
                    }
                    PlaybackStateCompat();
                    throw null;
                }
                if (i6 == 8) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(true);
        if (iRemoteActionCompatParcelizer5 == 34) {
            registryMissingComponentException.MediaBrowserCompatMediaItem();
            this.RatingCompat = 9;
            return 9;
        }
        if (iRemoteActionCompatParcelizer5 == 39) {
            PlaybackStateCompat();
            throw null;
        }
        if (iRemoteActionCompatParcelizer5 != 44 && iRemoteActionCompatParcelizer5 != 59) {
            if (iRemoteActionCompatParcelizer5 == 91) {
                registryMissingComponentException.MediaBrowserCompatMediaItem();
                this.RatingCompat = 3;
                return 3;
            }
            if (iRemoteActionCompatParcelizer5 != 93) {
                if (iRemoteActionCompatParcelizer5 == 123) {
                    registryMissingComponentException.MediaBrowserCompatMediaItem();
                    this.RatingCompat = 1;
                    return 1;
                }
                byte bIconCompatParcelizer2 = registryMissingComponentException.IconCompatParcelizer(0L);
                GifDrawableTransformation gifDrawableTransformation = this.ParcelableVolumeInfo;
                if (bIconCompatParcelizer2 == 116 || bIconCompatParcelizer2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bIconCompatParcelizer2 != 102 && bIconCompatParcelizer2 != 70) {
                        if (bIconCompatParcelizer2 == 110 || bIconCompatParcelizer2 == 78) {
                            i = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            i = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        boolean z = true;
                        i2 = 0;
                        c = 0;
                        boolean z2 = false;
                        long j = 0;
                        while (true) {
                            i3 = i2 + 1;
                            if (gifDrawableTransformation.write(i3)) {
                                bIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer(i2);
                                if (bIconCompatParcelizer != 43) {
                                    if (bIconCompatParcelizer != 69 || bIconCompatParcelizer == 101) {
                                        c2 = 6;
                                        if (c != 2 || c == 4) {
                                            c = 5;
                                            i2 = i3;
                                        } else {
                                            i4 = 0;
                                        }
                                    } else if (bIconCompatParcelizer == 45) {
                                        c2 = 6;
                                        if (c == 0) {
                                            c = 1;
                                            z2 = true;
                                        } else {
                                            if (c != 5) {
                                                i4 = 0;
                                            }
                                            c = c2;
                                        }
                                        i2 = i3;
                                    } else if (bIconCompatParcelizer != 46) {
                                        if (bIconCompatParcelizer >= 48 && bIconCompatParcelizer <= 57) {
                                            if (c == 1 || c == 0) {
                                                c2 = 6;
                                                j = -(bIconCompatParcelizer - 48);
                                                c = 2;
                                            } else {
                                                if (c == 2) {
                                                    if (j != 0) {
                                                        long j2 = (10 * j) - ((long) (bIconCompatParcelizer - 48));
                                                        z = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) & z;
                                                        j = j2;
                                                    }
                                                } else if (c == 3) {
                                                    c = 4;
                                                } else {
                                                    c2 = 6;
                                                    if (c == 5 || c == 6) {
                                                        c = 7;
                                                    }
                                                }
                                                c2 = 6;
                                                i2 = i3;
                                            }
                                            i2 = i3;
                                        } else if (!read(bIconCompatParcelizer)) {
                                        }
                                        i4 = 0;
                                    } else {
                                        c2 = 6;
                                        if (c == 2) {
                                            c = 3;
                                            i2 = i3;
                                        } else {
                                            i4 = 0;
                                        }
                                    }
                                    if (i4 != 0) {
                                        return i4;
                                    }
                                    if (read(registryMissingComponentException.IconCompatParcelizer(0L))) {
                                        PlaybackStateCompat();
                                        throw null;
                                    }
                                    read("Expected value");
                                    throw null;
                                }
                                c2 = 6;
                                if (c != 5) {
                                    i4 = 0;
                                    if (i4 != 0) {
                                        return i4;
                                    }
                                    if (read(registryMissingComponentException.IconCompatParcelizer(0L))) {
                                        read("Expected value");
                                        throw null;
                                    }
                                    PlaybackStateCompat();
                                    throw null;
                                }
                                c = c2;
                                i2 = i3;
                            }
                            if (c != 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
                                if (!z2) {
                                    j = -j;
                                }
                                this.MediaSessionCompatToken = j;
                                registryMissingComponentException.RatingCompat(i2);
                                i4 = 16;
                                this.RatingCompat = 16;
                            } else if (c != 2 || c == 4 || c == 7) {
                                this.MediaSessionCompatResultReceiverWrapper = i2;
                                i4 = 17;
                                this.RatingCompat = 17;
                            } else {
                                i4 = 0;
                            }
                            if (i4 != 0) {
                                return i4;
                            }
                            if (read(registryMissingComponentException.IconCompatParcelizer(0L))) {
                                read("Expected value");
                                throw null;
                            }
                            PlaybackStateCompat();
                            throw null;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                int i7 = 1;
                while (true) {
                    if (i7 >= length) {
                        if (!gifDrawableTransformation.write(length + 1) || !read(registryMissingComponentException.IconCompatParcelizer(length))) {
                            registryMissingComponentException.RatingCompat(length);
                            this.RatingCompat = i;
                            break;
                        }
                    } else {
                        int i8 = i7 + 1;
                        if (gifDrawableTransformation.write(i8) && ((cIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer(i7)) == str2.charAt(i7) || cIconCompatParcelizer == str.charAt(i7))) {
                            i7 = i8;
                        }
                    }
                    i = 0;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                boolean z3 = true;
                i2 = 0;
                c = 0;
                boolean z4 = false;
                long j3 = 0;
                while (true) {
                    i3 = i2 + 1;
                    if (gifDrawableTransformation.write(i3)) {
                        bIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer(i2);
                        if (bIconCompatParcelizer != 43) {
                            if (bIconCompatParcelizer != 69) {
                                c2 = 6;
                                if (c != 2) {
                                }
                                c = 5;
                                i2 = i3;
                            } else {
                                c2 = 6;
                                if (c != 2) {
                                }
                                c = 5;
                                i2 = i3;
                            }
                            if (i4 != 0) {
                                return i4;
                            }
                            if (read(registryMissingComponentException.IconCompatParcelizer(0L))) {
                                read("Expected value");
                                throw null;
                            }
                            PlaybackStateCompat();
                            throw null;
                        }
                        c2 = 6;
                        if (c != 5) {
                            i4 = 0;
                            if (i4 != 0) {
                                return i4;
                            }
                            if (read(registryMissingComponentException.IconCompatParcelizer(0L))) {
                                read("Expected value");
                                throw null;
                            }
                            PlaybackStateCompat();
                            throw null;
                        }
                        c = c2;
                        i2 = i3;
                    }
                    if (c != 2) {
                        if (c != 2) {
                        }
                        this.MediaSessionCompatResultReceiverWrapper = i2;
                        i4 = 17;
                        this.RatingCompat = 17;
                    } else {
                        if (c != 2) {
                        }
                        this.MediaSessionCompatResultReceiverWrapper = i2;
                        i4 = 17;
                        this.RatingCompat = 17;
                    }
                    if (i4 != 0) {
                        return i4;
                    }
                    if (read(registryMissingComponentException.IconCompatParcelizer(0L))) {
                        read("Expected value");
                        throw null;
                    }
                    PlaybackStateCompat();
                    throw null;
                }
            }
            if (i6 == 1) {
                registryMissingComponentException.MediaBrowserCompatMediaItem();
                this.RatingCompat = 4;
                return 4;
            }
        }
        if (i6 == 1 || i6 == 2) {
            PlaybackStateCompat();
            throw null;
        }
        read("Unexpected value");
        throw null;
    }

    public final void PlaybackStateCompat() throws JsonEncodingException {
        read("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final char r8lambda54BeH8ZsBru0CXI2CCSP2syNys() throws JsonEncodingException, EOFException {
        int i;
        GifDrawableTransformation gifDrawableTransformation = this.ParcelableVolumeInfo;
        if (!gifDrawableTransformation.write(1L)) {
            read("Unterminated escape sequence");
            throw null;
        }
        RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
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
            read("Invalid escape sequence: \\" + ((char) bMediaBrowserCompatMediaItem));
            throw null;
        }
        if (!gifDrawableTransformation.write(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(serializer()));
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
                    read("\\u".concat(registryMissingComponentException.read(4L, ensureSubscribedToInAppMessageEvents.write)));
                    throw null;
                }
                i = bIconCompatParcelizer - 55;
            }
            c = (char) (i + c2);
        }
        registryMissingComponentException.RatingCompat(4L);
        return c;
    }

    public final String read(RequestBuilder requestBuilder) throws JsonEncodingException, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jWrite = this.ParcelableVolumeInfo.write(requestBuilder);
            if (jWrite == -1) {
                read("Unterminated string");
                throw null;
            }
            RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
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
            sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        }
    }

    public final void serializer(RequestBuilder requestBuilder) throws JsonEncodingException, EOFException {
        while (true) {
            long jWrite = this.ParcelableVolumeInfo.write(requestBuilder);
            if (jWrite == -1) {
                read("Unterminated string");
                throw null;
            }
            RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
            if (registryMissingComponentException.IconCompatParcelizer(jWrite) != 92) {
                registryMissingComponentException.RatingCompat(jWrite + 1);
                return;
            } else {
                registryMissingComponentException.RatingCompat(jWrite + 1);
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            }
        }
    }

    public final int write(String str, colorResource colorresource) {
        int length = ((String[]) colorresource.IconCompatParcelizer).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) colorresource.IconCompatParcelizer)[i])) {
                this.RatingCompat = 0;
                this.write[this.RemoteActionCompatParcelizer - 1] = str;
                return i;
            }
        }
        return -1;
    }

    static {
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        MediaSessionCompatQueueItem = ImageHeaderParserImageType.serializer("'\\");
        MediaDescriptionCompat = ImageHeaderParserImageType.serializer("\"\\");
        MediaBrowserCompatMediaItem = ImageHeaderParserImageType.serializer("{}[]:, \n\t\r\f/\\;#=");
        ImageHeaderParserImageType.serializer("\n\r");
        ImageHeaderParserImageType.serializer("*/");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void IconCompatParcelizer() {
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        if (iParcelableVolumeInfo != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(PlaybackStateCompatCustomAction());
            getConnectors.read(sb, serializer());
        } else {
            int i = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i - 1;
            int[] iArr = this.serializer;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.RatingCompat = 0;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean MediaBrowserCompatMediaItem() throws JsonEncodingException, EOFException {
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        return (iParcelableVolumeInfo == 2 || iParcelableVolumeInfo == 4 || iParcelableVolumeInfo == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String MediaDescriptionCompat() {
        String string;
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        if (iParcelableVolumeInfo == 10) {
            string = ComponentActivity();
        } else if (iParcelableVolumeInfo == 9) {
            string = read(MediaDescriptionCompat);
        } else if (iParcelableVolumeInfo == 8) {
            string = read(MediaSessionCompatQueueItem);
        } else if (iParcelableVolumeInfo == 11) {
            string = this.PlaybackStateCompatCustomAction;
            this.PlaybackStateCompatCustomAction = null;
        } else if (iParcelableVolumeInfo == 16) {
            string = Long.toString(this.MediaSessionCompatToken);
        } else {
            if (iParcelableVolumeInfo != 17) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(PlaybackStateCompatCustomAction());
                getConnectors.read(sb, serializer());
                return null;
            }
            long j = this.MediaSessionCompatResultReceiverWrapper;
            RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
            registryMissingComponentException.getClass();
            string = registryMissingComponentException.read(j, ensureSubscribedToInAppMessageEvents.write);
        }
        this.RatingCompat = 0;
        int[] iArr = this.serializer;
        int i = this.RemoteActionCompatParcelizer - 1;
        iArr[i] = iArr[i] + 1;
        return string;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean MediaSessionCompatQueueItem() {
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        if (iParcelableVolumeInfo == 5) {
            this.RatingCompat = 0;
            int[] iArr = this.serializer;
            int i = this.RemoteActionCompatParcelizer - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iParcelableVolumeInfo != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(PlaybackStateCompatCustomAction());
            getConnectors.read(sb, serializer());
            return false;
        }
        this.RatingCompat = 0;
        int[] iArr2 = this.serializer;
        int i2 = this.RemoteActionCompatParcelizer - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void MediaSessionCompatToken() {
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        if (iParcelableVolumeInfo == 14) {
            long jWrite = this.ParcelableVolumeInfo.write(MediaBrowserCompatMediaItem);
            RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
            if (jWrite == -1) {
                jWrite = registryMissingComponentException.size;
            }
            registryMissingComponentException.RatingCompat(jWrite);
        } else if (iParcelableVolumeInfo == 13) {
            serializer(MediaDescriptionCompat);
        } else if (iParcelableVolumeInfo == 12) {
            serializer(MediaSessionCompatQueueItem);
        } else if (iParcelableVolumeInfo != 15) {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(PlaybackStateCompatCustomAction());
            getConnectors.read(sb, serializer());
            return;
        }
        this.RatingCompat = 0;
        this.write[this.RemoteActionCompatParcelizer - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final DoubleFunction PlaybackStateCompatCustomAction() throws JsonEncodingException, EOFException {
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        switch (iParcelableVolumeInfo) {
            case 1:
                return DoubleFunction.BEGIN_OBJECT;
            case 2:
                return DoubleFunction.END_OBJECT;
            case 3:
                return DoubleFunction.BEGIN_ARRAY;
            case 4:
                return DoubleFunction.END_ARRAY;
            case 5:
            case 6:
                return DoubleFunction.BOOLEAN;
            case 7:
                return DoubleFunction.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return DoubleFunction.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return DoubleFunction.NAME;
            case 16:
            case 17:
                return DoubleFunction.NUMBER;
            case 18:
                return DoubleFunction.END_DOCUMENT;
            default:
                int iSerializer = isAppSetIdReadingEnabled.serializer();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
                return null;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int RatingCompat() {
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        if (iParcelableVolumeInfo == 16) {
            long j = this.MediaSessionCompatToken;
            int i = (int) j;
            if (j == i) {
                this.RatingCompat = 0;
                int[] iArr = this.serializer;
                int i2 = this.RemoteActionCompatParcelizer - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new JsonDataException("Expected an int but was " + j + " at path " + serializer());
        }
        if (iParcelableVolumeInfo == 17) {
            long j2 = this.MediaSessionCompatResultReceiverWrapper;
            RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
            registryMissingComponentException.getClass();
            this.PlaybackStateCompatCustomAction = registryMissingComponentException.read(j2, ensureSubscribedToInAppMessageEvents.write);
        } else if (iParcelableVolumeInfo == 9 || iParcelableVolumeInfo == 8) {
            String str = iParcelableVolumeInfo == 9 ? read(MediaDescriptionCompat) : read(MediaSessionCompatQueueItem);
            this.PlaybackStateCompatCustomAction = str;
            try {
                int i3 = Integer.parseInt(str);
                this.RatingCompat = 0;
                int[] iArr2 = this.serializer;
                int i4 = this.RemoteActionCompatParcelizer - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iParcelableVolumeInfo != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(PlaybackStateCompatCustomAction());
            getConnectors.read(sb, serializer());
            return 0;
        }
        this.RatingCompat = 11;
        try {
            double d = Double.parseDouble(this.PlaybackStateCompatCustomAction);
            int i5 = (int) d;
            if (i5 == d) {
                this.PlaybackStateCompatCustomAction = null;
                this.RatingCompat = 0;
                int[] iArr3 = this.serializer;
                int i6 = this.RemoteActionCompatParcelizer - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.PlaybackStateCompatCustomAction + " at path " + serializer());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.PlaybackStateCompatCustomAction + " at path " + serializer());
        }
    }

    public final int RemoteActionCompatParcelizer(boolean z) throws JsonEncodingException, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            GifDrawableTransformation gifDrawableTransformation = this.ParcelableVolumeInfo;
            if (!gifDrawableTransformation.write(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            RegistryMissingComponentException registryMissingComponentException = this.MediaMetadataCompat;
            byte bIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer(j);
            if (bIconCompatParcelizer != 10 && bIconCompatParcelizer != 32 && bIconCompatParcelizer != 13 && bIconCompatParcelizer != 9) {
                registryMissingComponentException.RatingCompat(j);
                if (bIconCompatParcelizer == 47) {
                    if (gifDrawableTransformation.write(2L)) {
                        PlaybackStateCompat();
                        throw null;
                    }
                } else if (bIconCompatParcelizer == 35) {
                    PlaybackStateCompat();
                    throw null;
                }
                return bIconCompatParcelizer;
            }
            i = i2;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void RemoteActionCompatParcelizer() {
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        if (iParcelableVolumeInfo == 1) {
            RemoteActionCompatParcelizer(3);
            this.RatingCompat = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(PlaybackStateCompatCustomAction());
            getConnectors.read(sb, serializer());
        }
    }

    public final String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        String strComponentActivity;
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        if (iParcelableVolumeInfo == 14) {
            strComponentActivity = ComponentActivity();
        } else if (iParcelableVolumeInfo == 13) {
            strComponentActivity = read(MediaDescriptionCompat);
        } else if (iParcelableVolumeInfo == 12) {
            strComponentActivity = read(MediaSessionCompatQueueItem);
        } else {
            if (iParcelableVolumeInfo != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(PlaybackStateCompatCustomAction());
                getConnectors.read(sb, serializer());
                return null;
            }
            strComponentActivity = this.PlaybackStateCompatCustomAction;
        }
        this.RatingCompat = 0;
        this.write[this.RemoteActionCompatParcelizer - 1] = strComponentActivity;
        return strComponentActivity;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int read(colorResource colorresource) {
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        if (iParcelableVolumeInfo < 12 || iParcelableVolumeInfo > 15) {
            return -1;
        }
        if (iParcelableVolumeInfo == 15) {
            return write(this.PlaybackStateCompatCustomAction, colorresource);
        }
        int iSerializer = this.ParcelableVolumeInfo.serializer((Options) colorresource.write);
        if (iSerializer != -1) {
            this.RatingCompat = 0;
            this.write[this.RemoteActionCompatParcelizer - 1] = ((String[]) colorresource.IconCompatParcelizer)[iSerializer];
            return iSerializer;
        }
        String str = this.write[this.RemoteActionCompatParcelizer - 1];
        String strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        int iWrite = write(strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, colorresource);
        if (iWrite == -1) {
            this.RatingCompat = 15;
            this.PlaybackStateCompatCustomAction = strR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            this.write[this.RemoteActionCompatParcelizer - 1] = str;
        }
        return iWrite;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void read() {
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        if (iParcelableVolumeInfo == 3) {
            RemoteActionCompatParcelizer(1);
            this.serializer[this.RemoteActionCompatParcelizer - 1] = 0;
            this.RatingCompat = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(PlaybackStateCompatCustomAction());
            getConnectors.read(sb, serializer());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.ParcelableVolumeInfo + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void write() {
        int iParcelableVolumeInfo = this.RatingCompat;
        if (iParcelableVolumeInfo == 0) {
            iParcelableVolumeInfo = ParcelableVolumeInfo();
        }
        if (iParcelableVolumeInfo != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(PlaybackStateCompatCustomAction());
            getConnectors.read(sb, serializer());
            return;
        }
        int i = this.RemoteActionCompatParcelizer;
        int i2 = i - 1;
        this.RemoteActionCompatParcelizer = i2;
        this.write[i2] = null;
        int[] iArr = this.serializer;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.RatingCompat = 0;
    }

    public JsonUtf8Reader(GifDrawableTransformation gifDrawableTransformation) {
        this.read = new int[32];
        this.write = new String[32];
        this.serializer = new int[32];
        this.RatingCompat = 0;
        this.ParcelableVolumeInfo = gifDrawableTransformation;
        this.MediaMetadataCompat = gifDrawableTransformation.bufferField;
        RemoteActionCompatParcelizer(6);
    }

    public final boolean read(int i) throws JsonEncodingException {
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
        PlaybackStateCompat();
        throw null;
    }
}
