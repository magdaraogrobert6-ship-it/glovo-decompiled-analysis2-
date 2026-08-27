package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseCardView {
    public static void IconCompatParcelizer(relativeLineTo relativelineto, String str, List list, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i) {
        instance_delegatelambda0<getFillTypeRgk1Os> instance_delegatelambda0Var = instance_delegatelambda0.write;
        if ((i & 2) != 0) {
            list = instance_delegatelambda0Var;
        }
        AndroidPathIterator androidPathIterator = relativelineto.MediaSessionCompatQueueItem;
        androidPathIterator.getClass();
        getSegment getsegment = new getSegment((AndroidPathMeasure) androidPathIterator.RemoteActionCompatParcelizer(getTolerance.write(AndroidPathMeasure.class)), str, dragAndDropTargetModifierNode);
        for (addArc addarc : list) {
            getsegment.read.put(addarc.IconCompatParcelizer, addarc.write);
        }
        for (getFillTypeRgk1Os getfilltypergk1os : instance_delegatelambda0Var) {
            getfilltypergk1os.getClass();
            getsegment.serializer.add(getfilltypergk1os);
        }
        relativelineto.MediaDescriptionCompat.add(getsegment.IconCompatParcelizer());
    }

    public static void write(Registry registry, byte[] bArr) {
        long j;
        registry.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = registry.RemoteActionCompatParcelizer;
            int i2 = registry.MediaMetadataCompat;
            int i3 = registry.read;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = registry.serializer;
            RegistryMissingComponentException registryMissingComponentException = registry.IconCompatParcelizer;
            registryMissingComponentException.getClass();
            if (j2 == registryMissingComponentException.size) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("no more bytes");
                return;
            }
            j = registry.serializer;
        } while (registry.serializer(j == -1 ? 0L : j + ((long) (registry.read - registry.MediaMetadataCompat))) != -1);
    }
}
