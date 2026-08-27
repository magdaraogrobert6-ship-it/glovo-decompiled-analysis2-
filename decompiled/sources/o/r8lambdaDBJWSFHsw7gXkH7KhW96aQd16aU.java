package o;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaDBJWSFHsw7gXkH7KhW96aQd16aU extends BrazeInternalLocationApi {
    final /* synthetic */ setActionId serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaDBJWSFHsw7gXkH7KhW96aQd16aU(setActionId setactionid, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4) {
        super(r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4);
        this.serializer = setactionid;
    }

    @Override // o.BrazeInternalLocationApi
    public final clearandroid_sdk_base_release RemoteActionCompatParcelizer() {
        return this.serializer.PlaybackStateCompatCustomAction;
    }

    @Override // o.BrazeInternalLocationApi
    public final void write() {
        setActionId.read(this.serializer);
    }
}
