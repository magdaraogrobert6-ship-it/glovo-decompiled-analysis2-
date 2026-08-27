package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.EdgeToEdge$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs {
    public static accessensureViewModelStore RemoteActionCompatParcelizer;
    public static final int serializer = android.graphics.Color.argb(230, 255, 255, 255);
    public static final int read = android.graphics.Color.argb(androidx.compose.ui.graphics.Fields.SpotShadowColor, 27, 27, 27);

    public static void RemoteActionCompatParcelizer(androidx.appcompat.app.AppCompatActivity appCompatActivity, addContentView addcontentview, int i) {
        addContentView addcontentview2 = (i & 1) != 0 ? new addContentView(0, 0, 0, new getViewportSizeYbymL2g(1)) : addcontentview;
        addContentView addcontentview3 = new addContentView(serializer, read, 0, new getViewportSizeYbymL2g(1));
        appCompatActivity.getClass();
        View decorView = appCompatActivity.getWindow().getDecorView();
        decorView.getClass();
        accessensureViewModelStore accessensureviewmodelstore = RemoteActionCompatParcelizer;
        if (accessensureviewmodelstore == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 35) {
                accessensureviewmodelstore = new ensureViewModelStore();
            } else if (i2 >= 30) {
                accessensureviewmodelstore = new _init_lambda3();
            } else if (i2 >= 29) {
                accessensureviewmodelstore = new _init_lambda2();
            } else {
                accessensureviewmodelstore = new accessensureViewModelStore();
            }
            RemoteActionCompatParcelizer = accessensureviewmodelstore;
        }
        EdgeToEdge$$ExternalSyntheticLambda0 edgeToEdge$$ExternalSyntheticLambda0 = new EdgeToEdge$$ExternalSyntheticLambda0(accessensureviewmodelstore, addcontentview2, addcontentview3, appCompatActivity, decorView, 0);
        ViewGroup viewGroup = (ViewGroup) decorView;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt != null) {
                if (childAt.getTag() instanceof _init_lambda1) {
                    edgeToEdge$$ExternalSyntheticLambda0.run();
                    Window window = appCompatActivity.getWindow();
                    window.getClass();
                    accessensureviewmodelstore.write(window);
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        _init_lambda4 _init_lambda4Var = new _init_lambda4(edgeToEdge$$ExternalSyntheticLambda0, viewGroup.getContext());
        _init_lambda4Var.setTag(accessensureviewmodelstore);
        _init_lambda4Var.setVisibility(8);
        _init_lambda4Var.setWillNotDraw(true);
        viewGroup.addView(_init_lambda4Var);
        edgeToEdge$$ExternalSyntheticLambda0.run();
        Window window2 = appCompatActivity.getWindow();
        window2.getClass();
        accessensureviewmodelstore.write(window2);
    }
}
