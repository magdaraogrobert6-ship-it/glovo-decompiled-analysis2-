package o;

import android.content.Context;
import com.deliveryhero.fwf_http.ConstantKt;
import com.sentiance.sdk.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class requestSingleLocationUpdatelambda4 extends r8lambdabkLMk0V9hJhnciUMVieoORp5FU {
    final r8lambdaw447glWJfoun4bg91upXnaDQEZs write;

    public class write {
        public write(requestSingleLocationUpdatelambda4 requestsinglelocationupdatelambda4) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0075  */
    public final setSessionTimeout read(InputStream inputStream, boolean z, boolean z2, String str, Byte b) {
        requestSingleLocationUpdatelambda5 requestsinglelocationupdatelambda5 = new requestSingleLocationUpdatelambda5(this, inputStream, z);
        String strSerializer = this.IconCompatParcelizer.serializer();
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release = new setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release();
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.RemoteActionCompatParcelizer(strSerializer.concat("data/payloads"));
        GooglePlayLocationUtils googlePlayLocationUtils = this.RemoteActionCompatParcelizer;
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer(ConstantKt.USER_AGENT_HEADER, googlePlayLocationUtils.write());
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Date", googlePlayLocationUtils.read());
        if (str != null) {
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("sentiance-thrift-schema-version", str);
        }
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite = this.write.write();
        if (optionalWrite.IconCompatParcelizer()) {
            String strMediaSessionCompatQueueItem = optionalWrite.write().MediaSessionCompatQueueItem();
            if (strMediaSessionCompatQueueItem == null) {
                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release = null;
            } else {
                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Sentiance-User", optionalWrite.write().serializer());
                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.IconCompatParcelizer("Authorization", "Bearer ".concat(strMediaSessionCompatQueueItem));
                if (b != null) {
                    setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Sentiance-Payload-Type", b.toString());
                }
            }
        } else if (b != null) {
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Sentiance-Payload-Type", b.toString());
        }
        if (setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release == null) {
            return null;
        }
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer("POST", requestsinglelocationupdatelambda5);
        if (z2) {
            write writeVar = new write(this);
            if (setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.IconCompatParcelizer.isEmpty()) {
                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.IconCompatParcelizer = new LinkedHashMap();
            }
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.IconCompatParcelizer.put(Object.class, Object.class.cast(writeVar));
        }
        return setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.write();
    }

    public requestSingleLocationUpdatelambda4(Context context, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        super(context, getlastknowngpslocationifvalidlambda0, googlePlayLocationUtils, registergeofenceswithgoogleplayifnecessarylambda10);
        this.write = r8lambdaw447glwjfoun4bg91upxnadqezs;
    }

    public final r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 write(File file, boolean z, String str, Byte b) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        setSessionTimeout setsessiontimeout = read(fileInputStream, file.getName().endsWith(".gz"), z, str, b);
        if (setsessiontimeout == null) {
            migrateMetadataToJson.write(fileInputStream);
            return null;
        }
        return this.read.RemoteActionCompatParcelizer(setsessiontimeout);
    }
}
