package o;

import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ImeActionCompanion {
    public final AndroidFontUtils_androidKt RemoteActionCompatParcelizer;
    public final CustomerChatCommunicatorImpl serializer;

    public ImeActionCompanion(CustomerChatCommunicatorImpl customerChatCommunicatorImpl, AndroidFontUtils_androidKt androidFontUtils_androidKt) {
        this.serializer = customerChatCommunicatorImpl;
        this.RemoteActionCompatParcelizer = androidFontUtils_androidKt;
    }
}
