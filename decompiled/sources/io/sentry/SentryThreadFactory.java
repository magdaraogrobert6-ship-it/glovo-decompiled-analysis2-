package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.ParcelableVolumeInfo;
import io.sentry.protocol._init_lambda2;
import io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
import io.sentry.protocol.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o.UriActionExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryThreadFactory {
    public final UriActionExternalSyntheticLambda1 read;

    public static r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 write(Throwable th, ParcelableVolumeInfo parcelableVolumeInfo, Long l, List list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 = new r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", "");
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh0 = new r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0(list);
            if (z) {
                r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.serializer = Boolean.TRUE;
            }
            r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.serializer = r8lambdaypqlaaoriyrj3iy_tqzuutrvh0;
        }
        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.read = l;
        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.RemoteActionCompatParcelizer = name;
        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.write = parcelableVolumeInfo;
        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.IconCompatParcelizer = name2;
        r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.MediaBrowserCompatMediaItem = message;
        return r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8;
    }

    public ArrayList RemoteActionCompatParcelizer(Map map, ArrayList arrayList, boolean z, boolean z2) {
        ArrayList arrayListSerializer;
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z3 = (thread == threadCurrentThread && !z) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            _init_lambda2 _init_lambda2Var = new _init_lambda2();
            _init_lambda2Var.MediaSessionCompatQueueItem = thread2.getName();
            _init_lambda2Var.RatingCompat = Integer.valueOf(thread2.getPriority());
            _init_lambda2Var.IconCompatParcelizer = Long.valueOf(thread2.getId());
            _init_lambda2Var.serializer = Boolean.valueOf(thread2.isDaemon());
            _init_lambda2Var.MediaDescriptionCompat = thread2.getState().name();
            _init_lambda2Var.write = Boolean.valueOf(z3);
            if (z2 && (arrayListSerializer = this.read.serializer(stackTraceElementArr, false)) != null && !arrayListSerializer.isEmpty()) {
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh0 = new r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0(arrayListSerializer);
                r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.serializer = Boolean.TRUE;
                _init_lambda2Var.MediaBrowserCompatMediaItem = r8lambdaypqlaaoriyrj3iy_tqzuutrvh0;
            }
            arrayList2.add(_init_lambda2Var);
        }
        return arrayList2;
    }

    public void IconCompatParcelizer(Throwable th, AtomicInteger atomicInteger, HashSet hashSet, ArrayDeque arrayDeque, String str) {
        Thread threadCurrentThread;
        ParcelableVolumeInfo parcelableVolumeInfo;
        boolean z;
        int iIncrementAndGet = atomicInteger.get();
        while (th != null && hashSet.add(th)) {
            if (str == null) {
                str = "chained";
            }
            if (th instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th;
                ParcelableVolumeInfo parcelableVolumeInfo2 = exceptionMechanismException.IconCompatParcelizer;
                Throwable th2 = exceptionMechanismException.RemoteActionCompatParcelizer;
                threadCurrentThread = exceptionMechanismException.serializer;
                z = exceptionMechanismException.read;
                th = th2;
                parcelableVolumeInfo = parcelableVolumeInfo2;
            } else {
                ParcelableVolumeInfo parcelableVolumeInfo3 = new ParcelableVolumeInfo();
                threadCurrentThread = Thread.currentThread();
                parcelableVolumeInfo = parcelableVolumeInfo3;
                z = false;
            }
            arrayDeque.addFirst(write(th, parcelableVolumeInfo, Long.valueOf(threadCurrentThread.getId()), this.read.serializer(th.getStackTrace(), Boolean.FALSE.equals(parcelableVolumeInfo.serializer)), z));
            if (parcelableVolumeInfo.MediaDescriptionCompat == null) {
                parcelableVolumeInfo.MediaDescriptionCompat = str;
            }
            if (atomicInteger.get() >= 0) {
                parcelableVolumeInfo.RatingCompat = Integer.valueOf(iIncrementAndGet);
            }
            iIncrementAndGet = atomicInteger.incrementAndGet();
            parcelableVolumeInfo.IconCompatParcelizer = Integer.valueOf(iIncrementAndGet);
            Throwable[] suppressed = th.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                for (Throwable th3 : suppressed) {
                    IconCompatParcelizer(th3, atomicInteger, hashSet, arrayDeque, "suppressed");
                }
            }
            th = th.getCause();
            str = null;
        }
    }
}
