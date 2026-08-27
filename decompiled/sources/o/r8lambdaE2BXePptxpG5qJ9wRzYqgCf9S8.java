package o;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 {
    public final ArrayList read;

    public r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(getEmptyInterval getemptyinterval) {
        getemptyinterval.getClass();
        int i = forEachui_graphics.IconCompatParcelizer;
        ArrayList arrayListRemoteActionCompatParcelizer = androidx.sqlite.SQLite.RemoteActionCompatParcelizer((Object[]) new getMin[]{new getMax(getemptyinterval.read, 1), new getMax(getemptyinterval.serializer), new getMax(getemptyinterval.write, 2)});
        Context context = getemptyinterval.RemoteActionCompatParcelizer;
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        arrayListRemoteActionCompatParcelizer.add(new addInterval((ConnectivityManager) systemService));
        this.read = arrayListRemoteActionCompatParcelizer;
    }

    public r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(List list) {
        this.read = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    public r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8() {
        this.read = new ArrayList();
    }
}
