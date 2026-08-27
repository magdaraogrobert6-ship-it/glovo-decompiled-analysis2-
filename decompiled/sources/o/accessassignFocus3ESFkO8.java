package o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class accessassignFocus3ESFkO8 {
    public setRight IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final ArrayList read = new ArrayList();
    public final fetchFocusRectuidefault serializer;
    public setRight write;

    public accessassignFocus3ESFkO8(ViewGroup viewGroup) {
        View childAt;
        setRight setright = setRight.IconCompatParcelizer;
        this.write = setright;
        this.IconCompatParcelizer = setright;
        Drawable background = viewGroup.getBackground();
        this.RemoteActionCompatParcelizer = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        fetchFocusRectuidefault fetchfocusrectuidefault = new fetchFocusRectuidefault(this, viewGroup.getContext(), viewGroup);
        this.serializer = fetchfocusrectuidefault;
        fetchfocusrectuidefault.setVisibility(8);
        fetchfocusrectuidefault.setWillNotDraw(true);
        StreamSharing$$ExternalSyntheticLambda0 streamSharing$$ExternalSyntheticLambda0 = new StreamSharing$$ExternalSyntheticLambda0(18, this);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        accessgetCancelcp.write(fetchfocusrectuidefault, streamSharing$$ExternalSyntheticLambda0);
        FocusPropertiesNode.read(fetchfocusrectuidefault, new accesssetProcessingCustomExitp(this));
        int childCount = viewGroup.getChildCount();
        do {
            childCount--;
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
        } while (childAt.isAttachedToWindow() == viewGroup.isAttachedToWindow());
        if (childAt == null) {
            viewGroup.addView(fetchfocusrectuidefault, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new assignFocus3ESFkO8(viewGroup, fetchfocusrectuidefault));
        }
    }
}
