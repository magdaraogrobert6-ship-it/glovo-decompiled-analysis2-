package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.common.api.zzd;
import java.util.ArrayList;
import o.PlaybackStateCompatCustomAction;
import o.onBackPressedDispatcher_delegatelambda010;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new zzd(9);
    public final long IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final float MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final Bundle MediaSessionCompatQueueItem;
    public final long MediaSessionCompatResultReceiverWrapper;
    public final CharSequence RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final int read;
    public final ArrayList serializer;
    public final long write;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new PlaybackStateCompatCustomAction();
        public final CharSequence RemoteActionCompatParcelizer;
        public final Bundle read;
        public final int serializer;
        public final String write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.write);
            TextUtils.writeToParcel(this.RemoteActionCompatParcelizer, parcel, i);
            parcel.writeInt(this.serializer);
            parcel.writeBundle(this.read);
        }

        public CustomAction(Parcel parcel) {
            this.write = parcel.readString();
            this.RemoteActionCompatParcelizer = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.serializer = parcel.readInt();
            this.read = parcel.readBundle(onBackPressedDispatcher_delegatelambda010.class.getClassLoader());
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.RemoteActionCompatParcelizer) + ", mIcon=" + this.serializer + ", mExtras=" + this.read;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaBrowserCompatMediaItem);
        parcel.writeLong(this.MediaMetadataCompat);
        parcel.writeFloat(this.MediaDescriptionCompat);
        parcel.writeLong(this.MediaSessionCompatResultReceiverWrapper);
        parcel.writeLong(this.IconCompatParcelizer);
        parcel.writeLong(this.write);
        TextUtils.writeToParcel(this.RatingCompat, parcel, i);
        parcel.writeTypedList(this.serializer);
        parcel.writeLong(this.RemoteActionCompatParcelizer);
        parcel.writeBundle(this.MediaSessionCompatQueueItem);
        parcel.writeInt(this.read);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.MediaBrowserCompatMediaItem = parcel.readInt();
        this.MediaMetadataCompat = parcel.readLong();
        this.MediaDescriptionCompat = parcel.readFloat();
        this.MediaSessionCompatResultReceiverWrapper = parcel.readLong();
        this.IconCompatParcelizer = parcel.readLong();
        this.write = parcel.readLong();
        this.RatingCompat = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.serializer = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.RemoteActionCompatParcelizer = parcel.readLong();
        this.MediaSessionCompatQueueItem = parcel.readBundle(onBackPressedDispatcher_delegatelambda010.class.getClassLoader());
        this.read = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", position=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", buffered position=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", speed=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", updated=");
        sb.append(this.MediaSessionCompatResultReceiverWrapper);
        sb.append(", actions=");
        sb.append(this.write);
        sb.append(", error code=");
        sb.append(this.read);
        sb.append(", error message=");
        sb.append(this.RatingCompat);
        sb.append(", custom actions=");
        sb.append(this.serializer);
        sb.append(", active item id=");
        return c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "}", sb);
    }
}
