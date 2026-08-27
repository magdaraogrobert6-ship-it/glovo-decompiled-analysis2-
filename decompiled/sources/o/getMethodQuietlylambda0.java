package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class getMethodQuietlylambda0 implements Comparator {
    public final /* synthetic */ r8lambdakcTilwmporjFCAWe8ASdQv1Ks RemoteActionCompatParcelizer;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = this.RemoteActionCompatParcelizer;
        int iIconCompatParcelizer = r8lambdakctilwmporjfcawe8asdqv1ks.IconCompatParcelizer(obj) - r8lambdakctilwmporjfcawe8asdqv1ks.IconCompatParcelizer(obj2);
        return iIconCompatParcelizer != 0 ? iIconCompatParcelizer : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }

    public getMethodQuietlylambda0(r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks) {
        this.RemoteActionCompatParcelizer = r8lambdakctilwmporjfcawe8asdqv1ks;
    }
}
