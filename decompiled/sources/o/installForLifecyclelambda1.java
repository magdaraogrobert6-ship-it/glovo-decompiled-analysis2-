package o;

import android.view.ViewGroup;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class installForLifecyclelambda1 extends ViewCompositionStrategy_androidKtExternalSyntheticLambda0 {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 read;
    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY serializer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    @Override // o.ViewCompositionStrategy_androidKtExternalSyntheticLambda0
    public final boolean serializer(int i, Object obj) {
        List list = (List) obj;
        return ((Boolean) this.serializer.invoke(list.get(i), list, Integer.valueOf(i))).booleanValue();
    }

    @Override // o.ViewCompositionStrategy_androidKtExternalSyntheticLambda0
    public final void write(Object obj, int i, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, List list) {
        Object obj2 = ((List) obj).get(i);
        installForLifecycle installforlifecycle = (installForLifecycle) viewHolder;
        installforlifecycle.getClass();
        list.getClass();
        if (obj2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("null cannot be cast to non-null type kotlin.Any");
            return;
        }
        installforlifecycle.RemoteActionCompatParcelizer = obj2;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = installforlifecycle.write;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
            return;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list);
    }

    public installForLifecyclelambda1(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // o.ViewCompositionStrategy_androidKtExternalSyntheticLambda0
    public final void IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
    }

    @Override // o.ViewCompositionStrategy_androidKtExternalSyntheticLambda0
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder read(ViewGroup viewGroup) {
        viewGroup.getClass();
        installForLifecycle installforlifecycle = new installForLifecycle((accessgetPositiveInfinitycp) this.read.invoke(this.RemoteActionCompatParcelizer.invoke(viewGroup), viewGroup));
        this.write.invoke(installforlifecycle);
        return installforlifecycle;
    }

    @Override // o.ViewCompositionStrategy_androidKtExternalSyntheticLambda0
    public final void read(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
    }

    @Override // o.ViewCompositionStrategy_androidKtExternalSyntheticLambda0
    public final void serializer(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
    }

    @Override // o.ViewCompositionStrategy_androidKtExternalSyntheticLambda0
    public final void write(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
    }
}
