package o;

import android.content.Context;
import android.util.Base64;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class isEnabled extends handleOnBackPressed implements IntentSenderRequest {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    private static byte MediaMetadataCompat = -112;
    public final /* synthetic */ run IconCompatParcelizer;
    public final Context RemoteActionCompatParcelizer;
    public java.lang.ref.WeakReference read;
    public accessgetGreencp serializer;
    public final AlertControllerButtonHandler write;

    @Override // o.handleOnBackPressed
    public final AlertControllerButtonHandler read() {
        return this.write;
    }

    @Override // o.handleOnBackPressed
    public final CharSequence IconCompatParcelizer() {
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem.getSubtitle();
    }

    @Override // o.handleOnBackPressed
    public final void MediaBrowserCompatMediaItem() {
        if (this.IconCompatParcelizer.serializer != this) {
            return;
        }
        AlertControllerButtonHandler alertControllerButtonHandler = this.write;
        alertControllerButtonHandler.MediaDescriptionCompat();
        try {
            this.serializer.RemoteActionCompatParcelizer(this, alertControllerButtonHandler);
        } finally {
            alertControllerButtonHandler.MediaBrowserCompatMediaItem();
        }
    }

    @Override // o.handleOnBackPressed
    public final boolean MediaDescriptionCompat() {
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem.ComponentActivity;
    }

    @Override // o.handleOnBackPressed
    public final CharSequence RatingCompat() {
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem.getTitle();
    }

    @Override // o.handleOnBackPressed
    public final void RemoteActionCompatParcelizer() {
        run runVar = this.IconCompatParcelizer;
        if (runVar.serializer != this) {
            return;
        }
        boolean z = runVar.MediaSessionCompatResultReceiverWrapper;
        boolean z2 = runVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (z || z2) {
            runVar.MediaSessionCompatToken = this;
            runVar.PlaybackStateCompatCustomAction = this.serializer;
        } else {
            this.serializer.IconCompatParcelizer(this);
        }
        this.serializer = null;
        runVar.read(false);
        onKeyDown onkeydown = runVar.MediaBrowserCompatMediaItem;
        if (onkeydown.write == null) {
            onkeydown.read();
        }
        runVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.setHideOnContentScrollEnabled(runVar.ResultReceiver);
        runVar.serializer = null;
    }

    @Override // o.handleOnBackPressed
    public final void RemoteActionCompatParcelizer(View view) {
        this.IconCompatParcelizer.MediaBrowserCompatMediaItem.setCustomView(view);
        this.read = new java.lang.ref.WeakReference(view);
    }

    @Override // o.handleOnBackPressed
    public final void read(boolean z) {
        this.MediaSessionCompatQueueItem = z;
        this.IconCompatParcelizer.MediaBrowserCompatMediaItem.setTitleOptional(z);
    }

    @Override // o.handleOnBackPressed
    public final MenuInflater write() {
        return new SystemBarStyleCompanion(this.RemoteActionCompatParcelizer);
    }

    public isEnabled(run runVar, Context context, accessgetGreencp accessgetgreencp) {
        this.IconCompatParcelizer = runVar;
        this.RemoteActionCompatParcelizer = context;
        this.serializer = accessgetgreencp;
        AlertControllerButtonHandler alertControllerButtonHandler = new AlertControllerButtonHandler(context);
        alertControllerButtonHandler.IconCompatParcelizer = 1;
        this.write = alertControllerButtonHandler;
        alertControllerButtonHandler.RemoteActionCompatParcelizer = this;
    }

    @Override // o.IntentSenderRequest
    public final boolean read(AlertControllerButtonHandler alertControllerButtonHandler, MenuItem menuItem) {
        accessgetGreencp accessgetgreencp = this.serializer;
        if (accessgetgreencp != null) {
            return ((handleOnBackStarted) accessgetgreencp.IconCompatParcelizer).write(this, menuItem);
        }
        return false;
    }

    @Override // o.handleOnBackPressed
    public final View serializer() {
        java.lang.ref.WeakReference weakReference = this.read;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.IntentSenderRequest
    public final void write(AlertControllerButtonHandler alertControllerButtonHandler) {
        if (this.serializer == null) {
            return;
        }
        MediaBrowserCompatMediaItem();
        onSupportActionModeStarted onsupportactionmodestarted = this.IconCompatParcelizer.MediaBrowserCompatMediaItem.IconCompatParcelizer;
        if (onsupportactionmodestarted != null) {
            onsupportactionmodestarted.serializer();
        }
    }

    @Override // o.handleOnBackPressed
    public final void IconCompatParcelizer(int i) {
        int i2 = 2 % 2;
        String string = this.IconCompatParcelizer.MediaDescriptionCompat.getResources().getString(i);
        if (string.startsWith("%('")) {
            int i3 = MediaBrowserCompatMediaItem + 43;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
        }
        serializer(string);
        int i5 = MediaDescriptionCompat + 35;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.handleOnBackPressed
    public final void serializer(int i) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 89;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String string = this.IconCompatParcelizer.MediaDescriptionCompat.getResources().getString(i);
        if (string.startsWith("%('")) {
            int i5 = MediaBrowserCompatMediaItem + 103;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                string = ((String) objArr[0]).intern();
                int i6 = 11 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                a(string.substring(3), objArr2);
                string = ((String) objArr2[0]).intern();
            }
        }
        read(string);
    }

    @Override // o.handleOnBackPressed
    public final void read(CharSequence charSequence) {
        this.IconCompatParcelizer.MediaBrowserCompatMediaItem.setSubtitle(charSequence);
    }

    @Override // o.handleOnBackPressed
    public final void serializer(CharSequence charSequence) {
        this.IconCompatParcelizer.MediaBrowserCompatMediaItem.setTitle(charSequence);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ MediaMetadataCompat);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
