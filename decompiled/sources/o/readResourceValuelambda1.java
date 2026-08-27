package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okio.ByteString;
import com.sentiance.okio.c$b;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class readResourceValuelambda1 implements r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k {
    public final r8lambdaBEyrNr8p6809BwlBoRO_sTaNs IconCompatParcelizer = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
    public boolean read;
    public final getResourceConfigurationValue write;

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.read;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final long ComponentActivity() {
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans;
        MediaDescriptionCompat(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zSerializer = serializer(i2);
            r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
            if (!zSerializer) {
                break;
            }
            byte bRatingCompat = r8lambdabeyrnr8p6809bwlboro_stans.RatingCompat(i);
            if ((bRatingCompat < 48 || bRatingCompat > 57) && ((bRatingCompat < 97 || bRatingCompat > 102) && (bRatingCompat < 65 || bRatingCompat > 70))) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bRatingCompat)));
            }
            i = i2;
        }
        return r8lambdabeyrnr8p6809bwlboro_stans.ComponentActivity();
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final byte MediaBrowserCompatMediaItem() {
        MediaDescriptionCompat(1L);
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final short MediaSessionCompatToken() {
        MediaDescriptionCompat(2L);
        return this.IconCompatParcelizer.MediaSessionCompatToken();
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final int ParcelableVolumeInfo() {
        MediaDescriptionCompat(4L);
        return this.IconCompatParcelizer.ParcelableVolumeInfo();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
        if (r8lambdabeyrnr8p6809bwlboro_stans.serializer == 0 && this.write.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L) == -1) {
            return -1;
        }
        return r8lambdabeyrnr8p6809bwlboro_stans.read(byteBuffer);
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final InputStream r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return new c$b(this, 2);
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final ByteString read(long j) {
        MediaDescriptionCompat(j);
        return this.IconCompatParcelizer.read(j);
    }

    public final byte[] write(long j) {
        MediaDescriptionCompat(j);
        return this.IconCompatParcelizer.MediaSessionCompatQueueItem(j);
    }

    public final void IconCompatParcelizer(byte[] bArr) throws EOFException {
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
        int i = 0;
        try {
            MediaDescriptionCompat(bArr.length);
            while (i < bArr.length) {
                int iIconCompatParcelizer = r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(bArr, i, bArr.length - i);
                if (iIconCompatParcelizer == -1) {
                    DrawableTransformation.IconCompatParcelizer();
                    return;
                }
                i += iIconCompatParcelizer;
            }
        } catch (EOFException e) {
            int i2 = 0;
            while (true) {
                long j = r8lambdabeyrnr8p6809bwlboro_stans.serializer;
                if (j <= 0) {
                    throw e;
                }
                int iIconCompatParcelizer2 = r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(bArr, i2, (int) j);
                if (iIconCompatParcelizer2 == -1) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
                    return;
                }
                i2 += iIconCompatParcelizer2;
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.write + ")";
    }

    public readResourceValuelambda1(getResourceConfigurationValue getresourceconfigurationvalue) {
        if (getresourceconfigurationvalue != null) {
            this.write = getresourceconfigurationvalue;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("source == null");
            throw null;
        }
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final String MediaSessionCompatQueueItem() {
        return RemoteActionCompatParcelizer(Long.MAX_VALUE);
    }

    public final boolean RemoteActionCompatParcelizer() {
        if (this.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return false;
        }
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
        return r8lambdabeyrnr8p6809bwlboro_stans.MediaSessionCompatResultReceiverWrapper() && this.write.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.read) {
            return;
        }
        this.read = true;
        this.write.close();
        this.IconCompatParcelizer.serializer();
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final boolean serializer(long j) {
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans;
        if (j >= 0) {
            if (this.read) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
                return false;
            }
            do {
                r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
                if (r8lambdabeyrnr8p6809bwlboro_stans.serializer >= j) {
                    return true;
                }
            } while (this.write.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L) != -1);
            return false;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
        return false;
    }

    @Override // o.getResourceConfigurationValue
    public final long read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) {
        if (r8lambdabeyrnr8p6809bwlboro_stans == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("sink == null");
            return 0L;
        }
        if (j >= 0) {
            if (!this.read) {
                r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2 = this.IconCompatParcelizer;
                if (r8lambdabeyrnr8p6809bwlboro_stans2.serializer == 0 && this.write.read(r8lambdabeyrnr8p6809bwlboro_stans2, 8192L) == -1) {
                    return -1L;
                }
                return r8lambdabeyrnr8p6809bwlboro_stans2.read(r8lambdabeyrnr8p6809bwlboro_stans, Math.min(j, r8lambdabeyrnr8p6809bwlboro_stans2.serializer));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // o.getResourceConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final void IconCompatParcelizer(long j) {
        if (this.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return;
        }
        while (j > 0) {
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
            if (r8lambdabeyrnr8p6809bwlboro_stans.serializer == 0 && this.write.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L) == -1) {
                DrawableTransformation.IconCompatParcelizer();
                return;
            } else {
                long jMin = Math.min(j, r8lambdabeyrnr8p6809bwlboro_stans.serializer);
                r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(jMin);
                j -= jMin;
            }
        }
    }

    public final String serializer() {
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((byte) 10, 0L, Long.MAX_VALUE);
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
        if (jRemoteActionCompatParcelizer == -1) {
            long j = r8lambdabeyrnr8p6809bwlboro_stans.serializer;
            if (j == 0) {
                return null;
            }
            MediaDescriptionCompat(j);
            return r8lambdabeyrnr8p6809bwlboro_stans.write(j, isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer);
        }
        return r8lambdabeyrnr8p6809bwlboro_stans.MediaBrowserCompatMediaItem(jRemoteActionCompatParcelizer);
    }

    public final long RemoteActionCompatParcelizer(byte b, long j, long j2) {
        long jMax = 0;
        if (this.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        if (j2 < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        while (jMax < j2) {
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
            long jWrite = r8lambdabeyrnr8p6809bwlboro_stans.write(b, jMax, j2);
            if (jWrite != -1) {
                return jWrite;
            }
            long j3 = r8lambdabeyrnr8p6809bwlboro_stans.serializer;
            if (j3 >= j2 || this.write.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final String RemoteActionCompatParcelizer(long j) throws EOFException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((byte) 10, 0L, j2);
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
            if (jRemoteActionCompatParcelizer != -1) {
                return r8lambdabeyrnr8p6809bwlboro_stans.MediaBrowserCompatMediaItem(jRemoteActionCompatParcelizer);
            }
            if (j2 < Long.MAX_VALUE && serializer(j2) && r8lambdabeyrnr8p6809bwlboro_stans.RatingCompat(j2 - 1) == 13 && serializer(1 + j2) && r8lambdabeyrnr8p6809bwlboro_stans.RatingCompat(j2) == 10) {
                return r8lambdabeyrnr8p6809bwlboro_stans.MediaBrowserCompatMediaItem(j2);
            }
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2 = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
            r8lambdabeyrnr8p6809bwlboro_stans.read(r8lambdabeyrnr8p6809bwlboro_stans2, 0L, Math.min(32L, r8lambdabeyrnr8p6809bwlboro_stans.serializer));
            DrawableTransformation.IconCompatParcelizer(Math.min(r8lambdabeyrnr8p6809bwlboro_stans.serializer, j), new ByteString(r8lambdabeyrnr8p6809bwlboro_stans2.RatingCompat()).read());
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(j, "limit < 0: "));
        return null;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final void MediaDescriptionCompat(long j) {
        if (serializer(j)) {
            return;
        }
        DrawableTransformation.IconCompatParcelizer();
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final r8lambdaBEyrNr8p6809BwlBoRO_sTaNs MediaDescriptionCompat() {
        return this.IconCompatParcelizer;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final String write(Charset charset) {
        if (charset != null) {
            getResourceConfigurationValue getresourceconfigurationvalue = this.write;
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
            r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(getresourceconfigurationvalue);
            return r8lambdabeyrnr8p6809bwlboro_stans.write(charset);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("charset == null");
        return null;
    }

    @Override // o.r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k
    public final boolean read(ByteString byteString) {
        int iWrite = byteString.write();
        if (!this.read) {
            if (iWrite >= 0 && byteString.write() >= iWrite) {
                for (int i = 0; i < iWrite; i++) {
                    long j = i;
                    if (serializer(1 + j) && this.IconCompatParcelizer.RatingCompat(j) == byteString.RemoteActionCompatParcelizer(i)) {
                    }
                }
                return true;
            }
            return false;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        return false;
    }
}
