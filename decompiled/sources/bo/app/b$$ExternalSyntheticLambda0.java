package bo.app;

import android.database.SQLException;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.graphics.Fields;
import androidx.room.coroutines.ConnectionPoolImpl;
import androidx.sqlite.SQLite;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import o.PopulateViewStructure_androidKtpopulate7;
import o.createFromParcel;
import o.getNormalNSsRyOo;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ b$$ExternalSyntheticLambda0(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    public /* synthetic */ b$$ExternalSyntheticLambda0(boolean z, Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws Exception {
        MutableSharedFlow mutableSharedFlowWrite;
        int i = 2 % 2;
        int i2 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.f$0;
        boolean z = this.f$1;
        if (i2 == 0) {
            return b.b(obj, z);
        }
        boolean z2 = true;
        if (i2 == 1) {
            getNormalNSsRyOo getnormalnssryoo = (getNormalNSsRyOo) obj;
            if (z && (mutableSharedFlowWrite = getnormalnssryoo.write()) != null) {
                ((SharedFlowImpl) mutableSharedFlowWrite).write(createfromparcel);
            }
            return createfromparcel;
        }
        Object obj2 = null;
        int i3 = 0;
        if (i2 == 2) {
            ConnectionPoolImpl connectionPoolImpl = (ConnectionPoolImpl) obj;
            String str = z ? "reader" : "writer";
            StringBuilder sb = new StringBuilder();
            sb.append("Timed out attempting to acquire a " + str + " connection.");
            sb.append("\n\nWriter pool:\n");
            connectionPoolImpl.MediaMetadataCompat.write(sb);
            sb.append("Reader pool:");
            sb.append('\n');
            connectionPoolImpl.IconCompatParcelizer.write(sb);
            try {
                SQLite.read(5, sb.toString());
                throw null;
            } catch (SQLException e) {
                int i4 = connectionPoolImpl.RemoteActionCompatParcelizer;
                if (i4 == 1) {
                    throw e;
                }
                if (i4 == 2) {
                    e.printStackTrace();
                }
                int i5 = write + 81;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 9 / 0;
                }
                return createfromparcel;
            } catch (Exception e2) {
                throw e2;
            }
        }
        if (i2 == 3) {
            LazyListState lazyListState = (LazyListState) obj;
            if (!z && lazyListState.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem() <= 0 && lazyListState.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat() <= 0) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj;
        int iWrite = -1;
        if (z) {
            Iterator it = ((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7.getValue()).iterator();
            int i7 = write + 51;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                int i9 = serializer + 9;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (((Character) it.next()) == null) {
                    int i11 = write + 23;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                int i13 = serializer + 31;
                write = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    SQLite.write((List) populateViewStructure_androidKtpopulate7.getValue());
                    obj2.hashCode();
                    throw null;
                }
                iWrite = SQLite.write((List) populateViewStructure_androidKtpopulate7.getValue());
            } else {
                iWrite = i3;
            }
        }
        return Integer.valueOf(iWrite);
    }
}
