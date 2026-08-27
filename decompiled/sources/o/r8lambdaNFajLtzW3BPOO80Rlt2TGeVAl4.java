package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.InjectUsing;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ForegroundServiceAssistant")
public class r8lambdaNFajLtzW3BPOO80Rlt2TGeVAl4 {
    private final containsandroid_sdk_base_release IconCompatParcelizer;
    private final r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE MediaBrowserCompatMediaItem;
    private long MediaMetadataCompat;
    private final Context RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private final ServerConfigDataStoreProviderCompanion serializer;
    private final parseLonglambda0 write;

    public final void serializer() {
        this.MediaBrowserCompatMediaItem.serializer(IconCompatParcelizer());
    }

    public final void write() {
        this.read.getClass();
        if (SystemClock.elapsedRealtime() - this.MediaMetadataCompat < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
            return;
        }
        r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE r8lambdatiezsvb60pafqh0pucdjruvm2qe = this.MediaBrowserCompatMediaItem;
        if (r8lambdatiezsvb60pafqh0pucdjruvm2qe.IconCompatParcelizer()) {
            containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar = this.IconCompatParcelizer;
            containsandroid_sdk_base_releaseVar.IconCompatParcelizer(10);
            this.MediaMetadataCompat = SystemClock.elapsedRealtime();
            this.write.IconCompatParcelizer("Requesting activity transition update", new Object[0]);
            ArrayList arrayList = new ArrayList();
            int[] iArr = {7, 8, 0, 1, 3, 2};
            for (int i = 0; i < 6; i++) {
                arrayList.add(new ActivityTransition.Builder().setActivityType(iArr[i]).setActivityTransition(0).build());
            }
            r8lambdatiezsvb60pafqh0pucdjruvm2qe.serializer(new ActivityTransitionRequest(arrayList), IconCompatParcelizer());
            containsandroid_sdk_base_releaseVar.read(10, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
        }
    }

    public r8lambdaNFajLtzW3BPOO80Rlt2TGeVAl4(Context context, readList readlist, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE r8lambdatiezsvb60pafqh0pucdjruvm2qe) {
        this.write = parselonglambda0;
        this.RemoteActionCompatParcelizer = context;
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.serializer = serverConfigDataStoreProviderCompanion;
        containsandroid_sdk_base_release containsandroid_sdk_base_releaseVarWrite = readlist.write();
        this.IconCompatParcelizer = containsandroid_sdk_base_releaseVarWrite;
        this.MediaBrowserCompatMediaItem = r8lambdatiezsvb60pafqh0pucdjruvm2qe;
        containsandroid_sdk_base_releaseVarWrite.RemoteActionCompatParcelizer(new r8lambda8wKuPcR_AXiuhWt7hIFuyEzjeWw(0, this));
    }

    private PendingIntent IconCompatParcelizer() {
        Context context = this.RemoteActionCompatParcelizer;
        Intent intent = new Intent(context, (Class<?>) r8lambdaOFk6ADiHGUByXl2hN9xb3lUDtsA.class);
        intent.setAction(this.serializer.read());
        return PendingIntent.getBroadcast(context, 0, intent, r8lambdaFCWpTejCW5kVaf7ggoc6ZelEIk.IconCompatParcelizer(0));
    }

    public final void read() {
        containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar = this.IconCompatParcelizer;
        if (containsandroid_sdk_base_releaseVar.write(10)) {
            containsandroid_sdk_base_releaseVar.IconCompatParcelizer(10);
            this.MediaBrowserCompatMediaItem.serializer(IconCompatParcelizer());
        }
    }

    public static /* synthetic */ void read(r8lambdaNFajLtzW3BPOO80Rlt2TGeVAl4 r8lambdanfajltzw3bpoo80rlt2tgeval4, Message message) {
        if (message.what == 10) {
            r8lambdanfajltzw3bpoo80rlt2tgeval4.MediaBrowserCompatMediaItem.serializer(r8lambdanfajltzw3bpoo80rlt2tgeval4.IconCompatParcelizer());
        }
    }
}
