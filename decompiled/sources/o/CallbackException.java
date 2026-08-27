package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class CallbackException implements ItemSingleChoiceBinding {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final Object read;
    public final Object write;

    public CallbackException(InputStream inputStream, ApiErrorResponseCompanion apiErrorResponseCompanion) {
        inputStream.getClass();
        this.write = inputStream;
        this.read = apiErrorResponseCompanion;
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        Object obj2 = this.write;
        registryMissingComponentException.getClass();
        if (i != 0) {
            ApiExceptionSessionExpiredUnauthorized apiExceptionSessionExpiredUnauthorized = (ApiExceptionSessionExpiredUnauthorized) obj2;
            CallbackException callbackException = (CallbackException) obj;
            apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer();
            try {
                try {
                    long jRemoteActionCompatParcelizer = callbackException.RemoteActionCompatParcelizer(registryMissingComponentException, j);
                    if (apiExceptionSessionExpiredUnauthorized.write()) {
                        throw apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer((IOException) null);
                    }
                    return jRemoteActionCompatParcelizer;
                } catch (Throwable th) {
                    apiExceptionSessionExpiredUnauthorized.write();
                    throw th;
                }
            } catch (IOException e) {
                if (apiExceptionSessionExpiredUnauthorized.write()) {
                    throw apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer(e);
                }
                throw e;
            }
        }
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
            return 0L;
        }
        try {
            ((ApiErrorResponseCompanion) obj).serializer();
            SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = registryMissingComponentException.RemoteActionCompatParcelizer(1);
            int i2 = ((InputStream) obj2).read(sVGParseExceptionRemoteActionCompatParcelizer.data, sVGParseExceptionRemoteActionCompatParcelizer.limit, (int) Math.min(j, 8192 - sVGParseExceptionRemoteActionCompatParcelizer.limit));
            if (i2 == -1) {
                if (sVGParseExceptionRemoteActionCompatParcelizer.pos == sVGParseExceptionRemoteActionCompatParcelizer.limit) {
                    registryMissingComponentException.head = sVGParseExceptionRemoteActionCompatParcelizer.read();
                    ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseExceptionRemoteActionCompatParcelizer);
                }
                return -1L;
            }
            sVGParseExceptionRemoteActionCompatParcelizer.limit += i2;
            long j2 = i2;
            registryMissingComponentException.size += j2;
            return j2;
        } catch (AssertionError e2) {
            if (TooManyRequestsException.RemoteActionCompatParcelizer(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i == 0) {
            ((InputStream) obj).close();
            return;
        }
        ApiExceptionSessionExpiredUnauthorized apiExceptionSessionExpiredUnauthorized = (ApiExceptionSessionExpiredUnauthorized) obj;
        CallbackException callbackException = (CallbackException) this.read;
        apiExceptionSessionExpiredUnauthorized.IconCompatParcelizer();
        try {
            try {
                callbackException.close();
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

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer != 0 ? (ApiExceptionSessionExpiredUnauthorized) this.write : (ApiErrorResponseCompanion) this.read;
    }

    public final String toString() {
        if (this.IconCompatParcelizer != 0) {
            return "AsyncTimeout.source(" + ((CallbackException) this.read) + ')';
        }
        return "source(" + ((InputStream) this.write) + ')';
    }

    public CallbackException(ApiExceptionSessionExpiredUnauthorized apiExceptionSessionExpiredUnauthorized, CallbackException callbackException) {
        this.write = apiExceptionSessionExpiredUnauthorized;
        this.read = callbackException;
    }
}
