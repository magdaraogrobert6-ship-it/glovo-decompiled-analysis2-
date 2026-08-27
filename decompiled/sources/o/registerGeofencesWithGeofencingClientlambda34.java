package o;

import android.text.TextUtils;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class registerGeofencesWithGeofencingClientlambda34 extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I {
    private final setEmaillambda0 IconCompatParcelizer;
    private final requestSingleLocationUpdateFromGooglePlaylambda30 MediaBrowserCompatMediaItem;
    private r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY MediaMetadataCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs read;
    private final registerGeofencesWithGeofencingClientlambda32 serializer;
    private final parseLonglambda0 write;

    public registerGeofencesWithGeofencingClientlambda34(registerGeofencesWithGeofencingClientlambda32 registergeofenceswithgeofencingclientlambda32, setEmaillambda0 setemaillambda0, parseLonglambda0 parselonglambda0, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty, requestSingleLocationUpdateFromGooglePlaylambda30 requestsinglelocationupdatefromgoogleplaylambda30, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = parselonglambda0;
        this.MediaMetadataCompat = r8lambdazcbg_e0hjusjy78mvgh54swzqty;
        this.read = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.serializer = registergeofenceswithgeofencingclientlambda32;
        this.IconCompatParcelizer = setemaillambda0;
        this.MediaBrowserCompatMediaItem = requestsinglelocationupdatefromgoogleplaylambda30;
    }

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) throws IOException {
        String strSerializer;
        JSONObject jSONObject;
        Boolean boolValueOf;
        parseLonglambda0 parselonglambda0 = this.write;
        if (setsmallnotificationiconnameandroid_sdk_base_release != null) {
            try {
                strSerializer = setsmallnotificationiconnameandroid_sdk_base_release.serializer();
            } catch (IOException unused) {
                strSerializer = "";
            }
        } else {
            strSerializer = "";
        }
        boolean zWrite = setshouldpersistwebviewwhenbackgroundingapp.write();
        String str = setshouldpersistwebviewwhenbackgroundingapp.read;
        registerGeofencesWithGeofencingClientlambda32 registergeofenceswithgeofencingclientlambda32 = this.serializer;
        if (zWrite && !strSerializer.isEmpty()) {
            String string = null;
            boolean z = false;
            try {
                jSONObject = new JSONObject(strSerializer);
            } catch (JSONException e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Could not get person id. Failed to parse response: %s", strSerializer);
                jSONObject = null;
            }
            if (jSONObject != null) {
                if (jSONObject.has("is_active")) {
                    try {
                        boolValueOf = Boolean.valueOf(jSONObject.getBoolean("is_active"));
                    } catch (JSONException e2) {
                        parselonglambda0.IconCompatParcelizer(false, e2, "Failed to get is_active", new Object[0]);
                        boolValueOf = null;
                    }
                } else {
                    boolValueOf = null;
                }
                if (boolValueOf == null) {
                    parselonglambda0.IconCompatParcelizer("No is_active field in the response.", new Object[0]);
                    boolValueOf = Boolean.FALSE;
                } else if (!boolValueOf.booleanValue()) {
                    parselonglambda0.IconCompatParcelizer("User is not active.", new Object[0]);
                }
                boolean zBooleanValue = boolValueOf.booleanValue();
                setEmaillambda0 setemaillambda0Serializer = this.IconCompatParcelizer;
                if (!zBooleanValue) {
                    setDateOfBirthlambda0 setdateofbirthlambda0 = new setDateOfBirthlambda0(setemaillambda0Serializer);
                    setdateofbirthlambda0.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = "halt_indefinitely";
                    setemaillambda0Serializer = setdateofbirthlambda0.serializer();
                }
                this.MediaBrowserCompatMediaItem.write(setemaillambda0Serializer);
                try {
                    if (jSONObject.has("person_id") && jSONObject.get("person_id") != JSONObject.NULL) {
                        string = jSONObject.getString("person_id");
                    }
                } catch (JSONException e3) {
                    parselonglambda0.IconCompatParcelizer(false, e3, "Failed to get person_id", new Object[0]);
                }
                if (string != null) {
                    String strWrite = this.MediaMetadataCompat.write();
                    try {
                        if (jSONObject.has("third_party_linked") && jSONObject.get("third_party_linked") != JSONObject.NULL) {
                            z = jSONObject.getBoolean("third_party_linked");
                        }
                    } catch (JSONException e4) {
                        parselonglambda0.IconCompatParcelizer(false, e4, "Failed to get third_party_linked", new Object[0]);
                    }
                    r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = this.MediaMetadataCompat.RemoteActionCompatParcelizer(new r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M(strWrite, string, z, this.MediaMetadataCompat.MediaMetadataCompat()));
                    this.MediaMetadataCompat = r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer;
                    this.read.RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer);
                    if (this.RemoteActionCompatParcelizer == 0 || this.MediaMetadataCompat.MediaBrowserCompatMediaItem()) {
                        registergeofenceswithgeofencingclientlambda32.serializer(this.MediaMetadataCompat);
                        return;
                    } else {
                        registergeofenceswithgeofencingclientlambda32.serializer(4, "Third party linking has failed".concat(TextUtils.isEmpty(str) ? "" : ff$$ExternalSyntheticOutline0.m("(", str, ")")));
                        return;
                    }
                }
            }
        }
        java.util.Locale locale = java.util.Locale.US;
        registergeofenceswithgeofencingclientlambda32.serializer(7, "Received unexpected response from server (" + setshouldpersistwebviewwhenbackgroundingapp.serializer + " " + strSerializer + ")");
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        this.write.write(read(), new Object[0]);
        this.serializer.serializer(6, read());
    }

    public final String read() {
        if (this.RemoteActionCompatParcelizer != 0) {
            return "Could not get person ID";
        }
        return "Failed to hard link";
    }
}
