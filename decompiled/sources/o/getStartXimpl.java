package o;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getStartXimpl extends SortedSet {
    public getHasAdditionOrRemovalimpl IconCompatParcelizer;
    public FirebaseInAppMessagingDisplay.AnonymousClass2 MediaMetadataCompat;
    public TextView RemoteActionCompatParcelizer;
    public TextView read;
    public trimAndShift serializer;
    public ViewGroup write;

    @Override // o.SortedSet
    public final ViewGroup IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.SortedSet
    public final ImageView RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.SortedSet
    public final View.OnClickListener read() {
        return this.MediaMetadataCompat;
    }

    @Override // o.SortedSet
    public final View serializer() {
        return this.write;
    }

    @Override // o.SortedSet
    public final getDiagonalSizeimpl write() {
        return this.RatingCompat;
    }

    @Override // o.SortedSet
    public final ViewTreeObserver.OnGlobalLayoutListener write(HashMap map, FirebaseInAppMessagingDisplay.AnonymousClass2 anonymousClass2) {
        View viewInflate = this.MediaSessionCompatQueueItem.inflate(com.logistics.rider.glovo.R.layout.banner, (ViewGroup) null);
        this.serializer = (trimAndShift) viewInflate.findViewById(com.logistics.rider.glovo.R.id.banner_root);
        this.write = (ViewGroup) viewInflate.findViewById(com.logistics.rider.glovo.R.id.banner_content_root);
        this.RemoteActionCompatParcelizer = (TextView) viewInflate.findViewById(com.logistics.rider.glovo.R.id.banner_body);
        this.IconCompatParcelizer = (getHasAdditionOrRemovalimpl) viewInflate.findViewById(com.logistics.rider.glovo.R.id.banner_image);
        this.read = (TextView) viewInflate.findViewById(com.logistics.rider.glovo.R.id.banner_title);
        internalOnMeasureui internalonmeasureui = this.MediaBrowserCompatMediaItem;
        if (internalonmeasureui.MediaBrowserCompatMediaItem.equals(com.google.firebase.inappmessaging.model.MessageType.BANNER)) {
            getComposeViewContextui getcomposeviewcontextui = (getComposeViewContextui) internalonmeasureui;
            String str = getcomposeviewcontextui.IconCompatParcelizer;
            setParentCompositionContext setparentcompositioncontext = getcomposeviewcontextui.RemoteActionCompatParcelizer;
            setParentCompositionContext setparentcompositioncontext2 = getcomposeviewcontextui.write;
            if (!TextUtils.isEmpty(str)) {
                SortedSet.read(this.write, str);
            }
            getHasAdditionOrRemovalimpl gethasadditionorremovalimpl = this.IconCompatParcelizer;
            onAttachedToWindow onattachedtowindow = getcomposeviewcontextui.read;
            gethasadditionorremovalimpl.setVisibility((onattachedtowindow == null || TextUtils.isEmpty(onattachedtowindow.read)) ? 8 : 0);
            if (setparentcompositioncontext2 != null) {
                String str2 = setparentcompositioncontext2.read;
                String str3 = setparentcompositioncontext2.write;
                if (!TextUtils.isEmpty(str3)) {
                    this.read.setText(str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.read.setTextColor(android.graphics.Color.parseColor(str2));
                }
            }
            if (setparentcompositioncontext != null) {
                String str4 = setparentcompositioncontext.read;
                String str5 = setparentcompositioncontext.write;
                if (!TextUtils.isEmpty(str5)) {
                    this.RemoteActionCompatParcelizer.setText(str5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    this.RemoteActionCompatParcelizer.setTextColor(android.graphics.Color.parseColor(str4));
                }
            }
            getDiagonalSizeimpl getdiagonalsizeimpl = this.RatingCompat;
            int iMin = Math.min(getdiagonalsizeimpl.RemoteActionCompatParcelizer.intValue(), getdiagonalsizeimpl.serializer.intValue());
            ViewGroup.LayoutParams layoutParams = this.serializer.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            layoutParams.width = iMin;
            this.serializer.setLayoutParams(layoutParams);
            this.IconCompatParcelizer.setMaxHeight(getdiagonalsizeimpl.RemoteActionCompatParcelizer());
            this.IconCompatParcelizer.setMaxWidth(getdiagonalsizeimpl.IconCompatParcelizer());
            this.MediaMetadataCompat = anonymousClass2;
            this.serializer.setDismissListener(anonymousClass2);
            this.write.setOnClickListener((View.OnClickListener) map.get(getcomposeviewcontextui.serializer));
        }
        return null;
    }

    public getStartXimpl(getDiagonalSizeimpl getdiagonalsizeimpl, LayoutInflater layoutInflater, internalOnMeasureui internalonmeasureui) {
        super(getdiagonalsizeimpl, layoutInflater, internalonmeasureui);
    }
}
