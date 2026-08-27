package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.EventDeserializationException;
import java.io.File;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ThriftLogger")
public class component4android_sdk_base_release implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final Context IconCompatParcelizer;
    private final parseLonglambda0 read;
    private File serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;

    public component4android_sdk_base_release(Context context, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.IconCompatParcelizer = context;
        this.read = parselonglambda0;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.serializer = RemoteActionCompatParcelizer();
        File file = new File(context.getFilesDir(), "events");
        File file2 = new File(context.getNoBackupFilesDir(), "sentiance-events");
        try {
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file3, new File(file2, file3.getName()));
                    }
                    for (File file4 : fileArrListFiles) {
                        file4.delete();
                    }
                }
                file.delete();
            }
        } catch (IOException e) {
            this.serializer = new File(this.IconCompatParcelizer.getFilesDir(), "events");
            this.read.IconCompatParcelizer(false, e, "Failed to copy payload files to the no-backup dir.", new Object[0]);
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.singletonList(RemoteActionCompatParcelizer());
    }

    public final File RemoteActionCompatParcelizer() {
        if (this.serializer == null) {
            this.serializer = new File(this.IconCompatParcelizer.getNoBackupFilesDir(), "sentiance-events");
        }
        if (!this.serializer.exists()) {
            this.serializer.mkdir();
        }
        return this.serializer;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        File fileRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        if (fileRemoteActionCompatParcelizer.listFiles() != null) {
            arrayList.addAll(Arrays.asList(fileRemoteActionCompatParcelizer.listFiles()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        RemoteActionCompatParcelizer().delete();
    }

    public static r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU a(int i, File file) throws EventDeserializationException {
        if (!file.exists()) {
            return null;
        }
        r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE r8lambdao3_bo_8zvdrigycl2l6jayoawe = r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU.read;
        try {
            properties_delegatelambda0 properties_delegatelambda0Var = new properties_delegatelambda0(file, "r");
            properties_delegatelambda0Var.seek(((long) i) + 4);
            r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ r8lambdaajvt3gxgjaliojuptnhztnfupq = new r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ(new r8lambdactPImk7nPmPQDeegHjgpfDqwpkI(Channels.newInputStream(properties_delegatelambda0Var.getChannel())));
            try {
                r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k = (r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k) r8lambdao3_bo_8zvdrigycl2l6jayoawe.RemoteActionCompatParcelizer(r8lambdaajvt3gxgjaliojuptnhztnfupq);
                r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
                return (r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
            } catch (Throwable th) {
                try {
                    r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            throw new EventDeserializationException("Failed to read the event", e);
        }
    }

    public static int write(r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k, r8lambdaQerpUnSf6AWv6hiw4VCR1aIOf0 r8lambdaqerpunsf6awv6hiw4vcr1aiof0, readResourceValuelambda2 readresourcevaluelambda2) throws IOException {
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
        r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ r8lambdaajvt3gxgjaliojuptnhztnfupq = new r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ(new r8lambdaTlqvW4KpMdTE6ntJJ3lie_ZvAAQ(r8lambdabeyrnr8p6809bwlboro_stans));
        r8lambdaqerpunsf6awv6hiw4vcr1aiof0.read(r8lambdaajvt3gxgjaliojuptnhztnfupq, r8lambdanclnumohj3w_eprkcj4qjg7b2k);
        r8lambdaajvt3gxgjaliojuptnhztnfupq.MediaSessionCompatQueueItem();
        r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
        int i = (int) r8lambdabeyrnr8p6809bwlboro_stans.serializer;
        readresourcevaluelambda2.MediaMetadataCompat(i);
        readresourcevaluelambda2.serializer(r8lambdabeyrnr8p6809bwlboro_stans, i);
        return i;
    }

    public final properties_delegatelambda00 read(r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu, int i) throws IOException {
        properties_delegatelambda00 properties_delegatelambda00Var;
        synchronized (this) {
            File file = read(i);
            readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(getResourceIdentifier.write(file));
            int length = file.exists() ? (int) file.length() : 0;
            int iWrite = write(r8lambdaqtf70aj7a5o7b4yj33reyelsu, r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU.read, readresourcevaluelambda2);
            readresourcevaluelambda2.flush();
            readresourcevaluelambda2.close();
            properties_delegatelambda00Var = new properties_delegatelambda00(length, iWrite, file, i);
        }
        return properties_delegatelambda00Var;
    }

    private File read(int i) {
        java.util.Locale locale = java.util.Locale.ENGLISH;
        this.write.getClass();
        return new File(RemoteActionCompatParcelizer(), "events-" + i + "-" + com.sentiance.sdk.util.x.serializer(System.currentTimeMillis(), "yyyyMMddHH"));
    }
}
