package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleRequest implements RegistryNoImageHeaderParserException {
    public final RegistryMissingComponentException bufferField;
    public boolean closed;
    public final DateTimeConverter sink;

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryMissingComponentException MediaSessionCompatQueueItem() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.closed;
    }

    @Override // o.DateTimeConverter
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.sink.RemoteActionCompatParcelizer();
    }

    @Override // o.DateTimeConverter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        DateTimeConverter dateTimeConverter = this.sink;
        if (this.closed) {
            return;
        }
        RegistryMissingComponentException registryMissingComponentException = this.bufferField;
        long j = registryMissingComponentException.size;
        if (j > 0) {
            dateTimeConverter.write(registryMissingComponentException, j);
        }
        th = null;
        try {
            dateTimeConverter.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public SingleRequest(DateTimeConverter dateTimeConverter) {
        dateTimeConverter.getClass();
        this.sink = dateTimeConverter;
        this.bufferField = new RegistryMissingComponentException();
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException RemoteActionCompatParcelizer(byte[] bArr) {
        bArr.getClass();
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.bufferField.write(bArr, 0, bArr.length);
        write();
        return this;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException read(String str) {
        str.getClass();
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.bufferField.IconCompatParcelizer(str);
        write();
        return this;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException IconCompatParcelizer(int i) {
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.bufferField.MediaMetadataCompat(i);
        write();
        return this;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException MediaDescriptionCompat(long j) {
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.bufferField.MediaBrowserCompatMediaItem(j);
        write();
        return this;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException MediaSessionCompatQueueItem(int i) {
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.bufferField.MediaBrowserCompatMediaItem(i);
        write();
        return this;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException MediaSessionCompatQueueItem(long j) {
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.bufferField.MediaSessionCompatResultReceiverWrapper(j);
        write();
        return this;
    }

    @Override // o.RegistryNoImageHeaderParserException, o.DateTimeConverter, java.io.Flushable
    public final void flush() {
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return;
        }
        RegistryMissingComponentException registryMissingComponentException = this.bufferField;
        long j = registryMissingComponentException.size;
        DateTimeConverter dateTimeConverter = this.sink;
        if (j > 0) {
            dateTimeConverter.write(registryMissingComponentException, j);
        }
        dateTimeConverter.flush();
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException read() {
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        RegistryMissingComponentException registryMissingComponentException = this.bufferField;
        long j = registryMissingComponentException.size;
        if (j > 0) {
            this.sink.write(registryMissingComponentException, j);
        }
        return this;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException serializer(int i) {
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        this.bufferField.read(i);
        write();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.sink + ')';
    }

    public final RegistryNoImageHeaderParserException write() {
        if (this.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return null;
        }
        RegistryMissingComponentException registryMissingComponentException = this.bufferField;
        long jIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer();
        if (jIconCompatParcelizer > 0) {
            this.sink.write(registryMissingComponentException, jIconCompatParcelizer);
        }
        return this;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final long IconCompatParcelizer(ItemSingleChoiceBinding itemSingleChoiceBinding) {
        itemSingleChoiceBinding.getClass();
        long j = 0;
        while (true) {
            long jRemoteActionCompatParcelizer = itemSingleChoiceBinding.RemoteActionCompatParcelizer(this.bufferField, 8192L);
            if (jRemoteActionCompatParcelizer == -1) {
                return j;
            }
            j += jRemoteActionCompatParcelizer;
            write();
        }
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException write(int i, int i2, String str) {
        str.getClass();
        if (!this.closed) {
            this.bufferField.IconCompatParcelizer(i, i2, str);
            write();
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        return null;
    }

    @Override // o.DateTimeConverter
    public final void write(RegistryMissingComponentException registryMissingComponentException, long j) {
        registryMissingComponentException.getClass();
        if (!this.closed) {
            this.bufferField.write(registryMissingComponentException, j);
            write();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        }
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException IconCompatParcelizer(RequestBuilder requestBuilder) {
        requestBuilder.getClass();
        if (!this.closed) {
            this.bufferField.serializer(requestBuilder);
            write();
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        return null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.closed) {
            int iWrite = this.bufferField.write(byteBuffer);
            write();
            return iWrite;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        return 0;
    }

    @Override // o.RegistryNoImageHeaderParserException
    public final RegistryNoImageHeaderParserException RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.closed) {
            this.bufferField.write(bArr, i, i2);
            write();
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        return null;
    }
}
