package o;

import android.content.Context;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public class migrateContentCardsMetadataToJson extends createOrGetDataStorelambda00 {
    private final BannersDataStoreProviderCompanionExternalSyntheticLambda3 RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI serializer;
    private final getCooldownEnterSeconds write;

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.write("SdkStatusUpdateTask");
        publishexceptionlambda0.read(CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
        publishexceptionlambda0.write(30000L);
        publishexceptionlambda0.write(0);
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    public migrateContentCardsMetadataToJson(getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, BannersDataStoreProviderCompanionExternalSyntheticLambda3 bannersDataStoreProviderCompanionExternalSyntheticLambda3) {
        this.write = getcooldownenterseconds;
        this.serializer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RemoteActionCompatParcelizer = bannersDataStoreProviderCompanionExternalSyntheticLambda3;
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.write.IconCompatParcelizer(r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q.class, (Long) null);
        Long lValueOf = optionalIconCompatParcelizer.IconCompatParcelizer() ? Long.valueOf(optionalIconCompatParcelizer.write().serializer()) : null;
        if (lValueOf != null) {
            this.serializer.getClass();
            if (System.currentTimeMillis() - lValueOf.longValue() < 43200000) {
                return false;
            }
        }
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(true, false);
        return false;
    }
}
