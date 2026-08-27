package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.nlp.scan.FB;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import o.BlockGraphicsLayerElement;
import o.BlurEffect;
import o.floorslo4al4;
import o.isFiniteimpl;
import o.roundslo4al4;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollEventAdapter extends BlurEffect {
    public roundslo4al4 IconCompatParcelizer;
    public final floorslo4al4 MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public final LinearLayoutManager MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public final ViewPager2 PlaybackStateCompat;
    public final ViewPager2.RecyclerViewImpl RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public boolean serializer;
    public boolean write;

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    @Override // o.BlurEffect
    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        int i3;
        roundslo4al4 roundslo4al4Var;
        this.MediaMetadataCompat = true;
        RemoteActionCompatParcelizer();
        boolean z = this.write;
        floorslo4al4 floorslo4al4Var = this.MediaBrowserCompatMediaItem;
        if (z) {
            this.write = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.PlaybackStateCompat.MediaMetadataCompat.ensureViewModelStore.getLayoutDirection() == 1)) {
                        if (floorslo4al4Var.serializer != 0) {
                            i3 = floorslo4al4Var.IconCompatParcelizer + 1;
                        }
                    }
                }
                i3 = floorslo4al4Var.IconCompatParcelizer;
            } else if (floorslo4al4Var.serializer != 0) {
                i3 = floorslo4al4Var.IconCompatParcelizer + 1;
            } else {
                i3 = floorslo4al4Var.IconCompatParcelizer;
            }
            this.MediaSessionCompatResultReceiverWrapper = i3;
            if (this.RemoteActionCompatParcelizer != i3 && (roundslo4al4Var = this.IconCompatParcelizer) != null) {
                roundslo4al4Var.RemoteActionCompatParcelizer(i3);
            }
        } else if (this.read == 0) {
            int i4 = floorslo4al4Var.IconCompatParcelizer;
            if (i4 == -1) {
                i4 = 0;
            }
            roundslo4al4 roundslo4al4Var2 = this.IconCompatParcelizer;
            if (roundslo4al4Var2 != null) {
                roundslo4al4Var2.RemoteActionCompatParcelizer(i4);
            }
        }
        int i5 = floorslo4al4Var.IconCompatParcelizer;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = floorslo4al4Var.read;
        int i6 = floorslo4al4Var.serializer;
        roundslo4al4 roundslo4al4Var3 = this.IconCompatParcelizer;
        if (roundslo4al4Var3 != null) {
            roundslo4al4Var3.read(i5, f, i6);
        }
        int i7 = floorslo4al4Var.IconCompatParcelizer;
        int i8 = this.MediaSessionCompatResultReceiverWrapper;
        if ((i7 == i8 || i8 == -1) && floorslo4al4Var.serializer == 0 && this.MediaDescriptionCompat != 1) {
            RemoteActionCompatParcelizer(0);
            read();
        }
    }

    public final void read() {
        this.read = 0;
        this.MediaDescriptionCompat = 0;
        floorslo4al4 floorslo4al4Var = this.MediaBrowserCompatMediaItem;
        floorslo4al4Var.IconCompatParcelizer = -1;
        floorslo4al4Var.read = 0.0f;
        floorslo4al4Var.serializer = 0;
        this.RemoteActionCompatParcelizer = -1;
        this.MediaSessionCompatResultReceiverWrapper = -1;
        this.write = false;
        this.MediaMetadataCompat = false;
        this.serializer = false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0144 A[LOOP:2: B:62:0x0138->B:65:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0147 A[SYNTHETIC] */
    public final void RemoteActionCompatParcelizer() {
        int top;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.MediaSessionCompatQueueItem;
        int iMediaMetadataCompat = linearLayoutManager.MediaMetadataCompat();
        floorslo4al4 floorslo4al4Var = this.MediaBrowserCompatMediaItem;
        floorslo4al4Var.IconCompatParcelizer = iMediaMetadataCompat;
        if (iMediaMetadataCompat == -1) {
            floorslo4al4Var.IconCompatParcelizer = -1;
            floorslo4al4Var.read = 0.0f;
            floorslo4al4Var.serializer = 0;
            return;
        }
        View viewMediaBrowserCompatMediaItem = linearLayoutManager.MediaBrowserCompatMediaItem(iMediaMetadataCompat);
        if (viewMediaBrowserCompatMediaItem == null) {
            floorslo4al4Var.IconCompatParcelizer = -1;
            floorslo4al4Var.read = 0.0f;
            floorslo4al4Var.serializer = 0;
            return;
        }
        int i3 = ((BlockGraphicsLayerElement) viewMediaBrowserCompatMediaItem.getLayoutParams()).serializer.left;
        int i4 = ((BlockGraphicsLayerElement) viewMediaBrowserCompatMediaItem.getLayoutParams()).serializer.right;
        int i5 = ((BlockGraphicsLayerElement) viewMediaBrowserCompatMediaItem.getLayoutParams()).serializer.top;
        int i6 = ((BlockGraphicsLayerElement) viewMediaBrowserCompatMediaItem.getLayoutParams()).serializer.bottom;
        ViewGroup.LayoutParams layoutParams = viewMediaBrowserCompatMediaItem.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewMediaBrowserCompatMediaItem.getHeight() + i5 + i6;
        int width = viewMediaBrowserCompatMediaItem.getWidth();
        int i7 = linearLayoutManager.ResultReceiver;
        ViewPager2.RecyclerViewImpl recyclerViewImpl = this.RatingCompat;
        if (i7 == 0) {
            top = (viewMediaBrowserCompatMediaItem.getLeft() - i3) - recyclerViewImpl.getPaddingLeft();
            if (this.PlaybackStateCompat.MediaMetadataCompat.ensureViewModelStore.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width + i3 + i4;
        } else {
            top = (viewMediaBrowserCompatMediaItem.getTop() - i5) - recyclerViewImpl.getPaddingTop();
        }
        int i8 = -top;
        floorslo4al4Var.serializer = i8;
        if (i8 >= 0) {
            floorslo4al4Var.read = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = linearLayoutManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        if (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 != 0) {
            boolean z = linearLayoutManager.ResultReceiver == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2, 2);
            for (int i9 = 0; i9 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2; i9++) {
                View viewMediaSessionCompatResultReceiverWrapper = linearLayoutManager.MediaSessionCompatResultReceiverWrapper(i9);
                if (viewMediaSessionCompatResultReceiverWrapper == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = viewMediaSessionCompatResultReceiverWrapper.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : isFiniteimpl.read;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = viewMediaSessionCompatResultReceiverWrapper.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewMediaSessionCompatResultReceiverWrapper.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = viewMediaSessionCompatResultReceiverWrapper.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewMediaSessionCompatResultReceiverWrapper.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new FB(5));
            int i10 = 1;
            while (true) {
                if (i10 >= iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    if (i12 <= 0 && iArr[iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 - 1][1] >= i11 - i12) {
                        if (linearLayoutManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() <= 1) {
                        }
                    }
                } else if (iArr[i10 - 1][1] == iArr[i10][0]) {
                    i10++;
                }
                iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = linearLayoutManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                for (int i13 = 0; i13 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i13++) {
                    if (!isFiniteimpl.IconCompatParcelizer(linearLayoutManager.MediaSessionCompatResultReceiverWrapper(i13))) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        return;
                    }
                }
            }
        } else if (linearLayoutManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() <= 1) {
            iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = linearLayoutManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            while (i13 < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                if (!isFiniteimpl.IconCompatParcelizer(linearLayoutManager.MediaSessionCompatResultReceiverWrapper(i13))) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
        }
        Locale locale = Locale.US;
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(floorslo4al4Var.serializer, "Page can only be offset by a positive amount, not by "));
    }

    public ScrollEventAdapter(ViewPager2 viewPager2) {
        this.PlaybackStateCompat = viewPager2;
        ViewPager2.RecyclerViewImpl recyclerViewImpl = viewPager2.MediaSessionCompatToken;
        this.RatingCompat = recyclerViewImpl;
        this.MediaSessionCompatQueueItem = (LinearLayoutManager) recyclerViewImpl.getLayoutManager();
        this.MediaBrowserCompatMediaItem = new floorslo4al4();
        read();
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if ((this.read == 3 && this.MediaDescriptionCompat == 0) || this.MediaDescriptionCompat == i) {
            return;
        }
        this.MediaDescriptionCompat = i;
        roundslo4al4 roundslo4al4Var = this.IconCompatParcelizer;
        if (roundslo4al4Var != null) {
            roundslo4al4Var.serializer(i);
        }
    }

    @Override // o.BlurEffect
    public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i) {
        roundslo4al4 roundslo4al4Var;
        roundslo4al4 roundslo4al4Var2;
        int i2 = this.read;
        if (!(i2 == 1 && this.MediaDescriptionCompat == 1) && i == 1) {
            this.read = 1;
            int i3 = this.MediaSessionCompatResultReceiverWrapper;
            if (i3 != -1) {
                this.RemoteActionCompatParcelizer = i3;
                this.MediaSessionCompatResultReceiverWrapper = -1;
            } else if (this.RemoteActionCompatParcelizer == -1) {
                this.RemoteActionCompatParcelizer = this.MediaSessionCompatQueueItem.MediaMetadataCompat();
            }
            RemoteActionCompatParcelizer(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.MediaMetadataCompat) {
                RemoteActionCompatParcelizer(2);
                this.write = true;
                return;
            }
            return;
        }
        floorslo4al4 floorslo4al4Var = this.MediaBrowserCompatMediaItem;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            RemoteActionCompatParcelizer();
            if (!this.MediaMetadataCompat) {
                int i4 = floorslo4al4Var.IconCompatParcelizer;
                if (i4 != -1 && (roundslo4al4Var2 = this.IconCompatParcelizer) != null) {
                    roundslo4al4Var2.read(i4, 0.0f, 0);
                }
            } else if (floorslo4al4Var.serializer == 0) {
                int i5 = this.RemoteActionCompatParcelizer;
                int i6 = floorslo4al4Var.IconCompatParcelizer;
                if (i5 != i6 && (roundslo4al4Var = this.IconCompatParcelizer) != null) {
                    roundslo4al4Var.RemoteActionCompatParcelizer(i6);
                }
            }
            RemoteActionCompatParcelizer(0);
            read();
        }
        if (this.read == 2 && i == 0 && this.serializer) {
            RemoteActionCompatParcelizer();
            if (floorslo4al4Var.serializer == 0) {
                int i7 = this.MediaSessionCompatResultReceiverWrapper;
                int i8 = floorslo4al4Var.IconCompatParcelizer;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    roundslo4al4 roundslo4al4Var3 = this.IconCompatParcelizer;
                    if (roundslo4al4Var3 != null) {
                        roundslo4al4Var3.RemoteActionCompatParcelizer(i8);
                    }
                }
                RemoteActionCompatParcelizer(0);
                read();
            }
        }
    }
}
