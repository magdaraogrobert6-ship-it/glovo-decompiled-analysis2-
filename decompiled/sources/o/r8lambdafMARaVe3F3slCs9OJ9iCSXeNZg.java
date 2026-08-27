package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdafMARaVe3F3slCs9OJ9iCSXeNZg implements Closeable {
    public static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.class.getName());
    public boolean closed;
    public final RegistryMissingComponentException hpackBuffer;
    public final getMessageChevronView hpackWriter;
    public int maxFrameSize;
    public final RegistryNoImageHeaderParserException sink;

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.sink.flush();
        }
    }

    public final void read(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            read(0, 8, 6, z ? 1 : 0);
            this.sink.IconCompatParcelizer(i);
            this.sink.IconCompatParcelizer(i2);
            this.sink.flush();
        }
    }

    public final void serializer(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.IconCompatParcelizer(arrayList);
            long j = this.hpackBuffer.size;
            long jMin = Math.min(this.maxFrameSize, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            read(i, (int) jMin, 1, i2);
            this.sink.write(this.hpackBuffer, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.maxFrameSize, j2);
                    j2 -= jMin2;
                    read(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.sink.write(this.hpackBuffer, jMin2);
                }
            }
        }
    }

    public final void serializer(boolean z, int i, RegistryMissingComponentException registryMissingComponentException, int i2) {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            read(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                RegistryNoImageHeaderParserException registryNoImageHeaderParserException = this.sink;
                registryMissingComponentException.getClass();
                registryNoImageHeaderParserException.write(registryMissingComponentException, i2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
        }
    }

    public r8lambdafMARaVe3F3slCs9OJ9iCSXeNZg(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) {
        registryNoImageHeaderParserException.getClass();
        this.sink = registryNoImageHeaderParserException;
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        this.hpackBuffer = registryMissingComponentException;
        this.maxFrameSize = androidx.compose.ui.graphics.Fields.Clip;
        this.hpackWriter = new getMessageChevronView(registryMissingComponentException);
    }

    public final void RemoteActionCompatParcelizer(int i, InAppMessageSlideupView inAppMessageSlideupView) {
        inAppMessageSlideupView.getClass();
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (inAppMessageSlideupView.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            read(i, 4, 3, 0);
            this.sink.IconCompatParcelizer(inAppMessageSlideupView.getHttpCode());
            this.sink.flush();
        }
    }

    public final void serializer(int i, long j) {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (j != 0 && j <= 2147483647L) {
                java.util.logging.Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.serializer(i, 4, j, false));
                }
                read(i, 4, 8, 0);
                this.sink.IconCompatParcelizer((int) j);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        }
    }

    public final void serializer(r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu) {
        r8lambdaegyeunc1miz5uhkn7yqmbsifezu.getClass();
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            int i = this.maxFrameSize;
            int i2 = r8lambdaegyeunc1miz5uhkn7yqmbsifezu.set;
            if ((i2 & 32) != 0) {
                i = r8lambdaegyeunc1miz5uhkn7yqmbsifezu.values[5];
            }
            this.maxFrameSize = i;
            int i3 = i2 & 2;
            if (i3 != 0) {
                if (r8lambdaegyeunc1miz5uhkn7yqmbsifezu.values[1] != -1) {
                    getMessageChevronView getmessagechevronview = this.hpackWriter;
                    int i4 = i3 != 0 ? r8lambdaegyeunc1miz5uhkn7yqmbsifezu.values[1] : -1;
                    getmessagechevronview.getClass();
                    int iMin = Math.min(i4, androidx.compose.ui.graphics.Fields.Clip);
                    int i5 = getmessagechevronview.maxDynamicTableByteCount;
                    if (i5 != iMin) {
                        if (iMin < i5) {
                            getmessagechevronview.smallestHeaderTableSizeSetting = Math.min(getmessagechevronview.smallestHeaderTableSizeSetting, iMin);
                        }
                        getmessagechevronview.emitDynamicTableSizeUpdate = true;
                        getmessagechevronview.maxDynamicTableByteCount = iMin;
                        int i6 = getmessagechevronview.dynamicTableByteCount;
                        if (iMin < i6) {
                            if (iMin == 0) {
                                AnimationUtils[] animationUtilsArr = getmessagechevronview.dynamicTable;
                                onContentCardClicked.write(0, animationUtilsArr.length, null, animationUtilsArr);
                                getmessagechevronview.nextHeaderIndex = getmessagechevronview.dynamicTable.length - 1;
                                getmessagechevronview.headerCount = 0;
                                getmessagechevronview.dynamicTableByteCount = 0;
                            } else {
                                getmessagechevronview.RemoteActionCompatParcelizer(i6 - iMin);
                            }
                        }
                    }
                }
            }
            read(0, 0, 4, 1);
            this.sink.flush();
        }
    }

    public final void write(int i, InAppMessageSlideupView inAppMessageSlideupView, byte[] bArr) {
        inAppMessageSlideupView.getClass();
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (inAppMessageSlideupView.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            read(0, bArr.length + 8, 7, 0);
            this.sink.IconCompatParcelizer(i);
            this.sink.IconCompatParcelizer(inAppMessageSlideupView.getHttpCode());
            if (bArr.length != 0) {
                this.sink.RemoteActionCompatParcelizer(bArr);
            }
            this.sink.flush();
        }
    }

    public final void read(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            java.util.logging.Logger logger2 = logger;
            if (logger2.isLoggable(level)) {
                logger2.fine(r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.write(i, i2, i3, i4, false));
            }
        }
        int i5 = this.maxFrameSize;
        if (i2 > i5) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + i5 + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
            RegistryNoImageHeaderParserException registryNoImageHeaderParserException = this.sink;
            registryNoImageHeaderParserException.getClass();
            registryNoImageHeaderParserException.serializer((i2 >>> 16) & 255);
            registryNoImageHeaderParserException.serializer((i2 >>> 8) & 255);
            registryNoImageHeaderParserException.serializer(i2 & 255);
            registryNoImageHeaderParserException.serializer(i3 & 255);
            registryNoImageHeaderParserException.serializer(i4 & 255);
            registryNoImageHeaderParserException.IconCompatParcelizer(i & Integer.MAX_VALUE);
            return;
        }
        DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "reserved bit set: "));
    }
}
