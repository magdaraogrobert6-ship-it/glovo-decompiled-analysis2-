package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class absoluteValueslo4al4 extends accessgetNaNcp {
    public float IconCompatParcelizer;
    public android.graphics.Paint.Join MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public float MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public float ParcelableVolumeInfo;
    public float RatingCompat;
    public getPrevious RemoteActionCompatParcelizer;
    public float read;
    public android.graphics.Paint.Cap serializer;
    public getPrevious write;

    public float getFillAlpha() {
        return this.read;
    }

    public float getStrokeAlpha() {
        return this.IconCompatParcelizer;
    }

    public float getStrokeWidth() {
        return this.MediaMetadataCompat;
    }

    public float getTrimPathEnd() {
        return this.MediaSessionCompatQueueItem;
    }

    public float getTrimPathOffset() {
        return this.RatingCompat;
    }

    public float getTrimPathStart() {
        return this.ParcelableVolumeInfo;
    }

    public void setFillAlpha(float f) {
        this.read = f;
    }

    public void setStrokeAlpha(float f) {
        this.IconCompatParcelizer = f;
    }

    public void setStrokeWidth(float f) {
        this.MediaMetadataCompat = f;
    }

    public void setTrimPathEnd(float f) {
        this.MediaSessionCompatQueueItem = f;
    }

    public void setTrimPathOffset(float f) {
        this.RatingCompat = f;
    }

    public void setTrimPathStart(float f) {
        this.ParcelableVolumeInfo = f;
    }

    public int getFillColor() {
        return this.write.write;
    }

    public int getStrokeColor() {
        return this.RemoteActionCompatParcelizer.write;
    }

    public final void read(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(resources, theme, attributeSet, getHighfv9h1I.read);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            String string = typedArrayRemoteActionCompatParcelizer.getString(0);
            if (string != null) {
                this.PlaybackStateCompatCustomAction = string;
            }
            String string2 = typedArrayRemoteActionCompatParcelizer.getString(2);
            if (string2 != null) {
                this.PlaybackStateCompat = FocusOrderModifierKt.serializer(string2);
            }
            this.write = coil3.ExtrasKt.IconCompatParcelizer(typedArrayRemoteActionCompatParcelizer, xmlPullParser, theme, "fillColor", 1, 0);
            float f = this.read;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                f = typedArrayRemoteActionCompatParcelizer.getFloat(12, f);
            }
            this.read = f;
            int i = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayRemoteActionCompatParcelizer.getInt(8, -1) : -1;
            android.graphics.Paint.Cap cap = this.serializer;
            if (i == 0) {
                cap = android.graphics.Paint.Cap.BUTT;
            } else if (i == 1) {
                cap = android.graphics.Paint.Cap.ROUND;
            } else if (i == 2) {
                cap = android.graphics.Paint.Cap.SQUARE;
            }
            this.serializer = cap;
            int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayRemoteActionCompatParcelizer.getInt(9, -1) : -1;
            android.graphics.Paint.Join join = this.MediaBrowserCompatMediaItem;
            if (i2 == 0) {
                join = android.graphics.Paint.Join.MITER;
            } else if (i2 == 1) {
                join = android.graphics.Paint.Join.ROUND;
            } else if (i2 == 2) {
                join = android.graphics.Paint.Join.BEVEL;
            }
            this.MediaBrowserCompatMediaItem = join;
            float f2 = this.MediaDescriptionCompat;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                f2 = typedArrayRemoteActionCompatParcelizer.getFloat(10, f2);
            }
            this.MediaDescriptionCompat = f2;
            this.RemoteActionCompatParcelizer = coil3.ExtrasKt.IconCompatParcelizer(typedArrayRemoteActionCompatParcelizer, xmlPullParser, theme, "strokeColor", 3, 0);
            float f3 = this.IconCompatParcelizer;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                f3 = typedArrayRemoteActionCompatParcelizer.getFloat(11, f3);
            }
            this.IconCompatParcelizer = f3;
            float f4 = this.MediaMetadataCompat;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                f4 = typedArrayRemoteActionCompatParcelizer.getFloat(4, f4);
            }
            this.MediaMetadataCompat = f4;
            float f5 = this.MediaSessionCompatQueueItem;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                f5 = typedArrayRemoteActionCompatParcelizer.getFloat(6, f5);
            }
            this.MediaSessionCompatQueueItem = f5;
            float f6 = this.RatingCompat;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                f6 = typedArrayRemoteActionCompatParcelizer.getFloat(7, f6);
            }
            this.RatingCompat = f6;
            float f7 = this.ParcelableVolumeInfo;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                f7 = typedArrayRemoteActionCompatParcelizer.getFloat(5, f7);
            }
            this.ParcelableVolumeInfo = f7;
            int i3 = this.MediaSessionCompatResultReceiverWrapper;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                i3 = typedArrayRemoteActionCompatParcelizer.getInt(13, i3);
            }
            this.MediaSessionCompatResultReceiverWrapper = i3;
        }
        typedArrayRemoteActionCompatParcelizer.recycle();
    }

    @Override // o.accessgetNegativeInfinitycp
    public final boolean read() {
        return this.write.RemoteActionCompatParcelizer() || this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // o.accessgetNegativeInfinitycp
    public final boolean serializer(int[] iArr) {
        boolean z;
        getPrevious getprevious = this.write;
        boolean z2 = false;
        if (getprevious.RemoteActionCompatParcelizer()) {
            ColorStateList colorStateList = getprevious.serializer;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != getprevious.write) {
                getprevious.write = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        getPrevious getprevious2 = this.RemoteActionCompatParcelizer;
        if (getprevious2.RemoteActionCompatParcelizer()) {
            ColorStateList colorStateList2 = getprevious2.serializer;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != getprevious2.write) {
                getprevious2.write = colorForState2;
                z2 = true;
            }
        }
        return z | z2;
    }

    public void setFillColor(int i) {
        this.write.write = i;
    }

    public void setStrokeColor(int i) {
        this.RemoteActionCompatParcelizer.write = i;
    }

    public absoluteValueslo4al4() {
        this.MediaMetadataCompat = 0.0f;
        this.IconCompatParcelizer = 1.0f;
        this.read = 1.0f;
        this.ParcelableVolumeInfo = 0.0f;
        this.MediaSessionCompatQueueItem = 1.0f;
        this.RatingCompat = 0.0f;
        this.serializer = android.graphics.Paint.Cap.BUTT;
        this.MediaBrowserCompatMediaItem = android.graphics.Paint.Join.MITER;
        this.MediaDescriptionCompat = 4.0f;
    }

    public absoluteValueslo4al4(accessgetNaNcp accessgetnancp) {
        super(accessgetnancp);
    }
}
