package io.sentry.android.replay;

import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.getIsCurrentlyDisplayingInAppMessage;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatQueueItem extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final MediaSessionCompatQueueItem IconCompatParcelizer;
    public static final MediaSessionCompatQueueItem write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaSessionCompatQueueItem(int i, int i2) {
        super(i);
        this.RemoteActionCompatParcelizer = i2;
    }

    static {
        int i = 1;
        write = new MediaSessionCompatQueueItem(i, i);
        IconCompatParcelizer = new MediaSessionCompatQueueItem(i, 0);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        if (this.RemoteActionCompatParcelizer != 0) {
            getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage = (getIsCurrentlyDisplayingInAppMessage) obj;
            getiscurrentlydisplayinginappmessage.getClass();
            String upperCase = String.valueOf(hideCurrentlyDisplayingInAppMessage.write((CharSequence) getiscurrentlydisplayinginappmessage.write())).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return upperCase;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
    }
}
