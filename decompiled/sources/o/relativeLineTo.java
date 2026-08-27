package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class relativeLineTo extends moveTo {
    public final ArrayList MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final AndroidPathIterator MediaSessionCompatQueueItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public relativeLineTo(AndroidPathIterator androidPathIterator, String str) {
        super(androidPathIterator.RemoteActionCompatParcelizer(getTolerance.write(rewind.class)), null);
        androidPathIterator.getClass();
        str.getClass();
        this.MediaDescriptionCompat = new ArrayList();
        this.MediaSessionCompatQueueItem = androidPathIterator;
        this.MediaMetadataCompat = str;
    }

    public final relativeQuadraticTo read() {
        relativeQuadraticTo relativequadraticto = (relativeQuadraticTo) super.IconCompatParcelizer();
        ArrayList<opN5in7k0> arrayList = this.MediaDescriptionCompat;
        arrayList.getClass();
        androidx.recyclerview.widget.ChildHelper childHelper = relativequadraticto.IconCompatParcelizer;
        childHelper.getClass();
        for (opN5in7k0 opn5in7k0 : arrayList) {
            if (opn5in7k0 != null) {
                childHelper.serializer(opn5in7k0);
            }
        }
        String str = this.MediaMetadataCompat;
        if (str != null) {
            childHelper.IconCompatParcelizer(str);
            return relativequadraticto;
        }
        if (this.write != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("You must set a start destination route");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("You must set a start destination id");
        return null;
    }
}
