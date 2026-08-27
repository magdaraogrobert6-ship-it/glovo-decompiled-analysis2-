package o;

import bo.app.f2$$ExternalSyntheticLambda4;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestManager implements DateTimeConverter {
    public boolean IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer = 1;
    public final Object write;

    public RequestManager(getInAppMessageImageView getinappmessageimageview) {
        this.RemoteActionCompatParcelizer = getinappmessageimageview;
        this.write = new GlideException(getinappmessageimageview.write.RemoteActionCompatParcelizer());
    }

    @Override // o.DateTimeConverter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        int i = this.serializer;
        Object obj = this.write;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            if (i == 1) {
                try {
                    ((DateTimeConverter) obj).close();
                    return;
                } catch (IOException e) {
                    this.IconCompatParcelizer = true;
                    ((f2$$ExternalSyntheticLambda4) obj2).invoke(e);
                    return;
                }
            }
            getInAppMessageImageView getinappmessageimageview = (getInAppMessageImageView) obj2;
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            GlideException glideException = (GlideException) obj;
            ApiErrorResponseCompanion apiErrorResponseCompanion = glideException.IconCompatParcelizer;
            glideException.IconCompatParcelizer = ApiErrorResponseCompanion.PlaybackStateCompat;
            apiErrorResponseCompanion.N_();
            apiErrorResponseCompanion.O_();
            getinappmessageimageview.MediaBrowserCompatMediaItem = 3;
            return;
        }
        Deflater deflater = (Deflater) obj2;
        if (this.IconCompatParcelizer) {
            return;
        }
        deflater.finish();
        serializer(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            ((SingleRequest) obj).close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.IconCompatParcelizer = true;
        if (th != null) {
            throw th;
        }
    }

    public void serializer(boolean z) throws IOException {
        SVGParseException sVGParseExceptionRemoteActionCompatParcelizer;
        int iDeflate;
        Deflater deflater = (Deflater) this.RemoteActionCompatParcelizer;
        SingleRequest singleRequest = (SingleRequest) this.write;
        RegistryMissingComponentException registryMissingComponentException = singleRequest.bufferField;
        while (true) {
            sVGParseExceptionRemoteActionCompatParcelizer = registryMissingComponentException.RemoteActionCompatParcelizer(1);
            byte[] bArr = sVGParseExceptionRemoteActionCompatParcelizer.data;
            int i = sVGParseExceptionRemoteActionCompatParcelizer.limit;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                sVGParseExceptionRemoteActionCompatParcelizer.limit += iDeflate;
                registryMissingComponentException.size += (long) iDeflate;
                singleRequest.write();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (sVGParseExceptionRemoteActionCompatParcelizer.pos == sVGParseExceptionRemoteActionCompatParcelizer.limit) {
            registryMissingComponentException.head = sVGParseExceptionRemoteActionCompatParcelizer.read();
            ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseExceptionRemoteActionCompatParcelizer);
        }
    }

    @Override // o.DateTimeConverter
    public final void write(RegistryMissingComponentException registryMissingComponentException, long j) {
        int i = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            if (i != 1) {
                registryMissingComponentException.getClass();
                if (this.IconCompatParcelizer) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
                    return;
                } else {
                    InAppMessageHtmlBaseViewCompanion.read(registryMissingComponentException.size, 0L, j);
                    ((getInAppMessageImageView) obj).write.write(registryMissingComponentException, j);
                    return;
                }
            }
            if (this.IconCompatParcelizer) {
                registryMissingComponentException.RatingCompat(j);
                return;
            }
            try {
                ((DateTimeConverter) this.write).write(registryMissingComponentException, j);
                return;
            } catch (IOException e) {
                this.IconCompatParcelizer = true;
                ((f2$$ExternalSyntheticLambda4) obj).invoke(e);
                return;
            }
        }
        Deflater deflater = (Deflater) obj;
        registryMissingComponentException.getClass();
        setOptionalTextView.RemoteActionCompatParcelizer(registryMissingComponentException.size, 0L, j);
        while (j > 0) {
            SVGParseException sVGParseException = registryMissingComponentException.head;
            sVGParseException.getClass();
            int iMin = (int) Math.min(j, sVGParseException.limit - sVGParseException.pos);
            deflater.setInput(sVGParseException.data, sVGParseException.pos, iMin);
            serializer(false);
            long j2 = iMin;
            registryMissingComponentException.size -= j2;
            int i2 = sVGParseException.pos + iMin;
            sVGParseException.pos = i2;
            if (i2 == sVGParseException.limit) {
                registryMissingComponentException.head = sVGParseException.read();
                ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException);
            }
            j -= j2;
        }
        deflater.setInput(DataModule_ProvideSchedulerFactory.RemoteActionCompatParcelizer, 0, 0);
    }

    @Override // o.DateTimeConverter, java.io.Flushable
    public final void flush() {
        int i = this.serializer;
        Object obj = this.write;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            serializer(true);
            ((SingleRequest) obj).flush();
        } else if (i != 1) {
            if (this.IconCompatParcelizer) {
                return;
            }
            ((getInAppMessageImageView) obj2).write.flush();
        } else {
            try {
                ((DateTimeConverter) obj).flush();
            } catch (IOException e) {
                this.IconCompatParcelizer = true;
                ((f2$$ExternalSyntheticLambda4) obj2).invoke(e);
            }
        }
    }

    @Override // o.DateTimeConverter
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        int i = this.serializer;
        if (i != 0) {
            return i != 1 ? (GlideException) this.write : ((DateTimeConverter) this.write).RemoteActionCompatParcelizer();
        }
        return ((SingleRequest) this.write).sink.RemoteActionCompatParcelizer();
    }

    public String toString() {
        if (this.serializer != 0) {
            return super.toString();
        }
        return "DeflaterSink(" + ((SingleRequest) this.write) + ')';
    }

    public RequestManager(RegistryMissingComponentException registryMissingComponentException, Deflater deflater) {
        this.write = new SingleRequest(registryMissingComponentException);
        this.RemoteActionCompatParcelizer = deflater;
    }

    public RequestManager(DateTimeConverter dateTimeConverter, f2$$ExternalSyntheticLambda4 f2__externalsyntheticlambda4) {
        this.write = dateTimeConverter;
        this.RemoteActionCompatParcelizer = f2__externalsyntheticlambda4;
    }
}
