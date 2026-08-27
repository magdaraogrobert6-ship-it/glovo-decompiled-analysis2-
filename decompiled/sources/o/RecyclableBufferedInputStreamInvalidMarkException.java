package o;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class RecyclableBufferedInputStreamInvalidMarkException implements DateTimeConverter {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object read;

    public /* synthetic */ RecyclableBufferedInputStreamInvalidMarkException(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.IconCompatParcelizer = obj2;
    }

    @Override // o.DateTimeConverter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i == 0) {
            ((OutputStream) obj).close();
            return;
        }
        ApiExceptionSessionExpiredUnauthorized apiExceptionSessionExpiredUnauthorized = (ApiExceptionSessionExpiredUnauthorized) obj;
        RecyclableBufferedInputStreamInvalidMarkException recyclableBufferedInputStreamInvalidMarkException = (RecyclableBufferedInputStreamInvalidMarkException) this.IconCompatParcelizer;
        apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer();
        try {
            try {
                recyclableBufferedInputStreamInvalidMarkException.close();
                if (apiExceptionSessionExpiredUnauthorized.write()) {
                    throw apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer((IOException) null);
                }
            } catch (IOException e) {
                if (!apiExceptionSessionExpiredUnauthorized.write()) {
                    throw e;
                }
                throw apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer(e);
            }
        } catch (Throwable th) {
            apiExceptionSessionExpiredUnauthorized.write();
            throw th;
        }
    }

    @Override // o.DateTimeConverter, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i == 0) {
            ((OutputStream) obj).flush();
            return;
        }
        ApiExceptionSessionExpiredUnauthorized apiExceptionSessionExpiredUnauthorized = (ApiExceptionSessionExpiredUnauthorized) obj;
        RecyclableBufferedInputStreamInvalidMarkException recyclableBufferedInputStreamInvalidMarkException = (RecyclableBufferedInputStreamInvalidMarkException) this.IconCompatParcelizer;
        apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer();
        try {
            try {
                recyclableBufferedInputStreamInvalidMarkException.flush();
                if (apiExceptionSessionExpiredUnauthorized.write()) {
                    throw apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer((IOException) null);
                }
            } catch (IOException e) {
                if (!apiExceptionSessionExpiredUnauthorized.write()) {
                    throw e;
                }
                throw apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer(e);
            }
        } catch (Throwable th) {
            apiExceptionSessionExpiredUnauthorized.write();
            throw th;
        }
    }

    @Override // o.DateTimeConverter
    public final void write(RegistryMissingComponentException registryMissingComponentException, long j) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.read;
        registryMissingComponentException.getClass();
        if (i != 0) {
            setOptionalTextView.RemoteActionCompatParcelizer(registryMissingComponentException.size, 0L, j);
            while (j > 0) {
                SVGParseException sVGParseException = registryMissingComponentException.head;
                sVGParseException.getClass();
                long j2 = 0;
                while (j2 < 65536) {
                    j2 += (long) (sVGParseException.limit - sVGParseException.pos);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        sVGParseException = sVGParseException.next;
                        sVGParseException.getClass();
                    }
                }
                ApiExceptionSessionExpiredUnauthorized apiExceptionSessionExpiredUnauthorized = (ApiExceptionSessionExpiredUnauthorized) obj2;
                RecyclableBufferedInputStreamInvalidMarkException recyclableBufferedInputStreamInvalidMarkException = (RecyclableBufferedInputStreamInvalidMarkException) obj;
                apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer();
                try {
                    try {
                        recyclableBufferedInputStreamInvalidMarkException.write(registryMissingComponentException, j2);
                        if (apiExceptionSessionExpiredUnauthorized.write()) {
                            throw apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer((IOException) null);
                        }
                        j -= j2;
                    } catch (IOException e) {
                        if (!apiExceptionSessionExpiredUnauthorized.write()) {
                            throw e;
                        }
                        throw apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer(e);
                    }
                } catch (Throwable th) {
                    apiExceptionSessionExpiredUnauthorized.write();
                    throw th;
                }
            }
            return;
        }
        setOptionalTextView.RemoteActionCompatParcelizer(registryMissingComponentException.size, 0L, j);
        while (j > 0) {
            ((ApiErrorResponseCompanion) obj).serializer();
            SVGParseException sVGParseException2 = registryMissingComponentException.head;
            sVGParseException2.getClass();
            int iMin = (int) Math.min(j, sVGParseException2.limit - sVGParseException2.pos);
            ((OutputStream) obj2).write(sVGParseException2.data, sVGParseException2.pos, iMin);
            int i2 = sVGParseException2.pos + iMin;
            sVGParseException2.pos = i2;
            long j3 = iMin;
            j -= j3;
            registryMissingComponentException.size -= j3;
            if (i2 == sVGParseException2.limit) {
                registryMissingComponentException.head = sVGParseException2.read();
                ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException2);
            }
        }
    }

    @Override // o.DateTimeConverter
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer != 0 ? (ApiExceptionSessionExpiredUnauthorized) this.read : (ApiErrorResponseCompanion) this.IconCompatParcelizer;
    }

    public final String toString() {
        if (this.RemoteActionCompatParcelizer != 0) {
            return "AsyncTimeout.sink(" + ((RecyclableBufferedInputStreamInvalidMarkException) this.IconCompatParcelizer) + ')';
        }
        return "sink(" + ((OutputStream) this.read) + ')';
    }
}
