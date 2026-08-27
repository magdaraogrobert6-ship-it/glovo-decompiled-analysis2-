package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetMinValuecp extends accessgetNegativeInfinitycp {
    public String IconCompatParcelizer;
    public final android.graphics.Matrix MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public float MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public float MediaSessionCompatResultReceiverWrapper;
    public float RatingCompat;
    public final android.graphics.Matrix RemoteActionCompatParcelizer;
    public float read;
    public float serializer;
    public final ArrayList write;

    public String getGroupName() {
        return this.IconCompatParcelizer;
    }

    public android.graphics.Matrix getLocalMatrix() {
        return this.RemoteActionCompatParcelizer;
    }

    public float getPivotX() {
        return this.serializer;
    }

    public float getPivotY() {
        return this.read;
    }

    public float getRotation() {
        return this.MediaSessionCompatQueueItem;
    }

    public float getScaleX() {
        return this.MediaMetadataCompat;
    }

    public float getScaleY() {
        return this.MediaDescriptionCompat;
    }

    public float getTranslateX() {
        return this.RatingCompat;
    }

    public float getTranslateY() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public final void RemoteActionCompatParcelizer() {
        android.graphics.Matrix matrix = this.RemoteActionCompatParcelizer;
        matrix.reset();
        matrix.postTranslate(-this.serializer, -this.read);
        matrix.postScale(this.MediaMetadataCompat, this.MediaDescriptionCompat);
        matrix.postRotate(this.MediaSessionCompatQueueItem, 0.0f, 0.0f);
        matrix.postTranslate(this.RatingCompat + this.serializer, this.MediaSessionCompatResultReceiverWrapper + this.read);
    }

    public final void read(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(resources, theme, attributeSet, getHighfv9h1I.write);
        float f = this.MediaSessionCompatQueueItem;
        if (coil3.ExtrasKt.RemoteActionCompatParcelizer(xmlPullParser, "rotation")) {
            f = typedArrayRemoteActionCompatParcelizer.getFloat(5, f);
        }
        this.MediaSessionCompatQueueItem = f;
        this.serializer = typedArrayRemoteActionCompatParcelizer.getFloat(1, this.serializer);
        this.read = typedArrayRemoteActionCompatParcelizer.getFloat(2, this.read);
        float f2 = this.MediaMetadataCompat;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
            f2 = typedArrayRemoteActionCompatParcelizer.getFloat(3, f2);
        }
        this.MediaMetadataCompat = f2;
        float f3 = this.MediaDescriptionCompat;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
            f3 = typedArrayRemoteActionCompatParcelizer.getFloat(4, f3);
        }
        this.MediaDescriptionCompat = f3;
        float f4 = this.RatingCompat;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
            f4 = typedArrayRemoteActionCompatParcelizer.getFloat(6, f4);
        }
        this.RatingCompat = f4;
        float f5 = this.MediaSessionCompatResultReceiverWrapper;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
            f5 = typedArrayRemoteActionCompatParcelizer.getFloat(7, f5);
        }
        this.MediaSessionCompatResultReceiverWrapper = f5;
        String string = typedArrayRemoteActionCompatParcelizer.getString(0);
        if (string != null) {
            this.IconCompatParcelizer = string;
        }
        RemoteActionCompatParcelizer();
        typedArrayRemoteActionCompatParcelizer.recycle();
    }

    @Override // o.accessgetNegativeInfinitycp
    public final boolean read() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.write;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((accessgetNegativeInfinitycp) arrayList.get(i)).read()) {
                return true;
            }
            i++;
        }
    }

    @Override // o.accessgetNegativeInfinitycp
    public final boolean serializer(int[] iArr) {
        int i = 0;
        boolean zSerializer = false;
        while (true) {
            ArrayList arrayList = this.write;
            if (i >= arrayList.size()) {
                return zSerializer;
            }
            zSerializer |= ((accessgetNegativeInfinitycp) arrayList.get(i)).serializer(iArr);
            i++;
        }
    }

    public accessgetMinValuecp(accessgetMinValuecp accessgetminvaluecp, ImageKt imageKt) {
        accessgetNaNcp accessgetepsiloncp;
        this.MediaBrowserCompatMediaItem = new android.graphics.Matrix();
        this.write = new ArrayList();
        this.MediaSessionCompatQueueItem = 0.0f;
        this.serializer = 0.0f;
        this.read = 0.0f;
        this.MediaMetadataCompat = 1.0f;
        this.MediaDescriptionCompat = 1.0f;
        this.RatingCompat = 0.0f;
        this.MediaSessionCompatResultReceiverWrapper = 0.0f;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.RemoteActionCompatParcelizer = matrix;
        this.IconCompatParcelizer = null;
        this.MediaSessionCompatQueueItem = accessgetminvaluecp.MediaSessionCompatQueueItem;
        this.serializer = accessgetminvaluecp.serializer;
        this.read = accessgetminvaluecp.read;
        this.MediaMetadataCompat = accessgetminvaluecp.MediaMetadataCompat;
        this.MediaDescriptionCompat = accessgetminvaluecp.MediaDescriptionCompat;
        this.RatingCompat = accessgetminvaluecp.RatingCompat;
        this.MediaSessionCompatResultReceiverWrapper = accessgetminvaluecp.MediaSessionCompatResultReceiverWrapper;
        String str = accessgetminvaluecp.IconCompatParcelizer;
        this.IconCompatParcelizer = str;
        if (str != null) {
            imageKt.put(str, this);
        }
        matrix.set(accessgetminvaluecp.RemoteActionCompatParcelizer);
        ArrayList arrayList = accessgetminvaluecp.write;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof accessgetMinValuecp) {
                this.write.add(new accessgetMinValuecp((accessgetMinValuecp) obj, imageKt));
            } else {
                if (obj instanceof absoluteValueslo4al4) {
                    absoluteValueslo4al4 absolutevalueslo4al4 = (absoluteValueslo4al4) obj;
                    absoluteValueslo4al4 absolutevalueslo4al5 = new absoluteValueslo4al4(absolutevalueslo4al4);
                    absolutevalueslo4al5.MediaMetadataCompat = 0.0f;
                    absolutevalueslo4al5.IconCompatParcelizer = 1.0f;
                    absolutevalueslo4al5.read = 1.0f;
                    absolutevalueslo4al5.ParcelableVolumeInfo = 0.0f;
                    absolutevalueslo4al5.MediaSessionCompatQueueItem = 1.0f;
                    absolutevalueslo4al5.RatingCompat = 0.0f;
                    absolutevalueslo4al5.serializer = android.graphics.Paint.Cap.BUTT;
                    absolutevalueslo4al5.MediaBrowserCompatMediaItem = android.graphics.Paint.Join.MITER;
                    absolutevalueslo4al5.MediaDescriptionCompat = 4.0f;
                    absolutevalueslo4al5.RemoteActionCompatParcelizer = absolutevalueslo4al4.RemoteActionCompatParcelizer;
                    absolutevalueslo4al5.MediaMetadataCompat = absolutevalueslo4al4.MediaMetadataCompat;
                    absolutevalueslo4al5.IconCompatParcelizer = absolutevalueslo4al4.IconCompatParcelizer;
                    absolutevalueslo4al5.write = absolutevalueslo4al4.write;
                    absolutevalueslo4al5.MediaSessionCompatResultReceiverWrapper = absolutevalueslo4al4.MediaSessionCompatResultReceiverWrapper;
                    absolutevalueslo4al5.read = absolutevalueslo4al4.read;
                    absolutevalueslo4al5.ParcelableVolumeInfo = absolutevalueslo4al4.ParcelableVolumeInfo;
                    absolutevalueslo4al5.MediaSessionCompatQueueItem = absolutevalueslo4al4.MediaSessionCompatQueueItem;
                    absolutevalueslo4al5.RatingCompat = absolutevalueslo4al4.RatingCompat;
                    absolutevalueslo4al5.serializer = absolutevalueslo4al4.serializer;
                    absolutevalueslo4al5.MediaBrowserCompatMediaItem = absolutevalueslo4al4.MediaBrowserCompatMediaItem;
                    absolutevalueslo4al5.MediaDescriptionCompat = absolutevalueslo4al4.MediaDescriptionCompat;
                    accessgetepsiloncp = absolutevalueslo4al5;
                } else {
                    if (!(obj instanceof accessgetEpsiloncp)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Unknown object in the tree!");
                        throw null;
                    }
                    accessgetepsiloncp = new accessgetEpsiloncp((accessgetEpsiloncp) obj);
                }
                this.write.add(accessgetepsiloncp);
                Object obj2 = accessgetepsiloncp.PlaybackStateCompatCustomAction;
                if (obj2 != null) {
                    imageKt.put(obj2, accessgetepsiloncp);
                }
            }
        }
    }

    public void setPivotX(float f) {
        if (f != this.serializer) {
            this.serializer = f;
            RemoteActionCompatParcelizer();
        }
    }

    public void setPivotY(float f) {
        if (f != this.read) {
            this.read = f;
            RemoteActionCompatParcelizer();
        }
    }

    public void setRotation(float f) {
        if (f != this.MediaSessionCompatQueueItem) {
            this.MediaSessionCompatQueueItem = f;
            RemoteActionCompatParcelizer();
        }
    }

    public void setScaleX(float f) {
        if (f != this.MediaMetadataCompat) {
            this.MediaMetadataCompat = f;
            RemoteActionCompatParcelizer();
        }
    }

    public void setScaleY(float f) {
        if (f != this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = f;
            RemoteActionCompatParcelizer();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.RatingCompat) {
            this.RatingCompat = f;
            RemoteActionCompatParcelizer();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.MediaSessionCompatResultReceiverWrapper) {
            this.MediaSessionCompatResultReceiverWrapper = f;
            RemoteActionCompatParcelizer();
        }
    }

    public accessgetMinValuecp() {
        this.MediaBrowserCompatMediaItem = new android.graphics.Matrix();
        this.write = new ArrayList();
        this.MediaSessionCompatQueueItem = 0.0f;
        this.serializer = 0.0f;
        this.read = 0.0f;
        this.MediaMetadataCompat = 1.0f;
        this.MediaDescriptionCompat = 1.0f;
        this.RatingCompat = 0.0f;
        this.MediaSessionCompatResultReceiverWrapper = 0.0f;
        this.RemoteActionCompatParcelizer = new android.graphics.Matrix();
        this.IconCompatParcelizer = null;
    }
}
