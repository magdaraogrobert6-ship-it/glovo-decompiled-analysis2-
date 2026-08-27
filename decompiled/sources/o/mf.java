package o;

import androidx.camera.core.LegacySessionConfig;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer;
import com.mapbox.navigation.voice.model.SpeechAnnouncement;
import com.mapbox.navigation.voice.model.SpeechError;
import com.mapbox.navigation.voice.model.SpeechValue;
import java.io.IOException;
import o.createFromParcel;
import o.mh;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mf implements MapboxNavigationConsumer {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ mh write;

    public /* synthetic */ mf(mh mhVar, int i) {
        this.read = i;
        this.write = mhVar;
    }

    @Override // com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer
    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        final mh mhVar = this.write;
        if (i4 != 0) {
            SpeechAnnouncement speechAnnouncement = (SpeechAnnouncement) obj;
            speechAnnouncement.getClass();
            com.huawei.wisesecurity.ucs_credential.x xVar = mhVar.RemoteActionCompatParcelizer;
            if (xVar != null) {
                xVar.clean(speechAnnouncement);
                return;
            }
            return;
        }
        Expected expected = (Expected) obj;
        expected.getClass();
        final int i5 = 0;
        final int i6 = 1;
        expected.fold(new Expected.Transformer() { // from class: com.roadrunner.map.integration.mapbox.speech.SpeechApi$$ExternalSyntheticLambda2
            private static int serializer = 1;
            private static int write;

            @Override // com.mapbox.bindgen.Expected.Transformer
            public final Object invoke(Object obj2) throws InterruptedException, IOException {
                int i7 = 2 % 2;
                int i8 = i5;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                mh mhVar2 = mhVar;
                if (i8 != 0) {
                    SpeechValue speechValue = (SpeechValue) obj2;
                    speechValue.getClass();
                    LegacySessionConfig legacySessionConfig = mhVar2.write;
                    if (legacySessionConfig != null) {
                        int i9 = serializer + 79;
                        write = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        legacySessionConfig.play(speechValue.announcement, mhVar2.MediaMetadataCompat);
                    }
                    return createfromparcel;
                }
                SpeechError speechError = (SpeechError) obj2;
                speechError.getClass();
                LegacySessionConfig legacySessionConfig2 = mhVar2.write;
                if (legacySessionConfig2 != null) {
                    int i11 = serializer + 23;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    legacySessionConfig2.play(speechError.fallback, mhVar2.MediaMetadataCompat);
                }
                return createfromparcel;
            }
        }, new Expected.Transformer() { // from class: com.roadrunner.map.integration.mapbox.speech.SpeechApi$$ExternalSyntheticLambda2
            private static int serializer = 1;
            private static int write;

            @Override // com.mapbox.bindgen.Expected.Transformer
            public final Object invoke(Object obj2) throws InterruptedException, IOException {
                int i7 = 2 % 2;
                int i8 = i6;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                mh mhVar2 = mhVar;
                if (i8 != 0) {
                    SpeechValue speechValue = (SpeechValue) obj2;
                    speechValue.getClass();
                    LegacySessionConfig legacySessionConfig = mhVar2.write;
                    if (legacySessionConfig != null) {
                        int i9 = serializer + 79;
                        write = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        legacySessionConfig.play(speechValue.announcement, mhVar2.MediaMetadataCompat);
                    }
                    return createfromparcel;
                }
                SpeechError speechError = (SpeechError) obj2;
                speechError.getClass();
                LegacySessionConfig legacySessionConfig2 = mhVar2.write;
                if (legacySessionConfig2 != null) {
                    int i11 = serializer + 23;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    legacySessionConfig2.play(speechError.fallback, mhVar2.MediaMetadataCompat);
                }
                return createfromparcel;
            }
        });
        int i7 = IconCompatParcelizer + 29;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }
}
