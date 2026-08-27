package o;

import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getFlushMaxMinutesannotations {
    public static final ArrayList serializer(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            getLongitudeannotations getlongitudeannotations = (getLongitudeannotations) it.next();
            getlongitudeannotations.getClass();
            ClassifiedTransportMode classifiedTransportModeFromEventConstant = ClassifiedTransportMode.fromEventConstant(((r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) getlongitudeannotations.read()).serializer);
            addProperty addproperty = null;
            if (classifiedTransportModeFromEventConstant != null) {
                long jWrite = getlongitudeannotations.write();
                Integer num = ((r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) getlongitudeannotations.read()).read;
                num.getClass();
                long jLongValue = num.longValue();
                Map map = ((r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) getlongitudeannotations.read()).MediaBrowserCompatMediaItem;
                if (map == null) {
                    map = ((r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) getlongitudeannotations.read()).IconCompatParcelizer;
                    map.getClass();
                }
                float f = ((r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) getlongitudeannotations.read()).MediaBrowserCompatMediaItem != null ? 1.0f : 100.0f;
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    byte bByteValue = ((Number) entry.getKey()).byteValue();
                    Number number = (Number) entry.getValue();
                    ClassifiedTransportMode classifiedTransportModeFromEventConstant2 = ClassifiedTransportMode.fromEventConstant(Byte.valueOf(bByteValue));
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = classifiedTransportModeFromEventConstant2 != null ? new onViewAttachedToWindowlambda0(classifiedTransportModeFromEventConstant2, Float.valueOf(number.floatValue() / f)) : null;
                    if (onviewattachedtowindowlambda0 != null) {
                        arrayList3.add(onviewattachedtowindowlambda0);
                    }
                }
                addproperty = new addProperty(jWrite, jLongValue + jWrite, classifiedTransportModeFromEventConstant, onMove.serializer(arrayList3));
            }
            if (addproperty != null) {
                arrayList2.add(addproperty);
            }
        }
        return arrayList2;
    }
}
