package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes.dex */
public class getOverflowIcon extends ViewGroup {
    public int ComponentActivity;
    public int MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public Drawable ResultReceiver;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public int[] r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int[] r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public boolean r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public float r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;

    public getOverflowIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.MediaSessionCompatToken = true;
        this.MediaSessionCompatResultReceiverWrapper = -1;
        this.ParcelableVolumeInfo = 0;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 8388659;
        int[] iArr = onUserLeaveHint.LinearLayoutCompat;
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(context, attributeSet, iArr, 0);
        FocusPropertiesNode.IconCompatParcelizer(this, context, iArr, attributeSet, (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read, 0);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = typedArray.getFloat(4, -1.0f);
        this.MediaSessionCompatResultReceiverWrapper = typedArray.getInt(3, -1);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = typedArray.getBoolean(7, false);
        setDividerDrawable(emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(5));
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = typedArray.getInt(8, 0);
        this.ComponentActivity = typedArray.getDimensionPixelSize(6, 0);
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof setWindowTitle;
    }

    public int getBaselineAlignedChildIndex() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public Drawable getDividerDrawable() {
        return this.ResultReceiver;
    }

    public int getDividerPadding() {
        return this.ComponentActivity;
    }

    public int getDividerWidth() {
        return this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public int getGravity() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public int getOrientation() {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    public int getShowDividers() {
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    }

    public void setBaselineAligned(boolean z) {
        this.MediaSessionCompatToken = z;
    }

    public void setDividerPadding(int i) {
        this.ComponentActivity = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = z;
    }

    public void setWeightSum(float f) {
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0170  */
    /* JADX WARN: Code duplicated, block: B:70:0x0172  */
    /* JADX WARN: Code duplicated, block: B:72:0x017d  */
    /* JADX WARN: Code duplicated, block: B:73:0x018f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0195  */
    /* JADX WARN: Code duplicated, block: B:77:0x019d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c0  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int baseline;
        int i9;
        int i10;
        int i11;
        int measuredHeight;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        int i18 = 8388615;
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i19 = i3 - i;
            int paddingRight = getPaddingRight();
            int paddingRight2 = getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i20 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            int i21 = i20 & 112;
            if (i21 == 16) {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) / 2);
            } else if (i21 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i4) - i2) - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            }
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View childAt = getChildAt(i22);
                if (childAt != null && childAt.getVisibility() != i17) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    setWindowTitle setwindowtitle = (setWindowTitle) childAt.getLayoutParams();
                    int i23 = ((LinearLayout.LayoutParams) setwindowtitle).gravity;
                    if (i23 < 0) {
                        i23 = i20 & i18;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i16 = ((LinearLayout.LayoutParams) setwindowtitle).leftMargin + paddingLeft2;
                        } else {
                            i14 = (i19 - paddingRight) - measuredWidth;
                            i15 = ((LinearLayout.LayoutParams) setwindowtitle).rightMargin;
                        }
                        if (write(i22)) {
                            paddingTop += this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        }
                        int i24 = paddingTop + ((LinearLayout.LayoutParams) setwindowtitle).topMargin;
                        childAt.layout(i16, i24, measuredWidth + i16, i24 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) setwindowtitle).bottomMargin + i24;
                    } else {
                        i14 = ((((i19 - paddingLeft2) - paddingRight2) - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) setwindowtitle).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) setwindowtitle).rightMargin;
                    }
                    i16 = i14 - i15;
                    if (write(i22)) {
                        paddingTop += this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    }
                    int i25 = paddingTop + ((LinearLayout.LayoutParams) setwindowtitle).topMargin;
                    childAt.layout(i16, i25, measuredWidth + i16, i25 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) setwindowtitle).bottomMargin + i25;
                }
                i22++;
                i17 = 8;
                i18 = 8388615;
            }
            return;
        }
        boolean z3 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i26 = i4 - i2;
        int paddingBottom = getPaddingBottom();
        int paddingBottom2 = getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i27 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        boolean z4 = this.MediaSessionCompatToken;
        int[] iArr = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        int[] iArr2 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27 & 8388615, getLayoutDirection());
        if (absoluteGravity2 == 1) {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) / 2);
        } else if (absoluteGravity2 != 5) {
            paddingLeft = getPaddingLeft();
        } else {
            paddingLeft = ((getPaddingLeft() + i3) - i) - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        }
        if (z3) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i28 = 0;
        while (i28 < virtualChildCount2) {
            int i29 = (i5 * i28) + i6;
            View childAt2 = getChildAt(i29);
            if (childAt2 == null) {
                i7 = i6;
                i8 = i5;
            } else {
                i7 = i6;
                i8 = i5;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    setWindowTitle setwindowtitle2 = (setWindowTitle) childAt2.getLayoutParams();
                    if (z4) {
                        z2 = z4;
                        baseline = ((LinearLayout.LayoutParams) setwindowtitle2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) setwindowtitle2).gravity;
                        if (i9 < 0) {
                            i9 = i27 & 112;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            if (i10 != 48) {
                                i12 = ((LinearLayout.LayoutParams) setwindowtitle2).topMargin + paddingTop2;
                                if (baseline != -1) {
                                    i12 = (iArr[1] - baseline) + i12;
                                }
                            } else if (i10 != 80) {
                                i12 = paddingTop2;
                            } else {
                                i13 = ((i26 - paddingBottom) - measuredHeight3) - ((LinearLayout.LayoutParams) setwindowtitle2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                    i11 = i13;
                                } else {
                                    i12 = i13;
                                }
                            }
                            if (write(i29)) {
                                paddingLeft += this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            }
                            int i30 = paddingLeft + ((LinearLayout.LayoutParams) setwindowtitle2).leftMargin;
                            childAt2.layout(i30, i12, i30 + measuredWidth2, i12 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) setwindowtitle2).rightMargin + i30;
                        } else {
                            i11 = ((LinearLayout.LayoutParams) setwindowtitle2).topMargin + ((((i26 - paddingTop2) - paddingBottom2) - measuredHeight3) / 2) + paddingTop2;
                            measuredHeight = ((LinearLayout.LayoutParams) setwindowtitle2).bottomMargin;
                        }
                        i12 = i11 - measuredHeight;
                        if (write(i29)) {
                            paddingLeft += this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        }
                        int i31 = paddingLeft + ((LinearLayout.LayoutParams) setwindowtitle2).leftMargin;
                        childAt2.layout(i31, i12, i31 + measuredWidth2, i12 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) setwindowtitle2).rightMargin + i31;
                    } else {
                        z2 = z4;
                    }
                    i9 = ((LinearLayout.LayoutParams) setwindowtitle2).gravity;
                    if (i9 < 0) {
                        i9 = i27 & 112;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            i12 = ((LinearLayout.LayoutParams) setwindowtitle2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                i12 = (iArr[1] - baseline) + i12;
                            }
                        } else if (i10 != 80) {
                            i12 = paddingTop2;
                        } else {
                            i13 = ((i26 - paddingBottom) - measuredHeight3) - ((LinearLayout.LayoutParams) setwindowtitle2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                i11 = i13;
                            } else {
                                i12 = i13;
                            }
                        }
                        if (write(i29)) {
                            paddingLeft += this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        }
                        int i32 = paddingLeft + ((LinearLayout.LayoutParams) setwindowtitle2).leftMargin;
                        childAt2.layout(i32, i12, i32 + measuredWidth2, i12 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) setwindowtitle2).rightMargin + i32;
                    } else {
                        i11 = ((LinearLayout.LayoutParams) setwindowtitle2).topMargin + ((((i26 - paddingTop2) - paddingBottom2) - measuredHeight3) / 2) + paddingTop2;
                        measuredHeight = ((LinearLayout.LayoutParams) setwindowtitle2).bottomMargin;
                    }
                    i12 = i11 - measuredHeight;
                    if (write(i29)) {
                        paddingLeft += this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    }
                    int i33 = paddingLeft + ((LinearLayout.LayoutParams) setwindowtitle2).leftMargin;
                    childAt2.layout(i33, i12, i33 + measuredWidth2, i12 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) setwindowtitle2).rightMargin + i33;
                }
                i28++;
                i6 = i7;
                i5 = i8;
                virtualChildCount2 = virtualChildCount2;
                z4 = z2;
                i27 = i27;
            }
            z2 = z4;
            i28++;
            i6 = i7;
            i5 = i8;
            virtualChildCount2 = virtualChildCount2;
            z4 = z2;
            i27 = i27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:215:0x0481  */
    /* JADX WARN: Code duplicated, block: B:216:0x0486  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:220:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:223:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:224:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:226:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:232:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:241:0x052c  */
    /* JADX WARN: Code duplicated, block: B:247:0x053e  */
    /* JADX WARN: Code duplicated, block: B:250:0x0546 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x0548  */
    /* JADX WARN: Code duplicated, block: B:253:0x0551 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x0553  */
    /* JADX WARN: Code duplicated, block: B:281:0x05db  */
    /* JADX WARN: Code duplicated, block: B:283:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:284:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:287:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:289:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:290:0x0603  */
    /* JADX WARN: Code duplicated, block: B:315:0x068a  */
    /* JADX WARN: Code duplicated, block: B:317:0x0691  */
    /* JADX WARN: Code duplicated, block: B:320:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:322:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:371:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:373:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:377:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:385:0x0801  */
    /* JADX WARN: Code duplicated, block: B:389:0x0833  */
    /* JADX WARN: Code duplicated, block: B:394:0x085a  */
    /* JADX WARN: Code duplicated, block: B:396:0x0868  */
    /* JADX WARN: Code duplicated, block: B:398:0x0874  */
    /* JADX WARN: Code duplicated, block: B:400:0x0880  */
    /* JADX WARN: Code duplicated, block: B:401:0x0895  */
    /* JADX WARN: Code duplicated, block: B:432:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0896 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        int iResolveSizeAndState;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c2;
        char c3;
        int i8;
        int iMax;
        int i9;
        View childAt;
        int i10;
        int baseline;
        int i11;
        int iMakeMeasureSpec;
        int i12;
        View childAt2;
        setWindowTitle setwindowtitle;
        int i13;
        View childAt3;
        setWindowTitle setwindowtitle2;
        int i14;
        float f2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z;
        boolean z2;
        setWindowTitle setwindowtitle3;
        int measuredWidth;
        int i21;
        int i22;
        boolean z3;
        int i23;
        boolean z4;
        int i24;
        int measuredHeight;
        boolean z5;
        int baseline2;
        int i25;
        int i26;
        int i27;
        boolean z6;
        int i28;
        int i29;
        boolean z7;
        setWindowTitle setwindowtitle4;
        boolean z8;
        int i30;
        boolean z9;
        int iMax2;
        int i31 = -2;
        int i32 = Integer.MIN_VALUE;
        int i33 = 8;
        float f3 = 0.0f;
        int i34 = 1073741824;
        boolean z10 = true;
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 1) {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i35 = this.MediaSessionCompatResultReceiverWrapper;
            boolean z11 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            boolean z12 = true;
            int i36 = 0;
            int iMax3 = 0;
            int i37 = 0;
            int iMax4 = 0;
            int i38 = 0;
            boolean z13 = false;
            int iMax5 = 0;
            boolean z14 = false;
            float f4 = 0.0f;
            while (i36 < virtualChildCount) {
                View childAt4 = getChildAt(i36);
                if (childAt4 == null) {
                    this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                } else {
                    if (childAt4.getVisibility() != i33) {
                        if (write(i36)) {
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 += this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        }
                        setWindowTitle setwindowtitle5 = (setWindowTitle) childAt4.getLayoutParams();
                        float f5 = ((LinearLayout.LayoutParams) setwindowtitle5).weight;
                        f4 += f5;
                        if (mode2 == i34 && ((LinearLayout.LayoutParams) setwindowtitle5).height == 0 && f5 > f3) {
                            int i39 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Math.max(i39, ((LinearLayout.LayoutParams) setwindowtitle5).topMargin + i39 + ((LinearLayout.LayoutParams) setwindowtitle5).bottomMargin);
                            setwindowtitle4 = setwindowtitle5;
                            z8 = true;
                            z7 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) setwindowtitle5).height != 0 || f5 <= f3) {
                                i29 = i32;
                            } else {
                                ((LinearLayout.LayoutParams) setwindowtitle5).height = i31;
                                i29 = 0;
                            }
                            int i40 = f4 == f3 ? this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 : 0;
                            z7 = true;
                            setwindowtitle4 = setwindowtitle5;
                            measureChildWithMargins(childAt4, i, 0, i2, i40);
                            if (i29 != i32) {
                                ((LinearLayout.LayoutParams) setwindowtitle4).height = i29;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i41 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Math.max(i41, i41 + measuredHeight2 + ((LinearLayout.LayoutParams) setwindowtitle4).topMargin + ((LinearLayout.LayoutParams) setwindowtitle4).bottomMargin);
                            int i42 = iMax5;
                            if (z11) {
                                iMax5 = Math.max(measuredHeight2, i42);
                            }
                            z8 = z13;
                        }
                        if (i35 >= 0 && i35 == i36 + 1) {
                            this.ParcelableVolumeInfo = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        }
                        if (i36 < i35 && ((LinearLayout.LayoutParams) setwindowtitle4).weight > 0.0f) {
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                            return;
                        }
                        i30 = mode;
                        if (i30 == 1073741824 || ((LinearLayout.LayoutParams) setwindowtitle4).width != -1) {
                            z9 = false;
                        } else {
                            z9 = z7;
                            z14 = z9;
                        }
                        int i43 = ((LinearLayout.LayoutParams) setwindowtitle4).leftMargin + ((LinearLayout.LayoutParams) setwindowtitle4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i43;
                        iMax2 = Math.max(i37, measuredWidth2);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i38, childAt4.getMeasuredState());
                        boolean z15 = (z12 && ((LinearLayout.LayoutParams) setwindowtitle4).width == -1) ? z7 : false;
                        if (((LinearLayout.LayoutParams) setwindowtitle4).weight > 0.0f) {
                            if (!z9) {
                                i43 = measuredWidth2;
                            }
                            iMax4 = Math.max(iMax4, i43);
                        } else {
                            int i44 = iMax4;
                            if (!z9) {
                                i43 = measuredWidth2;
                            }
                            iMax3 = Math.max(iMax3, i43);
                            iMax4 = i44;
                        }
                        z13 = z8;
                        z12 = z15;
                        i38 = iCombineMeasuredStates;
                    }
                    i36++;
                    mode = i30;
                    i37 = iMax2;
                    i35 = i35;
                    z10 = z7;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i31 = -2;
                    i32 = Integer.MIN_VALUE;
                    i33 = 8;
                    f3 = 0.0f;
                    i34 = 1073741824;
                }
                i35 = i35;
                mode2 = mode2;
                i30 = mode;
                virtualChildCount = virtualChildCount;
                iMax2 = i37;
                z7 = true;
                i36++;
                mode = i30;
                i37 = iMax2;
                i35 = i35;
                z10 = z7;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i31 = -2;
                i32 = Integer.MIN_VALUE;
                i33 = 8;
                f3 = 0.0f;
                i34 = 1073741824;
            }
            int i45 = mode2;
            int i46 = mode;
            int i47 = virtualChildCount;
            boolean z16 = z10;
            int iMax6 = iMax3;
            int iMax7 = i37;
            int i48 = iMax4;
            int iCombineMeasuredStates2 = i38;
            int i49 = iMax5;
            int i50 = i47;
            if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 > 0 && write(i50)) {
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 += this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            }
            if (z11 && (i45 == Integer.MIN_VALUE || i45 == 0)) {
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
                for (int i51 = 0; i51 < i50; i51++) {
                    View childAt5 = getChildAt(i51);
                    if (childAt5 == null) {
                        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    } else if (childAt5.getVisibility() != 8) {
                        setWindowTitle setwindowtitle6 = (setWindowTitle) childAt5.getLayoutParams();
                        int i52 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Math.max(i52, i52 + i49 + ((LinearLayout.LayoutParams) setwindowtitle6).topMargin + ((LinearLayout.LayoutParams) setwindowtitle6).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = paddingBottom;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i53 = (16777215 & iResolveSizeAndState2) - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (z13 || (i53 != 0 && f4 > 0.0f)) {
                float f6 = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                if (f6 > 0.0f) {
                    f4 = f6;
                }
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
                int i54 = 0;
                while (i54 < i50) {
                    View childAt6 = getChildAt(i54);
                    if (childAt6.getVisibility() == 8) {
                        i50 = i50;
                    } else {
                        setWindowTitle setwindowtitle7 = (setWindowTitle) childAt6.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) setwindowtitle7).weight;
                        if (f7 > 0.0f) {
                            int i55 = (int) ((i53 * f7) / f4);
                            f4 -= f7;
                            int i56 = i53 - i55;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) setwindowtitle7).leftMargin + ((LinearLayout.LayoutParams) setwindowtitle7).rightMargin, ((LinearLayout.LayoutParams) setwindowtitle7).width);
                            if (((LinearLayout.LayoutParams) setwindowtitle7).height == 0) {
                                i28 = 1073741824;
                                if (i45 == 1073741824) {
                                    if (i55 <= 0) {
                                        i55 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i55, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                                i53 = i56;
                            } else {
                                i28 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i55;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i28));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                            i53 = i56;
                        }
                        int i57 = ((LinearLayout.LayoutParams) setwindowtitle7).leftMargin + ((LinearLayout.LayoutParams) setwindowtitle7).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i57;
                        iMax7 = Math.max(iMax7, measuredWidth3);
                        if (i46 != 1073741824) {
                            i27 = -1;
                            if (((LinearLayout.LayoutParams) setwindowtitle7).width != -1) {
                            }
                            iMax6 = Math.max(iMax6, i57);
                            if (z12 || ((LinearLayout.LayoutParams) setwindowtitle7).width != i27) {
                                z6 = false;
                            } else {
                                z6 = z16;
                            }
                            int i58 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Math.max(i58, childAt6.getMeasuredHeight() + i58 + ((LinearLayout.LayoutParams) setwindowtitle7).topMargin + ((LinearLayout.LayoutParams) setwindowtitle7).bottomMargin);
                            z12 = z6;
                        } else {
                            i27 = -1;
                        }
                        i57 = measuredWidth3;
                        iMax6 = Math.max(iMax6, i57);
                        if (z12) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        int i59 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Math.max(i59, childAt6.getMeasuredHeight() + i59 + ((LinearLayout.LayoutParams) setwindowtitle7).topMargin + ((LinearLayout.LayoutParams) setwindowtitle7).bottomMargin);
                        z12 = z6;
                    }
                    i54++;
                    i50 = i50;
                }
                i25 = i50;
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = getPaddingBottom() + getPaddingTop() + this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                i26 = iMax7;
            } else {
                iMax6 = Math.max(iMax6, i48);
                if (z11 && i45 != 1073741824) {
                    for (int i60 = 0; i60 < i50; i60++) {
                        View childAt7 = getChildAt(i60);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((setWindowTitle) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i49, 1073741824));
                        }
                    }
                }
                i26 = iMax7;
                i25 = i50;
            }
            if (z12 || i46 == 1073741824) {
                iMax6 = i26;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), iResolveSizeAndState2);
            if (z14) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                int i61 = i25;
                for (int i62 = 0; i62 < i61; i62++) {
                    View childAt8 = getChildAt(i62);
                    if (childAt8.getVisibility() != 8) {
                        setWindowTitle setwindowtitle8 = (setWindowTitle) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) setwindowtitle8).width == -1) {
                            int i63 = ((LinearLayout.LayoutParams) setwindowtitle8).height;
                            ((LinearLayout.LayoutParams) setwindowtitle8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i2, 0);
                            ((LinearLayout.LayoutParams) setwindowtitle8).height = i63;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null || this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new int[4];
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new int[4];
        }
        int[] iArr = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        int[] iArr2 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z17 = this.MediaSessionCompatToken;
        boolean z18 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        boolean z19 = mode3 == 1073741824;
        boolean z20 = true;
        int iMax8 = 0;
        float f8 = 0.0f;
        int iMax9 = 0;
        int i64 = 0;
        int i65 = 0;
        int iMax10 = 0;
        int iMax11 = 0;
        boolean z21 = false;
        boolean z22 = false;
        while (i64 < virtualChildCount2) {
            View childAt9 = getChildAt(i64);
            if (childAt9 == null) {
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                i20 = i64;
                z = z18;
                z2 = z17;
            } else {
                int i66 = iMax8;
                int i67 = iMax9;
                if (childAt9.getVisibility() == 8) {
                    z2 = z17;
                    iMax8 = i66;
                    iMax9 = i67;
                    i20 = i64;
                    z = z18;
                } else {
                    if (write(i64)) {
                        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 += this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    }
                    setWindowTitle setwindowtitle9 = (setWindowTitle) childAt9.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) setwindowtitle9).weight;
                    float f10 = f8 + f9;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) setwindowtitle9).width == 0 && f9 > 0.0f) {
                        int i68 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        int i69 = ((LinearLayout.LayoutParams) setwindowtitle9).leftMargin;
                        if (z19) {
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i69 + ((LinearLayout.LayoutParams) setwindowtitle9).rightMargin + i68;
                        } else {
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Math.max(i68, i69 + i68 + ((LinearLayout.LayoutParams) setwindowtitle9).rightMargin);
                        }
                        if (z17) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            setwindowtitle3 = setwindowtitle9;
                            i17 = i66;
                            i18 = i67;
                            i20 = i64;
                            z = z18;
                            z2 = z17;
                        } else {
                            setwindowtitle3 = setwindowtitle9;
                            i17 = i66;
                            i18 = i67;
                            i20 = i64;
                            i23 = 1073741824;
                            z = z18;
                            z2 = z17;
                            z3 = true;
                        }
                        if (mode4 == i23 && ((LinearLayout.LayoutParams) setwindowtitle3).height == -1) {
                            z4 = true;
                            z22 = true;
                        } else {
                            z4 = false;
                        }
                        i24 = ((LinearLayout.LayoutParams) setwindowtitle3).topMargin + ((LinearLayout.LayoutParams) setwindowtitle3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i24;
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(i65, childAt9.getMeasuredState());
                        if (!z2 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i70 = ((LinearLayout.LayoutParams) setwindowtitle3).gravity;
                            if (i70 < 0) {
                                i70 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                            }
                            int i71 = (((i70 & 112) >> 4) & (-2)) >> 1;
                            iArr[i71] = Math.max(iArr[i71], baseline2);
                            iArr2[i71] = Math.max(iArr2[i71], measuredHeight - baseline2);
                        }
                        iMax8 = Math.max(i17, measuredHeight);
                        if (z20 || ((LinearLayout.LayoutParams) setwindowtitle3).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) setwindowtitle3).weight > 0.0f) {
                            if (z4) {
                                measuredHeight = i24;
                            }
                            iMax10 = Math.max(iMax10, measuredHeight);
                            iMax9 = i18;
                        } else {
                            if (z4) {
                                measuredHeight = i24;
                            }
                            iMax9 = Math.max(i18, measuredHeight);
                        }
                        i65 = iCombineMeasuredStates3;
                        z21 = z3;
                        z20 = z5;
                        f8 = f10;
                    } else {
                        int i72 = i64;
                        if (((LinearLayout.LayoutParams) setwindowtitle9).width == 0) {
                            f2 = 0.0f;
                            if (f9 > 0.0f) {
                                ((LinearLayout.LayoutParams) setwindowtitle9).width = -2;
                                i15 = 0;
                            }
                            if (f10 == f2) {
                                i16 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                            } else {
                                i16 = 0;
                            }
                            i17 = i66;
                            i18 = i67;
                            i19 = i15;
                            i20 = i72;
                            z = z18;
                            z2 = z17;
                            measureChildWithMargins(childAt9, i, i16, i2, 0);
                            if (i19 != Integer.MIN_VALUE) {
                                setwindowtitle3 = setwindowtitle9;
                                ((LinearLayout.LayoutParams) setwindowtitle3).width = i19;
                            } else {
                                setwindowtitle3 = setwindowtitle9;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            i21 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                            i22 = ((LinearLayout.LayoutParams) setwindowtitle3).leftMargin;
                            if (z19) {
                                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i22 + measuredWidth + ((LinearLayout.LayoutParams) setwindowtitle3).rightMargin + i21;
                            } else {
                                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Math.max(i21, i21 + measuredWidth + i22 + ((LinearLayout.LayoutParams) setwindowtitle3).rightMargin);
                            }
                            if (z) {
                                iMax11 = Math.max(measuredWidth, iMax11);
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        i15 = Integer.MIN_VALUE;
                        if (f10 == f2) {
                            i16 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        } else {
                            i16 = 0;
                        }
                        i17 = i66;
                        i18 = i67;
                        i19 = i15;
                        i20 = i72;
                        z = z18;
                        z2 = z17;
                        measureChildWithMargins(childAt9, i, i16, i2, 0);
                        if (i19 != Integer.MIN_VALUE) {
                            setwindowtitle3 = setwindowtitle9;
                            ((LinearLayout.LayoutParams) setwindowtitle3).width = i19;
                        } else {
                            setwindowtitle3 = setwindowtitle9;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        i21 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        i22 = ((LinearLayout.LayoutParams) setwindowtitle3).leftMargin;
                        if (z19) {
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i22 + measuredWidth + ((LinearLayout.LayoutParams) setwindowtitle3).rightMargin + i21;
                        } else {
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Math.max(i21, i21 + measuredWidth + i22 + ((LinearLayout.LayoutParams) setwindowtitle3).rightMargin);
                        }
                        if (z) {
                            iMax11 = Math.max(measuredWidth, iMax11);
                        }
                    }
                    z3 = z21;
                    i23 = 1073741824;
                    if (mode4 == i23) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    i24 = ((LinearLayout.LayoutParams) setwindowtitle3).topMargin + ((LinearLayout.LayoutParams) setwindowtitle3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i24;
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(i65, childAt9.getMeasuredState());
                    if (!z2) {
                    }
                    iMax8 = Math.max(i17, measuredHeight);
                    if (z20) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) setwindowtitle3).weight > 0.0f) {
                        if (z4) {
                            measuredHeight = i24;
                        }
                        iMax10 = Math.max(iMax10, measuredHeight);
                        iMax9 = i18;
                    } else {
                        if (z4) {
                            measuredHeight = i24;
                        }
                        iMax9 = Math.max(i18, measuredHeight);
                    }
                    i65 = iCombineMeasuredStates4;
                    z21 = z3;
                    z20 = z5;
                    f8 = f10;
                }
            }
            i64 = i20 + 1;
            z18 = z;
            z17 = z2;
        }
        boolean z23 = z18;
        boolean z24 = z17;
        int i73 = iMax9;
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 > 0 && write(virtualChildCount2)) {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 += this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        }
        int i74 = iArr[1];
        if (i74 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c = 3;
            if (iArr[3] != -1) {
            }
            if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
                for (i13 = 0; i13 < virtualChildCount2; i13++) {
                    childAt3 = getChildAt(i13);
                    if (childAt3 == null) {
                        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    } else if (childAt3.getVisibility() == 8) {
                        setwindowtitle2 = (setWindowTitle) childAt3.getLayoutParams();
                        i14 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        if (z19) {
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = ((LinearLayout.LayoutParams) setwindowtitle2).leftMargin + iMax11 + ((LinearLayout.LayoutParams) setwindowtitle2).rightMargin + i14;
                        } else {
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Math.max(i14, i14 + iMax11 + ((LinearLayout.LayoutParams) setwindowtitle2).leftMargin + ((LinearLayout.LayoutParams) setwindowtitle2).rightMargin);
                        }
                    }
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = paddingRight;
            iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
            int i75 = (16777215 & iResolveSizeAndState) - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (!z21 || (i75 != 0 && f8 > 0.0f)) {
                f = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                if (f > 0.0f) {
                    f8 = f;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
                int iCombineMeasuredStates5 = i65;
                iMax8 = -1;
                i3 = 0;
                while (i3 < virtualChildCount2) {
                    childAt = getChildAt(i3);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        iResolveSizeAndState = iResolveSizeAndState;
                        virtualChildCount2 = virtualChildCount2;
                    } else {
                        setWindowTitle setwindowtitle10 = (setWindowTitle) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) setwindowtitle10).weight;
                        if (f11 > 0.0f) {
                            int i76 = (int) ((i75 * f11) / f8);
                            float f12 = f8 - f11;
                            int i77 = i75 - i76;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) setwindowtitle10).topMargin + ((LinearLayout.LayoutParams) setwindowtitle10).bottomMargin, ((LinearLayout.LayoutParams) setwindowtitle10).height);
                            if (((LinearLayout.LayoutParams) setwindowtitle10).width == 0) {
                                i11 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i76 <= 0) {
                                        i76 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i76, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                                f8 = f12;
                                i75 = i77;
                            } else {
                                i11 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i76;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i11), childMeasureSpec2);
                            iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                            f8 = f12;
                            i75 = i77;
                        }
                        int i78 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        if (z19) {
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) setwindowtitle10).leftMargin + ((LinearLayout.LayoutParams) setwindowtitle10).rightMargin + i78;
                        } else {
                            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Math.max(i78, childAt.getMeasuredWidth() + i78 + ((LinearLayout.LayoutParams) setwindowtitle10).leftMargin + ((LinearLayout.LayoutParams) setwindowtitle10).rightMargin);
                        }
                        boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) setwindowtitle10).height == -1;
                        int i79 = ((LinearLayout.LayoutParams) setwindowtitle10).topMargin + ((LinearLayout.LayoutParams) setwindowtitle10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i79;
                        iMax8 = Math.max(iMax8, measuredHeight4);
                        if (!z25) {
                            i79 = measuredHeight4;
                        }
                        int iMax12 = Math.max(i73, i79);
                        if (z20) {
                            i10 = -1;
                            boolean z26 = ((LinearLayout.LayoutParams) setwindowtitle10).height == -1;
                            if (!z24 && (baseline = childAt.getBaseline()) != i10) {
                                int i80 = ((LinearLayout.LayoutParams) setwindowtitle10).gravity;
                                if (i80 < 0) {
                                    i80 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                                }
                                int i81 = (((i80 & 112) >> 4) & (-2)) >> 1;
                                iArr[i81] = Math.max(iArr[i81], baseline);
                                iArr2[i81] = Math.max(iArr2[i81], measuredHeight4 - baseline);
                            }
                            i73 = iMax12;
                            z20 = z26;
                            f8 = f8;
                            i75 = i75;
                        } else {
                            i10 = -1;
                        }
                        if (!z24) {
                        }
                        i73 = iMax12;
                        z20 = z26;
                        f8 = f8;
                        i75 = i75;
                    }
                    i3++;
                    virtualChildCount2 = virtualChildCount2;
                    iResolveSizeAndState = iResolveSizeAndState;
                }
                i4 = i2;
                i5 = iResolveSizeAndState;
                i6 = virtualChildCount2;
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = getPaddingRight() + getPaddingLeft() + this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                i7 = iArr[1];
                if (i7 != -1 && iArr[0] == -1) {
                    c2 = 2;
                    if (iArr[2] == -1) {
                        c3 = 3;
                        if (iArr[3] == -1) {
                            iMax = i73;
                            i9 = iCombineMeasuredStates5;
                        }
                        if (!z20 && mode4 != 1073741824) {
                            iMax8 = iMax;
                        }
                        setMeasuredDimension(i5 | ((-16777216) & i9), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i4, i9 << 16));
                        if (z22) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                            i12 = i6;
                            while (i8 < i12) {
                                childAt2 = getChildAt(i8);
                                if (childAt2.getVisibility() != 8) {
                                    setwindowtitle = (setWindowTitle) childAt2.getLayoutParams();
                                    if (((LinearLayout.LayoutParams) setwindowtitle).height == -1) {
                                        int i82 = ((LinearLayout.LayoutParams) setwindowtitle).width;
                                        ((LinearLayout.LayoutParams) setwindowtitle).width = childAt2.getMeasuredWidth();
                                        measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                        ((LinearLayout.LayoutParams) setwindowtitle).width = i82;
                                    }
                                }
                                i8++;
                            }
                        }
                    }
                    i8 = 0;
                    iMax8 = Math.max(iMax8, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[c2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[c2]))));
                    iMax = i73;
                    i9 = iCombineMeasuredStates5;
                    if (!z20) {
                        iMax8 = iMax;
                    }
                    setMeasuredDimension(i5 | ((-16777216) & i9), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i4, i9 << 16));
                    if (z22) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                        i12 = i6;
                        while (i8 < i12) {
                            childAt2 = getChildAt(i8);
                            if (childAt2.getVisibility() != 8) {
                                setwindowtitle = (setWindowTitle) childAt2.getLayoutParams();
                                if (((LinearLayout.LayoutParams) setwindowtitle).height == -1) {
                                    int i83 = ((LinearLayout.LayoutParams) setwindowtitle).width;
                                    ((LinearLayout.LayoutParams) setwindowtitle).width = childAt2.getMeasuredWidth();
                                    measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                    ((LinearLayout.LayoutParams) setwindowtitle).width = i83;
                                }
                            }
                            i8++;
                        }
                    }
                }
                c2 = 2;
                c3 = 3;
                i8 = 0;
                iMax8 = Math.max(iMax8, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[c2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[c2]))));
                iMax = i73;
                i9 = iCombineMeasuredStates5;
                if (!z20) {
                    iMax8 = iMax;
                }
                setMeasuredDimension(i5 | ((-16777216) & i9), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i4, i9 << 16));
                if (z22) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    i12 = i6;
                    while (i8 < i12) {
                        childAt2 = getChildAt(i8);
                        if (childAt2.getVisibility() != 8) {
                            setwindowtitle = (setWindowTitle) childAt2.getLayoutParams();
                            if (((LinearLayout.LayoutParams) setwindowtitle).height == -1) {
                                int i84 = ((LinearLayout.LayoutParams) setwindowtitle).width;
                                ((LinearLayout.LayoutParams) setwindowtitle).width = childAt2.getMeasuredWidth();
                                measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                ((LinearLayout.LayoutParams) setwindowtitle).width = i84;
                            }
                        }
                        i8++;
                    }
                }
            }
            iMax = Math.max(i73, iMax10);
            if (z23 && mode3 != 1073741824) {
                for (int i85 = 0; i85 < virtualChildCount2; i85++) {
                    View childAt10 = getChildAt(i85);
                    if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((setWindowTitle) childAt10.getLayoutParams())).weight > 0.0f) {
                        childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax11, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = i2;
            i5 = iResolveSizeAndState;
            i6 = virtualChildCount2;
            i9 = i65;
            i8 = 0;
            if (!z20) {
                iMax8 = iMax;
            }
            setMeasuredDimension(i5 | ((-16777216) & i9), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i4, i9 << 16));
            if (z22) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i12 = i6;
                while (i8 < i12) {
                    childAt2 = getChildAt(i8);
                    if (childAt2.getVisibility() != 8) {
                        setwindowtitle = (setWindowTitle) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) setwindowtitle).height == -1) {
                            int i86 = ((LinearLayout.LayoutParams) setwindowtitle).width;
                            ((LinearLayout.LayoutParams) setwindowtitle).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) setwindowtitle).width = i86;
                        }
                    }
                    i8++;
                }
            }
        }
        c = 3;
        iMax8 = Math.max(iMax8, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(i74, iArr[2]))));
        if (z23) {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
            while (i13 < virtualChildCount2) {
                childAt3 = getChildAt(i13);
                if (childAt3 == null) {
                    this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                } else if (childAt3.getVisibility() == 8) {
                    setwindowtitle2 = (setWindowTitle) childAt3.getLayoutParams();
                    i14 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    if (z19) {
                        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = ((LinearLayout.LayoutParams) setwindowtitle2).leftMargin + iMax11 + ((LinearLayout.LayoutParams) setwindowtitle2).rightMargin + i14;
                    } else {
                        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Math.max(i14, i14 + iMax11 + ((LinearLayout.LayoutParams) setwindowtitle2).leftMargin + ((LinearLayout.LayoutParams) setwindowtitle2).rightMargin);
                    }
                }
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = paddingRight2;
        iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        int i710 = (16777215 & iResolveSizeAndState) - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (z21) {
            f = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
            int iCombineMeasuredStates6 = i65;
            iMax8 = -1;
            i3 = 0;
            while (i3 < virtualChildCount2) {
                childAt = getChildAt(i3);
                if (childAt != null) {
                    iResolveSizeAndState = iResolveSizeAndState;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    iResolveSizeAndState = iResolveSizeAndState;
                    virtualChildCount2 = virtualChildCount2;
                }
                i3++;
                virtualChildCount2 = virtualChildCount2;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i4 = i2;
            i5 = iResolveSizeAndState;
            i6 = virtualChildCount2;
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = getPaddingRight() + getPaddingLeft() + this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            i7 = iArr[1];
            if (i7 != -1) {
                c2 = 2;
                c3 = 3;
            } else {
                c2 = 2;
                c3 = 3;
            }
            i8 = 0;
            iMax8 = Math.max(iMax8, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[c2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[c2]))));
            iMax = i73;
            i9 = iCombineMeasuredStates6;
        } else {
            f = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
            int iCombineMeasuredStates7 = i65;
            iMax8 = -1;
            i3 = 0;
            while (i3 < virtualChildCount2) {
                childAt = getChildAt(i3);
                if (childAt != null) {
                    iResolveSizeAndState = iResolveSizeAndState;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    iResolveSizeAndState = iResolveSizeAndState;
                    virtualChildCount2 = virtualChildCount2;
                }
                i3++;
                virtualChildCount2 = virtualChildCount2;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i4 = i2;
            i5 = iResolveSizeAndState;
            i6 = virtualChildCount2;
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = getPaddingRight() + getPaddingLeft() + this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            i7 = iArr[1];
            if (i7 != -1) {
                c2 = 2;
                c3 = 3;
            } else {
                c2 = 2;
                c3 = 3;
            }
            i8 = 0;
            iMax8 = Math.max(iMax8, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[c2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i7, iArr[c2]))));
            iMax = i73;
            i9 = iCombineMeasuredStates7;
        }
        if (!z20) {
            iMax8 = iMax;
        }
        setMeasuredDimension(i5 | ((-16777216) & i9), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i4, i9 << 16));
        if (z22) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i12 = i6;
            while (i8 < i12) {
                childAt2 = getChildAt(i8);
                if (childAt2.getVisibility() != 8) {
                    setwindowtitle = (setWindowTitle) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) setwindowtitle).height == -1) {
                        int i87 = ((LinearLayout.LayoutParams) setwindowtitle).width;
                        ((LinearLayout.LayoutParams) setwindowtitle).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) setwindowtitle).width = i87;
                    }
                }
                i8++;
            }
        }
    }

    public final void read(android.graphics.Canvas canvas, int i) {
        this.ResultReceiver.setBounds(i, getPaddingTop() + this.ComponentActivity, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + i, (getHeight() - getPaddingBottom()) - this.ComponentActivity);
        this.ResultReceiver.draw(canvas);
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(getChildCount(), "base aligned child index out of range (0, ", ")");
        } else {
            this.MediaSessionCompatResultReceiverWrapper = i;
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if ((i3 & 112) != i2) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public final void write(android.graphics.Canvas canvas, int i) {
        Drawable drawable = this.ResultReceiver;
        int paddingLeft = getPaddingLeft();
        int i2 = this.ComponentActivity;
        int width = getWidth();
        int paddingRight = getPaddingRight();
        drawable.setBounds(paddingLeft + i2, i, (width - paddingRight) - this.ComponentActivity, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + i);
        this.ResultReceiver.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.MediaSessionCompatResultReceiverWrapper < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.MediaSessionCompatResultReceiverWrapper;
        if (childCount <= i2) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.MediaSessionCompatResultReceiverWrapper == 0) {
                return -1;
            }
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int paddingTop = this.ParcelableVolumeInfo;
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 1 && (i = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys & 112) != 48) {
            if (i == 16) {
                int bottom = getBottom();
                int top = getTop();
                paddingTop += ((((bottom - top) - getPaddingTop()) - getPaddingBottom()) - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) / 2;
            } else if (i == 80) {
                paddingTop = ((getBottom() - getTop()) - getPaddingBottom()) - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            }
        }
        return paddingTop + ((LinearLayout.LayoutParams) ((setWindowTitle) childAt.getLayoutParams())).topMargin + baseline;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if ((8388615 & i3) != i2) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setOrientation(int i) {
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != i) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
            requestLayout();
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i;
    }

    public final boolean write(int i) {
        if (i == 0) {
            return (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            do {
                i--;
                if (i >= 0) {
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.ResultReceiver) {
            return;
        }
        this.ResultReceiver = drawable;
        if (drawable != null) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = drawable.getIntrinsicWidth();
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = drawable.getIntrinsicHeight();
        } else {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.ResultReceiver == null) {
            return;
        }
        int i2 = 0;
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && write(i2)) {
                    write(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((setWindowTitle) childAt.getLayoutParams())).topMargin) - this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                }
                i2++;
            }
            if (write(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((setWindowTitle) childAt2.getLayoutParams())).bottomMargin;
                }
                write(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && write(i2)) {
                setWindowTitle setwindowtitle = (setWindowTitle) childAt3.getLayoutParams();
                if (z) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) setwindowtitle).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) setwindowtitle).leftMargin) - this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                }
                read(canvas, left2);
            }
            i2++;
        }
        if (write(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                setWindowTitle setwindowtitle2 = (setWindowTitle) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) setwindowtitle2).leftMargin;
                    i = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) setwindowtitle2).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                right = left - i;
            }
            read(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public setWindowTitle generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof setWindowTitle) {
            return new setWindowTitle((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new setWindowTitle((ViewGroup.MarginLayoutParams) layoutParams) : new setWindowTitle(layoutParams);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public setWindowTitle generateDefaultLayoutParams() {
        int i = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (i == 0) {
            return new setWindowTitle(-2, -2);
        }
        if (i == 1) {
            return new setWindowTitle(-1, -2);
        }
        return null;
    }

    public void setGravity(int i) {
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public setWindowTitle generateLayoutParams(AttributeSet attributeSet) {
        return new setWindowTitle(getContext(), attributeSet);
    }

    public getOverflowIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
