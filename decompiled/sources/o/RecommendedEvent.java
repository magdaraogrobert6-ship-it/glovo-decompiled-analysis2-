package o;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.InjectUsing;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "UserMetadataJournal")
public class RecommendedEvent implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final Context IconCompatParcelizer;
    private LinkedHashSet<String> read;
    private final parseLonglambda0 write;

    private void read() {
        synchronized (this) {
            try {
                readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(getResourceIdentifier.serializer(write()));
                Iterator<String> it = serializer().iterator();
                while (it.hasNext()) {
                    readresourcevaluelambda2.serializer(it.next());
                    readresourcevaluelambda2.serializer("\n");
                }
                readresourcevaluelambda2.close();
            } catch (IOException e) {
                this.write.IconCompatParcelizer(false, e, "Failed to save metadata journal", new Object[0]);
            }
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        synchronized (this) {
            serializer().clear();
            write().delete();
        }
    }

    public final boolean write(String str) {
        boolean zContains;
        synchronized (this) {
            synchronized (this) {
                LinkedHashSet<String> linkedHashSetSerializer = serializer();
                java.util.Locale locale = java.util.Locale.ENGLISH;
                zContains = linkedHashSetSerializer.contains("del:".concat(str));
            }
        }
        if (zContains) {
            return false;
        }
        IconCompatParcelizer(str);
        serializer().add("del:".concat(str));
        read();
        return true;
    }

    public final boolean write(String str, String str2) {
        boolean zContains;
        synchronized (this) {
            synchronized (this) {
                zContains = serializer().contains(IconCompatParcelizer(str, str2));
            }
        }
        if (zContains) {
            return false;
        }
        synchronized (this) {
            LinkedHashSet<String> linkedHashSetSerializer = serializer();
            java.util.Locale locale = java.util.Locale.ENGLISH;
            linkedHashSetSerializer.remove("del:".concat(str));
            IconCompatParcelizer(str);
            serializer().add(IconCompatParcelizer(str, str2));
            read();
        }
        return true;
    }

    private void IconCompatParcelizer(String str) {
        synchronized (this) {
            String strIconCompatParcelizer = IconCompatParcelizer(str, null);
            for (String str2 : new ArrayList(serializer())) {
                if (str2.contains(strIconCompatParcelizer)) {
                    serializer().remove(str2);
                }
            }
        }
    }

    public RecommendedEvent(Context context, parseLonglambda0 parselonglambda0) {
        this.IconCompatParcelizer = context;
        this.write = parselonglambda0;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.singletonList(write());
    }

    private LinkedHashSet<String> serializer() {
        if (this.read == null) {
            this.read = new LinkedHashSet<>();
            File fileWrite = write();
            if (fileWrite.exists()) {
                try {
                    isSdkAuthenticationEnabled issdkauthenticationenabledIconCompatParcelizer = getResourceIdentifier.IconCompatParcelizer(fileWrite);
                    r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                    r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(issdkauthenticationenabledIconCompatParcelizer);
                    this.read = new LinkedHashSet<>(Arrays.asList(r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer().split("\n")));
                } catch (IOException e) {
                    this.write.IconCompatParcelizer(false, e, "Failed to load metadata journal", new Object[0]);
                }
            }
        }
        return this.read;
    }

    private File write() {
        return new File(this.IconCompatParcelizer.getNoBackupFilesDir(), "sentiance-user-metadata");
    }

    private static String IconCompatParcelizer(String str, String str2) {
        if (str2 != null) {
            java.util.Locale locale = java.util.Locale.ENGLISH;
            return af$$ExternalSyntheticOutline0.m("add:", str, ":", str2);
        }
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        return ff$$ExternalSyntheticOutline0.m("add:", str, ":");
    }
}
