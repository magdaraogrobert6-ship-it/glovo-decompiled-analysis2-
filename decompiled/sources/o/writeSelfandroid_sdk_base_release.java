package o;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class writeSelfandroid_sdk_base_release implements Runnable {
    final /* synthetic */ Long IconCompatParcelizer;
    final /* synthetic */ Long RemoteActionCompatParcelizer;
    final /* synthetic */ HashMap serializer;
    final /* synthetic */ getAnalyticsEnabledEnterannotations write;

    @Override // java.lang.Runnable
    public final void run() {
        List<getCooldownEnterSeconds.read> listWrite;
        SparseArray sparseArrayIconCompatParcelizer = getAnalyticsEnabledEnterannotations.IconCompatParcelizer(this.write, this.serializer);
        ArrayList arrayList = new ArrayList(this.serializer.keySet());
        synchronized (this.write) {
            if (!this.write.MediaSessionCompatResultReceiverWrapper) {
                this.write.MediaSessionCompatToken.IconCompatParcelizer();
                return;
            }
            Long l = this.IconCompatParcelizer;
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.write;
            if (l != null) {
                getanalyticsenabledenterannotations.MediaSessionCompatQueueItem.IconCompatParcelizer("Sticky subscription: fetching events after %d", this.IconCompatParcelizer);
                getCooldownEnterSeconds getcooldownenterseconds = this.write.RemoteActionCompatParcelizer;
                long jLongValue = this.IconCompatParcelizer.longValue();
                getcooldownenterseconds.getClass();
                listWrite = (List) getcooldownenterseconds.serializer(Collections.EMPTY_LIST, new getNotificationResponsivenessMs(getcooldownenterseconds, arrayList, jLongValue, 0));
            } else {
                parseLonglambda0 parselonglambda0 = getanalyticsenabledenterannotations.MediaSessionCompatQueueItem;
                Long l2 = this.RemoteActionCompatParcelizer;
                parselonglambda0.IconCompatParcelizer("Sticky subscription: fetching events since %s", l2 != null ? com.sentiance.sdk.util.x.c(l2.longValue()) : "null");
                listWrite = this.write.RemoteActionCompatParcelizer.write((List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>>) arrayList, this.RemoteActionCompatParcelizer, (Long) null, true, false);
            }
            getAnalyticsEnabledEnterannotations.serializer(this.write, listWrite, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
            Long lValueOf = listWrite.isEmpty() ? null : Long.valueOf(((getCooldownEnterSeconds.read) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, listWrite)).IconCompatParcelizer());
            getAnalyticsEnabledEnterannotations.RemoteActionCompatParcelizer(this.write, listWrite, sparseArrayIconCompatParcelizer);
            synchronized (this.write) {
                if (this.write.MediaSessionCompatResultReceiverWrapper) {
                    if (lValueOf != null) {
                        this.write.MediaSessionCompatQueueItem.IconCompatParcelizer("Sticky subscription: fetching events after last result with id %d", lValueOf);
                        getCooldownEnterSeconds getcooldownenterseconds2 = this.write.RemoteActionCompatParcelizer;
                        long jLongValue2 = lValueOf.longValue();
                        getcooldownenterseconds2.getClass();
                        List list = (List) getcooldownenterseconds2.serializer(Collections.EMPTY_LIST, new getNotificationResponsivenessMs(getcooldownenterseconds2, arrayList, jLongValue2, 0));
                        if (!list.isEmpty()) {
                            this.write.MediaSessionCompatQueueItem.IconCompatParcelizer("%d events were published in the mean time", Integer.valueOf(list.size()));
                            this.write.serializer(this.serializer, null, lValueOf);
                            this.write.MediaSessionCompatToken.IconCompatParcelizer();
                            return;
                        }
                    }
                    this.write.MediaSessionCompatQueueItem.IconCompatParcelizer("Adding consumers", new Object[0]);
                    getAnalyticsEnabledEnterannotations.write(this.write, this.serializer);
                }
                this.write.MediaSessionCompatToken.IconCompatParcelizer();
            }
        }
    }

    public writeSelfandroid_sdk_base_release(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, HashMap map, Long l, Long l2) {
        this.write = getanalyticsenabledenterannotations;
        this.serializer = map;
        this.IconCompatParcelizer = l;
        this.RemoteActionCompatParcelizer = l2;
    }
}
