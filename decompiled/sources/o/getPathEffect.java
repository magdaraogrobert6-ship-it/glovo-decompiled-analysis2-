package o;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class getPathEffect implements FlowCollector {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ notifyContentCaptureChanges serializer;

    public /* synthetic */ getPathEffect(notifyContentCaptureChanges notifycontentcapturechanges, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = notifycontentcapturechanges;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        notifyContentCaptureChanges notifycontentcapturechanges = this.serializer;
        if (i == 0) {
            notifycontentcapturechanges.setValue(obj);
            return createfromparcel;
        }
        if (i != 1) {
            notifycontentcapturechanges.setValue(obj);
            return createfromparcel;
        }
        notifycontentcapturechanges.setValue(obj);
        return createfromparcel;
    }
}
