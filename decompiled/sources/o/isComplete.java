package o;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface isComplete extends IInterface {
    List IconCompatParcelizer(String str, String str2, String str3, boolean z);

    void IconCompatParcelizer(zzpl zzplVar, zzr zzrVar);

    void IconCompatParcelizer(zzr zzrVar);

    void MediaDescriptionCompat(zzr zzrVar);

    zzao MediaMetadataCompat(zzr zzrVar);

    void MediaSessionCompatQueueItem(zzr zzrVar);

    void RatingCompat(zzr zzrVar);

    ArrayList RemoteActionCompatParcelizer(zzr zzrVar, boolean z);

    List RemoteActionCompatParcelizer(String str, String str2, String str3);

    List RemoteActionCompatParcelizer(String str, String str2, boolean z, zzr zzrVar);

    void RemoteActionCompatParcelizer(zzr zzrVar);

    List read(String str, String str2, zzr zzrVar);

    void read(Bundle bundle, zzr zzrVar);

    void read(zzah zzahVar, zzr zzrVar);

    void read(zzbg zzbgVar, zzr zzrVar);

    void read(zzr zzrVar);

    String serializer(zzr zzrVar);

    void serializer(zzr zzrVar, Bundle bundle, LayoutNodeSubcompositionsStateprecomposePaused2 layoutNodeSubcompositionsStateprecomposePaused2);

    void serializer(String str, String str2, long j, String str3);

    byte[] serializer(zzbg zzbgVar, String str);

    void write(zzr zzrVar);

    void write(zzr zzrVar, zzaf zzafVar);

    void write(zzr zzrVar, zzoo zzooVar, LayoutNodeSubcompositionsStatesubcompose41composable1 layoutNodeSubcompositionsStatesubcompose41composable1);
}
