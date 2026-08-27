package o;

import android.os.Bundle;
import coil3.ComponentRegistry$Builder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 implements getGreen0d7_KjU {
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4(int i, Object obj) {
        this.read = i;
        this.write = obj;
    }

    @Override // o.getGreen0d7_KjU
    public final Bundle saveState() {
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr;
        int i = this.read;
        Object obj = this.write;
        if (i == 0) {
            return androidx.activity.ComponentActivity._init_$lambda$3((androidx.activity.ComponentActivity) obj);
        }
        ComponentRegistry$Builder componentRegistry$Builder = (ComponentRegistry$Builder) obj;
        for (Map.Entry entry : onMove.serializer((LinkedHashMap) componentRegistry$Builder.IconCompatParcelizer).entrySet()) {
            componentRegistry$Builder.RemoteActionCompatParcelizer((String) entry.getKey(), ((MutableStateFlow) entry.getValue()).read());
        }
        for (Map.Entry entry2 : onMove.serializer((LinkedHashMap) componentRegistry$Builder.read).entrySet()) {
            componentRegistry$Builder.RemoteActionCompatParcelizer((String) entry2.getKey(), ((getGreen0d7_KjU) entry2.getValue()).saveState());
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) componentRegistry$Builder.write;
        if (linkedHashMap.isEmpty()) {
            onviewattachedtowindowlambda0Arr = new onViewAttachedToWindowlambda0[0];
        } else {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                arrayList.add(new onViewAttachedToWindowlambda0((String) entry3.getKey(), entry3.getValue()));
            }
            onviewattachedtowindowlambda0Arr = (onViewAttachedToWindowlambda0[]) arrayList.toArray(new onViewAttachedToWindowlambda0[0]);
        }
        Object[] objArr = {(onViewAttachedToWindowlambda0[]) Arrays.copyOf(onviewattachedtowindowlambda0Arr, onviewattachedtowindowlambda0Arr.length)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        return (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320);
    }
}
