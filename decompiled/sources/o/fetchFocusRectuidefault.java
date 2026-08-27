package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fetchFocusRectuidefault extends View {
    public final /* synthetic */ accessassignFocus3ESFkO8 IconCompatParcelizer;
    public final /* synthetic */ ViewGroup read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fetchFocusRectuidefault(accessassignFocus3ESFkO8 accessassignfocus3esfko8, Context context, ViewGroup viewGroup) {
        super(context);
        this.IconCompatParcelizer = accessassignfocus3esfko8;
        this.read = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        accessassignFocus3ESFkO8 accessassignfocus3esfko8 = this.IconCompatParcelizer;
        ArrayList arrayList = accessassignfocus3esfko8.read;
        Drawable background = this.read.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (accessassignfocus3esfko8.RemoteActionCompatParcelizer == color) {
            return;
        }
        accessassignfocus3esfko8.RemoteActionCompatParcelizer = color;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((accessisProcessingCustomExitp) arrayList.get(size)).serializer(color);
            }
        }
    }
}
