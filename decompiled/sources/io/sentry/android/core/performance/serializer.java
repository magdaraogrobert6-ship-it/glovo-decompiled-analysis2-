package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer implements Comparable {
    public final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();
    public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        serializer serializerVar = (serializer) obj;
        int iCompare = Long.compare(this.read.read, serializerVar.read.read);
        return iCompare == 0 ? Long.compare(this.RemoteActionCompatParcelizer.read, serializerVar.RemoteActionCompatParcelizer.read) : iCompare;
    }
}
