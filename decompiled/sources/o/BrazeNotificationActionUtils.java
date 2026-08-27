package o;

/* JADX INFO: loaded from: classes3.dex */
final class BrazeNotificationActionUtils implements PushMaxDataStoreProviderCompanion<r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU> {
    final /* synthetic */ r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 write;

    @Override // o.PushMaxDataStoreProviderCompanion
    public final boolean read(r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu) {
        Integer num;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu2 = r8lambdaqtf70aj7a5o7b4yj33reyelsu;
        r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu = r8lambdaqtf70aj7a5o7b4yj33reyelsu2.serializer.fullyDrawnReporter_delegatelambda0;
        return r8lambdazeccixubf3xvz58yt5bojkwhdu != null && r8lambdazeccixubf3xvz58yt5bojkwhdu.read.byteValue() == 4 && (num = r8lambdaqtf70aj7a5o7b4yj33reyelsu2.IconCompatParcelizer) != null && num.equals(this.write.MediaMetadataCompat());
    }

    public BrazeNotificationActionUtils(r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4) {
        this.write = r8lambdanez6ekwx2hesalwlynojtz0dlj4;
    }
}
