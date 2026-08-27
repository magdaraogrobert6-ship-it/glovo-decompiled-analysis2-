package o;

import com.huawei.location.logic.zp;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getDefaultRetrofitBuilder implements Provider {
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write = 1;

    public getDefaultRetrofitBuilder(zp zpVar) {
        this.RemoteActionCompatParcelizer = zpVar;
    }

    public static RetrofitBuilderKtDefaultRetrofitBuilder2 write(zp zpVar) {
        return new RetrofitBuilderKtDefaultRetrofitBuilder2(getEvaluationsfwf_client_releasedefault.read(new UrlBuilder(zpVar)), null);
    }

    @Override // o.logErrordefault
    public final provideRequest RatingCompat() {
        if (this.write != 0) {
            try {
                return write();
            } catch (IOException e) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("IOException converting stream to byte array: ", (Object) e.getMessage(), (Exception) e);
                return null;
            }
        }
        try {
            return write((zp) this.RemoteActionCompatParcelizer);
        } catch (IOException e2) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("IOException converting stream to byte array: ", (Object) e2.getMessage(), (Exception) e2);
            return null;
        }
    }

    @Override // o.Provider
    public final InputStream RemoteActionCompatParcelizer() {
        return this.write != 0 ? (writeSelf) this.RemoteActionCompatParcelizer : new UrlBuilder((zp) this.RemoteActionCompatParcelizer);
    }

    @Override // o.PhoneCallType
    public final provideRequest write() {
        return this.write != 0 ? new UrlBuilderKt(((writeSelf) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(), 0) : write((zp) this.RemoteActionCompatParcelizer);
    }

    public /* synthetic */ getDefaultRetrofitBuilder() {
    }
}
