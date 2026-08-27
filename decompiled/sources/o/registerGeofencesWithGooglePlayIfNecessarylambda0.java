package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.Token;
import com.sentiance.sdk.TokenResultCallback;
import com.sentiance.sdk.events.ControlMessage;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TokenRefresher")
public class registerGeofencesWithGooglePlayIfNecessarylambda0 extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 MediaDescriptionCompat = null;
    private final ArrayList MediaSessionCompatQueueItem = new ArrayList();
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final r8lambdaarKgsQr08YXID6Z9_bNQ7eZL9w serializer;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs write;

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac A[Catch: all -> 0x00b8, TryCatch #0 {, blocks: (B:31:0x00a4, B:33:0x00ac, B:34:0x00b1, B:35:0x00b6), top: B:45:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void serializer(TokenResultCallback tokenResultCallback) {
        r8lambda0CqsV9PzHXzu3fvW17nz6eF0Wk r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk;
        r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38IconCompatParcelizer;
        synchronized (this) {
            this.MediaSessionCompatQueueItem.add(tokenResultCallback);
            boolean z = true;
            if (this.MediaSessionCompatQueueItem.size() > 1) {
                this.read.IconCompatParcelizer("Already refreshing", new Object[0]);
                return;
            }
            if (!this.write.RemoteActionCompatParcelizer()) {
                Token tokenRemoteActionCompatParcelizer = this.write.serializer().RemoteActionCompatParcelizer();
                parseLonglambda0 parselonglambda0 = this.read;
                if (tokenRemoteActionCompatParcelizer != null) {
                    parselonglambda0.IconCompatParcelizer("Not refreshing. Token is valid till %s.", com.sentiance.sdk.util.x.b(tokenRemoteActionCompatParcelizer.getExpiryDate()));
                } else {
                    parselonglambda0.RemoteActionCompatParcelizer("Not refreshing. Token is not expired, however fetching the token object failed.", new Object[0]);
                    z = false;
                }
                RemoteActionCompatParcelizer(z);
                return;
            }
            parseLonglambda0 parselonglambda1 = this.read;
            r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = this.write.write().RemoteActionCompatParcelizer();
            if (r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer != null) {
                String strRemoteActionCompatParcelizer = r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                if (strRemoteActionCompatParcelizer == null) {
                    parselonglambda1.IconCompatParcelizer("Refresh token is unavailable", new Object[0]);
                } else {
                    r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk = new r8lambda0CqsV9PzHXzu3fvW17nz6eF0Wk();
                    r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk.RemoteActionCompatParcelizer = "refresh_token";
                    r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk.serializer = "self";
                    r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk.IconCompatParcelizer = strRemoteActionCompatParcelizer;
                }
                if (r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk != null) {
                    this.read.IconCompatParcelizer("Trying to refresh access token", new Object[0]);
                    r8lambda4gsaww0uf5fhes0li0lym_jwy38IconCompatParcelizer = this.serializer.IconCompatParcelizer(r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk);
                    this.MediaDescriptionCompat = r8lambda4gsaww0uf5fhes0li0lym_jwy38IconCompatParcelizer;
                    if (r8lambda4gsaww0uf5fhes0li0lym_jwy38IconCompatParcelizer != null) {
                        this.RemoteActionCompatParcelizer.read();
                        synchronized (this) {
                            if (this.MediaSessionCompatQueueItem.isEmpty()) {
                                this.MediaDescriptionCompat.serializer();
                            }
                            this.MediaDescriptionCompat.serializer(this);
                        }
                        return;
                    }
                }
                RemoteActionCompatParcelizer(false);
            }
            parselonglambda1.IconCompatParcelizer("AuthInfo is missing", new Object[0]);
            r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk = null;
            if (r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk != null) {
                this.read.IconCompatParcelizer("Trying to refresh access token", new Object[0]);
                r8lambda4gsaww0uf5fhes0li0lym_jwy38IconCompatParcelizer = this.serializer.IconCompatParcelizer(r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk);
                this.MediaDescriptionCompat = r8lambda4gsaww0uf5fhes0li0lym_jwy38IconCompatParcelizer;
                if (r8lambda4gsaww0uf5fhes0li0lym_jwy38IconCompatParcelizer != null) {
                    this.RemoteActionCompatParcelizer.read();
                    synchronized (this) {
                        if (this.MediaSessionCompatQueueItem.isEmpty()) {
                            this.MediaDescriptionCompat.serializer();
                        }
                        this.MediaDescriptionCompat.serializer(this);
                        return;
                    }
                }
            }
            RemoteActionCompatParcelizer(false);
        }
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        ArrayList<TokenResultCallback> arrayList;
        Token tokenRemoteActionCompatParcelizer = this.write.serializer().RemoteActionCompatParcelizer();
        synchronized (this) {
            arrayList = new ArrayList(this.MediaSessionCompatQueueItem);
            this.MediaSessionCompatQueueItem.clear();
        }
        this.IconCompatParcelizer.IconCompatParcelizer(ControlMessage.TOKEN_REFRESH_COMPLETE, Boolean.valueOf(z));
        for (TokenResultCallback tokenResultCallback : arrayList) {
            if (tokenResultCallback != null) {
                if (!z || tokenRemoteActionCompatParcelizer == null) {
                    tokenResultCallback.onFailure();
                } else {
                    tokenResultCallback.onSuccess(tokenRemoteActionCompatParcelizer);
                }
            }
        }
    }

    public final boolean write() {
        return this.write.RemoteActionCompatParcelizer();
    }

    public registerGeofencesWithGooglePlayIfNecessarylambda0(parseLonglambda0 parselonglambda0, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, r8lambdaarKgsQr08YXID6Z9_bNQ7eZL9w r8lambdaarkgsqr08yxid6z9_bnq7ezl9w, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4) {
        this.RemoteActionCompatParcelizer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.read = parselonglambda0;
        this.serializer = r8lambdaarkgsqr08yxid6z9_bnq7ezl9w;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.write = r8lambdaw447glwjfoun4bg91upxnadqezs;
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38 = this.MediaDescriptionCompat;
            if (r8lambda4gsaww0uf5fhes0li0lym_jwy38 != null) {
                r8lambda4gsaww0uf5fhes0li0lym_jwy38.serializer();
            }
            this.MediaSessionCompatQueueItem.clear();
        }
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        this.read.IconCompatParcelizer(false, iOException, "Could not refresh the token.", new Object[0]);
        RemoteActionCompatParcelizer(false);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) throws IOException {
        r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = this.write;
        boolean zWrite = setshouldpersistwebviewwhenbackgroundingapp.write();
        parseLonglambda0 parselonglambda0 = this.read;
        boolean z = false;
        if (zWrite && setsmallnotificationiconnameandroid_sdk_base_release != null) {
            try {
                r8lambdaDmZMDlQYQyj8miQcPejJSRaQtLA r8lambdadmzmdlqyqyj8miqcpejjsraqtla = (r8lambdaDmZMDlQYQyj8miQcPejJSRaQtLA) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(r8lambdaDmZMDlQYQyj8miQcPejJSRaQtLA.class, setsmallnotificationiconnameandroid_sdk_base_release.serializer());
                r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs.write().RemoteActionCompatParcelizer();
                if (r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer != null) {
                    r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyWrite = r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.write(new r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA(r8lambdadmzmdlqyqyj8miqcpejjsraqtla.read, r8lambdadmzmdlqyqyj8miqcpejjsraqtla.write, r8lambdadmzmdlqyqyj8miqcpejjsraqtla.IconCompatParcelizer, r8lambdadmzmdlqyqyj8miqcpejjsraqtla.RemoteActionCompatParcelizer));
                    parselonglambda0.serializer("Refreshed authentication successfully", new Object[0]);
                    r8lambdaw447glwjfoun4bg91upxnadqezs.RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqtyWrite);
                    r8lambdaw447glwjfoun4bg91upxnadqezs.read(false);
                    z = true;
                }
            } catch (JSONException e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Couldn't deserialize AuthTokenResponse JSON: " + setsmallnotificationiconnameandroid_sdk_base_release, new Object[0]);
            }
        } else {
            parselonglambda0.write("Could not refresh token: %d %s", Integer.valueOf(setshouldpersistwebviewwhenbackgroundingapp.serializer), setshouldpersistwebviewwhenbackgroundingapp.read);
        }
        RemoteActionCompatParcelizer(z);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }
}
