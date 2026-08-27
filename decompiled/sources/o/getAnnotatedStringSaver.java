package o;

import android.content.Context;
import com.roadrunner.delivery.accept.acknowledgment.implementation.data.AckNewOrderSeenWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class getAnnotatedStringSaver implements getViewWidget {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final ClickableSaverlambda1 RemoteActionCompatParcelizer;
    public final TextUnitTypeSaverlambda0 read;
    public final VerbatimTtsAnnotationSaverlambda1 serializer;
    public final getPivotOffsetF1C5BW0 write;

    public getAnnotatedStringSaver(ClickableSaverlambda1 clickableSaverlambda1, getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, TextUnitTypeSaverlambda0 textUnitTypeSaverlambda0, VerbatimTtsAnnotationSaverlambda1 verbatimTtsAnnotationSaverlambda1) {
        this.RemoteActionCompatParcelizer = clickableSaverlambda1;
        this.write = getpivotoffsetf1c5bw0;
        this.read = textUnitTypeSaverlambda0;
        this.serializer = verbatimTtsAnnotationSaverlambda1;
    }

    @Override // o.getViewWidget
    public final accesssetSpotShadowColor8_81llAjd read(Context context, androidx.work.WorkerParameters workerParameters) {
        int i = 2 % 2;
        context.getClass();
        AckNewOrderSeenWorker ackNewOrderSeenWorker = new AckNewOrderSeenWorker(context, workerParameters, this.RemoteActionCompatParcelizer, this.read, this.write, VerbatimTtsAnnotationSaverlambda0.read, this.serializer);
        int i2 = MediaSessionCompatQueueItem + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return ackNewOrderSeenWorker;
    }
}
