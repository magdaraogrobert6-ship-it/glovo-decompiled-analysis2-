package o;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambdaIKrUXM7M1NlFsmnL5loEQlEFIc4 implements PinnableContainer {
    final /* synthetic */ migratePushDeliveryEventsToJsonlambda0.write IconCompatParcelizer;
    final /* synthetic */ Boolean[] read;

    @Override // o.PinnableContainer
    public final void onComplete(Task task) {
        synchronized (this.IconCompatParcelizer) {
            this.read[0] = Boolean.TRUE;
            this.IconCompatParcelizer.notifyAll();
        }
    }

    public r8lambdaIKrUXM7M1NlFsmnL5loEQlEFIc4(migratePushDeliveryEventsToJsonlambda0.write writeVar, Boolean[] boolArr) {
        this.IconCompatParcelizer = writeVar;
        this.read = boolArr;
    }
}
