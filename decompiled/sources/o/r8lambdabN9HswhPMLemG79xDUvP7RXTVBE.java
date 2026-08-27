package o;

import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "model-crash-tracker", componentName = "ModelCrashTracker")
public class r8lambdabN9HswhPMLemG79xDUvP7RXTVBE implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final r8lambdai6V0hMqBXar0HYm9Y0uUI1YcuF0 IconCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final com.sentiance.sdk.util.c serializer;
    private final migrateTriggersReeligibilityToJsonlambda1<Map<String, List<Long>>> write = new r8lambdafqoeETHKgA57Nog2PwGovxAoIBU(this);

    private void read() {
        synchronized (this) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, List<Long>> entry : this.write.read().entrySet()) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(entry.getKey());
                jSONArray2.put(new JSONArray((Collection) entry.getValue()));
                jSONArray.put(jSONArray2);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key_model_crash_map", jSONArray);
            } catch (JSONException e) {
                this.read.IconCompatParcelizer(false, e, "Failed to add task info hash list", new Object[0]);
            }
            this.serializer.RemoteActionCompatParcelizer("key_model_crash_map", jSONObject.toString());
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.write.write();
        this.serializer.read();
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return new ArrayList();
    }

    public final boolean serializer(populatePushStoryPage populatepushstorypage, long j) {
        r8lambdai6V0hMqBXar0HYm9Y0uUI1YcuF0 r8lambdai6v0hmqbxar0hym9y0uui1ycuf0;
        migrateTriggersReeligibilityToJsonlambda1<Map<String, List<Long>>> migratetriggersreeligibilitytojsonlambda1 = this.write;
        List<Long> arrayList = migratetriggersreeligibilitytojsonlambda1.read().get(populatepushstorypage.serializer());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(Long.valueOf(j));
        int size = arrayList.size();
        while (true) {
            size--;
            r8lambdai6v0hmqbxar0hym9y0uui1ycuf0 = this.IconCompatParcelizer;
            if (size < 0) {
                break;
            }
            this.RemoteActionCompatParcelizer.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = arrayList.get(size).longValue();
            r8lambdai6v0hmqbxar0hym9y0uui1ycuf0.getClass();
            if (jCurrentTimeMillis - jLongValue > CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL) {
                arrayList.remove(size);
            }
        }
        migratetriggersreeligibilitytojsonlambda1.read().put(populatepushstorypage.serializer(), arrayList);
        read();
        this.read.IconCompatParcelizer("Model: %s, total crashes: %s", populatepushstorypage.RemoteActionCompatParcelizer().getName(), Integer.valueOf(arrayList.size()));
        int size2 = arrayList.size();
        r8lambdai6v0hmqbxar0hym9y0uui1ycuf0.getClass();
        return size2 > 10;
    }

    public r8lambdabN9HswhPMLemG79xDUvP7RXTVBE(r8lambdai6V0hMqBXar0HYm9Y0uUI1YcuF0 r8lambdai6v0hmqbxar0hym9y0uui1ycuf0, com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.serializer = cVar;
        this.read = parselonglambda0;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.IconCompatParcelizer = r8lambdai6v0hmqbxar0hym9y0uui1ycuf0;
    }

    public final void RemoteActionCompatParcelizer(populatePushStoryPage populatepushstorypage) {
        this.write.read().remove(populatepushstorypage.serializer());
        read();
    }

    public static AbstractMap IconCompatParcelizer(r8lambdabN9HswhPMLemG79xDUvP7RXTVBE r8lambdabn9hswhpmlemg79xduvp7rxtvbe) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String strWrite = r8lambdabn9hswhpmlemg79xduvp7rxtvbe.serializer.write("key_model_crash_map", (String) null);
        if (strWrite == null) {
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(strWrite);
            HashMap map = new HashMap();
            if (jSONObject.has("key_model_crash_map")) {
                map = new HashMap();
                JSONArray jSONArray = jSONObject.getJSONArray("key_model_crash_map");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                    map.put((String) jSONArray2.get(0), IconCompatParcelizer(r8lambdabn9hswhpmlemg79xduvp7rxtvbe, jSONArray2.get(1)));
                }
            }
            return map;
        } catch (ClassCastException | JSONException e) {
            r8lambdabn9hswhpmlemg79xduvp7rxtvbe.read.IconCompatParcelizer(false, e, "Failed to load model crashes %s", strWrite);
            return concurrentHashMap;
        }
    }

    public static ArrayList IconCompatParcelizer(r8lambdabN9HswhPMLemG79xDUvP7RXTVBE r8lambdabn9hswhpmlemg79xduvp7rxtvbe, Object obj) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                Long l = (Long) jSONArray.get(i);
                if (l != null) {
                    arrayList2.add(l);
                }
            }
            return arrayList2;
        } catch (JSONException e) {
            r8lambdabn9hswhpmlemg79xduvp7rxtvbe.read.IconCompatParcelizer(false, e, "Failed to load model crashes %s", obj);
            return arrayList;
        }
    }
}
