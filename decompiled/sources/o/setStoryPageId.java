package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.InjectUsing;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "UnfulfilledOnDemandLogRequestChecker")
public class setStoryPageId {
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final requestSingleUpdateFromLocationManager write;

    public setStoryPageId(parseLonglambda0 parselonglambda0, requestSingleUpdateFromLocationManager requestsingleupdatefromlocationmanager) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.write = requestsingleupdatefromlocationmanager;
    }

    public static ArrayList write(setStoryPageId setstorypageid, ArrayList arrayList) {
        r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 r8lambdajlmt1f20uzpc4qzytuhq8199m8Serializer;
        parseLonglambda0 parselonglambda0 = setstorypageid.RemoteActionCompatParcelizer;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r8lambda7_6uuySr2Pfu4FrsMBeetrQwiRc r8lambda7_6uuysr2pfu4frsmbeetrqwirc = (r8lambda7_6uuySr2Pfu4FrsMBeetrQwiRc) it.next();
            String str = r8lambda7_6uuysr2pfu4frsmbeetrqwirc.read;
            boolean z = false;
            r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 r8lambdajlmt1f20uzpc4qzytuhq8199m8 = str == null ? new r8lambdajlMT1F20UZPc4QzYtuHQ8199M8(0L, 0) : r8lambdajlMT1F20UZPc4QzYtuHQ8199M8.serializer(str);
            String str2 = r8lambda7_6uuysr2pfu4frsmbeetrqwirc.serializer;
            if (str2 == null) {
                ((r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class)).getClass();
                r8lambdajlmt1f20uzpc4qzytuhq8199m8Serializer = new r8lambdajlMT1F20UZPc4QzYtuHQ8199M8(System.currentTimeMillis(), 0);
            } else {
                r8lambdajlmt1f20uzpc4qzytuhq8199m8Serializer = r8lambdajlMT1F20UZPc4QzYtuHQ8199M8.serializer(str2);
            }
            r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 r8lambdajlmt1f20uzpc4qzytuhq8199m9 = r8lambdajlmt1f20uzpc4qzytuhq8199m8Serializer;
            String str3 = r8lambda7_6uuysr2pfu4frsmbeetrqwirc.read;
            String str4 = r8lambda7_6uuysr2pfu4frsmbeetrqwirc.serializer;
            if ((str3 == null && str4 != null) || (str3 != null && str4 == null)) {
                java.util.Locale locale = java.util.Locale.ENGLISH;
                parselonglambda0.RemoteActionCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Cannot determine if request ", r8lambda7_6uuysr2pfu4frsmbeetrqwirc.IconCompatParcelizer, " is definite or indefinite."), new Object[0]);
            } else if (r8lambdajlmt1f20uzpc4qzytuhq8199m8 == null || r8lambdajlmt1f20uzpc4qzytuhq8199m9 == null) {
                java.util.Locale locale2 = java.util.Locale.ENGLISH;
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Failed to parse dates for request ", r8lambda7_6uuysr2pfu4frsmbeetrqwirc.IconCompatParcelizer, ": fromDate was ", str3, " and toDate was ");
                sbM.append(str4);
                parselonglambda0.RemoteActionCompatParcelizer(sbM.toString(), new Object[0]);
            } else {
                if (str3 != null && str4 != null) {
                    z = true;
                }
                boolean z2 = z;
                Integer numWrite = str3 == null ? null : setstorypageid.write(str3);
                String str5 = r8lambda7_6uuysr2pfu4frsmbeetrqwirc.serializer;
                arrayList2.add(new isImportant(r8lambda7_6uuysr2pfu4frsmbeetrqwirc.IconCompatParcelizer, r8lambdajlmt1f20uzpc4qzytuhq8199m8, r8lambdajlmt1f20uzpc4qzytuhq8199m9, numWrite, str5 == null ? null : setstorypageid.write(str5), z2, r8lambda7_6uuysr2pfu4frsmbeetrqwirc.write, r8lambda7_6uuysr2pfu4frsmbeetrqwirc.RemoteActionCompatParcelizer));
            }
        }
        return arrayList2;
    }

    public final r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 RemoteActionCompatParcelizer(getTitleGravity gettitlegravity, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38Serializer = this.write.serializer();
        if (r8lambda4gsaww0uf5fhes0li0lym_jwy38Serializer == null) {
            return null;
        }
        r8lambda4gsaww0uf5fhes0li0lym_jwy38Serializer.serializer(new getStoryPageId(this, readandroid_sdk_base_releaseVar, gettitlegravity));
        return r8lambda4gsaww0uf5fhes0li0lym_jwy38Serializer;
    }

    private Integer write(String str) {
        int length = str.length();
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        if (length < 10) {
            parselonglambda0.RemoteActionCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Cannot convert request date ", str, " into yyyyMMdd format."), new Object[0]);
            return null;
        }
        try {
            return Integer.valueOf(str.substring(0, 4) + str.substring(5, 7) + str.substring(8, 10));
        } catch (NumberFormatException e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Cannot parse request date", new Object[0]);
            return null;
        }
    }
}
