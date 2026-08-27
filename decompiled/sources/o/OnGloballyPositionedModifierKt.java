package o;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzpg;

/* JADX INFO: loaded from: classes2.dex */
public final class OnGloballyPositionedModifierKt extends registerOnGlobalLayoutListener {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (java.lang.Math.abs(r6.hashCode() % 100) < r8.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().read()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.OnLayoutRectChangedElement serializer(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.OnGloballyPositionedModifierKt.serializer(java.lang.String):o.OnLayoutRectChangedElement");
    }

    public final String write(String str) {
        lookaheadScopeCoordinates lookaheadscopecoordinates = this.MediaSessionCompatToken.PlaybackStateCompat;
        zzpg.serializer(lookaheadscopecoordinates);
        String strRemoteActionCompatParcelizer = lookaheadscopecoordinates.RemoteActionCompatParcelizer(str);
        if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
            return (String) premeasure0kLqBqw.getOnBackPressedDispatcherannotations.IconCompatParcelizer(null);
        }
        Uri uri = Uri.parse((String) premeasure0kLqBqw.getOnBackPressedDispatcherannotations.IconCompatParcelizer(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strRemoteActionCompatParcelizer).length() + 1 + String.valueOf(authority).length());
        sb.append(strRemoteActionCompatParcelizer);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }

    public static final boolean IconCompatParcelizer(String str) {
        String str2 = (String) premeasure0kLqBqw.startIntentSenderForResult.IconCompatParcelizer(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public OnGloballyPositionedModifierKt(zzpg zzpgVar) {
        super(zzpgVar);
    }
}
