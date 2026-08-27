package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mergedSemanticsConfiguration {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final decode serializer;

    public mergedSemanticsConfiguration(decode decodeVar) {
        decodeVar.getClass();
        this.serializer = decodeVar;
    }

    public static LinkedHashMap write(semantics semanticsVar) {
        int i = 2 % 2;
        LinkedHashMap linkedHashMapIconCompatParcelizer = onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0("migration_phase", semanticsVar.write()), new onViewAttachedToWindowlambda0("days_until_migration", String.valueOf(semanticsVar.IconCompatParcelizer())), new onViewAttachedToWindowlambda0("redirect_destination", "app_store_android"), new onViewAttachedToWindowlambda0("grab_app_installed", String.valueOf(false)));
        String strSerializer = semanticsVar.serializer();
        if (strSerializer != null) {
            int i2 = read + 85;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                linkedHashMapIconCompatParcelizer.put("template_variant", strSerializer);
                throw null;
            }
            linkedHashMapIconCompatParcelizer.put("template_variant", strSerializer);
        }
        return linkedHashMapIconCompatParcelizer;
    }

    public static Map IconCompatParcelizer(SemanticsListener semanticsListener, String str) {
        int i = 2 % 2;
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("migration_phase", semanticsListener.IconCompatParcelizer()), new onViewAttachedToWindowlambda0("rider_status", str), new onViewAttachedToWindowlambda0("days_until_migration", String.valueOf(semanticsListener.serializer())), new onViewAttachedToWindowlambda0("banner_variant", semanticsListener.read()));
        int i2 = IconCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return mapRemoteActionCompatParcelizer;
    }
}
