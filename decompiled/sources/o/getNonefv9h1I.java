package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class getNonefv9h1I extends accessgetLowestValuecp {
    public static final PorterDuff.Mode IconCompatParcelizer = PorterDuff.Mode.SRC_IN;
    public final float[] MediaBrowserCompatMediaItem;
    public final android.graphics.Rect MediaMetadataCompat;
    public accessgetMinNormalcp MediaSessionCompatQueueItem;
    public final android.graphics.Matrix RatingCompat;
    public android.graphics.ColorFilter RemoteActionCompatParcelizer;
    public boolean read;
    public PorterDuffColorFilter serializer;
    public boolean write;

    public static getNonefv9h1I RemoteActionCompatParcelizer(Resources resources, int i, Resources.Theme theme) {
        getNonefv9h1I getnonefv9h1i = new getNonefv9h1I();
        ThreadLocal threadLocal = setLeft.read;
        getnonefv9h1i.MediaDescriptionCompat = resources.getDrawable(i, theme);
        new compareTo41bOqos(getnonefv9h1i.MediaDescriptionCompat.getConstantState());
        return getnonefv9h1i;
    }

    public getNonefv9h1I(accessgetMinNormalcp accessgetminnormalcp) {
        this.write = true;
        this.MediaBrowserCompatMediaItem = new float[9];
        this.RatingCompat = new android.graphics.Matrix();
        this.MediaMetadataCompat = new android.graphics.Rect();
        this.MediaSessionCompatQueueItem = accessgetminnormalcp;
        this.serializer = RemoteActionCompatParcelizer(accessgetminnormalcp.RatingCompat, accessgetminnormalcp.ParcelableVolumeInfo);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable == null) {
            return false;
        }
        dispatchKeyEventYhN2O0wdefault.write(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        android.graphics.Rect rect = this.MediaMetadataCompat;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        android.graphics.ColorFilter colorFilter = this.RemoteActionCompatParcelizer;
        if (colorFilter == null) {
            colorFilter = this.serializer;
        }
        android.graphics.Matrix matrix = this.RatingCompat;
        canvas.getMatrix(matrix);
        float[] fArr = this.MediaBrowserCompatMediaItem;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(androidx.compose.ui.graphics.Fields.CameraDistance, iWidth);
        int iMin2 = Math.min(androidx.compose.ui.graphics.Fields.CameraDistance, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && dispatchKeyEventYhN2O0wdefault.read(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        this.MediaSessionCompatQueueItem.write(iMin, iMin2);
        boolean z = this.write;
        accessgetMinNormalcp accessgetminnormalcp = this.MediaSessionCompatQueueItem;
        if (!z) {
            accessgetminnormalcp.read(iMin, iMin2);
        } else if (!accessgetminnormalcp.write()) {
            this.MediaSessionCompatQueueItem.read(iMin, iMin2);
            this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        }
        this.MediaSessionCompatQueueItem.serializer(canvas, colorFilter, rect);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? dispatchKeyEventYhN2O0wdefault.serializer(drawable) : this.MediaSessionCompatQueueItem.PlaybackStateCompatCustomAction.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.MediaSessionCompatQueueItem.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? dispatchKeyEventYhN2O0wdefault.IconCompatParcelizer(drawable) : this.RemoteActionCompatParcelizer;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.MediaSessionCompatQueueItem.PlaybackStateCompatCustomAction.IconCompatParcelizer;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.MediaSessionCompatQueueItem.PlaybackStateCompatCustomAction.read;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? dispatchKeyEventYhN2O0wdefault.read(drawable) : this.MediaSessionCompatQueueItem.IconCompatParcelizer;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        accessgetMinNormalcp accessgetminnormalcp = this.MediaSessionCompatQueueItem;
        if (accessgetminnormalcp == null) {
            return false;
        }
        if (accessgetminnormalcp.serializer()) {
            return true;
        }
        ColorStateList colorStateList = this.MediaSessionCompatQueueItem.RatingCompat;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.read && super.mutate() == this) {
            this.MediaSessionCompatQueueItem = new accessgetMinNormalcp(this.MediaSessionCompatQueueItem);
            this.read = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        accessgetMinNormalcp accessgetminnormalcp = this.MediaSessionCompatQueueItem;
        ColorStateList colorStateList = accessgetminnormalcp.RatingCompat;
        if (colorStateList == null || (mode = accessgetminnormalcp.ParcelableVolumeInfo) == null) {
            z = false;
        } else {
            this.serializer = RemoteActionCompatParcelizer(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!accessgetminnormalcp.serializer() || !accessgetminnormalcp.read(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.MediaSessionCompatQueueItem.PlaybackStateCompatCustomAction.getRootAlpha() != i) {
            this.MediaSessionCompatQueueItem.PlaybackStateCompatCustomAction.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            dispatchKeyEventYhN2O0wdefault.write(drawable, z);
        } else {
            this.MediaSessionCompatQueueItem.IconCompatParcelizer = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.RemoteActionCompatParcelizer = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            dispatchKeyEventYhN2O0wdefault.read(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            dispatchKeyEventYhN2O0wdefault.IconCompatParcelizer(drawable, colorStateList);
            return;
        }
        accessgetMinNormalcp accessgetminnormalcp = this.MediaSessionCompatQueueItem;
        if (accessgetminnormalcp.RatingCompat != colorStateList) {
            accessgetminnormalcp.RatingCompat = colorStateList;
            this.serializer = RemoteActionCompatParcelizer(colorStateList, accessgetminnormalcp.ParcelableVolumeInfo);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            dispatchKeyEventYhN2O0wdefault.IconCompatParcelizer(drawable, mode);
            return;
        }
        accessgetMinNormalcp accessgetminnormalcp = this.MediaSessionCompatQueueItem;
        if (accessgetminnormalcp.ParcelableVolumeInfo != mode) {
            accessgetminnormalcp.ParcelableVolumeInfo = mode;
            this.serializer = RemoteActionCompatParcelizer(accessgetminnormalcp.RatingCompat, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.MediaDescriptionCompat;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final PorterDuffColorFilter RemoteActionCompatParcelizer(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.MediaDescriptionCompat != null) {
            return new compareTo41bOqos(this.MediaDescriptionCompat.getConstantState());
        }
        this.MediaSessionCompatQueueItem.MediaDescriptionCompat = getChangingConfigurations();
        return this.MediaSessionCompatQueueItem;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            dispatchKeyEventYhN2O0wdefault.read(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        accessgetMinNormalcp accessgetminnormalcp = this.MediaSessionCompatQueueItem;
        accessgetminnormalcp.PlaybackStateCompatCustomAction = new accessgetMaxValuecp();
        TypedArray typedArrayRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(resources, theme, attributeSet, getHighfv9h1I.MediaMetadataCompat);
        accessgetMinNormalcp accessgetminnormalcp2 = this.MediaSessionCompatQueueItem;
        accessgetMaxValuecp accessgetmaxvaluecp = accessgetminnormalcp2.PlaybackStateCompatCustomAction;
        int i = coil3.ExtrasKt.RemoteActionCompatParcelizer(xmlPullParser, "tintMode") ? typedArrayRemoteActionCompatParcelizer.getInt(6, -1) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i != 5) {
            if (i != 9) {
                switch (i) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        accessgetminnormalcp2.ParcelableVolumeInfo = mode;
        ColorStateList colorStateListRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(typedArrayRemoteActionCompatParcelizer, xmlPullParser, theme, "tint", 1);
        if (colorStateListRemoteActionCompatParcelizer != null) {
            accessgetminnormalcp2.RatingCompat = colorStateListRemoteActionCompatParcelizer;
        }
        boolean z = accessgetminnormalcp2.IconCompatParcelizer;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayRemoteActionCompatParcelizer.getBoolean(5, z);
        }
        accessgetminnormalcp2.IconCompatParcelizer = z;
        float f = accessgetmaxvaluecp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayRemoteActionCompatParcelizer.getFloat(7, f);
        }
        accessgetmaxvaluecp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = f;
        float f2 = accessgetmaxvaluecp.PlaybackStateCompat;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayRemoteActionCompatParcelizer.getFloat(8, f2);
        }
        accessgetmaxvaluecp.PlaybackStateCompat = f2;
        if (accessgetmaxvaluecp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY <= 0.0f) {
            throw new XmlPullParserException(typedArrayRemoteActionCompatParcelizer.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            accessgetmaxvaluecp.read = typedArrayRemoteActionCompatParcelizer.getDimension(3, accessgetmaxvaluecp.read);
            float dimension = typedArrayRemoteActionCompatParcelizer.getDimension(2, accessgetmaxvaluecp.IconCompatParcelizer);
            accessgetmaxvaluecp.IconCompatParcelizer = dimension;
            if (accessgetmaxvaluecp.read <= 0.0f) {
                throw new XmlPullParserException(typedArrayRemoteActionCompatParcelizer.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = accessgetmaxvaluecp.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayRemoteActionCompatParcelizer.getFloat(4, alpha);
                }
                accessgetmaxvaluecp.setAlpha(alpha);
                String string = typedArrayRemoteActionCompatParcelizer.getString(0);
                if (string != null) {
                    accessgetmaxvaluecp.ParcelableVolumeInfo = string;
                    accessgetmaxvaluecp.MediaSessionCompatResultReceiverWrapper.put(string, accessgetmaxvaluecp);
                }
                typedArrayRemoteActionCompatParcelizer.recycle();
                accessgetminnormalcp.MediaDescriptionCompat = getChangingConfigurations();
                accessgetminnormalcp.RemoteActionCompatParcelizer = true;
                accessgetMinNormalcp accessgetminnormalcp3 = this.MediaSessionCompatQueueItem;
                accessgetMaxValuecp accessgetmaxvaluecp2 = accessgetminnormalcp3.PlaybackStateCompatCustomAction;
                ArrayDeque arrayDeque = new ArrayDeque();
                accessgetMinValuecp accessgetminvaluecp = accessgetmaxvaluecp2.PlaybackStateCompatCustomAction;
                ImageKt imageKt = accessgetmaxvaluecp2.MediaSessionCompatResultReceiverWrapper;
                arrayDeque.push(accessgetminvaluecp);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth();
                boolean z2 = true;
                for (int i2 = 1; eventType != i2 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3); i2 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        accessgetMinValuecp accessgetminvaluecp2 = (accessgetMinValuecp) arrayDeque.peek();
                        if ("path".equals(name)) {
                            absoluteValueslo4al4 absolutevalueslo4al4 = new absoluteValueslo4al4();
                            absolutevalueslo4al4.read(resources, xmlPullParser, attributeSet, theme);
                            accessgetminvaluecp2.write.add(absolutevalueslo4al4);
                            if (absolutevalueslo4al4.getPathName() != null) {
                                imageKt.put(absolutevalueslo4al4.getPathName(), absolutevalueslo4al4);
                            }
                            accessgetminnormalcp3.MediaDescriptionCompat = accessgetminnormalcp3.MediaDescriptionCompat;
                            z2 = false;
                        } else if ("clip-path".equals(name)) {
                            accessgetEpsiloncp accessgetepsiloncp = new accessgetEpsiloncp();
                            accessgetepsiloncp.IconCompatParcelizer(resources, xmlPullParser, attributeSet, theme);
                            accessgetminvaluecp2.write.add(accessgetepsiloncp);
                            if (accessgetepsiloncp.getPathName() != null) {
                                imageKt.put(accessgetepsiloncp.getPathName(), accessgetepsiloncp);
                            }
                            accessgetminnormalcp3.MediaDescriptionCompat = accessgetminnormalcp3.MediaDescriptionCompat;
                        } else if ("group".equals(name)) {
                            accessgetMinValuecp accessgetminvaluecp3 = new accessgetMinValuecp();
                            accessgetminvaluecp3.read(resources, xmlPullParser, attributeSet, theme);
                            accessgetminvaluecp2.write.add(accessgetminvaluecp3);
                            arrayDeque.push(accessgetminvaluecp3);
                            if (accessgetminvaluecp3.getGroupName() != null) {
                                imageKt.put(accessgetminvaluecp3.getGroupName(), accessgetminvaluecp3);
                            }
                            accessgetminnormalcp3.MediaDescriptionCompat = accessgetminnormalcp3.MediaDescriptionCompat;
                        }
                    } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                    }
                    eventType = xmlPullParser.next();
                }
                if (!z2) {
                    this.serializer = RemoteActionCompatParcelizer(accessgetminnormalcp.RatingCompat, accessgetminnormalcp.ParcelableVolumeInfo);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayRemoteActionCompatParcelizer.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayRemoteActionCompatParcelizer.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public getNonefv9h1I() {
        this.write = true;
        this.MediaBrowserCompatMediaItem = new float[9];
        this.RatingCompat = new android.graphics.Matrix();
        this.MediaMetadataCompat = new android.graphics.Rect();
        this.MediaSessionCompatQueueItem = new accessgetMinNormalcp();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
