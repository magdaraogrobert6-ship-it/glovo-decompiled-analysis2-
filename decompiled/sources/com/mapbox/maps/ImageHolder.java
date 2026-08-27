package com.mapbox.maps;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageHolder implements Parcelable {
    private final Bitmap bitmap;
    private final Integer drawableId;
    private final Image image;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ImageHolder> CREATOR = new Creator();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final Integer getDrawableId() {
        return this.drawableId;
    }

    public final Image getImage() {
        return this.image;
    }

    public static final ImageHolder from(int i) {
        return Companion.from(i);
    }

    public int hashCode() {
        return Objects.hash(this.drawableId, this.bitmap, this.image);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ImageHolder from(int i) {
            return new ImageHolder(Integer.valueOf(i), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ImageHolder from(Bitmap bitmap) {
            bitmap.getClass();
            return new ImageHolder(null, bitmap, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ImageHolder from(Image image) {
            image.getClass();
            return new ImageHolder(null, 0 == true ? 1 : 0, image, 0 == true ? 1 : 0);
        }
    }

    private ImageHolder(Integer num, Bitmap bitmap, Image image) {
        this.drawableId = num;
        this.bitmap = bitmap;
        this.image = image;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.getClass();
        Integer num = this.drawableId;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.bitmap, i);
        parcel.writeSerializable(this.image);
    }

    public static final class Creator implements Parcelable.Creator<ImageHolder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageHolder createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ImageHolder(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Bitmap) parcel.readParcelable(ImageHolder.class.getClassLoader()), (Image) parcel.readSerializable(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageHolder[] newArray(int i) {
            return new ImageHolder[i];
        }
    }

    public String toString() {
        return "ImageHolder(bitmap=" + this.bitmap + ", drawableId=" + this.drawableId + ", image=" + this.image + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ImageHolder.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ImageHolder imageHolder = (ImageHolder) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.drawableId, imageHolder.drawableId}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bitmap, imageHolder.bitmap}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.image, imageHolder.image}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final ImageHolder from(Bitmap bitmap) {
        return Companion.from(bitmap);
    }

    public static final ImageHolder from(Image image) {
        return Companion.from(image);
    }

    public /* synthetic */ ImageHolder(Integer num, Bitmap bitmap, Image image, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, bitmap, image);
    }
}
