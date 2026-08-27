package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.v6$$ExternalSyntheticLambda7;
import com.huawei.location.nlp.scan.FB;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class minus implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int read;

    public /* synthetic */ minus(int i) {
        this.read = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.read;
        if (i == 0) {
            List listSerializer = onContentCardDismissed.serializer((List) getRoundKaPHkGw.read.MediaSessionCompatResultReceiverWrapper(), new FocusChangedElement(1));
            ArrayList arrayList = new ArrayList();
            int size = listSerializer.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((obtainTransformShader) listSerializer.get(i2)).getClass();
                arrayList.add(new onViewAttachedToWindowlambda0(new RenderEffectKt(new v6$$ExternalSyntheticLambda7(25)), displayInAppMessagelambda1.serializer(PathDefaultImpls.class)));
            }
            return arrayList;
        }
        if (i == 1) {
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            return MainDispatcherLoader.read.IconCompatParcelizer();
        }
        if (i == 2) {
            return PathSegmentKt.RemoteActionCompatParcelizer();
        }
        List listSerializer2 = onContentCardDismissed.serializer((List) getRoundKaPHkGw.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper(), new FB(6));
        ArrayList arrayList2 = new ArrayList();
        if (listSerializer2.size() <= 0) {
            return arrayList2;
        }
        m1$$ExternalSyntheticOutline0.m(listSerializer2.get(0));
        throw null;
    }
}
