package o;

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
public final class getStartYimpl extends SortedSet {
    public ScrollView IconCompatParcelizer;
    public setTitle MediaDescriptionCompat;
    public ImageView MediaMetadataCompat;
    public TextView MediaSessionCompatResultReceiverWrapper;
    public TextView ParcelableVolumeInfo;
    public android.widget.Button PlaybackStateCompat;
    public android.widget.Button PlaybackStateCompatCustomAction;
    public FirebaseInAppMessagingDisplay.AnonymousClass2 RemoteActionCompatParcelizer;
    public Absolutevsh68fgdefault read;
    public isTransitionGroup serializer;
    public TouchBoundsExpansionCompanion write;

    @Override // o.SortedSet
    public final ViewGroup IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.SortedSet
    public final ImageView RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    @Override // o.SortedSet
    public final View.OnClickListener read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.SortedSet
    public final View serializer() {
        return this.read;
    }

    @Override // o.SortedSet
    public final getDiagonalSizeimpl write() {
        return this.RatingCompat;
    }

    @Override // o.SortedSet
    public final ViewTreeObserver.OnGlobalLayoutListener write(HashMap map, FirebaseInAppMessagingDisplay.AnonymousClass2 anonymousClass2) {
        getAutoClearFocusBehavior4UtRPd4 getautoclearfocusbehavior4utrpd4;
        String str;
        View viewInflate = this.MediaSessionCompatQueueItem.inflate(com.logistics.rider.glovo.R.layout.card, (ViewGroup) null);
        this.IconCompatParcelizer = (ScrollView) viewInflate.findViewById(com.logistics.rider.glovo.R.id.body_scroll);
        this.PlaybackStateCompatCustomAction = (android.widget.Button) viewInflate.findViewById(com.logistics.rider.glovo.R.id.primary_button);
        this.PlaybackStateCompat = (android.widget.Button) viewInflate.findViewById(com.logistics.rider.glovo.R.id.secondary_button);
        this.MediaMetadataCompat = (ImageView) viewInflate.findViewById(com.logistics.rider.glovo.R.id.image_view);
        this.ParcelableVolumeInfo = (TextView) viewInflate.findViewById(com.logistics.rider.glovo.R.id.message_body);
        this.MediaSessionCompatResultReceiverWrapper = (TextView) viewInflate.findViewById(com.logistics.rider.glovo.R.id.message_title);
        this.write = (TouchBoundsExpansionCompanion) viewInflate.findViewById(com.logistics.rider.glovo.R.id.card_root);
        this.read = (Absolutevsh68fgdefault) viewInflate.findViewById(com.logistics.rider.glovo.R.id.card_content_root);
        internalOnMeasureui internalonmeasureui = this.MediaBrowserCompatMediaItem;
        if (internalonmeasureui.MediaBrowserCompatMediaItem.equals(com.google.firebase.inappmessaging.model.MessageType.CARD)) {
            isTransitionGroup istransitiongroup = (isTransitionGroup) internalonmeasureui;
            setParentCompositionContext setparentcompositioncontext = istransitiongroup.RatingCompat;
            this.serializer = istransitiongroup;
            this.MediaSessionCompatResultReceiverWrapper.setText(setparentcompositioncontext.write);
            this.MediaSessionCompatResultReceiverWrapper.setTextColor(android.graphics.Color.parseColor(setparentcompositioncontext.read));
            setParentCompositionContext setparentcompositioncontext2 = istransitiongroup.RemoteActionCompatParcelizer;
            if (setparentcompositioncontext2 != null && (str = setparentcompositioncontext2.write) != null) {
                this.IconCompatParcelizer.setVisibility(0);
                this.ParcelableVolumeInfo.setVisibility(0);
                this.ParcelableVolumeInfo.setText(str);
                this.ParcelableVolumeInfo.setTextColor(android.graphics.Color.parseColor(setparentcompositioncontext2.read));
            } else {
                this.IconCompatParcelizer.setVisibility(8);
                this.ParcelableVolumeInfo.setVisibility(8);
            }
            isTransitionGroup istransitiongroup2 = this.serializer;
            if (istransitiongroup2.serializer == null && istransitiongroup2.read == null) {
                this.MediaMetadataCompat.setVisibility(8);
            } else {
                this.MediaMetadataCompat.setVisibility(0);
            }
            isTransitionGroup istransitiongroup3 = this.serializer;
            createComposition createcomposition = istransitiongroup3.IconCompatParcelizer;
            createComposition createcomposition2 = istransitiongroup3.MediaMetadataCompat;
            SortedSet.RemoteActionCompatParcelizer(this.PlaybackStateCompatCustomAction, createcomposition.serializer);
            android.widget.Button button = this.PlaybackStateCompatCustomAction;
            View.OnClickListener onClickListener = (View.OnClickListener) map.get(createcomposition);
            if (button != null) {
                button.setOnClickListener(onClickListener);
            }
            this.PlaybackStateCompatCustomAction.setVisibility(0);
            if (createcomposition2 != null && (getautoclearfocusbehavior4utrpd4 = createcomposition2.serializer) != null) {
                SortedSet.RemoteActionCompatParcelizer(this.PlaybackStateCompat, getautoclearfocusbehavior4utrpd4);
                android.widget.Button button2 = this.PlaybackStateCompat;
                View.OnClickListener onClickListener2 = (View.OnClickListener) map.get(createcomposition2);
                if (button2 != null) {
                    button2.setOnClickListener(onClickListener2);
                }
                this.PlaybackStateCompat.setVisibility(0);
            } else {
                this.PlaybackStateCompat.setVisibility(8);
            }
            ImageView imageView = this.MediaMetadataCompat;
            getDiagonalSizeimpl getdiagonalsizeimpl = this.RatingCompat;
            imageView.setMaxHeight(getdiagonalsizeimpl.RemoteActionCompatParcelizer());
            this.MediaMetadataCompat.setMaxWidth(getdiagonalsizeimpl.IconCompatParcelizer());
            this.RemoteActionCompatParcelizer = anonymousClass2;
            this.write.setDismissListener(anonymousClass2);
            SortedSet.read(this.read, this.serializer.write);
        }
        return this.MediaDescriptionCompat;
    }

    public getStartYimpl(getDiagonalSizeimpl getdiagonalsizeimpl, LayoutInflater layoutInflater, internalOnMeasureui internalonmeasureui) {
        super(getdiagonalsizeimpl, layoutInflater, internalonmeasureui);
    }
}
