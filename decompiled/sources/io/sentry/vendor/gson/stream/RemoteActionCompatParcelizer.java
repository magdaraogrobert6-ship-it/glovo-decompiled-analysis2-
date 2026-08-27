package io.sentry.vendor.gson.stream;

import androidx.compose.ui.graphics.Fields;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer implements Closeable {
    public final Reader IconCompatParcelizer;
    public String[] MediaDescriptionCompat;
    public long MediaSessionCompatQueueItem;
    public String MediaSessionCompatResultReceiverWrapper;
    public int ParcelableVolumeInfo;
    public int[] PlaybackStateCompat;
    public int[] RatingCompat;
    public boolean serializer = false;
    public final char[] write = new char[Fields.RotationZ];
    public int PlaybackStateCompatCustomAction = 0;
    public int RemoteActionCompatParcelizer = 0;
    public int read = 0;
    public int MediaMetadataCompat = 0;
    public int MediaBrowserCompatMediaItem = 0;
    public int MediaSessionCompatToken = 1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.MediaBrowserCompatMediaItem = 0;
        this.PlaybackStateCompat[0] = 8;
        this.MediaSessionCompatToken = 1;
        this.IconCompatParcelizer.close();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0173 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x0174  */
    /* JADX WARN: Code duplicated, block: B:117:0x0184  */
    /* JADX WARN: Code duplicated, block: B:120:0x0189  */
    /* JADX WARN: Code duplicated, block: B:123:0x0194  */
    /* JADX WARN: Code duplicated, block: B:124:0x0198 A[PHI: r1 r10
  0x0198: PHI (r1v64 int) = (r1v63 int), (r1v85 int) binds: [B:116:0x0182, B:123:0x0194] A[DONT_GENERATE, DONT_INLINE]
  0x0198: PHI (r10v11 int) = (r10v10 int), (r10v12 int) binds: [B:116:0x0182, B:123:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:171:0x020a  */
    /* JADX WARN: Code duplicated, block: B:172:0x020c  */
    /* JADX WARN: Code duplicated, block: B:183:0x022f A[DONT_INVERT, PHI: r1
  0x022f: PHI (r1v72 char) = (r1v71 char), (r1v76 char) binds: [B:170:0x0208, B:182:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x0231  */
    /* JADX WARN: Code duplicated, block: B:198:0x0255  */
    /* JADX WARN: Code duplicated, block: B:200:0x025c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0261  */
    /* JADX WARN: Code duplicated, block: B:209:0x0271 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:210:0x0272  */
    /* JADX WARN: Code duplicated, block: B:212:0x027c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0284  */
    /* JADX WARN: Code duplicated, block: B:274:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0191 A[SYNTHETIC] */
    public final int IconCompatParcelizer() throws IOException {
        int iSerializer;
        String str;
        String str2;
        int i;
        int i2;
        char c;
        int i3;
        long j;
        int i4;
        boolean z;
        int i5;
        char c2;
        char c3;
        long j2;
        char c4;
        int i6;
        char c5;
        int[] iArr = this.PlaybackStateCompat;
        int i7 = this.MediaSessionCompatToken - 1;
        int i8 = iArr[i7];
        char[] cArr = this.write;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iSerializer2 = serializer(true);
            if (iSerializer2 != 44) {
                if (iSerializer2 != 59) {
                    if (iSerializer2 == 93) {
                        this.MediaBrowserCompatMediaItem = 4;
                        return 4;
                    }
                    IconCompatParcelizer("Unterminated array");
                    throw null;
                }
                serializer();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5 && (iSerializer = serializer(true)) != 44) {
                    if (iSerializer != 59) {
                        if (iSerializer == 125) {
                            this.MediaBrowserCompatMediaItem = 2;
                            return 2;
                        }
                        IconCompatParcelizer("Unterminated object");
                        throw null;
                    }
                    serializer();
                }
                int iSerializer3 = serializer(true);
                if (iSerializer3 == 34) {
                    this.MediaBrowserCompatMediaItem = 13;
                    return 13;
                }
                if (iSerializer3 == 39) {
                    serializer();
                    this.MediaBrowserCompatMediaItem = 12;
                    return 12;
                }
                if (iSerializer3 == 125) {
                    if (i8 != 5) {
                        this.MediaBrowserCompatMediaItem = 2;
                        return 2;
                    }
                    IconCompatParcelizer("Expected name");
                    throw null;
                }
                serializer();
                this.PlaybackStateCompatCustomAction--;
                if (read((char) iSerializer3)) {
                    this.MediaBrowserCompatMediaItem = 14;
                    return 14;
                }
                IconCompatParcelizer("Expected name");
                throw null;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iSerializer4 = serializer(true);
                if (iSerializer4 != 58) {
                    if (iSerializer4 != 61) {
                        IconCompatParcelizer("Expected ':'");
                        throw null;
                    }
                    serializer();
                    if (this.PlaybackStateCompatCustomAction < this.RemoteActionCompatParcelizer || RemoteActionCompatParcelizer(1)) {
                        int i9 = this.PlaybackStateCompatCustomAction;
                        if (cArr[i9] == '>') {
                            this.PlaybackStateCompatCustomAction = i9 + 1;
                        }
                    }
                }
            } else if (i8 == 6) {
                if (this.serializer) {
                    serializer(true);
                    int i10 = this.PlaybackStateCompatCustomAction;
                    int i11 = i10 - 1;
                    this.PlaybackStateCompatCustomAction = i11;
                    if ((i10 + 4 <= this.RemoteActionCompatParcelizer || RemoteActionCompatParcelizer(5)) && cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                        this.PlaybackStateCompatCustomAction += 5;
                    }
                }
                this.PlaybackStateCompat[this.MediaSessionCompatToken - 1] = 7;
            } else if (i8 == 7) {
                if (serializer(false) == -1) {
                    this.MediaBrowserCompatMediaItem = 17;
                    return 17;
                }
                serializer();
                this.PlaybackStateCompatCustomAction--;
            } else if (i8 == 8) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonReader is closed");
                return 0;
            }
        }
        int iSerializer5 = serializer(true);
        if (iSerializer5 == 34) {
            this.MediaBrowserCompatMediaItem = 9;
            return 9;
        }
        if (iSerializer5 == 39) {
            serializer();
            this.MediaBrowserCompatMediaItem = 8;
            return 8;
        }
        if (iSerializer5 != 44 && iSerializer5 != 59) {
            if (iSerializer5 == 91) {
                this.MediaBrowserCompatMediaItem = 3;
                return 3;
            }
            if (iSerializer5 != 93) {
                if (iSerializer5 == 123) {
                    this.MediaBrowserCompatMediaItem = 1;
                    return 1;
                }
                int i12 = this.PlaybackStateCompatCustomAction - 1;
                this.PlaybackStateCompatCustomAction = i12;
                char c6 = cArr[i12];
                if (c6 == 't' || c6 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (c6 != 'f' && c6 != 'F') {
                        if (c6 != 'n' && c6 != 'N') {
                            i2 = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        if (i2 != 0) {
                            return i2;
                        }
                        i3 = this.PlaybackStateCompatCustomAction;
                        j = 0;
                        i4 = this.RemoteActionCompatParcelizer;
                        z = true;
                        long j3 = 0;
                        i5 = 0;
                        boolean z2 = false;
                        c2 = 0;
                        while (true) {
                            if (i3 + i5 != i4) {
                                c3 = cArr[i3 + i5];
                                if (c3 != '+') {
                                    if (c3 != 'E' || c3 == 'e') {
                                        j2 = j;
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i5++;
                                            j = j2;
                                        }
                                    } else if (c3 == '-') {
                                        j2 = j;
                                        c4 = 6;
                                        if (c2 == 0) {
                                            z2 = true;
                                            c2 = 1;
                                        } else {
                                            if (c2 != 5) {
                                            }
                                            c2 = c4;
                                        }
                                        i5++;
                                        j = j2;
                                    } else if (c3 == '.') {
                                        j2 = j;
                                        if (c2 == 2) {
                                            c2 = 3;
                                            i5++;
                                            j = j2;
                                        }
                                    } else if (c3 >= '0' && c3 <= '9') {
                                        if (c2 == 1 || c2 == 0) {
                                            j3 = -(c3 - '0');
                                            c2 = 2;
                                        } else if (c2 == 2) {
                                            if (j3 != j) {
                                                long j4 = (10 * j3) - ((long) (c3 - '0'));
                                                z &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                                j3 = j4;
                                            }
                                        } else if (c2 == 3) {
                                            c2 = 4;
                                        } else if (c2 == 5 || c2 == 6) {
                                            c2 = 7;
                                        }
                                        j2 = 0;
                                        i5++;
                                        j = j2;
                                    } else if (!read(c3)) {
                                        c5 = 2;
                                        if (c2 != 2) {
                                            if (c2 != c5 || c2 == 4 || c2 == 7) {
                                                this.ParcelableVolumeInfo = i5;
                                                this.MediaBrowserCompatMediaItem = 16;
                                                i6 = 16;
                                            }
                                        } else if (z || ((j3 == Long.MIN_VALUE && !z2) || (j3 == 0 && z2))) {
                                            c5 = 2;
                                            if (c2 != c5) {
                                            }
                                            this.ParcelableVolumeInfo = i5;
                                            this.MediaBrowserCompatMediaItem = 16;
                                            i6 = 16;
                                        } else {
                                            if (!z2) {
                                                j3 = -j3;
                                            }
                                            this.MediaSessionCompatQueueItem = j3;
                                            this.PlaybackStateCompatCustomAction += i5;
                                            this.MediaBrowserCompatMediaItem = 15;
                                            i6 = 15;
                                        }
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (read(cArr[this.PlaybackStateCompatCustomAction])) {
                                        IconCompatParcelizer("Expected value");
                                        throw null;
                                    }
                                    serializer();
                                    this.MediaBrowserCompatMediaItem = 10;
                                    return 10;
                                }
                                j2 = j;
                                c4 = 6;
                                if (c2 != 5) {
                                }
                                c2 = c4;
                                i5++;
                                j = j2;
                            } else if (i5 != cArr.length) {
                                if (!RemoteActionCompatParcelizer(i5 + 1)) {
                                    i3 = this.PlaybackStateCompatCustomAction;
                                    i4 = this.RemoteActionCompatParcelizer;
                                    c3 = cArr[i3 + i5];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            j2 = j;
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                            j = j2;
                                        } else {
                                            j2 = j;
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                            j = j2;
                                        }
                                        if (i6 != 0) {
                                            return i6;
                                        }
                                        if (read(cArr[this.PlaybackStateCompatCustomAction])) {
                                            IconCompatParcelizer("Expected value");
                                            throw null;
                                        }
                                        serializer();
                                        this.MediaBrowserCompatMediaItem = 10;
                                        return 10;
                                    }
                                    j2 = j;
                                    c4 = 6;
                                    if (c2 != 5) {
                                    }
                                    c2 = c4;
                                    i5++;
                                    j = j2;
                                }
                                c5 = 2;
                                if (c2 != 2) {
                                    if (c2 != c5) {
                                    }
                                    this.ParcelableVolumeInfo = i5;
                                    this.MediaBrowserCompatMediaItem = 16;
                                    i6 = 16;
                                } else {
                                    if (z) {
                                    }
                                    c5 = 2;
                                    if (c2 != c5) {
                                    }
                                    this.ParcelableVolumeInfo = i5;
                                    this.MediaBrowserCompatMediaItem = 16;
                                    i6 = 16;
                                }
                                if (i6 != 0) {
                                    return i6;
                                }
                                if (read(cArr[this.PlaybackStateCompatCustomAction])) {
                                    IconCompatParcelizer("Expected value");
                                    throw null;
                                }
                                serializer();
                                this.MediaBrowserCompatMediaItem = 10;
                                return 10;
                            }
                            i6 = 0;
                            if (i6 != 0) {
                                return i6;
                            }
                            if (read(cArr[this.PlaybackStateCompatCustomAction])) {
                                IconCompatParcelizer("Expected value");
                                throw null;
                            }
                            serializer();
                            this.MediaBrowserCompatMediaItem = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                int length = str.length();
                int i13 = 1;
                while (true) {
                    int i14 = this.PlaybackStateCompatCustomAction;
                    int i15 = this.RemoteActionCompatParcelizer;
                    if (i13 >= length) {
                        if ((i14 + length >= i15 && !RemoteActionCompatParcelizer(length + 1)) || !read(cArr[this.PlaybackStateCompatCustomAction + length])) {
                            this.PlaybackStateCompatCustomAction += length;
                            this.MediaBrowserCompatMediaItem = i;
                            i2 = i;
                            break;
                        }
                        break;
                    }
                    if ((i14 + i13 < i15 || RemoteActionCompatParcelizer(i13 + 1)) && ((c = cArr[this.PlaybackStateCompatCustomAction + i13]) == str.charAt(i13) || c == str2.charAt(i13))) {
                        i13++;
                    }
                    i2 = 0;
                    break;
                }
                if (i2 != 0) {
                    return i2;
                }
                i3 = this.PlaybackStateCompatCustomAction;
                j = 0;
                i4 = this.RemoteActionCompatParcelizer;
                z = true;
                long j5 = 0;
                i5 = 0;
                boolean z3 = false;
                c2 = 0;
                while (true) {
                    if (i3 + i5 != i4) {
                        c3 = cArr[i3 + i5];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                j2 = j;
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i5++;
                                j = j2;
                            } else {
                                j2 = j;
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i5++;
                                j = j2;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (read(cArr[this.PlaybackStateCompatCustomAction])) {
                                IconCompatParcelizer("Expected value");
                                throw null;
                            }
                            serializer();
                            this.MediaBrowserCompatMediaItem = 10;
                            return 10;
                        }
                        j2 = j;
                        c4 = 6;
                        if (c2 != 5) {
                        }
                        c2 = c4;
                        i5++;
                        j = j2;
                    } else if (i5 != cArr.length) {
                        if (!RemoteActionCompatParcelizer(i5 + 1)) {
                            i3 = this.PlaybackStateCompatCustomAction;
                            i4 = this.RemoteActionCompatParcelizer;
                            c3 = cArr[i3 + i5];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    j2 = j;
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i5++;
                                    j = j2;
                                } else {
                                    j2 = j;
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i5++;
                                    j = j2;
                                }
                                if (i6 != 0) {
                                    return i6;
                                }
                                if (read(cArr[this.PlaybackStateCompatCustomAction])) {
                                    IconCompatParcelizer("Expected value");
                                    throw null;
                                }
                                serializer();
                                this.MediaBrowserCompatMediaItem = 10;
                                return 10;
                            }
                            j2 = j;
                            c4 = 6;
                            if (c2 != 5) {
                            }
                            c2 = c4;
                            i5++;
                            j = j2;
                        }
                        c5 = 2;
                        if (c2 != 2) {
                            if (c2 != c5) {
                            }
                            this.ParcelableVolumeInfo = i5;
                            this.MediaBrowserCompatMediaItem = 16;
                            i6 = 16;
                        } else {
                            if (z) {
                            }
                            c5 = 2;
                            if (c2 != c5) {
                            }
                            this.ParcelableVolumeInfo = i5;
                            this.MediaBrowserCompatMediaItem = 16;
                            i6 = 16;
                        }
                        if (i6 != 0) {
                            return i6;
                        }
                        if (read(cArr[this.PlaybackStateCompatCustomAction])) {
                            IconCompatParcelizer("Expected value");
                            throw null;
                        }
                        serializer();
                        this.MediaBrowserCompatMediaItem = 10;
                        return 10;
                    }
                    i6 = 0;
                    if (i6 != 0) {
                        return i6;
                    }
                    if (read(cArr[this.PlaybackStateCompatCustomAction])) {
                        IconCompatParcelizer("Expected value");
                        throw null;
                    }
                    serializer();
                    this.MediaBrowserCompatMediaItem = 10;
                    return 10;
                }
            }
            if (i8 == 1) {
                this.MediaBrowserCompatMediaItem = 4;
                return 4;
            }
        }
        if (i8 != 1 && i8 != 2) {
            IconCompatParcelizer("Unexpected value");
            throw null;
        }
        serializer();
        this.PlaybackStateCompatCustomAction--;
        this.MediaBrowserCompatMediaItem = 7;
        return 7;
    }

    public final void IconCompatParcelizer(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str.concat(MediaDescriptionCompat()));
    }

    public final boolean RemoteActionCompatParcelizer(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.MediaMetadataCompat;
        int i5 = this.PlaybackStateCompatCustomAction;
        this.MediaMetadataCompat = i4 - i5;
        int i6 = this.RemoteActionCompatParcelizer;
        char[] cArr = this.write;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.RemoteActionCompatParcelizer = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.RemoteActionCompatParcelizer = 0;
        }
        this.PlaybackStateCompatCustomAction = 0;
        do {
            int i8 = this.RemoteActionCompatParcelizer;
            int i9 = this.IconCompatParcelizer.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.RemoteActionCompatParcelizer + i9;
            this.RemoteActionCompatParcelizer = i2;
            if (this.read == 0 && (i3 = this.MediaMetadataCompat) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.PlaybackStateCompatCustomAction++;
                this.MediaMetadataCompat = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final void ResultReceiver() {
        char c;
        do {
            if (this.PlaybackStateCompatCustomAction >= this.RemoteActionCompatParcelizer && !RemoteActionCompatParcelizer(1)) {
                return;
            }
            int i = this.PlaybackStateCompatCustomAction;
            int i2 = i + 1;
            this.PlaybackStateCompatCustomAction = i2;
            c = this.write[i];
            if (c == '\n') {
                this.read++;
                this.MediaMetadataCompat = i2;
                return;
            }
        } while (c != '\r');
    }

    public final char r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() throws MalformedJsonException {
        int i;
        if (this.PlaybackStateCompatCustomAction == this.RemoteActionCompatParcelizer && !RemoteActionCompatParcelizer(1)) {
            IconCompatParcelizer("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.PlaybackStateCompatCustomAction;
        int i3 = i2 + 1;
        this.PlaybackStateCompatCustomAction = i3;
        char[] cArr = this.write;
        char c = cArr[i2];
        if (c == '\n') {
            this.read++;
            this.MediaMetadataCompat = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            IconCompatParcelizer("Invalid escape sequence");
            throw null;
        }
        if (i2 + 5 > this.RemoteActionCompatParcelizer && !RemoteActionCompatParcelizer(4)) {
            IconCompatParcelizer("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.PlaybackStateCompatCustomAction;
        char c2 = 0;
        for (int i5 = i4; i5 < i4 + 4; i5++) {
            char c3 = cArr[i5];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.PlaybackStateCompatCustomAction, 4)));
                }
                i = c3 - '7';
            }
            c2 = (char) (i + c4);
        }
        this.PlaybackStateCompatCustomAction += 4;
        return c2;
    }

    public final int serializer(boolean z) throws IOException {
        int i = this.PlaybackStateCompatCustomAction;
        int i2 = this.RemoteActionCompatParcelizer;
        while (true) {
            if (i == i2) {
                this.PlaybackStateCompatCustomAction = i;
                if (!RemoteActionCompatParcelizer(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(MediaDescriptionCompat()));
                    }
                    return -1;
                }
                i = this.PlaybackStateCompatCustomAction;
                i2 = this.RemoteActionCompatParcelizer;
            }
            int i3 = i + 1;
            char[] cArr = this.write;
            char c = cArr[i];
            if (c == '\n') {
                this.read++;
                this.MediaMetadataCompat = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.PlaybackStateCompatCustomAction = i3;
                    if (i3 == i2) {
                        this.PlaybackStateCompatCustomAction = i;
                        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(2);
                        this.PlaybackStateCompatCustomAction++;
                        if (!zRemoteActionCompatParcelizer) {
                        }
                        return c;
                    }
                    serializer();
                    int i4 = this.PlaybackStateCompatCustomAction;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.PlaybackStateCompatCustomAction = i4 + 1;
                        while (true) {
                            if (this.PlaybackStateCompatCustomAction + 2 > this.RemoteActionCompatParcelizer && !RemoteActionCompatParcelizer(2)) {
                                IconCompatParcelizer("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.PlaybackStateCompatCustomAction;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.PlaybackStateCompatCustomAction;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.RemoteActionCompatParcelizer;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.read++;
                                this.MediaMetadataCompat = i5 + 1;
                            }
                            this.PlaybackStateCompatCustomAction++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.PlaybackStateCompatCustomAction = i4 + 1;
                        ResultReceiver();
                        i = this.PlaybackStateCompatCustomAction;
                        i2 = this.RemoteActionCompatParcelizer;
                    }
                } else {
                    if (c != '#') {
                        this.PlaybackStateCompatCustomAction = i3;
                        return c;
                    }
                    this.PlaybackStateCompatCustomAction = i3;
                    serializer();
                    ResultReceiver();
                    i = this.PlaybackStateCompatCustomAction;
                    i2 = this.RemoteActionCompatParcelizer;
                }
            }
            i = i3;
        }
    }

    public final String serializer(char c) throws MalformedJsonException {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.PlaybackStateCompatCustomAction;
            int i3 = this.RemoteActionCompatParcelizer;
            while (true) {
                i = i2;
                while (true) {
                    cArr = this.write;
                    if (i < i3) {
                        int i4 = i + 1;
                        char c2 = cArr[i];
                        if (c2 == c) {
                            this.PlaybackStateCompatCustomAction = i4;
                            int i5 = (i4 - i2) - 1;
                            if (sb == null) {
                                return new String(cArr, i2, i5);
                            }
                            sb.append(cArr, i2, i5);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.PlaybackStateCompatCustomAction = i4;
                            int i6 = i4 - i2;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i6 * 2, 16));
                            }
                            sb.append(cArr, i2, i6 - 1);
                            sb.append(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
                            i2 = this.PlaybackStateCompatCustomAction;
                            i3 = this.RemoteActionCompatParcelizer;
                        } else {
                            if (c2 == '\n') {
                                this.read++;
                                this.MediaMetadataCompat = i4;
                            }
                            i = i4;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i - i2) * 2, 16));
            }
            sb.append(cArr, i2, i - i2);
            this.PlaybackStateCompatCustomAction = i;
        } while (RemoteActionCompatParcelizer(1));
        IconCompatParcelizer("Unterminated string");
        throw null;
    }

    public final void write(char c) throws MalformedJsonException {
        do {
            int i = this.PlaybackStateCompatCustomAction;
            int i2 = this.RemoteActionCompatParcelizer;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.write[i];
                if (c2 == c) {
                    this.PlaybackStateCompatCustomAction = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.PlaybackStateCompatCustomAction = i3;
                    r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    i = this.PlaybackStateCompatCustomAction;
                    i2 = this.RemoteActionCompatParcelizer;
                } else {
                    if (c2 == '\n') {
                        this.read++;
                        this.MediaMetadataCompat = i3;
                    }
                    i = i3;
                }
            }
            this.PlaybackStateCompatCustomAction = i;
        } while (RemoteActionCompatParcelizer(1));
        IconCompatParcelizer("Unterminated string");
        throw null;
    }

    public final void write(int i) {
        int i2 = this.MediaSessionCompatToken;
        int[] iArr = this.PlaybackStateCompat;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.PlaybackStateCompat = Arrays.copyOf(iArr, i3);
            this.RatingCompat = Arrays.copyOf(this.RatingCompat, i3);
            this.MediaDescriptionCompat = (String[]) Arrays.copyOf(this.MediaDescriptionCompat, i3);
        }
        int[] iArr2 = this.PlaybackStateCompat;
        int i4 = this.MediaSessionCompatToken;
        this.MediaSessionCompatToken = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    public final String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() throws MalformedJsonException {
        String string;
        StringBuilder sb = null;
        while (true) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.PlaybackStateCompatCustomAction + i2;
                int i4 = this.RemoteActionCompatParcelizer;
                char[] cArr = this.write;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        serializer();
                    }
                    i = i2;
                } else if (i2 < cArr.length) {
                    if (!RemoteActionCompatParcelizer(i2 + 1)) {
                        i = i2;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.PlaybackStateCompatCustomAction, i2);
                    this.PlaybackStateCompatCustomAction += i2;
                    if (!RemoteActionCompatParcelizer(1)) {
                    }
                }
                int i5 = this.PlaybackStateCompatCustomAction;
                if (sb == null) {
                    string = new String(cArr, i5, i);
                } else {
                    sb.append(cArr, i5, i);
                    string = sb.toString();
                }
                this.PlaybackStateCompatCustomAction += i;
                return string;
            }
        }
    }

    public RemoteActionCompatParcelizer(Reader reader) {
        int[] iArr = new int[32];
        this.PlaybackStateCompat = iArr;
        iArr[0] = 6;
        this.MediaDescriptionCompat = new String[32];
        this.RatingCompat = new int[32];
        this.IconCompatParcelizer = reader;
    }

    public final void MediaBrowserCompatMediaItem() {
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        if (iIconCompatParcelizer != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, MediaDescriptionCompat());
            return;
        }
        int i = this.MediaSessionCompatToken;
        int i2 = i - 1;
        this.MediaSessionCompatToken = i2;
        this.MediaDescriptionCompat[i2] = null;
        int[] iArr = this.RatingCompat;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.MediaBrowserCompatMediaItem = 0;
    }

    public final String MediaDescriptionCompat() {
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.read + 1, (this.PlaybackStateCompatCustomAction - this.MediaMetadataCompat) + 1, " at line ", " column ", " path ");
        StringBuilder sb = new StringBuilder("$");
        int i = this.MediaSessionCompatToken;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.PlaybackStateCompat[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.RatingCompat[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.MediaDescriptionCompat[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        sbM.append(sb.toString());
        return sbM.toString();
    }

    public final double MediaMetadataCompat() throws IOException {
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        if (iIconCompatParcelizer == 15) {
            this.MediaBrowserCompatMediaItem = 0;
            int[] iArr = this.RatingCompat;
            int i = this.MediaSessionCompatToken - 1;
            iArr[i] = iArr[i] + 1;
            return this.MediaSessionCompatQueueItem;
        }
        if (iIconCompatParcelizer == 16) {
            this.MediaSessionCompatResultReceiverWrapper = new String(this.write, this.PlaybackStateCompatCustomAction, this.ParcelableVolumeInfo);
            this.PlaybackStateCompatCustomAction += this.ParcelableVolumeInfo;
        } else if (iIconCompatParcelizer == 8 || iIconCompatParcelizer == 9) {
            this.MediaSessionCompatResultReceiverWrapper = serializer(iIconCompatParcelizer == 8 ? '\'' : '\"');
        } else if (iIconCompatParcelizer == 10) {
            this.MediaSessionCompatResultReceiverWrapper = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        } else if (iIconCompatParcelizer != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, MediaDescriptionCompat());
            return 0.0d;
        }
        this.MediaBrowserCompatMediaItem = 11;
        double d = Double.parseDouble(this.MediaSessionCompatResultReceiverWrapper);
        if (!this.serializer && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d + MediaDescriptionCompat());
        }
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.MediaBrowserCompatMediaItem = 0;
        int[] iArr2 = this.RatingCompat;
        int i2 = this.MediaSessionCompatToken - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public final boolean MediaSessionCompatQueueItem() throws IOException {
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        return (iIconCompatParcelizer == 2 || iIconCompatParcelizer == 4) ? false : true;
    }

    public final int MediaSessionCompatResultReceiverWrapper() throws IOException {
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        if (iIconCompatParcelizer == 15) {
            long j = this.MediaSessionCompatQueueItem;
            int i = (int) j;
            if (j == i) {
                this.MediaBrowserCompatMediaItem = 0;
                int[] iArr = this.RatingCompat;
                int i2 = this.MediaSessionCompatToken - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + j + MediaDescriptionCompat());
        }
        if (iIconCompatParcelizer == 16) {
            this.MediaSessionCompatResultReceiverWrapper = new String(this.write, this.PlaybackStateCompatCustomAction, this.ParcelableVolumeInfo);
            this.PlaybackStateCompatCustomAction += this.ParcelableVolumeInfo;
        } else {
            if (iIconCompatParcelizer != 8 && iIconCompatParcelizer != 9 && iIconCompatParcelizer != 10) {
                StringBuilder sb = new StringBuilder("Expected an int but was ");
                sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, MediaDescriptionCompat());
                return 0;
            }
            if (iIconCompatParcelizer == 10) {
                this.MediaSessionCompatResultReceiverWrapper = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            } else {
                this.MediaSessionCompatResultReceiverWrapper = serializer(iIconCompatParcelizer == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.MediaSessionCompatResultReceiverWrapper);
                this.MediaBrowserCompatMediaItem = 0;
                int[] iArr2 = this.RatingCompat;
                int i4 = this.MediaSessionCompatToken - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.MediaBrowserCompatMediaItem = 11;
        double d = Double.parseDouble(this.MediaSessionCompatResultReceiverWrapper);
        int i5 = (int) d;
        if (i5 != d) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write("Expected an int but was ", this.MediaSessionCompatResultReceiverWrapper, MediaDescriptionCompat());
            return 0;
        }
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.MediaBrowserCompatMediaItem = 0;
        int[] iArr3 = this.RatingCompat;
        int i6 = this.MediaSessionCompatToken - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public final String MediaSessionCompatToken() throws IOException {
        String strSerializer;
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        if (iIconCompatParcelizer == 14) {
            strSerializer = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        } else if (iIconCompatParcelizer == 12) {
            strSerializer = serializer('\'');
        } else {
            if (iIconCompatParcelizer != 13) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, MediaDescriptionCompat());
                return null;
            }
            strSerializer = serializer('\"');
        }
        this.MediaBrowserCompatMediaItem = 0;
        this.MediaDescriptionCompat[this.MediaSessionCompatToken - 1] = strSerializer;
        return strSerializer;
    }

    public final String ParcelableVolumeInfo() throws IOException {
        String string;
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        if (iIconCompatParcelizer == 10) {
            string = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        } else if (iIconCompatParcelizer == 8) {
            string = serializer('\'');
        } else if (iIconCompatParcelizer == 9) {
            string = serializer('\"');
        } else if (iIconCompatParcelizer == 11) {
            string = this.MediaSessionCompatResultReceiverWrapper;
            this.MediaSessionCompatResultReceiverWrapper = null;
        } else if (iIconCompatParcelizer == 15) {
            string = Long.toString(this.MediaSessionCompatQueueItem);
        } else {
            if (iIconCompatParcelizer != 16) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, MediaDescriptionCompat());
                return null;
            }
            String str = new String(this.write, this.PlaybackStateCompatCustomAction, this.ParcelableVolumeInfo);
            this.PlaybackStateCompatCustomAction += this.ParcelableVolumeInfo;
            string = str;
        }
        this.MediaBrowserCompatMediaItem = 0;
        int[] iArr = this.RatingCompat;
        int i = this.MediaSessionCompatToken - 1;
        iArr[i] = iArr[i] + 1;
        return string;
    }

    public final long PlaybackStateCompat() throws IOException {
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        if (iIconCompatParcelizer == 15) {
            this.MediaBrowserCompatMediaItem = 0;
            int[] iArr = this.RatingCompat;
            int i = this.MediaSessionCompatToken - 1;
            iArr[i] = iArr[i] + 1;
            return this.MediaSessionCompatQueueItem;
        }
        if (iIconCompatParcelizer == 16) {
            this.MediaSessionCompatResultReceiverWrapper = new String(this.write, this.PlaybackStateCompatCustomAction, this.ParcelableVolumeInfo);
            this.PlaybackStateCompatCustomAction += this.ParcelableVolumeInfo;
        } else {
            if (iIconCompatParcelizer != 8 && iIconCompatParcelizer != 9 && iIconCompatParcelizer != 10) {
                StringBuilder sb = new StringBuilder("Expected a long but was ");
                sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, MediaDescriptionCompat());
                return 0L;
            }
            if (iIconCompatParcelizer == 10) {
                this.MediaSessionCompatResultReceiverWrapper = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            } else {
                this.MediaSessionCompatResultReceiverWrapper = serializer(iIconCompatParcelizer == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.MediaSessionCompatResultReceiverWrapper);
                this.MediaBrowserCompatMediaItem = 0;
                int[] iArr2 = this.RatingCompat;
                int i2 = this.MediaSessionCompatToken - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.MediaBrowserCompatMediaItem = 11;
        double d = Double.parseDouble(this.MediaSessionCompatResultReceiverWrapper);
        long j2 = (long) d;
        if (j2 != d) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write("Expected a long but was ", this.MediaSessionCompatResultReceiverWrapper, MediaDescriptionCompat());
            return 0L;
        }
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.MediaBrowserCompatMediaItem = 0;
        int[] iArr3 = this.RatingCompat;
        int i3 = this.MediaSessionCompatToken - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    public final void PlaybackStateCompatCustomAction() {
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        if (iIconCompatParcelizer != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, MediaDescriptionCompat());
        } else {
            this.MediaBrowserCompatMediaItem = 0;
            int[] iArr = this.RatingCompat;
            int i = this.MediaSessionCompatToken - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final boolean RatingCompat() throws IOException {
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        if (iIconCompatParcelizer == 5) {
            this.MediaBrowserCompatMediaItem = 0;
            int[] iArr = this.RatingCompat;
            int i = this.MediaSessionCompatToken - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iIconCompatParcelizer != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, MediaDescriptionCompat());
            return false;
        }
        this.MediaBrowserCompatMediaItem = 0;
        int[] iArr2 = this.RatingCompat;
        int i2 = this.MediaSessionCompatToken - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final void RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        if (iIconCompatParcelizer != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, MediaDescriptionCompat());
        } else {
            int i = this.MediaSessionCompatToken;
            this.MediaSessionCompatToken = i - 1;
            int[] iArr = this.RatingCompat;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.MediaBrowserCompatMediaItem = 0;
        }
    }

    public final IconCompatParcelizer r8lambda54BeH8ZsBru0CXI2CCSP2syNys() throws IOException {
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        switch (iIconCompatParcelizer) {
            case 1:
                return IconCompatParcelizer.BEGIN_OBJECT;
            case 2:
                return IconCompatParcelizer.END_OBJECT;
            case 3:
                return IconCompatParcelizer.BEGIN_ARRAY;
            case 4:
                return IconCompatParcelizer.END_ARRAY;
            case 5:
            case 6:
                return IconCompatParcelizer.BOOLEAN;
            case 7:
                return IconCompatParcelizer.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return IconCompatParcelizer.STRING;
            case 12:
            case 13:
            case 14:
                return IconCompatParcelizer.NAME;
            case 15:
            case 16:
                return IconCompatParcelizer.NUMBER;
            case 17:
                return IconCompatParcelizer.END_DOCUMENT;
            default:
                int iSerializer = isAppSetIdReadingEnabled.serializer();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
                return null;
        }
    }

    public final void read() {
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        if (iIconCompatParcelizer == 3) {
            write(1);
            this.RatingCompat[this.MediaSessionCompatToken - 1] = 0;
            this.MediaBrowserCompatMediaItem = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, MediaDescriptionCompat());
        }
    }

    public final void write() {
        int iIconCompatParcelizer = this.MediaBrowserCompatMediaItem;
        if (iIconCompatParcelizer == 0) {
            iIconCompatParcelizer = IconCompatParcelizer();
        }
        if (iIconCompatParcelizer == 1) {
            write(3);
            this.MediaBrowserCompatMediaItem = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, MediaDescriptionCompat());
        }
    }

    public final String toString() {
        return "JsonReader".concat(MediaDescriptionCompat());
    }

    public final void serializer() throws MalformedJsonException {
        if (this.serializer) {
            return;
        }
        IconCompatParcelizer("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final boolean read(char c) throws MalformedJsonException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        serializer();
        return false;
    }
}
