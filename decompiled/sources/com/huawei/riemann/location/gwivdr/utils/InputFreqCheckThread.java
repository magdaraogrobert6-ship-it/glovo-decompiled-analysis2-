package com.huawei.riemann.location.gwivdr.utils;

import android.os.Build;
import android.os.Process;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.riemann.location.common.utils.Constant;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public class InputFreqCheckThread extends Thread {
    private static final int ACC_TAG = 1;
    private static final int GYRO_TAG = 2;
    private static final Object LOCK = new Object();
    private static final int MAX_DEQUE_SIZE = 5000;
    private static final int MAX_IMU_INTERVAL_MS = 200;
    private static final int MAX_WSS_INTERVAL_MS = 500;
    private static final int MIN_IMU_FREQUENCY = 10;
    private static final int MIN_WSS_FREQUENCY = 1;
    private static final String TAG = "InputFreqCheckThread";
    private static final int WSS_TAG = 3;
    private static volatile InputFreqCheckThread freqCheckThread;
    private final LinkedBlockingDeque<Long> accTimeDeque;
    private final LinkedBlockingDeque<Long> gyroTimeDeque;
    private ScheduledExecutorService timer;
    private final LinkedBlockingDeque<Long> wssTimeDeque;

    private static void clearThread() {
        freqCheckThread = null;
    }

    private int getLowFreqErrorCode(int i) {
        if (i == 1) {
            return 202;
        }
        if (i == 2) {
            return Constant.ERROR_GYRO_LOW_FREQ;
        }
        if (i != 3) {
            return 500;
        }
        return Constant.ERROR_WSS_LOW_FREQ;
    }

    private int getMinFreq(int i) {
        return (i == 1 || i == 2) ? 10 : 1;
    }

    private int getNoDataErrorCode(int i) {
        if (i == 1) {
            return 201;
        }
        if (i == 2) {
            return Constant.ERROR_GYRO_NO_DATA;
        }
        if (i != 3) {
            return 500;
        }
        return Constant.ERROR_WSS_NO_DATA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkDataPeriodically$0() {
        refreshDeque(1);
        refreshDeque(2);
        refreshDeque(3);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "Input freq [acc|gyro|wss]: [" + this.accTimeDeque.size() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.gyroTimeDeque.size() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.wssTimeDeque.size() + "]");
    }

    private InputFreqCheckThread() {
        super("InputFreqChecker");
        this.accTimeDeque = new LinkedBlockingDeque<>(5000);
        this.gyroTimeDeque = new LinkedBlockingDeque<>(5000);
        this.wssTimeDeque = new LinkedBlockingDeque<>(5000);
    }

    public void accEnqueue(long j) {
        String str;
        if (this.accTimeDeque == null) {
            WrappedCompositionsetContent1211.read(TAG, "null accTimeDeque!");
            return;
        }
        synchronized (LOCK) {
            boolean zIsEmpty = this.accTimeDeque.isEmpty();
            LinkedBlockingDeque<Long> linkedBlockingDeque = this.accTimeDeque;
            if (!zIsEmpty) {
                try {
                    Long last = linkedBlockingDeque.getLast();
                    if (last == null) {
                        str = "null acc item!";
                    } else if (j < 0 || last.longValue() < 0) {
                        str = "invalid acc time: " + j + "/" + last;
                    } else {
                        if (Math.abs(j - last.longValue()) > 200) {
                            WrappedCompositionsetContent1211.read();
                            ErrorCodeManager.setErrorCode(203);
                        }
                        if (!this.accTimeDeque.offer(Long.valueOf(j))) {
                            WrappedCompositionsetContent1211.read();
                        }
                    }
                    WrappedCompositionsetContent1211.read(TAG, str);
                } catch (NoSuchElementException unused) {
                    WrappedCompositionsetContent1211.read(TAG, "no acc item in deque!");
                }
            } else if (!linkedBlockingDeque.offer(Long.valueOf(j))) {
                str = "accDeque error!";
                WrappedCompositionsetContent1211.read(TAG, str);
            }
        }
    }

    public void gyroEnqueue(long j) {
        String str;
        if (this.gyroTimeDeque == null) {
            WrappedCompositionsetContent1211.read(TAG, "null gyroDeque!");
            return;
        }
        synchronized (LOCK) {
            boolean zIsEmpty = this.gyroTimeDeque.isEmpty();
            LinkedBlockingDeque<Long> linkedBlockingDeque = this.gyroTimeDeque;
            if (!zIsEmpty) {
                try {
                    Long last = linkedBlockingDeque.getLast();
                    if (last == null) {
                        str = "null gyro item!";
                    } else if (j < 0 || last.longValue() < 0) {
                        str = "invalid gyro time: " + j + "/" + last;
                    } else {
                        if (Math.abs(j - last.longValue()) > 200) {
                            WrappedCompositionsetContent1211.read();
                            ErrorCodeManager.setErrorCode(Constant.ERROR_GYRO_TIME_DIFF_LARGE);
                        }
                        if (!this.gyroTimeDeque.offer(Long.valueOf(j))) {
                            WrappedCompositionsetContent1211.read();
                        }
                    }
                    WrappedCompositionsetContent1211.read(TAG, str);
                } catch (NoSuchElementException unused) {
                    WrappedCompositionsetContent1211.read(TAG, "no gyro item in deque!");
                }
            } else if (!linkedBlockingDeque.offer(Long.valueOf(j))) {
                str = "gyroDeque error!";
                WrappedCompositionsetContent1211.read(TAG, str);
            }
        }
    }

    @Override // java.lang.Thread
    public void interrupt() {
        super.interrupt();
        stopChecker();
    }

    private void checkDataPeriodically() {
        String str;
        if (this.accTimeDeque == null || this.gyroTimeDeque == null) {
            WrappedCompositionsetContent1211.read(TAG, "invalid sdk_ver: " + Build.VERSION.SDK_INT);
            return;
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.timer = scheduledExecutorServiceNewScheduledThreadPool;
        try {
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new ZM$$ExternalSyntheticLambda2(2, this), 1000L, 1000L, TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException unused) {
            str = "invalid argument!";
            WrappedCompositionsetContent1211.read(TAG, str);
        } catch (RejectedExecutionException unused2) {
            str = "reject execute!";
            WrappedCompositionsetContent1211.read(TAG, str);
        }
    }

    public static InputFreqCheckThread getInstance() {
        if (freqCheckThread == null) {
            synchronized (InputFreqCheckThread.class) {
                if (freqCheckThread == null) {
                    freqCheckThread = new InputFreqCheckThread();
                }
            }
        }
        return freqCheckThread;
    }

    private void refreshDeque(int i) {
        String keyWord = getKeyWord(i);
        LinkedBlockingDeque<Long> deque = getDeque(i);
        if (deque.size() == 0) {
            WrappedCompositionsetContent1211.read(TAG, keyWord + " null deque!");
            return;
        }
        synchronized (LOCK) {
            if (deque.isEmpty()) {
                ErrorCodeManager.setErrorCode(getNoDataErrorCode(i));
                WrappedCompositionsetContent1211.read(TAG, keyWord + " no data!");
            } else {
                while (!deque.isEmpty()) {
                    Long lPoll = deque.poll();
                    if (lPoll == null) {
                        WrappedCompositionsetContent1211.read(TAG, keyWord + " null item!");
                    } else if (System.currentTimeMillis() - lPoll.longValue() <= 1000) {
                        break;
                    }
                }
                int size = deque.size();
                if (size < getMinFreq(i)) {
                    WrappedCompositionsetContent1211.read(TAG, keyWord + " invalid freq: " + size);
                    ErrorCodeManager.setErrorCode(getLowFreqErrorCode(i));
                } else {
                    ErrorCodeManager.setErrorCode(0);
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "thread name: " + getName());
        Process.setThreadPriority(-4);
        checkDataPeriodically();
    }

    public void wssEnqueue(long j) {
        String str;
        if (this.wssTimeDeque == null) {
            WrappedCompositionsetContent1211.read(TAG, "null wssDeque!");
            return;
        }
        synchronized (LOCK) {
            boolean zIsEmpty = this.wssTimeDeque.isEmpty();
            LinkedBlockingDeque<Long> linkedBlockingDeque = this.wssTimeDeque;
            if (zIsEmpty) {
                if (!linkedBlockingDeque.offer(Long.valueOf(j))) {
                    str = "wssDeque error!";
                    WrappedCompositionsetContent1211.read(TAG, str);
                }
            } else {
                try {
                    Long last = linkedBlockingDeque.getLast();
                    if (last == null) {
                        str = "null wss item!";
                    } else if (j >= 0 && last.longValue() >= 0) {
                        long jAbs = Math.abs(j - last.longValue());
                        if (jAbs > 500) {
                            WrappedCompositionsetContent1211.read(TAG, "wss interval: " + jAbs);
                            ErrorCodeManager.setErrorCode(Constant.ERROR_WSS_TIME_DIFF_LARGE);
                        }
                        if (!this.wssTimeDeque.offer(Long.valueOf(j))) {
                            str = "offer wss error!";
                        }
                    } else {
                        str = "invalid wss time: " + j + "/" + last;
                    }
                    WrappedCompositionsetContent1211.read(TAG, str);
                } catch (NoSuchElementException unused) {
                    WrappedCompositionsetContent1211.read(TAG, "no wss item in deque!");
                }
            }
        }
    }

    public int hashCode() {
        LinkedBlockingDeque<Long> linkedBlockingDeque = this.accTimeDeque;
        int iHashCode = linkedBlockingDeque != null ? linkedBlockingDeque.hashCode() : 0;
        LinkedBlockingDeque<Long> linkedBlockingDeque2 = this.gyroTimeDeque;
        int iHashCode2 = linkedBlockingDeque2 != null ? linkedBlockingDeque2.hashCode() : 0;
        LinkedBlockingDeque<Long> linkedBlockingDeque3 = this.wssTimeDeque;
        return (((iHashCode * 31) + iHashCode2) * 31) + (linkedBlockingDeque3 != null ? linkedBlockingDeque3.hashCode() : 0);
    }

    public void stopChecker() {
        WrappedCompositionsetContent1211.read(TAG, "ready to stop FreqChecker.");
        synchronized (LOCK) {
            clearThread();
            LinkedBlockingDeque<Long> linkedBlockingDeque = this.accTimeDeque;
            if (linkedBlockingDeque != null) {
                linkedBlockingDeque.clear();
            }
            LinkedBlockingDeque<Long> linkedBlockingDeque2 = this.gyroTimeDeque;
            if (linkedBlockingDeque2 != null) {
                linkedBlockingDeque2.clear();
            }
            LinkedBlockingDeque<Long> linkedBlockingDeque3 = this.wssTimeDeque;
            if (linkedBlockingDeque3 != null) {
                linkedBlockingDeque3.clear();
            }
            try {
                ScheduledExecutorService scheduledExecutorService = this.timer;
                if (scheduledExecutorService == null) {
                    WrappedCompositionsetContent1211.write(TAG, "timer is null!");
                    return;
                }
                scheduledExecutorService.shutdown();
                if (!this.timer.awaitTermination(10L, TimeUnit.MILLISECONDS)) {
                    this.timer.shutdownNow();
                }
            } catch (InterruptedException e) {
                WrappedCompositionsetContent1211.read(TAG, "watchDogThread timer exception: " + e.getMessage());
                this.timer.shutdownNow();
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !(obj instanceof InputFreqCheckThread)) {
            return false;
        }
        InputFreqCheckThread inputFreqCheckThread = (InputFreqCheckThread) obj;
        if (Objects.equals(this.accTimeDeque, inputFreqCheckThread.accTimeDeque) && Objects.equals(this.gyroTimeDeque, inputFreqCheckThread.gyroTimeDeque)) {
            return Objects.equals(this.wssTimeDeque, inputFreqCheckThread.wssTimeDeque);
        }
        return false;
    }

    private LinkedBlockingDeque<Long> getDeque(int i) {
        if (i == 1) {
            return this.accTimeDeque;
        }
        if (i == 2) {
            return this.gyroTimeDeque;
        }
        if (i != 3) {
            return new LinkedBlockingDeque<>(1);
        }
        return this.wssTimeDeque;
    }

    private String getKeyWord(int i) {
        if (i == 1) {
            return "imu_acc";
        }
        if (i == 2) {
            return "imu_gyro";
        }
        if (i != 3) {
            return SystemUtils.UNKNOWN;
        }
        return "wss";
    }
}
