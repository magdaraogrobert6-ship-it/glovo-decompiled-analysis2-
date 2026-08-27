package o;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidComposeViewCompanionExternalSyntheticLambda0 implements accessdetachAndRemoveNode {
    public static final AndroidComposeViewCompanionExternalSyntheticLambda0 RemoteActionCompatParcelizer = new AndroidComposeViewCompanionExternalSyntheticLambda0();
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("processName");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("pid");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("importance");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("defaultProcess");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        AndroidComposeViewgetFocusedRect1 androidComposeViewgetFocusedRect1 = (AndroidComposeViewgetFocusedRect1) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(read, androidComposeViewgetFocusedRect1.read);
        accessupdatenode.write(IconCompatParcelizer, androidComposeViewgetFocusedRect1.IconCompatParcelizer);
        accessupdatenode.write(write, androidComposeViewgetFocusedRect1.RemoteActionCompatParcelizer);
        accessupdatenode.read(serializer, androidComposeViewgetFocusedRect1.serializer);
    }
}
