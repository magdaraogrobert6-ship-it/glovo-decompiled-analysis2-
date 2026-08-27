package o;

import coil3.RealImageLoader$execute$2$job$1;
import com.roadrunner.biometrics.presentation.BiometricsActivity;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsSortKtsortByGeometryGroupings1 implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final com.airbnb.lottie.parser.DropShadowEffect IconCompatParcelizer;
    public fromColorLong MediaBrowserCompatMediaItem;
    public final String RemoteActionCompatParcelizer;
    public final coil3.network.NetworkFetcher.AnonymousClass2 read;
    public final androidx.lifecycle.BlockRunner serializer;
    public final BiometricsActivity write;

    public SemanticsSortKtsortByGeometryGroupings1(BiometricsActivity biometricsActivity, String str, coil3.network.NetworkFetcher.AnonymousClass2 anonymousClass2, com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect, androidx.lifecycle.BlockRunner blockRunner) {
        dropShadowEffect.getClass();
        blockRunner.getClass();
        this.write = biometricsActivity;
        this.RemoteActionCompatParcelizer = str;
        this.read = anonymousClass2;
        this.IconCompatParcelizer = dropShadowEffect;
        this.serializer = blockRunner;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 97;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        this.MediaBrowserCompatMediaItem = toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle());
        int i4 = MediaDescriptionCompat + 65;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        o.removeNodeAtDepth.serializer("scope");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r1, null, null, new com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2(r5, r2, 6), 3);
        r1 = o.SemanticsSortKtsortByGeometryGroupings1.MediaMetadataCompat + 21;
        o.SemanticsSortKtsortByGeometryGroupings1.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IconCompatParcelizer() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.SemanticsSortKtsortByGeometryGroupings1.MediaMetadataCompat
            int r1 = r1 + 17
            int r2 = r1 % 128
            o.SemanticsSortKtsortByGeometryGroupings1.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            o.fromColorLong r1 = r5.MediaBrowserCompatMediaItem
            r3 = 12
            int r3 = r3 / 0
            if (r1 == 0) goto L30
            goto L1c
        L18:
            o.fromColorLong r1 = r5.MediaBrowserCompatMediaItem
            if (r1 == 0) goto L30
        L1c:
            com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2 r3 = new com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2
            r4 = 6
            r3.<init>(r5, r2, r4)
            r4 = 3
            kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r1, r2, r2, r3, r4)
            int r1 = o.SemanticsSortKtsortByGeometryGroupings1.MediaMetadataCompat
            int r1 = r1 + 21
            int r2 = r1 % 128
            o.SemanticsSortKtsortByGeometryGroupings1.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            return
        L30:
            java.lang.String r0 = "scope"
            o.removeNodeAtDepth.serializer(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SemanticsSortKtsortByGeometryGroupings1.IconCompatParcelizer():void");
    }

    public final void serializer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 59;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            return;
        }
        fromColorLong fromcolorlong = this.MediaBrowserCompatMediaItem;
        if (fromcolorlong == null) {
            removeNodeAtDepth.serializer("scope");
            throw null;
        }
        BuildersKt.RemoteActionCompatParcelizer(fromcolorlong, null, null, new RealImageLoader$execute$2$job$1(this, str, shortNewsContentCardView, 25), 3);
        int i3 = MediaDescriptionCompat + 39;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
    }
}
