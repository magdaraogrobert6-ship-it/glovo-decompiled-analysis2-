package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.zzd;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new zzd(2);
    public Object IconCompatParcelizer;
    public final CharSequence MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final Uri MediaSessionCompatQueueItem;
    public final CharSequence RatingCompat;
    public final Bitmap RemoteActionCompatParcelizer;
    public final Bundle read;
    public final Uri serializer;
    public final CharSequence write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.RatingCompat) + ", " + ((Object) this.MediaDescriptionCompat) + ", " + ((Object) this.write);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.MediaMetadataCompat = str;
        this.RatingCompat = charSequence;
        this.MediaDescriptionCompat = charSequence2;
        this.write = charSequence3;
        this.RemoteActionCompatParcelizer = bitmap;
        this.serializer = uri;
        this.read = bundle;
        this.MediaSessionCompatQueueItem = uri2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object objBuild = this.IconCompatParcelizer;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.MediaMetadataCompat);
            builder.setTitle(this.RatingCompat);
            builder.setSubtitle(this.MediaDescriptionCompat);
            builder.setDescription(this.write);
            builder.setIconBitmap(this.RemoteActionCompatParcelizer);
            builder.setIconUri(this.serializer);
            builder.setExtras(this.read);
            builder.setMediaUri(this.MediaSessionCompatQueueItem);
            objBuild = builder.build();
            this.IconCompatParcelizer = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
