package androidx.camera.video;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import androidx.camera.core.ImageCapture$Metadata;
import com.mapbox.search.record.HistoryRecord;
import java.util.Comparator;
import java.util.Map;
import o.AuthenticatorUtils;
import o.LruCache;
import o.Preview3AThreadCrashQuirk;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class VideoCapture$$ExternalSyntheticLambda5 implements Comparator {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ VideoCapture$$ExternalSyntheticLambda5(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.IconCompatParcelizer;
        Object obj3 = this.serializer;
        if (i == 0) {
            Rect rect = (Rect) obj3;
            Size size = (Size) obj;
            Size size2 = (Size) obj2;
            return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
        if (i == 1) {
            Preview3AThreadCrashQuirk preview3AThreadCrashQuirk = (Preview3AThreadCrashQuirk) obj2;
            ((ImageCapture$Metadata) obj3).getClass();
            Class cls = ((Preview3AThreadCrashQuirk) obj).serializer.MediaDescriptionCompat;
            int i2 = cls == MediaCodec.class ? 2 : (cls == AuthenticatorUtils.class || cls == LruCache.class) ? 0 : 1;
            Class cls2 = preview3AThreadCrashQuirk.serializer.MediaDescriptionCompat;
            return i2 - (cls2 != MediaCodec.class ? (cls2 == AuthenticatorUtils.class || cls2 == LruCache.class) ? 0 : 1 : 2);
        }
        if (i != 2) {
            for (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm : (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM[]) obj3) {
                int iRemoteActionCompatParcelizer = setNativeShader.RemoteActionCompatParcelizer((Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj), (Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj2));
                if (iRemoteActionCompatParcelizer != 0) {
                    return iRemoteActionCompatParcelizer;
                }
            }
            return 0;
        }
        Map map = (Map) obj3;
        HistoryRecord historyRecord = (HistoryRecord) obj;
        HistoryRecord historyRecord2 = (HistoryRecord) obj2;
        int i3 = removeNodeAtDepth.read(historyRecord2.timestamp, historyRecord.timestamp);
        if (i3 != 0) {
            return i3;
        }
        Integer num = (Integer) map.get(historyRecord);
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = (Integer) map.get(historyRecord2);
        return removeNodeAtDepth.serializer(num2 != null ? num2.intValue() : -1, iIntValue);
    }
}
