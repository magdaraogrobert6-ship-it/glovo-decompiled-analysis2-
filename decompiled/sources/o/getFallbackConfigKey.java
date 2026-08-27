package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class getFallbackConfigKey implements getResourceConfigurationValue {
    public final Inflater IconCompatParcelizer;
    public final readResourceValuelambda0 read;
    public final readResourceValuelambda1 write;
    public int serializer = 0;
    public final CRC32 RemoteActionCompatParcelizer = new CRC32();

    @Override // o.getResourceConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.write.write.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j, long j2) {
        resetCachelambda0 resetcachelambda0 = r8lambdabeyrnr8p6809bwlboro_stans.read;
        while (true) {
            long j3 = resetcachelambda0.read - resetcachelambda0.IconCompatParcelizer;
            if (j < j3) {
                break;
            }
            j -= j3;
            resetcachelambda0 = resetcachelambda0.RatingCompat;
        }
        while (j2 > 0) {
            int i = (int) (((long) resetcachelambda0.IconCompatParcelizer) + j);
            int iMin = (int) Math.min(resetcachelambda0.read - i, j2);
            this.RemoteActionCompatParcelizer.update(resetcachelambda0.serializer, i, iMin);
            j2 -= (long) iMin;
            resetcachelambda0 = resetcachelambda0.RatingCompat;
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.read.close();
    }

    public getFallbackConfigKey(getResourceConfigurationValue getresourceconfigurationvalue) {
        if (getresourceconfigurationvalue == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("source == null");
            throw null;
        }
        Inflater inflater = new Inflater(true);
        this.IconCompatParcelizer = inflater;
        java.util.logging.Logger logger = getResourceIdentifier.read;
        readResourceValuelambda1 readresourcevaluelambda1 = new readResourceValuelambda1(getresourceconfigurationvalue);
        this.write = readresourcevaluelambda1;
        this.read = new readResourceValuelambda0(readresourcevaluelambda1, inflater);
    }

    @Override // o.getResourceConfigurationValue
    public final long read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) throws IOException {
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2;
        int i = this.serializer;
        CRC32 crc32 = this.RemoteActionCompatParcelizer;
        readResourceValuelambda1 readresourcevaluelambda1 = this.write;
        int i2 = 1;
        if (i == 0) {
            readresourcevaluelambda1.MediaDescriptionCompat(10L);
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans3 = readresourcevaluelambda1.IconCompatParcelizer;
            byte bRatingCompat = r8lambdabeyrnr8p6809bwlboro_stans3.RatingCompat(3L);
            boolean z = ((bRatingCompat >> 1) & 1) == 1;
            if (z) {
                IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans3, 0L, 10L);
            }
            read(8075, readresourcevaluelambda1.MediaSessionCompatToken(), "ID1ID2");
            readresourcevaluelambda1.IconCompatParcelizer(8L);
            if (((bRatingCompat >> 2) & 1) == 1) {
                readresourcevaluelambda1.MediaDescriptionCompat(2L);
                if (z) {
                    IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans3, 0L, 2L);
                }
                short sMediaSessionCompatToken = r8lambdabeyrnr8p6809bwlboro_stans3.MediaSessionCompatToken();
                Charset charset = isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer;
                long j2 = ((short) (((sMediaSessionCompatToken & 65280) >>> 8) | ((sMediaSessionCompatToken & 255) << 8))) & 65535;
                readresourcevaluelambda1.MediaDescriptionCompat(j2);
                if (z) {
                    IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans3, 0L, j2);
                }
                readresourcevaluelambda1.IconCompatParcelizer(j2);
            }
            if (((bRatingCompat >> 3) & 1) == 1) {
                i2 = 1;
                r8lambdabeyrnr8p6809bwlboro_stans2 = r8lambdabeyrnr8p6809bwlboro_stans3;
                long jRemoteActionCompatParcelizer = readresourcevaluelambda1.RemoteActionCompatParcelizer((byte) 0, 0L, Long.MAX_VALUE);
                if (jRemoteActionCompatParcelizer != -1) {
                    if (z) {
                        IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans2, 0L, jRemoteActionCompatParcelizer + 1);
                    }
                    readresourcevaluelambda1.IconCompatParcelizer(jRemoteActionCompatParcelizer + 1);
                } else {
                    DrawableTransformation.IconCompatParcelizer();
                    return 0L;
                }
            } else {
                r8lambdabeyrnr8p6809bwlboro_stans2 = r8lambdabeyrnr8p6809bwlboro_stans3;
            }
            if (((bRatingCompat >> 4) & i2) == i2) {
                i2 = i2;
                long jRemoteActionCompatParcelizer2 = readresourcevaluelambda1.RemoteActionCompatParcelizer((byte) 0, 0L, Long.MAX_VALUE);
                if (jRemoteActionCompatParcelizer2 != -1) {
                    if (z) {
                        IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans2, 0L, jRemoteActionCompatParcelizer2 + 1);
                    }
                    readresourcevaluelambda1.IconCompatParcelizer(jRemoteActionCompatParcelizer2 + 1);
                } else {
                    DrawableTransformation.IconCompatParcelizer();
                    return 0L;
                }
            }
            if (z) {
                readresourcevaluelambda1.MediaDescriptionCompat(2L);
                short sMediaSessionCompatToken2 = r8lambdabeyrnr8p6809bwlboro_stans2.MediaSessionCompatToken();
                Charset charset2 = isInAppMessageAccessibilityExclusiveModeEnabled.RemoteActionCompatParcelizer;
                read((short) (((sMediaSessionCompatToken2 & 65280) >>> 8) | ((sMediaSessionCompatToken2 & 255) << 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.serializer = i2;
        }
        if (this.serializer == i2) {
            long j3 = r8lambdabeyrnr8p6809bwlboro_stans.serializer;
            long j4 = this.read.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L);
            if (j4 != -1) {
                IconCompatParcelizer(r8lambdabeyrnr8p6809bwlboro_stans, j3, j4);
                return j4;
            }
            this.serializer = 2;
        }
        if (this.serializer == 2) {
            readresourcevaluelambda1.MediaDescriptionCompat(4L);
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans4 = readresourcevaluelambda1.IconCompatParcelizer;
            read(isInAppMessageAccessibilityExclusiveModeEnabled.write(r8lambdabeyrnr8p6809bwlboro_stans4.ParcelableVolumeInfo()), (int) crc32.getValue(), "CRC");
            readresourcevaluelambda1.MediaDescriptionCompat(4L);
            read(isInAppMessageAccessibilityExclusiveModeEnabled.write(r8lambdabeyrnr8p6809bwlboro_stans4.ParcelableVolumeInfo()), (int) this.IconCompatParcelizer.getBytesWritten(), "ISIZE");
            this.serializer = 3;
            if (!readresourcevaluelambda1.RemoteActionCompatParcelizer()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    public static void read(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
