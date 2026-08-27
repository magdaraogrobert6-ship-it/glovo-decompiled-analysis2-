package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import coil3.Extras$Key;

/* JADX INFO: loaded from: classes.dex */
public class setContentHeight extends FrameLayout {
    public TypedValue IconCompatParcelizer;
    public TypedValue MediaBrowserCompatMediaItem;
    public TypedValue MediaDescriptionCompat;
    public TypedValue MediaMetadataCompat;
    public TypedValue RatingCompat;
    public getSubtitle RemoteActionCompatParcelizer;
    public TypedValue read;
    public final android.graphics.Rect write;

    public setContentHeight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.write = new android.graphics.Rect();
    }

    public void setAttachListener(getSubtitle getsubtitle) {
        this.RemoteActionCompatParcelizer = getsubtitle;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int iMakeMeasureSpec2;
        boolean z2;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        android.graphics.Rect rect = this.write;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.MediaMetadataCompat : this.MediaBrowserCompatMediaItem;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                iMakeMeasureSpec = i;
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        float f = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(f, f);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        iMakeMeasureSpec = i;
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    iMakeMeasureSpec = i;
                    z = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i2;
        } else {
            TypedValue typedValue2 = z3 ? this.IconCompatParcelizer : this.read;
            if (typedValue2 == null || (i5 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i2;
            } else {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        float f2 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(f2, f2);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i2;
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i2;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.MediaDescriptionCompat : this.RatingCompat;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        float f3 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(f3, f3);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        i4 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    i4 -= rect.left + rect.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getSubtitle getsubtitle = this.RemoteActionCompatParcelizer;
        if (getsubtitle != null) {
            getsubtitle.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSubtitle getsubtitle = this.RemoteActionCompatParcelizer;
        if (getsubtitle != null) {
            startActivityForResult startactivityforresult = (startActivityForResult) ((Extras$Key) getsubtitle).IconCompatParcelizer;
            onDestroy ondestroy = startactivityforresult.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            if (ondestroy != null) {
                ondestroy.IconCompatParcelizer();
            }
            if (startactivityforresult.ResultReceiver != null) {
                startactivityforresult.getLastCustomNonConfigurationInstance.getDecorView().removeCallbacks(startactivityforresult.addOnNewIntentListener);
                if (startactivityforresult.ResultReceiver.isShowing()) {
                    try {
                        startactivityforresult.ResultReceiver.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                startactivityforresult.ResultReceiver = null;
            }
            getRedirectui getredirectui = startactivityforresult._init_lambda2;
            if (getredirectui != null) {
                getredirectui.serializer();
            }
            AlertControllerButtonHandler alertControllerButtonHandler = startactivityforresult.write(0).ParcelableVolumeInfo;
            if (alertControllerButtonHandler != null) {
                alertControllerButtonHandler.close();
            }
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new TypedValue();
        }
        return this.IconCompatParcelizer;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.read == null) {
            this.read = new TypedValue();
        }
        return this.read;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.MediaBrowserCompatMediaItem == null) {
            this.MediaBrowserCompatMediaItem = new TypedValue();
        }
        return this.MediaBrowserCompatMediaItem;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new TypedValue();
        }
        return this.MediaMetadataCompat;
    }

    public TypedValue getMinWidthMajor() {
        if (this.RatingCompat == null) {
            this.RatingCompat = new TypedValue();
        }
        return this.RatingCompat;
    }

    public TypedValue getMinWidthMinor() {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new TypedValue();
        }
        return this.MediaDescriptionCompat;
    }
}
