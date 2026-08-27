package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Objects;
import o.div7Ah8Wj8;
import o.isInfiniteannotations;
import o.timesd16Qtg0;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new FragmentState.AnonymousClass1(1);
    public final int IconCompatParcelizer;
    public final int[] MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final ArrayList MediaMetadataCompat;
    public final int[] MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatResultReceiverWrapper;
    public final ArrayList MediaSessionCompatToken;
    public final int ParcelableVolumeInfo;
    public final ArrayList PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public final int[] RemoteActionCompatParcelizer;
    public final int read;
    public final CharSequence serializer;
    public final CharSequence write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final isInfiniteannotations RemoteActionCompatParcelizer(div7Ah8Wj8 div7ah8wj8) {
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(div7ah8wj8);
        read(isinfiniteannotations);
        isinfiniteannotations.MediaSessionCompatToken = this.RatingCompat;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.MediaMetadataCompat;
            if (i >= arrayList.size()) {
                isinfiniteannotations.serializer(1);
                return isinfiniteannotations;
            }
            String str = (String) arrayList.get(i);
            if (str != null) {
                ((timesd16Qtg0) isinfiniteannotations.MediaSessionCompatResultReceiverWrapper.get(i)).serializer = div7ah8wj8.PlaybackStateCompatCustomAction.IconCompatParcelizer(str);
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.MediaBrowserCompatMediaItem);
        parcel.writeStringList(this.MediaMetadataCompat);
        parcel.writeIntArray(this.MediaSessionCompatQueueItem);
        parcel.writeIntArray(this.RemoteActionCompatParcelizer);
        parcel.writeInt(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeInt(this.RatingCompat);
        parcel.writeInt(this.read);
        TextUtils.writeToParcel(this.write, parcel, 0);
        parcel.writeInt(this.IconCompatParcelizer);
        TextUtils.writeToParcel(this.serializer, parcel, 0);
        parcel.writeStringList(this.PlaybackStateCompatCustomAction);
        parcel.writeStringList(this.MediaSessionCompatToken);
        parcel.writeInt(this.MediaSessionCompatResultReceiverWrapper ? 1 : 0);
    }

    public BackStackRecordState(isInfiniteannotations isinfiniteannotations) {
        int size = isinfiniteannotations.MediaSessionCompatResultReceiverWrapper.size();
        this.MediaBrowserCompatMediaItem = new int[size * 6];
        if (!isinfiniteannotations.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Not on back stack");
            throw null;
        }
        this.MediaMetadataCompat = new ArrayList(size);
        this.MediaSessionCompatQueueItem = new int[size];
        this.RemoteActionCompatParcelizer = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            timesd16Qtg0 timesd16qtg0 = (timesd16Qtg0) isinfiniteannotations.MediaSessionCompatResultReceiverWrapper.get(i);
            this.MediaBrowserCompatMediaItem[i2] = timesd16qtg0.RemoteActionCompatParcelizer;
            ArrayList arrayList = this.MediaMetadataCompat;
            Fragment fragment = timesd16qtg0.serializer;
            arrayList.add(fragment != null ? fragment.getViewModelStore : null);
            int[] iArr = this.MediaBrowserCompatMediaItem;
            iArr[i2 + 1] = timesd16qtg0.MediaDescriptionCompat ? 1 : 0;
            iArr[i2 + 2] = timesd16qtg0.write;
            iArr[i2 + 3] = timesd16qtg0.read;
            iArr[i2 + 4] = timesd16qtg0.RatingCompat;
            iArr[i2 + 5] = timesd16qtg0.MediaBrowserCompatMediaItem;
            this.MediaSessionCompatQueueItem[i] = timesd16qtg0.MediaSessionCompatQueueItem.ordinal();
            this.RemoteActionCompatParcelizer[i] = timesd16qtg0.IconCompatParcelizer.ordinal();
            i++;
            i2 += 6;
        }
        this.ParcelableVolumeInfo = isinfiniteannotations.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        this.MediaDescriptionCompat = isinfiniteannotations.ParcelableVolumeInfo;
        this.RatingCompat = isinfiniteannotations.MediaSessionCompatToken;
        this.read = isinfiniteannotations.RatingCompat;
        this.write = isinfiniteannotations.MediaBrowserCompatMediaItem;
        this.IconCompatParcelizer = isinfiniteannotations.serializer;
        this.serializer = isinfiniteannotations.RemoteActionCompatParcelizer;
        this.PlaybackStateCompatCustomAction = isinfiniteannotations.ResultReceiver;
        this.MediaSessionCompatToken = isinfiniteannotations.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        this.MediaSessionCompatResultReceiverWrapper = isinfiniteannotations.ComponentActivity;
    }

    public final void read(isInfiniteannotations isinfiniteannotations) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.MediaBrowserCompatMediaItem;
            boolean z = true;
            if (i < iArr.length) {
                timesd16Qtg0 timesd16qtg0 = new timesd16Qtg0();
                int i3 = i + 1;
                timesd16qtg0.RemoteActionCompatParcelizer = iArr[i];
                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                    Objects.toString(isinfiniteannotations);
                    int i4 = iArr[i3];
                }
                timesd16qtg0.MediaSessionCompatQueueItem = toColorLong8_81llA.values()[this.MediaSessionCompatQueueItem[i2]];
                timesd16qtg0.IconCompatParcelizer = toColorLong8_81llA.values()[this.RemoteActionCompatParcelizer[i2]];
                if (iArr[i3] == 0) {
                    z = false;
                }
                timesd16qtg0.MediaDescriptionCompat = z;
                int i5 = iArr[i + 2];
                timesd16qtg0.write = i5;
                int i6 = iArr[i + 3];
                timesd16qtg0.read = i6;
                int i7 = iArr[i + 4];
                timesd16qtg0.RatingCompat = i7;
                int i8 = i + 6;
                int i9 = iArr[i + 5];
                timesd16qtg0.MediaBrowserCompatMediaItem = i9;
                isinfiniteannotations.MediaDescriptionCompat = i5;
                isinfiniteannotations.PlaybackStateCompat = i6;
                isinfiniteannotations.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i7;
                isinfiniteannotations.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i9;
                isinfiniteannotations.IconCompatParcelizer(timesd16qtg0);
                i2++;
                i = i8;
            } else {
                isinfiniteannotations.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = this.ParcelableVolumeInfo;
                isinfiniteannotations.ParcelableVolumeInfo = this.MediaDescriptionCompat;
                isinfiniteannotations.write = true;
                isinfiniteannotations.RatingCompat = this.read;
                isinfiniteannotations.MediaBrowserCompatMediaItem = this.write;
                isinfiniteannotations.serializer = this.IconCompatParcelizer;
                isinfiniteannotations.RemoteActionCompatParcelizer = this.serializer;
                isinfiniteannotations.ResultReceiver = this.PlaybackStateCompatCustomAction;
                isinfiniteannotations.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = this.MediaSessionCompatToken;
                isinfiniteannotations.ComponentActivity = this.MediaSessionCompatResultReceiverWrapper;
                return;
            }
        }
    }

    public BackStackRecordState(Parcel parcel) {
        this.MediaBrowserCompatMediaItem = parcel.createIntArray();
        this.MediaMetadataCompat = parcel.createStringArrayList();
        this.MediaSessionCompatQueueItem = parcel.createIntArray();
        this.RemoteActionCompatParcelizer = parcel.createIntArray();
        this.ParcelableVolumeInfo = parcel.readInt();
        this.MediaDescriptionCompat = parcel.readString();
        this.RatingCompat = parcel.readInt();
        this.read = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.write = (CharSequence) creator.createFromParcel(parcel);
        this.IconCompatParcelizer = parcel.readInt();
        this.serializer = (CharSequence) creator.createFromParcel(parcel);
        this.PlaybackStateCompatCustomAction = parcel.createStringArrayList();
        this.MediaSessionCompatToken = parcel.createStringArrayList();
        this.MediaSessionCompatResultReceiverWrapper = parcel.readInt() != 0;
    }
}
