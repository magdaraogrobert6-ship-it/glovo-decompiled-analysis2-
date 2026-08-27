package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class setIsHtmlInAppMessageHtmlLinkTargetEnabled implements Comparator {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ setIsHtmlInAppMessageHtmlLinkTargetEnabled(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        if (i4 == 0) {
            return setNativeShader.RemoteActionCompatParcelizer(Double.valueOf(((setIsSessionStartBasedTimeoutEnabled) ((onViewAttachedToWindowlambda0) obj).write).b), Double.valueOf(((setIsSessionStartBasedTimeoutEnabled) ((onViewAttachedToWindowlambda0) obj2).write).b));
        }
        if (i4 == 1) {
            return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(((disableAppSetIdReading) obj).write), Integer.valueOf(((disableAppSetIdReading) obj2).write));
        }
        if (i4 == 2) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (i4 == 3) {
            int iCompareTo = ((Comparable) obj).compareTo((Comparable) obj2);
            int i5 = write + 49;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return iCompareTo;
        }
        if (i4 == 4) {
            return setNativeShader.RemoteActionCompatParcelizer(Long.valueOf(((io.sentry.android.replay.MediaDescriptionCompat) obj).RemoteActionCompatParcelizer), Long.valueOf(((io.sentry.android.replay.MediaDescriptionCompat) obj2).RemoteActionCompatParcelizer));
        }
        if (i4 != 5) {
            return setNativeShader.RemoteActionCompatParcelizer(((ApiExceptionSessionExpired) obj).read, ((ApiExceptionSessionExpired) obj2).read);
        }
        return setNativeShader.RemoteActionCompatParcelizer(Long.valueOf(((io.sentry.rrweb.IconCompatParcelizer) obj).PlaybackStateCompatCustomAction), Long.valueOf(((io.sentry.rrweb.IconCompatParcelizer) obj2).PlaybackStateCompatCustomAction));
    }
}
