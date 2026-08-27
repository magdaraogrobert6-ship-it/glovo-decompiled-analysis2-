package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdacj1MEPsdBAzy84SfpNJAlW40JlY extends BroadcastReceiver {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final r8lambdaGsxfkYxRefLxpEZ6flYq5eiAOLo IconCompatParcelizer;
    public final Path$Companion read;
    public final getAllSemanticsNodesToMap serializer;
    public final ImageHeaderParserImageType write;

    public r8lambdacj1MEPsdBAzy84SfpNJAlW40JlY(Path$Companion path$Companion, ImageHeaderParserImageType imageHeaderParserImageType, r8lambdaGsxfkYxRefLxpEZ6flYq5eiAOLo r8lambdagsxfkyxreflxpez6flyq5eiaolo, getAllSemanticsNodesToMap getallsemanticsnodestomap) {
        path$Companion.getClass();
        imageHeaderParserImageType.getClass();
        r8lambdagsxfkyxreflxpez6flyq5eiaolo.getClass();
        getallsemanticsnodestomap.getClass();
        this.read = path$Companion;
        this.write = imageHeaderParserImageType;
        this.IconCompatParcelizer = r8lambdagsxfkyxreflxpez6flyq5eiaolo;
        this.serializer = getallsemanticsnodestomap;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = 2 % 2;
        context.getClass();
        intent.getClass();
        ((TraceTimeMeasurementWithPerformanceKit) this.serializer).read("broadcast_device_state_update", new b3(intent, this, context, 7));
        int i2 = RemoteActionCompatParcelizer + 103;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
