package o;

import android.view.ViewGroup;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs extends androidx.recyclerview.widget.RecyclerView.Adapter {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final r8lambdaD5Cf8m1NCNtbpusdZlfnNWwNVM IconCompatParcelizer;
    public final accessgetSaturationcp write;

    public r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs() {
        this(new r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms(1));
        this.IconCompatParcelizer.write(new installForLifecyclelambda1(new DefaultContentCardView(12), new addLayers(3), new NafathLogger$$ExternalSyntheticLambda0(14), addImageToStyle.IconCompatParcelizer));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = serializer + 49;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(viewHolder);
            return;
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(viewHolder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = serializer + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer.write(viewHolder);
        int i4 = serializer + 11;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = serializer + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer.read(viewHolder);
        int i4 = RemoteActionCompatParcelizer + 53;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return this.IconCompatParcelizer.IconCompatParcelizer(viewGroup, i);
        }
        this.IconCompatParcelizer.IconCompatParcelizer(viewGroup, i);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer.IconCompatParcelizer(viewHolder);
        int i4 = RemoteActionCompatParcelizer + 73;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int i = 2 % 2;
        int i2 = serializer + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int size = this.write.MediaDescriptionCompat.size();
        int i4 = RemoteActionCompatParcelizer + 1;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 79;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.IconCompatParcelizer.read(i, this.write.MediaDescriptionCompat);
        int i6 = serializer + 109;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 61;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            this.IconCompatParcelizer.IconCompatParcelizer(this.write.MediaDescriptionCompat, i, viewHolder, null);
        } else {
            this.IconCompatParcelizer.IconCompatParcelizer(this.write.MediaDescriptionCompat, i, viewHolder, null);
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, List list) {
        int i2 = 2 % 2;
        int i3 = serializer + 85;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            this.IconCompatParcelizer.IconCompatParcelizer(this.write.MediaDescriptionCompat, i, viewHolder, list);
        } else {
            this.IconCompatParcelizer.IconCompatParcelizer(this.write.MediaDescriptionCompat, i, viewHolder, list);
            throw null;
        }
    }

    public r8lambdaGywMIYpDgDzbHIY16F9IhdMRYs(r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms r8lambdasmzfgeuuamx3jlwu4onmm8pfms) {
        r8lambdaD5Cf8m1NCNtbpusdZlfnNWwNVM r8lambdad5cf8m1ncntbpusdzlfnnwwnvm = new r8lambdaD5Cf8m1NCNtbpusdZlfnNWwNVM();
        r8lambdad5cf8m1ncntbpusdzlfnnwwnvm.IconCompatParcelizer = new accessprocessDragStart(0);
        this.write = new accessgetSaturationcp(this, r8lambdasmzfgeuuamx3jlwu4onmm8pfms);
        this.IconCompatParcelizer = r8lambdad5cf8m1ncntbpusdzlfnnwwnvm;
    }
}
