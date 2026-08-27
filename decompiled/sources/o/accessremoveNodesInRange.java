package o;

import android.content.SharedPreferences;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.crypto.tink.proto.Keyset;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessremoveNodesInRange {
    public static androidx.emoji2.text.EmojiProcessor read(removeNodesInRange removenodesinrange) throws IOException {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) removenodesinrange.serializer;
        try {
            return androidx.emoji2.text.EmojiProcessor.IconCompatParcelizer(Keyset.RemoteActionCompatParcelizer(byteArrayInputStream, getNotPlacedPlaceOrderuiannotations.read()));
        } finally {
            byteArrayInputStream.close();
        }
    }

    public static void serializer(androidx.emoji2.text.EmojiProcessor emojiProcessor, zzbv zzbvVar) {
        if (((SharedPreferences.Editor) zzbvVar.write).putString((String) zzbvVar.RemoteActionCompatParcelizer, TuplesKt.RemoteActionCompatParcelizer(((Keyset) emojiProcessor.serializer).ParcelableVolumeInfo())).commit()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Failed to write to SharedPreferences");
    }
}
