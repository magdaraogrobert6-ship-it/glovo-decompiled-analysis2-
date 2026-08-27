package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class onCreateWindow extends onCreateWindowlambda1 {
    public final /* synthetic */ Object $block;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onCreateWindow(int i, String str, Object obj) {
        super(str, true);
        this.$r8$classId = i;
        this.$block = obj;
    }

    @Override // o.onCreateWindowlambda1
    public final long read() {
        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView;
        long j;
        int i = this.$r8$classId;
        if (i == 0) {
            ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.$block).invoke();
            return -1L;
        }
        if (i == 1) {
            r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4 = (r8lambdaMkSjJB1nMG37oUW_yupQha4) this.$block;
            synchronized (r8lambdamksjjb1nmg37ouw_yupqha4) {
                try {
                    if (!r8lambdamksjjb1nmg37ouw_yupqha4.initialized || r8lambdamksjjb1nmg37ouw_yupqha4.closed) {
                        return -1L;
                    }
                    try {
                        r8lambdamksjjb1nmg37ouw_yupqha4.MediaMetadataCompat();
                    } catch (IOException unused) {
                        r8lambdamksjjb1nmg37ouw_yupqha4.mostRecentTrimFailed = true;
                    }
                    try {
                        if (r8lambdamksjjb1nmg37ouw_yupqha4.serializer()) {
                            r8lambdamksjjb1nmg37ouw_yupqha4.RatingCompat();
                            r8lambdamksjjb1nmg37ouw_yupqha4.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        r8lambdamksjjb1nmg37ouw_yupqha4.mostRecentRebuildFailed = true;
                        SingleRequest singleRequest = r8lambdamksjjb1nmg37ouw_yupqha4.journalWriter;
                        if (singleRequest != null) {
                            InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer(singleRequest);
                        }
                        r8lambdamksjjb1nmg37ouw_yupqha4.journalWriter = new SingleRequest(new setImageViewToUrl());
                    }
                    return -1L;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        setLargerCloseButtonClickArealambda0 setlargerclosebuttonclickarealambda0 = (setLargerCloseButtonClickArealambda0) this.$block;
        long jNanoTime = System.nanoTime();
        Map map = setlargerclosebuttonclickarealambda0.addressStates;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
        Iterator it2 = setlargerclosebuttonclickarealambda0.connections.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            if (map.get(((InAppMessageImmersiveBaseView) it2.next()).route.address) != null) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                return 0L;
            }
        }
        long j2 = setlargerclosebuttonclickarealambda0.keepAliveDurationNs;
        Iterator it3 = setlargerclosebuttonclickarealambda0.connections.iterator();
        it3.getClass();
        long j3 = (jNanoTime - j2) + 1;
        long j4 = Long.MAX_VALUE;
        int i2 = 0;
        int i3 = 0;
        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView2 = null;
        InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView3 = null;
        while (it3.hasNext()) {
            InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView4 = (InAppMessageImmersiveBaseView) it3.next();
            inAppMessageImmersiveBaseView4.getClass();
            synchronized (inAppMessageImmersiveBaseView4) {
                if (setlargerclosebuttonclickarealambda0.read(inAppMessageImmersiveBaseView4, jNanoTime) > 0) {
                    i3++;
                    j = jNanoTime;
                } else {
                    j = jNanoTime;
                    long j5 = inAppMessageImmersiveBaseView4.idleAtNs;
                    if (j5 < j3) {
                        inAppMessageImmersiveBaseView2 = inAppMessageImmersiveBaseView4;
                        j3 = j5;
                    }
                    if (map.get(inAppMessageImmersiveBaseView4.route.address) != null) {
                        throw new ClassCastException();
                    }
                    i2++;
                    if (j5 < j4) {
                        inAppMessageImmersiveBaseView3 = inAppMessageImmersiveBaseView4;
                        j4 = j5;
                    }
                }
            }
            jNanoTime = j;
        }
        long j6 = jNanoTime;
        if (inAppMessageImmersiveBaseView2 != null) {
            inAppMessageImmersiveBaseView = inAppMessageImmersiveBaseView2;
        } else if (i2 > setlargerclosebuttonclickarealambda0.maxIdleConnections) {
            j3 = j4;
            inAppMessageImmersiveBaseView = inAppMessageImmersiveBaseView3;
        } else {
            j3 = -1;
            inAppMessageImmersiveBaseView = null;
        }
        if (inAppMessageImmersiveBaseView == null) {
            if (inAppMessageImmersiveBaseView3 != null) {
                return (j4 + setlargerclosebuttonclickarealambda0.keepAliveDurationNs) - j6;
            }
            if (i3 > 0) {
                return setlargerclosebuttonclickarealambda0.keepAliveDurationNs;
            }
            return -1L;
        }
        synchronized (inAppMessageImmersiveBaseView) {
            if (inAppMessageImmersiveBaseView.calls.isEmpty() && inAppMessageImmersiveBaseView.idleAtNs == j3) {
                inAppMessageImmersiveBaseView.noNewExchanges = true;
                setlargerclosebuttonclickarealambda0.connections.remove(inAppMessageImmersiveBaseView);
                if (map.get(inAppMessageImmersiveBaseView.route.address) == null) {
                    setWebViewContent.RemoteActionCompatParcelizer(inAppMessageImmersiveBaseView.socket);
                    if (setlargerclosebuttonclickarealambda0.connections.isEmpty()) {
                        onCreateWindowlambda3 oncreatewindowlambda3 = setlargerclosebuttonclickarealambda0.cleanupQueue;
                        synchronized (oncreatewindowlambda3.taskRunner) {
                            if (oncreatewindowlambda3.IconCompatParcelizer()) {
                                oncreatewindowlambda3.taskRunner.read(oncreatewindowlambda3);
                            }
                        }
                    }
                } else {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
                }
            }
        }
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onCreateWindow(boolean z, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        super(str, z);
        this.$r8$classId = 0;
        this.$block = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }
}
