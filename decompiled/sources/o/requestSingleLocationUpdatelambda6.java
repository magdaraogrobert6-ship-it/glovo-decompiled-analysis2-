package o;

import android.content.Context;
import com.deliveryhero.fwf_http.ConstantKt;
import com.sentiance.sdk.InjectUsing;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "LogApi")
public class requestSingleLocationUpdatelambda6 extends r8lambdabkLMk0V9hJhnciUMVieoORp5FU implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final parseLonglambda0 MediaSessionCompatQueueItem;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs write;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x008e: MOVE (r3 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:23:0x008e */
    public final r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 IconCompatParcelizer(_init_lambda00 _init_lambda00Var) {
        BufferedOutputStream bufferedOutputStream;
        Closeable closeable;
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = this.write.write().RemoteActionCompatParcelizer();
        parseLonglambda0 parselonglambda0 = this.MediaSessionCompatQueueItem;
        Closeable closeable2 = null;
        if (r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer == null) {
            parselonglambda0.RemoteActionCompatParcelizer("No AuthInfo available", new Object[0]);
            return null;
        }
        String strMediaSessionCompatQueueItem = r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.MediaSessionCompatQueueItem();
        if (strMediaSessionCompatQueueItem == null) {
            parselonglambda0.RemoteActionCompatParcelizer("AuthInfo is missing token", new Object[0]);
            return null;
        }
        File file = new File(this.serializer.getFilesDir(), "sentiance-temp");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, UUID.randomUUID().toString());
        long jMax = Math.max(1048576L, 917504L);
        try {
            try {
                r8lambdaujGFpmi7tOUJzXs5dynQk5H9TcA r8lambdaujgfpmi7toujzxs5dynqk5h9tca = new r8lambdaujGFpmi7tOUJzXs5dynQk5H9TcA(new FileOutputStream(file2, false));
                bufferedOutputStream = new BufferedOutputStream(new GZIPOutputStream(r8lambdaujgfpmi7toujzxs5dynqk5h9tca, 8192));
                try {
                    parselonglambda0.IconCompatParcelizer("Writing events to the output stream", new Object[0]);
                    while (_init_lambda00Var.hasNext() && r8lambdaujgfpmi7toujzxs5dynqk5h9tca.RemoteActionCompatParcelizer() <= jMax) {
                        bufferedOutputStream.write((byte[]) _init_lambda00Var.next());
                    }
                    migrateMetadataToJson.write(bufferedOutputStream);
                } catch (FileNotFoundException e) {
                    e = e;
                    parselonglambda0.IconCompatParcelizer(false, e, "Failed to open output file", new Object[0]);
                    migrateMetadataToJson.write(bufferedOutputStream);
                    file2 = null;
                } catch (IOException e2) {
                    e = e2;
                    parselonglambda0.IconCompatParcelizer(false, e, "Failed to write output", new Object[0]);
                    migrateMetadataToJson.write(bufferedOutputStream);
                    file2 = null;
                } catch (NoSuchElementException e3) {
                    e = e3;
                    parselonglambda0.IconCompatParcelizer(false, e, "Unexpected end of iteration", new Object[0]);
                    migrateMetadataToJson.write(bufferedOutputStream);
                    file2 = null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                migrateMetadataToJson.write(closeable2);
                throw th;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
            bufferedOutputStream = null;
        } catch (IOException e5) {
            e = e5;
            bufferedOutputStream = null;
        } catch (NoSuchElementException e6) {
            e = e6;
            bufferedOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            migrateMetadataToJson.write(closeable2);
            throw th;
        }
        if (file2 == null) {
            parselonglambda0.IconCompatParcelizer("Failed to prepare output file", new Object[0]);
            return null;
        }
        requestSingleLocationUpdatelambda40 requestsinglelocationupdatelambda40 = new requestSingleLocationUpdatelambda40(this, file2);
        String strSerializer = this.IconCompatParcelizer.serializer();
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release = new setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release();
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.RemoteActionCompatParcelizer(strSerializer.concat("logs"));
        GooglePlayLocationUtils googlePlayLocationUtils = this.RemoteActionCompatParcelizer;
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer(ConstantKt.USER_AGENT_HEADER, googlePlayLocationUtils.write());
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Date", googlePlayLocationUtils.read());
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Sentiance-User", r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.serializer());
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Authorization", "Bearer ".concat(strMediaSessionCompatQueueItem));
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer("POST", requestsinglelocationupdatelambda40);
        return this.read.RemoteActionCompatParcelizer(setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.write());
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        File file = new File(this.serializer.getFilesDir(), "sentiance-temp");
        if (!file.exists()) {
            file.mkdir();
        }
        File[] fileArrListFiles = file.listFiles();
        for (int i = 0; fileArrListFiles != null && i < fileArrListFiles.length; i++) {
            fileArrListFiles[i].delete();
        }
    }

    public requestSingleLocationUpdatelambda6(Context context, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, parseLonglambda0 parselonglambda0, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        super(context, getlastknowngpslocationifvalidlambda0, googlePlayLocationUtils, registergeofenceswithgoogleplayifnecessarylambda10);
        this.write = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.MediaSessionCompatQueueItem = parselonglambda0;
    }

    public final void write() {
        File file = new File(this.serializer.getFilesDir(), "sentiance-temp");
        if (!file.exists()) {
            file.mkdir();
        }
        File[] fileArrListFiles = file.listFiles();
        for (int i = 0; fileArrListFiles != null && i < fileArrListFiles.length; i++) {
            fileArrListFiles[i].delete();
        }
    }
}
