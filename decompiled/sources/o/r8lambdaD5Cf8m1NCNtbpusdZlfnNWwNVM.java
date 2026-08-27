package o;

import android.view.ViewGroup;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaD5Cf8m1NCNtbpusdZlfnNWwNVM {
    public static final List RemoteActionCompatParcelizer = Collections.EMPTY_LIST;
    public accessprocessDragStart IconCompatParcelizer;

    public final ViewCompositionStrategy_androidKtExternalSyntheticLambda0 read(int i) {
        Object obj;
        accessprocessDragStart accessprocessdragstart = this.IconCompatParcelizer;
        accessprocessdragstart.getClass();
        int iSerializer = DragGestureNodestartListeningForEvents1.serializer(accessprocessdragstart.IconCompatParcelizer, accessprocessdragstart.serializer, i);
        if (iSerializer < 0 || (obj = accessprocessdragstart.read[iSerializer]) == isInterested.IconCompatParcelizer) {
            obj = null;
        }
        return (ViewCompositionStrategy_androidKtExternalSyntheticLambda0) obj;
    }

    public final void write(ViewCompositionStrategy_androidKtExternalSyntheticLambda0 viewCompositionStrategy_androidKtExternalSyntheticLambda0) {
        accessprocessDragStart accessprocessdragstart = this.IconCompatParcelizer;
        int iWrite = accessprocessdragstart.write();
        while (isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, iWrite) != null) {
            iWrite++;
            if (iWrite == 2147483646) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
                return;
            }
        }
        if (viewCompositionStrategy_androidKtExternalSyntheticLambda0 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("AdapterDelegate is null!");
            return;
        }
        if (iWrite == 2147483646) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        } else if (isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, iWrite) == null) {
            accessprocessdragstart.RemoteActionCompatParcelizer(iWrite, viewCompositionStrategy_androidKtExternalSyntheticLambda0);
        } else {
            DrawableTransformation.read(ff$$ExternalSyntheticOutline0.m(iWrite, "An AdapterDelegate is already registered for the viewType = ", ". Already registered AdapterDelegate is "), isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, iWrite));
        }
    }

    public final void IconCompatParcelizer(Object obj, int i, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, List list) {
        ViewCompositionStrategy_androidKtExternalSyntheticLambda0 viewCompositionStrategy_androidKtExternalSyntheticLambda0 = read(viewHolder.getItemViewType());
        if (viewCompositionStrategy_androidKtExternalSyntheticLambda0 == null) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "No delegate found for item at position = ", " for viewType = ");
            sbM.append(viewHolder.getItemViewType());
            throw new NullPointerException(sbM.toString());
        }
        if (list == null) {
            list = RemoteActionCompatParcelizer;
        }
        viewCompositionStrategy_androidKtExternalSyntheticLambda0.write(obj, i, viewHolder, list);
    }

    public final boolean IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        ViewCompositionStrategy_androidKtExternalSyntheticLambda0 viewCompositionStrategy_androidKtExternalSyntheticLambda0 = read(viewHolder.getItemViewType());
        if (viewCompositionStrategy_androidKtExternalSyntheticLambda0 != null) {
            viewCompositionStrategy_androidKtExternalSyntheticLambda0.IconCompatParcelizer(viewHolder);
            return false;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(viewHolder);
        FieldType$$ExternalSyntheticBUOutline0.write(sb, viewHolder.getAdapterPosition(), viewHolder.getItemViewType());
        return false;
    }

    public final void RemoteActionCompatParcelizer(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        ViewCompositionStrategy_androidKtExternalSyntheticLambda0 viewCompositionStrategy_androidKtExternalSyntheticLambda0 = read(viewHolder.getItemViewType());
        if (viewCompositionStrategy_androidKtExternalSyntheticLambda0 != null) {
            viewCompositionStrategy_androidKtExternalSyntheticLambda0.read(viewHolder);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(viewHolder);
        FieldType$$ExternalSyntheticBUOutline0.write(sb, viewHolder.getAdapterPosition(), viewHolder.getItemViewType());
    }

    public final void read(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        ViewCompositionStrategy_androidKtExternalSyntheticLambda0 viewCompositionStrategy_androidKtExternalSyntheticLambda0 = read(viewHolder.getItemViewType());
        if (viewCompositionStrategy_androidKtExternalSyntheticLambda0 != null) {
            viewCompositionStrategy_androidKtExternalSyntheticLambda0.serializer(viewHolder);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(viewHolder);
        FieldType$$ExternalSyntheticBUOutline0.write(sb, viewHolder.getAdapterPosition(), viewHolder.getItemViewType());
    }

    public final void write(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        ViewCompositionStrategy_androidKtExternalSyntheticLambda0 viewCompositionStrategy_androidKtExternalSyntheticLambda0 = read(viewHolder.getItemViewType());
        if (viewCompositionStrategy_androidKtExternalSyntheticLambda0 != null) {
            viewCompositionStrategy_androidKtExternalSyntheticLambda0.write(viewHolder);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(viewHolder);
        FieldType$$ExternalSyntheticBUOutline0.write(sb, viewHolder.getAdapterPosition(), viewHolder.getItemViewType());
    }

    public final int read(int i, Object obj) {
        accessprocessDragStart accessprocessdragstart = this.IconCompatParcelizer;
        if (obj == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Items datasource is null!");
            return 0;
        }
        int iWrite = accessprocessdragstart.write();
        for (int i2 = 0; i2 < iWrite; i2++) {
            if (((ViewCompositionStrategy_androidKtExternalSyntheticLambda0) accessprocessdragstart.read(i2)).serializer(i, obj)) {
                return accessprocessdragstart.IconCompatParcelizer(i2);
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(obj instanceof List ? "No AdapterDelegate added that matches item=" + ((List) obj).get(i).toString() + " at position=" + i + " in data source" : "No AdapterDelegate added for item at position=" + i + ". items=" + obj);
        return 0;
    }

    public final androidx.recyclerview.widget.RecyclerView.ViewHolder IconCompatParcelizer(ViewGroup viewGroup, int i) {
        ViewCompositionStrategy_androidKtExternalSyntheticLambda0 viewCompositionStrategy_androidKtExternalSyntheticLambda0 = read(i);
        if (viewCompositionStrategy_androidKtExternalSyntheticLambda0 != null) {
            return viewCompositionStrategy_androidKtExternalSyntheticLambda0.read(viewGroup);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "No AdapterDelegate added for ViewType "));
        return null;
    }
}
