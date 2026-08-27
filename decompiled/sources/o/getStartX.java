package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class getStartX extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    public final ColorStateList IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public final Drawable read;
    public final SparseArray serializer;
    public boolean write;

    public final View IconCompatParcelizer(int i) {
        SparseArray sparseArray = this.serializer;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.MediaSessionCompatQueueItem.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }

    public getStartX(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.serializer = sparseArray;
        TextView textView = (TextView) view.findViewById(android.R.id.title);
        sparseArray.put(android.R.id.title, textView);
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        sparseArray.put(com.logistics.rider.glovo.R.id.icon_frame, view.findViewById(com.logistics.rider.glovo.R.id.icon_frame));
        sparseArray.put(android.R.id.icon_frame, view.findViewById(android.R.id.icon_frame));
        this.read = view.getBackground();
        if (textView != null) {
            this.IconCompatParcelizer = textView.getTextColors();
        }
    }
}
