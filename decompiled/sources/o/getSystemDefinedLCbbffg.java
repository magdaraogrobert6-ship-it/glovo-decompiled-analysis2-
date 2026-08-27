package o;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class getSystemDefinedLCbbffg {
    public final Set IconCompatParcelizer;
    public final SharedPreferences read;

    public final LinkedHashMap RemoteActionCompatParcelizer() {
        Map<String, ?> all = this.read.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.IconCompatParcelizer;
            if (set == null || set.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public getSystemDefinedLCbbffg(SharedPreferences sharedPreferences, Set set) {
        sharedPreferences.getClass();
        this.read = sharedPreferences;
        this.IconCompatParcelizer = set;
    }

    public final long read(String str) {
        str.getClass();
        IconCompatParcelizer(str);
        return this.read.getLong(str, 0L);
    }

    public final String write(String str, String str2) {
        str.getClass();
        IconCompatParcelizer(str);
        return this.read.getString(str, str2);
    }

    public final Set write(String str) {
        str.getClass();
        IconCompatParcelizer(str);
        Set<String> stringSet = this.read.getStringSet(str, ItemTouchHelperAdapter.serializer);
        if (stringSet == null) {
            return null;
        }
        return onContentCardDismissed.ParcelableVolumeInfo(stringSet);
    }

    public final void IconCompatParcelizer(String str) {
        Set set = this.IconCompatParcelizer;
        if (set == null || set.contains(str)) {
            return;
        }
        DrawableTransformation.read((Object) removeNodeAtDepth.write((Object) str, "Can't access key outside migration: "));
    }
}
