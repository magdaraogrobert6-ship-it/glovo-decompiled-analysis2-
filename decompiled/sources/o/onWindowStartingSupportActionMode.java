package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class onWindowStartingSupportActionMode extends setShowingForActionMode {
    public final /* synthetic */ View serializer;
    public final /* synthetic */ int write = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onWindowStartingSupportActionMode(accessgetLaunchedKeysp accessgetlaunchedkeysp) {
        super(accessgetlaunchedkeysp);
        this.serializer = accessgetlaunchedkeysp;
    }

    @Override // o.setShowingForActionMode
    public final invalidateOptionsMenu IconCompatParcelizer() {
        openOptionsMenu openoptionsmenu;
        int i = this.write;
        View view = this.serializer;
        if (i == 0) {
            openOptionsMenu openoptionsmenu2 = ((onTitleChanged) view).read.MediaSessionCompatToken;
            if (openoptionsmenu2 == null) {
                return null;
            }
            return openoptionsmenu2.IconCompatParcelizer();
        }
        ActivityResultRegistry activityResultRegistry = ((accessgetLaunchedKeysp) view).MediaBrowserCompatMediaItem;
        if (activityResultRegistry == null || (openoptionsmenu = ((onSupportNavigateUp) activityResultRegistry).IconCompatParcelizer.serializer) == null) {
            return null;
        }
        return openoptionsmenu.IconCompatParcelizer();
    }

    @Override // o.setShowingForActionMode
    public final boolean write() {
        invalidateOptionsMenu invalidateoptionsmenuIconCompatParcelizer;
        int i = this.write;
        View view = this.serializer;
        if (i == 0) {
            ((onTitleChanged) view).read.serializer();
            return true;
        }
        accessgetLaunchedKeysp accessgetlaunchedkeysp = (accessgetLaunchedKeysp) view;
        handleMessage handlemessage = accessgetlaunchedkeysp.MediaMetadataCompat;
        return handlemessage != null && handlemessage.serializer(accessgetlaunchedkeysp.write) && (invalidateoptionsmenuIconCompatParcelizer = IconCompatParcelizer()) != null && invalidateoptionsmenuIconCompatParcelizer.serializer();
    }

    @Override // o.setShowingForActionMode
    public boolean read() {
        if (this.write != 0) {
            return super.read();
        }
        onSupportActionModeStarted onsupportactionmodestarted = ((onTitleChanged) this.serializer).read;
        if (onsupportactionmodestarted.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            return false;
        }
        onsupportactionmodestarted.RemoteActionCompatParcelizer();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onWindowStartingSupportActionMode(onTitleChanged ontitlechanged, onTitleChanged ontitlechanged2) {
        super(ontitlechanged2);
        this.serializer = ontitlechanged;
    }
}
