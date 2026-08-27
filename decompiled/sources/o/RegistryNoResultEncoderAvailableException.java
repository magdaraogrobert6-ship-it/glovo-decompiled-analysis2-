package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public final class RegistryNoResultEncoderAvailableException implements ItemSingleChoiceBinding {
    public boolean IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public final DefaultImageHeaderParserReaderEndOfFileException read;

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return ApiErrorResponseCompanion.PlaybackStateCompat;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        DefaultImageHeaderParserReaderEndOfFileException defaultImageHeaderParserReaderEndOfFileException = this.read;
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        ReentrantLock reentrantLock = defaultImageHeaderParserReaderEndOfFileException.IconCompatParcelizer;
        reentrantLock.lock();
        try {
            int i = defaultImageHeaderParserReaderEndOfFileException.serializer - 1;
            defaultImageHeaderParserReaderEndOfFileException.serializer = i;
            if (i == 0 && defaultImageHeaderParserReaderEndOfFileException.write) {
                reentrantLock.unlock();
                synchronized (defaultImageHeaderParserReaderEndOfFileException) {
                    defaultImageHeaderParserReaderEndOfFileException.read.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public RegistryNoResultEncoderAvailableException(DefaultImageHeaderParserReaderEndOfFileException defaultImageHeaderParserReaderEndOfFileException, long j) {
        this.read = defaultImageHeaderParserReaderEndOfFileException;
        this.RemoteActionCompatParcelizer = j;
    }

    @Override // o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) {
        long j2;
        long j3;
        int i;
        int i2;
        registryMissingComponentException.getClass();
        if (!this.IconCompatParcelizer) {
            DefaultImageHeaderParserReaderEndOfFileException defaultImageHeaderParserReaderEndOfFileException = this.read;
            long j4 = this.RemoteActionCompatParcelizer;
            if (j < 0) {
                DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
                return 0L;
            }
            long j5 = j + j4;
            long j6 = j4;
            while (true) {
                if (j6 < j5) {
                    SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = registryMissingComponentException.RemoteActionCompatParcelizer(1);
                    byte[] bArr = sVGParseExceptionRemoteActionCompatParcelizer.data;
                    int i3 = sVGParseExceptionRemoteActionCompatParcelizer.limit;
                    int iMin = (int) Math.min(j5 - j6, 8192 - i3);
                    synchronized (defaultImageHeaderParserReaderEndOfFileException) {
                        bArr.getClass();
                        defaultImageHeaderParserReaderEndOfFileException.read.seek(j6);
                        i = 0;
                        while (true) {
                            if (i < iMin) {
                                int i4 = defaultImageHeaderParserReaderEndOfFileException.read.read(bArr, i3, iMin - i);
                                if (i4 != -1) {
                                    i += i4;
                                } else if (i == 0) {
                                    i2 = -1;
                                    i = -1;
                                }
                            }
                            i2 = -1;
                        }
                    }
                    if (i == i2) {
                        if (sVGParseExceptionRemoteActionCompatParcelizer.pos == sVGParseExceptionRemoteActionCompatParcelizer.limit) {
                            registryMissingComponentException.head = sVGParseExceptionRemoteActionCompatParcelizer.read();
                            ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseExceptionRemoteActionCompatParcelizer);
                        }
                        if (j4 == j6) {
                            j3 = -1;
                            j2 = -1;
                            break;
                        }
                    } else {
                        sVGParseExceptionRemoteActionCompatParcelizer.limit += i;
                        long j7 = i;
                        j6 += j7;
                        registryMissingComponentException.size += j7;
                    }
                }
                j2 = j6 - j4;
                j3 = -1;
                break;
            }
            if (j2 != j3) {
                this.RemoteActionCompatParcelizer += j2;
            }
            return j2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        return 0L;
    }
}
