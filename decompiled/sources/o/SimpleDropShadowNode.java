package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleDropShadowNode {
    public static final SparseIntArray read;
    public float IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public float MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public float MediaSessionCompatResultReceiverWrapper;
    public float MediaSessionCompatToken;
    public float PlaybackStateCompat;
    public float PlaybackStateCompatCustomAction;
    public float RatingCompat;
    public float RemoteActionCompatParcelizer;
    public float serializer;
    public boolean write;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        read = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void serializer(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BeyondBoundsLayoutKt.Transform);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (read.get(index)) {
                case 1:
                    this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.RemoteActionCompatParcelizer);
                    break;
                case 2:
                    this.serializer = typedArrayObtainStyledAttributes.getFloat(index, this.serializer);
                    break;
                case 3:
                    this.RatingCompat = typedArrayObtainStyledAttributes.getFloat(index, this.RatingCompat);
                    break;
                case 4:
                    this.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getFloat(index, this.MediaSessionCompatQueueItem);
                    break;
                case 5:
                    this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getFloat(index, this.MediaDescriptionCompat);
                    break;
                case 6:
                    this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getDimension(index, this.MediaMetadataCompat);
                    break;
                case 7:
                    this.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getDimension(index, this.PlaybackStateCompatCustomAction);
                    break;
                case 8:
                    this.PlaybackStateCompat = typedArrayObtainStyledAttributes.getDimension(index, this.PlaybackStateCompat);
                    break;
                case 9:
                    this.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getDimension(index, this.MediaSessionCompatToken);
                    break;
                case 10:
                    this.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getDimension(index, this.MediaSessionCompatResultReceiverWrapper);
                    break;
                case 11:
                    this.write = true;
                    this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimension(index, this.IconCompatParcelizer);
                    break;
                case 12:
                    this.MediaBrowserCompatMediaItem = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.MediaBrowserCompatMediaItem);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
