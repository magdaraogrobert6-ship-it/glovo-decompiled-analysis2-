package o;

import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setEmailNotificationSubscriptionTypelambda1 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final Object IconCompatParcelizer;
    public final Object write;

    public String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 59;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = (String) this.write;
        int i5 = i2 + 65;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public setEmailNotificationSubscriptionTypelambda1(parseJsonObjectIntoBundlelambda0 parsejsonobjectintobundlelambda0, mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        TextStreamsKt.serializer(parsejsonobjectintobundlelambda0, "channel");
        this.IconCompatParcelizer = parsejsonobjectintobundlelambda0;
        TextStreamsKt.serializer(mergejsonobjectslambda10, "callOptions");
        this.write = mergejsonobjectslambda10;
    }

    public setEmailNotificationSubscriptionTypelambda1(setSelection setselection, String str) {
        this.IconCompatParcelizer = setselection;
        this.write = str;
    }
}
