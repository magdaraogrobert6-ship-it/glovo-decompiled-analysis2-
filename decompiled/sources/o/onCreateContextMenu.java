package o;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class onCreateContextMenu extends placeRelativeWithLayer {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ onDestroyOptionsMenu write;

    public onCreateContextMenu(onDestroyOptionsMenu ondestroyoptionsmenu) {
        this.write = ondestroyoptionsmenu;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @Override // o.placeRelativeWithLayer
    public final void read(int i, View view) throws Exception {
        boolean z;
        int i2 = 2 % 2;
        onDestroyOptionsMenu ondestroyoptionsmenu = this.write;
        fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda00 = ondestroyoptionsmenu.PlaybackStateCompat;
        if (i != 6) {
            int i3 = serializer + 81;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0 ? i != 3 : i != 2) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        fullydrawnreporter_delegatelambda00.setEnabled(z);
        if (i == 3) {
            ondestroyoptionsmenu.serializer(onPrimaryNavigationFragmentChanged.EXPANDED);
            int i4 = RemoteActionCompatParcelizer + 1;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 10 / 0;
                return;
            }
            return;
        }
        int i6 = RemoteActionCompatParcelizer + 89;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i7;
        int i8 = i6 % 2;
        if (i == 4) {
            ondestroyoptionsmenu.serializer(onPrimaryNavigationFragmentChanged.COLLAPSED);
            return;
        }
        int i9 = i7 + 115;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            if (i != 33) {
                return;
            }
        } else if (i != 6) {
            return;
        }
        ondestroyoptionsmenu.serializer(onPrimaryNavigationFragmentChanged.HALF_EXPANDED);
    }

    @Override // o.placeRelativeWithLayer
    public final void read(View view, float f) {
        float f2;
        int i = 2 % 2;
        if (f <= 0.5f) {
            f2 = 1.0f;
        } else if (0.5f > f || f > 0.8f) {
            f2 = 0.0f;
        } else {
            int i2 = RemoteActionCompatParcelizer + 83;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i3;
            float f3 = i2 % 2 == 0 ? (0.8f * f) + 3.3333333f : (0.8f - f) * 3.3333333f;
            int i4 = i3 + 51;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            f2 = f3;
        }
        onDestroyOptionsMenu ondestroyoptionsmenu = this.write;
        ondestroyoptionsmenu.MediaMetadataCompat.setAlpha(f2);
        ondestroyoptionsmenu.RatingCompat.setAlpha(f2);
        ondestroyoptionsmenu.MediaBrowserCompatMediaItem.serializer.write(Float.valueOf(f));
    }
}
