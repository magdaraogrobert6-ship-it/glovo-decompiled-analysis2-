package o;

import bo.app.wg$$ExternalSyntheticLambda0;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class getLastMeasurementConstraintsmsEJaDkui {
    public static final wg$$ExternalSyntheticLambda0 serializer = new wg$$ExternalSyntheticLambda0(9);
    public int RemoteActionCompatParcelizer;
    public Object write;

    public void serializer(Long l) {
        PriorityQueue priorityQueue = (PriorityQueue) this.write;
        if (priorityQueue.size() < this.RemoteActionCompatParcelizer) {
            priorityQueue.add(l);
            return;
        }
        if (l.longValue() < ((Long) priorityQueue.peek()).longValue()) {
            priorityQueue.poll();
            priorityQueue.add(l);
        }
    }
}
