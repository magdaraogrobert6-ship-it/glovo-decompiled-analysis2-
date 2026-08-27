package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import o.BlockGraphicsLayerElement;
import o.BlockGraphicsLayerModifier;
import o.FocusRestorerKtsaveFocusedChild11;
import o.FocusRestorerNode;
import o.applyToPq9zytI;
import o.getIntrinsicSizeNHjbRc;
import o.getLighten0nO6VwU;
import o.getModulate0nO6VwU;
import o.getSaturation0nO6VwU;
import o.getSoftlight0nO6VwU;
import o.getSrc0nO6VwU;
import o.isActive;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements getLighten0nO6VwU, applyToPq9zytI {
    public getSoftlight0nO6VwU ComponentActivity;
    public final getModulate0nO6VwU MediaSessionCompatToken;
    public boolean PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public int ResultReceiver;
    public getSrc0nO6VwU r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public SavedState r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getSaturation0nO6VwU r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final boolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public boolean r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final int[] r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public boolean r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;

    @SuppressLint
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() { // from class: androidx.recyclerview.widget.LinearLayoutManager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.IconCompatParcelizer = parcel.readInt();
                savedState.RemoteActionCompatParcelizer = parcel.readInt();
                savedState.serializer = parcel.readInt() == 1;
                return savedState;
            }
        };
        public int IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public boolean serializer;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
            parcel.writeInt(this.serializer ? 1 : 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int IconCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return RatingCompat(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean MediaBrowserCompatMediaItem() {
        return this.ResultReceiver == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int MediaDescriptionCompat(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaMetadataCompat(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int MediaSessionCompatQueueItem(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaMetadataCompat(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean ParcelableVolumeInfo() {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean PlaybackStateCompatCustomAction() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean RatingCompat() {
        return this.ResultReceiver == 0;
    }

    public void RemoteActionCompatParcelizer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, getModulate0nO6VwU getmodulate0no6vwu, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void RemoteActionCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = -1;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Integer.MIN_VALUE;
        this.MediaSessionCompatToken.IconCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int read(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaBrowserCompatMediaItem(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int serializer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaBrowserCompatMediaItem(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int write(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return RatingCompat(getintrinsicsizenhjbrc);
    }

    public void write(boolean z) {
        read((String) null);
        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == z) {
            return;
        }
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = z;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    public final int IconCompatParcelizer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, boolean z) {
        int iIconCompatParcelizer = i - this.ComponentActivity.IconCompatParcelizer();
        if (iIconCompatParcelizer <= 0) {
            return 0;
        }
        int i2 = -RatingCompat(iIconCompatParcelizer, recycler, getintrinsicsizenhjbrc);
        if (!z) {
            return i2;
        }
        int iIconCompatParcelizer2 = (i + i2) - this.ComponentActivity.IconCompatParcelizer();
        if (iIconCompatParcelizer2 <= 0) {
            return i2;
        }
        this.ComponentActivity.IconCompatParcelizer(-iIconCompatParcelizer2);
        return i2 - iIconCompatParcelizer2;
    }

    public final int IconCompatParcelizer(RecyclerView.Recycler recycler, getSrc0nO6VwU getsrc0no6vwu, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, boolean z) {
        int i;
        int i2 = getsrc0no6vwu.IconCompatParcelizer;
        int i3 = getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper = i3 + i2;
            }
            serializer(recycler, getsrc0no6vwu);
        }
        int i4 = getsrc0no6vwu.IconCompatParcelizer + getsrc0no6vwu.RemoteActionCompatParcelizer;
        while (true) {
            if ((!getsrc0no6vwu.write && i4 <= 0) || (i = getsrc0no6vwu.serializer) < 0 || i >= getintrinsicsizenhjbrc.serializer()) {
                break;
            }
            getSaturation0nO6VwU getsaturation0no6vwu = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            getsaturation0no6vwu.RemoteActionCompatParcelizer = 0;
            getsaturation0no6vwu.read = false;
            getsaturation0no6vwu.serializer = false;
            getsaturation0no6vwu.write = false;
            serializer(recycler, getintrinsicsizenhjbrc, getsrc0no6vwu, getsaturation0no6vwu);
            if (!getsaturation0no6vwu.read) {
                int i5 = getsrc0no6vwu.MediaMetadataCompat;
                int i6 = getsaturation0no6vwu.RemoteActionCompatParcelizer;
                getsrc0no6vwu.MediaMetadataCompat = (getsrc0no6vwu.MediaSessionCompatQueueItem * i6) + i5;
                if (!getsaturation0no6vwu.serializer || getsrc0no6vwu.PlaybackStateCompatCustomAction != null || !getintrinsicsizenhjbrc.write) {
                    getsrc0no6vwu.IconCompatParcelizer -= i6;
                    i4 -= i6;
                }
                int i7 = getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper = i8;
                    int i9 = getsrc0no6vwu.IconCompatParcelizer;
                    if (i9 < 0) {
                        getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper = i8 + i9;
                    }
                    serializer(recycler, getsrc0no6vwu);
                }
                if (z && getsaturation0no6vwu.write) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - getsrc0no6vwu.IconCompatParcelizer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void IconCompatParcelizer(RecyclerView recyclerView, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.MediaSessionCompatResultReceiverWrapper = i;
        write(linearSmoothScroller);
    }

    public final void MediaBrowserCompatMediaItem(int i, int i2) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2;
        SavedState savedState = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (savedState != null) {
            savedState.IconCompatParcelizer = -1;
        }
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    public final void MediaDescriptionCompat(int i, int i2) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer = i2 - this.ComponentActivity.IconCompatParcelizer();
        getSrc0nO6VwU getsrc0no6vwu = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getsrc0no6vwu.serializer = i;
        getsrc0no6vwu.read = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ? 1 : -1;
        getsrc0no6vwu.MediaSessionCompatQueueItem = -1;
        getsrc0no6vwu.MediaMetadataCompat = i2;
        getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper = Integer.MIN_VALUE;
    }

    public final boolean MediaSessionCompatToken() {
        return this.ensureViewModelStore.getLayoutDirection() == 1;
    }

    public final void RatingCompat(int i, int i2) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer = this.ComponentActivity.write() - i2;
        getSrc0nO6VwU getsrc0no6vwu = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getsrc0no6vwu.read = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ? -1 : 1;
        getsrc0no6vwu.serializer = i;
        getsrc0no6vwu.MediaSessionCompatQueueItem = 1;
        getsrc0no6vwu.MediaMetadataCompat = i2;
        getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper = Integer.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View RemoteActionCompatParcelizer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, boolean z, boolean z2) {
        int i;
        int i2;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        MediaSessionCompatQueueItem();
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        if (z2) {
            i = -1;
            iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1;
            i2 = -1;
        } else {
            i = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            i2 = 1;
            iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
        }
        int iSerializer = getintrinsicsizenhjbrc.serializer();
        int iIconCompatParcelizer = this.ComponentActivity.IconCompatParcelizer();
        int iWrite = this.ComponentActivity.write();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != i) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            int iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
            int iRemoteActionCompatParcelizer2 = this.ComponentActivity.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
            int iWrite2 = this.ComponentActivity.write(viewMediaSessionCompatResultReceiverWrapper);
            if (iRemoteActionCompatParcelizer >= 0 && iRemoteActionCompatParcelizer < iSerializer) {
                if (!((BlockGraphicsLayerElement) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams()).MediaMetadataCompat.isRemoved()) {
                    boolean z3 = iWrite2 <= iIconCompatParcelizer && iRemoteActionCompatParcelizer2 < iIconCompatParcelizer;
                    boolean z4 = iRemoteActionCompatParcelizer2 >= iWrite && iWrite2 > iWrite;
                    if (!z3 && !z4) {
                        return viewMediaSessionCompatResultReceiverWrapper;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewMediaSessionCompatResultReceiverWrapper;
                        } else if (view == null) {
                            view = viewMediaSessionCompatResultReceiverWrapper;
                        }
                    } else if (z3) {
                        view2 = viewMediaSessionCompatResultReceiverWrapper;
                    } else if (view == null) {
                        view = viewMediaSessionCompatResultReceiverWrapper;
                    }
                } else if (view3 == null) {
                    view3 = viewMediaSessionCompatResultReceiverWrapper;
                }
            }
            iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public final void read(int i, int i2, boolean z, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        int iIconCompatParcelizer;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write = this.ComponentActivity.serializer() == 0 && this.ComponentActivity.read() == 0;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatQueueItem = i;
        int[] iArr = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        iArr[0] = 0;
        iArr[1] = 0;
        RemoteActionCompatParcelizer(getintrinsicsizenhjbrc, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        getSrc0nO6VwU getsrc0no6vwu = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i3 = z2 ? iMax2 : iMax;
        getsrc0no6vwu.RemoteActionCompatParcelizer = i3;
        if (!z2) {
            iMax = iMax2;
        }
        getsrc0no6vwu.MediaBrowserCompatMediaItem = iMax;
        if (z2) {
            getsrc0no6vwu.RemoteActionCompatParcelizer = this.ComponentActivity.RemoteActionCompatParcelizer() + i3;
            View viewPlaybackStateCompat = PlaybackStateCompat();
            getSrc0nO6VwU getsrc0no6vwu2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getsrc0no6vwu2.read = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ? -1 : 1;
            int iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewPlaybackStateCompat);
            getSrc0nO6VwU getsrc0no6vwu3 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getsrc0no6vwu2.serializer = iRemoteActionCompatParcelizer + getsrc0no6vwu3.read;
            getsrc0no6vwu3.MediaMetadataCompat = this.ComponentActivity.write(viewPlaybackStateCompat);
            iIconCompatParcelizer = this.ComponentActivity.write(viewPlaybackStateCompat) - this.ComponentActivity.write();
        } else {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
            getSrc0nO6VwU getsrc0no6vwu4 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getsrc0no6vwu4.RemoteActionCompatParcelizer = this.ComponentActivity.IconCompatParcelizer() + getsrc0no6vwu4.RemoteActionCompatParcelizer;
            getSrc0nO6VwU getsrc0no6vwu5 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getsrc0no6vwu5.read = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ? 1 : -1;
            int iRemoteActionCompatParcelizer2 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
            getSrc0nO6VwU getsrc0no6vwu6 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getsrc0no6vwu5.serializer = iRemoteActionCompatParcelizer2 + getsrc0no6vwu6.read;
            getsrc0no6vwu6.MediaMetadataCompat = this.ComponentActivity.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
            iIconCompatParcelizer = (-this.ComponentActivity.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper)) + this.ComponentActivity.IconCompatParcelizer();
        }
        getSrc0nO6VwU getsrc0no6vwu7 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getsrc0no6vwu7.IconCompatParcelizer = i2;
        if (z) {
            getsrc0no6vwu7.IconCompatParcelizer = i2 - iIconCompatParcelizer;
        }
        getsrc0no6vwu7.MediaSessionCompatResultReceiverWrapper = iIconCompatParcelizer;
    }

    public final int serializer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, boolean z) {
        int iWrite;
        int iWrite2 = this.ComponentActivity.write() - i;
        if (iWrite2 <= 0) {
            return 0;
        }
        int i2 = -RatingCompat(-iWrite2, recycler, getintrinsicsizenhjbrc);
        if (!z || (iWrite = this.ComponentActivity.write() - (i + i2)) <= 0) {
            return i2;
        }
        this.ComponentActivity.IconCompatParcelizer(iWrite);
        return iWrite + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public BlockGraphicsLayerElement IconCompatParcelizer() {
        return new BlockGraphicsLayerElement(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(AccessibilityEvent accessibilityEvent) {
        super.read(accessibilityEvent);
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() > 0) {
            accessibilityEvent.setFromIndex(MediaMetadataCompat());
            accessibilityEvent.setToIndex(MediaDescriptionCompat());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void read(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        super.read(recycler, getintrinsicsizenhjbrc, focusRestorerKtsaveFocusedChild11);
        RecyclerView.Adapter adapter = this.ensureViewModelStore.MediaSessionCompatResultReceiverWrapper;
        if (adapter == null || adapter.getItemCount() <= 0) {
            return;
        }
        focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.MediaSessionCompatToken);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View write(View view, int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        int iMediaDescriptionCompat;
        View viewMediaSessionCompatQueueItem;
        ComponentActivity();
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0 && (iMediaDescriptionCompat = MediaDescriptionCompat(i)) != Integer.MIN_VALUE) {
            MediaSessionCompatQueueItem();
            read(iMediaDescriptionCompat, (int) (this.ComponentActivity.MediaDescriptionCompat() * 0.33333334f), false, getintrinsicsizenhjbrc);
            getSrc0nO6VwU getsrc0no6vwu = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper = Integer.MIN_VALUE;
            getsrc0no6vwu.MediaDescriptionCompat = false;
            IconCompatParcelizer(recycler, getsrc0no6vwu, getintrinsicsizenhjbrc, true);
            boolean z = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (iMediaDescriptionCompat == -1) {
                viewMediaSessionCompatQueueItem = z ? MediaSessionCompatQueueItem(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1, -1) : MediaSessionCompatQueueItem(0, r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
            } else {
                viewMediaSessionCompatQueueItem = z ? MediaSessionCompatQueueItem(0, r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()) : MediaSessionCompatQueueItem(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1, -1);
            }
            View viewMediaSessionCompatResultReceiverWrapper = iMediaDescriptionCompat == -1 ? MediaSessionCompatResultReceiverWrapper() : PlaybackStateCompat();
            if (!viewMediaSessionCompatResultReceiverWrapper.hasFocusable()) {
                return viewMediaSessionCompatQueueItem;
            }
            if (viewMediaSessionCompatQueueItem != null) {
                return viewMediaSessionCompatResultReceiverWrapper;
            }
        }
        return null;
    }

    @SuppressLint
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.ResultReceiver = 1;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = false;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = false;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = false;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = -1;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Integer.MIN_VALUE;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        this.MediaSessionCompatToken = new getModulate0nO6VwU();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new getSaturation0nO6VwU();
        this.PlaybackStateCompatCustomAction = 2;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new int[2];
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = RecyclerView.LayoutManager.read(context, attributeSet, i, i2);
        MediaSessionCompatQueueItem(blockGraphicsLayerModifier.IconCompatParcelizer);
        boolean z = blockGraphicsLayerModifier.serializer;
        read((String) null);
        if (z) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = z;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
        write(blockGraphicsLayerModifier.read);
    }

    public final View MediaSessionCompatResultReceiverWrapper() {
        return MediaSessionCompatResultReceiverWrapper(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ? r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void RatingCompat(int i) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Integer.MIN_VALUE;
        SavedState savedState = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (savedState != null) {
            savedState.IconCompatParcelizer = -1;
        }
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean q_() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null && this.PlaybackStateCompat == this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(String str) {
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
            super.read(str);
        }
    }

    public final void serializer(RecyclerView.Recycler recycler, getSrc0nO6VwU getsrc0no6vwu) {
        if (!getsrc0no6vwu.MediaDescriptionCompat || getsrc0no6vwu.write) {
            return;
        }
        int i = getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper;
        int i2 = getsrc0no6vwu.MediaBrowserCompatMediaItem;
        if (getsrc0no6vwu.MediaSessionCompatQueueItem == -1) {
            int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            if (i < 0) {
                return;
            }
            int i3 = (this.ComponentActivity.read() - i) + i2;
            if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                for (int i4 = 0; i4 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i4++) {
                    View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i4);
                    if (this.ComponentActivity.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper) < i3 || this.ComponentActivity.MediaSessionCompatQueueItem(viewMediaSessionCompatResultReceiverWrapper) < i3) {
                        read(recycler, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View viewMediaSessionCompatResultReceiverWrapper2 = MediaSessionCompatResultReceiverWrapper(i6);
                if (this.ComponentActivity.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper2) < i3 || this.ComponentActivity.MediaSessionCompatQueueItem(viewMediaSessionCompatResultReceiverWrapper2) < i3) {
                    read(recycler, i5, i6);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i7 = i - i2;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        if (!this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
            for (int i8 = 0; i8 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2; i8++) {
                View viewMediaSessionCompatResultReceiverWrapper3 = MediaSessionCompatResultReceiverWrapper(i8);
                if (this.ComponentActivity.write(viewMediaSessionCompatResultReceiverWrapper3) > i7 || this.ComponentActivity.read(viewMediaSessionCompatResultReceiverWrapper3) > i7) {
                    read(recycler, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View viewMediaSessionCompatResultReceiverWrapper4 = MediaSessionCompatResultReceiverWrapper(i10);
            if (this.ComponentActivity.write(viewMediaSessionCompatResultReceiverWrapper4) > i7 || this.ComponentActivity.read(viewMediaSessionCompatResultReceiverWrapper4) > i7) {
                read(recycler, i9, i10);
                return;
            }
        }
    }

    public void serializer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, getSrc0nO6VwU getsrc0no6vwu, isActive isactive) {
        int i = getsrc0no6vwu.serializer;
        if (i < 0 || i >= getintrinsicsizenhjbrc.serializer()) {
            return;
        }
        isactive.read(i, Math.max(0, getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = savedState;
            if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != -1) {
                savedState.IconCompatParcelizer = -1;
            }
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
    }

    public final void ComponentActivity() {
        if (this.ResultReceiver == 1 || !MediaSessionCompatToken()) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        } else {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = !this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        }
    }

    public final View serializer(boolean z) {
        return this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ? read(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1, -1, z, true) : read(0, r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), z, true);
    }

    public final int MediaMetadataCompat() {
        View view = read(0, r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), false, true);
        if (view == null) {
            return -1;
        }
        return RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view);
    }

    public final void MediaSessionCompatQueueItem() {
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
            getSrc0nO6VwU getsrc0no6vwu = new getSrc0nO6VwU();
            getsrc0no6vwu.MediaDescriptionCompat = true;
            getsrc0no6vwu.RemoteActionCompatParcelizer = 0;
            getsrc0no6vwu.MediaBrowserCompatMediaItem = 0;
            getsrc0no6vwu.PlaybackStateCompatCustomAction = null;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getsrc0no6vwu;
        }
    }

    public final View PlaybackStateCompat() {
        return MediaSessionCompatResultReceiverWrapper(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ? 0 : r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int RemoteActionCompatParcelizer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (this.ResultReceiver == 0) {
            return 0;
        }
        return RatingCompat(i, recycler, getintrinsicsizenhjbrc);
    }

    public final View RemoteActionCompatParcelizer(boolean z) {
        return this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ? read(0, r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), z, true) : read(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1, -1, z, true);
    }

    public void RemoteActionCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, int[] iArr) {
        int i;
        int iMediaDescriptionCompat = getintrinsicsizenhjbrc.PlaybackStateCompat != -1 ? this.ComponentActivity.MediaDescriptionCompat() : 0;
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatQueueItem == -1) {
            i = 0;
        } else {
            i = iMediaDescriptionCompat;
            iMediaDescriptionCompat = 0;
        }
        iArr[0] = iMediaDescriptionCompat;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        SavedState savedState = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.IconCompatParcelizer = savedState.IconCompatParcelizer;
            savedState2.RemoteActionCompatParcelizer = savedState.RemoteActionCompatParcelizer;
            savedState2.serializer = savedState.serializer;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() <= 0) {
            savedState3.IconCompatParcelizer = -1;
            return savedState3;
        }
        MediaSessionCompatQueueItem();
        boolean z = this.PlaybackStateCompat ^ this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        savedState3.serializer = z;
        if (z) {
            View viewPlaybackStateCompat = PlaybackStateCompat();
            savedState3.RemoteActionCompatParcelizer = this.ComponentActivity.write() - this.ComponentActivity.write(viewPlaybackStateCompat);
            savedState3.IconCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewPlaybackStateCompat);
            return savedState3;
        }
        View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        savedState3.IconCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
        savedState3.RemoteActionCompatParcelizer = this.ComponentActivity.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper) - this.ComponentActivity.IconCompatParcelizer();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(int i, isActive isactive) {
        boolean z;
        int i2;
        SavedState savedState = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (savedState == null || (i2 = savedState.IconCompatParcelizer) < 0) {
            ComponentActivity();
            z = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            i2 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.serializer;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.PlaybackStateCompatCustomAction && i2 >= 0 && i2 < i; i4++) {
            isactive.read(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019d  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:122:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0220  */
    /* JADX WARN: Code duplicated, block: B:126:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0227  */
    /* JADX WARN: Code duplicated, block: B:130:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x022c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0230  */
    /* JADX WARN: Code duplicated, block: B:135:0x0234  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0241  */
    /* JADX WARN: Code duplicated, block: B:91:0x0183  */
    /* JADX WARN: Code duplicated, block: B:98:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v15 */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void read(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        View focusedChild;
        int iSerializer;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewRemoteActionCompatParcelizer;
        boolean z3;
        getSoftlight0nO6VwU getsoftlight0no6vwu;
        int iRemoteActionCompatParcelizer;
        int iWrite;
        int iIconCompatParcelizer;
        int iWrite2;
        boolean z4;
        boolean z5;
        BlockGraphicsLayerElement blockGraphicsLayerElement;
        int i;
        int iRemoteActionCompatParcelizer2;
        int i2;
        int i3;
        ?? r4;
        List list;
        int i4;
        int i5;
        int iSerializer2;
        int i6;
        View viewMediaBrowserCompatMediaItem;
        int iRemoteActionCompatParcelizer3;
        int iWrite3;
        int i7;
        int i8 = -1;
        if ((this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null || this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != -1) && getintrinsicsizenhjbrc.serializer() == 0) {
            write(recycler);
            return;
        }
        SavedState savedState = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (savedState != null && (i7 = savedState.IconCompatParcelizer) >= 0) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i7;
        }
        MediaSessionCompatQueueItem();
        boolean z6 = false;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaDescriptionCompat = false;
        ComponentActivity();
        RecyclerView recyclerView2 = this.ensureViewModelStore;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read).contains(focusedChild)) {
            focusedChild = null;
        }
        getModulate0nO6VwU getmodulate0no6vwu = this.MediaSessionCompatToken;
        if (getmodulate0no6vwu.RemoteActionCompatParcelizer && this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == -1 && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
            if (focusedChild != null && (this.ComponentActivity.RemoteActionCompatParcelizer(focusedChild) >= this.ComponentActivity.write() || this.ComponentActivity.write(focusedChild) <= this.ComponentActivity.IconCompatParcelizer())) {
                getmodulate0no6vwu.RemoteActionCompatParcelizer(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(focusedChild), focusedChild);
            }
        } else {
            getmodulate0no6vwu.IconCompatParcelizer();
            getmodulate0no6vwu.IconCompatParcelizer = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ^ this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            if (!getintrinsicsizenhjbrc.write && (i = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) != -1) {
                if (i >= 0 && i < getintrinsicsizenhjbrc.serializer()) {
                    int i9 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    getmodulate0no6vwu.serializer = i9;
                    SavedState savedState2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    if (savedState2 != null && savedState2.IconCompatParcelizer >= 0) {
                        boolean z7 = savedState2.serializer;
                        getmodulate0no6vwu.IconCompatParcelizer = z7;
                        getSoftlight0nO6VwU getsoftlight0no6vwu2 = this.ComponentActivity;
                        if (z7) {
                            getmodulate0no6vwu.read = getsoftlight0no6vwu2.write() - this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer;
                        } else {
                            getmodulate0no6vwu.read = getsoftlight0no6vwu2.IconCompatParcelizer() + this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer;
                        }
                    } else if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == Integer.MIN_VALUE) {
                        View viewMediaBrowserCompatMediaItem2 = MediaBrowserCompatMediaItem(i9);
                        if (viewMediaBrowserCompatMediaItem2 != null) {
                            if (this.ComponentActivity.IconCompatParcelizer(viewMediaBrowserCompatMediaItem2) > this.ComponentActivity.MediaDescriptionCompat()) {
                                getmodulate0no6vwu.serializer();
                            } else {
                                int iRemoteActionCompatParcelizer4 = this.ComponentActivity.RemoteActionCompatParcelizer(viewMediaBrowserCompatMediaItem2);
                                int iIconCompatParcelizer2 = this.ComponentActivity.IconCompatParcelizer();
                                getSoftlight0nO6VwU getsoftlight0no6vwu3 = this.ComponentActivity;
                                if (iRemoteActionCompatParcelizer4 - iIconCompatParcelizer2 < 0) {
                                    getmodulate0no6vwu.read = getsoftlight0no6vwu3.IconCompatParcelizer();
                                    getmodulate0no6vwu.IconCompatParcelizer = false;
                                } else if (getsoftlight0no6vwu3.write() - this.ComponentActivity.write(viewMediaBrowserCompatMediaItem2) < 0) {
                                    getmodulate0no6vwu.read = this.ComponentActivity.write();
                                    getmodulate0no6vwu.IconCompatParcelizer = true;
                                } else {
                                    boolean z8 = getmodulate0no6vwu.IconCompatParcelizer;
                                    getSoftlight0nO6VwU getsoftlight0no6vwu4 = this.ComponentActivity;
                                    if (z8) {
                                        iRemoteActionCompatParcelizer2 = this.ComponentActivity.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu4.write(viewMediaBrowserCompatMediaItem2);
                                    } else {
                                        iRemoteActionCompatParcelizer2 = getsoftlight0no6vwu4.RemoteActionCompatParcelizer(viewMediaBrowserCompatMediaItem2);
                                    }
                                    getmodulate0no6vwu.read = iRemoteActionCompatParcelizer2;
                                }
                            }
                        } else {
                            if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() > 0) {
                                getmodulate0no6vwu.IconCompatParcelizer = (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss < RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(0))) == this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                            }
                            getmodulate0no6vwu.serializer();
                        }
                    } else {
                        boolean z9 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                        getmodulate0no6vwu.IconCompatParcelizer = z9;
                        getSoftlight0nO6VwU getsoftlight0no6vwu5 = this.ComponentActivity;
                        if (z9) {
                            getmodulate0no6vwu.read = getsoftlight0no6vwu5.write() - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        } else {
                            getmodulate0no6vwu.read = getsoftlight0no6vwu5.IconCompatParcelizer() + this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        }
                    }
                } else {
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = -1;
                    this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Integer.MIN_VALUE;
                    if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0) {
                        recyclerView = this.ensureViewModelStore;
                        if (recyclerView != null) {
                            focusedChild2 = null;
                        } else {
                            focusedChild2 = null;
                        }
                        if (focusedChild2 != null) {
                            blockGraphicsLayerElement = (BlockGraphicsLayerElement) focusedChild2.getLayoutParams();
                            if (blockGraphicsLayerElement.MediaMetadataCompat.isRemoved()) {
                                z = this.PlaybackStateCompat;
                                z2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                                if (z != z2) {
                                    int iRemoteActionCompatParcelizer5 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                                    z3 = getmodulate0no6vwu.IconCompatParcelizer;
                                    getsoftlight0no6vwu = getmodulate0no6vwu.write;
                                    if (z3) {
                                        getmodulate0no6vwu.read = getmodulate0no6vwu.write.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu.write(viewRemoteActionCompatParcelizer);
                                    } else {
                                        getmodulate0no6vwu.read = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                                    }
                                    getmodulate0no6vwu.serializer = iRemoteActionCompatParcelizer5;
                                    if (!getintrinsicsizenhjbrc.write) {
                                        iRemoteActionCompatParcelizer = this.ComponentActivity.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                                        iWrite = this.ComponentActivity.write(viewRemoteActionCompatParcelizer);
                                        iIconCompatParcelizer = this.ComponentActivity.IconCompatParcelizer();
                                        iWrite2 = this.ComponentActivity.write();
                                        if (iWrite <= iIconCompatParcelizer) {
                                            z4 = false;
                                        } else {
                                            z4 = false;
                                        }
                                        if (iRemoteActionCompatParcelizer >= iWrite2) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (!z4) {
                                            if (getmodulate0no6vwu.IconCompatParcelizer) {
                                                iIconCompatParcelizer = iWrite2;
                                            }
                                            getmodulate0no6vwu.read = iIconCompatParcelizer;
                                        } else {
                                            if (getmodulate0no6vwu.IconCompatParcelizer) {
                                                iIconCompatParcelizer = iWrite2;
                                            }
                                            getmodulate0no6vwu.read = iIconCompatParcelizer;
                                        }
                                    }
                                } else {
                                    getmodulate0no6vwu.serializer();
                                    if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                                        iSerializer = getintrinsicsizenhjbrc.serializer() - 1;
                                    } else {
                                        iSerializer = 0;
                                    }
                                    getmodulate0no6vwu.serializer = iSerializer;
                                }
                            } else {
                                z = this.PlaybackStateCompat;
                                z2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                                if (z != z2) {
                                    int iRemoteActionCompatParcelizer6 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                                    z3 = getmodulate0no6vwu.IconCompatParcelizer;
                                    getsoftlight0no6vwu = getmodulate0no6vwu.write;
                                    if (z3) {
                                        getmodulate0no6vwu.read = getmodulate0no6vwu.write.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu.write(viewRemoteActionCompatParcelizer);
                                    } else {
                                        getmodulate0no6vwu.read = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                                    }
                                    getmodulate0no6vwu.serializer = iRemoteActionCompatParcelizer6;
                                    if (!getintrinsicsizenhjbrc.write) {
                                        iRemoteActionCompatParcelizer = this.ComponentActivity.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                                        iWrite = this.ComponentActivity.write(viewRemoteActionCompatParcelizer);
                                        iIconCompatParcelizer = this.ComponentActivity.IconCompatParcelizer();
                                        iWrite2 = this.ComponentActivity.write();
                                        if (iWrite <= iIconCompatParcelizer) {
                                            z4 = false;
                                        } else {
                                            z4 = false;
                                        }
                                        if (iRemoteActionCompatParcelizer >= iWrite2) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (!z4) {
                                            if (getmodulate0no6vwu.IconCompatParcelizer) {
                                                iIconCompatParcelizer = iWrite2;
                                            }
                                            getmodulate0no6vwu.read = iIconCompatParcelizer;
                                        } else {
                                            if (getmodulate0no6vwu.IconCompatParcelizer) {
                                                iIconCompatParcelizer = iWrite2;
                                            }
                                            getmodulate0no6vwu.read = iIconCompatParcelizer;
                                        }
                                    }
                                } else {
                                    getmodulate0no6vwu.serializer();
                                    if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                                        iSerializer = getintrinsicsizenhjbrc.serializer() - 1;
                                    } else {
                                        iSerializer = 0;
                                    }
                                    getmodulate0no6vwu.serializer = iSerializer;
                                }
                            }
                        } else {
                            z = this.PlaybackStateCompat;
                            z2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                            if (z != z2) {
                                int iRemoteActionCompatParcelizer7 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                                z3 = getmodulate0no6vwu.IconCompatParcelizer;
                                getsoftlight0no6vwu = getmodulate0no6vwu.write;
                                if (z3) {
                                    getmodulate0no6vwu.read = getmodulate0no6vwu.write.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu.write(viewRemoteActionCompatParcelizer);
                                } else {
                                    getmodulate0no6vwu.read = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                                }
                                getmodulate0no6vwu.serializer = iRemoteActionCompatParcelizer7;
                                if (!getintrinsicsizenhjbrc.write) {
                                    iRemoteActionCompatParcelizer = this.ComponentActivity.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                                    iWrite = this.ComponentActivity.write(viewRemoteActionCompatParcelizer);
                                    iIconCompatParcelizer = this.ComponentActivity.IconCompatParcelizer();
                                    iWrite2 = this.ComponentActivity.write();
                                    if (iWrite <= iIconCompatParcelizer) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (iRemoteActionCompatParcelizer >= iWrite2) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (!z4) {
                                        if (getmodulate0no6vwu.IconCompatParcelizer) {
                                            iIconCompatParcelizer = iWrite2;
                                        }
                                        getmodulate0no6vwu.read = iIconCompatParcelizer;
                                    } else {
                                        if (getmodulate0no6vwu.IconCompatParcelizer) {
                                            iIconCompatParcelizer = iWrite2;
                                        }
                                        getmodulate0no6vwu.read = iIconCompatParcelizer;
                                    }
                                }
                            } else {
                                getmodulate0no6vwu.serializer();
                                if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                                    iSerializer = getintrinsicsizenhjbrc.serializer() - 1;
                                } else {
                                    iSerializer = 0;
                                }
                                getmodulate0no6vwu.serializer = iSerializer;
                            }
                        }
                    } else {
                        getmodulate0no6vwu.serializer();
                        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                            iSerializer = getintrinsicsizenhjbrc.serializer() - 1;
                        } else {
                            iSerializer = 0;
                        }
                        getmodulate0no6vwu.serializer = iSerializer;
                    }
                }
            } else if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0) {
                recyclerView = this.ensureViewModelStore;
                if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read).contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    blockGraphicsLayerElement = (BlockGraphicsLayerElement) focusedChild2.getLayoutParams();
                    if (blockGraphicsLayerElement.MediaMetadataCompat.isRemoved() && blockGraphicsLayerElement.MediaMetadataCompat.getLayoutPosition() >= 0 && blockGraphicsLayerElement.MediaMetadataCompat.getLayoutPosition() < getintrinsicsizenhjbrc.serializer()) {
                        getmodulate0no6vwu.RemoteActionCompatParcelizer(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(focusedChild2), focusedChild2);
                    } else {
                        z = this.PlaybackStateCompat;
                        z2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                        if (z != z2 && (viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(recycler, getintrinsicsizenhjbrc, getmodulate0no6vwu.IconCompatParcelizer, z2)) != null) {
                            int iRemoteActionCompatParcelizer8 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                            z3 = getmodulate0no6vwu.IconCompatParcelizer;
                            getsoftlight0no6vwu = getmodulate0no6vwu.write;
                            if (z3) {
                                getmodulate0no6vwu.read = getmodulate0no6vwu.write.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu.write(viewRemoteActionCompatParcelizer);
                            } else {
                                getmodulate0no6vwu.read = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                            }
                            getmodulate0no6vwu.serializer = iRemoteActionCompatParcelizer8;
                            if (!getintrinsicsizenhjbrc.write && q_()) {
                                iRemoteActionCompatParcelizer = this.ComponentActivity.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                                iWrite = this.ComponentActivity.write(viewRemoteActionCompatParcelizer);
                                iIconCompatParcelizer = this.ComponentActivity.IconCompatParcelizer();
                                iWrite2 = this.ComponentActivity.write();
                                if (iWrite <= iIconCompatParcelizer || iRemoteActionCompatParcelizer >= iIconCompatParcelizer) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (iRemoteActionCompatParcelizer >= iWrite2 || iWrite <= iWrite2) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (!z4 || z5) {
                                    if (getmodulate0no6vwu.IconCompatParcelizer) {
                                        iIconCompatParcelizer = iWrite2;
                                    }
                                    getmodulate0no6vwu.read = iIconCompatParcelizer;
                                }
                            }
                        } else {
                            getmodulate0no6vwu.serializer();
                            if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                                iSerializer = getintrinsicsizenhjbrc.serializer() - 1;
                            } else {
                                iSerializer = 0;
                            }
                            getmodulate0no6vwu.serializer = iSerializer;
                        }
                    }
                } else {
                    z = this.PlaybackStateCompat;
                    z2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                    if (z != z2) {
                        int iRemoteActionCompatParcelizer9 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                        z3 = getmodulate0no6vwu.IconCompatParcelizer;
                        getsoftlight0no6vwu = getmodulate0no6vwu.write;
                        if (z3) {
                            getmodulate0no6vwu.read = getmodulate0no6vwu.write.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu.write(viewRemoteActionCompatParcelizer);
                        } else {
                            getmodulate0no6vwu.read = getsoftlight0no6vwu.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                        }
                        getmodulate0no6vwu.serializer = iRemoteActionCompatParcelizer9;
                        if (!getintrinsicsizenhjbrc.write) {
                            iRemoteActionCompatParcelizer = this.ComponentActivity.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
                            iWrite = this.ComponentActivity.write(viewRemoteActionCompatParcelizer);
                            iIconCompatParcelizer = this.ComponentActivity.IconCompatParcelizer();
                            iWrite2 = this.ComponentActivity.write();
                            if (iWrite <= iIconCompatParcelizer) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (iRemoteActionCompatParcelizer >= iWrite2) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (!z4) {
                                if (getmodulate0no6vwu.IconCompatParcelizer) {
                                    iIconCompatParcelizer = iWrite2;
                                }
                                getmodulate0no6vwu.read = iIconCompatParcelizer;
                            } else {
                                if (getmodulate0no6vwu.IconCompatParcelizer) {
                                    iIconCompatParcelizer = iWrite2;
                                }
                                getmodulate0no6vwu.read = iIconCompatParcelizer;
                            }
                        }
                    } else {
                        getmodulate0no6vwu.serializer();
                        if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                            iSerializer = getintrinsicsizenhjbrc.serializer() - 1;
                        } else {
                            iSerializer = 0;
                        }
                        getmodulate0no6vwu.serializer = iSerializer;
                    }
                }
            } else {
                getmodulate0no6vwu.serializer();
                if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                    iSerializer = getintrinsicsizenhjbrc.serializer() - 1;
                } else {
                    iSerializer = 0;
                }
                getmodulate0no6vwu.serializer = iSerializer;
            }
            getmodulate0no6vwu.RemoteActionCompatParcelizer = true;
        }
        getSrc0nO6VwU getsrc0no6vwu = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getsrc0no6vwu.MediaSessionCompatQueueItem = getsrc0no6vwu.RatingCompat >= 0 ? 1 : -1;
        int[] iArr = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        iArr[0] = 0;
        iArr[1] = 0;
        RemoteActionCompatParcelizer(getintrinsicsizenhjbrc, iArr);
        int iIconCompatParcelizer3 = this.ComponentActivity.IconCompatParcelizer() + Math.max(0, iArr[0]);
        int iRemoteActionCompatParcelizer10 = this.ComponentActivity.RemoteActionCompatParcelizer() + Math.max(0, iArr[1]);
        if (getintrinsicsizenhjbrc.write && (i6 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) != -1 && this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != Integer.MIN_VALUE && (viewMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i6)) != null) {
            boolean z10 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            getSoftlight0nO6VwU getsoftlight0no6vwu6 = this.ComponentActivity;
            if (z10) {
                iWrite3 = getsoftlight0no6vwu6.write() - this.ComponentActivity.write(viewMediaBrowserCompatMediaItem);
                iRemoteActionCompatParcelizer3 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            } else {
                iRemoteActionCompatParcelizer3 = getsoftlight0no6vwu6.RemoteActionCompatParcelizer(viewMediaBrowserCompatMediaItem) - this.ComponentActivity.IconCompatParcelizer();
                iWrite3 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            }
            int i10 = iWrite3 - iRemoteActionCompatParcelizer3;
            if (i10 > 0) {
                iIconCompatParcelizer3 += i10;
            } else {
                iRemoteActionCompatParcelizer10 -= i10;
            }
        }
        boolean z11 = getmodulate0no6vwu.IconCompatParcelizer;
        boolean z12 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (!z11 ? !z12 : z12) {
            i8 = 1;
        }
        RemoteActionCompatParcelizer(recycler, getintrinsicsizenhjbrc, getmodulate0no6vwu, i8);
        IconCompatParcelizer(recycler);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write = this.ComponentActivity.serializer() == 0 && this.ComponentActivity.read() == 0;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaBrowserCompatMediaItem = 0;
        boolean z13 = getmodulate0no6vwu.IconCompatParcelizer;
        int i11 = getmodulate0no6vwu.serializer;
        if (z13) {
            MediaDescriptionCompat(i11, getmodulate0no6vwu.read);
            getSrc0nO6VwU getsrc0no6vwu2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getsrc0no6vwu2.RemoteActionCompatParcelizer = iIconCompatParcelizer3;
            IconCompatParcelizer(recycler, getsrc0no6vwu2, getintrinsicsizenhjbrc, false);
            getSrc0nO6VwU getsrc0no6vwu3 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            i3 = getsrc0no6vwu3.MediaMetadataCompat;
            int i12 = getsrc0no6vwu3.serializer;
            int i13 = getsrc0no6vwu3.IconCompatParcelizer;
            if (i13 > 0) {
                iRemoteActionCompatParcelizer10 += i13;
            }
            RatingCompat(getmodulate0no6vwu.serializer, getmodulate0no6vwu.read);
            getSrc0nO6VwU getsrc0no6vwu4 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getsrc0no6vwu4.RemoteActionCompatParcelizer = iRemoteActionCompatParcelizer10;
            getsrc0no6vwu4.serializer += getsrc0no6vwu4.read;
            IconCompatParcelizer(recycler, getsrc0no6vwu4, getintrinsicsizenhjbrc, false);
            getSrc0nO6VwU getsrc0no6vwu5 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            i2 = getsrc0no6vwu5.MediaMetadataCompat;
            int i14 = getsrc0no6vwu5.IconCompatParcelizer;
            if (i14 > 0) {
                MediaDescriptionCompat(i12, i3);
                getSrc0nO6VwU getsrc0no6vwu6 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                getsrc0no6vwu6.RemoteActionCompatParcelizer = i14;
                IconCompatParcelizer(recycler, getsrc0no6vwu6, getintrinsicsizenhjbrc, false);
                i3 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaMetadataCompat;
            }
        } else {
            RatingCompat(i11, getmodulate0no6vwu.read);
            getSrc0nO6VwU getsrc0no6vwu7 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getsrc0no6vwu7.RemoteActionCompatParcelizer = iRemoteActionCompatParcelizer10;
            IconCompatParcelizer(recycler, getsrc0no6vwu7, getintrinsicsizenhjbrc, false);
            getSrc0nO6VwU getsrc0no6vwu8 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            i2 = getsrc0no6vwu8.MediaMetadataCompat;
            int i15 = getsrc0no6vwu8.serializer;
            int i16 = getsrc0no6vwu8.IconCompatParcelizer;
            if (i16 > 0) {
                iIconCompatParcelizer3 += i16;
            }
            MediaDescriptionCompat(getmodulate0no6vwu.serializer, getmodulate0no6vwu.read);
            getSrc0nO6VwU getsrc0no6vwu9 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getsrc0no6vwu9.RemoteActionCompatParcelizer = iIconCompatParcelizer3;
            getsrc0no6vwu9.serializer += getsrc0no6vwu9.read;
            IconCompatParcelizer(recycler, getsrc0no6vwu9, getintrinsicsizenhjbrc, false);
            getSrc0nO6VwU getsrc0no6vwu10 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            int i17 = getsrc0no6vwu10.MediaMetadataCompat;
            int i18 = getsrc0no6vwu10.IconCompatParcelizer;
            if (i18 > 0) {
                RatingCompat(i15, i2);
                getSrc0nO6VwU getsrc0no6vwu11 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                getsrc0no6vwu11.RemoteActionCompatParcelizer = i18;
                IconCompatParcelizer(recycler, getsrc0no6vwu11, getintrinsicsizenhjbrc, false);
                i2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaMetadataCompat;
            }
            i3 = i17;
        }
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() > 0) {
            if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ^ this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
                int iSerializer3 = serializer(i2, recycler, getintrinsicsizenhjbrc, true);
                i4 = i3 + iSerializer3;
                i5 = i2 + iSerializer3;
                iSerializer2 = IconCompatParcelizer(i4, recycler, getintrinsicsizenhjbrc, false);
            } else {
                int iIconCompatParcelizer4 = IconCompatParcelizer(i3, recycler, getintrinsicsizenhjbrc, true);
                i4 = i3 + iIconCompatParcelizer4;
                i5 = i2 + iIconCompatParcelizer4;
                iSerializer2 = serializer(i5, recycler, getintrinsicsizenhjbrc, false);
            }
            i3 = i4 + iSerializer2;
            i2 = i5 + iSerializer2;
        }
        if (getintrinsicsizenhjbrc.MediaBrowserCompatMediaItem && r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0 && !getintrinsicsizenhjbrc.write && q_()) {
            List list2 = recycler.MediaBrowserCompatMediaItem;
            int size = list2.size();
            int iRemoteActionCompatParcelizer11 = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(0));
            int i19 = 0;
            int iIconCompatParcelizer5 = 0;
            int iIconCompatParcelizer6 = 0;
            while (i19 < size) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) list2.get(i19);
                if (!viewHolder.isRemoved()) {
                    boolean z14 = viewHolder.getLayoutPosition() < iRemoteActionCompatParcelizer11 ? true : z6;
                    boolean z15 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    getSoftlight0nO6VwU getsoftlight0no6vwu7 = this.ComponentActivity;
                    View view = viewHolder.MediaSessionCompatQueueItem;
                    if (z14 != z15) {
                        iIconCompatParcelizer5 += getsoftlight0no6vwu7.IconCompatParcelizer(view);
                    } else {
                        iIconCompatParcelizer6 += getsoftlight0no6vwu7.IconCompatParcelizer(view);
                    }
                }
                i19++;
                z6 = false;
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.PlaybackStateCompatCustomAction = list2;
            if (iIconCompatParcelizer5 > 0) {
                MediaDescriptionCompat(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper()), i3);
                getSrc0nO6VwU getsrc0no6vwu12 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                getsrc0no6vwu12.RemoteActionCompatParcelizer = iIconCompatParcelizer5;
                r4 = 0;
                getsrc0no6vwu12.IconCompatParcelizer = 0;
                getsrc0no6vwu12.RemoteActionCompatParcelizer(null);
                IconCompatParcelizer(recycler, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, getintrinsicsizenhjbrc, false);
            } else {
                r4 = 0;
            }
            if (iIconCompatParcelizer6 > 0) {
                RatingCompat(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(PlaybackStateCompat()), i2);
                getSrc0nO6VwU getsrc0no6vwu13 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                getsrc0no6vwu13.RemoteActionCompatParcelizer = iIconCompatParcelizer6;
                getsrc0no6vwu13.IconCompatParcelizer = r4;
                list = null;
                getsrc0no6vwu13.RemoteActionCompatParcelizer(null);
                IconCompatParcelizer(recycler, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, getintrinsicsizenhjbrc, (boolean) r4);
            } else {
                list = null;
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.PlaybackStateCompatCustomAction = list;
        }
        if (!getintrinsicsizenhjbrc.write) {
            getSoftlight0nO6VwU getsoftlight0no6vwu8 = this.ComponentActivity;
            getsoftlight0no6vwu8.serializer = getsoftlight0no6vwu8.MediaDescriptionCompat();
        } else {
            getmodulate0no6vwu.IconCompatParcelizer();
        }
        this.PlaybackStateCompat = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write(int i, int i2, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, isActive isactive) {
        if (this.ResultReceiver != 0) {
            i = i2;
        }
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0 || i == 0) {
            return;
        }
        MediaSessionCompatQueueItem();
        read(i > 0 ? 1 : -1, Math.abs(i), true, getintrinsicsizenhjbrc);
        serializer(getintrinsicsizenhjbrc, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, isactive);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ != 1073741824 && this.getSavedStateRegistryControllerannotations != 1073741824) {
            int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            for (int i = 0; i < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i++) {
                ViewGroup.LayoutParams layoutParams = MediaSessionCompatResultReceiverWrapper(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int serializer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (this.ResultReceiver == 1) {
            return 0;
        }
        return RatingCompat(i, recycler, getintrinsicsizenhjbrc);
    }

    public void serializer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, getSrc0nO6VwU getsrc0no6vwu, getSaturation0nO6VwU getsaturation0no6vwu) {
        int i;
        int paddingLeft;
        int i2;
        int iSerializer;
        View view = getsrc0no6vwu.read(recycler);
        if (view == null) {
            getsaturation0no6vwu.read = true;
            return;
        }
        BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
        List list = getsrc0no6vwu.PlaybackStateCompatCustomAction;
        boolean z = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i3 = getsrc0no6vwu.MediaSessionCompatQueueItem;
        if (list == null) {
            if (z == (i3 == -1)) {
                addViewInt(view, -1, false);
            } else {
                addViewInt(view, 0, false);
            }
        } else {
            if (z == (i3 == -1)) {
                addViewInt(view, -1, true);
            } else {
                addViewInt(view, 0, true);
            }
        }
        BlockGraphicsLayerElement blockGraphicsLayerElement2 = (BlockGraphicsLayerElement) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.ensureViewModelStore.getItemDecorInsetsForChild(view);
        int i4 = itemDecorInsetsForChild.left;
        int i5 = itemDecorInsetsForChild.right;
        int i6 = itemDecorInsetsForChild.top;
        int i7 = itemDecorInsetsForChild.bottom;
        int i8 = this.menuHostHelperlambda0;
        int i9 = this.getSavedStateRegistryControllerannotations;
        int paddingLeft2 = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int iWrite = RecyclerView.LayoutManager.write(i8, i9, paddingRight + paddingLeft2 + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).leftMargin + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).rightMargin + i4 + i5, ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).width, RatingCompat());
        int i10 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int i11 = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int iWrite2 = RecyclerView.LayoutManager.write(i10, i11, paddingBottom + paddingTop + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).topMargin + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).bottomMargin + i6 + i7, ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).height, MediaBrowserCompatMediaItem());
        if (RemoteActionCompatParcelizer(view, iWrite, iWrite2, blockGraphicsLayerElement2)) {
            view.measure(iWrite, iWrite2);
        }
        getsaturation0no6vwu.RemoteActionCompatParcelizer = this.ComponentActivity.IconCompatParcelizer(view);
        if (this.ResultReceiver == 1) {
            if (MediaSessionCompatToken()) {
                iSerializer = this.menuHostHelperlambda0 - getPaddingRight();
                paddingLeft = iSerializer - this.ComponentActivity.serializer(view);
            } else {
                paddingLeft = getPaddingLeft();
                iSerializer = this.ComponentActivity.serializer(view) + paddingLeft;
            }
            int i12 = getsrc0no6vwu.MediaSessionCompatQueueItem;
            i2 = getsrc0no6vwu.MediaMetadataCompat;
            int i13 = getsaturation0no6vwu.RemoteActionCompatParcelizer;
            if (i12 == -1) {
                int i14 = i2 - i13;
                i = i2;
                i2 = i14;
            } else {
                i = i13 + i2;
            }
        } else {
            int paddingTop2 = getPaddingTop();
            int iSerializer2 = this.ComponentActivity.serializer(view) + paddingTop2;
            int i15 = getsrc0no6vwu.MediaSessionCompatQueueItem;
            int i16 = getsrc0no6vwu.MediaMetadataCompat;
            int i17 = getsaturation0no6vwu.RemoteActionCompatParcelizer;
            if (i15 == -1) {
                int i18 = i16 - i17;
                i = iSerializer2;
                paddingLeft = i18;
                i2 = paddingTop2;
                iSerializer = i16;
            } else {
                int i19 = i16 + i17;
                i = iSerializer2;
                paddingLeft = i16;
                i2 = paddingTop2;
                iSerializer = i19;
            }
        }
        RecyclerView.LayoutManager.write(view, paddingLeft, i2, iSerializer, i);
        if (blockGraphicsLayerElement.MediaMetadataCompat.isRemoved() || blockGraphicsLayerElement.MediaMetadataCompat.isUpdated()) {
            getsaturation0no6vwu.serializer = true;
        }
        getsaturation0no6vwu.write = view.hasFocusable();
    }

    public final int MediaBrowserCompatMediaItem(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return 0;
        }
        MediaSessionCompatQueueItem();
        getSoftlight0nO6VwU getsoftlight0no6vwu = this.ComponentActivity;
        boolean z = !this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        return ScrollbarHelper.write(getintrinsicsizenhjbrc, getsoftlight0no6vwu, serializer(z), RemoteActionCompatParcelizer(z), this, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
    }

    public final int MediaDescriptionCompat() {
        View view = read(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1, -1, false, true);
        if (view == null) {
            return -1;
        }
        return RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view);
    }

    public final int MediaMetadataCompat(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return 0;
        }
        MediaSessionCompatQueueItem();
        getSoftlight0nO6VwU getsoftlight0no6vwu = this.ComponentActivity;
        boolean z = !this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        return ScrollbarHelper.IconCompatParcelizer(getintrinsicsizenhjbrc, getsoftlight0no6vwu, serializer(z), RemoteActionCompatParcelizer(z), this, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
    }

    public final View MediaSessionCompatQueueItem(int i, int i2) {
        int i3;
        int i4;
        MediaSessionCompatQueueItem();
        if (i2 <= i && i2 >= i) {
            return MediaSessionCompatResultReceiverWrapper(i);
        }
        if (this.ComponentActivity.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(i)) < this.ComponentActivity.IconCompatParcelizer()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.ResultReceiver == 0 ? this.accessensureViewModelStore.IconCompatParcelizer(i, i2, i3, i4) : this.addObserverForBackInvokerlambda0.IconCompatParcelizer(i, i2, i3, i4);
    }

    public final void MediaSessionCompatQueueItem(int i) {
        if (i != 0 && i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "invalid orientation:"));
            return;
        }
        read((String) null);
        if (i != this.ResultReceiver || this.ComponentActivity == null) {
            getSoftlight0nO6VwU getsoftlight0no6vwuIconCompatParcelizer = getSoftlight0nO6VwU.IconCompatParcelizer(this, i);
            this.ComponentActivity = getsoftlight0no6vwuIconCompatParcelizer;
            this.MediaSessionCompatToken.write = getsoftlight0no6vwuIconCompatParcelizer;
            this.ResultReceiver = i;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        }
    }

    public final int RatingCompat(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return 0;
        }
        MediaSessionCompatQueueItem();
        getSoftlight0nO6VwU getsoftlight0no6vwu = this.ComponentActivity;
        boolean z = !this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        return ScrollbarHelper.IconCompatParcelizer(getintrinsicsizenhjbrc, getsoftlight0no6vwu, serializer(z), RemoteActionCompatParcelizer(z), this, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View MediaBrowserCompatMediaItem(int i) {
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        if (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == 0) {
            return null;
        }
        int iRemoteActionCompatParcelizer = i - RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(0));
        if (iRemoteActionCompatParcelizer >= 0 && iRemoteActionCompatParcelizer < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(iRemoteActionCompatParcelizer);
            if (RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper) == i) {
                return viewMediaSessionCompatResultReceiverWrapper;
            }
        }
        return super.MediaBrowserCompatMediaItem(i);
    }

    @Override // o.applyToPq9zytI
    public final PointF MediaMetadataCompat(int i) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
            return null;
        }
        int i2 = (i < RecyclerView.LayoutManager.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper(0))) != this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ? -1 : 1;
        return this.ResultReceiver == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void read(RecyclerView.Recycler recycler, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                read(i, recycler);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    read(i2, recycler);
                }
            }
        }
    }

    public final int RatingCompat(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != 0 && i != 0) {
            MediaSessionCompatQueueItem();
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaDescriptionCompat = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            read(i2, iAbs, true, getintrinsicsizenhjbrc);
            getSrc0nO6VwU getsrc0no6vwu = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            int iIconCompatParcelizer = IconCompatParcelizer(recycler, getsrc0no6vwu, getintrinsicsizenhjbrc, false) + getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper;
            if (iIconCompatParcelizer >= 0) {
                if (iAbs > iIconCompatParcelizer) {
                    i = i2 * iIconCompatParcelizer;
                }
                this.ComponentActivity.IconCompatParcelizer(-i);
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RatingCompat = i;
                return i;
            }
        }
        return 0;
    }

    public final View read(int i, int i2, boolean z, boolean z2) {
        MediaSessionCompatQueueItem();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.ResultReceiver == 0 ? this.accessensureViewModelStore.IconCompatParcelizer(i, i2, i3, i4) : this.addObserverForBackInvokerlambda0.IconCompatParcelizer(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean RemoteActionCompatParcelizer(int i, Bundle bundle) {
        int iMin;
        if (super.RemoteActionCompatParcelizer(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.ResultReceiver == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.ensureViewModelStore;
                iMin = Math.min(i2, RemoteActionCompatParcelizer(recyclerView.getLastCustomNonConfigurationInstance, recyclerView.onCreatePanelMenu) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.ensureViewModelStore;
                iMin = Math.min(i3, serializer(recyclerView2.getLastCustomNonConfigurationInstance, recyclerView2.onCreatePanelMenu) - 1);
            }
            if (iMin >= 0) {
                MediaBrowserCompatMediaItem(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public final int MediaDescriptionCompat(int i) {
        if (i == 1) {
            return (this.ResultReceiver != 1 && MediaSessionCompatToken()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.ResultReceiver != 1 && MediaSessionCompatToken()) ? -1 : 1;
        }
        if (i == 17) {
            return this.ResultReceiver == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.ResultReceiver == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.ResultReceiver == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.ResultReceiver == 0 ? 1 : Integer.MIN_VALUE;
    }

    public LinearLayoutManager(int i) {
        this.ResultReceiver = 1;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = false;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = false;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = false;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = -1;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Integer.MIN_VALUE;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        this.MediaSessionCompatToken = new getModulate0nO6VwU();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new getSaturation0nO6VwU();
        this.PlaybackStateCompatCustomAction = 2;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new int[2];
        MediaSessionCompatQueueItem(i);
        read((String) null);
    }
}
