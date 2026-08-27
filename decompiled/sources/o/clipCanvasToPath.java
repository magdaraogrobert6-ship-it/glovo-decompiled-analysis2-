package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.EventListener;

/* JADX INFO: loaded from: classes4.dex */
public final class clipCanvasToPath implements getMessageTextView, Cloneable {
    public Object callStackTrace;
    public volatile boolean canceled;
    public final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 client;
    public InAppMessageImmersiveBaseView connection;
    public final setLargerCloseButtonClickArealambda0 connectionPool;
    public final EventListener eventListener;
    public volatile r8lambda0088L0EiZH2mqIpRPuXhwYCr8 exchange;
    public getRectf exchangeFinder;
    public final AtomicBoolean executed;
    public boolean expectMoreExchanges;
    public final boolean forWebSocket;
    public r8lambda0088L0EiZH2mqIpRPuXhwYCr8 interceptorScopedExchange;
    public final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 originalRequest;
    public final CopyOnWriteArrayList plansToCancel;
    public boolean requestBodyOpen;
    public boolean responseBodyOpen;
    public final r8lambdaHxzcSkagzzbnyOYw7_nsihtGOlU timeout;
    public boolean timeoutEarlyExit;

    public final IOException IconCompatParcelizer(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen) {
                    z = true;
                }
            }
        }
        return z ? write(iOException) : iOException;
    }

    public final void read(boolean z) {
        r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (r8lambda0088l0eizh2mqiprpuxhwycr8 = this.exchange) != null) {
            r8lambda0088l0eizh2mqiprpuxhwycr8.codec.read();
            r8lambda0088l0eizh2mqiprpuxhwycr8.call.RemoteActionCompatParcelizer(r8lambda0088l0eizh2mqiprpuxhwycr8, true, true, null);
        }
        this.interceptorScopedExchange = null;
    }

    public static final String RemoteActionCompatParcelizer(clipCanvasToPath clipcanvastopath) {
        StringBuilder sb = new StringBuilder();
        sb.append(clipcanvastopath.canceled ? "canceled " : "");
        sb.append(clipcanvastopath.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(clipcanvastopath.originalRequest.url.MediaSessionCompatQueueItem());
        return sb.toString();
    }

    public final _get_messageWebView_lambda1 IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) this.client.interceptors, (Collection) arrayList);
        arrayList.add(new setHtmlPageFinishedListener(5, this.client));
        arrayList.add(new setHtmlPageFinishedListener(this.client.cookieJar));
        arrayList.add(new setHtmlPageFinishedListener(0, this.client.cache));
        arrayList.add(onCreateWindowlambda5.read);
        if (!this.forWebSocket) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) this.client.networkInterceptors, (Collection) arrayList);
        }
        arrayList.add(new setMessageHeaderText(this.forWebSocket));
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = this.originalRequest;
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = this.client;
        try {
            try {
                _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = new InAppMessageModalView(this, arrayList, 0, null, r8lambday113fdftsr5e4pzj6xssxltpl60, r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.connectTimeoutMillis, r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.readTimeoutMillis, r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.writeTimeoutMillis).write(this.originalRequest);
                if (this.canceled) {
                    InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(_get_messagewebview_lambda1Write);
                    throw new IOException("Canceled");
                }
                IconCompatParcelizer((IOException) null);
                return _get_messagewebview_lambda1Write;
            } catch (IOException e) {
                IOException iOExceptionIconCompatParcelizer = IconCompatParcelizer(e);
                iOExceptionIconCompatParcelizer.getClass();
                throw iOExceptionIconCompatParcelizer;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                IconCompatParcelizer((IOException) null);
            }
            throw th;
        }
    }

    public final Socket RemoteActionCompatParcelizer() {
        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView = this.connection;
        inAppMessageImmersiveBaseView.getClass();
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        ArrayList arrayList = inAppMessageImmersiveBaseView.calls;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Reference) it.next()).get(), this}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i++;
        }
        if (i == -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.connection = null;
        if (arrayList.isEmpty()) {
            inAppMessageImmersiveBaseView.idleAtNs = System.nanoTime();
            setLargerCloseButtonClickArealambda0 setlargerclosebuttonclickarealambda0 = this.connectionPool;
            ConcurrentLinkedQueue concurrentLinkedQueue = setlargerclosebuttonclickarealambda0.connections;
            TimeZone timeZone2 = setWebViewContent.RemoteActionCompatParcelizer;
            if (!inAppMessageImmersiveBaseView.noNewExchanges && setlargerclosebuttonclickarealambda0.maxIdleConnections != 0) {
                setlargerclosebuttonclickarealambda0.cleanupQueue.read(setlargerclosebuttonclickarealambda0.cleanupTask, 0L);
                return null;
            }
            inAppMessageImmersiveBaseView.noNewExchanges = true;
            concurrentLinkedQueue.remove(inAppMessageImmersiveBaseView);
            if (concurrentLinkedQueue.isEmpty()) {
                onCreateWindowlambda3 oncreatewindowlambda3 = setlargerclosebuttonclickarealambda0.cleanupQueue;
                synchronized (oncreatewindowlambda3.taskRunner) {
                    if (oncreatewindowlambda3.IconCompatParcelizer()) {
                        oncreatewindowlambda3.taskRunner.read(oncreatewindowlambda3);
                    }
                }
            }
            getMessageClickableView getmessageclickableview = inAppMessageImmersiveBaseView.route.address;
            getmessageclickableview.getClass();
            if (setlargerclosebuttonclickarealambda0.addressStates.get(getmessageclickableview) == null) {
                return inAppMessageImmersiveBaseView.socket;
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
        }
        return null;
    }

    public final Object clone() {
        return new clipCanvasToPath(this.client, this.originalRequest, this.forWebSocket);
    }

    public final IOException write(IOException iOException) {
        IOException interruptedIOException;
        Socket socketRemoteActionCompatParcelizer;
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView = this.connection;
        if (inAppMessageImmersiveBaseView != null) {
            synchronized (inAppMessageImmersiveBaseView) {
                socketRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            }
            if (this.connection == null) {
                if (socketRemoteActionCompatParcelizer != null) {
                    setWebViewContent.RemoteActionCompatParcelizer(socketRemoteActionCompatParcelizer);
                }
                this.eventListener.connectionReleased(this, inAppMessageImmersiveBaseView);
            } else if (socketRemoteActionCompatParcelizer != null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
                return null;
            }
        }
        if (!this.timeoutEarlyExit && this.timeout.write()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        EventListener eventListener = this.eventListener;
        if (iOException == null) {
            eventListener.callEnd(this);
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        eventListener.callFailed(this, interruptedIOException);
        return interruptedIOException;
    }

    public clipCanvasToPath(r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0, r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, boolean z) {
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        this.client = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0;
        this.originalRequest = r8lambday113fdftsr5e4pzj6xssxltpl60;
        this.forWebSocket = z;
        this.connectionPool = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.connectionPool.delegate;
        this.eventListener = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.eventListenerFactory.create(this);
        r8lambdaHxzcSkagzzbnyOYw7_nsihtGOlU r8lambdahxzcskagzzbnyoyw7_nsihtgolu = new r8lambdaHxzcSkagzzbnyOYw7_nsihtGOlU(this);
        r8lambdahxzcskagzzbnyoyw7_nsihtgolu.IconCompatParcelizer(r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.callTimeoutMillis, TimeUnit.MILLISECONDS);
        this.timeout = r8lambdahxzcskagzzbnyoyw7_nsihtgolu;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
        this.plansToCancel = new CopyOnWriteArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:8:0x0011, B:17:0x0020, B:19:0x0024, B:20:0x0026, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x001a), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0024 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:8:0x0011, B:17:0x0020, B:19:0x0024, B:20:0x0026, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x001a), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0030  */
    public final IOException RemoteActionCompatParcelizer(r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        r8lambda0088l0eizh2mqiprpuxhwycr8.getClass();
        if (r8lambda0088l0eizh2mqiprpuxhwycr8.equals(this.exchange)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (this.requestBodyOpen) {
                            if (z) {
                                this.requestBodyOpen = false;
                            }
                            if (z2) {
                                this.responseBodyOpen = false;
                            }
                            z5 = this.requestBodyOpen;
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        } else if (z2 || !this.responseBodyOpen) {
                            z4 = false;
                        } else {
                            if (z) {
                                this.requestBodyOpen = false;
                            }
                            if (z2) {
                                this.responseBodyOpen = false;
                            }
                            z5 = this.requestBodyOpen;
                            if (z5 || this.responseBodyOpen) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z5 && !this.responseBodyOpen && !this.expectMoreExchanges) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.exchange = null;
                InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView = this.connection;
                if (inAppMessageImmersiveBaseView != null) {
                    synchronized (inAppMessageImmersiveBaseView) {
                        inAppMessageImmersiveBaseView.successCount++;
                    }
                }
            }
            if (z4) {
                return write(iOException);
            }
        }
        return iOException;
    }

    public final void IconCompatParcelizer(setMessageImageView setmessageimageview) {
        r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8 r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8RemoteActionCompatParcelizer;
        if (!this.executed.compareAndSet(false, true)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Already Executed");
            return;
        }
        getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
        this.callStackTrace = getMaxSafeTopInset.MediaDescriptionCompat.RemoteActionCompatParcelizer();
        this.eventListener.callStart(this);
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.client.dispatcher;
        r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8 r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8 = new r8lambdaA5ZM0ZZHuWQ_bt3yrmvyjurWj8(this, setmessageimageview);
        applydisplaycutoutmarginstoclosebuttonlambda0.getClass();
        synchronized (applydisplaycutoutmarginstoclosebuttonlambda0) {
            ((ArrayDeque) applydisplaycutoutmarginstoclosebuttonlambda0.readyAsyncCalls).add(r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8);
            if (!this.forWebSocket && (r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8RemoteActionCompatParcelizer = applydisplaycutoutmarginstoclosebuttonlambda0.RemoteActionCompatParcelizer(this.originalRequest.url.host)) != null) {
                r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8.IconCompatParcelizer = r8lambdaa5zm0zzhuwq_bt3yrmvyjurwj8RemoteActionCompatParcelizer.IconCompatParcelizer;
            }
        }
        applydisplaycutoutmarginstoclosebuttonlambda0.RatingCompat();
    }

    public final _get_messageWebView_lambda1 read() {
        if (!this.executed.compareAndSet(false, true)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Already Executed");
            return null;
        }
        this.timeout.IconCompatParcelizer();
        getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
        this.callStackTrace = getMaxSafeTopInset.MediaDescriptionCompat.RemoteActionCompatParcelizer();
        this.eventListener.callStart(this);
        try {
            applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = this.client.dispatcher;
            synchronized (applydisplaycutoutmarginstoclosebuttonlambda0) {
                ((ArrayDeque) applydisplaycutoutmarginstoclosebuttonlambda0.runningSyncCalls).add(this);
            }
            _get_messageWebView_lambda1 _get_messagewebview_lambda1IconCompatParcelizer = IconCompatParcelizer();
            applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda1 = this.client.dispatcher;
            applydisplaycutoutmarginstoclosebuttonlambda1.getClass();
            applydisplaycutoutmarginstoclosebuttonlambda1.write((ArrayDeque) applydisplaycutoutmarginstoclosebuttonlambda1.runningSyncCalls, this);
            return _get_messagewebview_lambda1IconCompatParcelizer;
        } catch (Throwable th) {
            applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda2 = this.client.dispatcher;
            applydisplaycutoutmarginstoclosebuttonlambda2.getClass();
            applydisplaycutoutmarginstoclosebuttonlambda2.write((ArrayDeque) applydisplaycutoutmarginstoclosebuttonlambda2.runningSyncCalls, this);
            throw th;
        }
    }

    public final void write() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        r8lambda0088L0EiZH2mqIpRPuXhwYCr8 r8lambda0088l0eizh2mqiprpuxhwycr8 = this.exchange;
        if (r8lambda0088l0eizh2mqiprpuxhwycr8 != null) {
            r8lambda0088l0eizh2mqiprpuxhwycr8.codec.read();
        }
        Iterator it = this.plansToCancel.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((setLargerCloseButtonClickArea) it.next()).read();
        }
        this.eventListener.canceled(this);
    }
}
