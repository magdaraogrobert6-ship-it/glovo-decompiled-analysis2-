package o;

import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat$Style;

/* JADX INFO: loaded from: classes.dex */
public final class getPreviousdhqQ8s extends NotificationCompat$Style {
    @Override // androidx.core.app.NotificationCompat$Style
    public final boolean displayCustomViewInline() {
        return true;
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final RemoteViews makeBigContentView(accessgetLeftcp accessgetleftcp) {
        return null;
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final RemoteViews makeContentView(accessgetLeftcp accessgetleftcp) {
        return null;
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final RemoteViews makeHeadsUpContentView(accessgetLeftcp accessgetleftcp) {
        return null;
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final void apply(accessgetLeftcp accessgetleftcp) {
        ((androidx.core.app.NotificationCompatBuilder) accessgetleftcp).serializer.setStyle(FocusEnterExitScope.write());
    }

    @Override // androidx.core.app.NotificationCompat$Style
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }
}
