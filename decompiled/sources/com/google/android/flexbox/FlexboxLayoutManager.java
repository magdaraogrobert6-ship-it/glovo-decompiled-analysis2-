package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import o.BlockGraphicsLayerElement;
import o.BlockGraphicsLayerModifier;
import o.IconCompatParcelizer;
import o.accessgetMediaRecordcp;
import o.accessgetMediaRewindcp;
import o.accessgetMediaSkipBackwardcp;
import o.accessgetMediaSkipForwardcp;
import o.applyToPq9zytI;
import o.getIntrinsicSizeNHjbRc;
import o.getSoftlight0nO6VwU;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes4.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements accessgetMediaSkipForwardcp, applyToPq9zytI {
    public static final Rect read = new Rect();
    public View ComponentActivity;
    public final int IconCompatParcelizer;
    public final DeltaDecoder MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public int MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public accessgetMediaRecordcp PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public final AnchorInfo RemoteActionCompatParcelizer;
    public getSoftlight0nO6VwU ResultReceiver;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public SavedState r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final SparseArray r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public getIntrinsicSizeNHjbRc r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public RecyclerView.Recycler r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public getSoftlight0nO6VwU r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public int serializer;
    public final Context write;
    public final int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = -1;
    public List MediaBrowserCompatMediaItem = new ArrayList();
    public final accessgetMediaRewindcp MediaSessionCompatQueueItem = new accessgetMediaRewindcp(this);

    public final class AnchorInfo {
        public int IconCompatParcelizer;
        public int MediaBrowserCompatMediaItem;
        public boolean RatingCompat;
        public int RemoteActionCompatParcelizer = 0;
        public boolean read;
        public boolean serializer;
        public int write;

        public static void read(AnchorInfo anchorInfo) {
            anchorInfo.MediaBrowserCompatMediaItem = -1;
            anchorInfo.IconCompatParcelizer = -1;
            anchorInfo.write = Integer.MIN_VALUE;
            anchorInfo.RatingCompat = false;
            anchorInfo.serializer = false;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            boolean z = flexboxLayoutManager.read();
            int i = flexboxLayoutManager.MediaMetadataCompat;
            if (z) {
                if (i == 0) {
                    anchorInfo.read = flexboxLayoutManager.RatingCompat == 1;
                    return;
                } else {
                    anchorInfo.read = i == 2;
                    return;
                }
            }
            if (i == 0) {
                anchorInfo.read = flexboxLayoutManager.RatingCompat == 3;
            } else {
                anchorInfo.read = i == 2;
            }
        }

        public static void serializer(AnchorInfo anchorInfo) {
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (!flexboxLayoutManager.read() && flexboxLayoutManager.MediaSessionCompatToken) {
                anchorInfo.write = anchorInfo.read ? flexboxLayoutManager.ResultReceiver.write() : flexboxLayoutManager.menuHostHelperlambda0 - flexboxLayoutManager.ResultReceiver.IconCompatParcelizer();
                return;
            }
            boolean z = anchorInfo.read;
            getSoftlight0nO6VwU getsoftlight0no6vwu = flexboxLayoutManager.ResultReceiver;
            anchorInfo.write = z ? getsoftlight0no6vwu.write() : getsoftlight0no6vwu.IconCompatParcelizer();
        }

        public AnchorInfo() {
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.MediaBrowserCompatMediaItem);
            sb.append(", mFlexLinePosition=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", mCoordinate=");
            sb.append(this.write);
            sb.append(", mPerpendicularCoordinate=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.read);
            sb.append(", mValid=");
            sb.append(this.RatingCompat);
            sb.append(", mAssignedFromSavedState=");
            return IconCompatParcelizer.IconCompatParcelizer(sb, this.serializer, '}');
        }
    }

    public static class LayoutParams extends BlockGraphicsLayerElement implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator() { // from class: com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.1
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LayoutParams[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.RatingCompat = 0.0f;
                layoutParams.MediaSessionCompatQueueItem = 1.0f;
                layoutParams.write = -1;
                layoutParams.RemoteActionCompatParcelizer = -1.0f;
                layoutParams.MediaDescriptionCompat = 16777215;
                layoutParams.MediaBrowserCompatMediaItem = 16777215;
                layoutParams.RatingCompat = parcel.readFloat();
                layoutParams.MediaSessionCompatQueueItem = parcel.readFloat();
                layoutParams.write = parcel.readInt();
                layoutParams.RemoteActionCompatParcelizer = parcel.readFloat();
                layoutParams.MediaSessionCompatResultReceiverWrapper = parcel.readInt();
                layoutParams.PlaybackStateCompatCustomAction = parcel.readInt();
                layoutParams.MediaDescriptionCompat = parcel.readInt();
                layoutParams.MediaBrowserCompatMediaItem = parcel.readInt();
                layoutParams.MediaSessionCompatToken = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            }
        };
        public int MediaBrowserCompatMediaItem;
        public int MediaDescriptionCompat;
        public float MediaSessionCompatQueueItem;
        public int MediaSessionCompatResultReceiverWrapper;
        public boolean MediaSessionCompatToken;
        public int PlaybackStateCompatCustomAction;
        public float RatingCompat;
        public float RemoteActionCompatParcelizer;
        public int write;

        @Override // com.google.android.flexbox.FlexItem
        public final float IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaBrowserCompatMediaItem() {
            return this.MediaBrowserCompatMediaItem;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaDescriptionCompat() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaMetadataCompat() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaSessionCompatQueueItem() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaSessionCompatResultReceiverWrapper() {
            return this.MediaSessionCompatResultReceiverWrapper;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int MediaSessionCompatToken() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int ParcelableVolumeInfo() {
            return this.MediaDescriptionCompat;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int PlaybackStateCompat() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int PlaybackStateCompatCustomAction() {
            return this.PlaybackStateCompatCustomAction;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int RatingCompat() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float RemoteActionCompatParcelizer() {
            return this.RatingCompat;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean ResultReceiver() {
            return this.MediaSessionCompatToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int read() {
            return this.write;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void read(int i) {
            this.PlaybackStateCompatCustomAction = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int serializer() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void serializer(int i) {
            this.MediaSessionCompatResultReceiverWrapper = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float write() {
            return this.MediaSessionCompatQueueItem;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.RatingCompat);
            parcel.writeFloat(this.MediaSessionCompatQueueItem);
            parcel.writeInt(this.write);
            parcel.writeFloat(this.RemoteActionCompatParcelizer);
            parcel.writeInt(this.MediaSessionCompatResultReceiverWrapper);
            parcel.writeInt(this.PlaybackStateCompatCustomAction);
            parcel.writeInt(this.MediaDescriptionCompat);
            parcel.writeInt(this.MediaBrowserCompatMediaItem);
            parcel.writeByte(this.MediaSessionCompatToken ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() { // from class: com.google.android.flexbox.FlexboxLayoutManager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.RemoteActionCompatParcelizer = parcel.readInt();
                savedState.read = parcel.readInt();
                return savedState;
            }
        };
        public int RemoteActionCompatParcelizer;
        public int read;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.RemoteActionCompatParcelizer);
            parcel.writeInt(this.read);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", mAnchorOffset=");
            return af$$ExternalSyntheticOutline0.m(sb, this.read, '}');
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int IconCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaBrowserCompatMediaItem(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(int i, int i2) {
        MediaDescriptionCompat(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int MediaDescriptionCompat(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return RatingCompat(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int MediaSessionCompatQueueItem(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return RatingCompat(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean PlaybackStateCompatCustomAction() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void RemoteActionCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = -1;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = Integer.MIN_VALUE;
        this.serializer = -1;
        AnchorInfo.read(this.RemoteActionCompatParcelizer);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.clear();
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int getAlignContent() {
        return 5;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int getAlignItems() {
        return this.IconCompatParcelizer;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int getFlexDirection() {
        return this.RatingCompat;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final List getFlexLinesInternal() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int getFlexWrap() {
        return this.MediaMetadataCompat;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int getMaxLine() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int read(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaMetadataCompat(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(int i, int i2) {
        MediaDescriptionCompat(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(RecyclerView recyclerView) {
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final boolean read() {
        int i = this.RatingCompat;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int serializer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaMetadataCompat(getintrinsicsizenhjbrc);
    }

    public final View serializer(int i) {
        View viewMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(0, r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), i);
        if (viewMediaSessionCompatQueueItem == null) {
            return null;
        }
        int i2 = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer[RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatQueueItem)];
        if (i2 == -1) {
            return null;
        }
        return read(viewMediaSessionCompatQueueItem, (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean serializer(BlockGraphicsLayerElement blockGraphicsLayerElement) {
        return blockGraphicsLayerElement instanceof LayoutParams;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final void setFlexLines(List list) {
        this.MediaBrowserCompatMediaItem = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int write(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaBrowserCompatMediaItem(getintrinsicsizenhjbrc);
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final View write(int i) {
        return read(i);
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final void write(accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(RecyclerView recyclerView, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.MediaSessionCompatResultReceiverWrapper = i;
        write(linearSmoothScroller);
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final void RemoteActionCompatParcelizer(int i, View view) {
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.put(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final BlockGraphicsLayerElement generateLayoutParams(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.RatingCompat = 0.0f;
        layoutParams.MediaSessionCompatQueueItem = 1.0f;
        layoutParams.write = -1;
        layoutParams.RemoteActionCompatParcelizer = -1.0f;
        layoutParams.MediaDescriptionCompat = 16777215;
        layoutParams.MediaBrowserCompatMediaItem = 16777215;
        return layoutParams;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int getFlexItemCount() {
        return this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.serializer();
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int getLargestMainSize() {
        if (this.MediaBrowserCompatMediaItem.size() == 0) {
            return 0;
        }
        int size = this.MediaBrowserCompatMediaItem.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i)).MediaSessionCompatResultReceiverWrapper);
        }
        return iMax;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int getSumOfCrossSize() {
        int size = this.MediaBrowserCompatMediaItem.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i2)).write;
        }
        return i;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int read(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.write(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, i2, i3, MediaBrowserCompatMediaItem());
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final View read(int i) {
        View view = (View) this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.get(i);
        return view != null ? view : this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.tryGetViewHolderForPositionByDeadline(i, Long.MAX_VALUE).MediaSessionCompatQueueItem;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int serializer(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.write(this.menuHostHelperlambda0, this.getSavedStateRegistryControllerannotations, i2, i3, RatingCompat());
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final void serializer(View view, int i, int i2, accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp) {
        serializer(view, read);
        if (read()) {
            int i3 = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.left + ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.right;
            accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper += i3;
            accessgetmediaskipbackwardcp.IconCompatParcelizer += i3;
        } else {
            int i4 = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.top + ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.bottom;
            accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper += i4;
            accessgetmediaskipbackwardcp.IconCompatParcelizer += i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01e4  */
    public final int write(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        int i2;
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0 && i != 0) {
            RemoteActionCompatParcelizer();
            this.PlaybackStateCompat.MediaBrowserCompatMediaItem = true;
            boolean z = !read() && this.MediaSessionCompatToken;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int iAbs = Math.abs(i);
            this.PlaybackStateCompat.write = i3;
            boolean z2 = read();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.menuHostHelperlambda0, this.getSavedStateRegistryControllerannotations);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
            boolean z3 = !z2 && this.MediaSessionCompatToken;
            accessgetMediaRewindcp accessgetmediarewindcp = this.MediaSessionCompatQueueItem;
            if (i3 == 1) {
                View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1);
                if (viewMediaSessionCompatResultReceiverWrapper != null) {
                    this.PlaybackStateCompat.MediaSessionCompatQueueItem = this.ResultReceiver.write(viewMediaSessionCompatResultReceiverWrapper);
                    int iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
                    View viewSerializer = serializer(viewMediaSessionCompatResultReceiverWrapper, (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(accessgetmediarewindcp.RemoteActionCompatParcelizer[iRemoteActionCompatParcelizer]));
                    accessgetMediaRecordcp accessgetmediarecordcp = this.PlaybackStateCompat;
                    accessgetmediarecordcp.getClass();
                    int i4 = iRemoteActionCompatParcelizer + 1;
                    accessgetmediarecordcp.MediaMetadataCompat = i4;
                    int[] iArr = accessgetmediarewindcp.RemoteActionCompatParcelizer;
                    if (iArr.length <= i4) {
                        accessgetmediarecordcp.IconCompatParcelizer = -1;
                    } else {
                        accessgetmediarecordcp.IconCompatParcelizer = iArr[i4];
                    }
                    getSoftlight0nO6VwU getsoftlight0no6vwu = this.ResultReceiver;
                    if (z3) {
                        accessgetmediarecordcp.MediaSessionCompatQueueItem = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewSerializer);
                        this.PlaybackStateCompat.MediaDescriptionCompat = this.ResultReceiver.IconCompatParcelizer() + (-this.ResultReceiver.RemoteActionCompatParcelizer(viewSerializer));
                        accessgetMediaRecordcp accessgetmediarecordcp2 = this.PlaybackStateCompat;
                        accessgetmediarecordcp2.MediaDescriptionCompat = Math.max(accessgetmediarecordcp2.MediaDescriptionCompat, 0);
                    } else {
                        accessgetmediarecordcp.MediaSessionCompatQueueItem = getsoftlight0no6vwu.write(viewSerializer);
                        this.PlaybackStateCompat.MediaDescriptionCompat = this.ResultReceiver.write(viewSerializer) - this.ResultReceiver.write();
                    }
                    int i5 = this.PlaybackStateCompat.IconCompatParcelizer;
                    if ((i5 == -1 || i5 > this.MediaBrowserCompatMediaItem.size() - 1) && this.PlaybackStateCompat.MediaMetadataCompat <= this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.serializer()) {
                        accessgetMediaRecordcp accessgetmediarecordcp3 = this.PlaybackStateCompat;
                        int i6 = iAbs - accessgetmediarecordcp3.MediaDescriptionCompat;
                        DeltaDecoder deltaDecoder = this.MediaDescriptionCompat;
                        deltaDecoder.serializer = null;
                        deltaDecoder.write = 0;
                        if (i6 > 0) {
                            accessgetMediaRewindcp accessgetmediarewindcp2 = this.MediaSessionCompatQueueItem;
                            if (z2) {
                                accessgetmediarewindcp2.read(deltaDecoder, iMakeMeasureSpec, iMakeMeasureSpec2, i6, accessgetmediarecordcp3.MediaMetadataCompat, -1, this.MediaBrowserCompatMediaItem);
                            } else {
                                accessgetmediarewindcp2.read(deltaDecoder, iMakeMeasureSpec2, iMakeMeasureSpec, i6, accessgetmediarecordcp3.MediaMetadataCompat, -1, this.MediaBrowserCompatMediaItem);
                            }
                            accessgetmediarewindcp.RemoteActionCompatParcelizer(iMakeMeasureSpec, iMakeMeasureSpec2, this.PlaybackStateCompat.MediaMetadataCompat);
                            accessgetmediarewindcp.IconCompatParcelizer(this.PlaybackStateCompat.MediaMetadataCompat);
                        }
                    }
                    accessgetMediaRecordcp accessgetmediarecordcp4 = this.PlaybackStateCompat;
                    accessgetmediarecordcp4.serializer = iAbs - accessgetmediarecordcp4.MediaDescriptionCompat;
                }
            } else {
                View viewMediaSessionCompatResultReceiverWrapper2 = MediaSessionCompatResultReceiverWrapper(0);
                if (viewMediaSessionCompatResultReceiverWrapper2 != null) {
                    this.PlaybackStateCompat.MediaSessionCompatQueueItem = this.ResultReceiver.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper2);
                    int iRemoteActionCompatParcelizer2 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper2);
                    View view = read(viewMediaSessionCompatResultReceiverWrapper2, (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(accessgetmediarewindcp.RemoteActionCompatParcelizer[iRemoteActionCompatParcelizer2]));
                    accessgetMediaRecordcp accessgetmediarecordcp5 = this.PlaybackStateCompat;
                    accessgetmediarecordcp5.getClass();
                    int i7 = accessgetmediarewindcp.RemoteActionCompatParcelizer[iRemoteActionCompatParcelizer2];
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        this.PlaybackStateCompat.MediaMetadataCompat = iRemoteActionCompatParcelizer2 - ((accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i7 - 1)).MediaDescriptionCompat;
                    } else {
                        accessgetmediarecordcp5.MediaMetadataCompat = -1;
                    }
                    accessgetMediaRecordcp accessgetmediarecordcp6 = this.PlaybackStateCompat;
                    accessgetmediarecordcp6.IconCompatParcelizer = i7 > 0 ? i7 - 1 : 0;
                    getSoftlight0nO6VwU getsoftlight0no6vwu2 = this.ResultReceiver;
                    if (z3) {
                        accessgetmediarecordcp6.MediaSessionCompatQueueItem = getsoftlight0no6vwu2.write(view);
                        this.PlaybackStateCompat.MediaDescriptionCompat = this.ResultReceiver.write(view) - this.ResultReceiver.write();
                        accessgetMediaRecordcp accessgetmediarecordcp7 = this.PlaybackStateCompat;
                        accessgetmediarecordcp7.MediaDescriptionCompat = Math.max(accessgetmediarecordcp7.MediaDescriptionCompat, 0);
                    } else {
                        accessgetmediarecordcp6.MediaSessionCompatQueueItem = getsoftlight0no6vwu2.RemoteActionCompatParcelizer(view);
                        this.PlaybackStateCompat.MediaDescriptionCompat = this.ResultReceiver.IconCompatParcelizer() + (-this.ResultReceiver.RemoteActionCompatParcelizer(view));
                    }
                    accessgetMediaRecordcp accessgetmediarecordcp8 = this.PlaybackStateCompat;
                    accessgetmediarecordcp8.serializer = iAbs - accessgetmediarecordcp8.MediaDescriptionCompat;
                }
            }
            accessgetMediaRecordcp accessgetmediarecordcp9 = this.PlaybackStateCompat;
            int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(recycler, getintrinsicsizenhjbrc, accessgetmediarecordcp9) + accessgetmediarecordcp9.MediaDescriptionCompat;
            if (iRemoteActionCompatParcelizer3 >= 0) {
                if (z) {
                    if (iAbs > iRemoteActionCompatParcelizer3) {
                        i2 = (-i3) * iRemoteActionCompatParcelizer3;
                    } else {
                        i2 = i;
                    }
                } else if (iAbs > iRemoteActionCompatParcelizer3) {
                    i2 = i3 * iRemoteActionCompatParcelizer3;
                } else {
                    i2 = i;
                }
                this.ResultReceiver.IconCompatParcelizer(-i2);
                this.PlaybackStateCompat.RemoteActionCompatParcelizer = i2;
                return i2;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final BlockGraphicsLayerElement IconCompatParcelizer() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.RatingCompat = 0.0f;
        layoutParams.MediaSessionCompatQueueItem = 1.0f;
        layoutParams.write = -1;
        layoutParams.RemoteActionCompatParcelizer = -1.0f;
        layoutParams.MediaDescriptionCompat = 16777215;
        layoutParams.MediaBrowserCompatMediaItem = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        MediaDescriptionCompat(i);
        MediaDescriptionCompat(i);
    }

    public final View MediaSessionCompatQueueItem(int i, int i2, int i3) {
        int iRemoteActionCompatParcelizer;
        RemoteActionCompatParcelizer();
        if (this.PlaybackStateCompat == null) {
            accessgetMediaRecordcp accessgetmediarecordcp = new accessgetMediaRecordcp();
            accessgetmediarecordcp.write = 1;
            this.PlaybackStateCompat = accessgetmediarecordcp;
        }
        int iIconCompatParcelizer = this.ResultReceiver.IconCompatParcelizer();
        int iWrite = this.ResultReceiver.write();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i);
            if (viewMediaSessionCompatResultReceiverWrapper != null && (iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper)) >= 0 && iRemoteActionCompatParcelizer < i3) {
                if (((BlockGraphicsLayerElement) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams()).MediaMetadataCompat.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewMediaSessionCompatResultReceiverWrapper;
                    }
                } else {
                    if (this.ResultReceiver.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper) >= iIconCompatParcelizer && this.ResultReceiver.write(viewMediaSessionCompatResultReceiverWrapper) <= iWrite) {
                        return viewMediaSessionCompatResultReceiverWrapper;
                    }
                    if (view == null) {
                        view = viewMediaSessionCompatResultReceiverWrapper;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        AnchorInfo anchorInfo = new AnchorInfo();
        this.RemoteActionCompatParcelizer = anchorInfo;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = -1;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = Integer.MIN_VALUE;
        this.MediaSessionCompatResultReceiverWrapper = Integer.MIN_VALUE;
        this.PlaybackStateCompatCustomAction = Integer.MIN_VALUE;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new SparseArray();
        this.serializer = -1;
        this.MediaDescriptionCompat = new DeltaDecoder(6, (char) 0);
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = RecyclerView.LayoutManager.read(context, attributeSet, i, i2);
        int i3 = blockGraphicsLayerModifier.IconCompatParcelizer;
        if (i3 != 0) {
            if (i3 == 1) {
                if (blockGraphicsLayerModifier.serializer) {
                    MediaSessionCompatQueueItem(3);
                } else {
                    MediaSessionCompatQueueItem(2);
                }
            }
        } else if (blockGraphicsLayerModifier.serializer) {
            MediaSessionCompatQueueItem(1);
        } else {
            MediaSessionCompatQueueItem(0);
        }
        int i4 = this.MediaMetadataCompat;
        if (i4 != 1) {
            if (i4 == 0) {
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                this.MediaBrowserCompatMediaItem.clear();
                AnchorInfo.read(anchorInfo);
                anchorInfo.RemoteActionCompatParcelizer = 0;
            }
            this.MediaMetadataCompat = 1;
            this.ResultReceiver = null;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
        if (this.IconCompatParcelizer != 4) {
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            this.MediaBrowserCompatMediaItem.clear();
            AnchorInfo.read(anchorInfo);
            anchorInfo.RemoteActionCompatParcelizer = 0;
            this.IconCompatParcelizer = 4;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
        this.write = context;
    }

    public static boolean RemoteActionCompatParcelizer(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public final void MediaSessionCompatQueueItem(int i) {
        if (this.RatingCompat != i) {
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            this.RatingCompat = i;
            this.ResultReceiver = null;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
            this.MediaBrowserCompatMediaItem.clear();
            AnchorInfo anchorInfo = this.RemoteActionCompatParcelizer;
            AnchorInfo.read(anchorInfo);
            anchorInfo.RemoteActionCompatParcelizer = 0;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void RatingCompat(int i) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = Integer.MIN_VALUE;
        SavedState savedState = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (savedState != null) {
            savedState.RemoteActionCompatParcelizer = -1;
        }
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean RatingCompat() {
        if (this.MediaMetadataCompat == 0) {
            return read();
        }
        if (!read()) {
            return true;
        }
        int i = this.menuHostHelperlambda0;
        View view = this.ComponentActivity;
        return i > (view != null ? view.getWidth() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final View read(View view, accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp) {
        boolean z = read();
        int i = accessgetmediaskipbackwardcp.MediaDescriptionCompat;
        for (int i2 = 1; i2 < i; i2++) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i2);
            if (viewMediaSessionCompatResultReceiverWrapper != null && viewMediaSessionCompatResultReceiverWrapper.getVisibility() != 8) {
                if (!this.MediaSessionCompatToken || z) {
                    if (this.ResultReceiver.RemoteActionCompatParcelizer(view) > this.ResultReceiver.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper)) {
                        view = viewMediaSessionCompatResultReceiverWrapper;
                    }
                } else if (this.ResultReceiver.write(view) < this.ResultReceiver.write(viewMediaSessionCompatResultReceiverWrapper)) {
                    view = viewMediaSessionCompatResultReceiverWrapper;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    public final View serializer(View view, accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp) {
        boolean z = read();
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        int i = accessgetmediaskipbackwardcp.MediaDescriptionCompat;
        for (int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 2; iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 > (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus - i) - 1; iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2--) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2);
            if (viewMediaSessionCompatResultReceiverWrapper != null && viewMediaSessionCompatResultReceiverWrapper.getVisibility() != 8) {
                if (!this.MediaSessionCompatToken || z) {
                    if (this.ResultReceiver.write(view) < this.ResultReceiver.write(viewMediaSessionCompatResultReceiverWrapper)) {
                        view = viewMediaSessionCompatResultReceiverWrapper;
                    }
                } else if (this.ResultReceiver.RemoteActionCompatParcelizer(view) > this.ResultReceiver.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper)) {
                    view = viewMediaSessionCompatResultReceiverWrapper;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void serializer(RecyclerView recyclerView) {
        this.ComponentActivity = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write(int i, int i2) {
        MediaDescriptionCompat(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (SavedState) parcelable;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean MediaBrowserCompatMediaItem() {
        if (this.MediaMetadataCompat == 0) {
            return !read();
        }
        if (!read()) {
            int i = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            View view = this.ComponentActivity;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.ResultReceiver != null) {
            return;
        }
        boolean z = read();
        int i = this.MediaMetadataCompat;
        if (z) {
            if (i == 0) {
                this.ResultReceiver = new getSoftlight0nO6VwU(this, 0);
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new getSoftlight0nO6VwU(this, 1);
                return;
            } else {
                this.ResultReceiver = new getSoftlight0nO6VwU(this, 1);
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new getSoftlight0nO6VwU(this, 0);
                return;
            }
        }
        if (i == 0) {
            this.ResultReceiver = new getSoftlight0nO6VwU(this, 1);
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new getSoftlight0nO6VwU(this, 0);
        } else {
            this.ResultReceiver = new getSoftlight0nO6VwU(this, 0);
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new getSoftlight0nO6VwU(this, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0104 A[EDGE_INSN: B:86:0x0104->B:93:? BREAK  A[LOOP:2: B:52:0x00b3->B:71:0x0100], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0100 A[SYNTHETIC] */
    public final void IconCompatParcelizer(RecyclerView.Recycler recycler, accessgetMediaRecordcp accessgetmediarecordcp) {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        int i2;
        View viewMediaSessionCompatResultReceiverWrapper;
        int i3;
        if (accessgetmediarecordcp.MediaBrowserCompatMediaItem) {
            int i4 = accessgetmediarecordcp.write;
            int i5 = accessgetmediarecordcp.MediaDescriptionCompat;
            accessgetMediaRewindcp accessgetmediarewindcp = this.MediaSessionCompatQueueItem;
            int i6 = -1;
            if (i4 == -1) {
                if (i5 < 0 || (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()) == 0 || (viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper((i2 = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 - 1))) == null || (i3 = accessgetmediarewindcp.RemoteActionCompatParcelizer[RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper)]) == -1) {
                    return;
                }
                accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i3);
                for (int i7 = i2; i7 >= 0; i7--) {
                    View viewMediaSessionCompatResultReceiverWrapper2 = MediaSessionCompatResultReceiverWrapper(i7);
                    if (viewMediaSessionCompatResultReceiverWrapper2 != null) {
                        int i8 = accessgetmediarecordcp.MediaDescriptionCompat;
                        if (!read() && this.MediaSessionCompatToken) {
                            if (this.ResultReceiver.write(viewMediaSessionCompatResultReceiverWrapper2) > i8) {
                                break;
                            }
                            if (accessgetmediaskipbackwardcp.RatingCompat != RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper2)) {
                                continue;
                            } else if (i3 <= 0) {
                                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = i7;
                                break;
                            } else {
                                i3 += accessgetmediarecordcp.write;
                                accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i3);
                                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = i7;
                            }
                        } else {
                            if (this.ResultReceiver.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper2) < this.ResultReceiver.read() - i8) {
                                break;
                            }
                            if (accessgetmediaskipbackwardcp.RatingCompat != RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper2)) {
                                continue;
                            } else if (i3 <= 0) {
                                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = i7;
                                break;
                            } else {
                                i3 += accessgetmediarecordcp.write;
                                accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i3);
                                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = i7;
                            }
                        }
                    }
                }
                while (i2 >= iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2) {
                    read(i2, recycler);
                    i2--;
                }
                return;
            }
            if (i5 >= 0 && (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()) != 0) {
                int i9 = 0;
                View viewMediaSessionCompatResultReceiverWrapper3 = MediaSessionCompatResultReceiverWrapper(0);
                if (viewMediaSessionCompatResultReceiverWrapper3 == null || (i = accessgetmediarewindcp.RemoteActionCompatParcelizer[RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper3)]) == -1) {
                    return;
                }
                accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp2 = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i);
                while (true) {
                    if (i9 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                        View viewMediaSessionCompatResultReceiverWrapper4 = MediaSessionCompatResultReceiverWrapper(i9);
                        if (viewMediaSessionCompatResultReceiverWrapper4 != null) {
                            int i10 = accessgetmediarecordcp.MediaDescriptionCompat;
                            if (read() || !this.MediaSessionCompatToken) {
                                if (this.ResultReceiver.write(viewMediaSessionCompatResultReceiverWrapper4) <= i10) {
                                    if (accessgetmediaskipbackwardcp2.MediaSessionCompatQueueItem != RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper4)) {
                                        continue;
                                    } else {
                                        if (i >= this.MediaBrowserCompatMediaItem.size() - 1) {
                                            break;
                                        }
                                        i += accessgetmediarecordcp.write;
                                        accessgetmediaskipbackwardcp2 = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i);
                                        i6 = i9;
                                    }
                                }
                            } else if (this.ResultReceiver.read() - this.ResultReceiver.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper4) <= i10) {
                                if (accessgetmediaskipbackwardcp2.MediaSessionCompatQueueItem != RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper4)) {
                                    continue;
                                } else if (i >= this.MediaBrowserCompatMediaItem.size() - 1) {
                                    break;
                                    break;
                                } else {
                                    i += accessgetmediarecordcp.write;
                                    accessgetmediaskipbackwardcp2 = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i);
                                    i6 = i9;
                                }
                            }
                        }
                        i9++;
                    }
                    i9 = i6;
                    break;
                }
                while (i9 >= 0) {
                    read(i9, recycler);
                    i9--;
                }
            }
        }
    }

    public final void IconCompatParcelizer(AnchorInfo anchorInfo, boolean z, boolean z2) {
        int i;
        if (z2) {
            if (read()) {
                i = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            } else {
                i = this.getSavedStateRegistryControllerannotations;
            }
            this.PlaybackStateCompat.read = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.PlaybackStateCompat.read = false;
        }
        if (!read() && this.MediaSessionCompatToken) {
            this.PlaybackStateCompat.serializer = (this.ComponentActivity.getWidth() - anchorInfo.write) - this.ResultReceiver.IconCompatParcelizer();
        } else {
            this.PlaybackStateCompat.serializer = anchorInfo.write - this.ResultReceiver.IconCompatParcelizer();
        }
        accessgetMediaRecordcp accessgetmediarecordcp = this.PlaybackStateCompat;
        accessgetmediarecordcp.MediaMetadataCompat = anchorInfo.MediaBrowserCompatMediaItem;
        accessgetmediarecordcp.write = -1;
        accessgetmediarecordcp.MediaSessionCompatQueueItem = anchorInfo.write;
        accessgetmediarecordcp.MediaDescriptionCompat = Integer.MIN_VALUE;
        int i2 = anchorInfo.IconCompatParcelizer;
        accessgetmediarecordcp.IconCompatParcelizer = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.MediaBrowserCompatMediaItem.size();
        int i3 = anchorInfo.IconCompatParcelizer;
        if (size > i3) {
            accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(i3);
            accessgetMediaRecordcp accessgetmediarecordcp2 = this.PlaybackStateCompat;
            accessgetmediarecordcp2.IconCompatParcelizer--;
            accessgetmediarecordcp2.MediaMetadataCompat -= accessgetmediaskipbackwardcp.MediaDescriptionCompat;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int RemoteActionCompatParcelizer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (read() || (this.MediaMetadataCompat == 0 && !read())) {
            int iWrite = write(i, recycler, getintrinsicsizenhjbrc);
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.clear();
            return iWrite;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer += iRemoteActionCompatParcelizer;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(-iRemoteActionCompatParcelizer);
        return iRemoteActionCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, accessgetMediaRecordcp accessgetmediarecordcp) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        Rect rect;
        accessgetMediaRewindcp accessgetmediarewindcp;
        View view;
        int i6;
        int i7;
        accessgetMediaRecordcp accessgetmediarecordcp2 = accessgetmediarecordcp;
        int i8 = accessgetmediarecordcp2.MediaDescriptionCompat;
        if (i8 != Integer.MIN_VALUE) {
            int i9 = accessgetmediarecordcp2.serializer;
            if (i9 < 0) {
                accessgetmediarecordcp2.MediaDescriptionCompat = i8 + i9;
            }
            IconCompatParcelizer(recycler, accessgetmediarecordcp2);
        }
        int i10 = accessgetmediarecordcp2.serializer;
        boolean z2 = read();
        int i11 = i10;
        int i12 = 0;
        while (true) {
            if (i11 <= 0 && !this.PlaybackStateCompat.read) {
                break;
            }
            List list = this.MediaBrowserCompatMediaItem;
            int i13 = accessgetmediarecordcp2.MediaMetadataCompat;
            if (i13 < 0 || i13 >= getintrinsicsizenhjbrc.serializer() || (i = accessgetmediarecordcp2.IconCompatParcelizer) < 0 || i >= list.size()) {
                break;
            }
            accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(accessgetmediarecordcp2.IconCompatParcelizer);
            accessgetmediarecordcp2.MediaMetadataCompat = accessgetmediaskipbackwardcp.RatingCompat;
            boolean z3 = read();
            AnchorInfo anchorInfo = this.RemoteActionCompatParcelizer;
            Rect rect2 = read;
            accessgetMediaRewindcp accessgetmediarewindcp2 = this.MediaSessionCompatQueueItem;
            if (z3) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i14 = this.menuHostHelperlambda0;
                int i15 = accessgetmediarecordcp2.MediaSessionCompatQueueItem;
                if (accessgetmediarecordcp2.write == -1) {
                    i15 -= accessgetmediaskipbackwardcp.write;
                }
                int i16 = accessgetmediarecordcp2.MediaMetadataCompat;
                float f = anchorInfo.RemoteActionCompatParcelizer;
                float f2 = paddingLeft - f;
                float measuredWidth = (i14 - paddingRight) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i17 = accessgetmediaskipbackwardcp.MediaDescriptionCompat;
                int i18 = i16;
                int i19 = 0;
                while (i18 < i16 + i17) {
                    View view2 = read(i18);
                    if (view2 == null) {
                        i15 = i15;
                        i11 = i11;
                        i18 = i18;
                        accessgetmediarewindcp2 = accessgetmediarewindcp2;
                        rect2 = rect2;
                    } else {
                        if (accessgetmediarecordcp2.write == 1) {
                            serializer(view2, rect2);
                            addViewInt(view2, -1, false);
                        } else {
                            serializer(view2, rect2);
                            addViewInt(view2, i19, false);
                            i19++;
                        }
                        long j = accessgetmediarewindcp2.read[i18];
                        int i20 = i19;
                        int i21 = (int) j;
                        int i22 = (int) (j >> 32);
                        LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                        if (serializer(view2, i21, i22, layoutParams)) {
                            view2.measure(i21, i22);
                        }
                        float f3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((BlockGraphicsLayerElement) view2.getLayoutParams()).serializer.left + f2;
                        float f4 = measuredWidth - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((BlockGraphicsLayerElement) view2.getLayoutParams()).serializer.right);
                        int i23 = i15 + ((BlockGraphicsLayerElement) view2.getLayoutParams()).serializer.top;
                        boolean z4 = this.MediaSessionCompatToken;
                        accessgetMediaRewindcp accessgetmediarewindcp3 = this.MediaSessionCompatQueueItem;
                        if (z4) {
                            accessgetmediarewindcp3.serializer(view2, accessgetmediaskipbackwardcp, Math.round(f4) - view2.getMeasuredWidth(), i23, Math.round(f4), view2.getMeasuredHeight() + i23);
                        } else {
                            accessgetmediarewindcp3.serializer(view2, accessgetmediaskipbackwardcp, Math.round(f3), i23, view2.getMeasuredWidth() + Math.round(f3), view2.getMeasuredHeight() + i23);
                        }
                        float measuredWidth2 = view2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((BlockGraphicsLayerElement) view2.getLayoutParams()).serializer.right;
                        measuredWidth = f4 - (((view2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((BlockGraphicsLayerElement) view2.getLayoutParams()).serializer.left) + fMax);
                        f2 = measuredWidth2 + fMax + f3;
                        i19 = i20;
                    }
                    i18++;
                    i17 = i17;
                    i16 = i16;
                    i15 = i15;
                    i11 = i11;
                    accessgetmediarewindcp2 = accessgetmediarewindcp2;
                    rect2 = rect2;
                }
                i2 = i11;
                accessgetmediarecordcp2.IconCompatParcelizer += this.PlaybackStateCompat.write;
                i5 = accessgetmediaskipbackwardcp.write;
                z = z2;
                i4 = i12;
            } else {
                i2 = i11;
                accessgetMediaRewindcp accessgetmediarewindcp4 = accessgetmediarewindcp2;
                Rect rect3 = rect2;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i24 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                int i25 = accessgetmediarecordcp2.MediaSessionCompatQueueItem;
                if (accessgetmediarecordcp2.write == -1) {
                    int i26 = accessgetmediaskipbackwardcp.write;
                    int i27 = i25 + i26;
                    i25 -= i26;
                    i3 = i27;
                } else {
                    i3 = i25;
                }
                int i28 = accessgetmediarecordcp2.MediaMetadataCompat;
                float f5 = i24 - paddingBottom;
                float f6 = anchorInfo.RemoteActionCompatParcelizer;
                float f7 = paddingTop - f6;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i29 = accessgetmediaskipbackwardcp.MediaDescriptionCompat;
                float measuredHeight = f5 - f6;
                int i30 = i28;
                int i31 = 0;
                while (i30 < i28 + i29) {
                    View view3 = read(i30);
                    if (view3 == null) {
                        z2 = z2;
                        i7 = i28;
                        accessgetmediarewindcp = accessgetmediarewindcp4;
                        rect = rect3;
                        i6 = i29;
                    } else {
                        accessgetMediaRewindcp accessgetmediarewindcp5 = accessgetmediarewindcp4;
                        long j2 = accessgetmediarewindcp5.read[i30];
                        int i32 = (int) j2;
                        int i33 = (int) (j2 >> 32);
                        LayoutParams layoutParams2 = (LayoutParams) view3.getLayoutParams();
                        if (serializer(view3, i32, i33, layoutParams2)) {
                            view3.measure(i32, i33);
                        }
                        float f8 = f7 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((BlockGraphicsLayerElement) view3.getLayoutParams()).serializer.top;
                        float f9 = measuredHeight - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + ((BlockGraphicsLayerElement) view3.getLayoutParams()).serializer.bottom);
                        if (accessgetmediarecordcp2.write == 1) {
                            rect = rect3;
                            serializer(view3, rect);
                            addViewInt(view3, -1, false);
                        } else {
                            rect = rect3;
                            serializer(view3, rect);
                            addViewInt(view3, i31, false);
                            i31++;
                        }
                        int i34 = i31;
                        int i35 = i25 + ((BlockGraphicsLayerElement) view3.getLayoutParams()).serializer.left;
                        int i36 = i3 - ((BlockGraphicsLayerElement) view3.getLayoutParams()).serializer.right;
                        boolean z5 = this.MediaSessionCompatToken;
                        boolean z6 = this.ParcelableVolumeInfo;
                        accessgetMediaRewindcp accessgetmediarewindcp6 = this.MediaSessionCompatQueueItem;
                        if (!z5) {
                            accessgetmediarewindcp = accessgetmediarewindcp5;
                            view = view3;
                            i6 = i29;
                            i7 = i28;
                            if (z6) {
                                accessgetmediarewindcp6.read(view, accessgetmediaskipbackwardcp, z5, i35, Math.round(f9) - view.getMeasuredHeight(), view.getMeasuredWidth() + i35, Math.round(f9));
                            } else {
                                accessgetmediarewindcp6.read(view, accessgetmediaskipbackwardcp, z5, i35, Math.round(f8), view.getMeasuredWidth() + i35, view.getMeasuredHeight() + Math.round(f8));
                            }
                        } else if (z6) {
                            accessgetmediarewindcp = accessgetmediarewindcp5;
                            view = view3;
                            i6 = i29;
                            i7 = i28;
                            accessgetmediarewindcp6.read(view3, accessgetmediaskipbackwardcp, z5, i36 - view3.getMeasuredWidth(), Math.round(f9) - view3.getMeasuredHeight(), i36, Math.round(f9));
                        } else {
                            accessgetmediarewindcp = accessgetmediarewindcp5;
                            view = view3;
                            i6 = i29;
                            i7 = i28;
                            accessgetmediarewindcp6.read(view, accessgetmediaskipbackwardcp, z5, i36 - view.getMeasuredWidth(), Math.round(f8), i36, view.getMeasuredHeight() + Math.round(f8));
                        }
                        float measuredHeight2 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.bottom;
                        measuredHeight = f9 - (((view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) + ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.top) + fMax2);
                        f7 = measuredHeight2 + fMax2 + f8;
                        i31 = i34;
                    }
                    i30++;
                    accessgetmediarecordcp2 = accessgetmediarecordcp;
                    z2 = z2;
                    i12 = i12;
                    accessgetmediarewindcp4 = accessgetmediarewindcp;
                    i29 = i6;
                    i28 = i7;
                    rect3 = rect;
                }
                z = z2;
                i4 = i12;
                accessgetmediarecordcp2 = accessgetmediarecordcp;
                accessgetmediarecordcp2.IconCompatParcelizer += this.PlaybackStateCompat.write;
                i5 = accessgetmediaskipbackwardcp.write;
            }
            i12 = i4 + i5;
            if (!z && this.MediaSessionCompatToken) {
                accessgetmediarecordcp2.MediaSessionCompatQueueItem -= accessgetmediaskipbackwardcp.write * accessgetmediarecordcp2.write;
            } else {
                accessgetmediarecordcp2.MediaSessionCompatQueueItem += accessgetmediaskipbackwardcp.write * accessgetmediarecordcp2.write;
            }
            i11 = i2 - accessgetmediaskipbackwardcp.write;
            z2 = z;
            i10 = i10;
        }
        int i37 = i10;
        int i38 = i12;
        int i39 = accessgetmediarecordcp2.serializer - i38;
        accessgetmediarecordcp2.serializer = i39;
        int i40 = accessgetmediarecordcp2.MediaDescriptionCompat;
        if (i40 != Integer.MIN_VALUE) {
            int i41 = i40 + i38;
            accessgetmediarecordcp2.MediaDescriptionCompat = i41;
            if (i39 < 0) {
                accessgetmediarecordcp2.MediaDescriptionCompat = i41 + i39;
            }
            IconCompatParcelizer(recycler, accessgetmediarecordcp2);
        }
        return i37 - accessgetmediarecordcp2.serializer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        SavedState savedState = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.RemoteActionCompatParcelizer = savedState.RemoteActionCompatParcelizer;
            savedState2.read = savedState.read;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() <= 0) {
            savedState3.RemoteActionCompatParcelizer = -1;
            return savedState3;
        }
        View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(0);
        savedState3.RemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
        savedState3.read = this.ResultReceiver.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper) - this.ResultReceiver.IconCompatParcelizer();
        return savedState3;
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int read(View view) {
        int i;
        int i2;
        if (read()) {
            i = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.top;
            i2 = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.bottom;
        } else {
            i = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.left;
            i2 = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.right;
        }
        return i + i2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0173  */
    /* JADX WARN: Code duplicated, block: B:106:0x018a  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:135:0x020b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0211  */
    /* JADX WARN: Code duplicated, block: B:142:0x021e  */
    /* JADX WARN: Code duplicated, block: B:143:0x022b  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:85:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0141  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0155  */
    /* JADX WARN: Code duplicated, block: B:97:0x0169  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        View viewSerializer;
        FlexboxLayoutManager flexboxLayoutManager;
        getSoftlight0nO6VwU getsoftlight0no6vwu;
        int iRemoteActionCompatParcelizer;
        int i;
        int size;
        int i2;
        int i3;
        View viewMediaBrowserCompatMediaItem;
        View viewMediaSessionCompatResultReceiverWrapper;
        boolean z;
        int iRemoteActionCompatParcelizer2;
        int iIconCompatParcelizer;
        getSoftlight0nO6VwU getsoftlight0no6vwu2;
        boolean z2;
        getSoftlight0nO6VwU getsoftlight0no6vwu3;
        int iRemoteActionCompatParcelizer3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = recycler;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = getintrinsicsizenhjbrc;
        int iSerializer = getintrinsicsizenhjbrc.serializer();
        if (iSerializer == 0 && getintrinsicsizenhjbrc.write) {
            return;
        }
        int layoutDirection = this.ensureViewModelStore.getLayoutDirection();
        int i8 = this.RatingCompat;
        int i9 = this.MediaMetadataCompat;
        if (i8 == 0) {
            this.MediaSessionCompatToken = layoutDirection == 1;
            this.ParcelableVolumeInfo = i9 == 2;
        } else if (i8 == 1) {
            this.MediaSessionCompatToken = layoutDirection != 1;
            this.ParcelableVolumeInfo = i9 == 2;
        } else if (i8 == 2) {
            boolean z5 = layoutDirection == 1;
            this.MediaSessionCompatToken = z5;
            if (i9 == 2) {
                this.MediaSessionCompatToken = !z5;
            }
            this.ParcelableVolumeInfo = false;
        } else if (i8 != 3) {
            this.MediaSessionCompatToken = false;
            this.ParcelableVolumeInfo = false;
        } else {
            boolean z6 = layoutDirection == 1;
            this.MediaSessionCompatToken = z6;
            if (i9 == 2) {
                this.MediaSessionCompatToken = !z6;
            }
            this.ParcelableVolumeInfo = true;
        }
        RemoteActionCompatParcelizer();
        if (this.PlaybackStateCompat == null) {
            accessgetMediaRecordcp accessgetmediarecordcp = new accessgetMediaRecordcp();
            accessgetmediarecordcp.write = 1;
            this.PlaybackStateCompat = accessgetmediarecordcp;
        }
        accessgetMediaRewindcp accessgetmediarewindcp = this.MediaSessionCompatQueueItem;
        accessgetmediarewindcp.read(iSerializer);
        accessgetmediarewindcp.serializer(iSerializer);
        accessgetmediarewindcp.RemoteActionCompatParcelizer(iSerializer);
        this.PlaybackStateCompat.MediaBrowserCompatMediaItem = false;
        SavedState savedState = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (savedState != null && (i7 = savedState.RemoteActionCompatParcelizer) >= 0 && i7 < iSerializer) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i7;
        }
        AnchorInfo anchorInfo = this.RemoteActionCompatParcelizer;
        if (!anchorInfo.RatingCompat || this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != -1 || savedState != null) {
            AnchorInfo.read(anchorInfo);
            SavedState savedState2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (!getintrinsicsizenhjbrc.write && (i3 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) != -1) {
                if (i3 >= 0 && i3 < getintrinsicsizenhjbrc.serializer()) {
                    int i10 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    anchorInfo.MediaBrowserCompatMediaItem = i10;
                    anchorInfo.IconCompatParcelizer = accessgetmediarewindcp.RemoteActionCompatParcelizer[i10];
                    SavedState savedState3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    if (savedState3 != null) {
                        int iSerializer2 = getintrinsicsizenhjbrc.serializer();
                        int i11 = savedState3.RemoteActionCompatParcelizer;
                        if (i11 >= 0 && i11 < iSerializer2) {
                            anchorInfo.write = this.ResultReceiver.IconCompatParcelizer() + savedState2.read;
                            anchorInfo.serializer = true;
                            anchorInfo.IconCompatParcelizer = -1;
                        } else if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == Integer.MIN_VALUE) {
                            viewMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                            if (viewMediaBrowserCompatMediaItem != null) {
                                if (this.ResultReceiver.IconCompatParcelizer(viewMediaBrowserCompatMediaItem) > this.ResultReceiver.MediaDescriptionCompat()) {
                                    AnchorInfo.serializer(anchorInfo);
                                } else {
                                    iRemoteActionCompatParcelizer2 = this.ResultReceiver.RemoteActionCompatParcelizer(viewMediaBrowserCompatMediaItem);
                                    iIconCompatParcelizer = this.ResultReceiver.IconCompatParcelizer();
                                    getsoftlight0no6vwu2 = this.ResultReceiver;
                                    if (iRemoteActionCompatParcelizer2 - iIconCompatParcelizer < 0) {
                                        anchorInfo.write = getsoftlight0no6vwu2.IconCompatParcelizer();
                                        anchorInfo.read = false;
                                    } else if (getsoftlight0no6vwu2.write() - this.ResultReceiver.write(viewMediaBrowserCompatMediaItem) < 0) {
                                        anchorInfo.write = this.ResultReceiver.write();
                                        anchorInfo.read = true;
                                    } else {
                                        z2 = anchorInfo.read;
                                        getsoftlight0no6vwu3 = this.ResultReceiver;
                                        if (z2) {
                                            iRemoteActionCompatParcelizer3 = this.ResultReceiver.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu3.write(viewMediaBrowserCompatMediaItem);
                                        } else {
                                            iRemoteActionCompatParcelizer3 = getsoftlight0no6vwu3.RemoteActionCompatParcelizer(viewMediaBrowserCompatMediaItem);
                                        }
                                        anchorInfo.write = iRemoteActionCompatParcelizer3;
                                    }
                                }
                            } else {
                                if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() > 0 && (viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(0)) != null) {
                                    if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys < RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper)) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    anchorInfo.read = z;
                                }
                                AnchorInfo.serializer(anchorInfo);
                            }
                        } else if (read() && this.MediaSessionCompatToken) {
                            anchorInfo.write = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss - this.ResultReceiver.RemoteActionCompatParcelizer();
                        } else {
                            anchorInfo.write = this.ResultReceiver.IconCompatParcelizer() + this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                        }
                    } else if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == Integer.MIN_VALUE) {
                        viewMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                        if (viewMediaBrowserCompatMediaItem != null) {
                            if (this.ResultReceiver.IconCompatParcelizer(viewMediaBrowserCompatMediaItem) > this.ResultReceiver.MediaDescriptionCompat()) {
                                AnchorInfo.serializer(anchorInfo);
                            } else {
                                iRemoteActionCompatParcelizer2 = this.ResultReceiver.RemoteActionCompatParcelizer(viewMediaBrowserCompatMediaItem);
                                iIconCompatParcelizer = this.ResultReceiver.IconCompatParcelizer();
                                getsoftlight0no6vwu2 = this.ResultReceiver;
                                if (iRemoteActionCompatParcelizer2 - iIconCompatParcelizer < 0) {
                                    anchorInfo.write = getsoftlight0no6vwu2.IconCompatParcelizer();
                                    anchorInfo.read = false;
                                } else if (getsoftlight0no6vwu2.write() - this.ResultReceiver.write(viewMediaBrowserCompatMediaItem) < 0) {
                                    anchorInfo.write = this.ResultReceiver.write();
                                    anchorInfo.read = true;
                                } else {
                                    z2 = anchorInfo.read;
                                    getsoftlight0no6vwu3 = this.ResultReceiver;
                                    if (z2) {
                                        iRemoteActionCompatParcelizer3 = this.ResultReceiver.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu3.write(viewMediaBrowserCompatMediaItem);
                                    } else {
                                        iRemoteActionCompatParcelizer3 = getsoftlight0no6vwu3.RemoteActionCompatParcelizer(viewMediaBrowserCompatMediaItem);
                                    }
                                    anchorInfo.write = iRemoteActionCompatParcelizer3;
                                }
                            }
                        } else {
                            if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() > 0) {
                                if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys < RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                anchorInfo.read = z;
                            }
                            AnchorInfo.serializer(anchorInfo);
                        }
                    } else if (read()) {
                        anchorInfo.write = this.ResultReceiver.IconCompatParcelizer() + this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    } else {
                        anchorInfo.write = this.ResultReceiver.IconCompatParcelizer() + this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    }
                } else {
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = -1;
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = Integer.MIN_VALUE;
                    if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0) {
                        if (anchorInfo.read) {
                            viewSerializer = IconCompatParcelizer(getintrinsicsizenhjbrc.serializer());
                        } else {
                            viewSerializer = serializer(getintrinsicsizenhjbrc.serializer());
                        }
                        if (viewSerializer != null) {
                            flexboxLayoutManager = FlexboxLayoutManager.this;
                            if (flexboxLayoutManager.MediaMetadataCompat == 0) {
                                getsoftlight0no6vwu = flexboxLayoutManager.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                            } else {
                                getsoftlight0no6vwu = flexboxLayoutManager.ResultReceiver;
                            }
                            if (flexboxLayoutManager.read()) {
                                if (anchorInfo.read) {
                                    anchorInfo.write = getsoftlight0no6vwu.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu.write(viewSerializer);
                                } else {
                                    anchorInfo.write = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewSerializer);
                                }
                            } else if (anchorInfo.read) {
                                anchorInfo.write = getsoftlight0no6vwu.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu.write(viewSerializer);
                            } else {
                                anchorInfo.write = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewSerializer);
                            }
                            iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewSerializer);
                            anchorInfo.MediaBrowserCompatMediaItem = iRemoteActionCompatParcelizer;
                            anchorInfo.serializer = false;
                            int[] iArr = flexboxLayoutManager.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
                            if (iRemoteActionCompatParcelizer == -1) {
                                iRemoteActionCompatParcelizer = 0;
                            }
                            i = iArr[iRemoteActionCompatParcelizer];
                            if (i == -1) {
                                i = 0;
                            }
                            anchorInfo.IconCompatParcelizer = i;
                            size = flexboxLayoutManager.MediaBrowserCompatMediaItem.size();
                            i2 = anchorInfo.IconCompatParcelizer;
                            if (size > i2) {
                                anchorInfo.MediaBrowserCompatMediaItem = ((accessgetMediaSkipBackwardcp) flexboxLayoutManager.MediaBrowserCompatMediaItem.get(i2)).RatingCompat;
                            }
                        } else {
                            AnchorInfo.serializer(anchorInfo);
                            anchorInfo.MediaBrowserCompatMediaItem = 0;
                            anchorInfo.IconCompatParcelizer = 0;
                        }
                    } else {
                        AnchorInfo.serializer(anchorInfo);
                        anchorInfo.MediaBrowserCompatMediaItem = 0;
                        anchorInfo.IconCompatParcelizer = 0;
                    }
                }
            } else if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0) {
                if (anchorInfo.read) {
                    viewSerializer = IconCompatParcelizer(getintrinsicsizenhjbrc.serializer());
                } else {
                    viewSerializer = serializer(getintrinsicsizenhjbrc.serializer());
                }
                if (viewSerializer != null) {
                    flexboxLayoutManager = FlexboxLayoutManager.this;
                    if (flexboxLayoutManager.MediaMetadataCompat == 0) {
                        getsoftlight0no6vwu = flexboxLayoutManager.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    } else {
                        getsoftlight0no6vwu = flexboxLayoutManager.ResultReceiver;
                    }
                    if (flexboxLayoutManager.read() && flexboxLayoutManager.MediaSessionCompatToken) {
                        if (anchorInfo.read) {
                            anchorInfo.write = getsoftlight0no6vwu.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewSerializer);
                        } else {
                            anchorInfo.write = getsoftlight0no6vwu.write(viewSerializer);
                        }
                    } else if (anchorInfo.read) {
                        anchorInfo.write = getsoftlight0no6vwu.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu.write(viewSerializer);
                    } else {
                        anchorInfo.write = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewSerializer);
                    }
                    iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewSerializer);
                    anchorInfo.MediaBrowserCompatMediaItem = iRemoteActionCompatParcelizer;
                    anchorInfo.serializer = false;
                    int[] iArr2 = flexboxLayoutManager.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
                    if (iRemoteActionCompatParcelizer == -1) {
                        iRemoteActionCompatParcelizer = 0;
                    }
                    i = iArr2[iRemoteActionCompatParcelizer];
                    if (i == -1) {
                        i = 0;
                    }
                    anchorInfo.IconCompatParcelizer = i;
                    size = flexboxLayoutManager.MediaBrowserCompatMediaItem.size();
                    i2 = anchorInfo.IconCompatParcelizer;
                    if (size > i2) {
                        anchorInfo.MediaBrowserCompatMediaItem = ((accessgetMediaSkipBackwardcp) flexboxLayoutManager.MediaBrowserCompatMediaItem.get(i2)).RatingCompat;
                    }
                } else {
                    AnchorInfo.serializer(anchorInfo);
                    anchorInfo.MediaBrowserCompatMediaItem = 0;
                    anchorInfo.IconCompatParcelizer = 0;
                }
            } else {
                AnchorInfo.serializer(anchorInfo);
                anchorInfo.MediaBrowserCompatMediaItem = 0;
                anchorInfo.IconCompatParcelizer = 0;
            }
            anchorInfo.RatingCompat = true;
        }
        IconCompatParcelizer(recycler);
        if (anchorInfo.read) {
            IconCompatParcelizer(anchorInfo, false, true);
        } else {
            write(anchorInfo, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.menuHostHelperlambda0, this.getSavedStateRegistryControllerannotations);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        int i12 = this.menuHostHelperlambda0;
        int i13 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        boolean z7 = read();
        Context context = this.write;
        if (z7) {
            int i14 = this.MediaSessionCompatResultReceiverWrapper;
            z3 = (i14 == Integer.MIN_VALUE || i14 == i12) ? false : true;
            accessgetMediaRecordcp accessgetmediarecordcp2 = this.PlaybackStateCompat;
            if (accessgetmediarecordcp2.read) {
                i4 = context.getResources().getDisplayMetrics().heightPixels;
            } else {
                i4 = accessgetmediarecordcp2.serializer;
            }
        } else {
            int i15 = this.PlaybackStateCompatCustomAction;
            z3 = (i15 == Integer.MIN_VALUE || i15 == i13) ? false : true;
            accessgetMediaRecordcp accessgetmediarecordcp3 = this.PlaybackStateCompat;
            if (accessgetmediarecordcp3.read) {
                i4 = context.getResources().getDisplayMetrics().widthPixels;
            } else {
                i4 = accessgetmediarecordcp3.serializer;
            }
        }
        int i16 = i4;
        this.MediaSessionCompatResultReceiverWrapper = i12;
        this.PlaybackStateCompatCustomAction = i13;
        int i17 = this.serializer;
        DeltaDecoder deltaDecoder = this.MediaDescriptionCompat;
        if (i17 == -1 && (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != -1 || z3)) {
            if (!anchorInfo.read) {
                this.MediaBrowserCompatMediaItem.clear();
                deltaDecoder.serializer = null;
                deltaDecoder.write = 0;
                boolean z8 = read();
                int i18 = anchorInfo.MediaBrowserCompatMediaItem;
                accessgetMediaRewindcp accessgetmediarewindcp2 = this.MediaSessionCompatQueueItem;
                DeltaDecoder deltaDecoder2 = this.MediaDescriptionCompat;
                if (z8) {
                    accessgetmediarewindcp2.read(deltaDecoder2, iMakeMeasureSpec, iMakeMeasureSpec2, i16, 0, i18, this.MediaBrowserCompatMediaItem);
                } else {
                    accessgetmediarewindcp2.read(deltaDecoder2, iMakeMeasureSpec2, iMakeMeasureSpec, i16, 0, i18, this.MediaBrowserCompatMediaItem);
                }
                this.MediaBrowserCompatMediaItem = (List) deltaDecoder.serializer;
                accessgetmediarewindcp.RemoteActionCompatParcelizer(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
                accessgetmediarewindcp.IconCompatParcelizer(0);
                int i19 = accessgetmediarewindcp.RemoteActionCompatParcelizer[anchorInfo.MediaBrowserCompatMediaItem];
                anchorInfo.IconCompatParcelizer = i19;
                this.PlaybackStateCompat.IconCompatParcelizer = i19;
            }
        } else {
            int iMin = anchorInfo.MediaBrowserCompatMediaItem;
            if (i17 != -1) {
                iMin = Math.min(i17, iMin);
            }
            int i20 = iMin;
            deltaDecoder.serializer = null;
            deltaDecoder.write = 0;
            boolean z9 = read();
            List list = this.MediaBrowserCompatMediaItem;
            if (z9) {
                if (list.size() > 0) {
                    accessgetmediarewindcp.write(i20, this.MediaBrowserCompatMediaItem);
                    this.MediaSessionCompatQueueItem.read(this.MediaDescriptionCompat, iMakeMeasureSpec, iMakeMeasureSpec2, i16, i20, anchorInfo.MediaBrowserCompatMediaItem, this.MediaBrowserCompatMediaItem);
                } else {
                    accessgetmediarewindcp.RemoteActionCompatParcelizer(iSerializer);
                    this.MediaSessionCompatQueueItem.read(this.MediaDescriptionCompat, iMakeMeasureSpec, iMakeMeasureSpec2, i16, 0, -1, this.MediaBrowserCompatMediaItem);
                }
            } else if (list.size() > 0) {
                accessgetmediarewindcp.write(i20, this.MediaBrowserCompatMediaItem);
                this.MediaSessionCompatQueueItem.read(this.MediaDescriptionCompat, iMakeMeasureSpec2, iMakeMeasureSpec, i16, i20, anchorInfo.MediaBrowserCompatMediaItem, this.MediaBrowserCompatMediaItem);
            } else {
                accessgetmediarewindcp.RemoteActionCompatParcelizer(iSerializer);
                this.MediaSessionCompatQueueItem.read(this.MediaDescriptionCompat, iMakeMeasureSpec2, iMakeMeasureSpec, i16, 0, -1, this.MediaBrowserCompatMediaItem);
            }
            this.MediaBrowserCompatMediaItem = (List) deltaDecoder.serializer;
            accessgetmediarewindcp.RemoteActionCompatParcelizer(iMakeMeasureSpec, iMakeMeasureSpec2, i20);
            accessgetmediarewindcp.IconCompatParcelizer(i20);
        }
        RemoteActionCompatParcelizer(recycler, getintrinsicsizenhjbrc, this.PlaybackStateCompat);
        boolean z10 = anchorInfo.read;
        accessgetMediaRecordcp accessgetmediarecordcp4 = this.PlaybackStateCompat;
        if (z10) {
            i6 = accessgetmediarecordcp4.MediaSessionCompatQueueItem;
            z4 = true;
            write(anchorInfo, true, false);
            RemoteActionCompatParcelizer(recycler, getintrinsicsizenhjbrc, this.PlaybackStateCompat);
            i5 = this.PlaybackStateCompat.MediaSessionCompatQueueItem;
        } else {
            z4 = true;
            i5 = accessgetmediarecordcp4.MediaSessionCompatQueueItem;
            IconCompatParcelizer(anchorInfo, true, false);
            RemoteActionCompatParcelizer(recycler, getintrinsicsizenhjbrc, this.PlaybackStateCompat);
            i6 = this.PlaybackStateCompat.MediaSessionCompatQueueItem;
        }
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() > 0) {
            if (anchorInfo.read) {
                write(serializer(i5, recycler, getintrinsicsizenhjbrc, z4) + i6, recycler, getintrinsicsizenhjbrc, false);
            } else {
                serializer(write(i6, recycler, getintrinsicsizenhjbrc, z4) + i5, recycler, getintrinsicsizenhjbrc, false);
            }
        }
    }

    @Override // o.accessgetMediaSkipForwardcp
    public final int serializer(int i, int i2, View view) {
        int i3;
        int i4;
        if (read()) {
            i3 = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.left;
            i4 = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.right;
        } else {
            i3 = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.top;
            i4 = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer.bottom;
        }
        return i3 + i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int serializer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (!read() || this.MediaMetadataCompat == 0) {
            int iWrite = write(i, recycler, getintrinsicsizenhjbrc);
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.clear();
            return iWrite;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer += iRemoteActionCompatParcelizer;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(-iRemoteActionCompatParcelizer);
        return iRemoteActionCompatParcelizer;
    }

    public final int serializer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, boolean z) {
        int iWrite;
        int iWrite2;
        if (read() || !this.MediaSessionCompatToken) {
            int iWrite3 = this.ResultReceiver.write() - i;
            if (iWrite3 <= 0) {
                return 0;
            }
            iWrite = -write(-iWrite3, recycler, getintrinsicsizenhjbrc);
        } else {
            int iIconCompatParcelizer = i - this.ResultReceiver.IconCompatParcelizer();
            if (iIconCompatParcelizer <= 0) {
                return 0;
            }
            iWrite = write(iIconCompatParcelizer, recycler, getintrinsicsizenhjbrc);
        }
        if (!z || (iWrite2 = this.ResultReceiver.write() - (i + iWrite)) <= 0) {
            return iWrite;
        }
        this.ResultReceiver.IconCompatParcelizer(iWrite2);
        return iWrite2 + iWrite;
    }

    public final boolean serializer(View view, int i, int i2, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this._init_lambda4 && RemoteActionCompatParcelizer(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && RemoteActionCompatParcelizer(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public final int write(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, boolean z) {
        int iWrite;
        if (read() || !this.MediaSessionCompatToken) {
            int iIconCompatParcelizer = i - this.ResultReceiver.IconCompatParcelizer();
            if (iIconCompatParcelizer <= 0) {
                return 0;
            }
            iWrite = -write(iIconCompatParcelizer, recycler, getintrinsicsizenhjbrc);
        } else {
            int iWrite2 = this.ResultReceiver.write() - i;
            if (iWrite2 <= 0) {
                return 0;
            }
            iWrite = write(-iWrite2, recycler, getintrinsicsizenhjbrc);
        }
        if (!z) {
            return iWrite;
        }
        int iIconCompatParcelizer2 = (i + iWrite) - this.ResultReceiver.IconCompatParcelizer();
        if (iIconCompatParcelizer2 <= 0) {
            return iWrite;
        }
        this.ResultReceiver.IconCompatParcelizer(-iIconCompatParcelizer2);
        return iWrite - iIconCompatParcelizer2;
    }

    public final void write(AnchorInfo anchorInfo, boolean z, boolean z2) {
        int i;
        int i2;
        if (z2) {
            if (read()) {
                i2 = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            } else {
                i2 = this.getSavedStateRegistryControllerannotations;
            }
            this.PlaybackStateCompat.read = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.PlaybackStateCompat.read = false;
        }
        if (!read() && this.MediaSessionCompatToken) {
            this.PlaybackStateCompat.serializer = anchorInfo.write - getPaddingRight();
        } else {
            this.PlaybackStateCompat.serializer = this.ResultReceiver.write() - anchorInfo.write;
        }
        accessgetMediaRecordcp accessgetmediarecordcp = this.PlaybackStateCompat;
        accessgetmediarecordcp.MediaMetadataCompat = anchorInfo.MediaBrowserCompatMediaItem;
        accessgetmediarecordcp.write = 1;
        accessgetmediarecordcp.MediaSessionCompatQueueItem = anchorInfo.write;
        accessgetmediarecordcp.MediaDescriptionCompat = Integer.MIN_VALUE;
        accessgetmediarecordcp.IconCompatParcelizer = anchorInfo.IconCompatParcelizer;
        if (!z || this.MediaBrowserCompatMediaItem.size() <= 1 || (i = anchorInfo.IconCompatParcelizer) < 0 || i >= this.MediaBrowserCompatMediaItem.size() - 1) {
            return;
        }
        accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(anchorInfo.IconCompatParcelizer);
        accessgetMediaRecordcp accessgetmediarecordcp2 = this.PlaybackStateCompat;
        accessgetmediarecordcp2.IconCompatParcelizer++;
        accessgetmediarecordcp2.MediaMetadataCompat += accessgetmediaskipbackwardcp.MediaDescriptionCompat;
    }

    public final View IconCompatParcelizer(int i) {
        View viewMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1, -1, i);
        if (viewMediaSessionCompatQueueItem == null) {
            return null;
        }
        return serializer(viewMediaSessionCompatQueueItem, (accessgetMediaSkipBackwardcp) this.MediaBrowserCompatMediaItem.get(this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer[RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatQueueItem)]));
    }

    public final int MediaBrowserCompatMediaItem(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return 0;
        }
        int iSerializer = getintrinsicsizenhjbrc.serializer();
        View viewSerializer = serializer(iSerializer);
        View viewIconCompatParcelizer = IconCompatParcelizer(iSerializer);
        if (getintrinsicsizenhjbrc.serializer() == 0 || viewSerializer == null || viewIconCompatParcelizer == null) {
            return 0;
        }
        int iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewSerializer);
        int iRemoteActionCompatParcelizer2 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewIconCompatParcelizer);
        int iAbs = Math.abs(this.ResultReceiver.write(viewIconCompatParcelizer) - this.ResultReceiver.RemoteActionCompatParcelizer(viewSerializer));
        int[] iArr = this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
        int i = iArr[iRemoteActionCompatParcelizer];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((iArr[iRemoteActionCompatParcelizer2] - i) + 1))) + (this.ResultReceiver.IconCompatParcelizer() - this.ResultReceiver.RemoteActionCompatParcelizer(viewSerializer)));
    }

    public final void MediaDescriptionCompat(int i) {
        View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1, -1);
        if (i >= (viewRemoteActionCompatParcelizer != null ? RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer) : -1)) {
            return;
        }
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        accessgetMediaRewindcp accessgetmediarewindcp = this.MediaSessionCompatQueueItem;
        accessgetmediarewindcp.read(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        accessgetmediarewindcp.serializer(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        accessgetmediarewindcp.RemoteActionCompatParcelizer(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        if (i >= accessgetmediarewindcp.RemoteActionCompatParcelizer.length) {
            return;
        }
        this.serializer = i;
        View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(0);
        if (viewMediaSessionCompatResultReceiverWrapper == null) {
            return;
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
        if (read() || !this.MediaSessionCompatToken) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = this.ResultReceiver.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper) - this.ResultReceiver.IconCompatParcelizer();
        } else {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = this.ResultReceiver.RemoteActionCompatParcelizer() + this.ResultReceiver.write(viewMediaSessionCompatResultReceiverWrapper);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void ParcelableVolumeInfo(int i) {
        MediaDescriptionCompat(i);
    }

    public final int RatingCompat(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return 0;
        }
        int iSerializer = getintrinsicsizenhjbrc.serializer();
        RemoteActionCompatParcelizer();
        View viewSerializer = serializer(iSerializer);
        View viewIconCompatParcelizer = IconCompatParcelizer(iSerializer);
        if (getintrinsicsizenhjbrc.serializer() == 0 || viewSerializer == null || viewIconCompatParcelizer == null) {
            return 0;
        }
        return Math.min(this.ResultReceiver.MediaDescriptionCompat(), this.ResultReceiver.write(viewIconCompatParcelizer) - this.ResultReceiver.RemoteActionCompatParcelizer(viewSerializer));
    }

    public final int MediaMetadataCompat(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0) {
            int iSerializer = getintrinsicsizenhjbrc.serializer();
            View viewSerializer = serializer(iSerializer);
            View viewIconCompatParcelizer = IconCompatParcelizer(iSerializer);
            if (getintrinsicsizenhjbrc.serializer() != 0 && viewSerializer != null && viewIconCompatParcelizer != null) {
                View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(0, r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
                int iRemoteActionCompatParcelizer = viewRemoteActionCompatParcelizer == null ? -1 : RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                View viewRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1, -1);
                return (int) ((Math.abs(this.ResultReceiver.write(viewIconCompatParcelizer) - this.ResultReceiver.RemoteActionCompatParcelizer(viewSerializer)) / (((viewRemoteActionCompatParcelizer2 != null ? RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer2) : -1) - iRemoteActionCompatParcelizer) + 1)) * getintrinsicsizenhjbrc.serializer());
            }
        }
        return 0;
    }

    @Override // o.applyToPq9zytI
    public final PointF MediaMetadataCompat(int i) {
        View viewMediaSessionCompatResultReceiverWrapper;
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0 || (viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(0)) == null) {
            return null;
        }
        int i2 = i < RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper) ? -1 : 1;
        return read() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    public final View RemoteActionCompatParcelizer(int i, int i2) {
        int i3 = i;
        int i4 = i2 > i3 ? 1 : -1;
        while (i3 != i2) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i5 = this.menuHostHelperlambda0;
            int paddingRight = getPaddingRight();
            int i6 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            int paddingBottom = getPaddingBottom();
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams();
            int iWrite = RecyclerView.LayoutManager.write(viewMediaSessionCompatResultReceiverWrapper);
            int i7 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).leftMargin;
            BlockGraphicsLayerElement blockGraphicsLayerElement2 = (BlockGraphicsLayerElement) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams();
            int iIconCompatParcelizer = RecyclerView.LayoutManager.IconCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
            int i8 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).topMargin;
            BlockGraphicsLayerElement blockGraphicsLayerElement3 = (BlockGraphicsLayerElement) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams();
            int iA_ = RecyclerView.LayoutManager.a_(viewMediaSessionCompatResultReceiverWrapper);
            int i9 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement3).rightMargin;
            BlockGraphicsLayerElement blockGraphicsLayerElement4 = (BlockGraphicsLayerElement) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams();
            int iSerializer = RecyclerView.LayoutManager.serializer(viewMediaSessionCompatResultReceiverWrapper);
            int i10 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement4).bottomMargin;
            boolean z = iWrite - i7 >= i5 - paddingRight || iA_ + i9 >= paddingLeft;
            boolean z2 = iIconCompatParcelizer - i8 >= i6 - paddingBottom || iSerializer + i10 >= paddingTop;
            if (z && z2) {
                return viewMediaSessionCompatResultReceiverWrapper;
            }
            i3 += i4;
        }
        return null;
    }

    public final int RemoteActionCompatParcelizer(int i) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0 || i == 0) {
            return 0;
        }
        RemoteActionCompatParcelizer();
        boolean z = read();
        View view = this.ComponentActivity;
        int width = z ? view.getWidth() : view.getHeight();
        int i2 = z ? this.menuHostHelperlambda0 : this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int layoutDirection = this.ensureViewModelStore.getLayoutDirection();
        AnchorInfo anchorInfo = this.RemoteActionCompatParcelizer;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + anchorInfo.RemoteActionCompatParcelizer) - width, iAbs);
            }
            int i3 = anchorInfo.RemoteActionCompatParcelizer;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - anchorInfo.RemoteActionCompatParcelizer) - width, i);
            }
            int i4 = anchorInfo.RemoteActionCompatParcelizer;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }
}
