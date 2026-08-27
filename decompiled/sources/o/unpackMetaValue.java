package o;

import androidx.work.CoroutineWorker$startWork$1;
import com.roadrunner.country.config.implementation.data.CountryConfigListRepository;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class unpackMetaValue {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final CountryConfigListRepository write;

    public unpackMetaValue(CountryConfigListRepository countryConfigListRepository) {
        this.write = countryConfigListRepository;
    }

    public final void write() {
        int i = 2 % 2;
        CountryConfigListRepository countryConfigListRepository = this.write;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = countryConfigListRepository.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i2 = serializer + 41;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i4 = serializer + 123;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        countryConfigListRepository.RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(countryConfigListRepository.MediaBrowserCompatMediaItem, null, null, new CoroutineWorker$startWork$1(countryConfigListRepository, shortNewsContentCardView, 13), 3);
    }
}
