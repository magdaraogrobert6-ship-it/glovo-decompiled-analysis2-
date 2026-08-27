package o;

import android.os.Bundle;
import coil3.Extras$Key;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface MultiContentMeasurePolicyKt {
    String IconCompatParcelizer();

    void IconCompatParcelizer(String str, String str2, Bundle bundle);

    int RemoteActionCompatParcelizer(String str);

    String RemoteActionCompatParcelizer();

    List RemoteActionCompatParcelizer(String str, String str2);

    void RemoteActionCompatParcelizer(Extras$Key extras$Key);

    void RemoteActionCompatParcelizer(OnSizeChangedNode onSizeChangedNode);

    long read();

    Map read(String str, String str2, boolean z);

    void read(String str);

    String serializer();

    void serializer(Bundle bundle);

    void serializer(String str, String str2, Bundle bundle);

    String write();

    void write(long j, Bundle bundle, String str, String str2);

    void write(String str);
}
