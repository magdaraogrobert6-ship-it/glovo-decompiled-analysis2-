package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class read implements io.sentry.internal.gestures.read {
    public final io.sentry.util.MediaMetadataCompat serializer;

    public read(io.sentry.util.MediaMetadataCompat mediaMetadataCompat) {
        this.serializer = mediaMetadataCompat;
    }

    @Override // io.sentry.internal.gestures.read
    public final io.sentry.internal.gestures.serializer locate(View view, float f, float f2, io.sentry.internal.gestures.IconCompatParcelizer iconCompatParcelizer) {
        if (view != null) {
            if (iconCompatParcelizer == io.sentry.internal.gestures.IconCompatParcelizer.CLICKABLE && view.isClickable() && view.getVisibility() == 0) {
                try {
                    return new io.sentry.internal.gestures.serializer(view, Okio.serializer(view), MediaMetadataCompat.IconCompatParcelizer(view), null, "old_view_system");
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            }
            if (iconCompatParcelizer == io.sentry.internal.gestures.IconCompatParcelizer.SCROLLABLE && (((((Boolean) this.serializer.IconCompatParcelizer()).booleanValue() && ScrollingView.class.isAssignableFrom(view.getClass())) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0)) {
                try {
                    return new io.sentry.internal.gestures.serializer(view, Okio.serializer(view), MediaMetadataCompat.IconCompatParcelizer(view), null, "old_view_system");
                } catch (Resources.NotFoundException unused2) {
                }
            }
        }
        return null;
    }
}
