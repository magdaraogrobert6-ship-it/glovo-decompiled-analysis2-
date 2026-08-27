package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import io.grpc.Status;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class onRenderProcessGonelambda0 extends RangesKt {
    public final /* synthetic */ markPageFinished read;
    public final RangesKt serializer;

    @Override // kotlin.ranges.RangesKt
    public final void IconCompatParcelizer(getDeclaredMethodQuietly getdeclaredmethodquietly) {
        getPrettyPrintedStringlambda0 getprettyprintedstringlambda0 = getdeclaredmethodquietly.write;
        IdentityHashMap identityHashMap = getprettyprintedstringlambda0.read;
        parseJsonObjectIntoBundle parsejsonobjectintobundle = markPageFinished.IconCompatParcelizer;
        if (identityHashMap.get(parsejsonobjectintobundle) != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("RetryingNameResolver can only be used once to wrap a NameResolver");
            return;
        }
        List list = Collections.EMPTY_LIST;
        getPrettyPrintedStringlambda0 getprettyprintedstringlambda1 = getPrettyPrintedStringlambda0.serializer;
        List list2 = getdeclaredmethodquietly.serializer;
        getDeclaredMethodQuietlylambda1 getdeclaredmethodquietlylambda1 = getdeclaredmethodquietly.IconCompatParcelizer;
        getprettyprintedstringlambda0.getClass();
        parseCustomEventNameFromQueryBundle parsecustomeventnamefromquerybundle = new parseCustomEventNameFromQueryBundle(this.read);
        IdentityHashMap identityHashMap2 = new IdentityHashMap(1);
        identityHashMap2.put(parsejsonobjectintobundle, parsecustomeventnamefromquerybundle);
        for (Map.Entry entry : getprettyprintedstringlambda0.read.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey())) {
                identityHashMap2.put((parseJsonObjectIntoBundle) entry.getKey(), entry.getValue());
            }
        }
        this.serializer.IconCompatParcelizer(new getDeclaredMethodQuietly(list2, new getPrettyPrintedStringlambda0(identityHashMap2), getdeclaredmethodquietlylambda1));
    }

    @Override // kotlin.ranges.RangesKt
    public final void serializer(Status status) {
        this.serializer.serializer(status);
        this.read.MediaDescriptionCompat.execute(new e$$ExternalSyntheticLambda0(13, this));
    }

    public onRenderProcessGonelambda0(markPageFinished markpagefinished, RangesKt rangesKt) {
        this.read = markpagefinished;
        this.serializer = rangesKt;
    }
}
