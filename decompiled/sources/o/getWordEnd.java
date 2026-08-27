package o;

import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getWordEnd implements getColorIntegerOrNulllambda0 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public static final getWordEnd RemoteActionCompatParcelizer = new getWordEnd(0);
    public static final getWordEnd read = new getWordEnd(1);
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ getWordEnd(int i) {
        this.IconCompatParcelizer = i;
    }

    static {
        int i = serializer + 21;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RatingCompat + 21;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.IconCompatParcelizer != 0) {
            return new getWordStart();
        }
        createGraphemeClusterSegmentFinder creategraphemeclustersegmentfinder = new createGraphemeClusterSegmentFinder();
        creategraphemeclustersegmentfinder.read = StateFlowKt.read(Boolean.FALSE);
        int i3 = MediaDescriptionCompat + 113;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return creategraphemeclustersegmentfinder;
        }
        throw null;
    }
}
