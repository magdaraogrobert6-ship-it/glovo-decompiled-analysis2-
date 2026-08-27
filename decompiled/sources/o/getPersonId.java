package o;

/* JADX INFO: loaded from: classes3.dex */
public class getPersonId {
    private final initWithContext RemoteActionCompatParcelizer;

    public final void RemoteActionCompatParcelizer(String str, parseNonBlankStringlambda0 parsenonblankstringlambda0) {
        if (this.RemoteActionCompatParcelizer.serializer(str, new BrazeNotificationPayloadConversationPerson(parsenonblankstringlambda0))) {
            return;
        }
        parsenonblankstringlambda0.serializer(null, new Exception("Failed to create request for retrieving signed log upload url"));
    }

    public getPersonId(initWithContext initwithcontext) {
        this.RemoteActionCompatParcelizer = initwithcontext;
    }
}
