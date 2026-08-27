package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class DecodeJob implements ItemSingleChoiceBinding {
    public final GifDrawableTransformation IconCompatParcelizer;
    public final Inflater RemoteActionCompatParcelizer;
    public final MultiModelLoaderFactory read;
    public final CRC32 serializer;
    public byte write;

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.source.RemoteActionCompatParcelizer();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.read.close();
    }

    public final void serializer(RegistryMissingComponentException registryMissingComponentException, long j, long j2) {
        SVGParseException sVGParseException = registryMissingComponentException.head;
        sVGParseException.getClass();
        while (true) {
            long j3 = sVGParseException.limit - sVGParseException.pos;
            if (j < j3) {
                break;
            }
            j -= j3;
            sVGParseException = sVGParseException.next;
            sVGParseException.getClass();
        }
        while (j2 > 0) {
            int i = (int) (((long) sVGParseException.pos) + j);
            int iMin = (int) Math.min(sVGParseException.limit - i, j2);
            this.serializer.update(sVGParseException.data, i, iMin);
            j2 -= (long) iMin;
            sVGParseException = sVGParseException.next;
            sVGParseException.getClass();
            j = 0;
        }
    }

    public DecodeJob(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException) {
        registryNoSourceEncoderAvailableException.getClass();
        GifDrawableTransformation gifDrawableTransformation = new GifDrawableTransformation(registryNoSourceEncoderAvailableException);
        this.IconCompatParcelizer = gifDrawableTransformation;
        Inflater inflater = new Inflater(true);
        this.RemoteActionCompatParcelizer = inflater;
        this.read = new MultiModelLoaderFactory(gifDrawableTransformation, inflater);
        this.serializer = new CRC32();
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws IOException {
        RegistryMissingComponentException registryMissingComponentException2;
        long j2;
        registryMissingComponentException.getClass();
        if (j < 0) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = this.write;
        CRC32 crc32 = this.serializer;
        GifDrawableTransformation gifDrawableTransformation = this.IconCompatParcelizer;
        byte b2 = 1;
        if (b == 0) {
            gifDrawableTransformation.MediaMetadataCompat(10L);
            RegistryMissingComponentException registryMissingComponentException3 = gifDrawableTransformation.bufferField;
            byte bIconCompatParcelizer = registryMissingComponentException3.IconCompatParcelizer(3L);
            boolean z = ((bIconCompatParcelizer >> 1) & 1) == 1;
            if (z) {
                serializer(registryMissingComponentException3, 0L, 10L);
            }
            RemoteActionCompatParcelizer(8075, gifDrawableTransformation.ComponentActivity(), "ID1ID2");
            gifDrawableTransformation.RatingCompat(8L);
            if (((bIconCompatParcelizer >> 2) & 1) == 1) {
                gifDrawableTransformation.MediaMetadataCompat(2L);
                if (z) {
                    serializer(registryMissingComponentException3, 0L, 2L);
                }
                long jR8lambda7IJBVrN0sHyidCAZufWEJFc7yY = registryMissingComponentException3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() & 65535;
                gifDrawableTransformation.MediaMetadataCompat(jR8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                if (z) {
                    serializer(registryMissingComponentException3, 0L, jR8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    j2 = jR8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                } else {
                    j2 = jR8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                }
                gifDrawableTransformation.RatingCompat(j2);
            }
            if (((bIconCompatParcelizer >> 3) & 1) == 1) {
                registryMissingComponentException2 = registryMissingComponentException3;
                long jWrite = gifDrawableTransformation.write((byte) 0, 0L, Long.MAX_VALUE);
                if (jWrite != -1) {
                    if (z) {
                        serializer(registryMissingComponentException2, 0L, jWrite + 1);
                    }
                    r5.RatingCompat(jWrite + 1);
                } else {
                    DrawableTransformation.IconCompatParcelizer();
                    return 0L;
                }
            } else {
                registryMissingComponentException2 = registryMissingComponentException3;
            }
            if (((bIconCompatParcelizer >> 4) & b2) == b2) {
                long jWrite2 = gifDrawableTransformation.write((byte) 0, 0L, Long.MAX_VALUE);
                if (jWrite2 != -1) {
                    if (z) {
                        serializer(registryMissingComponentException2, 0L, jWrite2 + 1);
                    }
                    gifDrawableTransformation.RatingCompat(jWrite2 + 1);
                } else {
                    DrawableTransformation.IconCompatParcelizer();
                    return 0L;
                }
            }
            if (z) {
                RemoteActionCompatParcelizer(gifDrawableTransformation.read(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.write = b2;
        } else {
            b2 = 1;
            gifDrawableTransformation = gifDrawableTransformation;
        }
        if (this.write == b2) {
            long j3 = registryMissingComponentException.size;
            long jRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(registryMissingComponentException, j);
            if (jRemoteActionCompatParcelizer != -1) {
                serializer(registryMissingComponentException, j3, jRemoteActionCompatParcelizer);
                return jRemoteActionCompatParcelizer;
            }
            this.write = (byte) 2;
        }
        if (this.write == 2) {
            RemoteActionCompatParcelizer(gifDrawableTransformation.IconCompatParcelizer(), (int) crc32.getValue(), "CRC");
            RemoteActionCompatParcelizer(gifDrawableTransformation.IconCompatParcelizer(), (int) this.RemoteActionCompatParcelizer.getBytesWritten(), "ISIZE");
            this.write = (byte) 3;
            if (!gifDrawableTransformation.RatingCompat()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    public static void RemoteActionCompatParcelizer(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, ": actual 0x");
        sbM.append(hideCurrentlyDisplayingInAppMessage.serializer(8, setOptionalTextView.IconCompatParcelizer(i2)));
        sbM.append(" != expected 0x");
        sbM.append(hideCurrentlyDisplayingInAppMessage.serializer(8, setOptionalTextView.IconCompatParcelizer(i)));
        throw new IOException(sbM.toString());
    }
}
