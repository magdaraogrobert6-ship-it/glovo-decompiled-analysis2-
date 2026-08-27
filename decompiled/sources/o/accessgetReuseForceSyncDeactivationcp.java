package o;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import com.google.android.material.textfield.TextInputLayout;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetReuseForceSyncDeactivationcp {
    public float ComponentActivity;
    public getUnspecified_hLwfpc IconCompatParcelizer;
    public float MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public float MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public ColorStateList MediaSessionCompatResultReceiverWrapper;
    public float MediaSessionCompatToken;
    public float ParcelableVolumeInfo;
    public ColorStateList RatingCompat;
    public final android.graphics.Rect RemoteActionCompatParcelizer;
    public android.graphics.Typeface ResultReceiver;
    public float _init_lambda1;
    public float _init_lambda2;
    public float _init_lambda3;
    public ColorStateList _init_lambda4;
    public float accessensureViewModelStore;
    public CharSequence addContentView;
    public TimeInterpolator addMenuProvider;
    public android.graphics.Typeface addObserverForBackInvoker;
    public Bitmap addObserverForBackInvokerlambda0;
    public CharSequence addOnConfigurationChangedListener;
    public CharSequence addOnContextAvailableListener;
    public final TextPaint addOnMultiWindowModeChangedListener;
    public StaticLayout addOnNewIntentListener;
    public final TextInputLayout addOnPictureInPictureModeChangedListener;
    public android.graphics.Typeface ensureViewModelStore;
    public final TextPaint enterPictureInPictureMode;
    public boolean fullyDrawnReporter_delegatelambda0;
    public android.graphics.Typeface fullyDrawnReporter_delegatelambda00;
    public float onBackPressedDispatcher_delegatelambda0;
    public TimeInterpolator onBackPressedDispatcher_delegatelambda00;
    public int[] onBackPressedInput_delegatelambda0;
    public android.graphics.Typeface r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final RectF r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public android.graphics.Typeface r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public float r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public float r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public float r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public float r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public float r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public float r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final android.graphics.Rect r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public float r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public android.graphics.Typeface r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public float read;
    public float serializer;
    public boolean write;
    public int createFullyDrawnExecutor = 16;
    public int PlaybackStateCompat = 16;
    public float defaultViewModelProviderFactory_delegatelambda0 = 15.0f;
    public float PlaybackStateCompatCustomAction = 15.0f;
    public final TextUtils.TruncateAt addOnTrimMemoryListener = TextUtils.TruncateAt.END;
    public final boolean getSavedStateRegistryControllerannotations = true;
    public final int onBackPressedDispatcher_delegatelambda010 = 1;
    public final float getOnBackPressedInput = 1.0f;
    public final int menuHostHelperlambda0 = 1;

    public final void read(float f) {
        IconCompatParcelizer(f, false);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        this.addOnPictureInPictureModeChangedListener.postInvalidateOnAnimation();
    }

    public static float write(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return handleMotionFrameOfReferencePlacement.write(f, f2, f3);
    }

    public final float write() {
        float f = this.PlaybackStateCompatCustomAction;
        TextPaint textPaint = this.enterPictureInPictureMode;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        textPaint.setLetterSpacing(this.MediaSessionCompatQueueItem);
        return -textPaint.ascent();
    }

    public final boolean write(CharSequence charSequence) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        boolean z = this.addOnPictureInPictureModeChangedListener.getLayoutDirection() == 1;
        if (this.getSavedStateRegistryControllerannotations) {
            return (z ? traverseAncestorsIncludingSelfQFhIj7k.read : traverseAncestorsIncludingSelfQFhIj7k.RemoteActionCompatParcelizer).write(charSequence.length(), charSequence);
        }
        return z;
    }

    public static int read(float f, int i, int i2) {
        float f2 = 1.0f - f;
        float fAlpha = android.graphics.Color.alpha(i);
        float fAlpha2 = android.graphics.Color.alpha(i2);
        float fRed = android.graphics.Color.red(i);
        float fRed2 = android.graphics.Color.red(i2);
        float fGreen = android.graphics.Color.green(i);
        return android.graphics.Color.argb(Math.round((fAlpha2 * f) + (fAlpha * f2)), Math.round((fRed2 * f) + (fRed * f2)), Math.round((android.graphics.Color.green(i2) * f) + (fGreen * f2)), Math.round((android.graphics.Color.blue(i2) * f) + (android.graphics.Color.blue(i) * f2)));
    }

    public final void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        if (this.MediaSessionCompatResultReceiverWrapper == colorStateList && this._init_lambda4 == colorStateList) {
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper = colorStateList;
        this._init_lambda4 = colorStateList;
        write(false);
    }

    public final void serializer(android.graphics.Typeface typeface) {
        boolean z;
        boolean zIconCompatParcelizer = IconCompatParcelizer(typeface);
        if (this.fullyDrawnReporter_delegatelambda00 != typeface) {
            this.fullyDrawnReporter_delegatelambda00 = typeface;
            android.graphics.Typeface typeface2 = isUnspecifiedFK8aYYsannotations.read(this.addOnPictureInPictureModeChangedListener.getContext().getResources().getConfiguration(), typeface);
            this.addObserverForBackInvoker = typeface2;
            if (typeface2 == null) {
                typeface2 = this.fullyDrawnReporter_delegatelambda00;
            }
            this.ensureViewModelStore = typeface2;
            z = true;
        } else {
            z = false;
        }
        if (zIconCompatParcelizer || z) {
            write(false);
        }
    }

    public final int write(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.onBackPressedInput_delegatelambda0;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void write(boolean z) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.addOnPictureInPictureModeChangedListener;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        IconCompatParcelizer(1.0f, z);
        CharSequence charSequence = this.addOnConfigurationChangedListener;
        TextPaint textPaint = this.addOnMultiWindowModeChangedListener;
        if (charSequence != null && (staticLayout = this.addOnNewIntentListener) != null) {
            this.addOnContextAvailableListener = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.addOnTrimMemoryListener);
        }
        CharSequence charSequence2 = this.addOnContextAvailableListener;
        if (charSequence2 != null) {
            this.ParcelableVolumeInfo = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.ParcelableVolumeInfo = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.PlaybackStateCompat, this.fullyDrawnReporter_delegatelambda0 ? 1 : 0);
        int i = absoluteGravity & 112;
        android.graphics.Rect rect = this.RemoteActionCompatParcelizer;
        if (i == 48) {
            this.read = rect.top;
        } else if (i != 80) {
            this.read = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.read = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.serializer = rect.centerX() - (this.ParcelableVolumeInfo / 2.0f);
        } else if (i2 != 5) {
            this.serializer = rect.left;
        } else {
            this.serializer = rect.right - this.ParcelableVolumeInfo;
        }
        IconCompatParcelizer(0.0f, z);
        StaticLayout staticLayout2 = this.addOnNewIntentListener;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.addOnNewIntentListener;
        if (staticLayout3 != null && this.onBackPressedDispatcher_delegatelambda010 > 1) {
            fMeasureText = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.addOnConfigurationChangedListener;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        }
        StaticLayout staticLayout4 = this.addOnNewIntentListener;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.createFullyDrawnExecutor, this.fullyDrawnReporter_delegatelambda0 ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        android.graphics.Rect rect2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (i3 == 48) {
            this._init_lambda3 = rect2.top;
        } else if (i3 != 80) {
            this._init_lambda3 = rect2.centerY() - (height / 2.0f);
        } else {
            this._init_lambda3 = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = rect2.left;
        } else {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.addObserverForBackInvokerlambda0;
        if (bitmap != null) {
            bitmap.recycle();
            this.addObserverForBackInvokerlambda0 = null;
        }
        read(this.accessensureViewModelStore);
        float f = this.accessensureViewModelStore;
        float fWrite = write(rect2.left, rect.left, f, this.onBackPressedDispatcher_delegatelambda00);
        RectF rectF = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        rectF.left = fWrite;
        rectF.top = write(this._init_lambda3, this.read, f, this.onBackPressedDispatcher_delegatelambda00);
        rectF.right = write(rect2.right, rect.right, f, this.onBackPressedDispatcher_delegatelambda00);
        rectF.bottom = write(rect2.bottom, rect.bottom, f, this.onBackPressedDispatcher_delegatelambda00);
        this.ComponentActivity = write(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, this.serializer, f, this.onBackPressedDispatcher_delegatelambda00);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = write(this._init_lambda3, this.read, f, this.onBackPressedDispatcher_delegatelambda00);
        read(f);
        restore restoreVar = handleMotionFrameOfReferencePlacement.RemoteActionCompatParcelizer;
        this.MediaSessionCompatToken = 1.0f - write(0.0f, 1.0f, 1.0f - f, restoreVar);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        textInputLayout.postInvalidateOnAnimation();
        this._init_lambda1 = write(1.0f, 0.0f, f, restoreVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.MediaSessionCompatResultReceiverWrapper;
        ColorStateList colorStateList2 = this._init_lambda4;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(read(f, write(colorStateList2), write(this.MediaSessionCompatResultReceiverWrapper)));
        } else {
            textPaint.setColor(write(colorStateList));
        }
        float f2 = this.MediaSessionCompatQueueItem;
        float f3 = this._init_lambda2;
        if (f2 != f3) {
            textPaint.setLetterSpacing(write(f3, f2, f, restoreVar));
        } else {
            textPaint.setLetterSpacing(f2);
        }
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = handleMotionFrameOfReferencePlacement.write(0.0f, this.MediaMetadataCompat, f);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = handleMotionFrameOfReferencePlacement.write(0.0f, this.MediaDescriptionCompat, f);
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = handleMotionFrameOfReferencePlacement.write(0.0f, this.MediaBrowserCompatMediaItem, f);
        int i5 = read(f, 0, write(this.RatingCompat));
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5;
        textPaint.setShadowLayer(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, i5);
        textInputLayout.postInvalidateOnAnimation();
    }

    public accessgetReuseForceSyncDeactivationcp(TextInputLayout textInputLayout) {
        this.addOnPictureInPictureModeChangedListener = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.addOnMultiWindowModeChangedListener = textPaint;
        this.enterPictureInPictureMode = new TextPaint(textPaint);
        this.RemoteActionCompatParcelizer = new android.graphics.Rect();
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new android.graphics.Rect();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new RectF();
        serializer(textInputLayout.getContext().getResources().getConfiguration());
    }

    public final boolean IconCompatParcelizer(android.graphics.Typeface typeface) {
        getUnspecified_hLwfpc getunspecified_hlwfpc = this.IconCompatParcelizer;
        if (getunspecified_hlwfpc != null) {
            getunspecified_hlwfpc.read = true;
        }
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == typeface) {
            return false;
        }
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = typeface;
        android.graphics.Typeface typeface2 = isUnspecifiedFK8aYYsannotations.read(this.addOnPictureInPictureModeChangedListener.getContext().getResources().getConfiguration(), typeface);
        this.ResultReceiver = typeface2;
        if (typeface2 == null) {
            typeface2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = typeface2;
        return true;
    }

    public final void IconCompatParcelizer(float f, boolean z) {
        float f2;
        float f3;
        android.graphics.Typeface typeface;
        boolean z2;
        StaticLayout staticLayoutWrite;
        android.text.Layout.Alignment alignment;
        if (this.addContentView == null) {
            return;
        }
        float fWidth = this.RemoteActionCompatParcelizer.width();
        float fWidth2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.PlaybackStateCompatCustomAction;
            f3 = this.MediaSessionCompatQueueItem;
            this.onBackPressedDispatcher_delegatelambda0 = 1.0f;
            typeface = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        } else {
            float f4 = this.defaultViewModelProviderFactory_delegatelambda0;
            float f5 = this._init_lambda2;
            android.graphics.Typeface typeface2 = this.ensureViewModelStore;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.onBackPressedDispatcher_delegatelambda0 = 1.0f;
            } else {
                this.onBackPressedDispatcher_delegatelambda0 = write(this.defaultViewModelProviderFactory_delegatelambda0, this.PlaybackStateCompatCustomAction, f, this.addMenuProvider) / this.defaultViewModelProviderFactory_delegatelambda0;
            }
            float f6 = this.PlaybackStateCompatCustomAction / this.defaultViewModelProviderFactory_delegatelambda0;
            fWidth = (!z && fWidth2 * f6 > fWidth) ? Math.min(fWidth / f6, fWidth2) : fWidth2;
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.addOnMultiWindowModeChangedListener;
        if (fWidth > 0.0f) {
            boolean z3 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != f2;
            boolean z4 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != f3;
            boolean z5 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != typeface;
            StaticLayout staticLayout = this.addOnNewIntentListener;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.write;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = f2;
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = f3;
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = typeface;
            this.write = false;
            textPaint.setLinearText(this.onBackPressedDispatcher_delegatelambda0 != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.addOnConfigurationChangedListener == null || z2) {
            textPaint.setTextSize(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
            textPaint.setTypeface(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
            textPaint.setLetterSpacing(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
            boolean zWrite = write(this.addContentView);
            this.fullyDrawnReporter_delegatelambda0 = zWrite;
            int i = this.onBackPressedDispatcher_delegatelambda010;
            if (i <= 1 || zWrite) {
                i = 1;
            }
            try {
                if (i == 1) {
                    alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.createFullyDrawnExecutor, zWrite ? 1 : 0) & 7;
                    if (absoluteGravity != 1) {
                        boolean z7 = this.fullyDrawnReporter_delegatelambda0;
                        if (absoluteGravity != 5) {
                            alignment = z7 ? android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = z7 ? android.text.Layout.Alignment.ALIGN_NORMAL : android.text.Layout.Alignment.ALIGN_OPPOSITE;
                        }
                    } else {
                        alignment = android.text.Layout.Alignment.ALIGN_CENTER;
                    }
                }
                getCancelPausedPrecompositionNjRlDlw getcancelpausedprecompositionnjrldlw = new getCancelPausedPrecompositionNjRlDlw(this.addContentView, textPaint, (int) fWidth);
                getcancelpausedprecompositionnjrldlw.write = this.addOnTrimMemoryListener;
                getcancelpausedprecompositionnjrldlw.MediaDescriptionCompat = zWrite;
                getcancelpausedprecompositionnjrldlw.serializer = alignment;
                getcancelpausedprecompositionnjrldlw.IconCompatParcelizer = false;
                getcancelpausedprecompositionnjrldlw.MediaMetadataCompat = i;
                getcancelpausedprecompositionnjrldlw.RatingCompat = this.getOnBackPressedInput;
                getcancelpausedprecompositionnjrldlw.RemoteActionCompatParcelizer = this.menuHostHelperlambda0;
                staticLayoutWrite = getcancelpausedprecompositionnjrldlw.write();
            } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
                SentryLogcatAdapter.read("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayoutWrite = null;
            }
            staticLayoutWrite.getClass();
            this.addOnNewIntentListener = staticLayoutWrite;
            this.addOnConfigurationChangedListener = staticLayoutWrite.getText();
        }
    }

    public final void serializer(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            android.graphics.Typeface typeface = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (typeface != null) {
                this.ResultReceiver = isUnspecifiedFK8aYYsannotations.read(configuration, typeface);
            }
            android.graphics.Typeface typeface2 = this.fullyDrawnReporter_delegatelambda00;
            if (typeface2 != null) {
                this.addObserverForBackInvoker = isUnspecifiedFK8aYYsannotations.read(configuration, typeface2);
            }
            android.graphics.Typeface typeface3 = this.ResultReceiver;
            if (typeface3 == null) {
                typeface3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = typeface3;
            android.graphics.Typeface typeface4 = this.addObserverForBackInvoker;
            if (typeface4 == null) {
                typeface4 = this.fullyDrawnReporter_delegatelambda00;
            }
            this.ensureViewModelStore = typeface4;
            write(true);
        }
    }

    public final void RemoteActionCompatParcelizer(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.accessensureViewModelStore) {
            this.accessensureViewModelStore = f;
            android.graphics.Rect rect = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            float f2 = rect.left;
            android.graphics.Rect rect2 = this.RemoteActionCompatParcelizer;
            float fWrite = write(f2, rect2.left, f, this.onBackPressedDispatcher_delegatelambda00);
            RectF rectF = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            rectF.left = fWrite;
            rectF.top = write(this._init_lambda3, this.read, f, this.onBackPressedDispatcher_delegatelambda00);
            rectF.right = write(rect.right, rect2.right, f, this.onBackPressedDispatcher_delegatelambda00);
            rectF.bottom = write(rect.bottom, rect2.bottom, f, this.onBackPressedDispatcher_delegatelambda00);
            this.ComponentActivity = write(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, this.serializer, f, this.onBackPressedDispatcher_delegatelambda00);
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = write(this._init_lambda3, this.read, f, this.onBackPressedDispatcher_delegatelambda00);
            read(f);
            restore restoreVar = handleMotionFrameOfReferencePlacement.RemoteActionCompatParcelizer;
            this.MediaSessionCompatToken = 1.0f - write(0.0f, 1.0f, 1.0f - f, restoreVar);
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            TextInputLayout textInputLayout = this.addOnPictureInPictureModeChangedListener;
            textInputLayout.postInvalidateOnAnimation();
            this._init_lambda1 = write(1.0f, 0.0f, f, restoreVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.MediaSessionCompatResultReceiverWrapper;
            ColorStateList colorStateList2 = this._init_lambda4;
            TextPaint textPaint = this.addOnMultiWindowModeChangedListener;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(read(f, write(colorStateList2), write(this.MediaSessionCompatResultReceiverWrapper)));
            } else {
                textPaint.setColor(write(colorStateList));
            }
            float f3 = this.MediaSessionCompatQueueItem;
            float f4 = this._init_lambda2;
            if (f3 != f4) {
                textPaint.setLetterSpacing(write(f4, f3, f, restoreVar));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = handleMotionFrameOfReferencePlacement.write(0.0f, this.MediaMetadataCompat, f);
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = handleMotionFrameOfReferencePlacement.write(0.0f, this.MediaDescriptionCompat, f);
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = handleMotionFrameOfReferencePlacement.write(0.0f, this.MediaBrowserCompatMediaItem, f);
            int i = read(f, 0, write(this.RatingCompat));
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i;
            textPaint.setShadowLayer(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, i);
            textInputLayout.postInvalidateOnAnimation();
        }
    }
}
