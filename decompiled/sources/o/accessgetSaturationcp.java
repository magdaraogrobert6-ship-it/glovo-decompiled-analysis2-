package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetSaturationcp {
    public static final accessgetScreencp write = new accessgetScreencp();
    public final accessgetScreencp IconCompatParcelizer;
    public List MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final getPlus0nO6VwU RatingCompat;
    public final verticalGradient8A3gB4 RemoteActionCompatParcelizer;
    public final CopyOnWriteArrayList read;
    public List serializer;

    public accessgetSaturationcp(r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs r8lambdagywmiypdgdzbhiy16f9ihdmrys, r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms r8lambdasmzfgeuuamx3jlwu4onmm8pfms) {
        getPlus0nO6VwU getplus0no6vwu = new getPlus0nO6VwU(r8lambdagywmiypdgdzbhiy16f9ihdmrys);
        synchronized (accessgetMultiplycp.RemoteActionCompatParcelizer) {
            if (accessgetMultiplycp.write == null) {
                accessgetMultiplycp.write = Executors.newFixedThreadPool(2);
            }
        }
        ExecutorService executorService = accessgetMultiplycp.write;
        verticalGradient8A3gB4 verticalgradient8a3gb4 = new verticalGradient8A3gB4();
        verticalgradient8a3gb4.read = executorService;
        verticalgradient8a3gb4.RemoteActionCompatParcelizer = r8lambdasmzfgeuuamx3jlwu4onmm8pfms;
        this.read = new CopyOnWriteArrayList();
        this.MediaDescriptionCompat = Collections.EMPTY_LIST;
        this.RatingCompat = getplus0no6vwu;
        this.RemoteActionCompatParcelizer = verticalgradient8a3gb4;
        this.IconCompatParcelizer = write;
    }

    public final void IconCompatParcelizer(Runnable runnable) {
        Iterator it = this.read.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void IconCompatParcelizer(List list, e$$ExternalSyntheticLambda0 e__externalsyntheticlambda0) {
        int i = this.MediaMetadataCompat + 1;
        this.MediaMetadataCompat = i;
        List list2 = this.serializer;
        if (list == list2) {
            if (e__externalsyntheticlambda0 != null) {
                e__externalsyntheticlambda0.run();
                return;
            }
            return;
        }
        getPlus0nO6VwU getplus0no6vwu = this.RatingCompat;
        if (list == null) {
            int size = list2.size();
            this.serializer = null;
            this.MediaDescriptionCompat = Collections.EMPTY_LIST;
            getplus0no6vwu.IconCompatParcelizer(0, size);
            IconCompatParcelizer(e__externalsyntheticlambda0);
            return;
        }
        if (list2 != null) {
            ((Executor) this.RemoteActionCompatParcelizer.read).execute(new AndroidCanvas(this, list2, list, i, e__externalsyntheticlambda0));
            return;
        }
        this.serializer = list;
        this.MediaDescriptionCompat = Collections.unmodifiableList(list);
        getplus0no6vwu.write(0, list.size());
        IconCompatParcelizer(e__externalsyntheticlambda0);
    }
}
