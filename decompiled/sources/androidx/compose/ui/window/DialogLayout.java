package androidx.compose.ui.window;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.math.MathKt;
import o.ContentType_androidKt;
import o.FocusPropertiesImpl;
import o.FocusPropertiesNode;
import o.FocusRequesterModifierKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessgetCancelcp;
import o.component14;
import o.component15;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getBirthDateYear;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.setRight;

/* JADX INFO: loaded from: classes.dex */
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider, FocusPropertiesImpl {
    private final PopulateViewStructure_androidKtpopulate7 content$delegate;
    private boolean decorFitsSystemWindows;
    private boolean hasCalledSetLayout;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;
    private final Window window;

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = ((((i3 - i) - measuredWidth) - (paddingRight + paddingLeft)) / 2) + getPaddingLeft();
        int paddingTop2 = ((((i4 - i2) - measuredHeight) - (paddingBottom + paddingTop)) / 2) + getPaddingTop();
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui(int i, int i2) {
        int maxDialogHeightExcludingInsets;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE && !this.usePlatformDefaultWidth && getWindow().getAttributes().height == -2) {
            maxDialogHeightExcludingInsets = this.decorFitsSystemWindows ? getMaxDialogHeightExcludingInsets(getWindow(), size2) : size2 + 1;
        } else {
            maxDialogHeightExcludingInsets = size2;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = size - paddingRight;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = maxDialogHeightExcludingInsets - paddingBottom;
        int i5 = i4 >= 0 ? i4 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.decorFitsSystemWindows || childAt.getMeasuredHeight() + paddingBottom <= size2 || getWindow().getAttributes().height != -2) {
            return;
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        if (this.usePlatformDefaultWidth) {
            return;
        }
        getWindow().setLayout(-1, -1);
    }

    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getContent() {
        return (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.content$delegate.getValue();
    }

    public final void setContent(getBirthDateYear getbirthdateyear, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        setParentCompositionContext(getbirthdateyear);
        setContent(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    public final boolean isInsideContent(MotionEvent motionEvent) {
        View childAt;
        int iWrite;
        if (Math.abs(motionEvent.getX()) > Float.MAX_VALUE || Math.abs(motionEvent.getY()) > Float.MAX_VALUE || (childAt = getChildAt(0)) == null) {
            return false;
        }
        int left = childAt.getLeft() + getLeft();
        int width = childAt.getWidth();
        int top = childAt.getTop() + getTop();
        int height = childAt.getHeight();
        int iWrite2 = MathKt.write(motionEvent.getX());
        return left <= iWrite2 && iWrite2 <= width + left && top <= (iWrite = MathKt.write(motionEvent.getY())) && iWrite <= height + top;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1735448596);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.DialogLayout.Content.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i3) {
                    DialogLayout.this.Content(getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                }
            };
        }
    }

    public final void updateProperties(boolean z, boolean z2) {
        boolean z3 = (this.hasCalledSetLayout && z == this.usePlatformDefaultWidth && z2 == this.decorFitsSystemWindows) ? false : true;
        this.usePlatformDefaultWidth = z;
        this.decorFitsSystemWindows = z2;
        if (z3) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i = z ? -2 : -1;
            if (i == attributes.width && this.hasCalledSetLayout) {
                return;
            }
            getWindow().setLayout(i, -2);
            this.hasCalledSetLayout = true;
        }
    }

    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content$delegate = CompositionKt.RemoteActionCompatParcelizer(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.getLambda$210148896$ui());
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        accessgetCancelcp.write(this, this);
        FocusPropertiesNode.read(this, new WindowInsetsAnimationCompat$Callback() { // from class: androidx.compose.ui.window.DialogLayout.1
            @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
            public FocusRequesterModifierKt onProgress(FocusRequesterModifierKt focusRequesterModifierKt, List<component14> list) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.decorFitsSystemWindows) {
                    View childAt = dialogLayout.getChildAt(0);
                    int iMax = Math.max(0, childAt.getLeft());
                    int iMax2 = Math.max(0, childAt.getTop());
                    int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                        return focusRequesterModifierKt.IconCompatParcelizer.inset(iMax, iMax2, iMax3, iMax4);
                    }
                }
                return focusRequesterModifierKt;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
            public component15 onStart(component14 component14Var, component15 component15Var) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.decorFitsSystemWindows) {
                    View childAt = dialogLayout.getChildAt(0);
                    int iMax = Math.max(0, childAt.getLeft());
                    int iMax2 = Math.max(0, childAt.getTop());
                    int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                        setRight setrightIconCompatParcelizer = setRight.IconCompatParcelizer(iMax, iMax2, iMax3, iMax4);
                        int i = setrightIconCompatParcelizer.RemoteActionCompatParcelizer;
                        setRight setright = component15Var.RemoteActionCompatParcelizer;
                        int i2 = setrightIconCompatParcelizer.write;
                        int i3 = setrightIconCompatParcelizer.read;
                        int i4 = setrightIconCompatParcelizer.serializer;
                        return new component15(FocusRequesterModifierKt.IconCompatParcelizer(setright, i, i2, i3, i4), FocusRequesterModifierKt.IconCompatParcelizer(component15Var.read, i, i2, i3, i4));
                    }
                }
                return component15Var;
            }

            {
                super(1);
            }
        });
    }

    private final int getMaxDialogHeightExcludingInsets(Window window, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            return Api21Impl.INSTANCE.getMaxDialogHeightExcludingSystemBarInsets(window);
        }
        return i2 < 32 ? Api30Impl.INSTANCE.getMaxDialogHeightExcludingSystemBarInsets(window) : i;
    }

    private final <T> T insetValue(T t, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return (T) r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke(Integer.valueOf(iMax), Integer.valueOf(iMax2), Integer.valueOf(iMax3), Integer.valueOf(iMax4));
            }
        }
        return t;
    }

    @Override // o.FocusPropertiesImpl
    public FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return focusRequesterModifierKt.IconCompatParcelizer.inset(iMax, iMax2, iMax3, iMax4);
            }
        }
        return focusRequesterModifierKt;
    }

    private final void setContent(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.content$delegate.setValue(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }
}
