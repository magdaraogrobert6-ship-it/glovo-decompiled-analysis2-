package com.mapbox.common.logger;

import androidx.annotation.Keep;
import com.mapbox.base.common.logger.Logger;
import com.mapbox.base.common.logger.model.Message;
import com.mapbox.base.common.logger.model.Tag;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.concurrent.atomic.AtomicReference;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class MapboxLogger implements Logger {
    private static final String DEFAULT_TAG = "MapboxLogger";
    public static final MapboxLogger INSTANCE = new MapboxLogger();
    private static volatile int logLevel = 2;
    private static final AtomicReference<LoggerObserver> observer = new AtomicReference<>();

    private MapboxLogger() {
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public final int getLogLevel() {
        return logLevel;
    }

    public final void setLogLevel(int i) {
        logLevel = i;
    }

    public final void removeObserver() {
        observer.set(null);
    }

    public final void setObserver(LoggerObserver loggerObserver) {
        loggerObserver.getClass();
        observer.set(loggerObserver);
    }

    private final void log(int i, String str, String str2, Throwable th, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (logLevel <= i) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            LoggerObserver loggerObserver = observer.get();
            if (loggerObserver != null) {
                loggerObserver.log(i, new LogEntry(str, str2, th));
            }
        }
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void d(final Tag tag, final Message message, final Throwable th) {
        message.getClass();
        log(3, tag != null ? tag.tag : null, message.message, th, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.logger.MapboxLogger.d.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4570invoke();
                return createFromParcel.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4570invoke() {
                String str = message.message;
            }
        });
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void e(final Tag tag, final Message message, final Throwable th) {
        message.getClass();
        log(6, tag != null ? tag.tag : null, message.message, th, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.logger.MapboxLogger.e.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4571invoke() {
                Tag tag2 = tag;
                SentryLogcatAdapter.read(tag2 != null ? tag2.tag : MapboxLogger.DEFAULT_TAG, message.message, th);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4571invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void i(final Tag tag, final Message message, final Throwable th) {
        message.getClass();
        log(4, tag != null ? tag.tag : null, message.message, th, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.logger.MapboxLogger.i.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4572invoke();
                return createFromParcel.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4572invoke() {
                String str = message.message;
            }
        });
    }

    public void v(final Tag tag, final Message message, final Throwable th) {
        message.getClass();
        log(2, tag != null ? tag.tag : null, message.message, th, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.logger.MapboxLogger.v.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4573invoke();
                return createFromParcel.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4573invoke() {
                String str = message.message;
            }
        });
    }

    @Override // com.mapbox.base.common.logger.Logger
    public void w(final Tag tag, final Message message, final Throwable th) {
        message.getClass();
        log(5, tag != null ? tag.tag : null, message.message, th, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.logger.MapboxLogger.w.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4574invoke() {
                Tag tag2 = tag;
                SentryLogcatAdapter.write(tag2 != null ? tag2.tag : MapboxLogger.DEFAULT_TAG, message.message, th);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4574invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    public final void d(Message message) {
        message.getClass();
        d(null, message, null);
    }

    public final void e(Message message) {
        message.getClass();
        e(null, message, null);
    }

    public final void i(Message message) {
        message.getClass();
        i(null, message, null);
    }

    public final void v(Message message) {
        message.getClass();
        v(null, message, null);
    }

    public final void w(Message message) {
        message.getClass();
        w(null, message, null);
    }

    public final void d(Message message, Throwable th) {
        message.getClass();
        th.getClass();
        d(null, message, th);
    }

    public final void e(Message message, Throwable th) {
        message.getClass();
        th.getClass();
        e(null, message, th);
    }

    public final void i(Message message, Throwable th) {
        message.getClass();
        th.getClass();
        i(null, message, th);
    }

    public final void v(Message message, Throwable th) {
        message.getClass();
        th.getClass();
        v(null, message, th);
    }

    public final void w(Message message, Throwable th) {
        message.getClass();
        th.getClass();
        w(null, message, th);
    }

    public final void d(Tag tag, Message message) {
        tag.getClass();
        message.getClass();
        d(tag, message, null);
    }

    public final void e(Tag tag, Message message) {
        tag.getClass();
        message.getClass();
        e(tag, message, null);
    }

    public final void i(Tag tag, Message message) {
        tag.getClass();
        message.getClass();
        i(tag, message, null);
    }

    public final void v(Tag tag, Message message) {
        tag.getClass();
        message.getClass();
        v(tag, message, null);
    }

    public final void w(Tag tag, Message message) {
        tag.getClass();
        message.getClass();
        w(tag, message, null);
    }
}
