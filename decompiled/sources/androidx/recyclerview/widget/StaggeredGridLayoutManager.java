package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import o.BlockGraphicsLayerElement;
import o.BlockGraphicsLayerModifier;
import o.FocusPropertiesNode;
import o.FocusRestorerKtsaveFocusedChild11;
import o.FocusRestorerNodeonExit1;
import o.applyToPq9zytI;
import o.getDstIn0nO6VwU;
import o.getIntrinsicSizeNHjbRc;
import o.getOverlay0nO6VwU;
import o.getSoftlight0nO6VwU;
import o.horizontalGradient8A3gB4;
import o.isActive;
import o.linearGradientmHitzGkdefault;
import o.radialGradientP_VxKs;
import o.verticalGradient8A3gB4;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements applyToPq9zytI {
    public final getSoftlight0nO6VwU ComponentActivity;
    public final linearGradientmHitzGkdefault IconCompatParcelizer;
    public final getOverlay0nO6VwU MediaBrowserCompatMediaItem;
    public final int MediaMetadataCompat;
    public SavedState MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final BitSet MediaSessionCompatToken;
    public final getSoftlight0nO6VwU PlaybackStateCompat;
    public int[] PlaybackStateCompatCustomAction;
    public final verticalGradient8A3gB4 RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final Rect r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final radialGradientP_VxKs[] r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public boolean read;
    public boolean serializer;
    public final getDstIn0nO6VwU write;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys = false;
    public int MediaDescriptionCompat = -1;
    public int ParcelableVolumeInfo = Integer.MIN_VALUE;

    @SuppressLint
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.IconCompatParcelizer = parcel.readInt();
                savedState.MediaDescriptionCompat = parcel.readInt();
                int i = parcel.readInt();
                savedState.MediaBrowserCompatMediaItem = i;
                if (i > 0) {
                    int[] iArr = new int[i];
                    savedState.RatingCompat = iArr;
                    parcel.readIntArray(iArr);
                }
                int i2 = parcel.readInt();
                savedState.MediaSessionCompatQueueItem = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    savedState.MediaMetadataCompat = iArr2;
                    parcel.readIntArray(iArr2);
                }
                savedState.RemoteActionCompatParcelizer = parcel.readInt() == 1;
                savedState.serializer = parcel.readInt() == 1;
                savedState.write = parcel.readInt() == 1;
                savedState.read = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
                return savedState;
            }
        };
        public int IconCompatParcelizer;
        public int MediaBrowserCompatMediaItem;
        public int MediaDescriptionCompat;
        public int[] MediaMetadataCompat;
        public int MediaSessionCompatQueueItem;
        public int[] RatingCompat;
        public boolean RemoteActionCompatParcelizer;
        public ArrayList read;
        public boolean serializer;
        public boolean write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeInt(this.MediaDescriptionCompat);
            parcel.writeInt(this.MediaBrowserCompatMediaItem);
            if (this.MediaBrowserCompatMediaItem > 0) {
                parcel.writeIntArray(this.RatingCompat);
            }
            parcel.writeInt(this.MediaSessionCompatQueueItem);
            if (this.MediaSessionCompatQueueItem > 0) {
                parcel.writeIntArray(this.MediaMetadataCompat);
            }
            parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
            parcel.writeInt(this.serializer ? 1 : 0);
            parcel.writeInt(this.write ? 1 : 0);
            parcel.writeList(this.read);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int IconCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaBrowserCompatMediaItem(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(int i, int i2) {
        serializer(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        serializer(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean MediaBrowserCompatMediaItem() {
        return this.MediaMetadataCompat == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean ParcelableVolumeInfo() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean PlaybackStateCompatCustomAction() {
        return this.RemoteActionCompatParcelizer != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean RatingCompat() {
        return this.MediaMetadataCompat == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int RemoteActionCompatParcelizer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return IconCompatParcelizer(i, recycler, getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void RemoteActionCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        this.MediaDescriptionCompat = -1;
        this.ParcelableVolumeInfo = Integer.MIN_VALUE;
        this.MediaSessionCompatQueueItem = null;
        this.IconCompatParcelizer.read();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean q_() {
        return this.MediaSessionCompatQueueItem == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(int i, int i2) {
        serializer(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int serializer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return IconCompatParcelizer(i, recycler, getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean serializer(BlockGraphicsLayerElement blockGraphicsLayerElement) {
        return blockGraphicsLayerElement instanceof horizontalGradient8A3gB4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int write(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaBrowserCompatMediaItem(getintrinsicsizenhjbrc);
    }

    public final View IconCompatParcelizer(boolean z) {
        getSoftlight0nO6VwU getsoftlight0no6vwu = this.PlaybackStateCompat;
        int iIconCompatParcelizer = getsoftlight0no6vwu.IconCompatParcelizer();
        int iWrite = getsoftlight0no6vwu.write();
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        View view = null;
        for (int i = 0; i < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i++) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i);
            int iRemoteActionCompatParcelizer = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
            if (getsoftlight0no6vwu.write(viewMediaSessionCompatResultReceiverWrapper) > iIconCompatParcelizer && iRemoteActionCompatParcelizer < iWrite) {
                if (iRemoteActionCompatParcelizer >= iIconCompatParcelizer || !z) {
                    return viewMediaSessionCompatResultReceiverWrapper;
                }
                if (view == null) {
                    view = viewMediaSessionCompatResultReceiverWrapper;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(RecyclerView recyclerView, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.MediaSessionCompatResultReceiverWrapper = i;
        write(linearSmoothScroller);
    }

    public final boolean MediaDescriptionCompat() {
        return this.ensureViewModelStore.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void PlaybackStateCompat(int i) {
        if (i == 0) {
            serializer();
        }
    }

    public final View RemoteActionCompatParcelizer(boolean z) {
        getSoftlight0nO6VwU getsoftlight0no6vwu = this.PlaybackStateCompat;
        int iIconCompatParcelizer = getsoftlight0no6vwu.IconCompatParcelizer();
        int iWrite = getsoftlight0no6vwu.write();
        View view = null;
        for (int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1; iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus >= 0; iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus--) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            int iRemoteActionCompatParcelizer = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
            int iWrite2 = getsoftlight0no6vwu.write(viewMediaSessionCompatResultReceiverWrapper);
            if (iWrite2 > iIconCompatParcelizer && iRemoteActionCompatParcelizer < iWrite) {
                if (iWrite2 <= iWrite || !z) {
                    return viewMediaSessionCompatResultReceiverWrapper;
                }
                if (view == null) {
                    view = viewMediaSessionCompatResultReceiverWrapper;
                }
            }
        }
        return view;
    }

    public final void RemoteActionCompatParcelizer(radialGradientP_VxKs radialgradientp_vxks, int i, int i2) {
        int i3 = radialgradientp_vxks.serializer;
        int i4 = radialgradientp_vxks.IconCompatParcelizer;
        BitSet bitSet = this.MediaSessionCompatToken;
        if (i != -1) {
            int i5 = radialgradientp_vxks.read;
            if (i5 == Integer.MIN_VALUE) {
                radialgradientp_vxks.write();
                i5 = radialgradientp_vxks.read;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = radialgradientp_vxks.RemoteActionCompatParcelizer;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) radialgradientp_vxks.write.get(0);
            horizontalGradient8A3gB4 horizontalgradient8a3gb4 = (horizontalGradient8A3gB4) view.getLayoutParams();
            radialgradientp_vxks.RemoteActionCompatParcelizer = radialgradientp_vxks.MediaSessionCompatQueueItem.PlaybackStateCompat.RemoteActionCompatParcelizer(view);
            horizontalgradient8a3gb4.getClass();
            i6 = radialgradientp_vxks.RemoteActionCompatParcelizer;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        this.RatingCompat.write();
        for (int i = 0; i < this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i++) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM[i].serializer();
        }
    }

    public final void read(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, boolean z) {
        int iWrite;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(Integer.MIN_VALUE);
        if (iRemoteActionCompatParcelizer != Integer.MIN_VALUE && (iWrite = this.PlaybackStateCompat.write() - iRemoteActionCompatParcelizer) > 0) {
            int i = iWrite - (-IconCompatParcelizer(-iWrite, recycler, getintrinsicsizenhjbrc));
            if (!z || i <= 0) {
                return;
            }
            this.PlaybackStateCompat.IconCompatParcelizer(i);
        }
    }

    public final void serializer(int i) {
        getOverlay0nO6VwU getoverlay0no6vwu = this.MediaBrowserCompatMediaItem;
        getoverlay0no6vwu.MediaBrowserCompatMediaItem = i;
        getoverlay0no6vwu.write = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write() {
        this.RatingCompat.write();
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write(int i, int i2) {
        serializer(i, i2, 8);
    }

    public final void write(int i, int i2, View view) {
        Rect rect = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        serializer(view, rect);
        horizontalGradient8A3gB4 horizontalgradient8a3gb4 = (horizontalGradient8A3gB4) view.getLayoutParams();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, ((ViewGroup.MarginLayoutParams) horizontalgradient8a3gb4).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) horizontalgradient8a3gb4).rightMargin + rect.right);
        int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i2, ((ViewGroup.MarginLayoutParams) horizontalgradient8a3gb4).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) horizontalgradient8a3gb4).bottomMargin + rect.bottom);
        if (RemoteActionCompatParcelizer(view, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, horizontalgradient8a3gb4)) {
            view.measure(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
        }
    }

    public final int RemoteActionCompatParcelizer(int i) {
        int i2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM[0].read(i);
        for (int i3 = 1; i3 < this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i3++) {
            int i4 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM[i3].read(i);
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public final void RemoteActionCompatParcelizer(int i, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        int iRemoteActionCompatParcelizer;
        int i2;
        if (i > 0) {
            iRemoteActionCompatParcelizer = MediaSessionCompatQueueItem();
            i2 = 1;
        } else {
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            i2 = -1;
        }
        getOverlay0nO6VwU getoverlay0no6vwu = this.MediaBrowserCompatMediaItem;
        getoverlay0no6vwu.RatingCompat = true;
        read(iRemoteActionCompatParcelizer, getintrinsicsizenhjbrc);
        serializer(i2);
        getoverlay0no6vwu.read = iRemoteActionCompatParcelizer + getoverlay0no6vwu.write;
        getoverlay0no6vwu.IconCompatParcelizer = Math.abs(i);
    }

    public final void RemoteActionCompatParcelizer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, boolean z) {
        int iIconCompatParcelizer;
        int iWrite = write(Integer.MAX_VALUE);
        if (iWrite != Integer.MAX_VALUE && (iIconCompatParcelizer = iWrite - this.PlaybackStateCompat.IconCompatParcelizer()) > 0) {
            int iIconCompatParcelizer2 = iIconCompatParcelizer - IconCompatParcelizer(iIconCompatParcelizer, recycler, getintrinsicsizenhjbrc);
            if (!z || iIconCompatParcelizer2 <= 0) {
                return;
            }
            this.PlaybackStateCompat.IconCompatParcelizer(-iIconCompatParcelizer2);
        }
    }

    public final void read(int i, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        int iMediaDescriptionCompat;
        int iMediaDescriptionCompat2;
        int i2;
        getOverlay0nO6VwU getoverlay0no6vwu = this.MediaBrowserCompatMediaItem;
        boolean z = false;
        getoverlay0no6vwu.IconCompatParcelizer = 0;
        getoverlay0no6vwu.read = i;
        LinearSmoothScroller linearSmoothScroller = this.addObserverForBackInvoker;
        getSoftlight0nO6VwU getsoftlight0no6vwu = this.PlaybackStateCompat;
        if (linearSmoothScroller == null || !linearSmoothScroller.PlaybackStateCompat || (i2 = getintrinsicsizenhjbrc.PlaybackStateCompat) == -1) {
            iMediaDescriptionCompat = 0;
            iMediaDescriptionCompat2 = 0;
        } else {
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == (i2 < i)) {
                iMediaDescriptionCompat = getsoftlight0no6vwu.MediaDescriptionCompat();
                iMediaDescriptionCompat2 = 0;
            } else {
                iMediaDescriptionCompat2 = getsoftlight0no6vwu.MediaDescriptionCompat();
                iMediaDescriptionCompat = 0;
            }
        }
        RecyclerView recyclerView = this.ensureViewModelStore;
        if (recyclerView == null || !recyclerView.ComponentActivity) {
            getoverlay0no6vwu.RemoteActionCompatParcelizer = getsoftlight0no6vwu.read() + iMediaDescriptionCompat;
            getoverlay0no6vwu.MediaDescriptionCompat = -iMediaDescriptionCompat2;
        } else {
            getoverlay0no6vwu.MediaDescriptionCompat = getsoftlight0no6vwu.IconCompatParcelizer() - iMediaDescriptionCompat2;
            getoverlay0no6vwu.RemoteActionCompatParcelizer = getsoftlight0no6vwu.write() + iMediaDescriptionCompat;
        }
        getoverlay0no6vwu.MediaSessionCompatQueueItem = false;
        getoverlay0no6vwu.RatingCompat = true;
        if (getsoftlight0no6vwu.serializer() == 0 && getsoftlight0no6vwu.read() == 0) {
            z = true;
        }
        getoverlay0no6vwu.serializer = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(AccessibilityEvent accessibilityEvent) {
        super.read(accessibilityEvent);
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() > 0) {
            View viewIconCompatParcelizer = IconCompatParcelizer(false);
            View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(false);
            if (viewIconCompatParcelizer == null || viewRemoteActionCompatParcelizer == null) {
                return;
            }
            int iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewIconCompatParcelizer);
            int iRemoteActionCompatParcelizer2 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
            if (iRemoteActionCompatParcelizer < iRemoteActionCompatParcelizer2) {
                accessibilityEvent.setFromIndex(iRemoteActionCompatParcelizer);
                accessibilityEvent.setToIndex(iRemoteActionCompatParcelizer2);
            } else {
                accessibilityEvent.setFromIndex(iRemoteActionCompatParcelizer2);
                accessibilityEvent.setToIndex(iRemoteActionCompatParcelizer);
            }
        }
    }

    public final int write(int i) {
        int iSerializer = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM[0].serializer(i);
        for (int i2 = 1; i2 < this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i2++) {
            int iSerializer2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM[i2].serializer(i);
            if (iSerializer2 < iSerializer) {
                iSerializer = iSerializer2;
            }
        }
        return iSerializer;
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -1;
        this.MediaSessionCompatResultReceiverWrapper = false;
        verticalGradient8A3gB4 verticalgradient8a3gb4 = new verticalGradient8A3gB4();
        this.RatingCompat = verticalgradient8a3gb4;
        this.RemoteActionCompatParcelizer = 2;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new Rect();
        this.IconCompatParcelizer = new linearGradientmHitzGkdefault(this);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
        this.write = new getDstIn0nO6VwU(2, this);
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = RecyclerView.LayoutManager.read(context, attributeSet, i, i2);
        int i3 = blockGraphicsLayerModifier.IconCompatParcelizer;
        if (i3 != 0 && i3 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid orientation.");
            throw null;
        }
        read((String) null);
        if (i3 != this.MediaMetadataCompat) {
            this.MediaMetadataCompat = i3;
            getSoftlight0nO6VwU getsoftlight0no6vwu = this.PlaybackStateCompat;
            this.PlaybackStateCompat = this.ComponentActivity;
            this.ComponentActivity = getsoftlight0no6vwu;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
        int i4 = blockGraphicsLayerModifier.RemoteActionCompatParcelizer;
        read((String) null);
        if (i4 != -1) {
            verticalgradient8a3gb4.write();
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4;
            this.MediaSessionCompatToken = new BitSet(i4);
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new radialGradientP_VxKs[i4];
            for (int i5 = 0; i5 < this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i5++) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM[i5] = new radialGradientP_VxKs(this, i5);
            }
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
        boolean z = blockGraphicsLayerModifier.serializer;
        read((String) null);
        SavedState savedState = this.MediaSessionCompatQueueItem;
        if (savedState != null && savedState.RemoteActionCompatParcelizer != z) {
            savedState.RemoteActionCompatParcelizer = z;
        }
        this.MediaSessionCompatResultReceiverWrapper = z;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        getOverlay0nO6VwU getoverlay0no6vwu = new getOverlay0nO6VwU();
        getoverlay0no6vwu.RatingCompat = true;
        getoverlay0no6vwu.MediaDescriptionCompat = 0;
        getoverlay0no6vwu.RemoteActionCompatParcelizer = 0;
        this.MediaBrowserCompatMediaItem = getoverlay0no6vwu;
        this.PlaybackStateCompat = getSoftlight0nO6VwU.IconCompatParcelizer(this, this.MediaMetadataCompat);
        this.ComponentActivity = getSoftlight0nO6VwU.IconCompatParcelizer(this, 1 - this.MediaMetadataCompat);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(Rect rect, int i, int i2) {
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.MediaMetadataCompat;
        int i4 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (i3 == 1) {
            int iHeight = rect.height();
            RecyclerView recyclerView = this.ensureViewModelStore;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            iIconCompatParcelizer2 = RecyclerView.LayoutManager.IconCompatParcelizer(i2, iHeight + paddingBottom, recyclerView.getMinimumHeight());
            iIconCompatParcelizer = RecyclerView.LayoutManager.IconCompatParcelizer(i, (this.ResultReceiver * i4) + paddingRight, this.ensureViewModelStore.getMinimumWidth());
        } else {
            int iWidth = rect.width();
            RecyclerView recyclerView2 = this.ensureViewModelStore;
            WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
            iIconCompatParcelizer = RecyclerView.LayoutManager.IconCompatParcelizer(i, iWidth + paddingRight, recyclerView2.getMinimumWidth());
            iIconCompatParcelizer2 = RecyclerView.LayoutManager.IconCompatParcelizer(i2, (this.ResultReceiver * i4) + paddingBottom, this.ensureViewModelStore.getMinimumHeight());
        }
        this.ensureViewModelStore.setMeasuredDimension(iIconCompatParcelizer, iIconCompatParcelizer2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void RatingCompat(int i) {
        SavedState savedState = this.MediaSessionCompatQueueItem;
        if (savedState != null && savedState.IconCompatParcelizer != i) {
            savedState.RatingCompat = null;
            savedState.MediaBrowserCompatMediaItem = 0;
            savedState.IconCompatParcelizer = -1;
            savedState.MediaDescriptionCompat = -1;
        }
        this.MediaDescriptionCompat = i;
        this.ParcelableVolumeInfo = Integer.MIN_VALUE;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int RemoteActionCompatParcelizer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (this.MediaMetadataCompat == 0) {
            return Math.min(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, getintrinsicsizenhjbrc.serializer());
        }
        return -1;
    }

    public final void RemoteActionCompatParcelizer(RecyclerView.Recycler recycler, getOverlay0nO6VwU getoverlay0no6vwu) {
        if (!getoverlay0no6vwu.RatingCompat || getoverlay0no6vwu.serializer) {
            return;
        }
        int i = getoverlay0no6vwu.IconCompatParcelizer;
        int i2 = getoverlay0no6vwu.MediaBrowserCompatMediaItem;
        if (i == 0) {
            if (i2 == -1) {
                IconCompatParcelizer(getoverlay0no6vwu.RemoteActionCompatParcelizer, recycler);
                return;
            } else {
                RemoteActionCompatParcelizer(getoverlay0no6vwu.MediaDescriptionCompat, recycler);
                return;
            }
        }
        int i3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        radialGradientP_VxKs[] radialgradientp_vxksArr = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = getoverlay0no6vwu.MediaDescriptionCompat;
            int iSerializer = radialgradientp_vxksArr[0].serializer(i5);
            while (i4 < i3) {
                int iSerializer2 = radialgradientp_vxksArr[i4].serializer(i5);
                if (iSerializer2 > iSerializer) {
                    iSerializer = iSerializer2;
                }
                i4++;
            }
            int i6 = i5 - iSerializer;
            int iMin = getoverlay0no6vwu.RemoteActionCompatParcelizer;
            if (i6 >= 0) {
                iMin -= Math.min(i6, getoverlay0no6vwu.IconCompatParcelizer);
            }
            IconCompatParcelizer(iMin, recycler);
            return;
        }
        int i7 = getoverlay0no6vwu.RemoteActionCompatParcelizer;
        int i8 = radialgradientp_vxksArr[0].read(i7);
        while (i4 < i3) {
            int i9 = radialgradientp_vxksArr[i4].read(i7);
            if (i9 < i8) {
                i8 = i9;
            }
            i4++;
        }
        int i10 = i8 - getoverlay0no6vwu.RemoteActionCompatParcelizer;
        int iMin2 = getoverlay0no6vwu.MediaDescriptionCompat;
        if (i10 >= 0) {
            iMin2 += Math.min(i10, getoverlay0no6vwu.IconCompatParcelizer);
        }
        RemoteActionCompatParcelizer(iMin2, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i2++) {
            radialGradientP_VxKs radialgradientp_vxks = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM[i2];
            int i3 = radialgradientp_vxks.RemoteActionCompatParcelizer;
            if (i3 != Integer.MIN_VALUE) {
                radialgradientp_vxks.RemoteActionCompatParcelizer = i3 + i;
            }
            int i4 = radialgradientp_vxks.read;
            if (i4 != Integer.MIN_VALUE) {
                radialgradientp_vxks.read = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i2++) {
            radialGradientP_VxKs radialgradientp_vxks = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM[i2];
            int i3 = radialgradientp_vxks.RemoteActionCompatParcelizer;
            if (i3 != Integer.MIN_VALUE) {
                radialgradientp_vxks.RemoteActionCompatParcelizer = i3 + i;
            }
            int i4 = radialgradientp_vxks.read;
            if (i4 != Integer.MIN_VALUE) {
                radialgradientp_vxks.read = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.ensureViewModelStore;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.write);
        }
        for (int i = 0; i < this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i++) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM[i].serializer();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(String str) {
        if (this.MediaSessionCompatQueueItem == null) {
            super.read(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0038  */
    /* JADX WARN: Code duplicated, block: B:26:0x003f  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e A[LOOP:0: B:25:0x003d->B:29:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051 A[EDGE_INSN: B:30:0x0051->B:31:0x0052 BREAK  A[LOOP:0: B:25:0x003d->B:29:0x004e]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[LOOP:1: B:34:0x0064->B:38:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0052 A[EDGE_INSN: B:65:0x0052->B:31:0x0052 BREAK  A[LOOP:0: B:25:0x003d->B:29:0x004e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0079 A[EDGE_INSN: B:67:0x0079->B:40:0x0079 BREAK  A[LOOP:1: B:34:0x0064->B:38:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public final void serializer(int i, int i2, int i3) {
        int i4;
        int i5;
        verticalGradient8A3gB4 verticalgradient8a3gb4;
        int[] iArr;
        int iMediaSessionCompatQueueItem;
        ArrayList arrayList;
        int i6;
        int[] iArr2;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        int size;
        int i7;
        int size2;
        int iMediaSessionCompatQueueItem2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys ? MediaSessionCompatQueueItem() : RemoteActionCompatParcelizer();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            verticalgradient8a3gb4 = this.RatingCompat;
            iArr = (int[]) verticalgradient8a3gb4.read;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                                break;
                            }
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).get(size2);
                            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.write == i5) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                        break;
                    }
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                        ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                    }
                    size = ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).size();
                    i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            i7 = -1;
                            break;
                        } else if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).get(i7)).write >= i5) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i7 != -1) {
                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).get(i7);
                        ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).remove(i7);
                        i6 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.write;
                    } else {
                        i6 = -1;
                    }
                } else {
                    i6 = -1;
                }
                iArr2 = (int[]) verticalgradient8a3gb4.read;
                if (i6 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = ((int[]) verticalgradient8a3gb4.read).length;
                } else {
                    Arrays.fill((int[]) verticalgradient8a3gb4.read, i5, Math.min(i6 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                verticalgradient8a3gb4.write(i, i2);
            } else if (i3 != 2) {
                verticalgradient8a3gb4.serializer(i, i2);
            } else if (i3 == 8) {
                verticalgradient8a3gb4.serializer(i, 1);
                verticalgradient8a3gb4.write(i2, 1);
            }
            if (i4 <= iMediaSessionCompatQueueItem2) {
                return;
            }
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                iMediaSessionCompatQueueItem = RemoteActionCompatParcelizer();
            } else {
                iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
            }
            if (i5 <= iMediaSessionCompatQueueItem) {
                r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
            }
        }
        i4 = i + i2;
        i5 = i;
        verticalgradient8a3gb4 = this.RatingCompat;
        iArr = (int[]) verticalgradient8a3gb4.read;
        if (iArr != null) {
            arrayList = (ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                            break;
                        }
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).get(size2);
                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.write == i5) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                    break;
                }
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                    ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                }
                size = ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).size();
                i7 = 0;
                while (true) {
                    if (i7 < size) {
                        i7 = -1;
                        break;
                    } else {
                        if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).get(i7)).write >= i5) {
                            break;
                            break;
                        }
                        i7++;
                    }
                }
                if (i7 != -1) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).get(i7);
                    ((ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer).remove(i7);
                    i6 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3.write;
                } else {
                    i6 = -1;
                }
            } else {
                i6 = -1;
            }
            iArr2 = (int[]) verticalgradient8a3gb4.read;
            if (i6 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) verticalgradient8a3gb4.read).length;
            } else {
                Arrays.fill((int[]) verticalgradient8a3gb4.read, i5, Math.min(i6 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            verticalgradient8a3gb4.write(i, i2);
        } else if (i3 != 2) {
            verticalgradient8a3gb4.serializer(i, i2);
        } else if (i3 == 8) {
            verticalgradient8a3gb4.serializer(i, 1);
            verticalgradient8a3gb4.write(i2, 1);
        }
        if (i4 <= iMediaSessionCompatQueueItem2) {
            return;
        }
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            iMediaSessionCompatQueueItem = RemoteActionCompatParcelizer();
        } else {
            iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        }
        if (i5 <= iMediaSessionCompatQueueItem) {
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.MediaSessionCompatQueueItem = savedState;
            if (this.MediaDescriptionCompat != -1) {
                savedState.IconCompatParcelizer = -1;
                savedState.MediaDescriptionCompat = -1;
                savedState.RatingCompat = null;
                savedState.MediaBrowserCompatMediaItem = 0;
                savedState.MediaSessionCompatQueueItem = 0;
                savedState.MediaMetadataCompat = null;
                savedState.read = null;
            }
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof horizontalGradient8A3gB4)) {
            IconCompatParcelizer(view, focusRestorerKtsaveFocusedChild11);
            return;
        }
        radialGradientP_VxKs radialgradientp_vxks = ((horizontalGradient8A3gB4) layoutParams).write;
        if (this.MediaMetadataCompat == 0) {
            focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(FocusRestorerNodeonExit1.serializer(radialgradientp_vxks == null ? -1 : radialgradientp_vxks.IconCompatParcelizer, 1, -1, -1, false));
        } else {
            focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(FocusRestorerNodeonExit1.serializer(-1, -1, radialgradientp_vxks == null ? -1 : radialgradientp_vxks.IconCompatParcelizer, 1, false));
        }
    }

    public static int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final void MediaSessionCompatResultReceiverWrapper() {
        if (this.MediaMetadataCompat == 1 || !MediaDescriptionCompat()) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = this.MediaSessionCompatResultReceiverWrapper;
        } else {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = !this.MediaSessionCompatResultReceiverWrapper;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        super.read(recycler, getintrinsicsizenhjbrc, focusRestorerKtsaveFocusedChild11);
        focusRestorerKtsaveFocusedChild11.read("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int serializer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (this.MediaMetadataCompat == 1) {
            return Math.min(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, getintrinsicsizenhjbrc.serializer());
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x018e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0190  */
    /* JADX WARN: Code duplicated, block: B:253:0x03e7  */
    public final void IconCompatParcelizer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        SavedState savedState;
        int iSerializer;
        int i2;
        boolean z4;
        int iRemoteActionCompatParcelizer;
        boolean z5;
        int iIconCompatParcelizer;
        int iRemoteActionCompatParcelizer2;
        int iIconCompatParcelizer2;
        int iIconCompatParcelizer3;
        SavedState savedState2 = this.MediaSessionCompatQueueItem;
        linearGradientmHitzGkdefault lineargradientmhitzgkdefault = this.IconCompatParcelizer;
        if ((savedState2 != null || this.MediaDescriptionCompat != -1) && getintrinsicsizenhjbrc.serializer() == 0) {
            write(recycler);
            lineargradientmhitzgkdefault.read();
            return;
        }
        boolean z6 = lineargradientmhitzgkdefault.MediaBrowserCompatMediaItem;
        StaggeredGridLayoutManager staggeredGridLayoutManager = lineargradientmhitzgkdefault.RatingCompat;
        boolean z7 = (z6 && this.MediaDescriptionCompat == -1 && this.MediaSessionCompatQueueItem == null) ? false : true;
        radialGradientP_VxKs[] radialgradientp_vxksArr = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        int i3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.RatingCompat;
        if (z7) {
            lineargradientmhitzgkdefault.read();
            SavedState savedState3 = this.MediaSessionCompatQueueItem;
            getSoftlight0nO6VwU getsoftlight0no6vwu = this.PlaybackStateCompat;
            if (savedState3 != null) {
                int i4 = savedState3.MediaBrowserCompatMediaItem;
                if (i4 > 0) {
                    if (i4 == i3) {
                        for (int i5 = 0; i5 < i3; i5++) {
                            radialgradientp_vxksArr[i5].serializer();
                            SavedState savedState4 = this.MediaSessionCompatQueueItem;
                            int i6 = savedState4.RatingCompat[i5];
                            if (i6 != Integer.MIN_VALUE) {
                                if (savedState4.serializer) {
                                    iIconCompatParcelizer3 = getsoftlight0no6vwu.write();
                                } else {
                                    iIconCompatParcelizer3 = getsoftlight0no6vwu.IconCompatParcelizer();
                                }
                                i6 += iIconCompatParcelizer3;
                            }
                            radialGradientP_VxKs radialgradientp_vxks = radialgradientp_vxksArr[i5];
                            radialgradientp_vxks.RemoteActionCompatParcelizer = i6;
                            radialgradientp_vxks.read = i6;
                        }
                    } else {
                        savedState3.RatingCompat = null;
                        savedState3.MediaBrowserCompatMediaItem = 0;
                        savedState3.MediaSessionCompatQueueItem = 0;
                        savedState3.MediaMetadataCompat = null;
                        savedState3.read = null;
                        savedState3.IconCompatParcelizer = savedState3.MediaDescriptionCompat;
                    }
                }
                SavedState savedState5 = this.MediaSessionCompatQueueItem;
                this.serializer = savedState5.write;
                boolean z8 = savedState5.RemoteActionCompatParcelizer;
                read((String) null);
                SavedState savedState6 = this.MediaSessionCompatQueueItem;
                if (savedState6 != null && savedState6.RemoteActionCompatParcelizer != z8) {
                    savedState6.RemoteActionCompatParcelizer = z8;
                }
                this.MediaSessionCompatResultReceiverWrapper = z8;
                r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                MediaSessionCompatResultReceiverWrapper();
                SavedState savedState7 = this.MediaSessionCompatQueueItem;
                int i7 = savedState7.IconCompatParcelizer;
                if (i7 != -1) {
                    this.MediaDescriptionCompat = i7;
                    lineargradientmhitzgkdefault.serializer = savedState7.serializer;
                } else {
                    lineargradientmhitzgkdefault.serializer = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                }
                if (savedState7.MediaSessionCompatQueueItem > 1) {
                    verticalgradient8a3gb4.read = savedState7.MediaMetadataCompat;
                    verticalgradient8a3gb4.RemoteActionCompatParcelizer = savedState7.read;
                }
            } else {
                MediaSessionCompatResultReceiverWrapper();
                lineargradientmhitzgkdefault.serializer = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            }
            if (getintrinsicsizenhjbrc.write) {
                i2 = -1;
            } else {
                int i8 = this.MediaDescriptionCompat;
                if (i8 == -1) {
                    i2 = -1;
                } else {
                    if (i8 >= 0 && i8 < getintrinsicsizenhjbrc.serializer()) {
                        SavedState savedState8 = this.MediaSessionCompatQueueItem;
                        if (savedState8 != null && savedState8.IconCompatParcelizer != -1 && savedState8.MediaBrowserCompatMediaItem >= 1) {
                            lineargradientmhitzgkdefault.IconCompatParcelizer = Integer.MIN_VALUE;
                            lineargradientmhitzgkdefault.read = this.MediaDescriptionCompat;
                        } else {
                            View viewMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(this.MediaDescriptionCompat);
                            if (viewMediaBrowserCompatMediaItem != null) {
                                if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                                    iRemoteActionCompatParcelizer2 = MediaSessionCompatQueueItem();
                                } else {
                                    iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
                                }
                                lineargradientmhitzgkdefault.read = iRemoteActionCompatParcelizer2;
                                if (this.ParcelableVolumeInfo != Integer.MIN_VALUE) {
                                    if (lineargradientmhitzgkdefault.serializer) {
                                        lineargradientmhitzgkdefault.IconCompatParcelizer = (getsoftlight0no6vwu.write() - this.ParcelableVolumeInfo) - getsoftlight0no6vwu.write(viewMediaBrowserCompatMediaItem);
                                    } else {
                                        lineargradientmhitzgkdefault.IconCompatParcelizer = (getsoftlight0no6vwu.IconCompatParcelizer() + this.ParcelableVolumeInfo) - getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewMediaBrowserCompatMediaItem);
                                    }
                                } else if (getsoftlight0no6vwu.IconCompatParcelizer(viewMediaBrowserCompatMediaItem) > getsoftlight0no6vwu.MediaDescriptionCompat()) {
                                    if (lineargradientmhitzgkdefault.serializer) {
                                        iIconCompatParcelizer2 = getsoftlight0no6vwu.write();
                                    } else {
                                        iIconCompatParcelizer2 = getsoftlight0no6vwu.IconCompatParcelizer();
                                    }
                                    lineargradientmhitzgkdefault.IconCompatParcelizer = iIconCompatParcelizer2;
                                } else {
                                    int iRemoteActionCompatParcelizer3 = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewMediaBrowserCompatMediaItem) - getsoftlight0no6vwu.IconCompatParcelizer();
                                    if (iRemoteActionCompatParcelizer3 < 0) {
                                        lineargradientmhitzgkdefault.IconCompatParcelizer = -iRemoteActionCompatParcelizer3;
                                    } else {
                                        int iWrite = getsoftlight0no6vwu.write() - getsoftlight0no6vwu.write(viewMediaBrowserCompatMediaItem);
                                        if (iWrite < 0) {
                                            lineargradientmhitzgkdefault.IconCompatParcelizer = iWrite;
                                        } else {
                                            lineargradientmhitzgkdefault.IconCompatParcelizer = Integer.MIN_VALUE;
                                        }
                                    }
                                }
                            } else {
                                int i9 = this.MediaDescriptionCompat;
                                lineargradientmhitzgkdefault.read = i9;
                                int i10 = this.ParcelableVolumeInfo;
                                if (i10 == Integer.MIN_VALUE) {
                                    if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
                                        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                    } else if ((i9 < RemoteActionCompatParcelizer()) != this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    lineargradientmhitzgkdefault.serializer = z5;
                                    getSoftlight0nO6VwU getsoftlight0no6vwu2 = staggeredGridLayoutManager.PlaybackStateCompat;
                                    if (z5) {
                                        iIconCompatParcelizer = getsoftlight0no6vwu2.write();
                                    } else {
                                        iIconCompatParcelizer = getsoftlight0no6vwu2.IconCompatParcelizer();
                                    }
                                    lineargradientmhitzgkdefault.IconCompatParcelizer = iIconCompatParcelizer;
                                } else {
                                    boolean z9 = lineargradientmhitzgkdefault.serializer;
                                    getSoftlight0nO6VwU getsoftlight0no6vwu3 = staggeredGridLayoutManager.PlaybackStateCompat;
                                    if (z9) {
                                        lineargradientmhitzgkdefault.IconCompatParcelizer = getsoftlight0no6vwu3.write() - i10;
                                    } else {
                                        lineargradientmhitzgkdefault.IconCompatParcelizer = getsoftlight0no6vwu3.IconCompatParcelizer() + i10;
                                    }
                                }
                                z4 = true;
                                lineargradientmhitzgkdefault.write = true;
                            }
                        }
                        z4 = true;
                    } else {
                        i2 = -1;
                        this.MediaDescriptionCompat = -1;
                        this.ParcelableVolumeInfo = Integer.MIN_VALUE;
                    }
                    lineargradientmhitzgkdefault.MediaBrowserCompatMediaItem = z4;
                }
            }
            if (this.read) {
                int iSerializer2 = getintrinsicsizenhjbrc.serializer();
                int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() + i2;
                while (true) {
                    if (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus < 0) {
                        iRemoteActionCompatParcelizer = 0;
                        break;
                    }
                    iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus));
                    if (iRemoteActionCompatParcelizer >= 0 && iRemoteActionCompatParcelizer < iSerializer2) {
                        break;
                    } else {
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus--;
                    }
                }
            } else {
                int iSerializer3 = getintrinsicsizenhjbrc.serializer();
                int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                int i11 = 0;
                while (true) {
                    if (i11 >= iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2) {
                        iRemoteActionCompatParcelizer = 0;
                        break;
                    }
                    int iRemoteActionCompatParcelizer4 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(i11));
                    if (iRemoteActionCompatParcelizer4 >= 0 && iRemoteActionCompatParcelizer4 < iSerializer3) {
                        iRemoteActionCompatParcelizer = iRemoteActionCompatParcelizer4;
                        break;
                    }
                    i11++;
                }
            }
            lineargradientmhitzgkdefault.read = iRemoteActionCompatParcelizer;
            lineargradientmhitzgkdefault.IconCompatParcelizer = Integer.MIN_VALUE;
            z4 = true;
            lineargradientmhitzgkdefault.MediaBrowserCompatMediaItem = z4;
        }
        if (this.MediaSessionCompatQueueItem == null && this.MediaDescriptionCompat == -1 && !(lineargradientmhitzgkdefault.serializer == this.read && MediaDescriptionCompat() == this.serializer)) {
            verticalgradient8a3gb4.write();
            i = 1;
            lineargradientmhitzgkdefault.write = true;
        } else {
            i = 1;
        }
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() > 0 && ((savedState = this.MediaSessionCompatQueueItem) == null || savedState.MediaBrowserCompatMediaItem < i)) {
            if (lineargradientmhitzgkdefault.write) {
                for (int i12 = 0; i12 < i3; i12++) {
                    radialgradientp_vxksArr[i12].serializer();
                    int i13 = lineargradientmhitzgkdefault.IconCompatParcelizer;
                    if (i13 != Integer.MIN_VALUE) {
                        radialGradientP_VxKs radialgradientp_vxks2 = radialgradientp_vxksArr[i12];
                        radialgradientp_vxks2.RemoteActionCompatParcelizer = i13;
                        radialgradientp_vxks2.read = i13;
                    }
                }
            } else if (z7 || lineargradientmhitzgkdefault.RemoteActionCompatParcelizer == null) {
                for (int i14 = 0; i14 < i3; i14++) {
                    radialGradientP_VxKs radialgradientp_vxks3 = radialgradientp_vxksArr[i14];
                    boolean z10 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    int i15 = lineargradientmhitzgkdefault.IconCompatParcelizer;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = radialgradientp_vxks3.MediaSessionCompatQueueItem;
                    if (z10) {
                        iSerializer = radialgradientp_vxks3.read(Integer.MIN_VALUE);
                    } else {
                        iSerializer = radialgradientp_vxks3.serializer(Integer.MIN_VALUE);
                    }
                    radialgradientp_vxks3.serializer();
                    if (iSerializer != Integer.MIN_VALUE && ((!z10 || iSerializer >= staggeredGridLayoutManager2.PlaybackStateCompat.write()) && (z10 || iSerializer <= staggeredGridLayoutManager2.PlaybackStateCompat.IconCompatParcelizer()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            iSerializer += i15;
                        }
                        radialgradientp_vxks3.read = iSerializer;
                        radialgradientp_vxks3.RemoteActionCompatParcelizer = iSerializer;
                    }
                }
                int length = radialgradientp_vxksArr.length;
                int[] iArr = lineargradientmhitzgkdefault.RemoteActionCompatParcelizer;
                if (iArr == null || iArr.length < length) {
                    lineargradientmhitzgkdefault.RemoteActionCompatParcelizer = new int[staggeredGridLayoutManager.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    lineargradientmhitzgkdefault.RemoteActionCompatParcelizer[i16] = radialgradientp_vxksArr[i16].serializer(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i3; i17++) {
                    radialGradientP_VxKs radialgradientp_vxks4 = radialgradientp_vxksArr[i17];
                    radialgradientp_vxks4.serializer();
                    int i18 = lineargradientmhitzgkdefault.RemoteActionCompatParcelizer[i17];
                    radialgradientp_vxks4.RemoteActionCompatParcelizer = i18;
                    radialgradientp_vxks4.read = i18;
                }
            }
        }
        IconCompatParcelizer(recycler);
        getOverlay0nO6VwU getoverlay0no6vwu = this.MediaBrowserCompatMediaItem;
        getoverlay0no6vwu.RatingCompat = false;
        getSoftlight0nO6VwU getsoftlight0no6vwu4 = this.ComponentActivity;
        int iMediaDescriptionCompat = getsoftlight0no6vwu4.MediaDescriptionCompat();
        this.ResultReceiver = iMediaDescriptionCompat / i3;
        View.MeasureSpec.makeMeasureSpec(iMediaDescriptionCompat, getsoftlight0no6vwu4.serializer());
        read(lineargradientmhitzgkdefault.read, getintrinsicsizenhjbrc);
        if (lineargradientmhitzgkdefault.serializer) {
            serializer(-1);
            read(recycler, getoverlay0no6vwu, getintrinsicsizenhjbrc);
            serializer(1);
            getoverlay0no6vwu.read = lineargradientmhitzgkdefault.read + getoverlay0no6vwu.write;
            read(recycler, getoverlay0no6vwu, getintrinsicsizenhjbrc);
        } else {
            serializer(1);
            read(recycler, getoverlay0no6vwu, getintrinsicsizenhjbrc);
            serializer(-1);
            getoverlay0no6vwu.read = lineargradientmhitzgkdefault.read + getoverlay0no6vwu.write;
            read(recycler, getoverlay0no6vwu, getintrinsicsizenhjbrc);
        }
        if (getsoftlight0no6vwu4.serializer() != 1073741824) {
            int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            float fMax = 0.0f;
            for (int i19 = 0; i19 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus3; i19++) {
                View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i19);
                float fIconCompatParcelizer = getsoftlight0no6vwu4.IconCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
                if (fIconCompatParcelizer >= fMax) {
                    ((horizontalGradient8A3gB4) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fIconCompatParcelizer);
                }
            }
            int i20 = this.ResultReceiver;
            int iRound = Math.round(fMax * i3);
            if (getsoftlight0no6vwu4.serializer() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, getsoftlight0no6vwu4.MediaDescriptionCompat());
            }
            this.ResultReceiver = iRound / i3;
            View.MeasureSpec.makeMeasureSpec(iRound, getsoftlight0no6vwu4.serializer());
            if (this.ResultReceiver != i20) {
                for (int i21 = 0; i21 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus3; i21++) {
                    View viewMediaSessionCompatResultReceiverWrapper2 = MediaSessionCompatResultReceiverWrapper(i21);
                    horizontalGradient8A3gB4 horizontalgradient8a3gb4 = (horizontalGradient8A3gB4) viewMediaSessionCompatResultReceiverWrapper2.getLayoutParams();
                    horizontalgradient8a3gb4.getClass();
                    boolean zMediaDescriptionCompat = MediaDescriptionCompat();
                    int i22 = this.MediaMetadataCompat;
                    if (zMediaDescriptionCompat && i22 == 1) {
                        int i23 = -((i3 - 1) - horizontalgradient8a3gb4.write.IconCompatParcelizer);
                        viewMediaSessionCompatResultReceiverWrapper2.offsetLeftAndRight((this.ResultReceiver * i23) - (i23 * i20));
                    } else {
                        int i24 = horizontalgradient8a3gb4.write.IconCompatParcelizer;
                        int i25 = this.ResultReceiver * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            viewMediaSessionCompatResultReceiverWrapper2.offsetLeftAndRight(i25 - i26);
                        } else {
                            viewMediaSessionCompatResultReceiverWrapper2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() <= 0) {
            z2 = true;
        } else if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            z2 = true;
            read(recycler, getintrinsicsizenhjbrc, true);
            RemoteActionCompatParcelizer(recycler, getintrinsicsizenhjbrc, false);
        } else {
            z2 = true;
            RemoteActionCompatParcelizer(recycler, getintrinsicsizenhjbrc, true);
            read(recycler, getintrinsicsizenhjbrc, false);
        }
        if (!z || getintrinsicsizenhjbrc.write || this.RemoteActionCompatParcelizer == 0 || r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() <= 0 || MediaMetadataCompat() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.write);
            }
            if (serializer()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (getintrinsicsizenhjbrc.write) {
            lineargradientmhitzgkdefault.read();
        }
        this.read = lineargradientmhitzgkdefault.serializer;
        this.serializer = MediaDescriptionCompat();
        if (z3) {
            lineargradientmhitzgkdefault.read();
            IconCompatParcelizer(recycler, getintrinsicsizenhjbrc, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int iSerializer;
        int iIconCompatParcelizer;
        int[] iArr;
        SavedState savedState = this.MediaSessionCompatQueueItem;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.MediaBrowserCompatMediaItem = savedState.MediaBrowserCompatMediaItem;
            savedState2.IconCompatParcelizer = savedState.IconCompatParcelizer;
            savedState2.MediaDescriptionCompat = savedState.MediaDescriptionCompat;
            savedState2.RatingCompat = savedState.RatingCompat;
            savedState2.MediaSessionCompatQueueItem = savedState.MediaSessionCompatQueueItem;
            savedState2.MediaMetadataCompat = savedState.MediaMetadataCompat;
            savedState2.RemoteActionCompatParcelizer = savedState.RemoteActionCompatParcelizer;
            savedState2.serializer = savedState.serializer;
            savedState2.write = savedState.write;
            savedState2.read = savedState.read;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.RemoteActionCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper;
        savedState3.serializer = this.read;
        savedState3.write = this.serializer;
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.RatingCompat;
        if (verticalgradient8a3gb4 == null || (iArr = (int[]) verticalgradient8a3gb4.read) == null) {
            savedState3.MediaSessionCompatQueueItem = 0;
        } else {
            savedState3.MediaMetadataCompat = iArr;
            savedState3.MediaSessionCompatQueueItem = iArr.length;
            savedState3.read = (ArrayList) verticalgradient8a3gb4.RemoteActionCompatParcelizer;
        }
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() <= 0) {
            savedState3.IconCompatParcelizer = -1;
            savedState3.MediaDescriptionCompat = -1;
            savedState3.MediaBrowserCompatMediaItem = 0;
            return savedState3;
        }
        savedState3.IconCompatParcelizer = this.read ? MediaSessionCompatQueueItem() : RemoteActionCompatParcelizer();
        View viewRemoteActionCompatParcelizer = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys ? RemoteActionCompatParcelizer(true) : IconCompatParcelizer(true);
        savedState3.MediaDescriptionCompat = viewRemoteActionCompatParcelizer != null ? RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer) : -1;
        int i = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        savedState3.MediaBrowserCompatMediaItem = i;
        savedState3.RatingCompat = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.read;
            getSoftlight0nO6VwU getsoftlight0no6vwu = this.PlaybackStateCompat;
            radialGradientP_VxKs[] radialgradientp_vxksArr = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (z) {
                iSerializer = radialgradientp_vxksArr[i2].read(Integer.MIN_VALUE);
                if (iSerializer != Integer.MIN_VALUE) {
                    iIconCompatParcelizer = getsoftlight0no6vwu.write();
                    iSerializer -= iIconCompatParcelizer;
                }
            } else {
                iSerializer = radialgradientp_vxksArr[i2].serializer(Integer.MIN_VALUE);
                if (iSerializer != Integer.MIN_VALUE) {
                    iIconCompatParcelizer = getsoftlight0no6vwu.IconCompatParcelizer();
                    iSerializer -= iIconCompatParcelizer;
                }
            }
            savedState3.RatingCompat[i2] = iSerializer;
        }
        return savedState3;
    }

    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    public final int read(RecyclerView.Recycler recycler, getOverlay0nO6VwU getoverlay0no6vwu, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        int i;
        radialGradientP_VxKs[] radialgradientp_vxksArr;
        int iIconCompatParcelizer;
        int iRemoteActionCompatParcelizer;
        int i2;
        getOverlay0nO6VwU getoverlay0no6vwu2;
        radialGradientP_VxKs radialgradientp_vxks;
        ?? r5;
        int iSerializer;
        int iIconCompatParcelizer2;
        int i3;
        int iIconCompatParcelizer3;
        int iWrite;
        BitSet bitSet;
        int i4;
        int i5;
        int i6;
        RecyclerView.Recycler recycler2 = recycler;
        BitSet bitSet2 = this.MediaSessionCompatToken;
        int i7 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        bitSet2.set(0, i7, true);
        getOverlay0nO6VwU getoverlay0no6vwu3 = this.MediaBrowserCompatMediaItem;
        if (getoverlay0no6vwu3.serializer) {
            i = getoverlay0no6vwu.MediaBrowserCompatMediaItem == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else if (getoverlay0no6vwu.MediaBrowserCompatMediaItem == 1) {
            i = getoverlay0no6vwu.RemoteActionCompatParcelizer + getoverlay0no6vwu.IconCompatParcelizer;
        } else {
            i = getoverlay0no6vwu.MediaDescriptionCompat - getoverlay0no6vwu.IconCompatParcelizer;
        }
        int i8 = getoverlay0no6vwu.MediaBrowserCompatMediaItem;
        int i9 = 0;
        while (true) {
            radialgradientp_vxksArr = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (i9 >= i7) {
                break;
            }
            if (!radialgradientp_vxksArr[i9].write.isEmpty()) {
                RemoteActionCompatParcelizer(radialgradientp_vxksArr[i9], i8, i);
            }
            i9++;
        }
        boolean z = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getSoftlight0nO6VwU getsoftlight0no6vwu = this.PlaybackStateCompat;
        if (z) {
            iIconCompatParcelizer = getsoftlight0no6vwu.write();
        } else {
            iIconCompatParcelizer = getsoftlight0no6vwu.IconCompatParcelizer();
        }
        int i10 = 0;
        while (true) {
            int i11 = getoverlay0no6vwu.read;
            if (i11 < 0 || i11 >= getintrinsicsizenhjbrc.serializer() || (!getoverlay0no6vwu3.serializer && bitSet2.isEmpty())) {
                break;
            }
            View view = recycler2.tryGetViewHolderForPositionByDeadline(getoverlay0no6vwu.read, Long.MAX_VALUE).MediaSessionCompatQueueItem;
            getoverlay0no6vwu.read += getoverlay0no6vwu.write;
            horizontalGradient8A3gB4 horizontalgradient8a3gb4 = (horizontalGradient8A3gB4) view.getLayoutParams();
            int layoutPosition = horizontalgradient8a3gb4.MediaMetadataCompat.getLayoutPosition();
            verticalGradient8A3gB4 verticalgradient8a3gb4 = this.RatingCompat;
            int[] iArr = (int[]) verticalgradient8a3gb4.read;
            int i12 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i12 == -1) {
                if (IconCompatParcelizer(getoverlay0no6vwu.MediaBrowserCompatMediaItem)) {
                    i6 = i7 - 1;
                    i4 = -1;
                    i5 = -1;
                } else {
                    i4 = i7;
                    i5 = 1;
                    i6 = 0;
                }
                radialGradientP_VxKs radialgradientp_vxks2 = null;
                if (getoverlay0no6vwu.MediaBrowserCompatMediaItem == 1) {
                    int iIconCompatParcelizer4 = getsoftlight0no6vwu.IconCompatParcelizer();
                    int i13 = i6;
                    int i14 = Integer.MAX_VALUE;
                    while (i13 != i4) {
                        getOverlay0nO6VwU getoverlay0no6vwu4 = getoverlay0no6vwu3;
                        radialGradientP_VxKs radialgradientp_vxks3 = radialgradientp_vxksArr[i13];
                        int i15 = i7;
                        int i16 = radialgradientp_vxks3.read(iIconCompatParcelizer4);
                        if (i16 < i14) {
                            i14 = i16;
                            radialgradientp_vxks2 = radialgradientp_vxks3;
                        }
                        i13 += i5;
                        getoverlay0no6vwu3 = getoverlay0no6vwu4;
                        i7 = i15;
                    }
                    i2 = i7;
                    getoverlay0no6vwu2 = getoverlay0no6vwu3;
                } else {
                    i2 = i7;
                    getoverlay0no6vwu2 = getoverlay0no6vwu3;
                    int iWrite2 = getsoftlight0no6vwu.write();
                    int i17 = Integer.MIN_VALUE;
                    for (int i18 = i6; i18 != i4; i18 += i5) {
                        radialGradientP_VxKs radialgradientp_vxks4 = radialgradientp_vxksArr[i18];
                        int iSerializer2 = radialgradientp_vxks4.serializer(iWrite2);
                        if (iSerializer2 > i17) {
                            radialgradientp_vxks2 = radialgradientp_vxks4;
                            i17 = iSerializer2;
                        }
                    }
                }
                radialgradientp_vxks = radialgradientp_vxks2;
                verticalgradient8a3gb4.read(layoutPosition);
                ((int[]) verticalgradient8a3gb4.read)[layoutPosition] = radialgradientp_vxks.IconCompatParcelizer;
            } else {
                bitSet2 = bitSet2;
                i2 = i7;
                getoverlay0no6vwu2 = getoverlay0no6vwu3;
                i = i;
                radialgradientp_vxks = radialgradientp_vxksArr[i12];
            }
            horizontalgradient8a3gb4.write = radialgradientp_vxks;
            if (getoverlay0no6vwu.MediaBrowserCompatMediaItem == 1) {
                r5 = 0;
                addViewInt(view, -1, false);
            } else {
                r5 = 0;
                addViewInt(view, 0, false);
            }
            int i19 = this.MediaMetadataCompat;
            if (i19 == 1) {
                write(RecyclerView.LayoutManager.write(this.ResultReceiver, this.getSavedStateRegistryControllerannotations, (int) r5, ((ViewGroup.MarginLayoutParams) horizontalgradient8a3gb4).width, (boolean) r5), RecyclerView.LayoutManager.write(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) horizontalgradient8a3gb4).height, true), view);
            } else {
                write(RecyclerView.LayoutManager.write(this.menuHostHelperlambda0, this.getSavedStateRegistryControllerannotations, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) horizontalgradient8a3gb4).width, true), RecyclerView.LayoutManager.write(this.ResultReceiver, this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, 0, ((ViewGroup.MarginLayoutParams) horizontalgradient8a3gb4).height, false), view);
            }
            if (getoverlay0no6vwu.MediaBrowserCompatMediaItem == 1) {
                iIconCompatParcelizer2 = radialgradientp_vxks.read(iIconCompatParcelizer);
                iSerializer = getsoftlight0no6vwu.IconCompatParcelizer(view) + iIconCompatParcelizer2;
            } else {
                iSerializer = radialgradientp_vxks.serializer(iIconCompatParcelizer);
                iIconCompatParcelizer2 = iSerializer - getsoftlight0no6vwu.IconCompatParcelizer(view);
            }
            int i20 = getoverlay0no6vwu.MediaBrowserCompatMediaItem;
            radialGradientP_VxKs radialgradientp_vxks5 = horizontalgradient8a3gb4.write;
            if (i20 == 1) {
                radialgradientp_vxks5.getClass();
                horizontalGradient8A3gB4 horizontalgradient8a3gb5 = (horizontalGradient8A3gB4) view.getLayoutParams();
                horizontalgradient8a3gb5.write = radialgradientp_vxks5;
                ArrayList arrayList = radialgradientp_vxks5.write;
                arrayList.add(view);
                radialgradientp_vxks5.read = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    radialgradientp_vxks5.RemoteActionCompatParcelizer = Integer.MIN_VALUE;
                }
                if (horizontalgradient8a3gb5.MediaMetadataCompat.isRemoved() || horizontalgradient8a3gb5.MediaMetadataCompat.isUpdated()) {
                    radialgradientp_vxks5.serializer = radialgradientp_vxks5.MediaSessionCompatQueueItem.PlaybackStateCompat.IconCompatParcelizer(view) + radialgradientp_vxks5.serializer;
                }
            } else {
                radialgradientp_vxks5.getClass();
                horizontalGradient8A3gB4 horizontalgradient8a3gb6 = (horizontalGradient8A3gB4) view.getLayoutParams();
                horizontalgradient8a3gb6.write = radialgradientp_vxks5;
                ArrayList arrayList2 = radialgradientp_vxks5.write;
                arrayList2.add(0, view);
                radialgradientp_vxks5.RemoteActionCompatParcelizer = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    radialgradientp_vxks5.read = Integer.MIN_VALUE;
                }
                if (horizontalgradient8a3gb6.MediaMetadataCompat.isRemoved() || horizontalgradient8a3gb6.MediaMetadataCompat.isUpdated()) {
                    radialgradientp_vxks5.serializer = radialgradientp_vxks5.MediaSessionCompatQueueItem.PlaybackStateCompat.IconCompatParcelizer(view) + radialgradientp_vxks5.serializer;
                }
            }
            boolean zMediaDescriptionCompat = MediaDescriptionCompat();
            getSoftlight0nO6VwU getsoftlight0no6vwu2 = this.ComponentActivity;
            if (zMediaDescriptionCompat && i19 == 1) {
                iWrite = getsoftlight0no6vwu2.write() - (((i2 - 1) - radialgradientp_vxks.IconCompatParcelizer) * this.ResultReceiver);
                iIconCompatParcelizer3 = iWrite - getsoftlight0no6vwu2.IconCompatParcelizer(view);
                i3 = 1;
            } else {
                int iIconCompatParcelizer5 = (radialgradientp_vxks.IconCompatParcelizer * this.ResultReceiver) + getsoftlight0no6vwu2.IconCompatParcelizer();
                int iIconCompatParcelizer6 = getsoftlight0no6vwu2.IconCompatParcelizer(view) + iIconCompatParcelizer5;
                i3 = 1;
                iIconCompatParcelizer3 = iIconCompatParcelizer5;
                iWrite = iIconCompatParcelizer6;
            }
            if (i19 == i3) {
                RecyclerView.LayoutManager.write(view, iIconCompatParcelizer3, iIconCompatParcelizer2, iWrite, iSerializer);
            } else {
                RecyclerView.LayoutManager.write(view, iIconCompatParcelizer2, iIconCompatParcelizer3, iSerializer, iWrite);
            }
            getOverlay0nO6VwU getoverlay0no6vwu5 = getoverlay0no6vwu2;
            int i21 = i;
            RemoteActionCompatParcelizer(radialgradientp_vxks, getoverlay0no6vwu5.MediaBrowserCompatMediaItem, i21);
            RemoteActionCompatParcelizer(recycler, getoverlay0no6vwu5);
            if (getoverlay0no6vwu5.MediaSessionCompatQueueItem && view.hasFocusable()) {
                bitSet = bitSet2;
                bitSet.set(radialgradientp_vxks.IconCompatParcelizer, false);
            } else {
                bitSet = bitSet2;
            }
            getoverlay0no6vwu3 = getoverlay0no6vwu5;
            recycler2 = recycler;
            bitSet2 = bitSet;
            i10 = i3;
            i7 = i2;
            i = i21;
        }
        RecyclerView.Recycler recycler3 = recycler2;
        getOverlay0nO6VwU getoverlay0no6vwu6 = getoverlay0no6vwu3;
        if (i10 == 0) {
            RemoteActionCompatParcelizer(recycler3, getoverlay0no6vwu6);
        }
        if (getoverlay0no6vwu6.MediaBrowserCompatMediaItem == -1) {
            iRemoteActionCompatParcelizer = getsoftlight0no6vwu.IconCompatParcelizer() - write(getsoftlight0no6vwu.IconCompatParcelizer());
        } else {
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getsoftlight0no6vwu.write()) - getsoftlight0no6vwu.write();
        }
        if (iRemoteActionCompatParcelizer > 0) {
            return Math.min(getoverlay0no6vwu.IconCompatParcelizer, iRemoteActionCompatParcelizer);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final BlockGraphicsLayerElement read(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new horizontalGradient8A3gB4((ViewGroup.MarginLayoutParams) layoutParams) : new horizontalGradient8A3gB4(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write(int i, int i2, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, isActive isactive) {
        getOverlay0nO6VwU getoverlay0no6vwu;
        int iSerializer;
        if (this.MediaMetadataCompat != 0) {
            i = i2;
        }
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0 || i == 0) {
            return;
        }
        RemoteActionCompatParcelizer(i, getintrinsicsizenhjbrc);
        int[] iArr = this.PlaybackStateCompatCustomAction;
        int i3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (iArr == null || iArr.length < i3) {
            this.PlaybackStateCompatCustomAction = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            getoverlay0no6vwu = this.MediaBrowserCompatMediaItem;
            if (i4 >= i3) {
                break;
            }
            int i6 = getoverlay0no6vwu.write;
            radialGradientP_VxKs[] radialgradientp_vxksArr = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (i6 == -1) {
                int i7 = getoverlay0no6vwu.MediaDescriptionCompat;
                iSerializer = i7 - radialgradientp_vxksArr[i4].serializer(i7);
            } else {
                iSerializer = radialgradientp_vxksArr[i4].read(getoverlay0no6vwu.RemoteActionCompatParcelizer) - getoverlay0no6vwu.RemoteActionCompatParcelizer;
            }
            if (iSerializer >= 0) {
                this.PlaybackStateCompatCustomAction[i5] = iSerializer;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.PlaybackStateCompatCustomAction, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = getoverlay0no6vwu.read;
            if (i9 < 0 || i9 >= getintrinsicsizenhjbrc.serializer()) {
                return;
            }
            isactive.read(getoverlay0no6vwu.read, this.PlaybackStateCompatCustomAction[i8]);
            getoverlay0no6vwu.read += getoverlay0no6vwu.write;
        }
    }

    public final void RemoteActionCompatParcelizer(int i, RecyclerView.Recycler recycler) {
        while (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() > 0) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(0);
            getSoftlight0nO6VwU getsoftlight0no6vwu = this.PlaybackStateCompat;
            if (getsoftlight0no6vwu.write(viewMediaSessionCompatResultReceiverWrapper) > i || getsoftlight0no6vwu.read(viewMediaSessionCompatResultReceiverWrapper) > i) {
                return;
            }
            horizontalGradient8A3gB4 horizontalgradient8a3gb4 = (horizontalGradient8A3gB4) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams();
            horizontalgradient8a3gb4.getClass();
            if (horizontalgradient8a3gb4.write.write.size() == 1) {
                return;
            }
            radialGradientP_VxKs radialgradientp_vxks = horizontalgradient8a3gb4.write;
            ArrayList arrayList = radialgradientp_vxks.write;
            View view = (View) arrayList.remove(0);
            horizontalGradient8A3gB4 horizontalgradient8a3gb5 = (horizontalGradient8A3gB4) view.getLayoutParams();
            horizontalgradient8a3gb5.write = null;
            if (arrayList.size() == 0) {
                radialgradientp_vxks.read = Integer.MIN_VALUE;
            }
            if (horizontalgradient8a3gb5.MediaMetadataCompat.isRemoved() || horizontalgradient8a3gb5.MediaMetadataCompat.isUpdated()) {
                radialgradientp_vxks.serializer -= radialgradientp_vxks.MediaSessionCompatQueueItem.PlaybackStateCompat.IconCompatParcelizer(view);
            }
            radialgradientp_vxks.RemoteActionCompatParcelizer = Integer.MIN_VALUE;
            serializer(viewMediaSessionCompatResultReceiverWrapper, recycler);
        }
    }

    public final boolean serializer() {
        int iRemoteActionCompatParcelizer;
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0 || this.RemoteActionCompatParcelizer == 0 || !this._init_lambda3) {
            return false;
        }
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            iRemoteActionCompatParcelizer = MediaSessionCompatQueueItem();
            RemoteActionCompatParcelizer();
        } else {
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            MediaSessionCompatQueueItem();
        }
        if (iRemoteActionCompatParcelizer != 0 || MediaMetadataCompat() == null) {
            return false;
        }
        this.RatingCompat.write();
        this.defaultViewModelProviderFactory_delegatelambda0 = true;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final BlockGraphicsLayerElement IconCompatParcelizer() {
        return this.MediaMetadataCompat == 0 ? new horizontalGradient8A3gB4(-2, -1) : new horizontalGradient8A3gB4(-1, -2);
    }

    public final void IconCompatParcelizer(int i, RecyclerView.Recycler recycler) {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        while (true) {
            iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus--;
            if (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus < 0) {
                return;
            }
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            getSoftlight0nO6VwU getsoftlight0no6vwu = this.PlaybackStateCompat;
            if (getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper) < i || getsoftlight0no6vwu.MediaSessionCompatQueueItem(viewMediaSessionCompatResultReceiverWrapper) < i) {
                return;
            }
            horizontalGradient8A3gB4 horizontalgradient8a3gb4 = (horizontalGradient8A3gB4) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams();
            horizontalgradient8a3gb4.getClass();
            if (horizontalgradient8a3gb4.write.write.size() == 1) {
                return;
            }
            radialGradientP_VxKs radialgradientp_vxks = horizontalgradient8a3gb4.write;
            ArrayList arrayList = radialgradientp_vxks.write;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            horizontalGradient8A3gB4 horizontalgradient8a3gb5 = (horizontalGradient8A3gB4) view.getLayoutParams();
            horizontalgradient8a3gb5.write = null;
            if (horizontalgradient8a3gb5.MediaMetadataCompat.isRemoved() || horizontalgradient8a3gb5.MediaMetadataCompat.isUpdated()) {
                radialgradientp_vxks.serializer -= radialgradientp_vxks.MediaSessionCompatQueueItem.PlaybackStateCompat.IconCompatParcelizer(view);
            }
            if (size == 1) {
                radialgradientp_vxks.RemoteActionCompatParcelizer = Integer.MIN_VALUE;
            }
            radialgradientp_vxks.read = Integer.MIN_VALUE;
            serializer(viewMediaSessionCompatResultReceiverWrapper, recycler);
        }
    }

    public final int MediaBrowserCompatMediaItem(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return 0;
        }
        boolean z = !this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        return ScrollbarHelper.IconCompatParcelizer(getintrinsicsizenhjbrc, this.PlaybackStateCompat, IconCompatParcelizer(z), RemoteActionCompatParcelizer(z), this, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int MediaDescriptionCompat(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return 0;
        }
        boolean z = !this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        return ScrollbarHelper.IconCompatParcelizer(getintrinsicsizenhjbrc, this.PlaybackStateCompat, IconCompatParcelizer(z), RemoteActionCompatParcelizer(z), this, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    @Override // o.applyToPq9zytI
    public final PointF MediaMetadataCompat(int i) {
        int i2 = 1;
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0) {
            if ((i < RemoteActionCompatParcelizer()) != this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                i2 = -1;
            }
        } else if (!this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            i2 = -1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.MediaMetadataCompat == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    public final View MediaMetadataCompat() {
        boolean z;
        boolean z2;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        int i = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus - 1;
        int i2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.MediaMetadataCompat == 1 && MediaDescriptionCompat()) ? (byte) 1 : (byte) -1;
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -1;
        } else {
            i = 0;
        }
        int i3 = i < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus ? 1 : -1;
        while (i != iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i);
            horizontalGradient8A3gB4 horizontalgradient8a3gb4 = (horizontalGradient8A3gB4) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams();
            boolean z3 = bitSet.get(horizontalgradient8a3gb4.write.IconCompatParcelizer);
            getSoftlight0nO6VwU getsoftlight0no6vwu = this.PlaybackStateCompat;
            if (z3) {
                radialGradientP_VxKs radialgradientp_vxks = horizontalgradient8a3gb4.write;
                if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                    int i4 = radialgradientp_vxks.read;
                    if (i4 == Integer.MIN_VALUE) {
                        radialgradientp_vxks.write();
                        i4 = radialgradientp_vxks.read;
                    }
                    if (i4 < getsoftlight0no6vwu.write()) {
                        ((horizontalGradient8A3gB4) ((View) af$$ExternalSyntheticOutline0.m(1, radialgradientp_vxks.write)).getLayoutParams()).getClass();
                        return viewMediaSessionCompatResultReceiverWrapper;
                    }
                } else {
                    int i5 = radialgradientp_vxks.RemoteActionCompatParcelizer;
                    ArrayList arrayList = radialgradientp_vxks.write;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        horizontalGradient8A3gB4 horizontalgradient8a3gb5 = (horizontalGradient8A3gB4) view.getLayoutParams();
                        radialgradientp_vxks.RemoteActionCompatParcelizer = radialgradientp_vxks.MediaSessionCompatQueueItem.PlaybackStateCompat.RemoteActionCompatParcelizer(view);
                        horizontalgradient8a3gb5.getClass();
                        i5 = radialgradientp_vxks.RemoteActionCompatParcelizer;
                    }
                    if (i5 > getsoftlight0no6vwu.IconCompatParcelizer()) {
                        ((horizontalGradient8A3gB4) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewMediaSessionCompatResultReceiverWrapper;
                    }
                }
                bitSet.clear(horizontalgradient8a3gb4.write.IconCompatParcelizer);
            }
            i += i3;
            if (i != iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                View viewMediaSessionCompatResultReceiverWrapper2 = MediaSessionCompatResultReceiverWrapper(i);
                if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                    int iWrite = getsoftlight0no6vwu.write(viewMediaSessionCompatResultReceiverWrapper);
                    int iWrite2 = getsoftlight0no6vwu.write(viewMediaSessionCompatResultReceiverWrapper2);
                    if (iWrite >= iWrite2) {
                        if (iWrite == iWrite2) {
                            if (horizontalgradient8a3gb4.write.IconCompatParcelizer - ((horizontalGradient8A3gB4) viewMediaSessionCompatResultReceiverWrapper2.getLayoutParams()).write.IconCompatParcelizer < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewMediaSessionCompatResultReceiverWrapper;
                }
                int iRemoteActionCompatParcelizer = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
                int iRemoteActionCompatParcelizer2 = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper2);
                if (iRemoteActionCompatParcelizer <= iRemoteActionCompatParcelizer2) {
                    if (iRemoteActionCompatParcelizer == iRemoteActionCompatParcelizer2) {
                        if (horizontalgradient8a3gb4.write.IconCompatParcelizer - ((horizontalGradient8A3gB4) viewMediaSessionCompatResultReceiverWrapper2.getLayoutParams()).write.IconCompatParcelizer < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewMediaSessionCompatResultReceiverWrapper;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int MediaSessionCompatQueueItem(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return 0;
        }
        boolean z = !this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        return ScrollbarHelper.IconCompatParcelizer(getintrinsicsizenhjbrc, this.PlaybackStateCompat, IconCompatParcelizer(z), RemoteActionCompatParcelizer(z), this, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
    }

    public final int RemoteActionCompatParcelizer() {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return 0;
        }
        return RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int read(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return 0;
        }
        boolean z = !this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        return ScrollbarHelper.write(getintrinsicsizenhjbrc, this.PlaybackStateCompat, IconCompatParcelizer(z), RemoteActionCompatParcelizer(z), this, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int serializer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return 0;
        }
        boolean z = !this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        return ScrollbarHelper.write(getintrinsicsizenhjbrc, this.PlaybackStateCompat, IconCompatParcelizer(z), RemoteActionCompatParcelizer(z), this, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0066  */
    /* JADX WARN: Code duplicated, block: B:48:0x0068  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View write(View view, int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        View viewFindContainingItemView;
        int i2;
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0) {
            RecyclerView recyclerView = this.ensureViewModelStore;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || ((ArrayList) this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read).contains(viewFindContainingItemView)) {
                viewFindContainingItemView = null;
            }
            if (viewFindContainingItemView != null) {
                MediaSessionCompatResultReceiverWrapper();
                int i3 = this.MediaMetadataCompat;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && MediaDescriptionCompat()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && MediaDescriptionCompat()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    horizontalGradient8A3gB4 horizontalgradient8a3gb4 = (horizontalGradient8A3gB4) viewFindContainingItemView.getLayoutParams();
                    horizontalgradient8a3gb4.getClass();
                    radialGradientP_VxKs radialgradientp_vxks = horizontalgradient8a3gb4.write;
                    int iMediaSessionCompatQueueItem = i2 == 1 ? MediaSessionCompatQueueItem() : RemoteActionCompatParcelizer();
                    read(iMediaSessionCompatQueueItem, getintrinsicsizenhjbrc);
                    serializer(i2);
                    getOverlay0nO6VwU getoverlay0no6vwu = this.MediaBrowserCompatMediaItem;
                    getoverlay0no6vwu.read = getoverlay0no6vwu.write + iMediaSessionCompatQueueItem;
                    getoverlay0no6vwu.IconCompatParcelizer = (int) (this.PlaybackStateCompat.MediaDescriptionCompat() * 0.33333334f);
                    getoverlay0no6vwu.MediaSessionCompatQueueItem = true;
                    getoverlay0no6vwu.RatingCompat = false;
                    read(recycler, getoverlay0no6vwu, getintrinsicsizenhjbrc);
                    this.read = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    View viewWrite = radialgradientp_vxks.write(iMediaSessionCompatQueueItem, i2);
                    if (viewWrite != null && viewWrite != viewFindContainingItemView) {
                        return viewWrite;
                    }
                    boolean zIconCompatParcelizer = IconCompatParcelizer(i2);
                    radialGradientP_VxKs[] radialgradientp_vxksArr = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    int i4 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    if (zIconCompatParcelizer) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewWrite2 = radialgradientp_vxksArr[i5].write(iMediaSessionCompatQueueItem, i2);
                            if (viewWrite2 != null && viewWrite2 != viewFindContainingItemView) {
                                return viewWrite2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewWrite3 = radialgradientp_vxksArr[i6].write(iMediaSessionCompatQueueItem, i2);
                            if (viewWrite3 != null && viewWrite3 != viewFindContainingItemView) {
                                return viewWrite3;
                            }
                        }
                    }
                    boolean z = (this.MediaSessionCompatResultReceiverWrapper ^ true) == (i2 == -1);
                    View viewMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(z ? radialgradientp_vxks.read() : radialgradientp_vxks.IconCompatParcelizer());
                    if (viewMediaBrowserCompatMediaItem != null && viewMediaBrowserCompatMediaItem != viewFindContainingItemView) {
                        return viewMediaBrowserCompatMediaItem;
                    }
                    if (IconCompatParcelizer(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != radialgradientp_vxks.IconCompatParcelizer) {
                                View viewMediaBrowserCompatMediaItem2 = MediaBrowserCompatMediaItem(z ? radialgradientp_vxksArr[i7].read() : radialgradientp_vxksArr[i7].IconCompatParcelizer());
                                if (viewMediaBrowserCompatMediaItem2 != null && viewMediaBrowserCompatMediaItem2 != viewFindContainingItemView) {
                                    return viewMediaBrowserCompatMediaItem2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewMediaBrowserCompatMediaItem3 = MediaBrowserCompatMediaItem(z ? radialgradientp_vxksArr[i8].read() : radialgradientp_vxksArr[i8].IconCompatParcelizer());
                            if (viewMediaBrowserCompatMediaItem3 != null && viewMediaBrowserCompatMediaItem3 != viewFindContainingItemView) {
                                return viewMediaBrowserCompatMediaItem3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final int IconCompatParcelizer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0 || i == 0) {
            return 0;
        }
        RemoteActionCompatParcelizer(i, getintrinsicsizenhjbrc);
        getOverlay0nO6VwU getoverlay0no6vwu = this.MediaBrowserCompatMediaItem;
        int i2 = read(recycler, getoverlay0no6vwu, getintrinsicsizenhjbrc);
        if (getoverlay0no6vwu.IconCompatParcelizer >= i2) {
            i = i < 0 ? -i2 : i2;
        }
        this.PlaybackStateCompat.IconCompatParcelizer(-i);
        this.read = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getoverlay0no6vwu.IconCompatParcelizer = 0;
        RemoteActionCompatParcelizer(recycler, getoverlay0no6vwu);
        return i;
    }

    public final int MediaSessionCompatQueueItem() {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        if (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == 0) {
            return 0;
        }
        return RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus - 1));
    }

    public final boolean IconCompatParcelizer(int i) {
        if (this.MediaMetadataCompat == 0) {
            return (i == -1) != this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        }
        return ((i == -1) == this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) == MediaDescriptionCompat();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final BlockGraphicsLayerElement generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new horizontalGradient8A3gB4(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        IconCompatParcelizer(recycler, getintrinsicsizenhjbrc, true);
    }
}
