package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import java.util.ArrayList;
import o.getMaxDimensionannotations;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new AnonymousClass1(0);
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final int MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final String PlaybackStateCompatCustomAction;
    public final boolean RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final boolean write;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentState$1, reason: invalid class name */
    public final class AnonymousClass1 implements Parcelable.Creator {
        public final /* synthetic */ int read;

        public /* synthetic */ AnonymousClass1(int i) {
            this.read = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            int i2 = this.read;
            if (i2 == 0) {
                return new FragmentState[i];
            }
            if (i2 == 1) {
                return new BackStackRecordState[i];
            }
            if (i2 != 2) {
                return i2 != 3 ? new FragmentManagerState[i] : new FragmentManager$LaunchedFragmentInfo[i];
            }
            return new BackStackState[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = this.read;
            if (i == 0) {
                return new FragmentState(parcel);
            }
            if (i == 1) {
                return new BackStackRecordState(parcel);
            }
            if (i == 2) {
                return new BackStackState(parcel);
            }
            if (i == 3) {
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.RemoteActionCompatParcelizer = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.serializer = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState(0);
            fragmentManagerState.MediaMetadataCompat = null;
            fragmentManagerState.read = new ArrayList();
            fragmentManagerState.MediaDescriptionCompat = new ArrayList();
            fragmentManagerState.serializer = parcel.createStringArrayList();
            fragmentManagerState.write = parcel.createStringArrayList();
            fragmentManagerState.RemoteActionCompatParcelizer = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
            fragmentManagerState.IconCompatParcelizer = parcel.readInt();
            fragmentManagerState.MediaMetadataCompat = parcel.readString();
            fragmentManagerState.read = parcel.createStringArrayList();
            fragmentManagerState.MediaDescriptionCompat = parcel.createTypedArrayList(BackStackState.CREATOR);
            fragmentManagerState.RatingCompat = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
            return fragmentManagerState;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Fragment RemoteActionCompatParcelizer(getMaxDimensionannotations getmaxdimensionannotations) {
        Fragment fragmentSerializer = getmaxdimensionannotations.serializer(this.serializer);
        fragmentSerializer.getViewModelStore = this.PlaybackStateCompat;
        fragmentSerializer._init_lambda1 = this.RemoteActionCompatParcelizer;
        fragmentSerializer.createFullyDrawnExecutor = this.MediaSessionCompatQueueItem;
        fragmentSerializer.addContentView = true;
        fragmentSerializer.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = this.read;
        fragmentSerializer.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = this.IconCompatParcelizer;
        fragmentSerializer.addOnUserLeaveHintListener = this.PlaybackStateCompatCustomAction;
        fragmentSerializer.onBackPressedDispatcher_delegatelambda00 = this.RatingCompat;
        fragmentSerializer.onBackPressedDispatcher_delegatelambda010 = this.MediaDescriptionCompat;
        fragmentSerializer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = this.write;
        fragmentSerializer._init_lambda2 = this.MediaMetadataCompat;
        fragmentSerializer.getSavedStateRegistryControllerannotations = toColorLong8_81llA.values()[this.MediaBrowserCompatMediaItem];
        fragmentSerializer.getDefaultViewModelProviderFactory = this.ParcelableVolumeInfo;
        fragmentSerializer.addOnPictureInPictureUiStateChangedListener = this.MediaSessionCompatResultReceiverWrapper;
        fragmentSerializer.getFullyDrawnReporter = this.MediaSessionCompatToken;
        return fragmentSerializer;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.serializer);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        parcel.writeInt(this.MediaSessionCompatQueueItem ? 1 : 0);
        parcel.writeInt(this.read);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeString(this.PlaybackStateCompatCustomAction);
        parcel.writeInt(this.RatingCompat ? 1 : 0);
        parcel.writeInt(this.MediaDescriptionCompat ? 1 : 0);
        parcel.writeInt(this.write ? 1 : 0);
        parcel.writeInt(this.MediaMetadataCompat ? 1 : 0);
        parcel.writeInt(this.MediaBrowserCompatMediaItem);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeInt(this.MediaSessionCompatResultReceiverWrapper);
        parcel.writeInt(this.MediaSessionCompatToken ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.serializer = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.RemoteActionCompatParcelizer = parcel.readInt() != 0;
        this.MediaSessionCompatQueueItem = parcel.readInt() != 0;
        this.read = parcel.readInt();
        this.IconCompatParcelizer = parcel.readInt();
        this.PlaybackStateCompatCustomAction = parcel.readString();
        this.RatingCompat = parcel.readInt() != 0;
        this.MediaDescriptionCompat = parcel.readInt() != 0;
        this.write = parcel.readInt() != 0;
        this.MediaMetadataCompat = parcel.readInt() != 0;
        this.MediaBrowserCompatMediaItem = parcel.readInt();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaSessionCompatResultReceiverWrapper = parcel.readInt();
        this.MediaSessionCompatToken = parcel.readInt() != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Fields.SpotShadowColor);
        sb.append("FragmentState{");
        sb.append(this.serializer);
        sb.append(" (");
        sb.append(this.PlaybackStateCompat);
        sb.append(")}:");
        if (this.RemoteActionCompatParcelizer) {
            sb.append(" fromLayout");
        }
        if (this.MediaSessionCompatQueueItem) {
            sb.append(" dynamicContainer");
        }
        int i = this.IconCompatParcelizer;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.PlaybackStateCompatCustomAction;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.RatingCompat) {
            sb.append(" retainInstance");
        }
        if (this.MediaDescriptionCompat) {
            sb.append(" removing");
        }
        if (this.write) {
            sb.append(" detached");
        }
        if (this.MediaMetadataCompat) {
            sb.append(" hidden");
        }
        String str2 = this.ParcelableVolumeInfo;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.MediaSessionCompatResultReceiverWrapper);
        }
        if (this.MediaSessionCompatToken) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    public FragmentState(Fragment fragment) {
        this.serializer = fragment.getClass().getName();
        this.PlaybackStateCompat = fragment.getViewModelStore;
        this.RemoteActionCompatParcelizer = fragment._init_lambda1;
        this.MediaSessionCompatQueueItem = fragment.createFullyDrawnExecutor;
        this.read = fragment.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        this.IconCompatParcelizer = fragment.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        this.PlaybackStateCompatCustomAction = fragment.addOnUserLeaveHintListener;
        this.RatingCompat = fragment.onBackPressedDispatcher_delegatelambda00;
        this.MediaDescriptionCompat = fragment.onBackPressedDispatcher_delegatelambda010;
        this.write = fragment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        this.MediaMetadataCompat = fragment._init_lambda2;
        this.MediaBrowserCompatMediaItem = fragment.getSavedStateRegistryControllerannotations.ordinal();
        this.ParcelableVolumeInfo = fragment.getDefaultViewModelProviderFactory;
        this.MediaSessionCompatResultReceiverWrapper = fragment.addOnPictureInPictureUiStateChangedListener;
        this.MediaSessionCompatToken = fragment.getFullyDrawnReporter;
    }
}
