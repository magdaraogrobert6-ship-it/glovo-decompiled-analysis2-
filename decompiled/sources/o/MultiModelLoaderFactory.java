package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiModelLoaderFactory implements ItemSingleChoiceBinding {
    public int IconCompatParcelizer;
    public final GifDrawableTransformation RemoteActionCompatParcelizer;
    public final Inflater read;
    public boolean serializer;

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.source.RemoteActionCompatParcelizer();
    }

    public final long write(RegistryMissingComponentException registryMissingComponentException, long j) {
        Inflater inflater = this.read;
        registryMissingComponentException.getClass();
        if (j < 0) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = registryMissingComponentException.RemoteActionCompatParcelizer(1);
                int iMin = (int) Math.min(j, 8192 - sVGParseExceptionRemoteActionCompatParcelizer.limit);
                boolean zNeedsInput = inflater.needsInput();
                GifDrawableTransformation gifDrawableTransformation = this.RemoteActionCompatParcelizer;
                if (zNeedsInput && !gifDrawableTransformation.RatingCompat()) {
                    SVGParseException sVGParseException = gifDrawableTransformation.bufferField.head;
                    sVGParseException.getClass();
                    int i = sVGParseException.limit;
                    int i2 = sVGParseException.pos;
                    int i3 = i - i2;
                    this.IconCompatParcelizer = i3;
                    inflater.setInput(sVGParseException.data, i2, i3);
                }
                int iInflate = inflater.inflate(sVGParseExceptionRemoteActionCompatParcelizer.data, sVGParseExceptionRemoteActionCompatParcelizer.limit, iMin);
                int i4 = this.IconCompatParcelizer;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.IconCompatParcelizer -= remaining;
                    gifDrawableTransformation.RatingCompat(remaining);
                }
                if (iInflate > 0) {
                    sVGParseExceptionRemoteActionCompatParcelizer.limit += iInflate;
                    long j2 = iInflate;
                    registryMissingComponentException.size += j2;
                    return j2;
                }
                if (sVGParseExceptionRemoteActionCompatParcelizer.pos == sVGParseExceptionRemoteActionCompatParcelizer.limit) {
                    registryMissingComponentException.head = sVGParseExceptionRemoteActionCompatParcelizer.read();
                    ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseExceptionRemoteActionCompatParcelizer);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    public MultiModelLoaderFactory(GifDrawableTransformation gifDrawableTransformation, Inflater inflater) {
        this.RemoteActionCompatParcelizer = gifDrawableTransformation;
        this.read = inflater;
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws EOFException {
        registryMissingComponentException.getClass();
        do {
            long jWrite = write(registryMissingComponentException, j);
            if (jWrite > 0) {
                return jWrite;
            }
            Inflater inflater = this.read;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.RemoteActionCompatParcelizer.RatingCompat());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.serializer) {
            return;
        }
        this.read.end();
        this.serializer = true;
        this.RemoteActionCompatParcelizer.close();
    }
}
