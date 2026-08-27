package o;

import com.roadrunner.country.config.implementation.data.database.CountryConfigListLocalDataSource;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class metaUnMarkUpdated extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ CountryConfigListLocalDataSource write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public metaUnMarkUpdated(CountryConfigListLocalDataSource countryConfigListLocalDataSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = countryConfigListLocalDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return CountryConfigListLocalDataSource.access$decodeFromJson(this.write, null, this);
        }
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 6 / 0;
        return CountryConfigListLocalDataSource.access$decodeFromJson(this.write, null, this);
    }
}
