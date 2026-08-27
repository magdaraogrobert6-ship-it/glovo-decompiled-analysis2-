package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.ondevice.datasyncing.upload.DataSyncRequestUploader$enqueueNextChunk$notifyOfSuccess$1;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "DataSyncRequestUploader")
public final class r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s {
    private final r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 IconCompatParcelizer;
    private final r8lambda82wFrWs2p1d2rHZgArdpjkmWRs MediaDescriptionCompat;
    private final retrieveRegisteredGeofencesFromLocalStoragelambda0 MediaMetadataCompat;
    private final isGeofencesEnabledFromEnvironmentlambda1 RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final r8lambdaFGoaxsGDOtP1gX0eI2CnTKEnY5o read;
    private final readandroid_sdk_base_release serializer;
    private final r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI write;

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final class RemoteActionCompatParcelizer extends r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE {
        final /* synthetic */ r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s RemoteActionCompatParcelizer;
        private final r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4.read read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s, r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4.read readVar) {
            super(r8lambdaezb9gs4ufatot1smgrrnpet3m3s.serializer);
            readVar.getClass();
            this.RemoteActionCompatParcelizer = r8lambdaezb9gs4ufatot1smgrrnpet3m3s;
            this.read = readVar;
        }

        @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
        public final void IconCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
            iOException.getClass();
            r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4.read readVar = this.read;
            readVar.write();
            r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s.serializer(this.RemoteActionCompatParcelizer, "Chunk with ID " + readVar.read() + " failed", iOException);
        }

        @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
        public final void write(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) {
            setshouldpersistwebviewwhenbackgroundingapp.getClass();
            r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4.read readVar = this.read;
            readVar.write();
            int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
            r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s = this.RemoteActionCompatParcelizer;
            if (i != 200) {
                String strM = c8$$ExternalSyntheticOutline0.m(i, "Received response with http code ");
                r8lambdaezb9gs4ufatot1smgrrnpet3m3s.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(strM, new Object[0]);
                r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s.write(r8lambdaezb9gs4ufatot1smgrrnpet3m3s, strM);
                return;
            }
            if (setsmallnotificationiconnameandroid_sdk_base_release != null) {
                try {
                    JSONObject jSONObject = new JSONObject(setsmallnotificationiconnameandroid_sdk_base_release.serializer());
                    if (jSONObject.has("ref")) {
                        String string = jSONObject.getString("ref");
                        string.getClass();
                        r8lambdaezb9gs4ufatot1smgrrnpet3m3s.RemoteActionCompatParcelizer.serializer("Payloads have been successfully uploaded, ref ID: ".concat(string), new Object[0]);
                    }
                } catch (IOException e) {
                    r8lambdaezb9gs4ufatot1smgrrnpet3m3s.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to read the response", new Object[0]);
                } catch (JSONException e2) {
                    r8lambdaezb9gs4ufatot1smgrrnpet3m3s.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e2, "Failed to parse response JSON", new Object[0]);
                }
            }
            r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s.RemoteActionCompatParcelizer(r8lambdaezb9gs4ufatot1smgrrnpet3m3s, readVar.serializer());
            r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s.RemoteActionCompatParcelizer(r8lambdaezb9gs4ufatot1smgrrnpet3m3s);
        }

        @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
        public final void IconCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, IOException iOException) {
            setshouldpersistwebviewwhenbackgroundingapp.getClass();
            r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4.read readVar = this.read;
            readVar.write();
            r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s.serializer(this.RemoteActionCompatParcelizer, "Chunk with ID " + readVar.read() + " failed", iOException);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if ((r1.read() == 2 ? r12.MediaMetadataCompat.RemoteActionCompatParcelizer() : r1.RatingCompat()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RemoteActionCompatParcelizer() {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s.RemoteActionCompatParcelizer():void");
    }

    static {
        new serializer(null);
    }

    public r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s(r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI r8lambda43c3j9_07_y35qq6grmdmadkbhi, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaFGoaxsGDOtP1gX0eI2CnTKEnY5o r8lambdafgoaxsgdotp1gx0ei2cntkeny5o, parseLonglambda0 parselonglambda0, r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4, retrieveRegisteredGeofencesFromLocalStoragelambda0 retrieveregisteredgeofencesfromlocalstoragelambda0, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, r8lambda82wFrWs2p1d2rHZgArdpjkmWRs r8lambda82wfrws2p1d2rhzgardpjkmwrs) {
        r8lambda43c3j9_07_y35qq6grmdmadkbhi.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        r8lambdafgoaxsgdotp1gx0ei2cntkeny5o.getClass();
        parselonglambda0.getClass();
        r8lambda8nvscop5x9zktelkhscw8l8y0f4.getClass();
        retrieveregisteredgeofencesfromlocalstoragelambda0.getClass();
        isgeofencesenabledfromenvironmentlambda1.getClass();
        r8lambda82wfrws2p1d2rhzgardpjkmwrs.getClass();
        this.write = r8lambda43c3j9_07_y35qq6grmdmadkbhi;
        this.serializer = readandroid_sdk_base_releaseVar;
        this.read = r8lambdafgoaxsgdotp1gx0ei2cntkeny5o;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.IconCompatParcelizer = r8lambda8nvscop5x9zktelkhscw8l8y0f4;
        this.MediaMetadataCompat = retrieveregisteredgeofencesfromlocalstoragelambda0;
        this.RatingCompat = isgeofencesenabledfromenvironmentlambda1;
        this.MediaDescriptionCompat = r8lambda82wfrws2p1d2rhzgardpjkmwrs;
    }

    public static final void RemoteActionCompatParcelizer(r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s) {
        Object objInvoke;
        r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4 r8lambda8nvscop5x9zktelkhscw8l8y0f4 = r8lambdaezb9gs4ufatot1smgrrnpet3m3s.IconCompatParcelizer;
        DataSyncRequestUploader$enqueueNextChunk$notifyOfSuccess$1 dataSyncRequestUploader$enqueueNextChunk$notifyOfSuccess$1 = new DataSyncRequestUploader$enqueueNextChunk$notifyOfSuccess$1(r8lambdaezb9gs4ufatot1smgrrnpet3m3s);
        synchronized (r8lambda8nvscop5x9zktelkhscw8l8y0f4) {
            objInvoke = dataSyncRequestUploader$enqueueNextChunk$notifyOfSuccess$1.invoke();
        }
        if (((Boolean) objInvoke).booleanValue()) {
            r8lambdaezb9gs4ufatot1smgrrnpet3m3s.IconCompatParcelizer.MediaMetadataCompat();
            ((r8lambdaJFE_chLd2jQnyQVpk_1hYHN04) r8lambdaezb9gs4ufatot1smgrrnpet3m3s.MediaDescriptionCompat).read(r8lambdaezb9gs4ufatot1smgrrnpet3m3s);
        }
    }

    public static void write(r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s, String str) {
        r8lambdaezb9gs4ufatot1smgrrnpet3m3s.IconCompatParcelizer.IconCompatParcelizer(str, null);
        ((r8lambdaJFE_chLd2jQnyQVpk_1hYHN04) r8lambdaezb9gs4ufatot1smgrrnpet3m3s.MediaDescriptionCompat).RemoteActionCompatParcelizer(r8lambdaezb9gs4ufatot1smgrrnpet3m3s, str, null);
    }

    public static final void serializer(r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s, String str, IOException iOException) {
        r8lambdaezb9gs4ufatot1smgrrnpet3m3s.IconCompatParcelizer.IconCompatParcelizer(str, iOException);
        ((r8lambdaJFE_chLd2jQnyQVpk_1hYHN04) r8lambdaezb9gs4ufatot1smgrrnpet3m3s.MediaDescriptionCompat).RemoteActionCompatParcelizer(r8lambdaezb9gs4ufatot1smgrrnpet3m3s, str, iOException);
    }

    public static final void RemoteActionCompatParcelizer(r8lambdaEZB9Gs4ufAtoT1smgRrnPeT3m3s r8lambdaezb9gs4ufatot1smgrrnpet3m3s, List list) {
        r8lambdaezb9gs4ufatot1smgrrnpet3m3s.write.read(list);
    }
}
