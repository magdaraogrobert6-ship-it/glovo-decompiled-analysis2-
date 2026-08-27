package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.transition.Transition$3;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class getMediumfv9h1I extends accessgetLowestValuecp implements android.graphics.drawable.Animatable {
    public final Context write;
    public Transition$3 IconCompatParcelizer = null;
    public ArrayList RemoteActionCompatParcelizer = null;
    public final DrawablePainter$callback$2$1 serializer = new DrawablePainter$callback$2$1(1, this);
    public final Float16 read = new Float16();

    public getMediumfv9h1I(Context context) {
        this.write = context;
    }

    @Override // o.accessgetLowestValuecp, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Float16 float16 = this.read;
        float16.write.draw(canvas);
        if (float16.serializer.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.getAlpha() : this.read.write.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.read.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.getColorFilter() : this.read.write.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.getIntrinsicHeight() : this.read.write.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.getIntrinsicWidth() : this.read.write.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.getOpacity() : this.read.write.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Float16 float16;
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        while (true) {
            float16 = this.read;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth + 1 && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(resources, theme, attributeSet, getHighfv9h1I.RemoteActionCompatParcelizer);
                    int resourceId = typedArrayRemoteActionCompatParcelizer.getResourceId(0, 0);
                    if (resourceId != 0) {
                        getNonefv9h1I getnonefv9h1iRemoteActionCompatParcelizer = getNonefv9h1I.RemoteActionCompatParcelizer(resources, resourceId, theme);
                        getnonefv9h1iRemoteActionCompatParcelizer.write = false;
                        getnonefv9h1iRemoteActionCompatParcelizer.setCallback(this.serializer);
                        getNonefv9h1I getnonefv9h1i = float16.write;
                        if (getnonefv9h1i != null) {
                            getnonefv9h1i.setCallback(null);
                        }
                        float16.write = getnonefv9h1iRemoteActionCompatParcelizer;
                    }
                    typedArrayRemoteActionCompatParcelizer.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, getHighfv9h1I.serializer);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.write;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Context can't be null when inflating animators");
                            return;
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(float16.write.MediaSessionCompatQueueItem.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper.get(string));
                        if (float16.IconCompatParcelizer == null) {
                            float16.IconCompatParcelizer = new ArrayList();
                            float16.read = new ImageKt(0);
                        }
                        float16.IconCompatParcelizer.add(animatorLoadAnimator);
                        float16.read.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (float16.serializer == null) {
            float16.serializer = new AnimatorSet();
        }
        float16.serializer.playTogether(float16.IconCompatParcelizer);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.isAutoMirrored() : this.read.write.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.read.serializer.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.isStateful() : this.read.write.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.read.write.setBounds(rect);
        }
    }

    @Override // o.accessgetLowestValuecp, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.setLevel(i) : this.read.write.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.setState(iArr) : this.read.write.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.read.write.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.read.write.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.read.write.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.read.write.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.read.write.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.read.write.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.read.write.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        Float16 float16 = this.read;
        if (float16.serializer.isStarted()) {
            return;
        }
        float16.serializer.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.read.serializer.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.MediaDescriptionCompat != null) {
            return new drawLineNGM6Ib0default(1, this.MediaDescriptionCompat.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
