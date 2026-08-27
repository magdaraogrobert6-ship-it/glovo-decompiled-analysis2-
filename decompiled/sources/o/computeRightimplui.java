package o;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class computeRightimplui extends SortedSet {
    public ImageView IconCompatParcelizer;
    public trimAndShift RemoteActionCompatParcelizer;
    public android.widget.Button read;
    public ViewGroup serializer;

    @Override // o.SortedSet
    public final ViewGroup IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.SortedSet
    public final ImageView RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.SortedSet
    public final View serializer() {
        return this.serializer;
    }

    @Override // o.SortedSet
    public final ViewTreeObserver.OnGlobalLayoutListener write(HashMap map, FirebaseInAppMessagingDisplay.AnonymousClass2 anonymousClass2) {
        View viewInflate = this.MediaSessionCompatQueueItem.inflate(com.logistics.rider.glovo.R.layout.image, (ViewGroup) null);
        this.RemoteActionCompatParcelizer = (trimAndShift) viewInflate.findViewById(com.logistics.rider.glovo.R.id.image_root);
        this.serializer = (ViewGroup) viewInflate.findViewById(com.logistics.rider.glovo.R.id.image_content_root);
        this.IconCompatParcelizer = (ImageView) viewInflate.findViewById(com.logistics.rider.glovo.R.id.image_view);
        this.read = (android.widget.Button) viewInflate.findViewById(com.logistics.rider.glovo.R.id.collapse_button);
        ImageView imageView = this.IconCompatParcelizer;
        getDiagonalSizeimpl getdiagonalsizeimpl = this.RatingCompat;
        imageView.setMaxHeight(getdiagonalsizeimpl.RemoteActionCompatParcelizer());
        this.IconCompatParcelizer.setMaxWidth(getdiagonalsizeimpl.IconCompatParcelizer());
        internalOnMeasureui internalonmeasureui = this.MediaBrowserCompatMediaItem;
        if (internalonmeasureui.MediaBrowserCompatMediaItem.equals(com.google.firebase.inappmessaging.model.MessageType.IMAGE_ONLY)) {
            internalOnLayoutui internalonlayoutui = (internalOnLayoutui) internalonmeasureui;
            ImageView imageView2 = this.IconCompatParcelizer;
            onAttachedToWindow onattachedtowindow = internalonlayoutui.read;
            imageView2.setVisibility((onattachedtowindow == null || TextUtils.isEmpty(onattachedtowindow.read)) ? 8 : 0);
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) map.get(internalonlayoutui.RemoteActionCompatParcelizer));
        }
        this.RemoteActionCompatParcelizer.setDismissListener(anonymousClass2);
        this.read.setOnClickListener(anonymousClass2);
        return null;
    }

    public computeRightimplui(getDiagonalSizeimpl getdiagonalsizeimpl, LayoutInflater layoutInflater, internalOnMeasureui internalonmeasureui) {
        super(getdiagonalsizeimpl, layoutInflater, internalonmeasureui);
    }
}
