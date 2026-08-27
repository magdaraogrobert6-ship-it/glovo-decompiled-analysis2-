package o;

/* JADX INFO: loaded from: classes2.dex */
public final class doRemeasuresdFAvZA implements accessdetachAndRemoveNode {
    public static final doRemeasuresdFAvZA serializer = new doRemeasuresdFAvZA();
    public static final accessgetAggregateChildKindSet MediaDescriptionCompat = accessgetAggregateChildKindSet.read("timestamp");
    public static final accessgetAggregateChildKindSet RatingCompat = accessgetAggregateChildKindSet.read("type");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("app");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("device");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("log");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("rollouts");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        remeasureIfNeededdefault remeasureifneededdefault = (remeasureIfNeededdefault) ((getLastPositionnOccacui) obj);
        accessupdatenode.write(MediaDescriptionCompat, remeasureifneededdefault.RemoteActionCompatParcelizer);
        accessupdatenode.write(RatingCompat, remeasureifneededdefault.MediaMetadataCompat);
        accessupdatenode.write(write, remeasureifneededdefault.read);
        accessupdatenode.write(read, remeasureifneededdefault.serializer);
        accessupdatenode.write(IconCompatParcelizer, remeasureifneededdefault.write);
        accessupdatenode.write(RemoteActionCompatParcelizer, remeasureifneededdefault.IconCompatParcelizer);
    }
}
