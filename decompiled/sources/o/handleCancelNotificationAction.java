package o;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class handleCancelNotificationAction {
    private final LinkedList IconCompatParcelizer = new LinkedList();
    private requestBannersRefreshdefault write;

    public final Long serializer(long j, long j2) {
        synchronized (this) {
            if (this.write != null && !this.IconCompatParcelizer.isEmpty() && serializer(this.write)) {
                LinkedList linkedList = this.IconCompatParcelizer;
                if (j > ((Long) linkedList.get(linkedList.size() - 1)).longValue()) {
                    LinkedList linkedList2 = this.IconCompatParcelizer;
                    long jLongValue = ((Long) linkedList2.get(linkedList2.size() - 1)).longValue();
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    long millis = timeUnit.toMillis(this.write.RemoteActionCompatParcelizer.byteValue());
                    long j3 = (((((j - jLongValue) + millis) - 1) / millis) * millis) + jLongValue;
                    if (j3 - j2 > timeUnit.toMillis(this.write.RemoteActionCompatParcelizer.byteValue())) {
                        return 0L;
                    }
                    return Long.valueOf(j3 - j);
                }
                for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
                    long jLongValue2 = ((Long) this.IconCompatParcelizer.get(i)).longValue();
                    if (i > 0 && j2 < ((Long) this.IconCompatParcelizer.get(i - 1)).longValue()) {
                        return 0L;
                    }
                    if (j <= jLongValue2) {
                        return Long.valueOf(jLongValue2 - j);
                    }
                }
                return Long.valueOf(TimeUnit.MINUTES.toMillis(this.write.RemoteActionCompatParcelizer.byteValue()));
            }
            return null;
        }
    }

    public final void write() {
        synchronized (this) {
            this.write = null;
            this.IconCompatParcelizer.clear();
        }
    }

    public static boolean serializer(requestBannersRefreshdefault requestbannersrefreshdefault) {
        Byte b = requestbannersrefreshdefault.read;
        Byte b2 = requestbannersrefreshdefault.RemoteActionCompatParcelizer;
        return b.byteValue() > 0 && b2.byteValue() > 0 && b2.byteValue() >= requestbannersrefreshdefault.read.byteValue();
    }

    public final void IconCompatParcelizer(requestBannersRefreshdefault requestbannersrefreshdefault, long j) {
        synchronized (this) {
            this.write = requestbannersrefreshdefault;
            IconCompatParcelizer(j);
        }
    }

    private void IconCompatParcelizer(long j) {
        synchronized (this) {
            this.IconCompatParcelizer.clear();
            requestBannersRefreshdefault requestbannersrefreshdefault = this.write;
            if (requestbannersrefreshdefault != null && serializer(requestbannersrefreshdefault)) {
                int iByteValue = this.write.RemoteActionCompatParcelizer.byteValue() / this.write.read.byteValue();
                long millis = j + TimeUnit.MINUTES.toMillis(this.write.serializer.byteValue());
                for (int i = 1; i <= iByteValue; i++) {
                    millis += TimeUnit.MINUTES.toMillis(this.write.read.byteValue()) * ((long) i);
                    this.IconCompatParcelizer.add(Long.valueOf(millis));
                }
            }
        }
    }
}
