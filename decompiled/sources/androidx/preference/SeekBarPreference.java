package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import com.logistics.rider.glovo.R;
import io.sentry.android.core.SentryLogcatAdapter;
import o.getEndY;
import o.getStartX;
import o.isQuadraticMonotonic;
import o.lineWinding;
import o.monotonicCubicWinding;

/* JADX INFO: loaded from: classes4.dex */
public class SeekBarPreference extends Preference {
    public int IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final lineWinding MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatToken;
    public final boolean ParcelableVolumeInfo;
    public TextView RatingCompat;
    public final getEndY RemoteActionCompatParcelizer;
    public SeekBar read;
    public final boolean serializer;
    public int write;

    @Override // androidx.preference.Preference
    public final Object write(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new monotonicCubicWinding();
        public int RemoteActionCompatParcelizer;
        public int read;
        public int serializer;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.serializer = parcel.readInt();
            this.read = parcel.readInt();
            this.RemoteActionCompatParcelizer = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.serializer);
            parcel.writeInt(this.read);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.RemoteActionCompatParcelizer = new getEndY(this);
        this.MediaSessionCompatQueueItem = new lineWinding(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, isQuadraticMonotonic.SeekBarPreference, R.attr.seekBarPreferenceStyle, 0);
        this.write = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.write;
        i = i < i2 ? i2 : i;
        if (i != this.IconCompatParcelizer) {
            this.IconCompatParcelizer = i;
            write();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = Math.min(this.IconCompatParcelizer - this.write, Math.abs(i3));
            write();
        }
        this.serializer = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.ParcelableVolumeInfo = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Parcelable IconCompatParcelizer() {
        super.IconCompatParcelizer();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.fullyDrawnReporter_delegatelambda00) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.serializer = this.MediaMetadataCompat;
        savedState.read = this.write;
        savedState.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void serializer(getStartX getstartx) {
        super.serializer(getstartx);
        getstartx.MediaSessionCompatQueueItem.setOnKeyListener(this.MediaSessionCompatQueueItem);
        this.read = (SeekBar) getstartx.IconCompatParcelizer(R.id.seekbar);
        TextView textView = (TextView) getstartx.IconCompatParcelizer(R.id.seekbar_value);
        this.RatingCompat = textView;
        if (this.MediaBrowserCompatMediaItem) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.RatingCompat = null;
        }
        SeekBar seekBar = this.read;
        if (seekBar == null) {
            SentryLogcatAdapter.serializer("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.RemoteActionCompatParcelizer);
        this.read.setMax(this.IconCompatParcelizer - this.write);
        int i = this.MediaDescriptionCompat;
        SeekBar seekBar2 = this.read;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.MediaDescriptionCompat = seekBar2.getKeyProgressIncrement();
        }
        this.read.setProgress(this.MediaMetadataCompat - this.write);
        int i2 = this.MediaMetadataCompat;
        TextView textView2 = this.RatingCompat;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.read.setEnabled(MediaMetadataCompat());
    }

    public final void serializer(int i, boolean z) {
        int i2 = this.write;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.IconCompatParcelizer;
        if (i > i3) {
            i = i3;
        }
        if (i != this.MediaMetadataCompat) {
            this.MediaMetadataCompat = i;
            TextView textView = this.RatingCompat;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (MediaBrowserCompatMediaItem()) {
                int i4 = ~i;
                boolean zMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
                String str = this.accessensureViewModelStore;
                if (zMediaBrowserCompatMediaItem) {
                    i4 = this.fullyDrawnReporter_delegatelambda0.IconCompatParcelizer().getInt(str, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor editor = this.fullyDrawnReporter_delegatelambda0.read();
                    editor.putInt(str, i);
                    if (!this.fullyDrawnReporter_delegatelambda0.serializer) {
                        editor.apply();
                    }
                }
            }
            if (z) {
                write();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void read(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.read(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.read(savedState.getSuperState());
        this.MediaMetadataCompat = savedState.serializer;
        this.write = savedState.read;
        this.IconCompatParcelizer = savedState.RemoteActionCompatParcelizer;
        write();
    }
}
