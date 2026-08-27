package o;

import android.annotation.SuppressLint;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes3.dex */
final class NotificationTrampolineActivity {
    private final float[] RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final BrazePushReceiverCompanionhandleReceivedIntent1[] serializer;
    private long write = 0;
    private boolean IconCompatParcelizer = false;

    public final void write() {
        this.write = 0L;
    }

    @SuppressLint
    public NotificationTrampolineActivity(int i, int i2, parseLonglambda0 parselonglambda0) {
        if (i2 < 3) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("The buffer size must be at least 3");
            throw null;
        }
        this.read = parselonglambda0;
        this.RemoteActionCompatParcelizer = new float[i];
        BrazePushReceiverCompanionhandleReceivedIntent1[] brazePushReceiverCompanionhandleReceivedIntent1Arr = new BrazePushReceiverCompanionhandleReceivedIntent1[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            brazePushReceiverCompanionhandleReceivedIntent1Arr[i3] = new BrazePushReceiverCompanionhandleReceivedIntent1(i);
        }
        this.serializer = brazePushReceiverCompanionhandleReceivedIntent1Arr;
    }

    public final void RemoteActionCompatParcelizer(float[] fArr, long j, onResumelambda0 onresumelambda0) {
        int i;
        boolean z;
        int i2;
        this.write++;
        BrazePushReceiverCompanionhandleReceivedIntent1[] brazePushReceiverCompanionhandleReceivedIntent1Arr = this.serializer;
        brazePushReceiverCompanionhandleReceivedIntent1Arr[brazePushReceiverCompanionhandleReceivedIntent1Arr.length - 1].IconCompatParcelizer(fArr, j);
        long j2 = this.write;
        int i3 = 2;
        if (j2 == 1) {
            this.write = j2 + 1;
            brazePushReceiverCompanionhandleReceivedIntent1Arr[brazePushReceiverCompanionhandleReceivedIntent1Arr.length - 2].IconCompatParcelizer(fArr, j - 1);
        }
        boolean z2 = this.IconCompatParcelizer;
        long j3 = brazePushReceiverCompanionhandleReceivedIntent1Arr[brazePushReceiverCompanionhandleReceivedIntent1Arr.length - 1].read();
        long j4 = brazePushReceiverCompanionhandleReceivedIntent1Arr[brazePushReceiverCompanionhandleReceivedIntent1Arr.length - 2].read();
        long j5 = this.write;
        boolean z3 = z2 | (j5 > 0 && j3 < j4);
        this.IconCompatParcelizer = z3;
        if (j5 >= brazePushReceiverCompanionhandleReceivedIntent1Arr.length) {
            if (z3) {
                long j6 = brazePushReceiverCompanionhandleReceivedIntent1Arr[0].read();
                long j7 = brazePushReceiverCompanionhandleReceivedIntent1Arr[1].read();
                if (j7 >= j6) {
                    long length = brazePushReceiverCompanionhandleReceivedIntent1Arr.length;
                    while (true) {
                        if (i3 < length) {
                            long j8 = brazePushReceiverCompanionhandleReceivedIntent1Arr[i3].read();
                            if (j6 >= j8 || j8 >= j7) {
                                i3++;
                            }
                        } else {
                            i2 = 1;
                        }
                    }
                }
                i2 = 0;
            } else {
                i2 = 1;
            }
            i = i2 ^ 1;
            if (i2 != 0) {
                float[] fArrIconCompatParcelizer = brazePushReceiverCompanionhandleReceivedIntent1Arr[1].IconCompatParcelizer();
                int length2 = fArrIconCompatParcelizer.length;
                float[] fArr2 = this.RemoteActionCompatParcelizer;
                System.arraycopy(fArrIconCompatParcelizer, 0, fArr2, 0, Math.min(length2, fArr2.length));
                onresumelambda0.write(fArr2, brazePushReceiverCompanionhandleReceivedIntent1Arr[1].read());
            }
        } else {
            i = 0;
        }
        BrazePushReceiverCompanionhandleReceivedIntent1 brazePushReceiverCompanionhandleReceivedIntent1 = brazePushReceiverCompanionhandleReceivedIntent1Arr[i];
        int i4 = i + 1;
        System.arraycopy(brazePushReceiverCompanionhandleReceivedIntent1Arr, i4, brazePushReceiverCompanionhandleReceivedIntent1Arr, i, brazePushReceiverCompanionhandleReceivedIntent1Arr.length - i4);
        brazePushReceiverCompanionhandleReceivedIntent1Arr[brazePushReceiverCompanionhandleReceivedIntent1Arr.length - 1] = brazePushReceiverCompanionhandleReceivedIntent1;
        if (i != 0) {
            long length3 = brazePushReceiverCompanionhandleReceivedIntent1Arr.length;
            int i5 = 0;
            while (i5 < length3 - 1) {
                long j9 = brazePushReceiverCompanionhandleReceivedIntent1Arr[i5].read();
                i5++;
                if (j9 > brazePushReceiverCompanionhandleReceivedIntent1Arr[i5].read()) {
                    z = false;
                    this.IconCompatParcelizer = !z;
                    this.read.IconCompatParcelizer("Dropped sample with timestamp " + brazePushReceiverCompanionhandleReceivedIntent1Arr[brazePushReceiverCompanionhandleReceivedIntent1Arr.length - 1].read(), new Object[0]);
                }
            }
            z = true;
            this.IconCompatParcelizer = !z;
            this.read.IconCompatParcelizer("Dropped sample with timestamp " + brazePushReceiverCompanionhandleReceivedIntent1Arr[brazePushReceiverCompanionhandleReceivedIntent1Arr.length - 1].read(), new Object[0]);
        }
    }

    public final void serializer(onResumelambda0 onresumelambda0) {
        BrazePushReceiverCompanionhandleReceivedIntent1[] brazePushReceiverCompanionhandleReceivedIntent1Arr = this.serializer;
        int length = brazePushReceiverCompanionhandleReceivedIntent1Arr.length;
        for (int i = 1; i < length - 1; i++) {
            RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, Long.MAX_VALUE, onresumelambda0);
        }
        this.write = 1L;
        BrazePushReceiverCompanionhandleReceivedIntent1 brazePushReceiverCompanionhandleReceivedIntent1 = brazePushReceiverCompanionhandleReceivedIntent1Arr[0];
        brazePushReceiverCompanionhandleReceivedIntent1Arr[0] = brazePushReceiverCompanionhandleReceivedIntent1Arr[brazePushReceiverCompanionhandleReceivedIntent1Arr.length - 2];
        brazePushReceiverCompanionhandleReceivedIntent1Arr[brazePushReceiverCompanionhandleReceivedIntent1Arr.length - 2] = brazePushReceiverCompanionhandleReceivedIntent1;
    }
}
