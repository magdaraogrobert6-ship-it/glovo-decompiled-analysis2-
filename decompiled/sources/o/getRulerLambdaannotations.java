package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getRulerLambdaannotations implements accessdetachAndRemoveNode {
    public static final getRulerLambdaannotations MediaMetadataCompat = new getRulerLambdaannotations();
    public static final accessgetAggregateChildKindSet RatingCompat = accessgetAggregateChildKindSet.read("sessionId");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("firstSessionId");
    public static final accessgetAggregateChildKindSet MediaDescriptionCompat = accessgetAggregateChildKindSet.read("sessionIndex");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("eventTimestampUs");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("dataCollectionStatus");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("firebaseInstallationId");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("firebaseAuthenticationToken");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        AndroidComposeViewresendMotionEventOnLayout1 androidComposeViewresendMotionEventOnLayout1 = (AndroidComposeViewresendMotionEventOnLayout1) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(RatingCompat, androidComposeViewresendMotionEventOnLayout1.MediaMetadataCompat);
        accessupdatenode.write(write, androidComposeViewresendMotionEventOnLayout1.RemoteActionCompatParcelizer);
        accessupdatenode.write(MediaDescriptionCompat, androidComposeViewresendMotionEventOnLayout1.RatingCompat);
        accessupdatenode.write(RemoteActionCompatParcelizer, androidComposeViewresendMotionEventOnLayout1.serializer);
        accessupdatenode.write(read, androidComposeViewresendMotionEventOnLayout1.write);
        accessupdatenode.write(IconCompatParcelizer, androidComposeViewresendMotionEventOnLayout1.IconCompatParcelizer);
        accessupdatenode.write(serializer, androidComposeViewresendMotionEventOnLayout1.read);
    }
}
