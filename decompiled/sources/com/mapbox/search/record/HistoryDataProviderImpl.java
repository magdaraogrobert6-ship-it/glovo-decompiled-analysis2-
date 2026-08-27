package com.mapbox.search.record;

import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import o.accessgetInstancedelegatecp;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaN7z0Ea2bnxePLVipqp_gDhWww;
import o.resetAfterInAppMessageCloselambda2;
import o.verifyOrientationStatuslambda2;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryDataProviderImpl extends LocalDataProviderImpl {
    @Override // com.mapbox.search.record.LocalDataProviderImpl
    public final void addAndTrimRecords(List list, Map map) {
        List<HistoryRecord> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (HistoryRecord historyRecord : list2) {
            arrayList.add(new onViewAttachedToWindowlambda0(historyRecord.id, historyRecord));
        }
        onMove.RemoteActionCompatParcelizer(map, arrayList);
        int size = map.size();
        int i = this.maxRecordsAmount;
        if (size <= i) {
            return;
        }
        VideoCapture$$ExternalSyntheticLambda5 videoCapture$$ExternalSyntheticLambda5 = new VideoCapture$$ExternalSyntheticLambda5(2, onMove.RemoteActionCompatParcelizer(new verifyOrientationStatuslambda2(0, new r8lambdaN7z0Ea2bnxePLVipqp_gDhWww(1, list2))));
        List listMediaMetadataCompat = onContentCardDismissed.MediaMetadataCompat(map.values());
        int size2 = map.size() - i;
        PriorityQueue priorityQueue = new PriorityQueue(size2, videoCapture$$ExternalSyntheticLambda5);
        List list3 = listMediaMetadataCompat;
        priorityQueue.addAll(onContentCardDismissed.read(list3, size2));
        for (HistoryRecord historyRecord2 : resetAfterInAppMessageCloselambda2.RemoteActionCompatParcelizer(new r8lambdaN7z0Ea2bnxePLVipqp_gDhWww(1, list3), size2)) {
            if (videoCapture$$ExternalSyntheticLambda5.compare(historyRecord2, priorityQueue.element()) >= 0) {
                priorityQueue.poll();
                priorityQueue.add(historyRecord2);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            map.remove(((HistoryRecord) it.next()).id);
        }
        onContentCardDismissed.PlaybackStateCompat(priorityQueue);
    }

    public HistoryDataProviderImpl(String str, int i, RecordsFileStorage recordsFileStorage, ExecutorService executorService, int i2) {
        super(str, i, recordsFileStorage, executorService, i2);
    }
}
