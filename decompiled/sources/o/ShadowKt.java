package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class ShadowKt extends androidx.constraintlayout.widget.VirtualLayout {
    public hasSpecifiedAndFiniteWidthuvyYCjk read;

    public ShadowKt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void serializer(setAlignment setalignment, boolean z) {
        hasSpecifiedAndFiniteWidthuvyYCjk hasspecifiedandfinitewidthuvyycjk = this.read;
        int i = hasspecifiedandfinitewidthuvyycjk.startActivityForResult;
        if (i > 0 || hasspecifiedandfinitewidthuvyycjk.setPictureInPictureParams > 0) {
            if (z) {
                hasspecifiedandfinitewidthuvyycjk.getLifecycleRegistry1 = hasspecifiedandfinitewidthuvyycjk.setPictureInPictureParams;
                hasspecifiedandfinitewidthuvyycjk.startIntentSenderForResult = i;
            } else {
                hasspecifiedandfinitewidthuvyycjk.getLifecycleRegistry1 = i;
                hasspecifiedandfinitewidthuvyycjk.startIntentSenderForResult = hasspecifiedandfinitewidthuvyycjk.setPictureInPictureParams;
            }
        }
    }

    public void setFirstHorizontalBias(float f) {
        this.read.MediaBrowserCompatMediaItem = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.read.MediaMetadataCompat = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.read.RatingCompat = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.read.MediaDescriptionCompat = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.read.MediaSessionCompatResultReceiverWrapper = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.read.PlaybackStateCompatCustomAction = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.read.PlaybackStateCompat = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.read.ParcelableVolumeInfo = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.read.MediaSessionCompatToken = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.read.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.read.ResultReceiver = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.read.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.read.ComponentActivity = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
        requestLayout();
    }

    public void setPadding(int i) {
        hasSpecifiedAndFiniteWidthuvyYCjk hasspecifiedandfinitewidthuvyycjk = this.read;
        hasspecifiedandfinitewidthuvyycjk.setContentView = i;
        hasspecifiedandfinitewidthuvyycjk.reportFullyDrawn = i;
        hasspecifiedandfinitewidthuvyycjk.startActivityForResult = i;
        hasspecifiedandfinitewidthuvyycjk.setPictureInPictureParams = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.read.reportFullyDrawn = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.read.getLifecycleRegistry1 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.read.startIntentSenderForResult = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.read.setContentView = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.read.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.read.removeOnConfigurationChangedListener = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.read.peekAvailableContext = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.read.registerForActivityResult = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.read.removeMenuProvider = i;
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void write(scale scaleVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (scaleVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            scaleVar.RemoteActionCompatParcelizer(mode, size, mode2, size2);
            setMeasuredDimension(scaleVar.removeOnPictureInPictureModeChangedListener, scaleVar.removeOnPictureInPictureUiStateChangedListener);
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void write(AttributeSet attributeSet) {
        super.write(attributeSet);
        this.read = new hasSpecifiedAndFiniteWidthuvyYCjk();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, BeyondBoundsLayoutKt.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.read.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    hasSpecifiedAndFiniteWidthuvyYCjk hasspecifiedandfinitewidthuvyycjk = this.read;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hasspecifiedandfinitewidthuvyycjk.setContentView = dimensionPixelSize;
                    hasspecifiedandfinitewidthuvyycjk.reportFullyDrawn = dimensionPixelSize;
                    hasspecifiedandfinitewidthuvyycjk.startActivityForResult = dimensionPixelSize;
                    hasspecifiedandfinitewidthuvyycjk.setPictureInPictureParams = dimensionPixelSize;
                } else if (index == 18) {
                    hasSpecifiedAndFiniteWidthuvyYCjk hasspecifiedandfinitewidthuvyycjk2 = this.read;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hasspecifiedandfinitewidthuvyycjk2.startActivityForResult = dimensionPixelSize2;
                    hasspecifiedandfinitewidthuvyycjk2.getLifecycleRegistry1 = dimensionPixelSize2;
                    hasspecifiedandfinitewidthuvyycjk2.startIntentSenderForResult = dimensionPixelSize2;
                } else if (index == 19) {
                    this.read.setPictureInPictureParams = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.read.getLifecycleRegistry1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.read.setContentView = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.read.startIntentSenderForResult = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.read.reportFullyDrawn = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.read.removeMenuProvider = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.read.ParcelableVolumeInfo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.read.registerForActivityResult = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.read.MediaMetadataCompat = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.read.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.read.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.read.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.read.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.read.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.read.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.read.RatingCompat = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.read.ResultReceiver = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.read.removeOnConfigurationChangedListener = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.read.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.read.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.read.PlaybackStateCompat = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.read.peekAvailableContext = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.read.ComponentActivity = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.MediaDescriptionCompat = this.read;
        RemoteActionCompatParcelizer();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i, int i2) {
        write(this.read, i, i2);
    }
}
