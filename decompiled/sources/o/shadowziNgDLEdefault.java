package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class shadowziNgDLEdefault {
    public static final SparseIntArray RemoteActionCompatParcelizer;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public float RatingCompat;
    public int read;
    public float serializer;
    public int write;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        RemoteActionCompatParcelizer = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BeyondBoundsLayoutKt.Motion);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (RemoteActionCompatParcelizer.get(index)) {
                case 1:
                    this.RatingCompat = typedArrayObtainStyledAttributes.getFloat(index, this.RatingCompat);
                    break;
                case 2:
                    this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInt(index, this.IconCompatParcelizer);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = accesstoDpGaN1DYAjd.RemoteActionCompatParcelizer[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.read = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.read);
                    break;
                case 6:
                    this.write = typedArrayObtainStyledAttributes.getInteger(index, this.write);
                    break;
                case 7:
                    this.serializer = typedArrayObtainStyledAttributes.getFloat(index, this.serializer);
                    break;
                case 8:
                    this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getInteger(index, this.MediaBrowserCompatMediaItem);
                    break;
                case 9:
                    this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getFloat(index, this.MediaDescriptionCompat);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.MediaMetadataCompat = string;
                        if (string.indexOf("/") > 0) {
                            this.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.MediaSessionCompatQueueItem);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
