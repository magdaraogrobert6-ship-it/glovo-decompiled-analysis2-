package o;

import android.util.Log;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class isPlacedui {
    public static final Charset IconCompatParcelizer = Charset.forName(com.adjust.sdk.Constants.ENCODING);
    public final androidx.work.impl.WorkerWrapper.Builder write;

    public static ArrayList RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(onNodePlacedui.serializer(string));
            } catch (Exception e) {
                SentryLogcatAdapter.write("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static HashMap serializer(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static String write(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(onNodePlacedui.MediaMetadataCompat.IconCompatParcelizer(list.get(i))));
            } catch (JSONException e) {
                SentryLogcatAdapter.write("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    public final String IconCompatParcelizer(String str) {
        FileInputStream fileInputStreamWrite;
        File fileRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(str, "user-data");
        ?? r5 = 0;
        if (fileRemoteActionCompatParcelizer.exists()) {
            ?? r2 = (fileRemoteActionCompatParcelizer.length() > 0L ? 1 : (fileRemoteActionCompatParcelizer.length() == 0L ? 0 : -1));
            try {
                if (r2 != 0) {
                    try {
                        fileInputStreamWrite = getActiveFocusTargetNode.write(fileRemoteActionCompatParcelizer, new FileInputStream(fileRemoteActionCompatParcelizer));
                        try {
                            JSONObject jSONObject = new JSONObject(accessgetOuterCoordinator.RemoteActionCompatParcelizer(fileInputStreamWrite));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            accessgetOuterCoordinator.IconCompatParcelizer(fileInputStreamWrite, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e) {
                            e = e;
                            SentryLogcatAdapter.write("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            RemoteActionCompatParcelizer(fileRemoteActionCompatParcelizer);
                            accessgetOuterCoordinator.IconCompatParcelizer(fileInputStreamWrite, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStreamWrite = null;
                    } catch (Throwable th) {
                        th = th;
                        accessgetOuterCoordinator.IconCompatParcelizer(r5, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r5 = r2;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        RemoteActionCompatParcelizer(fileRemoteActionCompatParcelizer);
        return null;
    }

    public final void read(String str, String str2) {
        BufferedWriter bufferedWriter;
        File fileRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                getNeedsToBePlacedInApproach getneedstobeplacedinapproach = new getNeedsToBePlacedInApproach();
                getneedstobeplacedinapproach.put("userId", str2);
                String string = getneedstobeplacedinapproach.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(getPositionInRoot.write(new FileOutputStream(fileRemoteActionCompatParcelizer), fileRemoteActionCompatParcelizer), IconCompatParcelizer));
                try {
                    bufferedWriter.write(string);
                    bufferedWriter.flush();
                    accessgetOuterCoordinator.IconCompatParcelizer(bufferedWriter, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter2 = bufferedWriter;
                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    accessgetOuterCoordinator.IconCompatParcelizer(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    accessgetOuterCoordinator.IconCompatParcelizer(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter = bufferedWriter2;
        }
    }

    public final void read(String str, List list) {
        File fileRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(str, "rollouts-state");
        if (list.isEmpty()) {
            if (fileRemoteActionCompatParcelizer.exists() && fileRemoteActionCompatParcelizer.delete()) {
                fileRemoteActionCompatParcelizer.getAbsolutePath();
                return;
            }
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strWrite = write(list);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(getPositionInRoot.write(new FileOutputStream(fileRemoteActionCompatParcelizer), fileRemoteActionCompatParcelizer), IconCompatParcelizer));
                try {
                    bufferedWriter2.write(strWrite);
                    bufferedWriter2.flush();
                    accessgetOuterCoordinator.IconCompatParcelizer(bufferedWriter2, "Failed to close rollouts state file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    RemoteActionCompatParcelizer(fileRemoteActionCompatParcelizer);
                    accessgetOuterCoordinator.IconCompatParcelizer(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    accessgetOuterCoordinator.IconCompatParcelizer(bufferedWriter, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Map serializer(String str, boolean z) {
        androidx.work.impl.WorkerWrapper.Builder builder = this.write;
        File fileRemoteActionCompatParcelizer = z ? builder.RemoteActionCompatParcelizer(str, "internal-keys") : builder.RemoteActionCompatParcelizer(str, "keys");
        if (!fileRemoteActionCompatParcelizer.exists() || fileRemoteActionCompatParcelizer.length() == 0) {
            if (fileRemoteActionCompatParcelizer.exists() && fileRemoteActionCompatParcelizer.delete()) {
                fileRemoteActionCompatParcelizer.getAbsolutePath();
            }
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStreamWrite = null;
        try {
            fileInputStreamWrite = getActiveFocusTargetNode.write(fileRemoteActionCompatParcelizer, new FileInputStream(fileRemoteActionCompatParcelizer));
            return serializer(accessgetOuterCoordinator.RemoteActionCompatParcelizer(fileInputStreamWrite));
        } catch (Exception e) {
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Error deserializing user metadata.", e);
            RemoteActionCompatParcelizer(fileRemoteActionCompatParcelizer);
            return Collections.EMPTY_MAP;
        } finally {
            accessgetOuterCoordinator.IconCompatParcelizer(fileInputStreamWrite, "Failed to close user metadata file.");
        }
    }

    public final void write(String str, Map map, boolean z) {
        androidx.work.impl.WorkerWrapper.Builder builder = this.write;
        File fileRemoteActionCompatParcelizer = z ? builder.RemoteActionCompatParcelizer(str, "internal-keys") : builder.RemoteActionCompatParcelizer(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(getPositionInRoot.write(new FileOutputStream(fileRemoteActionCompatParcelizer), fileRemoteActionCompatParcelizer), IconCompatParcelizer));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    accessgetOuterCoordinator.IconCompatParcelizer(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    RemoteActionCompatParcelizer(fileRemoteActionCompatParcelizer);
                    accessgetOuterCoordinator.IconCompatParcelizer(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    accessgetOuterCoordinator.IconCompatParcelizer(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public isPlacedui(androidx.work.impl.WorkerWrapper.Builder builder) {
        this.write = builder;
    }

    public static void RemoteActionCompatParcelizer(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }
}
