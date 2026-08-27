package o;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class computeLeftimplui extends SortedSet {
    public ImageView IconCompatParcelizer;
    public TextView MediaDescriptionCompat;
    public TextView MediaMetadataCompat;
    public Absolutevsh68fg ParcelableVolumeInfo;
    public ViewGroup PlaybackStateCompat;
    public onRtlPropertiesChanged PlaybackStateCompatCustomAction;
    public android.widget.Button RemoteActionCompatParcelizer;
    public setTitle read;
    public ScrollView serializer;
    public View write;

    @Override // o.SortedSet
    public final ViewGroup IconCompatParcelizer() {
        return this.ParcelableVolumeInfo;
    }

    @Override // o.SortedSet
    public final ImageView RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.SortedSet
    public final View serializer() {
        return this.PlaybackStateCompat;
    }

    @Override // o.SortedSet
    public final getDiagonalSizeimpl write() {
        return this.RatingCompat;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00dd  */
    @Override // o.SortedSet
    public final ViewTreeObserver.OnGlobalLayoutListener write(HashMap map, FirebaseInAppMessagingDisplay.AnonymousClass2 anonymousClass2) {
        getAutoClearFocusBehavior4UtRPd4 getautoclearfocusbehavior4utrpd4;
        View viewInflate = this.MediaSessionCompatQueueItem.inflate(com.logistics.rider.glovo.R.layout.modal, (ViewGroup) null);
        this.serializer = (ScrollView) viewInflate.findViewById(com.logistics.rider.glovo.R.id.body_scroll);
        this.RemoteActionCompatParcelizer = (android.widget.Button) viewInflate.findViewById(com.logistics.rider.glovo.R.id.button);
        this.write = viewInflate.findViewById(com.logistics.rider.glovo.R.id.collapse_button);
        this.IconCompatParcelizer = (ImageView) viewInflate.findViewById(com.logistics.rider.glovo.R.id.image_view);
        this.MediaDescriptionCompat = (TextView) viewInflate.findViewById(com.logistics.rider.glovo.R.id.message_body);
        this.MediaMetadataCompat = (TextView) viewInflate.findViewById(com.logistics.rider.glovo.R.id.message_title);
        this.ParcelableVolumeInfo = (Absolutevsh68fg) viewInflate.findViewById(com.logistics.rider.glovo.R.id.modal_root);
        this.PlaybackStateCompat = (ViewGroup) viewInflate.findViewById(com.logistics.rider.glovo.R.id.modal_content_root);
        internalOnMeasureui internalonmeasureui = this.MediaBrowserCompatMediaItem;
        if (internalonmeasureui.MediaBrowserCompatMediaItem.equals(com.google.firebase.inappmessaging.model.MessageType.MODAL)) {
            onRtlPropertiesChanged onrtlpropertieschanged = (onRtlPropertiesChanged) internalonmeasureui;
            this.PlaybackStateCompatCustomAction = onrtlpropertieschanged;
            onAttachedToWindow onattachedtowindow = onrtlpropertieschanged.write;
            setParentCompositionContext setparentcompositioncontext = onrtlpropertieschanged.RemoteActionCompatParcelizer;
            setParentCompositionContext setparentcompositioncontext2 = onrtlpropertieschanged.IconCompatParcelizer;
            if (onattachedtowindow != null && !TextUtils.isEmpty(onattachedtowindow.read)) {
                this.IconCompatParcelizer.setVisibility(0);
            } else {
                this.IconCompatParcelizer.setVisibility(8);
            }
            if (setparentcompositioncontext2 != null) {
                String str = setparentcompositioncontext2.read;
                String str2 = setparentcompositioncontext2.write;
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                TextView textView = this.MediaMetadataCompat;
                if (!zIsEmpty) {
                    textView.setVisibility(0);
                    this.MediaMetadataCompat.setText(str2);
                } else {
                    textView.setVisibility(8);
                }
                if (!TextUtils.isEmpty(str)) {
                    this.MediaMetadataCompat.setTextColor(android.graphics.Color.parseColor(str));
                }
            }
            if (setparentcompositioncontext != null) {
                String str3 = setparentcompositioncontext.write;
                if (!TextUtils.isEmpty(str3)) {
                    this.serializer.setVisibility(0);
                    this.MediaDescriptionCompat.setVisibility(0);
                    this.MediaDescriptionCompat.setTextColor(android.graphics.Color.parseColor(setparentcompositioncontext.read));
                    this.MediaDescriptionCompat.setText(str3);
                } else {
                    this.serializer.setVisibility(8);
                    this.MediaDescriptionCompat.setVisibility(8);
                }
            } else {
                this.serializer.setVisibility(8);
                this.MediaDescriptionCompat.setVisibility(8);
            }
            createComposition createcomposition = this.PlaybackStateCompatCustomAction.read;
            if (createcomposition != null && (getautoclearfocusbehavior4utrpd4 = createcomposition.serializer) != null && !TextUtils.isEmpty(getautoclearfocusbehavior4utrpd4.write.write)) {
                SortedSet.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getautoclearfocusbehavior4utrpd4);
                android.widget.Button button = this.RemoteActionCompatParcelizer;
                View.OnClickListener onClickListener = (View.OnClickListener) map.get(this.PlaybackStateCompatCustomAction.read);
                if (button != null) {
                    button.setOnClickListener(onClickListener);
                }
                this.RemoteActionCompatParcelizer.setVisibility(0);
            } else {
                this.RemoteActionCompatParcelizer.setVisibility(8);
            }
            ImageView imageView = this.IconCompatParcelizer;
            getDiagonalSizeimpl getdiagonalsizeimpl = this.RatingCompat;
            imageView.setMaxHeight(getdiagonalsizeimpl.RemoteActionCompatParcelizer());
            this.IconCompatParcelizer.setMaxWidth(getdiagonalsizeimpl.IconCompatParcelizer());
            this.write.setOnClickListener(anonymousClass2);
            this.ParcelableVolumeInfo.setDismissListener(anonymousClass2);
            SortedSet.read(this.PlaybackStateCompat, this.PlaybackStateCompatCustomAction.serializer);
        }
        return this.read;
    }

    public computeLeftimplui(getDiagonalSizeimpl getdiagonalsizeimpl, LayoutInflater layoutInflater, internalOnMeasureui internalonmeasureui) {
        super(getdiagonalsizeimpl, layoutInflater, internalonmeasureui);
    }
}
