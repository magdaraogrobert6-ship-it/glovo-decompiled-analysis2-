package o;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.migrateTriggersReeligibilityToJsonlambda1;
import o.migrateTriggersReeligibilityToJsonlambda4;
import o.r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM;
import o.r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdab_WHuxf3SooUEuHEJHMkpJa5yXU implements r8lambdaqNCuDdctVEFBqWsEiop3UrHok {
    private final migrateTriggersReeligibilityToJsonlambda20 serializer;

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new serializer(null);
    }

    public r8lambdab_WHuxf3SooUEuHEJHMkpJa5yXU(final com.sentiance.sdk.util.c cVar, final r8lambdamEp_QGMYezwiSNzVd9Swq1T_VCU r8lambdamep_qgmyezwisnzvd9swq1t_vcu) {
        cVar.getClass();
        r8lambdamep_qgmyezwisnzvd9swq1t_vcu.getClass();
        this.serializer = new migrateTriggersReeligibilityToJsonlambda20(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.authentication.AuthInfoCache$cache$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((migrateTriggersReeligibilityToJsonlambda1) obj).getClass();
                r8lambdamep_qgmyezwisnzvd9swq1t_vcu.RemoteActionCompatParcelizer(cVar, this);
                return cVar;
            }
        });
    }

    public final r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY serializer(final com.sentiance.sdk.util.c cVar, final parseLonglambda0 parselonglambda0) {
        String strSerializer;
        r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m;
        cVar.getClass();
        parselonglambda0.getClass();
        int iWrite = cVar.write("auth_info_cache_version", 0);
        if (iWrite == 0) {
            return null;
        }
        if (iWrite != 1 && iWrite != 2) {
            try {
                String strWrite = cVar.write("user_info", (String) null);
                if (strWrite == null) {
                    return null;
                }
                r8lambdar7ywl9ynsudagvjliqatfcbze4m = (r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M.class, strWrite);
            } catch (JSONException e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Couldn't deserialize JSON", new Object[0]);
                r8lambdar7ywl9ynsudagvjliqatfcbze4m = null;
            }
            if (r8lambdar7ywl9ynsudagvjliqatfcbze4m == null) {
                return null;
            }
            return new r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY(r8lambdar7ywl9ynsudagvjliqatfcbze4m, new migrateTriggersStorageToJsonlambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.authentication.AuthInfoCache$fromV3CacheData$lazyTokenInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    ((migrateTriggersReeligibilityToJsonlambda4) obj).getClass();
                    try {
                        String strSerializer2 = cVar.serializer("encrypted_token_info");
                        if (strSerializer2 != null) {
                            return (r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA.class, strSerializer2);
                        }
                        return null;
                    } catch (IOException e2) {
                        parselonglambda0.IconCompatParcelizer(false, e2, "Failed to decrypt token info JSON", new Object[0]);
                        return null;
                    } catch (JSONException e3) {
                        parselonglambda0.IconCompatParcelizer(false, e3, "Couldn't deserialize token info JSON", new Object[0]);
                        return null;
                    }
                }
            }));
        }
        if (cVar.write("info")) {
            strSerializer = cVar.write("info", (String) null);
        } else {
            try {
                strSerializer = cVar.serializer("auth_info_encrypted");
            } catch (IOException e2) {
                parselonglambda0.IconCompatParcelizer(false, e2, "Failed to decrypt auth info JSON", new Object[0]);
                strSerializer = null;
            }
        }
        if (strSerializer == null) {
            parselonglambda0.IconCompatParcelizer("No auth info", new Object[0]);
            return null;
        }
        try {
            registerGeofencesWithGooglePlayIfNecessarydefault registergeofenceswithgoogleplayifnecessarydefault = (registerGeofencesWithGooglePlayIfNecessarydefault) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(registerGeofencesWithGooglePlayIfNecessarydefault.class, strSerializer);
            String str = registergeofenceswithgoogleplayifnecessarydefault.write;
            str.getClass();
            r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m2 = new r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M(str, registergeofenceswithgoogleplayifnecessarydefault.RatingCompat, registergeofenceswithgoogleplayifnecessarydefault.MediaBrowserCompatMediaItem, registergeofenceswithgoogleplayifnecessarydefault.MediaSessionCompatQueueItem);
            String str2 = registergeofenceswithgoogleplayifnecessarydefault.IconCompatParcelizer;
            str2.getClass();
            String str3 = registergeofenceswithgoogleplayifnecessarydefault.read;
            str3.getClass();
            String str4 = registergeofenceswithgoogleplayifnecessarydefault.serializer;
            str4.getClass();
            String str5 = registergeofenceswithgoogleplayifnecessarydefault.RemoteActionCompatParcelizer;
            if (str5 == null) {
                str5 = registergeofenceswithgoogleplayifnecessarydefault.read;
            }
            str5.getClass();
            return new r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY(r8lambdar7ywl9ynsudagvjliqatfcbze4m2, new r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA(str2, str3, str4, str5));
        } catch (JSONException e3) {
            parselonglambda0.IconCompatParcelizer(false, e3, "Couldn't deserialize JSON", new Object[0]);
            return null;
        }
    }

    public final boolean RemoteActionCompatParcelizer(r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty, com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0) {
        cVar.getClass();
        parselonglambda0.getClass();
        try {
            cVar.RemoteActionCompatParcelizer("user_info", r8lambdazcbg_e0hjusjy78mvgh54swzqty.MediaDescriptionCompat().write());
            try {
                r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA r8lambdazgdcm_k4mtbwe6bmdwjk2beesa = r8lambdazcbg_e0hjusjy78mvgh54swzqty.RatingCompat().read();
                String strWrite = r8lambdazgdcm_k4mtbwe6bmdwjk2beesa != null ? r8lambdazgdcm_k4mtbwe6bmdwjk2beesa.write() : null;
                if (strWrite == null) {
                    parselonglambda0.IconCompatParcelizer("Failed to save the auth info: token info is unavailable", new Object[0]);
                    return false;
                }
                boolean zIconCompatParcelizer = cVar.IconCompatParcelizer(strWrite);
                if (!zIconCompatParcelizer) {
                    parselonglambda0.RemoteActionCompatParcelizer("Failed to save the auth info: token info encryption failed", new Object[0]);
                }
                return zIconCompatParcelizer;
            } catch (JSONException e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Failed to save the auth info: token info serialization failed", new Object[0]);
                return false;
            }
        } catch (JSONException e2) {
            parselonglambda0.IconCompatParcelizer(false, e2, "Failed to save the auth info: user info serialization failed", new Object[0]);
            return false;
        }
    }

    public final r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY write(parseLonglambda0 parselonglambda0) {
        parselonglambda0.getClass();
        Object obj = this.serializer.read();
        obj.getClass();
        return serializer((com.sentiance.sdk.util.c) obj, parselonglambda0);
    }

    public final boolean write(r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty, parseLonglambda0 parselonglambda0) {
        parselonglambda0.getClass();
        Object obj = this.serializer.read();
        obj.getClass();
        return RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqty, (com.sentiance.sdk.util.c) obj, parselonglambda0);
    }
}
