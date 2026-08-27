package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "AuthenticationStoreCacheMigration")
public final class r8lambdamEp_QGMYezwiSNzVd9Swq1T_VCU {
    private final Context IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new read(null);
    }

    public r8lambdamEp_QGMYezwiSNzVd9Swq1T_VCU(Context context, parseLonglambda0 parselonglambda0) {
        context.getClass();
        parselonglambda0.getClass();
        this.IconCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = parselonglambda0;
    }

    public final void RemoteActionCompatParcelizer(com.sentiance.sdk.util.c cVar, r8lambdaqNCuDdctVEFBqWsEiop3UrHok r8lambdaqncuddctvefbqwseiop3urhok) {
        r8lambdab_WHuxf3SooUEuHEJHMkpJa5yXU r8lambdab_whuxf3sooueuhejhmkpja5yxu;
        parseLonglambda0 parselonglambda0;
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtySerializer;
        cVar.getClass();
        r8lambdaqncuddctvefbqwseiop3urhok.getClass();
        this.IconCompatParcelizer.getSharedPreferences("auth", 0).edit().remove("tokenrefreshfailed").apply();
        if (cVar.write("auth_info_cache_version", -1) == -1) {
            if (cVar.write("auth_info_encrypted")) {
                cVar.IconCompatParcelizer(2, "auth_info_cache_version");
            } else if (cVar.write("info")) {
                cVar.IconCompatParcelizer(1, "auth_info_cache_version");
            } else {
                cVar.IconCompatParcelizer(3, "auth_info_cache_version");
            }
        }
        if (cVar.write("auth_info_cache_version", -1) == 3 || (r8lambdazcbg_e0hjusjy78mvgh54swzqtySerializer = (r8lambdab_whuxf3sooueuhejhmkpja5yxu = (r8lambdab_WHuxf3SooUEuHEJHMkpJa5yXU) r8lambdaqncuddctvefbqwseiop3urhok).serializer(cVar, (parselonglambda0 = this.RemoteActionCompatParcelizer))) == null || !r8lambdab_whuxf3sooueuhejhmkpja5yxu.RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqtySerializer, cVar, parselonglambda0)) {
            return;
        }
        cVar.IconCompatParcelizer(3, "auth_info_cache_version");
        cVar.read("auth_info_encrypted");
        cVar.read("info");
    }
}
