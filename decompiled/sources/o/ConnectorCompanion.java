package o;

import android.graphics.PointF;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectorCompanion implements connectorKeyYBCOT_4 {
    public static final ConnectorCompanion IconCompatParcelizer = new ConnectorCompanion();
    public static final colorResource RemoteActionCompatParcelizer = colorResource.RemoteActionCompatParcelizer("c", "v", "i", "o");

    @Override // o.connectorKeyYBCOT_4
    public final Object serializer(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) {
        if (jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.BEGIN_ARRAY) {
            jsonReader.read();
        }
        jsonReader.RemoteActionCompatParcelizer();
        ArrayList arrayListWrite = null;
        ArrayList arrayListWrite2 = null;
        ArrayList arrayListWrite3 = null;
        boolean zMediaSessionCompatQueueItem = false;
        while (jsonReader.MediaBrowserCompatMediaItem()) {
            int i = jsonReader.read(RemoteActionCompatParcelizer);
            if (i == 0) {
                zMediaSessionCompatQueueItem = jsonReader.MediaSessionCompatQueueItem();
            } else if (i == 1) {
                arrayListWrite = transferHlgEotfui_graphics.write(jsonReader, f);
            } else if (i == 2) {
                arrayListWrite2 = transferHlgEotfui_graphics.write(jsonReader, f);
            } else if (i != 3) {
                jsonReader.MediaSessionCompatToken();
                jsonReader.MediaSessionCompatResultReceiverWrapper();
            } else {
                arrayListWrite3 = transferHlgEotfui_graphics.write(jsonReader, f);
            }
        }
        jsonReader.write();
        if (jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.END_ARRAY) {
            jsonReader.IconCompatParcelizer();
        }
        if (arrayListWrite == null || arrayListWrite2 == null || arrayListWrite3 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Shape data was missing information.");
            return null;
        }
        if (arrayListWrite.isEmpty()) {
            return new r8lambda9WZGo8jxmhcanMko0p70vdir2pY(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListWrite.size();
        PointF pointF = (PointF) arrayListWrite.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 1; i2 < size; i2++) {
            PointF pointF2 = (PointF) arrayListWrite.get(i2);
            int i3 = i2 - 1;
            arrayList.add(new getMaxValue(getD50.read((PointF) arrayListWrite.get(i3), (PointF) arrayListWrite3.get(i3)), getD50.read(pointF2, (PointF) arrayListWrite2.get(i2)), pointF2));
        }
        if (zMediaSessionCompatQueueItem) {
            PointF pointF3 = (PointF) arrayListWrite.get(0);
            int i4 = size - 1;
            arrayList.add(new getMaxValue(getD50.read((PointF) arrayListWrite.get(i4), (PointF) arrayListWrite3.get(i4)), getD50.read(pointF3, (PointF) arrayListWrite2.get(0)), pointF3));
        }
        return new r8lambda9WZGo8jxmhcanMko0p70vdir2pY(pointF, zMediaSessionCompatQueueItem, arrayList);
    }
}
