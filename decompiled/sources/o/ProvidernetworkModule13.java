package o;

import com.huawei.location.logic.zp;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class ProvidernetworkModule13 implements logError {
    public final zp read;
    public getMoshi serializer;

    public static getCallAdapter serializer(zp zpVar) {
        getMoshi getmoshi = new getMoshi(zpVar);
        return new getCallAdapter(getEvaluationsfwf_client_releasedefault.read(getmoshi), getmoshi.write);
    }

    @Override // o.logError
    public final int IconCompatParcelizer() {
        return this.serializer.write;
    }

    @Override // o.logErrordefault
    public final provideRequest RatingCompat() {
        try {
            return serializer(this.read);
        } catch (IOException e) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("IOException converting stream to byte array: ", (Object) e.getMessage(), (Exception) e);
            return null;
        }
    }

    @Override // o.logError
    public final InputStream RemoteActionCompatParcelizer() {
        getMoshi getmoshi = new getMoshi(this.read);
        this.serializer = getmoshi;
        return getmoshi;
    }

    @Override // o.PhoneCallType
    public final provideRequest write() {
        return serializer(this.read);
    }

    public ProvidernetworkModule13(zp zpVar) {
        this.read = zpVar;
    }
}
