package o;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r8lambda1rg5nswZ2w8tK6UoajTAHGu7Dc implements FilenameFilter {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;

    public /* synthetic */ r8lambda1rg5nswZ2w8tK6UoajTAHGu7Dc(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        return i != 0 ? str.startsWith((String) obj) : ((BrazeActionParser) obj).serializer(str);
    }
}
