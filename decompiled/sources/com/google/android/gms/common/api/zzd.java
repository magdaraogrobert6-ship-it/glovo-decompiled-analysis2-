package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.versionedparcelable.ParcelImpl;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.zzd;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import o.ComponentActivity;
import o.MediaSessionCompatToken;
import o.onBackPressedDispatcher_delegatelambda010;
import o.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd implements Parcelable.Creator {
    public final /* synthetic */ int write;

    public /* synthetic */ zzd(int i) {
        this.write = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri uri;
        Bundle bundle;
        int iPlaybackStateCompatCustomAction = 0;
        boolean zMediaSessionCompatQueueItem = false;
        boolean zMediaSessionCompatQueueItem2 = false;
        int iPlaybackStateCompatCustomAction2 = 0;
        int iPlaybackStateCompatCustomAction3 = 0;
        int iPlaybackStateCompatCustomAction4 = 0;
        int iPlaybackStateCompatCustomAction5 = 0;
        String strSerializer = null;
        PendingIntent pendingIntent = null;
        ArrayList arrayListWrite = null;
        Account account = null;
        ArrayList arrayListWrite2 = null;
        String strSerializer2 = null;
        GoogleSignInAccount googleSignInAccount = null;
        ArrayList arrayListWrite3 = null;
        String strSerializer3 = null;
        Bundle bundleIconCompatParcelizer = null;
        MediaSessionCompatToken mediaSessionCompatToken = null;
        switch (this.write) {
            case 0:
                int iWrite = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    } else if (c != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                    } else {
                        strSerializer = UrlUtils.serializer(parcel, i);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
                return new Scope(iPlaybackStateCompatCustomAction, strSerializer);
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new zzd(1);
                    public final MediaDescriptionCompat read;
                    public final int serializer;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i2) {
                        parcel2.writeInt(this.serializer);
                        this.read.writeToParcel(parcel2, i2);
                    }

                    {
                        this.serializer = parcel.readInt();
                        this.read = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.serializer + ", mDescription=" + this.read + '}';
                    }
                };
            case 2:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(onBackPressedDispatcher_delegatelambda010.class.getClassLoader());
                    uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    uri = null;
                }
                if (uri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri != null ? uri : mediaDescription.getMediaUri());
                mediaDescriptionCompat.IconCompatParcelizer = objCreateFromParcel;
                return mediaDescriptionCompat;
            case 3:
                return new MediaMetadataCompat(parcel);
            case 4:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 5:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new zzd(5);
                    public final long IconCompatParcelizer;
                    public final MediaDescriptionCompat serializer;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i2) {
                        this.serializer.writeToParcel(parcel2, i2);
                        parcel2.writeLong(this.IconCompatParcelizer);
                    }

                    {
                        this.serializer = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.IconCompatParcelizer = parcel.readLong();
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb.append(this.serializer);
                        sb.append(", Id=");
                        return c8$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, " }", sb);
                    }
                };
            case 6:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.serializer = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 7:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new zzd(7);
                    public final Object write;

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i2) {
                        parcel2.writeParcelable((Parcelable) this.write, i2);
                    }

                    {
                        this.write = parcelable;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).write;
                        Object obj3 = this.write;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.write;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }
                };
            case 8:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.read = parcel.readInt();
                parcelableVolumeInfo.write = parcel.readInt();
                parcelableVolumeInfo.RemoteActionCompatParcelizer = parcel.readInt();
                parcelableVolumeInfo.serializer = parcel.readInt();
                parcelableVolumeInfo.IconCompatParcelizer = parcel.readInt();
                return parcelableVolumeInfo;
            case 9:
                return new PlaybackStateCompat(parcel);
            case 10:
                android.support.v4.os.ResultReceiver resultReceiver = new android.support.v4.os.ResultReceiver();
                IBinder strongBinder = parcel.readStrongBinder();
                int i2 = ComponentActivity.serializer;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(MediaSessionCompatToken.IconCompatParcelizer);
                    if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof MediaSessionCompatToken)) {
                        mediaSessionCompatToken = (MediaSessionCompatToken) iInterfaceQueryLocalInterface;
                    } else {
                        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = new r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                        r8lambda7ijbvrn0shyidcazufwejfc7yy.serializer = strongBinder;
                        mediaSessionCompatToken = r8lambda7ijbvrn0shyidcazufwejfc7yy;
                    }
                }
                resultReceiver.RemoteActionCompatParcelizer = mediaSessionCompatToken;
                return resultReceiver;
            case 11:
                parcel.getClass();
                return new ActivityResult(parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            case 12:
                parcel.getClass();
                Parcelable parcelable2 = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable2.getClass();
                return new IntentSenderRequest((IntentSender) parcelable2, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 13:
                return new ParcelImpl(parcel);
            case 14:
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(0, 0);
                layoutParams.RatingCompat = 1;
                layoutParams.serializer = 0.0f;
                layoutParams.read = 1.0f;
                layoutParams.write = -1;
                layoutParams.RemoteActionCompatParcelizer = -1.0f;
                layoutParams.MediaBrowserCompatMediaItem = -1;
                layoutParams.MediaMetadataCompat = -1;
                layoutParams.MediaSessionCompatQueueItem = 16777215;
                layoutParams.IconCompatParcelizer = 16777215;
                layoutParams.RatingCompat = parcel.readInt();
                layoutParams.serializer = parcel.readFloat();
                layoutParams.read = parcel.readFloat();
                layoutParams.write = parcel.readInt();
                layoutParams.RemoteActionCompatParcelizer = parcel.readFloat();
                layoutParams.MediaBrowserCompatMediaItem = parcel.readInt();
                layoutParams.MediaMetadataCompat = parcel.readInt();
                layoutParams.MediaSessionCompatQueueItem = parcel.readInt();
                layoutParams.IconCompatParcelizer = parcel.readInt();
                layoutParams.MediaDescriptionCompat = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            case 15:
                int iWrite2 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction6 = 0;
                while (parcel.dataPosition() < iWrite2) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        iPlaybackStateCompatCustomAction5 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i3);
                    } else if (c2 == 2) {
                        iPlaybackStateCompatCustomAction6 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i3);
                    } else if (c2 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i3);
                    } else {
                        bundleIconCompatParcelizer = UrlUtils.IconCompatParcelizer(parcel, i3);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite2)});
                return new GoogleSignInOptionsExtensionParcelable(iPlaybackStateCompatCustomAction5, iPlaybackStateCompatCustomAction6, bundleIconCompatParcelizer);
            case 16:
                int iWrite3 = UrlUtils.write(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iWrite3) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 2) {
                        strSerializer3 = UrlUtils.serializer(parcel, i4);
                    } else if (c3 != 5) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i4);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) UrlUtils.read(parcel, i4, GoogleSignInOptions.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite3)});
                return new SignInConfiguration(strSerializer3, googleSignInOptions);
            case 17:
                int iWrite4 = UrlUtils.write(parcel);
                long jPlaybackStateCompat = 0;
                String strSerializer4 = null;
                String strSerializer5 = null;
                String strSerializer6 = null;
                String strSerializer7 = null;
                Uri uri2 = null;
                String strSerializer8 = null;
                String strSerializer9 = null;
                ArrayList arrayListWrite4 = null;
                String strSerializer10 = null;
                String strSerializer11 = null;
                while (parcel.dataPosition() < iWrite4) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 2:
                            strSerializer4 = UrlUtils.serializer(parcel, i5);
                            break;
                        case 3:
                            strSerializer5 = UrlUtils.serializer(parcel, i5);
                            break;
                        case 4:
                            strSerializer6 = UrlUtils.serializer(parcel, i5);
                            break;
                        case 5:
                            strSerializer7 = UrlUtils.serializer(parcel, i5);
                            break;
                        case 6:
                            uri2 = (Uri) UrlUtils.read(parcel, i5, Uri.CREATOR);
                            break;
                        case 7:
                            strSerializer8 = UrlUtils.serializer(parcel, i5);
                            break;
                        case '\b':
                            jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i5);
                            break;
                        case '\t':
                            strSerializer9 = UrlUtils.serializer(parcel, i5);
                            break;
                        case '\n':
                            arrayListWrite4 = UrlUtils.write(parcel, i5, Scope.CREATOR);
                            break;
                        case 11:
                            strSerializer10 = UrlUtils.serializer(parcel, i5);
                            break;
                        case '\f':
                            strSerializer11 = UrlUtils.serializer(parcel, i5);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i5);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite4)});
                return new GoogleSignInAccount(strSerializer4, strSerializer5, strSerializer6, strSerializer7, uri2, strSerializer8, jPlaybackStateCompat, strSerializer9, arrayListWrite4, strSerializer10, strSerializer11);
            case 18:
                int iWrite5 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction7 = 0;
                boolean zMediaSessionCompatQueueItem3 = false;
                boolean zMediaSessionCompatQueueItem4 = false;
                boolean zMediaSessionCompatQueueItem5 = false;
                ArrayList arrayListWrite5 = null;
                Account account2 = null;
                String strSerializer12 = null;
                String strSerializer13 = null;
                String strSerializer14 = null;
                while (parcel.dataPosition() < iWrite5) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            iPlaybackStateCompatCustomAction7 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i6);
                            break;
                        case 2:
                            arrayListWrite5 = UrlUtils.write(parcel, i6, Scope.CREATOR);
                            break;
                        case 3:
                            account2 = (Account) UrlUtils.read(parcel, i6, Account.CREATOR);
                            break;
                        case 4:
                            zMediaSessionCompatQueueItem3 = UrlUtils.MediaSessionCompatQueueItem(parcel, i6);
                            break;
                        case 5:
                            zMediaSessionCompatQueueItem4 = UrlUtils.MediaSessionCompatQueueItem(parcel, i6);
                            break;
                        case 6:
                            zMediaSessionCompatQueueItem5 = UrlUtils.MediaSessionCompatQueueItem(parcel, i6);
                            break;
                        case 7:
                            strSerializer12 = UrlUtils.serializer(parcel, i6);
                            break;
                        case '\b':
                            strSerializer13 = UrlUtils.serializer(parcel, i6);
                            break;
                        case '\t':
                            arrayListWrite3 = UrlUtils.write(parcel, i6, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case '\n':
                            strSerializer14 = UrlUtils.serializer(parcel, i6);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i6);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite5)});
                return new GoogleSignInOptions(iPlaybackStateCompatCustomAction7, arrayListWrite5, account2, zMediaSessionCompatQueueItem3, zMediaSessionCompatQueueItem4, zMediaSessionCompatQueueItem5, strSerializer12, strSerializer13, GoogleSignInOptions.read(arrayListWrite3), strSerializer14);
            case 19:
                int iWrite6 = UrlUtils.write(parcel);
                String strSerializer15 = "";
                String strSerializer16 = "";
                while (parcel.dataPosition() < iWrite6) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 4) {
                        strSerializer15 = UrlUtils.serializer(parcel, i7);
                    } else if (c4 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) UrlUtils.read(parcel, i7, GoogleSignInAccount.CREATOR);
                    } else if (c4 != '\b') {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i7);
                    } else {
                        strSerializer16 = UrlUtils.serializer(parcel, i7);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite6)});
                return new SignInAccount(strSerializer15, googleSignInAccount, strSerializer16);
            case 20:
                int iWrite7 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite7) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        iPlaybackStateCompatCustomAction4 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i8);
                    } else if (c5 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i8);
                    } else {
                        strSerializer2 = UrlUtils.serializer(parcel, i8);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite7)});
                return new ClientIdentity(iPlaybackStateCompatCustomAction4, strSerializer2);
            case 21:
                int iWrite8 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction8 = 0;
                boolean zMediaSessionCompatQueueItem6 = false;
                boolean zMediaSessionCompatQueueItem7 = false;
                IBinder iBinder = null;
                ConnectionResult connectionResult = null;
                while (parcel.dataPosition() < iWrite8) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        iPlaybackStateCompatCustomAction8 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i9);
                    } else if (c6 == 2) {
                        iBinder = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i9)});
                    } else if (c6 == 3) {
                        connectionResult = (ConnectionResult) UrlUtils.read(parcel, i9, ConnectionResult.CREATOR);
                    } else if (c6 == 4) {
                        zMediaSessionCompatQueueItem6 = UrlUtils.MediaSessionCompatQueueItem(parcel, i9);
                    } else if (c6 != 5) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i9);
                    } else {
                        zMediaSessionCompatQueueItem7 = UrlUtils.MediaSessionCompatQueueItem(parcel, i9);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite8)});
                return new zaaa(iPlaybackStateCompatCustomAction8, iBinder, connectionResult, zMediaSessionCompatQueueItem6, zMediaSessionCompatQueueItem7);
            case 22:
                int iWrite9 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite9) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        iPlaybackStateCompatCustomAction3 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    } else if (c7 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i10);
                    } else {
                        arrayListWrite2 = UrlUtils.write(parcel, i10, MethodInvocation.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite9)});
                return new TelemetryData(iPlaybackStateCompatCustomAction3, arrayListWrite2);
            case 23:
                int iWrite10 = UrlUtils.write(parcel);
                long jPlaybackStateCompat2 = 0;
                int iPlaybackStateCompatCustomAction9 = 0;
                int iPlaybackStateCompatCustomAction10 = 0;
                boolean zMediaSessionCompatQueueItem8 = false;
                String strSerializer17 = null;
                while (parcel.dataPosition() < iWrite10) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iPlaybackStateCompatCustomAction9 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i11);
                    } else if (c8 == 2) {
                        strSerializer17 = UrlUtils.serializer(parcel, i11);
                    } else if (c8 == 3) {
                        jPlaybackStateCompat2 = UrlUtils.PlaybackStateCompat(parcel, i11);
                    } else if (c8 == 4) {
                        iPlaybackStateCompatCustomAction10 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i11);
                    } else if (c8 != 5) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i11);
                    } else {
                        zMediaSessionCompatQueueItem8 = UrlUtils.MediaSessionCompatQueueItem(parcel, i11);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite10)});
                return new zab(iPlaybackStateCompatCustomAction9, iPlaybackStateCompatCustomAction10, jPlaybackStateCompat2, strSerializer17, zMediaSessionCompatQueueItem8);
            case 24:
                int iWrite11 = UrlUtils.write(parcel);
                long jPlaybackStateCompat3 = 0;
                long jPlaybackStateCompat4 = 0;
                int iPlaybackStateCompatCustomAction11 = -1;
                int iPlaybackStateCompatCustomAction12 = 0;
                int iPlaybackStateCompatCustomAction13 = 0;
                int iPlaybackStateCompatCustomAction14 = 0;
                int iPlaybackStateCompatCustomAction15 = 0;
                String strSerializer18 = null;
                String strSerializer19 = null;
                while (parcel.dataPosition() < iWrite11) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iPlaybackStateCompatCustomAction12 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i12);
                            break;
                        case 2:
                            iPlaybackStateCompatCustomAction13 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i12);
                            break;
                        case 3:
                            iPlaybackStateCompatCustomAction14 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i12);
                            break;
                        case 4:
                            jPlaybackStateCompat3 = UrlUtils.PlaybackStateCompat(parcel, i12);
                            break;
                        case 5:
                            jPlaybackStateCompat4 = UrlUtils.PlaybackStateCompat(parcel, i12);
                            break;
                        case 6:
                            strSerializer18 = UrlUtils.serializer(parcel, i12);
                            break;
                        case 7:
                            strSerializer19 = UrlUtils.serializer(parcel, i12);
                            break;
                        case '\b':
                            iPlaybackStateCompatCustomAction15 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i12);
                            break;
                        case '\t':
                            iPlaybackStateCompatCustomAction11 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i12);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i12);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite11)});
                return new MethodInvocation(iPlaybackStateCompatCustomAction12, iPlaybackStateCompatCustomAction13, iPlaybackStateCompatCustomAction14, jPlaybackStateCompat3, jPlaybackStateCompat4, strSerializer18, strSerializer19, iPlaybackStateCompatCustomAction15, iPlaybackStateCompatCustomAction11);
            case 25:
                int iWrite12 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction16 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < iWrite12) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        iPlaybackStateCompatCustomAction2 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i13);
                    } else if (c9 == 2) {
                        account = (Account) UrlUtils.read(parcel, i13, Account.CREATOR);
                    } else if (c9 == 3) {
                        iPlaybackStateCompatCustomAction16 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i13);
                    } else if (c9 != 4) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i13);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) UrlUtils.read(parcel, i13, GoogleSignInAccount.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite12)});
                return new zay(iPlaybackStateCompatCustomAction2, account, iPlaybackStateCompatCustomAction16, googleSignInAccount2);
            case 26:
                int iWrite13 = UrlUtils.write(parcel);
                boolean zMediaSessionCompatQueueItem9 = false;
                boolean zMediaSessionCompatQueueItem10 = false;
                int iPlaybackStateCompatCustomAction17 = 0;
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < iWrite13) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) UrlUtils.read(parcel, i14, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            zMediaSessionCompatQueueItem9 = UrlUtils.MediaSessionCompatQueueItem(parcel, i14);
                            break;
                        case 3:
                            zMediaSessionCompatQueueItem10 = UrlUtils.MediaSessionCompatQueueItem(parcel, i14);
                            break;
                        case 4:
                            iArr = UrlUtils.read(parcel, i14);
                            break;
                        case 5:
                            iPlaybackStateCompatCustomAction17 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i14);
                            break;
                        case 6:
                            iArr2 = UrlUtils.read(parcel, i14);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i14);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite13)});
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zMediaSessionCompatQueueItem9, zMediaSessionCompatQueueItem10, iArr, iPlaybackStateCompatCustomAction17, iArr2);
            case 27:
                int iWrite14 = UrlUtils.write(parcel);
                String strSerializer20 = null;
                String strSerializer21 = null;
                while (parcel.dataPosition() < iWrite14) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        arrayListWrite = UrlUtils.write(parcel, i15, Feature.CREATOR);
                    } else if (c10 == 2) {
                        zMediaSessionCompatQueueItem2 = UrlUtils.MediaSessionCompatQueueItem(parcel, i15);
                    } else if (c10 == 3) {
                        strSerializer20 = UrlUtils.serializer(parcel, i15);
                    } else if (c10 != 4) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i15);
                    } else {
                        strSerializer21 = UrlUtils.serializer(parcel, i15);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite14)});
                return new ApiFeatureRequest(arrayListWrite, zMediaSessionCompatQueueItem2, strSerializer20, strSerializer21);
            case 28:
                int iWrite15 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction18 = 0;
                while (parcel.dataPosition() < iWrite15) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i16);
                    } else if (c11 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i16);
                    } else {
                        iPlaybackStateCompatCustomAction18 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i16);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite15)});
                return new ModuleAvailabilityResponse(zMediaSessionCompatQueueItem, iPlaybackStateCompatCustomAction18);
            default:
                int iWrite16 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite16) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i17);
                    } else {
                        pendingIntent = (PendingIntent) UrlUtils.read(parcel, i17, PendingIntent.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite16)});
                return new ModuleInstallIntentResponse(pendingIntent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.write) {
            case 0:
                return new Scope[i];
            case 1:
                return new MediaBrowserCompat$MediaItem[i];
            case 2:
                return new MediaDescriptionCompat[i];
            case 3:
                return new MediaMetadataCompat[i];
            case 4:
                return new RatingCompat[i];
            case 5:
                return new MediaSessionCompat$QueueItem[i];
            case 6:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 7:
                return new MediaSessionCompat$Token[i];
            case 8:
                return new ParcelableVolumeInfo[i];
            case 9:
                return new PlaybackStateCompat[i];
            case 10:
                return new android.support.v4.os.ResultReceiver[i];
            case 11:
                return new ActivityResult[i];
            case 12:
                return new IntentSenderRequest[i];
            case 13:
                return new ParcelImpl[i];
            case 14:
                return new FlexboxLayout.LayoutParams[i];
            case 15:
                return new GoogleSignInOptionsExtensionParcelable[i];
            case 16:
                return new SignInConfiguration[i];
            case 17:
                return new GoogleSignInAccount[i];
            case 18:
                return new GoogleSignInOptions[i];
            case 19:
                return new SignInAccount[i];
            case 20:
                return new ClientIdentity[i];
            case 21:
                return new zaaa[i];
            case 22:
                return new TelemetryData[i];
            case 23:
                return new zab[i];
            case 24:
                return new MethodInvocation[i];
            case 25:
                return new zay[i];
            case 26:
                return new ConnectionTelemetryConfiguration[i];
            case 27:
                return new ApiFeatureRequest[i];
            case 28:
                return new ModuleAvailabilityResponse[i];
            default:
                return new ModuleInstallIntentResponse[i];
        }
    }
}
