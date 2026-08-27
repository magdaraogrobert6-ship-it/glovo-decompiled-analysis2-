package o;

/* JADX INFO: loaded from: classes3.dex */
final class setTickerIfPresentlambda0 implements PushMaxDataStoreProviderCompanion<r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU> {
    final /* synthetic */ long IconCompatParcelizer;
    final /* synthetic */ long RemoteActionCompatParcelizer;

    @Override // o.PushMaxDataStoreProviderCompanion
    public final boolean read(r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu) {
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu2 = r8lambdaqtf70aj7a5o7b4yj33reyelsu;
        Long l = r8lambdaqtf70aj7a5o7b4yj33reyelsu2.write;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsu2.serializer;
        if (l.longValue() > this.IconCompatParcelizer) {
            return false;
        }
        r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu = r8lambdaturwertf3otevz1wenzex5tdwa.fullyDrawnReporter_delegatelambda0;
        r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu2 = r8lambdaturwertf3otevz1wenzex5tdwa.fullyDrawnReporter_delegatelambda0;
        if (r8lambdazeccixubf3xvz58yt5bojkwhdu == null) {
            return false;
        }
        if ((r8lambdazeccixubf3xvz58yt5bojkwhdu.read.byteValue() != 2 && r8lambdazeccixubf3xvz58yt5bojkwhdu2.read.byteValue() != 9) || (brazeCompanionExternalSyntheticLambda4 = r8lambdazeccixubf3xvz58yt5bojkwhdu2.serializer) == null) {
            return false;
        }
        long jLongValue = brazeCompanionExternalSyntheticLambda4.RemoteActionCompatParcelizer.longValue();
        long j = this.RemoteActionCompatParcelizer;
        return jLongValue == j || r8lambdaqtf70aj7a5o7b4yj33reyelsu2.RemoteActionCompatParcelizer.longValue() == j;
    }

    public setTickerIfPresentlambda0(long j, long j2) {
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = j2;
    }
}
