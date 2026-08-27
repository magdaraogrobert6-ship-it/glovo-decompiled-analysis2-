package o;

import android.view.ViewGroup;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.ui.common.widget.chooseoption.entity.SelectionMode;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdai_bKyus5xY50_p3euqtSxFzYhbs extends androidx.recyclerview.widget.RecyclerView.Adapter {
    public r8lambdaD5Cf8m1NCNtbpusdZlfnNWwNVM RemoteActionCompatParcelizer;
    public Object write;

    public final void read(List list) {
        this.write = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.RemoteActionCompatParcelizer.read(i, this.write);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.write, i, viewHolder, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        this.RemoteActionCompatParcelizer.write(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        this.RemoteActionCompatParcelizer.read(viewHolder);
    }

    public r8lambdai_bKyus5xY50_p3euqtSxFzYhbs(SelectionMode selectionMode, GetAppStateImpl getAppStateImpl) {
        selectionMode.getClass();
        getAppStateImpl.getClass();
        ViewCompositionStrategy_androidKtExternalSyntheticLambda0[] viewCompositionStrategy_androidKtExternalSyntheticLambda0Arr = {new DataStoreUtilse(selectionMode, getAppStateImpl)};
        r8lambdaD5Cf8m1NCNtbpusdZlfnNWwNVM r8lambdad5cf8m1ncntbpusdzlfnnwwnvm = new r8lambdaD5Cf8m1NCNtbpusdZlfnNWwNVM();
        r8lambdad5cf8m1ncntbpusdzlfnnwwnvm.IconCompatParcelizer = new accessprocessDragStart(0);
        r8lambdad5cf8m1ncntbpusdzlfnnwwnvm.write(viewCompositionStrategy_androidKtExternalSyntheticLambda0Arr[0]);
        this.RemoteActionCompatParcelizer = r8lambdad5cf8m1ncntbpusdzlfnnwwnvm;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Object obj = this.write;
        if (obj == null) {
            return 0;
        }
        return ((List) obj).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, List list) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.write, i, viewHolder, list);
    }
}
