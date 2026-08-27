package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.OutputStream;
import java.net.ProxySelector;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class WebContentUtils implements r8lambdaiqM2EJu3YF9Cgcd4OZ6jr_yHQPU, BrazeWebViewClientsetWebViewClientStateListener11, DelegatingNode, r8lambda_OcJ7olE86bsKzOqyJLgcCCvo, r8lambdam0pROBQI4dUHq1bB07KqFqyReTo {
    public static final WebContentUtils write = new WebContentUtils(1);
    public final /* synthetic */ int serializer;

    public /* synthetic */ WebContentUtils(int i) {
        this.serializer = i;
    }

    @Override // o.r8lambda_OcJ7olE86bsKzOqyJLgcCCvo
    public String read(Object obj) {
        Long l = (Long) obj;
        if (l.longValue() < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Timeout too small");
            return null;
        }
        if (l.longValue() < 100000000) {
            return l + com.braze.Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID;
        }
        if (l.longValue() < 100000000000L) {
            return (l.longValue() / 1000) + "u";
        }
        if (l.longValue() < 100000000000000L) {
            return (l.longValue() / 1000000) + "m";
        }
        if (l.longValue() < 100000000000000000L) {
            return (l.longValue() / 1000000000) + "S";
        }
        if (l.longValue() < 6000000000000000000L) {
            return (l.longValue() / 60000000000L) + "M";
        }
        return (l.longValue() / 3600000000000L) + "H";
    }

    public long write() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // o.DelegatingNode
    public Object B_() {
        return this.serializer != 10 ? ProxySelector.getDefault() : new visitSubtreeYYKmhodefault();
    }

    @Override // o.BrazeWebViewClientsetWebViewClientStateListener11
    public void IconCompatParcelizer(Object obj) {
        if (this.serializer != 0) {
            ((ScheduledExecutorService) obj).shutdown();
        } else {
            ((ExecutorService) ((Executor) obj)).shutdown();
        }
    }

    public String toString() {
        return this.serializer != 0 ? super.toString() : "grpc-default-executor";
    }

    @Override // o.r8lambdaiqM2EJu3YF9Cgcd4OZ6jr_yHQPU
    public int write(getCacheFileSuffixlambda1 getcachefilesuffixlambda1, int i, Object obj, int i2) {
        int i3 = this.serializer;
        if (i3 == 3) {
            return getcachefilesuffixlambda1.IconCompatParcelizer();
        }
        if (i3 == 4) {
            getcachefilesuffixlambda1.write(i);
            return 0;
        }
        if (i3 == 5) {
            getcachefilesuffixlambda1.read((byte[]) obj, i2, i);
            return i2 + i;
        }
        if (i3 != 6) {
            getcachefilesuffixlambda1.IconCompatParcelizer((OutputStream) obj, i);
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i);
        getcachefilesuffixlambda1.serializer(byteBuffer);
        byteBuffer.limit(iLimit);
        return 0;
    }

    @Override // o.BrazeWebViewClientsetWebViewClientStateListener11
    public Object RemoteActionCompatParcelizer() {
        if (this.serializer == 0) {
            return Executors.newCachedThreadPool(r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.IconCompatParcelizer("grpc-default-executor-%d"));
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, r8lambda4JvXn8cf5aij3slyZU_izDVcP_4.IconCompatParcelizer("grpc-timer-%d"));
        try {
            scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            DrawableTransformation.read((Throwable) e2);
            return null;
        }
        return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // o.r8lambda_OcJ7olE86bsKzOqyJLgcCCvo
    public Object IconCompatParcelizer(String str) {
        TextStreamsKt.read("empty timeout", str.length() > 0);
        TextStreamsKt.read("bad timeout format", str.length() <= 9);
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j);
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(cCharAt, "Invalid timeout unit: ");
        return null;
    }

    @Override // o.r8lambdam0pROBQI4dUHq1bB07KqFqyReTo
    public Object write(byte[] bArr) {
        if (this.serializer == 11) {
            return bArr;
        }
        if (bArr.length >= 3) {
            return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
        }
        throw new NumberFormatException("Malformed status code ".concat(new String(bArr, requestPushPermissionPrompt.serializer)));
    }

    @Override // o.r8lambdam0pROBQI4dUHq1bB07KqFqyReTo
    public byte[] serializer(Object obj) {
        if (this.serializer != 11) {
            throw new UnsupportedOperationException();
        }
        return (byte[]) obj;
    }
}
