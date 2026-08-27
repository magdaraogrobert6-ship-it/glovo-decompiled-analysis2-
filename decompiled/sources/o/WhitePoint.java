package o;

/* JADX INFO: loaded from: classes.dex */
public final class WhitePoint extends rotateRad0AR0LA0default {
    public area write;

    @Override // o.rotateRad0AR0LA0default
    public final void serializer(Object obj, Object obj2) {
        generateOetf generateoetf = (generateOetf) obj2;
        area areaVar = this.write;
        if (areaVar == null || generateoetf == null) {
            return;
        }
        areaVar.MediaMetadataCompat.read(generateoetf, true);
    }

    @Override // o.rotateRad0AR0LA0default
    public final int RemoteActionCompatParcelizer(Object obj) {
        generateOetf generateoetf = (generateOetf) obj;
        if (generateoetf == null) {
            return 1;
        }
        return generateoetf.write();
    }

    public WhitePoint(long j) {
        super(j);
    }
}
