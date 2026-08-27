package o;

import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class accessgetLeftBracketcp implements accessgetMediaFastForwardcp, AccessibilityIteratorsAbstractTextSegmentIterator {
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object write;

    @Override // o.AccessibilityIteratorsAbstractTextSegmentIterator
    public void RemoteActionCompatParcelizer(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        String str = (String) this.read;
        isForced isforced = (isForced) this.write;
        getCachedAlignmentLinesMap getcachedalignmentlinesmap = (getCachedAlignmentLinesMap) abstractComposeViewExternalSyntheticLambda0.write();
        getcachedalignmentlinesmap.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        getcachedalignmentlinesmap.IconCompatParcelizer.IconCompatParcelizer(new accessgetLeftBracketcp(str, this.IconCompatParcelizer, isforced));
    }

    @Override // o.accessgetMediaFastForwardcp
    public Object read() {
        access500 access500Var = (access500) this.read;
        accessgetEightcp accessgeteightcp = (accessgetEightcp) this.write;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) access500Var.IconCompatParcelizer;
        long jIconCompatParcelizer = ((accessgetMediaPlaycp) access500Var.read).IconCompatParcelizer();
        long j = this.IconCompatParcelizer;
        sQLiteEventStore.getClass();
        sQLiteEventStore.write(new accessgetMediaClosecp(jIconCompatParcelizer + j, accessgeteightcp));
        return null;
    }

    public /* synthetic */ accessgetLeftBracketcp(access500 access500Var, accessgetEightcp accessgeteightcp, long j) {
        this.read = access500Var;
        this.write = accessgeteightcp;
        this.IconCompatParcelizer = j;
    }

    public /* synthetic */ accessgetLeftBracketcp(String str, long j, isForced isforced) {
        this.read = str;
        this.IconCompatParcelizer = j;
        this.write = isforced;
    }
}
