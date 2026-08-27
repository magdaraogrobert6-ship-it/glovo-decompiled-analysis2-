package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import o.BlockGraphicsLayerElement;
import o.BrushCompanion;
import o.applyToPq9zytI;
import o.getIntrinsicSizeNHjbRc;

/* JADX INFO: loaded from: classes.dex */
public class LinearSmoothScroller {
    public int IconCompatParcelizer;
    public final LinearInterpolator MediaBrowserCompatMediaItem;
    public RecyclerView.LayoutManager MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper = -1;
    public final BrushCompanion MediaSessionCompatToken;
    public PointF ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public RecyclerView RatingCompat;
    public int RemoteActionCompatParcelizer;
    public View r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final DecelerateInterpolator read;
    public boolean serializer;
    public final DisplayMetrics write;

    public float write(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    public final void onAnimation(int i, int i2) {
        PointF pointF;
        RecyclerView recyclerView = this.RatingCompat;
        if (this.MediaSessionCompatResultReceiverWrapper == -1 || recyclerView == null) {
            RemoteActionCompatParcelizer();
        }
        if (this.MediaMetadataCompat && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null && this.MediaDescriptionCompat != null && (pointF = read(this.MediaSessionCompatResultReceiverWrapper)) != null) {
            float f = pointF.x;
            if (f != 0.0f || pointF.y != 0.0f) {
                recyclerView.scrollStep(null, (int) Math.signum(f), (int) Math.signum(pointF.y));
            }
        }
        this.MediaMetadataCompat = false;
        View view = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        BrushCompanion brushCompanion = this.MediaSessionCompatToken;
        if (view != null) {
            this.RatingCompat.getClass();
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if ((childViewHolderInt != null ? childViewHolderInt.getLayoutPosition() : -1) == this.MediaSessionCompatResultReceiverWrapper) {
                View view2 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc = recyclerView.onCreatePanelMenu;
                RemoteActionCompatParcelizer(view2, brushCompanion);
                brushCompanion.IconCompatParcelizer(recyclerView);
                RemoteActionCompatParcelizer();
            } else {
                SentryLogcatAdapter.serializer("RecyclerView", "Passed over target position while smooth scrolling.");
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
            }
        }
        if (this.PlaybackStateCompat) {
            getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc2 = recyclerView.onCreatePanelMenu;
            if (this.RatingCompat.fullyDrawnReporter_delegatelambda00.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() == 0) {
                RemoteActionCompatParcelizer();
            } else {
                int i3 = this.IconCompatParcelizer;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.IconCompatParcelizer = i4;
                int i5 = this.RemoteActionCompatParcelizer;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.RemoteActionCompatParcelizer = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointF2 = read(this.MediaSessionCompatResultReceiverWrapper);
                    if (pointF2 != null) {
                        float f2 = pointF2.x;
                        if (f2 == 0.0f && pointF2.y == 0.0f) {
                            brushCompanion.MediaSessionCompatQueueItem = this.MediaSessionCompatResultReceiverWrapper;
                            RemoteActionCompatParcelizer();
                        } else {
                            float f3 = pointF2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = pointF2.x / fSqrt;
                            pointF2.x = f4;
                            float f5 = pointF2.y / fSqrt;
                            pointF2.y = f5;
                            this.ParcelableVolumeInfo = pointF2;
                            this.IconCompatParcelizer = (int) (f4 * 10000.0f);
                            this.RemoteActionCompatParcelizer = (int) (f5 * 10000.0f);
                            int iSerializer = serializer(10000);
                            int i7 = (int) (this.IconCompatParcelizer * 1.2f);
                            int i8 = (int) (this.RemoteActionCompatParcelizer * 1.2f);
                            brushCompanion.read = i7;
                            brushCompanion.IconCompatParcelizer = i8;
                            brushCompanion.write = (int) (iSerializer * 1.2f);
                            brushCompanion.RatingCompat = this.MediaBrowserCompatMediaItem;
                            brushCompanion.RemoteActionCompatParcelizer = true;
                        }
                    } else {
                        brushCompanion.MediaSessionCompatQueueItem = this.MediaSessionCompatResultReceiverWrapper;
                        RemoteActionCompatParcelizer();
                    }
                }
            }
            boolean z = brushCompanion.MediaSessionCompatQueueItem >= 0;
            brushCompanion.IconCompatParcelizer(recyclerView);
            if (z && this.PlaybackStateCompat) {
                this.MediaMetadataCompat = true;
                recyclerView.onPreparePanel.serializer();
            }
        }
    }

    public PointF read(int i) {
        Object obj = this.MediaDescriptionCompat;
        if (obj instanceof applyToPq9zytI) {
            return ((applyToPq9zytI) obj).MediaMetadataCompat(i);
        }
        SentryLogcatAdapter.IconCompatParcelizer("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + applyToPq9zytI.class.getCanonicalName());
        return null;
    }

    public LinearSmoothScroller(Context context) {
        BrushCompanion brushCompanion = new BrushCompanion();
        brushCompanion.MediaSessionCompatQueueItem = -1;
        brushCompanion.RemoteActionCompatParcelizer = false;
        brushCompanion.serializer = 0;
        brushCompanion.read = 0;
        brushCompanion.IconCompatParcelizer = 0;
        brushCompanion.write = Integer.MIN_VALUE;
        brushCompanion.RatingCompat = null;
        this.MediaSessionCompatToken = brushCompanion;
        this.MediaBrowserCompatMediaItem = new LinearInterpolator();
        this.read = new DecelerateInterpolator();
        this.serializer = false;
        this.IconCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = 0;
        this.write = context.getResources().getDisplayMetrics();
    }

    public int serializer(View view, int i) {
        RecyclerView.LayoutManager layoutManager = this.MediaDescriptionCompat;
        if (layoutManager == null || !layoutManager.RatingCompat()) {
            return 0;
        }
        BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
        int iWrite = RecyclerView.LayoutManager.write(view);
        int i2 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).leftMargin;
        return IconCompatParcelizer(iWrite - i2, RecyclerView.LayoutManager.a_(view) + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).rightMargin, layoutManager.getPaddingLeft(), layoutManager.menuHostHelperlambda0 - layoutManager.getPaddingRight(), i);
    }

    public int write(View view, int i) {
        RecyclerView.LayoutManager layoutManager = this.MediaDescriptionCompat;
        if (layoutManager == null || !layoutManager.MediaBrowserCompatMediaItem()) {
            return 0;
        }
        BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
        int iIconCompatParcelizer = RecyclerView.LayoutManager.IconCompatParcelizer(view);
        int i2 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).topMargin;
        return IconCompatParcelizer(iIconCompatParcelizer - i2, RecyclerView.LayoutManager.serializer(view) + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).bottomMargin, layoutManager.getPaddingTop(), layoutManager.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 - layoutManager.getPaddingBottom(), i);
    }

    public int serializer(int i) {
        float fAbs = Math.abs(i);
        if (!this.serializer) {
            this.MediaSessionCompatQueueItem = write(this.write);
            this.serializer = true;
        }
        return (int) Math.ceil(fAbs * this.MediaSessionCompatQueueItem);
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.PlaybackStateCompat) {
            this.PlaybackStateCompat = false;
            this.RemoteActionCompatParcelizer = 0;
            this.IconCompatParcelizer = 0;
            this.ParcelableVolumeInfo = null;
            this.RatingCompat.onCreatePanelMenu.PlaybackStateCompat = -1;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
            this.MediaSessionCompatResultReceiverWrapper = -1;
            this.MediaMetadataCompat = false;
            RecyclerView.LayoutManager layoutManager = this.MediaDescriptionCompat;
            if (layoutManager.addObserverForBackInvoker == this) {
                layoutManager.addObserverForBackInvoker = null;
            }
            this.MediaDescriptionCompat = null;
            this.RatingCompat = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX WARN: Code duplicated, block: B:18:0x0029  */
    public void RemoteActionCompatParcelizer(View view, BrushCompanion brushCompanion) {
        int i;
        PointF pointF = this.ParcelableVolumeInfo;
        int i2 = -1;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iSerializer = serializer(view, i);
        PointF pointF2 = this.ParcelableVolumeInfo;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 == 0.0f) {
                i2 = 0;
            } else if (f2 > 0.0f) {
                i2 = 1;
            }
        } else {
            i2 = 0;
        }
        int iWrite = write(view, i2);
        int iCeil = (int) Math.ceil(((double) serializer((int) Math.sqrt((iWrite * iWrite) + (iSerializer * iSerializer)))) / 0.3356d);
        if (iCeil > 0) {
            brushCompanion.read = -iSerializer;
            brushCompanion.IconCompatParcelizer = -iWrite;
            brushCompanion.write = iCeil;
            brushCompanion.RatingCompat = this.read;
            brushCompanion.RemoteActionCompatParcelizer = true;
        }
    }

    public static int IconCompatParcelizer(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }
}
