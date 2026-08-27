package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.Token;
import com.sentiance.sdk.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "auth", componentName = "AuthenticationStore")
public class r8lambdaw447glWJfoun4bg91upXnaDQEZs implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final parseLonglambda0 IconCompatParcelizer;
    private final com.sentiance.sdk.util.c RemoteActionCompatParcelizer;
    private final Context read;
    private final r8lambdab_WHuxf3SooUEuHEJHMkpJa5yXU serializer;
    private r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY write;

    public final void RemoteActionCompatParcelizer(r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty) {
        synchronized (this) {
            this.write = r8lambdazcbg_e0hjusjy78mvgh54swzqty;
            if (this.serializer.write(r8lambdazcbg_e0hjusjy78mvgh54swzqty, this.IconCompatParcelizer) && r8lambdazcbg_e0hjusjy78mvgh54swzqty.MediaMetadataCompat()) {
                File fileMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
                if (!fileMediaSessionCompatQueueItem.exists()) {
                    try {
                        fileMediaSessionCompatQueueItem.createNewFile();
                    } catch (IOException e) {
                        this.IconCompatParcelizer.IconCompatParcelizer(false, e, "Couldn't create user creation indicator file", new Object[0]);
                    }
                }
            }
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.write = null;
        this.RemoteActionCompatParcelizer.read();
        File fileMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        if (fileMediaSessionCompatQueueItem.exists()) {
            fileMediaSessionCompatQueueItem.delete();
        }
    }

    public final Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> write() {
        synchronized (this) {
            r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty = this.write;
            if (r8lambdazcbg_e0hjusjy78mvgh54swzqty != null) {
                return Optional.RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqty);
            }
            r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyWrite = this.serializer.write(this.IconCompatParcelizer);
            this.write = r8lambdazcbg_e0hjusjy78mvgh54swzqtyWrite;
            return Optional.write(r8lambdazcbg_e0hjusjy78mvgh54swzqtyWrite);
        }
    }

    private File MediaSessionCompatQueueItem() {
        File file = new File(this.read.getNoBackupFilesDir(), "com.sentiance.sdk/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "user_creation_complete");
    }

    public r8lambdaw447glWJfoun4bg91upXnaDQEZs(parseLonglambda0 parselonglambda0, com.sentiance.sdk.util.c cVar, Context context, r8lambdamEp_QGMYezwiSNzVd9Swq1T_VCU r8lambdamep_qgmyezwisnzvd9swq1t_vcu) {
        this.read = context;
        this.IconCompatParcelizer = parselonglambda0;
        this.RemoteActionCompatParcelizer = cVar;
        this.serializer = new r8lambdab_WHuxf3SooUEuHEJHMkpJa5yXU(cVar, r8lambdamep_qgmyezwisnzvd9swq1t_vcu);
    }

    public final Optional<String> read() {
        return Optional.write(this.RemoteActionCompatParcelizer.write("credappid", (String) null));
    }

    public final boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.read("tokenexpired", false);
    }

    public final boolean MediaDescriptionCompat() {
        if (MediaSessionCompatQueueItem().exists()) {
            return true;
        }
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = write().RemoteActionCompatParcelizer();
        boolean z = r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer != null && r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.MediaMetadataCompat();
        if (z) {
            File fileMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
            if (!fileMediaSessionCompatQueueItem.exists()) {
                try {
                    fileMediaSessionCompatQueueItem.createNewFile();
                    return z;
                } catch (IOException e) {
                    this.IconCompatParcelizer.IconCompatParcelizer(false, e, "Couldn't create user creation indicator file", new Object[0]);
                }
            }
        }
        return z;
    }

    public final boolean RemoteActionCompatParcelizer() {
        Token tokenRemoteActionCompatParcelizer = serializer().RemoteActionCompatParcelizer();
        if (IconCompatParcelizer()) {
            return true;
        }
        return tokenRemoteActionCompatParcelizer != null && tokenRemoteActionCompatParcelizer.isExpired();
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.singletonList(MediaSessionCompatQueueItem());
    }

    public final Optional<Token> serializer() {
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite = write();
        if (optionalWrite.read()) {
            return Optional.MediaSessionCompatQueueItem();
        }
        r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa = optionalWrite.write().RatingCompat().read();
        parseLonglambda0 parselonglambda0 = this.IconCompatParcelizer;
        if (r8lambdazgdcm_k4mtbwe6bmdwjk2beesa == null) {
            parselonglambda0.IconCompatParcelizer("Token info is unavailable", new Object[0]);
            return Optional.MediaSessionCompatQueueItem();
        }
        Date dateA = com.sentiance.sdk.util.x.a(r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.serializer());
        if (dateA == null) {
            dateA = com.sentiance.sdk.util.x.RemoteActionCompatParcelizer();
        }
        Token token = new Token(r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.read(), dateA);
        parselonglambda0.IconCompatParcelizer("Token expires on %s", com.sentiance.sdk.util.x.b(token.getExpiryDate()));
        return Optional.RemoteActionCompatParcelizer(token);
    }

    public final void serializer(String str) {
        com.sentiance.sdk.util.c cVar = this.RemoteActionCompatParcelizer;
        if (cVar.write("credsecret")) {
            cVar.read("credsecret");
        }
        if (read().IconCompatParcelizer()) {
            return;
        }
        cVar.RemoteActionCompatParcelizer("credappid", str);
    }

    public final void read(boolean z) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer("tokenexpired", z);
    }
}
