package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import java.util.ArrayList;
import o.BlendModeColorFilterHelperExternalSyntheticApiModelOutline1;
import o.getDifference0nO6VwU;
import o.getDst0nO6VwU;
import o.getDstAtop0nO6VwU;
import o.getDstIn0nO6VwU;
import o.getIntrinsicSizeNHjbRc;

/* JADX INFO: loaded from: classes.dex */
public final class FastScroller extends RecyclerView.ItemDecoration implements BlendModeColorFilterHelperExternalSyntheticApiModelOutline1 {
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public float MediaMetadataCompat;
    public final StateListDrawable MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public final Drawable ParcelableVolumeInfo;
    public final int PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public final RecyclerView ResultReceiver;
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public float r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final ValueAnimator r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final StateListDrawable r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final Drawable r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public final getDstIn0nO6VwU serializer;
    public static final int[] write = {R.attr.state_pressed};
    public static final int[] read = new int[0];
    public int ComponentActivity = 0;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
    public boolean PlaybackStateCompat = false;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
    public int RemoteActionCompatParcelizer = 0;
    public final int[] r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new int[2];
    public final int[] MediaDescriptionCompat = new int[2];

    public static int serializer(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // o.BlendModeColorFilterHelperExternalSyntheticApiModelOutline1
    public final void RemoteActionCompatParcelizer(boolean z) {
    }

    public final void IconCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        ValueAnimator valueAnimator = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.IconCompatParcelizer = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        int i = this.ComponentActivity;
        RecyclerView recyclerView2 = this.ResultReceiver;
        if (i != recyclerView2.getWidth() || this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != recyclerView2.getHeight()) {
            this.ComponentActivity = recyclerView2.getWidth();
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = recyclerView2.getHeight();
            serializer(0);
            return;
        }
        if (this.IconCompatParcelizer != 0) {
            if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                int i2 = this.ComponentActivity;
                int i3 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                int i4 = i2 - i3;
                int i5 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                int i6 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                int i9 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                Drawable drawable = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                drawable.setBounds(0, 0, i8, i9);
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.PlaybackStateCompat) {
                int i10 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                int i11 = this.RatingCompat;
                int i12 = i10 - i11;
                int i13 = this.MediaBrowserCompatMediaItem;
                int i14 = this.MediaSessionCompatResultReceiverWrapper;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.MediaSessionCompatQueueItem;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.ComponentActivity;
                int i17 = this.MediaSessionCompatToken;
                Drawable drawable2 = this.ParcelableVolumeInfo;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean read(float f, float f2) {
        if (f2 < this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys - this.RatingCompat) {
            return false;
        }
        int i = this.MediaBrowserCompatMediaItem;
        int i2 = this.MediaSessionCompatResultReceiverWrapper / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i2 + i));
    }

    public final void serializer(int i) {
        RecyclerView recyclerView = this.ResultReceiver;
        getDstIn0nO6VwU getdstin0no6vwu = this.serializer;
        StateListDrawable stateListDrawable = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (i == 2 && this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != 2) {
            stateListDrawable.setState(write);
            recyclerView.removeCallbacks(getdstin0no6vwu);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            IconCompatParcelizer();
        }
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == 2 && i != 2) {
            stateListDrawable.setState(read);
            recyclerView.removeCallbacks(getdstin0no6vwu);
            recyclerView.postDelayed(getdstin0no6vwu, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(getdstin0no6vwu);
            recyclerView.postDelayed(getdstin0no6vwu, 1500L);
        }
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i;
    }

    public final boolean write(float f, float f2) {
        int layoutDirection = this.ResultReceiver.getLayoutDirection();
        int i = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.ComponentActivity - i) {
            return false;
        }
        int i2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int i3 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        int i4 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = valueAnimatorOfFloat;
        this.IconCompatParcelizer = 0;
        getDstIn0nO6VwU getdstin0no6vwu = new getDstIn0nO6VwU(i4, this);
        this.serializer = getdstin0no6vwu;
        getDstAtop0nO6VwU getdstatop0no6vwu = new getDstAtop0nO6VwU(this);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = stateListDrawable;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = drawable;
        this.MediaSessionCompatQueueItem = stateListDrawable2;
        this.ParcelableVolumeInfo = drawable2;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = Math.max(i, drawable.getIntrinsicWidth());
        this.RatingCompat = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.MediaSessionCompatToken = Math.max(i, drawable2.getIntrinsicWidth());
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2;
        this.PlaybackStateCompatCustomAction = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new getDifference0nO6VwU(this));
        valueAnimatorOfFloat.addUpdateListener(new getDst0nO6VwU(i4, this));
        RecyclerView recyclerView2 = this.ResultReceiver;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            RecyclerView recyclerView3 = this.ResultReceiver;
            recyclerView3.addOnPictureInPictureModeChangedListener.remove(this);
            if (recyclerView3._init_lambda2 == this) {
                recyclerView3._init_lambda2 = null;
            }
            ArrayList arrayList = this.ResultReceiver.onBackPressed;
            if (arrayList != null) {
                arrayList.remove(getdstatop0no6vwu);
            }
            this.ResultReceiver.removeCallbacks(getdstin0no6vwu);
        }
        this.ResultReceiver = recyclerView;
        recyclerView.addItemDecoration(this);
        recyclerView.addOnPictureInPictureModeChangedListener.add(this);
        recyclerView.addOnScrollListener(getdstatop0no6vwu);
    }

    @Override // o.BlendModeColorFilterHelperExternalSyntheticApiModelOutline1
    public final void serializer(MotionEvent motionEvent) {
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zWrite = write(motionEvent.getX(), motionEvent.getY());
            boolean z = read(motionEvent.getX(), motionEvent.getY());
            if (zWrite || z) {
                if (z) {
                    this.RemoteActionCompatParcelizer = 1;
                    this.MediaMetadataCompat = (int) motionEvent.getX();
                } else if (zWrite) {
                    this.RemoteActionCompatParcelizer = 2;
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = (int) motionEvent.getY();
                }
                serializer(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == 2) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = 0.0f;
            this.MediaMetadataCompat = 0.0f;
            serializer(1);
            this.RemoteActionCompatParcelizer = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == 2) {
            IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            RecyclerView recyclerView = this.ResultReceiver;
            int i2 = this.PlaybackStateCompatCustomAction;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.MediaDescriptionCompat;
                iArr[0] = i2;
                int i3 = this.ComponentActivity - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.MediaBrowserCompatMediaItem - fMax) >= 2.0f) {
                    int iSerializer = serializer(this.MediaMetadataCompat, fMax, iArr, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.ComponentActivity);
                    if (iSerializer != 0) {
                        recyclerView.scrollBy(iSerializer, 0);
                    }
                    this.MediaMetadataCompat = fMax;
                }
            }
            if (this.RemoteActionCompatParcelizer == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                iArr2[0] = i2;
                int i4 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg - fMax2) < 2.0f) {
                    return;
                }
                int iSerializer2 = serializer(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, fMax2, iArr2, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                if (iSerializer2 != 0) {
                    recyclerView.scrollBy(0, iSerializer2);
                }
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = fMax2;
            }
        }
    }

    @Override // o.BlendModeColorFilterHelperExternalSyntheticApiModelOutline1
    public final boolean write(MotionEvent motionEvent) {
        int i = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (i != 1) {
            return i == 2;
        }
        boolean zWrite = write(motionEvent.getX(), motionEvent.getY());
        boolean z = read(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zWrite && !z) {
            return false;
        }
        if (z) {
            this.RemoteActionCompatParcelizer = 1;
            this.MediaMetadataCompat = (int) motionEvent.getX();
        } else if (zWrite) {
            this.RemoteActionCompatParcelizer = 2;
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = (int) motionEvent.getY();
        }
        serializer(2);
        return true;
    }
}
