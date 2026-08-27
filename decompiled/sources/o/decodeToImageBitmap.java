package o;

import android.content.Context;
import androidx.cardview.widget.CardView$1;
import androidx.work.impl.background.systemjob.SystemJobService;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class decodeToImageBitmap extends FunctionReferenceImpl implements r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM {
    public static final decodeToImageBitmap RemoteActionCompatParcelizer = new decodeToImageBitmap(6, DelayKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
    public final Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault = (graphicsLayerpANQ8Wgdefault) obj2;
        accessgetStrokecp accessgetstrokecp = (accessgetStrokecp) obj3;
        androidx.work.impl.WorkDatabase workDatabase = (androidx.work.impl.WorkDatabase) obj4;
        getEmptyInterval getemptyinterval = (getEmptyInterval) obj5;
        getDefaultShadowColor getdefaultshadowcolor = (getDefaultShadowColor) obj6;
        context.getClass();
        graphicslayerpanq8wgdefault.getClass();
        accessgetstrokecp.getClass();
        workDatabase.getClass();
        getemptyinterval.getClass();
        int i = ImageBitmapDefaultImpls.read;
        updateNodeData updatenodedata = new updateNodeData(context, workDatabase, graphicslayerpanq8wgdefault);
        drawOutlinewDX37Ww.RemoteActionCompatParcelizer(context, SystemJobService.class, true);
        setRotationX.read().getClass();
        return androidx.sqlite.SQLite.read(updatenodedata, new throwIllegalArgumentException(context, graphicslayerpanq8wgdefault, getemptyinterval, getdefaultshadowcolor, new CardView$1(getdefaultshadowcolor, accessgetstrokecp), accessgetstrokecp));
    }

    public decodeToImageBitmap(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
