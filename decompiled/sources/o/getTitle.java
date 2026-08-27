package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class getTitle extends LinearLayout {
    public boolean IconCompatParcelizer;
    public boolean read;
    public int write;

    public getTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.write = -1;
        int[] iArr = onUserLeaveHint.ButtonBarLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        FocusPropertiesNode.IconCompatParcelizer(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.IconCompatParcelizer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f A[LOOP:0: B:26:0x0051->B:31:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095 A[LOOP:1: B:37:0x0087->B:41:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0063 A[EDGE_INSN: B:53:0x0063->B:33:0x0063 BREAK  A[LOOP:0: B:26:0x0051->B:31:0x005f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int childCount;
        int i3;
        int i4;
        int paddingBottom;
        int i5;
        int childCount2;
        int size = View.MeasureSpec.getSize(i);
        int measuredHeight = 0;
        if (this.IconCompatParcelizer) {
            if (size > this.write && this.read) {
                setStacked(false);
            }
            this.write = size;
        }
        if (this.read || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (!this.IconCompatParcelizer || this.read || (getMeasuredWidthAndState() & (-16777216)) != 16777216) {
            if (z) {
            }
            childCount = getChildCount();
            i3 = 0;
            while (true) {
                i4 = -1;
                if (i3 < childCount) {
                    i3 = -1;
                    break;
                } else if (getChildAt(i3).getVisibility() == 0) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 >= 0) {
                View childAt = getChildAt(i3);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int paddingTop = getPaddingTop();
                measuredHeight = layoutParams.bottomMargin + childAt.getMeasuredHeight() + paddingTop + layoutParams.topMargin;
                if (this.read) {
                    childCount2 = getChildCount();
                    for (i5 = i3 + 1; i5 < childCount2; i5++) {
                        if (getChildAt(i5).getVisibility() == 0) {
                            i4 = i5;
                            break;
                        }
                    }
                    if (i4 >= 0) {
                        paddingBottom = getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                    }
                } else {
                    paddingBottom = getPaddingBottom();
                }
                measuredHeight += paddingBottom;
            }
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if (getMinimumHeight() != measuredHeight) {
                setMinimumHeight(measuredHeight);
                if (i2 == 0) {
                    super.onMeasure(i, i2);
                }
            }
        }
        setStacked(true);
        super.onMeasure(i, i2);
        childCount = getChildCount();
        i3 = 0;
        while (true) {
            i4 = -1;
            if (i3 < childCount) {
                i3 = -1;
                break;
            } else {
                if (getChildAt(i3).getVisibility() == 0) {
                    break;
                    break;
                }
                i3++;
            }
        }
        if (i3 >= 0) {
            View childAt2 = getChildAt(i3);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            int paddingTop2 = getPaddingTop();
            measuredHeight = layoutParams2.bottomMargin + childAt2.getMeasuredHeight() + paddingTop2 + layoutParams2.topMargin;
            if (this.read) {
                childCount2 = getChildCount();
                while (i5 < childCount2) {
                    if (getChildAt(i5).getVisibility() == 0) {
                        i4 = i5;
                        break;
                    }
                }
                if (i4 >= 0) {
                    paddingBottom = getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            measuredHeight += paddingBottom;
        }
        WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
        if (getMinimumHeight() != measuredHeight) {
            setMinimumHeight(measuredHeight);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.IconCompatParcelizer != z) {
            this.IconCompatParcelizer = z;
            if (!z && this.read) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    private void setStacked(boolean z) {
        if (this.read != z) {
            if (!z || this.IconCompatParcelizer) {
                this.read = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(com.logistics.rider.glovo.R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }
}
