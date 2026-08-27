package o;

import bo.app.o8$$ExternalSyntheticLambda11;
import bo.app.vc$$ExternalSyntheticLambda2;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class createHorizontalAnimation implements Closeable {
    public static final r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU DEFAULT_SETTINGS;
    public final String connectionName;
    public final LinkedHashSet currentPushRequests;
    public long degradedPingsSent;
    public long degradedPongDeadlineNs;
    public long degradedPongsReceived;
    public final InAppMessageWebView flowControlListener;
    public long intervalPingsSent;
    public long intervalPongsReceived;
    public boolean isShutdown;
    public int lastGoodStreamId;
    public final r8lambdap40JoIut3W_3aOBWn5qVBQGamU listener;
    public int nextStreamId;
    public final r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU okHttpSettings;
    public r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU peerSettings;
    public final ViewUtils pushObserver;
    public final onCreateWindowlambda3 pushQueue;
    public final r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ readBytes;
    public final r8lambdanbCgCZH9JKHUNnWSIyypdsyJVco readerRunnable;
    public final onCreateWindowlambda3 settingsListenerQueue;
    public final Socket socket;
    public final LinkedHashMap streams = new LinkedHashMap();
    public final InAppMessageHtmlFullView taskRunner;
    public long writeBytesMaximum;
    public long writeBytesTotal;
    public final r8lambdafMARaVe3F3slCs9OJ9iCSXeNZg writer;
    public final onCreateWindowlambda3 writerQueue;

    public final isActivityRegisteredInManifestlambda0 RemoteActionCompatParcelizer(int i) {
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0;
        synchronized (this) {
            isactivityregisteredinmanifestlambda0 = (isActivityRegisteredInManifestlambda0) this.streams.get(Integer.valueOf(i));
        }
        return isactivityregisteredinmanifestlambda0;
    }

    public final void read(long j) {
        synchronized (this) {
            r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ.write(this.readBytes, j, 0L, 2);
            long j2 = this.readBytes.read();
            if (j2 >= this.okHttpSettings.serializer() / 2) {
                read(0, j2);
                r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ.write(this.readBytes, 0L, j2, 1);
            }
            InAppMessageWebView inAppMessageWebView = this.flowControlListener;
            r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ r8lambdakjkemutsdzneikk7hv7wrakxqzq = this.readBytes;
            inAppMessageWebView.getClass();
            r8lambdakjkemutsdzneikk7hv7wrakxqzq.getClass();
        }
    }

    public final isActivityRegisteredInManifestlambda0 serializer(int i) {
        isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0;
        synchronized (this) {
            isactivityregisteredinmanifestlambda0 = (isActivityRegisteredInManifestlambda0) this.streams.remove(Integer.valueOf(i));
            notifyAll();
        }
        return isactivityregisteredinmanifestlambda0;
    }

    static {
        r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu = new r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU();
        r8lambdaegyeunc1miz5uhkn7yqmbsifezu.read(4, 65535);
        r8lambdaegyeunc1miz5uhkn7yqmbsifezu.read(5, androidx.compose.ui.graphics.Fields.Clip);
        DEFAULT_SETTINGS = r8lambdaegyeunc1miz5uhkn7yqmbsifezu;
    }

    public final void IconCompatParcelizer() {
        this.writer.RemoteActionCompatParcelizer();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RemoteActionCompatParcelizer(InAppMessageSlideupView.NO_ERROR, InAppMessageSlideupView.CANCEL, null);
    }

    public final void read(int i, long j) {
        onCreateWindowlambda3.RemoteActionCompatParcelizer(this.writerQueue, this.connectionName + '[' + i + "] windowUpdate", 0L, new o8$$ExternalSyntheticLambda11(this, i, j), 6);
    }

    public createHorizontalAnimation(createAppropriateViews createappropriateviews) {
        this.listener = (r8lambdap40JoIut3W_3aOBWn5qVBQGamU) createappropriateviews.RemoteActionCompatParcelizer;
        String str = createappropriateviews.MediaMetadataCompat;
        if (str == null) {
            removeNodeAtDepth.serializer("connectionName");
            throw null;
        }
        this.connectionName = str;
        this.nextStreamId = 3;
        InAppMessageHtmlFullView inAppMessageHtmlFullView = (InAppMessageHtmlFullView) createappropriateviews.MediaBrowserCompatMediaItem;
        this.taskRunner = inAppMessageHtmlFullView;
        onCreateWindowlambda3 oncreatewindowlambda3 = inAppMessageHtmlFullView.read();
        this.writerQueue = oncreatewindowlambda3;
        this.pushQueue = inAppMessageHtmlFullView.read();
        this.settingsListenerQueue = inAppMessageHtmlFullView.read();
        this.pushObserver = ViewUtils.CANCEL;
        this.flowControlListener = (InAppMessageWebView) createappropriateviews.read;
        r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu = new r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU();
        r8lambdaegyeunc1miz5uhkn7yqmbsifezu.read(4, 16777216);
        this.okHttpSettings = r8lambdaegyeunc1miz5uhkn7yqmbsifezu;
        r8lambdaeGYEuNc1mIZ5uhKn7yqmbsIFEzU r8lambdaegyeunc1miz5uhkn7yqmbsifezu2 = DEFAULT_SETTINGS;
        this.peerSettings = r8lambdaegyeunc1miz5uhkn7yqmbsifezu2;
        this.readBytes = new r8lambdaKJkEmUtSdzNeIKk7hv7wrAKXQZQ(0);
        this.writeBytesMaximum = r8lambdaegyeunc1miz5uhkn7yqmbsifezu2.serializer();
        Socket socket = (Socket) createappropriateviews.write;
        if (socket == null) {
            removeNodeAtDepth.serializer("socket");
            throw null;
        }
        this.socket = socket;
        RegistryNoImageHeaderParserException registryNoImageHeaderParserException = (RegistryNoImageHeaderParserException) createappropriateviews.IconCompatParcelizer;
        if (registryNoImageHeaderParserException == null) {
            removeNodeAtDepth.serializer("sink");
            throw null;
        }
        this.writer = new r8lambdafMARaVe3F3slCs9OJ9iCSXeNZg(registryNoImageHeaderParserException);
        RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException = (RegistryNoSourceEncoderAvailableException) createappropriateviews.RatingCompat;
        if (registryNoSourceEncoderAvailableException == null) {
            removeNodeAtDepth.serializer("source");
            throw null;
        }
        this.readerRunnable = new r8lambdanbCgCZH9JKHUNnWSIyypdsyJVco(this, new getMainActivityIntentdefault(registryNoSourceEncoderAvailableException));
        this.currentPushRequests = new LinkedHashSet();
        int i = createappropriateviews.MediaDescriptionCompat;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            oncreatewindowlambda3.read(new r8lambda8wlcaTG4WSLSeoWnhVT_DMKDe7Y(str.concat(" ping"), new vc$$ExternalSyntheticLambda2(nanos, 2, this)), nanos);
        }
    }

    public final void RemoteActionCompatParcelizer(InAppMessageSlideupView inAppMessageSlideupView) {
        inAppMessageSlideupView.getClass();
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                this.writer.write(this.lastGoodStreamId, inAppMessageSlideupView, InAppMessageHtmlBaseViewCompanion.read);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(InAppMessageSlideupView inAppMessageSlideupView, InAppMessageSlideupView inAppMessageSlideupView2, IOException iOException) {
        int i;
        Object[] array;
        inAppMessageSlideupView.getClass();
        inAppMessageSlideupView2.getClass();
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        try {
            RemoteActionCompatParcelizer(inAppMessageSlideupView);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.streams.isEmpty()) {
                array = null;
            } else {
                array = this.streams.values().toArray(new isActivityRegisteredInManifestlambda0[0]);
                this.streams.clear();
            }
        }
        isActivityRegisteredInManifestlambda0[] isactivityregisteredinmanifestlambda0Arr = (isActivityRegisteredInManifestlambda0[]) array;
        if (isactivityregisteredinmanifestlambda0Arr != null) {
            for (isActivityRegisteredInManifestlambda0 isactivityregisteredinmanifestlambda0 : isactivityregisteredinmanifestlambda0Arr) {
                try {
                    isactivityregisteredinmanifestlambda0.write(inAppMessageSlideupView2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.serializer();
        this.pushQueue.serializer();
        this.settingsListenerQueue.serializer();
    }

    public final void RemoteActionCompatParcelizer(int i, InAppMessageSlideupView inAppMessageSlideupView) {
        inAppMessageSlideupView.getClass();
        onCreateWindowlambda3.RemoteActionCompatParcelizer(this.writerQueue, this.connectionName + '[' + i + "] writeSynReset", 0L, new createVerticalAnimation(this, i, inAppMessageSlideupView), 6);
    }

    public final void RemoteActionCompatParcelizer(int i, boolean z, RegistryMissingComponentException registryMissingComponentException, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.writer.serializer(z, i, registryMissingComponentException, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.writeBytesTotal;
                        j3 = this.writeBytesMaximum;
                        if (j2 >= j3) {
                            if (this.streams.containsKey(Integer.valueOf(i))) {
                                wait();
                            } else {
                                throw new IOException("stream closed");
                            }
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.writer.maxFrameSize);
                j4 = iMin;
                this.writeBytesTotal += j4;
            }
            j -= j4;
            this.writer.serializer(z && j == 0, i, registryMissingComponentException, iMin);
        }
    }
}
