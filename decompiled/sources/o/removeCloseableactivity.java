package o;

import android.content.Context;
import android.util.Base64;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class removeCloseableactivity extends handleOnBackPressed implements IntentSenderRequest {
    private static int MediaBrowserCompatMediaItem = 0;
    private static byte MediaDescriptionCompat = -112;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public final Context IconCompatParcelizer;
    public final AlertControllerButtonHandler MediaMetadataCompat;
    public final accessgetGreencp RemoteActionCompatParcelizer;
    public java.lang.ref.WeakReference read;
    public final onKeyDown serializer;
    public boolean write;

    @Override // o.handleOnBackPressed
    public final AlertControllerButtonHandler read() {
        return this.MediaMetadataCompat;
    }

    @Override // o.handleOnBackPressed
    public final CharSequence IconCompatParcelizer() {
        return this.serializer.getSubtitle();
    }

    @Override // o.handleOnBackPressed
    public final void MediaBrowserCompatMediaItem() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this, this.MediaMetadataCompat);
    }

    @Override // o.handleOnBackPressed
    public final boolean MediaDescriptionCompat() {
        return this.serializer.ComponentActivity;
    }

    @Override // o.handleOnBackPressed
    public final CharSequence RatingCompat() {
        return this.serializer.getTitle();
    }

    @Override // o.handleOnBackPressed
    public final void RemoteActionCompatParcelizer(View view) {
        this.serializer.setCustomView(view);
        this.read = view != null ? new java.lang.ref.WeakReference(view) : null;
    }

    @Override // o.handleOnBackPressed
    public final void read(boolean z) {
        this.MediaSessionCompatQueueItem = z;
        this.serializer.setTitleOptional(z);
    }

    @Override // o.IntentSenderRequest
    public final boolean read(AlertControllerButtonHandler alertControllerButtonHandler, MenuItem menuItem) {
        return ((handleOnBackStarted) this.RemoteActionCompatParcelizer.IconCompatParcelizer).write(this, menuItem);
    }

    @Override // o.handleOnBackPressed
    public final MenuInflater write() {
        return new SystemBarStyleCompanion(this.serializer.getContext());
    }

    public removeCloseableactivity(Context context, onKeyDown onkeydown, accessgetGreencp accessgetgreencp) {
        this.IconCompatParcelizer = context;
        this.serializer = onkeydown;
        this.RemoteActionCompatParcelizer = accessgetgreencp;
        AlertControllerButtonHandler alertControllerButtonHandler = new AlertControllerButtonHandler(onkeydown.getContext());
        alertControllerButtonHandler.IconCompatParcelizer = 1;
        this.MediaMetadataCompat = alertControllerButtonHandler;
        alertControllerButtonHandler.RemoteActionCompatParcelizer = this;
    }

    @Override // o.IntentSenderRequest
    public final void write(AlertControllerButtonHandler alertControllerButtonHandler) {
        MediaBrowserCompatMediaItem();
        onSupportActionModeStarted onsupportactionmodestarted = this.serializer.IconCompatParcelizer;
        if (onsupportactionmodestarted != null) {
            onsupportactionmodestarted.serializer();
        }
    }

    @Override // o.handleOnBackPressed
    public final View serializer() {
        java.lang.ref.WeakReference weakReference = this.read;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.handleOnBackPressed
    public final void RemoteActionCompatParcelizer() {
        if (this.write) {
            return;
        }
        this.write = true;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(this);
    }

    @Override // o.handleOnBackPressed
    public final void IconCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 97;
        MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String string = this.IconCompatParcelizer.getString(i);
        if (string.startsWith("%('")) {
            int i5 = MediaBrowserCompatMediaItem + 43;
            MediaSessionCompatResultReceiverWrapper = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
        }
        serializer(string);
    }

    @Override // o.handleOnBackPressed
    public final void serializer(int i) {
        int i2 = 2 % 2;
        String string = this.IconCompatParcelizer.getString(i);
        if (!(!string.startsWith("%('"))) {
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
            int i3 = MediaBrowserCompatMediaItem + 101;
            MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        read(string);
        int i5 = MediaSessionCompatResultReceiverWrapper + 99;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.handleOnBackPressed
    public final void read(CharSequence charSequence) {
        this.serializer.setSubtitle(charSequence);
    }

    @Override // o.handleOnBackPressed
    public final void serializer(CharSequence charSequence) {
        this.serializer.setTitle(charSequence);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ MediaDescriptionCompat);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
