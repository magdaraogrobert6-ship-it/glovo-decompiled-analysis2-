package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import io.sentry.android.core.SentryLogcatAdapter;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes4.dex */
public final class setGroupDividerEnabled implements initialize, DialogInterface.OnClickListener {
    public removeOnContextAvailableListener IconCompatParcelizer;
    public setForceShowIcon RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner read;
    public CharSequence serializer;

    @Override // o.initialize
    public final Drawable IconCompatParcelizer() {
        return null;
    }

    @Override // o.initialize
    public final int MediaBrowserCompatMediaItem() {
        return 0;
    }

    @Override // o.initialize
    public final CharSequence read() {
        return this.serializer;
    }

    @Override // o.initialize
    public final void read(CharSequence charSequence) {
        this.serializer = charSequence;
    }

    @Override // o.initialize
    public final int write() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = this.read;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i, this.RemoteActionCompatParcelizer.getItemId(i));
        }
        RemoteActionCompatParcelizer();
    }

    @Override // o.initialize
    public final void read(ListAdapter listAdapter) {
        this.RemoteActionCompatParcelizer = (setForceShowIcon) listAdapter;
    }

    public setGroupDividerEnabled(androidx.appcompat.widget.AppCompatSpinner appCompatSpinner) {
        this.read = appCompatSpinner;
    }

    @Override // o.initialize
    public final void IconCompatParcelizer(Drawable drawable) {
        SentryLogcatAdapter.serializer("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // o.initialize
    public final void RemoteActionCompatParcelizer() {
        removeOnContextAvailableListener removeoncontextavailablelistener = this.IconCompatParcelizer;
        if (removeoncontextavailablelistener != null) {
            removeoncontextavailablelistener.dismiss();
            this.IconCompatParcelizer = null;
        }
    }

    @Override // o.initialize
    public final void RemoteActionCompatParcelizer(int i) {
        SentryLogcatAdapter.serializer("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // o.initialize
    public final void serializer(int i) {
        SentryLogcatAdapter.serializer("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // o.initialize
    public final boolean serializer() {
        removeOnContextAvailableListener removeoncontextavailablelistener = this.IconCompatParcelizer;
        if (removeoncontextavailablelistener != null) {
            return removeoncontextavailablelistener.isShowing();
        }
        return false;
    }

    @Override // o.initialize
    public final void write(int i) {
        SentryLogcatAdapter.serializer("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // o.initialize
    public final void write(int i, int i2) {
        if (this.RemoteActionCompatParcelizer == null) {
            return;
        }
        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = this.read;
        DeltaDecoder deltaDecoder = new DeltaDecoder(appCompatSpinner.getPopupContext());
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) deltaDecoder.serializer;
        CharSequence charSequence = this.serializer;
        if (charSequence != null) {
            onretaincustomnonconfigurationinstance.ResultReceiver = charSequence;
        }
        setForceShowIcon setforceshowicon = this.RemoteActionCompatParcelizer;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        onretaincustomnonconfigurationinstance.read = setforceshowicon;
        onretaincustomnonconfigurationinstance.PlaybackStateCompatCustomAction = this;
        onretaincustomnonconfigurationinstance.IconCompatParcelizer = selectedItemPosition;
        onretaincustomnonconfigurationinstance.MediaBrowserCompatMediaItem = true;
        removeOnContextAvailableListener removeoncontextavailablelistenerSerializer = deltaDecoder.serializer();
        this.IconCompatParcelizer = removeoncontextavailablelistenerSerializer;
        peekAvailableContext peekavailablecontext = removeoncontextavailablelistenerSerializer.write.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        peekavailablecontext.setTextDirection(i);
        peekavailablecontext.setTextAlignment(i2);
        this.IconCompatParcelizer.show();
    }
}
