package o;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DataStoreProviderExternalSyntheticLambda7 {
    private final migrateTriggersReeligibilityToJsonlambda1<List<RemoteActionCompatParcelizer>> IconCompatParcelizer = new writeList(this);
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final com.sentiance.sdk.util.c serializer;

    public static class RemoteActionCompatParcelizer implements r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU, migrateTriggersReeligibilityToJsonlambda0 {
        private long IconCompatParcelizer;
        private long RemoteActionCompatParcelizer;
        private long read;
        private int serializer;
        private String write;

        @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
        public final void RemoteActionCompatParcelizer(String str) throws JSONException {
            JSONObject jSONObject = new JSONObject(str);
            this.write = jSONObject.getString("quad-key");
            this.serializer = jSONObject.getInt("attempts");
            this.RemoteActionCompatParcelizer = jSONObject.getLong("first-attempt-time");
            if (jSONObject.has("retry-after-millis")) {
                this.read = jSONObject.getLong("retry-after-millis");
            } else {
                this.read = 30000L;
            }
            if (jSONObject.has("last-attempt-time")) {
                this.IconCompatParcelizer = jSONObject.getLong("last-attempt-time");
            } else {
                this.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
            }
        }

        public RemoteActionCompatParcelizer(String str, int i, long j, long j2, long j3) {
            this.write = str;
            this.serializer = i;
            this.RemoteActionCompatParcelizer = j;
            this.IconCompatParcelizer = j2;
            this.read = j3;
        }

        public static /* synthetic */ void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            remoteActionCompatParcelizer.serializer++;
        }

        public RemoteActionCompatParcelizer(String str, int i, long j, long j2) {
            this.write = str;
            this.serializer = i;
            this.RemoteActionCompatParcelizer = j;
            this.IconCompatParcelizer = j2;
        }

        public RemoteActionCompatParcelizer() {
        }

        @Override // o.migrateTriggersReeligibilityToJsonlambda0
        public final String write() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("quad-key", this.write);
            jSONObject.put("attempts", this.serializer);
            jSONObject.put("first-attempt-time", this.RemoteActionCompatParcelizer);
            jSONObject.put("last-attempt-time", this.IconCompatParcelizer);
            jSONObject.put("retry-after-millis", this.read);
            return jSONObject.toString();
        }
    }

    public abstract String IconCompatParcelizer();

    private void RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        this.RemoteActionCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        migrateTriggersReeligibilityToJsonlambda1<List<RemoteActionCompatParcelizer>> migratetriggersreeligibilitytojsonlambda1 = this.IconCompatParcelizer;
        for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : migratetriggersreeligibilitytojsonlambda1.read()) {
            if (jCurrentTimeMillis - remoteActionCompatParcelizer.RemoteActionCompatParcelizer >= 43200000) {
                arrayList.add(remoteActionCompatParcelizer);
            }
        }
        migratetriggersreeligibilitytojsonlambda1.read().removeAll(arrayList);
    }

    private RemoteActionCompatParcelizer read(String str) {
        for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.IconCompatParcelizer.read()) {
            if (str.equals(remoteActionCompatParcelizer.write)) {
                return remoteActionCompatParcelizer;
            }
        }
        return null;
    }

    private void read() {
        migrateTriggersReeligibilityToJsonlambda1<List<RemoteActionCompatParcelizer>> migratetriggersreeligibilitytojsonlambda1 = this.IconCompatParcelizer;
        try {
            this.serializer.RemoteActionCompatParcelizer(IconCompatParcelizer(), !migratetriggersreeligibilitytojsonlambda1.read().isEmpty() ? r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.write(new ArrayList(migratetriggersreeligibilitytojsonlambda1.read())) : "");
        } catch (JSONException e) {
            this.read.IconCompatParcelizer(false, e, "failed to save failed tile downloads", new Object[0]);
        }
    }

    public void clearData() {
        this.serializer.read();
        this.IconCompatParcelizer.write();
    }

    public final void write(String str, long j) {
        this.RemoteActionCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = read(str);
        migrateTriggersReeligibilityToJsonlambda1<List<RemoteActionCompatParcelizer>> migratetriggersreeligibilitytojsonlambda1 = this.IconCompatParcelizer;
        migratetriggersreeligibilitytojsonlambda1.read().remove(remoteActionCompatParcelizer);
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(str, 1, jCurrentTimeMillis, jCurrentTimeMillis, j);
        } else {
            remoteActionCompatParcelizer.read = j;
            RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
            remoteActionCompatParcelizer.IconCompatParcelizer = jCurrentTimeMillis;
        }
        migratetriggersreeligibilitytojsonlambda1.read().add(remoteActionCompatParcelizer);
        RemoteActionCompatParcelizer();
        read();
    }

    public DataStoreProviderExternalSyntheticLambda7(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.serializer = cVar;
        this.read = parselonglambda0;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final boolean write(String str) {
        RemoteActionCompatParcelizer();
        read();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = read(str);
        if (remoteActionCompatParcelizer == null) {
            return true;
        }
        if (remoteActionCompatParcelizer.serializer >= 20) {
            return false;
        }
        this.RemoteActionCompatParcelizer.getClass();
        return System.currentTimeMillis() - remoteActionCompatParcelizer.IconCompatParcelizer >= remoteActionCompatParcelizer.read;
    }

    public final void serializer(String str) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = read(str);
        if (remoteActionCompatParcelizer != null) {
            this.IconCompatParcelizer.read().remove(remoteActionCompatParcelizer);
        }
        RemoteActionCompatParcelizer();
        read();
    }

    public static ArrayList write(DataStoreProviderExternalSyntheticLambda7 dataStoreProviderExternalSyntheticLambda7) {
        String strWrite = dataStoreProviderExternalSyntheticLambda7.serializer.write(dataStoreProviderExternalSyntheticLambda7.IconCompatParcelizer(), "");
        if (strWrite != null && !strWrite.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            try {
                return r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer.class, strWrite, null);
            } catch (JSONException e) {
                dataStoreProviderExternalSyntheticLambda7.read.IconCompatParcelizer(false, e, "Failed to load failed tile downloads, cached string: ".concat(strWrite), new Object[0]);
                return arrayList;
            }
        }
        return new ArrayList();
    }
}
