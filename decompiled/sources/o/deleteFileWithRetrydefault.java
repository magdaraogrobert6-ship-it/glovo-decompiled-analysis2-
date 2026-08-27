package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class deleteFileWithRetrydefault extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I {
    private r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private String read;
    private r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw serializer;
    private final BrazeInternalLocationApiExternalSyntheticLambda4 write;

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) throws IOException {
        String str = this.read;
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        if (str == null || this.serializer == null) {
            parselonglambda0.RemoteActionCompatParcelizer("Cannot process tile url, null request or handler", new Object[0]);
            return;
        }
        int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
        if (setsmallnotificationiconnameandroid_sdk_base_release == null) {
            parselonglambda0.RemoteActionCompatParcelizer("Could not fetch tile url, quadKey: %s, response: %d", str, Integer.valueOf(i));
            this.serializer.serializer(this.read);
            return;
        }
        try {
            if (i == 302) {
                String str2 = setshouldpersistwebviewwhenbackgroundingapp.read("location", null);
                if (str2 == null) {
                    parselonglambda0.RemoteActionCompatParcelizer("Null tile download url for quadKey %s", this.read);
                    this.serializer.serializer(this.read);
                    return;
                }
                r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A r8lambdacsfev_dc3vpb_loeouqdr772i1a = (r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.class, setsmallnotificationiconnameandroid_sdk_base_release.serializer());
                parselonglambda0.IconCompatParcelizer("New tile found, quadKey: " + r8lambdacsfev_dc3vpb_loeouqdr772i1a.RemoteActionCompatParcelizer, new Object[0]);
                this.serializer.read(r8lambdacsfev_dc3vpb_loeouqdr772i1a.serializer, r8lambdacsfev_dc3vpb_loeouqdr772i1a.RemoteActionCompatParcelizer, str2);
                return;
            }
            if (i == 304) {
                parselonglambda0.IconCompatParcelizer("Tile unchanged, quadKey: %s", str);
                this.serializer.RemoteActionCompatParcelizer(this.read);
                return;
            }
            if (i != 200 && i != 202) {
                if (i == 500) {
                    parselonglambda0.IconCompatParcelizer("Failed to fetch tile url, quadKey: %s", str);
                    this.serializer.serializer(this.read);
                    return;
                } else {
                    parselonglambda0.RemoteActionCompatParcelizer("Unknown response code: %s, body: %s", Integer.valueOf(i), setshouldpersistwebviewwhenbackgroundingapp.write.toString());
                    this.serializer.serializer(this.read);
                    return;
                }
            }
            r8lambdaC_pwXX2gXwofDhuWGhli3_lzIlg r8lambdac_pwxx2gxwofdhuwghli3_lzilg = (r8lambdaC_pwXX2gXwofDhuWGhli3_lzIlg) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(r8lambdaC_pwXX2gXwofDhuWGhli3_lzIlg.class, setsmallnotificationiconnameandroid_sdk_base_release.serializer());
            parselonglambda0.IconCompatParcelizer("Tile not ready, %s", r8lambdac_pwxx2gxwofdhuwghli3_lzilg);
            this.serializer.RemoteActionCompatParcelizer(this.read, r8lambdac_pwxx2gxwofdhuwghli3_lzilg.RemoteActionCompatParcelizer);
        } catch (Exception e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Failed to return tile url response", new Object[0]);
            this.serializer.serializer(this.read);
        }
    }

    public deleteFileWithRetrydefault(BrazeInternalLocationApiExternalSyntheticLambda4 brazeInternalLocationApiExternalSyntheticLambda4, parseLonglambda0 parselonglambda0) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.write = brazeInternalLocationApiExternalSyntheticLambda4;
    }

    public final void write() {
        synchronized (this) {
            r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38 = this.IconCompatParcelizer;
            if (r8lambda4gsaww0uf5fhes0li0lym_jwy38 != null) {
                r8lambda4gsaww0uf5fhes0li0lym_jwy38.serializer();
            }
        }
    }

    public final void write(String str, Long l, r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw r8lambdaudd4yj05v3iuqbjewtce3mt1riw) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("Fetching tile url, quadKey: %s", str);
            this.read = str;
            this.serializer = r8lambdaudd4yj05v3iuqbjewtce3mt1riw;
            r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38 = this.write.read(str, l);
            this.IconCompatParcelizer = r8lambda4gsaww0uf5fhes0li0lym_jwy38;
            if (r8lambda4gsaww0uf5fhes0li0lym_jwy38 == null) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Failed to create tile url request for quadKey: %s", str);
                r8lambdaudd4yj05v3iuqbjewtce3mt1riw.IconCompatParcelizer(str);
            } else {
                r8lambda4gsaww0uf5fhes0li0lym_jwy38.serializer(this);
            }
        }
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        String str;
        if (this.serializer == null || (str = this.read) == null) {
            return;
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(false, iOException, "Failed to request tile url, quadKey: %s", str);
        this.serializer.IconCompatParcelizer(this.read);
    }
}
