package io.sentry.android.core;

import android.view.Choreographer;
import androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda1;
import io.sentry.SentryUUID;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import o.UriActionExternalSyntheticLambda4;
import o.createBannerWebViewClientListenerandroid_sdk_ui_release;
import o.getAllBrazeActionStepTypes;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.isArgStringlambda0;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.requestPushPermissionlambda0;
import o.secondArg_delegatelambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class SpanFrameMetricsCollector implements io.sentry.android.core.internal.util.PlaybackStateCompat, getAllBrazeActionStepTypes {
    public static final requestPushPermissionlambda0 serializer = new requestPushPermissionlambda0(new Date(0), 0);
    public volatile String MediaMetadataCompat;
    public final SentryFrameMetricsCollector RemoteActionCompatParcelizer;
    public final boolean write;
    public final io.sentry.util.RemoteActionCompatParcelizer MediaSessionCompatQueueItem = new io.sentry.util.RemoteActionCompatParcelizer();
    public final TreeSet RatingCompat = new TreeSet(new LayoutNode$$ExternalSyntheticLambda1(9));
    public final ConcurrentSkipListSet IconCompatParcelizer = new ConcurrentSkipListSet();
    public long read = 16666666;

    @Override // io.sentry.android.core.internal.util.PlaybackStateCompat
    public final void read(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        ConcurrentSkipListSet concurrentSkipListSet = this.IconCompatParcelizer;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j5 = (long) (1.0E9d / ((double) f));
        this.read = j5;
        if (z || z2) {
            concurrentSkipListSet.add(new onBackPressedInput_delegatelambda0(j, j2, j3, j4, z, z2, j5));
        }
    }

    public final void write() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            if (this.MediaMetadataCompat != null) {
                this.RemoteActionCompatParcelizer.read(this.MediaMetadataCompat);
                this.MediaMetadataCompat = null;
            }
            this.IconCompatParcelizer.clear();
            this.RatingCompat.clear();
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long read(createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release) {
        if (createbannerwebviewclientlistenerandroid_sdk_ui_release instanceof requestPushPermissionlambda0) {
            return createbannerwebviewclientlistenerandroid_sdk_ui_release.read(serializer);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return System.nanoTime() - ((jCurrentTimeMillis * 1000000) - createbannerwebviewclientlistenerandroid_sdk_ui_release.read());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109 A[PHI: r5 r25
  0x0109: PHI (r5v12 long) = (r5v11 long), (r5v9 long) binds: [B:69:0x0107, B:44:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x0109: PHI (r25v3 long) = (r25v2 long), (r25v6 long) binds: [B:69:0x0107, B:44:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0110 A[PHI: r5 r25
  0x0110: PHI (r5v14 long) = (r5v11 long), (r5v9 long) binds: [B:71:0x010e, B:46:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x0110: PHI (r25v5 long) = (r25v2 long), (r25v6 long) binds: [B:71:0x010e, B:46:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x015e  */
    public final void RemoteActionCompatParcelizer(r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0) throws Throwable {
        TreeSet treeSet;
        io.sentry.util.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        ConcurrentSkipListSet concurrentSkipListSet;
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer;
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long jLongValue;
        Field field;
        TreeSet treeSet2 = this.RatingCompat;
        if (!this.write || (r8lambdareqvhj3p9oule_afn8an0r0tlg0 instanceof isArgStringlambda0) || (r8lambdareqvhj3p9oule_afn8an0r0tlg0 instanceof secondArg_delegatelambda0)) {
            return;
        }
        io.sentry.util.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.MediaSessionCompatQueueItem;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = remoteActionCompatParcelizer2.serializer();
        try {
            if (!treeSet2.contains(r8lambdareqvhj3p9oule_afn8an0r0tlg0)) {
                uriActionExternalSyntheticLambda4Serializer.close();
                return;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = remoteActionCompatParcelizer2.serializer();
            try {
                boolean zRemove = treeSet2.remove(r8lambdareqvhj3p9oule_afn8an0r0tlg0);
                ConcurrentSkipListSet concurrentSkipListSet2 = this.IconCompatParcelizer;
                if (!zRemove || (createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer = r8lambdareqvhj3p9oule_afn8an0r0tlg0.serializer()) == null) {
                    uriActionExternalSyntheticLambda4Serializer2.close();
                    treeSet = treeSet2;
                    remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                    concurrentSkipListSet = concurrentSkipListSet2;
                } else {
                    long j4 = read(r8lambdareqvhj3p9oule_afn8an0r0tlg0.write());
                    long j5 = read(createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer);
                    long j6 = j5 - j4;
                    if (j6 <= 0) {
                        uriActionExternalSyntheticLambda4Serializer2.close();
                        treeSet = treeSet2;
                        remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                        concurrentSkipListSet = concurrentSkipListSet2;
                    } else {
                        long j7 = this.read;
                        int i3 = 1;
                        if (concurrentSkipListSet2.isEmpty()) {
                            treeSet = treeSet2;
                            remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                            concurrentSkipListSet = concurrentSkipListSet2;
                            i = 0;
                            i2 = 0;
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                        } else {
                            Iterator it = concurrentSkipListSet2.tailSet(new onBackPressedInput_delegatelambda0(j4)).iterator();
                            i = 0;
                            i2 = 0;
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    treeSet = treeSet2;
                                    remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                                    concurrentSkipListSet = concurrentSkipListSet2;
                                    break;
                                }
                                onBackPressedInput_delegatelambda0 onbackpressedinput_delegatelambda0 = (onBackPressedInput_delegatelambda0) it.next();
                                long j8 = onbackpressedinput_delegatelambda0.RatingCompat;
                                Iterator it2 = it;
                                concurrentSkipListSet = concurrentSkipListSet2;
                                long jMin = onbackpressedinput_delegatelambda0.read;
                                treeSet = treeSet2;
                                remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                                long j9 = onbackpressedinput_delegatelambda0.serializer;
                                long j10 = onbackpressedinput_delegatelambda0.write;
                                if (j8 > j5) {
                                    break;
                                }
                                if (j8 >= j4 && j10 <= j5) {
                                    try {
                                        long j11 = onbackpressedinput_delegatelambda0.IconCompatParcelizer;
                                        boolean z = onbackpressedinput_delegatelambda0.MediaBrowserCompatMediaItem;
                                        j3 += j11;
                                        if (onbackpressedinput_delegatelambda0.RemoteActionCompatParcelizer) {
                                            j += jMin;
                                            i2++;
                                        } else if (z) {
                                            j2 += jMin;
                                            i++;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } else if ((j4 > j8 && j4 < j10) || (j5 > j8 && j5 < j10)) {
                                    jMin = Math.min(jMin - Math.max(0L, Math.max(0L, j4 - j8) - j9), j6);
                                    long jMin2 = Math.min(j5, j10) - Math.max(j4, onbackpressedinput_delegatelambda0.RatingCompat);
                                    boolean z2 = jMin2 > j9;
                                    j3 += jMin2;
                                    if (jMin2 > 700000000) {
                                        j += jMin;
                                        i2++;
                                    } else if (z2) {
                                        j2 += jMin;
                                        i++;
                                    }
                                }
                                j7 = j9;
                                it = it2;
                                concurrentSkipListSet2 = concurrentSkipListSet;
                                treeSet2 = treeSet;
                                remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
                                Throwable th2 = th;
                                try {
                                    uriActionExternalSyntheticLambda4Serializer2.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                            j7 = j7;
                        }
                        int iCeil = i + i2;
                        SentryFrameMetricsCollector sentryFrameMetricsCollector = this.RemoteActionCompatParcelizer;
                        Choreographer choreographer = sentryFrameMetricsCollector.serializer;
                        if (choreographer == null || (field = sentryFrameMetricsCollector.RemoteActionCompatParcelizer) == null) {
                            jLongValue = -1;
                        } else {
                            try {
                                Long l = (Long) field.get(choreographer);
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                        if (jLongValue != -1) {
                            long jMax = Math.max(0L, j5 - jLongValue);
                            if (jMax > j7) {
                                boolean z3 = jMax > 700000000;
                                long jMax2 = Math.max(0L, jMax - j7);
                                j3 += jMax;
                                if (z3) {
                                    j += jMax2;
                                    i2++;
                                } else {
                                    j2 += jMax2;
                                    i++;
                                }
                            } else {
                                i3 = 0;
                            }
                            long j12 = j6 - j3;
                            iCeil = iCeil + i3 + (j12 > 0 ? (int) Math.ceil(j12 / j7) : 0);
                        }
                        double d = (j2 + j) / 1.0E9d;
                        r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(Integer.valueOf(iCeil), "frames.total");
                        r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(Integer.valueOf(i), "frames.slow");
                        r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(Integer.valueOf(i2), "frames.frozen");
                        r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(Double.valueOf(d), "frames.delay");
                        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 instanceof getChildStepIteratorandroid_sdk_ui_release) {
                            r8lambdareqvhj3p9oule_afn8an0r0tlg0.write("frames_total", Integer.valueOf(iCeil));
                            r8lambdareqvhj3p9oule_afn8an0r0tlg0.write("frames_slow", Integer.valueOf(i));
                            r8lambdareqvhj3p9oule_afn8an0r0tlg0.write("frames_frozen", Integer.valueOf(i2));
                            r8lambdareqvhj3p9oule_afn8an0r0tlg0.write("frames_delay", Double.valueOf(d));
                        }
                        uriActionExternalSyntheticLambda4Serializer2.close();
                    }
                }
                UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer3 = remoteActionCompatParcelizer.serializer();
                try {
                    if (treeSet.isEmpty()) {
                        write();
                    } else {
                        concurrentSkipListSet.headSet(new onBackPressedInput_delegatelambda0(read(((r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) treeSet.first()).write()))).clear();
                    }
                    uriActionExternalSyntheticLambda4Serializer3.close();
                } catch (Throwable th4) {
                    try {
                        uriActionExternalSyntheticLambda4Serializer3.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    public SpanFrameMetricsCollector(SentryAndroidOptions sentryAndroidOptions, SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this.RemoteActionCompatParcelizer = sentryFrameMetricsCollector;
        this.write = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public final void write(r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0) {
        String str;
        if (!this.write || (r8lambdareqvhj3p9oule_afn8an0r0tlg0 instanceof isArgStringlambda0) || (r8lambdareqvhj3p9oule_afn8an0r0tlg0 instanceof secondArg_delegatelambda0)) {
            return;
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            this.RatingCompat.add(r8lambdareqvhj3p9oule_afn8an0r0tlg0);
            if (this.MediaMetadataCompat == null) {
                SentryFrameMetricsCollector sentryFrameMetricsCollector = this.RemoteActionCompatParcelizer;
                if (sentryFrameMetricsCollector.MediaBrowserCompatMediaItem) {
                    String strIconCompatParcelizer = SentryUUID.IconCompatParcelizer();
                    sentryFrameMetricsCollector.MediaDescriptionCompat.put(strIconCompatParcelizer, this);
                    sentryFrameMetricsCollector.write();
                    str = strIconCompatParcelizer;
                } else {
                    str = null;
                }
                this.MediaMetadataCompat = str;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
